package sourcefu.VBA;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;

public class VBAEmptyBlockRemover extends VBAParserBaseListener {
		TokenStreamRewriter rewriter;
		private Integer numberModifications=0;
		
		public VBAEmptyBlockRemover(CommonTokenStream tokens) {
			rewriter=new TokenStreamRewriter(tokens);
		}
			
		//we handle the cases of FOR stmts, using unterminated block instead of blocks
		
		public void enterForEachStmt(VBAParser.ForEachStmtContext ctx) { 
			if(ctx.unterminatedBlock() != null) {
				if (ctx.unterminatedBlock().getText().equals("")){
					this.rewriter.delete(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
					this.rewriter.getText();
					this.numberModifications+=1;
				}
			} else {
					this.rewriter.delete(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
					this.rewriter.getText(); //going to last token to avoid overlapping rewriting operations
					this.numberModifications+=1;
			}
		}
		
		public void enterForNextStmt(VBAParser.ForNextStmtContext ctx) { 
			if(ctx.unterminatedBlock() != null) {
				if (ctx.unterminatedBlock().getText().equals("")){
					this.rewriter.delete(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
					this.rewriter.getText(); //going to last token to avoid overlapping rewriting operations
					this.numberModifications+=1;
				}
			} else {
				this.rewriter.delete(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
				this.rewriter.getText(); //going to last token to avoid overlapping rewriting operations
				this.numberModifications+=1;
			}
		}
		
		
		//otherwise, if any block is empty, just remove its parent from the text		
		public void enterBlock(VBAParser.BlockContext ctx) {
			if (ctx.getText().equals("")) {
				this.rewriter.delete(ctx.getParent().start.getTokenIndex(), ctx.getParent().stop.getTokenIndex());
				this.rewriter.getText();
				this.numberModifications+=1;
			}
		}
		
		
		public String getdata() {
			return rewriter.getText();
		}
		
		public Integer getNumberModifications() {
			return this.numberModifications;
		}
}
