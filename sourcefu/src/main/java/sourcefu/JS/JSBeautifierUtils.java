package sourcefu.JS;

import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class JSBeautifierUtils{
	TokenStreamRewriter rewriter;
	Integer IndentLevel;
	CommonTokenStream tokens;
	
	public JSBeautifierUtils(CommonTokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
		this.IndentLevel = 0;
		this.tokens=tokens;
	}
	
	
	public void removeUselessTokens() {
		boolean todelete = false;
		List<Token> tokens = this.tokens.getTokens();
		for(Token token : tokens) {
			if(token.getType()==107) {
				boolean todeletebefore = true;
				int i = token.getTokenIndex()-1;
				while(todeletebefore) {
					if(tokens.get(i).getType()==106) {
						rewriter.delete(tokens.get(i));
					} else {
						todeletebefore = false;
					}
					--i;
				}
				todelete = true;
				rewriter.delete(token.getTokenIndex());
				continue;
			}
			if(token.getType()==106 && todelete) {
				rewriter.delete(token.getTokenIndex());
			}
			if(token.getType()!=106 && todelete) {
				todelete = false;
			}
		}
	}

	public String getdata() {
		return rewriter.getText();
	}
	
}
