package sourcefu.VBA;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;
import sourcefu.VBA.partialevaluator.RewriteOperation;

public class VBAIFStmtSimplifier extends VBAParserBaseListener {
	
	TokenStreamRewriter rewriter;
	Integer numberModifications=0;
	Map<Token, RewriteOperation> operations = new LinkedHashMap<Token,RewriteOperation>();
	
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
		Boolean evaluable = true;
		Boolean first = true;
		if(ctx.booleanExpression().getText().equals("True")) {
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, ctx.block().getText());
			operations.put(ctx.start, op);
			//this.rewriter.replace(ctx.start, ctx.stop, ctx.block().getText());
			this.numberModifications+=1;
			return;
		} else if (ctx.booleanExpression().getText().equals("False")) {
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.block().stop, "");
			operations.put(ctx.start, op);
			//this.rewriter.replace(ctx.start, ctx.block().stop, "");
			this.numberModifications+=1;
		} else {
			evaluable = false;
			first = false;
		}
		
		
		if (ctx.elseIfBlock()!=null) {
			int nbelseif = ctx.elseIfBlock().size();
			for(int i =0; i< nbelseif; i++) {
				if(ctx.elseIfBlock(i).booleanExpression().getText().equals("True")) {
					//this.rewriter.replace(ctx.start, ctx.stop, ctx.elseIfBlock(i).block().getText());
					if(evaluable) {
						RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, ctx.elseIfBlock(i).block().getText());
						operations.put(ctx.start, op);
						this.numberModifications+=1;
						return;
					}
				} else if (ctx.elseIfBlock(i).booleanExpression().getText().equals("False")) {
					this.rewriter.replace(ctx.elseIfBlock(i).start, ctx.elseIfBlock(i).stop, "");
					this.numberModifications+=1;
					//continue;
				} else {
					evaluable = false;
					if (first) {
						//this.rewriter.replace(ctx.elseIfBlock(i).ELSEIF().getSymbol().getStartIndex(), ctx.elseIfBlock(i).ELSEIF().getSymbol().getStopIndex(), "If");
						RewriteOperation op = new RewriteOperation(ctx.elseIfBlock(i).ELSEIF().getSymbol(), ctx.elseIfBlock(i).ELSEIF().getSymbol(), "If");
						operations.put(ctx.elseIfBlock(i).ELSEIF().getSymbol(), op);
						first = false;
					}
					//that means at least one expression has not been evaluated, so we should stop here
					//return;
				}
			}
		}
		
		//if there, then if else block exists, it means this is the true one, so replace by its text
		if ((ctx.elseBlock()!=null) && (evaluable)) {
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, ctx.elseBlock().block().getText());
			operations.put(ctx.start, op);
			//this.rewriter.replace(ctx.start, ctx.stop, ctx.elseBlock().block().getText());
			this.numberModifications+=1;
			return;
		}
		
		
	}
	
	public void applyModifications() {
		for(Entry<Token, RewriteOperation> entry: this.operations.entrySet()) {
//			System.out.print("entry : ");
//			System.out.println(entry.getValue().start);
//			System.out.println("replace:" + entry.getValue().replacement);
			rewriter.replace(entry.getValue().start, entry.getValue().stop, entry.getValue().replacement);
		}
	}
	
	public Integer getNumberModifications() {
		return this.numberModifications;
	}
	
	public String getdata() {
		applyModifications();
		return rewriter.getText();
	}
	
}
