package sourcefu.VBA;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;

public class VBABeautifier extends VBAParserBaseListener{
	
		TokenStreamRewriter rewriter;
		Integer IndentLevel;
		
		public VBABeautifier(CommonTokenStream tokens) {
			rewriter=new TokenStreamRewriter(tokens);
			this.IndentLevel = 0;
		}
		
		public void enterBlockStmt(VBAParser.BlockStmtContext ctx) {
			rewriter.insertBefore(ctx.start.getTokenIndex(), getIndentation());
		}
		
		/*
		TODO : rajouter indent fin boucles
		*/
		
		public void enterSubStmt(VBAParser.SubStmtContext ctx) {
			rewriter.insertBefore(ctx.start.getTokenIndex(), "\n");
		}
		
		public void enterFunctionStmt(VBAParser.FunctionStmtContext ctx) {
			rewriter.insertBefore(ctx.start.getTokenIndex(), "\n");
		}
		
		public void exitIfStmt(VBAParser.IfStmtContext ctx) {
			rewriter.insertBefore(ctx.END_IF().getSymbol(), getIndentation());
		}
		
		public void enterElseBlock(VBAParser.ElseBlockContext ctx) {
			rewriter.insertBefore(ctx.start.getTokenIndex(), getIndentation());
		}
		
		public void enterElseIfBlock(VBAParser.ElseIfBlockContext ctx) {
			rewriter.insertBefore(ctx.start.getTokenIndex(), getIndentation());
		}
		
		public void exitForEachStmt(VBAParser.ForEachStmtContext ctx) {
			if (ctx.NEXT()!=null) {
				rewriter.insertBefore(ctx.NEXT().getSymbol(), getIndentation());
			}
		}
		
		public void exitForNextStmt(VBAParser.ForNextStmtContext ctx) { 
			if (ctx.NEXT()!=null) {
				rewriter.insertBefore(ctx.NEXT().getSymbol(), getIndentation());
			}
		}
		
		public void enterBlock(VBAParser.BlockContext ctx) {
			this.IndentLevel +=1;
		}
		
		public void exitBlock(VBAParser.BlockContext ctx) {
			this.IndentLevel-=1;
		}
		
		public void enterUnterminatedBlock(VBAParser.UnterminatedBlockContext ctx) { 
			this.IndentLevel +=1;
		}
		
		public void exitUnterminatedBlock(VBAParser.UnterminatedBlockContext ctx) { 
			this.IndentLevel-=1;
		}
		
		public void exitEndOfStatement(VBAParser.EndOfStatementContext ctx) {
			rewriter.replace(ctx.start.getTokenIndex(),ctx.stop.getTokenIndex(),"\n");
		}
				
		private String getIndentation() {
			return new String(new char[this.IndentLevel]).replace("\0","    ");
		}
		
		public String getdata() {return rewriter.getText();}

}
