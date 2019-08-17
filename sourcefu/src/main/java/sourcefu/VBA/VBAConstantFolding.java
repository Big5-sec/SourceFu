package sourcefu.VBA;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParser.LetStmtContext;
import sourcefu.VBA.antlr.VBAParser.SimpleNameExprContext;
import sourcefu.VBA.antlr.VBAParserBaseListener;
import sourcefu.VBA.helpers.ConstantFoldingBaseScope;
import sourcefu.VBA.helpers.ConstantFoldingFunction;
import sourcefu.VBA.partialevaluator.RewriteOperation;
import sourcefu.helpers.Undefined;
import sourcefu.lib.CtxValue;


public class VBAConstantFolding extends VBAParserBaseListener{
	
	TokenStreamRewriter rewriter;
	CommonTokenStream tokens;
	ConstantFoldingBaseScope global;
	ArrayList<ConstantFoldingFunction> Subs = new ArrayList<ConstantFoldingFunction>();
	ArrayList<ConstantFoldingFunction> Functions = new ArrayList<ConstantFoldingFunction>();
	ConstantFoldingBaseScope currentScope;
	Integer numberModifications=0;
	CtxValue ctxvalue;
	Boolean inloop = false;
	int inIf = 0;
	Map<Token, RewriteOperation> operations;// = new LinkedHashMap<Token, RewriteOperation>();
	
	public VBAConstantFolding(CommonTokenStream tokens, CtxValue ctxvalue,TokenStreamRewriter rewriter, Map<Token, RewriteOperation> operations) {
		this.ctxvalue=ctxvalue;
		this.rewriter=rewriter;
		this.operations = operations;
	}
	
	public void enterStartRule(VBAParser.StartRuleContext ctx) { 
		global = new ConstantFoldingBaseScope();
		this.currentScope = global;
	}

	public void enterFunctionStmt(VBAParser.FunctionStmtContext ctx) {
		//System.out.println("cejcoijec");
		String name = ctx.functionName().getText();
		ConstantFoldingFunction function = new ConstantFoldingFunction(name);
		for(int i=0;i<ctx.argList().arg().size();i++) {
			function.addArgument(ctx.argList().arg(i).unrestrictedIdentifier().getText());
		}
		this.Functions.add(function);
		this.currentScope = function;
	}
	
	public void exitFunctionStmt(VBAParser.FunctionStmtContext ctx) { 
		this.currentScope = this.global;
	}
	
	public void enterSubStmt(VBAParser.SubStmtContext ctx) {
		String name = ctx.subroutineName().getText();
		ConstantFoldingFunction sub = new ConstantFoldingFunction(name);
		for(int i=0;i<ctx.argList().arg().size();i++) {
			sub.addArgument(ctx.argList().arg(i).unrestrictedIdentifier().getText());
		}
		this.Subs.add(sub);
		this.currentScope = sub;
	}
	
	public void exitSubStmt(VBAParser.SubStmtContext ctx) { 
		this.currentScope = this.global;
	}

	public void exitLetStmt(VBAParser.LetStmtContext ctx) {
		if(ctx.lExpression() instanceof VBAParser.SimpleNameExprContext) { //check that our lexpression is an identifier basically
			if(ctx.expression() instanceof VBAParser.LExprContext) {
				return;
			}
			VBAParser.SimpleNameExprContext new_ctx = (SimpleNameExprContext) ctx.lExpression();
			String name = new_ctx.identifier().getText();
			//if (!this.currentScope.checkInDefs(name)) { //TODO: wrong multiple def can be possible
				
			if(this.inloop || (this.inIf==2)) {
				return;
			}
			
				if(this.currentScope instanceof ConstantFoldingFunction) {
					ConstantFoldingFunction temp = (ConstantFoldingFunction) this.currentScope;
					//System.out.println((String)ctxvalue.getValue(ctx.expression()));
					if(!temp.checkInArgs(name)) {
						if(ctxvalue.getValue(ctx.expression())!= null && !(ctxvalue.getValue(ctx.expression()) instanceof Undefined)) {
							this.currentScope.addVariable(name, ctxvalue.getValue(ctx.expression()));						
						}
						
						if(ctxvalue.getValue(ctx.expression())!= null && (ctxvalue.getValue(ctx.expression()) instanceof Undefined)) {
							this.currentScope.addVariable(name, null);						
						}
					}
				}
				else {
					if(ctxvalue.getValue(ctx.expression())!= null && !(ctxvalue.getValue(ctx.expression()) instanceof Undefined)) {
						this.currentScope.addVariable(name, ctxvalue.getValue(ctx.expression()));
					}
					
					if(ctxvalue.getValue(ctx.expression())!= null && (ctxvalue.getValue(ctx.expression()) instanceof Undefined)) {
						this.currentScope.addVariable(name, null);						
					}
				}
				//System.out.println(this.currentScope.getVariableValue(name));
			//}
		}
		//TODO: treat other letstmt??
	}
	
