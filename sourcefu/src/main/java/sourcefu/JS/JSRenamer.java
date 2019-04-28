package sourcefu.JS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.JS.antlr.JavaScriptParser;
import sourcefu.JS.antlr.JavaScriptParserBaseListener;
import sourcefu.JS.helpers.Scope;
import sourcefu.JS.helpers.Symbol;
import sourcefu.JS.helpers.VariableSymbol;

public class JSRenamer extends JavaScriptParserBaseListener{
	TokenStreamRewriter rewriter;
	List<Scope> scopes = new ArrayList<Scope>();
	Scope globals;
	Scope currentScope;
	int functionIndex=0;
	
	public JSRenamer(CommonTokenStream tokens) {
		rewriter=new TokenStreamRewriter(tokens);
	}

	public String getdata() {
		return rewriter.getText();
	}

	public void rename() {
		for(Scope scope:scopes) {
			int localsIndex = 0;
			int argIndex=0;
			for (Map.Entry<String, Symbol> symbol : scope.getSymbols().entrySet()) {
				System.out.println(symbol.getKey() + "/" + symbol.getValue());
				for(Integer index: symbol.getValue().getIndex()) {
					if(symbol.getValue().getAltname().contains("function")) {
						this.rewriter.replace(index, index, scope.getName()+"_"+symbol.getValue().getAltname());
					} else if(symbol.getValue().getAltname().contains("arg")) {
						this.rewriter.replace(index, index, scope.getName()+"_"+symbol.getValue().getAltname()+String.valueOf(argIndex));

					} else {
						this.rewriter.replace(index, index, scope.getName()+"_"+symbol.getValue().getAltname()+String.valueOf(localsIndex));

					}
				}
				if(symbol.getValue().getAltname().contains("arg")) {
					argIndex+=1;
					continue;
				}
				
				if(!(symbol.getValue().getAltname().contains("function"))) {
					localsIndex+=1;				
				}
			}
		}
	}
	
	public void enterProgram(JavaScriptParser.ProgramContext ctx) {
		globals = new Scope(null, "global");
		this.currentScope = globals;
		this.scopes.add(globals);
	}
	
	public void enterVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
		if(ctx.Identifier()!= null) {
			int index = ctx.Identifier().getSymbol().getTokenIndex();
			String text = ctx.Identifier().getText();
			VariableSymbol var = new VariableSymbol(text,index,"local");
			this.currentScope.define(var);	
		}
		//we should treat other cases here, but that's not really clear
	}
	
	public void enterLabelledStatement(JavaScriptParser.LabelledStatementContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text,index,"label");
		this.currentScope.define(var);
	}
	
	public void enterCatchProduction(JavaScriptParser.CatchProductionContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text,index,"error");
		this.currentScope.define(var);
	}
	
	public void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "function"+String.valueOf(this.functionIndex));
		this.currentScope.define(var);
		Scope function = new Scope(this.currentScope, "function"+String.valueOf(this.functionIndex));
		this.functionIndex +=1;
		this.scopes.add(function);
		this.currentScope = function;
	}
	
	public void exitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
		this.currentScope = this.currentScope.getEnclosingScope();
	}
	
	public void enterClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "class");
		this.currentScope.define(var);
	}
	
	public void enterClassElement(JavaScriptParser.ClassElementContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "classmethod");
		this.currentScope.define(var);
	}
	
	public void enterGeneratorMethod(JavaScriptParser.GeneratorMethodContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "generatormethod");
		this.currentScope.define(var);
	}
	
	public void enterFormalParameterArg(JavaScriptParser.FormalParameterArgContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "arg");
		this.currentScope.define(var);
	}
	
	public void enterLastFormalParameterArg(JavaScriptParser.LastFormalParameterArgContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "arg");
		this.currentScope.define(var);
	}
	
	public void enterLastElement(JavaScriptParser.LastElementContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "local");
		this.currentScope.define(var);
	}
	
	public void enterPropertyShorthand(JavaScriptParser.PropertyShorthandContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "local");
		this.currentScope.define(var);
	}
	
	public void enterPropertySetter(JavaScriptParser.PropertySetterContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "local");
		this.currentScope.define(var);
	}
	
	public void enterPropertyName(JavaScriptParser.PropertyNameContext ctx) {
		if(ctx.identifierName()!=null) {
			if(ctx.identifierName().Identifier()!=null) {
				int index = ctx.identifierName().Identifier().getSymbol().getTokenIndex();
				String text = ctx.identifierName().Identifier().getText();
				VariableSymbol var = new VariableSymbol(text, index, "property");
				this.currentScope.define(var);
			}
		}

	}
	
	public void enterLastArgument(JavaScriptParser.LastArgumentContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "arg");
		this.currentScope.define(var);
	}
	
	public void enterFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
		if(ctx.Identifier()!=null) {
			int index = ctx.Identifier().getSymbol().getTokenIndex();
			String text = ctx.Identifier().getText();
			VariableSymbol var = new VariableSymbol(text, index, "function"+String.valueOf(this.functionIndex));
			this.currentScope.define(var);
		}
		Scope function = new Scope(this.currentScope, "function"+String.valueOf(this.functionIndex));
		this.functionIndex+=1;
		this.scopes.add(function);
		this.currentScope = function;
	}
	
	public void exitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
		this.currentScope = this.currentScope.getEnclosingScope();
	}
	
	public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
		int index = ctx.Identifier().getSymbol().getTokenIndex();
		String text = ctx.Identifier().getText();
		VariableSymbol var = new VariableSymbol(text, index, "class");
		this.currentScope.define(var);	
	}
	
	public void enterIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx) {
		this.currentScope.resolveAndAddIndex(ctx.Identifier().getText(), ctx.Identifier().getSymbol().getTokenIndex(),"local");
	}
	
	public void enterArrowFunctionParameters() {
		//hmmm
	}
	
	public void enterForInStatement(JavaScriptParser.ForInStatementContext ctx) {
		this.currentScope.resolveAndAddIndex(ctx.Identifier().getText(), ctx.Identifier().getSymbol().getTokenIndex(),"local");
	}
	
	public void enterForVarInStatement(JavaScriptParser.ForVarInStatementContext ctx) {
		this.currentScope.resolveAndAddIndex(ctx.Identifier().getText(), ctx.Identifier().getSymbol().getTokenIndex(),"local");
	}
	
	public void enterContinueStatement(JavaScriptParser.ContinueStatementContext ctx) {
		if(ctx.Identifier()!=null) {
			this.currentScope.resolveAndAddIndex(ctx.Identifier().getText(), ctx.Identifier().getSymbol().getTokenIndex(),"local");
		}
	}
	
	public void enterBreakStatement(JavaScriptParser.BreakStatementContext ctx) {
		if(ctx.Identifier()!=null) {
			this.currentScope.resolveAndAddIndex(ctx.Identifier().getText(), ctx.Identifier().getSymbol().getTokenIndex(),"local");
		}
	}
	
	
}
