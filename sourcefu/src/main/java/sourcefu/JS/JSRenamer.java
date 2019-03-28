package sourcefu.JS;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.JS.antlr.JavaScriptParser;
import sourcefu.JS.antlr.JavaScriptParserBaseListener;
import sourcefu.VBA.helpers.GlobalScope;

public class JSRenamer extends JavaScriptParserBaseListener{
	TokenStreamRewriter rewriter;
	GlobalScope globals;
	
	public JSRenamer(CommonTokenStream tokens) {
		rewriter=new TokenStreamRewriter(tokens);
	}

	public String getdata() {
		return rewriter.getText();
	}

	public void rename() {
		// TODO Auto-generated method stub
		
	}
	
	public void enterLiteralExpression (JavaScriptParser.LiteralExpressionContext ctx) {
		System.out.println("current expression : " + ctx.getText());
		System.out.println("nb childs: "+ String.valueOf(ctx.getChildCount()));
	}
	
	public void enterVariableStatement(JavaScriptParser.VariableStatementContext ctx) {
		System.out.println("current statement :" + ctx.getText());
	}
	
}
