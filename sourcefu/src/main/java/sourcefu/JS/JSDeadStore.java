package sourcefu.JS;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.JS.antlr.JavaScriptParser;
import sourcefu.JS.antlr.JavaScriptParser.LiteralExpressionContext;
import sourcefu.JS.antlr.JavaScriptParserBaseListener;
import sourcefu.JS.helpers.Scope;
import sourcefu.JS.helpers.VariableSymbol;
import sourcefu.VBA.helpers.DeadStoreBaseScope;
import sourcefu.VBA.helpers.DeadStoreFunction;
import sourcefu.VBA.helpers.DeadStoreStatement;

public class JSDeadStore extends JavaScriptParserBaseListener{
	
	TokenStreamRewriter rewriter;
	CommonTokenStream tokens;
	DeadStoreBaseScope globals;
	DeadStoreBaseScope currentScope;
	ArrayList<DeadStoreFunction> Functions = new ArrayList<DeadStoreFunction>();
	Integer numberModifications=0;
	
	int functionIndex=0;
	
	public JSDeadStore(CommonTokenStream tokens) {
		this.tokens=tokens;
		rewriter=new TokenStreamRewriter(tokens);
	}
	
	
	public void enterProgram(JavaScriptParser.ProgramContext ctx) {
		globals = new DeadStoreBaseScope();
		this.currentScope = globals;
	}
	
	public void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
		String name = ctx.Identifier().getText();
		DeadStoreFunction function = new DeadStoreFunction(name);
		//as in js almost everything is passed by value don't care of arguments for now
		this.Functions.add(function);
		this.currentScope = function;
	}
	
	public void exitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
		//this.currentScope = this.currentScope.getEnclosingScope();
		//TODO: change deadstore scope for getenclosing scope
	}
	
	public void enterFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
		String name = ctx.Identifier().getText();
		DeadStoreFunction function = new DeadStoreFunction(name);
		//as in js almost everything is passed by value don't care of arguments for now
		this.currentScope = function;
		this.Functions.add(function);
	}
	
	public void exitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
		//this.currentScope = this.currentScope.getEnclosingScope();
		//this.currentScope = this.currentScope.getEnclosingScope();
		//TODO: change deadstore scope for getenclosing s
	}
	
	public void enterVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
		//TODO: add array and so on support
		if(ctx.Identifier()!= null) {
			int varNameTokenIndex = ctx.Identifier().getSymbol().getTokenIndex();
			String name = ctx.Identifier().getText();
			Integer start = ctx.getParent().getParent().start.getTokenIndex(); //obvisouly, this will need to be changed coz we do not support multi declaration	
			Integer stop = ctx.getParent().getParent().stop.getTokenIndex();
			DeadStoreStatement def = new DeadStoreStatement(start, stop, name, varNameTokenIndex);
			this.currentScope.addDefs(def);
		}
	}
	
	public void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx) {
		//first we only get the case where left member is an identifier 
		if (!(ctx.singleExpression(0) instanceof JavaScriptParser.IdentifierExpressionContext)) {
			return;
		}
		
		JavaScriptParser.IdentifierExpressionContext new_ctx = (JavaScriptParser.IdentifierExpressionContext) ctx.singleExpression(0);
		int varNameTokenIndex = new_ctx.start.getTokenIndex();
		String name = new_ctx.getText();
		Integer start = ctx.getParent().getParent().start.getTokenIndex(); //obvisouly, this will need to be changed coz we do not support multi declaration	
		Integer stop = ctx.getParent().getParent().stop.getTokenIndex();
		DeadStoreStatement def = new DeadStoreStatement(start, stop, name, varNameTokenIndex);
		this.currentScope.addDefs(def);
		System.out.println("adding "+name+" to defs");
	}
	
	public void exitIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx) {
		
		if (this.currentScope.checkInDefs(ctx.getText())) {
		//first check this is not the left identifier of one assignement expression
		//if(this.currentScope.getDefByName(ctx.getText()).getVarNameTokenIndex())
			if(ctx.getParent() instanceof JavaScriptParser.AssignmentExpressionContext) {
				JavaScriptParser.AssignmentExpressionContext new_ctx = (JavaScriptParser.AssignmentExpressionContext) ctx.getParent();
				if(new_ctx.singleExpression(0) == ctx) {
					return;
				}
			}

			//second check for defs like x= x + 1
			if(this.currentScope.getDefByName(ctx.getText()).getStmtStop() > ctx.stop.getTokenIndex()) {
				return;
			}

			System.out.println("setting "+ctx.getText()+" as used");
			this.currentScope.setUsed(ctx.getText());
		}
		
	}
	
	public void deadstore() {
		for(int i=0;i<this.Functions.size();i++) {
			ArrayList<ArrayList<DeadStoreStatement>> l = new ArrayList(this.Functions.get(i).getDefs().values()); 
			for(int j=0;j<this.Functions.get(i).getDefs().size();j++) {
				for(int k=0;k<l.get(j).size();k++) {
					if(l.get(j).get(k).getToErase()) {
						this.rewriter.delete(l.get(j).get(k).getStmtStart()-1, l.get(j).get(k).getStmtStop());
						this.numberModifications+=1;
						this.rewriter.getText();
					}
				}
			}
		}
	}
	
	public String getdata() {
		return rewriter.getText();
	}
	
	public Integer getNumberModifications() {
		return this.numberModifications;
	}
	
}
