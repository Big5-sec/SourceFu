package sourcefu.JS;

import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.JS.antlr.JavaScriptParserBaseListener;
import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;

public class JSCommentsDeleter extends JavaScriptParserBaseListener{
	TokenStreamRewriter rewriter;
	CommonTokenStream tokens;

	public JSCommentsDeleter(CommonTokenStream tokens) {
		this.tokens = tokens;
		rewriter=new TokenStreamRewriter(tokens);
	}

	public void deleteComments() {
		List<Token> tokens = this.tokens.getTokens();
		//System.out.println("hidden tokens : " + tokens);
		if(tokens!=null) {
			for(Token token : tokens) {
				if (token.getChannel()==1) {
					rewriter.delete(token.getTokenIndex());
				}
			}
		}
	}

	public String getdata() {
		return rewriter.getText();
	}

}