	public void exitIdentifier(VBAParser.IdentifierContext ctx) { //TODO: check here
	    //System.out.println("exit identifier constant folding : " + ctx.getText());
		//avoid case where identifier is the function name
		if (this.currentScope instanceof ConstantFoldingFunction) {
			ConstantFoldingFunction temp = (ConstantFoldingFunction) this.currentScope; 
			if(temp.getName().equals(ctx.getText())) {
				//System.out.println("fun name!");
				return;
			}
		}
		//System.out.println(this.currentScope);
		if(this.currentScope.checkInVariables(ctx.getText())) {
		    //System.out.println("checking variable : "+ctx.getText());
			if(this.currentScope.getVariableValue(ctx.getText()) == null) {
				return;
			}
			
//			System.out.println("in current scope variables");
			//System.out.println(ctx.getClass());
			//System.out.println(ctx.getParent().getClass());
			//System.out.println(ctx.getParent().getParent().getClass());
			//System.out.println(ctx.getParent().getParent().getParent().getClass());
			//avoid renaming lexpression in letstmt
			//System.out.println(this.tokens.get(ctx.start.getTokenIndex()-1).getText());
			if (ctx.getParent().getParent() instanceof VBAParser.LetStmtContext) {
			    //System.out.println("hhbh");
				return;
			}
			
			
			if (ctx.getParent().getParent().getParent() instanceof VBAParser.LetStmtContext) { //TODO: certainly needs to change
			    //System.out.println("lexpression renaming");
				VBAParser.LetStmtContext tempctx = (LetStmtContext) ctx.getParent().getParent().getParent();
				//System.out.println(ctx.start.getTokenIndex());
				//System.out.println(tempctx.lExpression().stop.getTokenIndex());
				if(ctx.start.getTokenIndex() < tempctx.lExpression().stop.getTokenIndex()) {
					return;
				}
			}
		
			//avoid to do constant folding in loops for stmts like x = x+1 (btw loop variable is not affected)
			//basically, if our variable is redefined in a loop, then we consider its value like null
			if(this.inloop || (this.inIf == 2)) { //TODO check
			    //System.out.println("in loop");
				if(ctx.getParent().getParent() instanceof VBAParser.LetStmtContext) {
					this.currentScope.addVariable(ctx.getText(), null);
					return;
				}
			}
			
			//System.out.println("coucou");
			//else we replace by the value
			Object value = this.currentScope.getVariableValue(ctx.getText());
			if (value instanceof String) {
				String temp = (String) value;
				ctxvalue.setValue(ctx, temp);
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+temp+"\"");
				operations.put(ctx.start, op);
				//System.out.println("adding op");
				//this.rewriter.replace(ctx.start, ctx.stop, "\""+temp+"\"");
				this.numberModifications+=1;
			} else if (value instanceof Number) {
				Number temp = (Number) value;
				ctxvalue.setValue(ctx, temp);
				//this.rewriter.replace(ctx.start, ctx.stop, String.valueOf(temp));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(temp));
				operations.put(ctx.start, op);
				this.numberModifications+=1;
			}
		}
		
	//TODO: add global variable replacement	
	}	
	
	/*
	 * the following functions permits to check if we are in loop for identifier use
	 */
	public void enterDoLoopStmt(VBAParser.DoLoopStmtContext ctx) { 
		this.inloop = true;
	}
	
	public void exitDoLoopStmt(VBAParser.DoLoopStmtContext ctx) { 
		this.inloop = false;
	}
	
	public void enterForEachStmt(VBAParser.ForEachStmtContext ctx) { 
		this.inloop = true;
	} 
	
	public void exitForEachStmt(VBAParser.ForEachStmtContext ctx) { 
		this.inloop = false;
	} 
	
	public void enterForNextStmt(VBAParser.ForNextStmtContext ctx) { 
		this.inloop = true;
	}
	
	public void exitForNextStmt(VBAParser.ForNextStmtContext ctx) { 
		this.inloop = false;
	}
	
	public void enterWhileWendStmt(VBAParser.WhileWendStmtContext ctx) { 
		this.inloop = true;
	}
	
	public void exitWhileWendStmt(VBAParser.WhileWendStmtContext ctx) { 
		this.inloop = false;
	}
	
	public void enterIfStmt(VBAParser.IfStmtContext ctx) { 
		this.inIf = 1;
	}
	
	public void exitIfStmt(VBAParser.IfStmtContext ctx) { 
		this.inIf = 0;
	}
	
	public void enterBlock(VBAParser.BlockContext ctx) {
		if (this.inIf == 1) {
			this.inIf = 2;
		}
	}
	
	public String getdata() {
		return rewriter.getText();
	}
	
	public Integer getNumberModifications() {
		return this.numberModifications;
	}
}
