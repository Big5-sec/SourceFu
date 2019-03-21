package sourcefu.VBA;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;

public class VBACommentsDeleter extends VBAParserBaseListener {
	TokenStreamRewriter rewriter;
	
	public VBACommentsDeleter(CommonTokenStream tokens) {
		rewriter=new TokenStreamRewriter(tokens);
	}
	
	public void enterCommentOrAnnotation(VBAParser.CommentOrAnnotationContext ctx) { 
		this.rewriter.delete(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
	}
	
	public void enterAnnotationList(VBAParser.AnnotationListContext ctx) { 
		this.rewriter.delete(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
	}
	
	public String getdata() {
		return rewriter.getText();
	}
}
