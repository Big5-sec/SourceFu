package sourcefu.VBA.partialevaluator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

/*
 * This class is only used to register replace operations in a map. This avoids the problem of having multiple rewrite operations at the same index.
 */
public class RewriteOperation {

	public Token start;
	public Token stop;
	public String replacement;
	
	public RewriteOperation(Token start, Token stop, String replacement) {
		this.start = start;
		this.stop = stop;
		this.replacement = replacement;
	}
	
}
