package sourcefu.VBA;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;

public class VBAIFStmtSimplifier extends VBAParserBaseListener {
	
	TokenStreamRewriter rewriter;
	Integer numberModifications=0;
	
	public VBAIFStmtSimplifier(CommonTokenStream tokens) {
		rewriter=new TokenStreamRewriter(tokens);
	}
	
	
	//First we treat the case of singleLineifstmt, either composed of ifwithnonemptythen or ifwithemptythen
	//those contain the boolean expression so we treat them directly
	public void exitIfWithNonEmptyThen(VBAParser.IfWithNonEmptyThenContext ctx) {
		if(ctx.singleLineElseClause()!=null) {
			if (ctx.booleanExpression().getText().equals("True")) {
				this.rewriter.replace(ctx.start, ctx.stop, ctx.listOrLabel().getText());
				this.numberModifications+=1;
			} else if (ctx.booleanExpression().getText().equals("False")) {
				this.rewriter.replace(ctx.start, ctx.stop, ctx.singleLineElseClause().listOrLabel().getText());
				this.numberModifications+=1;
			}		
		} else {
			if (ctx.booleanExpression().getText().equals("True")) {
				this.rewriter.replace(ctx.start, ctx.stop, ctx.listOrLabel().getText());
				this.numberModifications+=1;
			} else if (ctx.booleanExpression().getText().equals("False")) {
				this.rewriter.replace(ctx.start, ctx.stop, "");
				this.numberModifications+=1;
			}
		}
	}
	
	public void exitIfWithEmptyThen(VBAParser.IfWithEmptyThenContext ctx) {
		if (ctx.booleanExpression().getText().equals("True")) {
			this.rewriter.replace(ctx.start, ctx.stop, "");
			this.numberModifications+=1;
		} else if (ctx.booleanExpression().getText().equals("False")) {
			this.rewriter.replace(ctx.start, ctx.stop, ctx.singleLineElseClause().listOrLabel().getText());
			this.numberModifications+=1;
		}
	}
	
	//then we treat the case of the IfStmt
	public void exitIfStmt(VBAParser.IfStmtContext ctx) {
	    //System.out.println("in if stmt");
		if(ctx.booleanExpression().getText().equals("True")) {
			this.rewriter.replace(ctx.start, ctx.stop, ctx.block().getText());
			this.numberModifications+=1;
			return;
		} else if (ctx.booleanExpression().getText().equals("False")) {
			//first we check every possible elseif block
			if (ctx.elseIfBlock()!=null) {
				int nbelseif = ctx.elseIfBlock().size();
				for(int i =0; i< nbelseif; i++) {
					if(ctx.elseIfBlock(i).booleanExpression().getText().equals("True")) {
						this.rewriter.replace(ctx.start, ctx.stop, ctx.elseIfBlock(i).block().getText());
						this.numberModifications+=1;
						return;
					} else if (ctx.elseIfBlock(i).booleanExpression().getText().equals("False")) {
						continue;
					} else {
						//that means at least one expression has not been evaluated, so we should stop here
						return;
					}
				}
			}
			
			//if there, then if else block exists, it means this is the true one, so replace by its text
			if (ctx.elseBlock()!=null) {
				this.rewriter.replace(ctx.start, ctx.stop, ctx.elseBlock().block().getText());
				this.numberModifications+=1;
				return;
			}
			
			//everything is false here
			this.rewriter.replace(ctx.start, ctx.stop, "");
			this.numberModifications+=1;
		}
	}
	
	public Integer getNumberModifications() {
		return this.numberModifications;
	}
	
	public String getdata() {
		return rewriter.getText();
	}
	
}
