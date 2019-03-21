package sourcefu.VBA;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseVisitor;

public class VBAVisitorTest extends VBAParserBaseVisitor<Object>{

	public Object visitAddOp(VBAParser.AddOpContext ctx) { 
		System.out.println("coucou add op!");
		return visitChildren(ctx); 
	}
	
}
