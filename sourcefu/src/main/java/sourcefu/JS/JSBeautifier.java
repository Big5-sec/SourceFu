package sourcefu.JS;

import java.util.Map.Entry;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import sourcefu.JS.antlr.JavaScriptParser;
import sourcefu.JS.antlr.JavaScriptParserBaseListener;
import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.partialevaluator.RewriteOperation;

public class JSBeautifier extends JavaScriptParserBaseListener{
	
	TokenStreamRewriter rewriter;
	Integer IndentLevel;
	JSBeautifyRewriterController rewriterController = new JSBeautifyRewriterController();
	CommonTokenStream tokens;
	
	public JSBeautifier(CommonTokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
		this.IndentLevel = 0;
		this.tokens=tokens;
	}
	
	public void enterStatementList(JavaScriptParser.StatementListContext ctx) {
		JSBeautifyRewriteOperation op = new JSBeautifyRewriteOperation(ctx.start.getTokenIndex(), "\n");
		rewriterController.addRewriteOperation(op);
		this.IndentLevel +=1;
	}
	
	public void exitStatementList(JavaScriptParser.StatementListContext ctx) { 
		this.IndentLevel -=1;
	}

	public void enterStatement(JavaScriptParser.StatementContext ctx) {
		JSBeautifyRewriteOperation op = new JSBeautifyRewriteOperation(ctx.start.getTokenIndex(), getIndentation());
		rewriterController.addRewriteOperation(op);
	}
	
	/*public void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
		rewriter.insertBefore(ctx.functionBody().start.getTokenIndex(), "\n");
	}
	*/
	public void enterFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
		//rewriter.replace(ctx.functionBody().start.getTokenIndex(), "\n"+ctx.functionBody().getText());
	}
	
	public void enterFunctionBody(JavaScriptParser.FunctionBodyContext ctx) {
		//rewriter.insertBefore(ctx.sourceElements().sourceElement(0).start.getTokenIndex(), "\n"+getIndentation());
		JSBeautifyRewriteOperation op = new JSBeautifyRewriteOperation(ctx.start.getTokenIndex(), "\n");
		rewriterController.addRewriteOperation(op);
		this.IndentLevel +=1;
	}
	
	public void exitFunctionBody(JavaScriptParser.FunctionBodyContext ctx) {
		this.IndentLevel -=1;
		rewriter.insertAfter(ctx.stop.getTokenIndex(), getIndentation());
	}
	
	public void enterMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
		//rewriter.insertBefore(ctx.start.getTokenIndex(), "\n");
	}
	
	public void enterClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
		//rewriter.insertBefore(ctx.start.getTokenIndex(), "\n");
	}
	
	public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
		//rewriter.insertBefore(ctx.start.getTokenIndex(), "\n");
	}
	
	public void exitEos(JavaScriptParser.EosContext ctx) {
		/*if (ctx.stop.getTokenIndex()+1 >= this.tokens.getTokens().size()) {
			return;
		}
		//rewriter.replace(ctx.start.getTokenIndex(),ctx.stop.getTokenIndex(), ctx.getText()+"\n");
		String nextTokenStr = this.tokens.get(ctx.stop.getTokenIndex()+1).getText();
		if(!nextTokenStr.contains("\n")) {
			rewriter.replace(ctx.start.getTokenIndex(),ctx.stop.getTokenIndex(), ctx.getText()+"\n");
		}*/
	}
	
	public void exitBlock(JavaScriptParser.BlockContext ctx) {
		System.out.println("last child : "+ ctx.getChild(ctx.getChildCount()-1).getClass());
		TerminalNodeImpl term = (TerminalNodeImpl)(ctx.getChild(ctx.getChildCount()-1));
		rewriter.insertBefore(term.getSymbol().getTokenIndex(), getIndentation());
		rewriter.insertAfter(term.getSymbol().getTokenIndex(), "\n");
	}
	
	private String getIndentation() {
		return new String(new char[this.IndentLevel]).replace("\0","    ");
	}
	
	public void applyModifications() {
		for(Entry<Integer, String> entry: this.rewriterController.getOperations().entrySet()) {
			rewriter.insertBefore(entry.getKey(), entry.getValue());
		}
	}
	
	
	public String getdata() {
		applyModifications();
		return rewriter.getText();}
	}
