package sourcefu.VBA;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sourcefu.VBA.partialevaluator.RewriteOperation;
import sourcefu.VBA.partialevaluator.VBACommonFunctionsEvaluator;
import sourcefu.VBA.partialevaluator.VBAExprEvaluator;
import sourcefu.lib.CtxValue;
import sourcefu.lib.ProxyParseTreeListener;

public class VBAPartialEvaluator {
	
	TokenStreamRewriter rewriter;
	CommonTokenStream tokens;
	ParseTree tree;
	Integer numberModifications = 0;
	Map<Token, RewriteOperation> operations;
	
	public VBAPartialEvaluator(ParseTree tree, CommonTokenStream tokens) {
		this.tree = tree;
		this.tokens = tokens;
		this.rewriter = new TokenStreamRewriter(tokens);
		this.operations = new LinkedHashMap<Token, RewriteOperation>();
	}
	
	public void partialeval() {
		//System.out.println("visiting");
		//VBAVisitorTest test = new VBAVisitorTest();
		//test.visit(tree);
		//System.out.println("end visiting");
		
		ParseTreeWalker walker = new ParseTreeWalker();
		CtxValue ctxvalue = new CtxValue();
		VBACommonFunctionsEvaluator commonFunctionsEval = new VBACommonFunctionsEvaluator(this.tokens,ctxvalue,this.rewriter,this.operations);
		VBAExprEvaluator exprEval = new VBAExprEvaluator(this.tokens,ctxvalue,this.rewriter, this.operations);
		VBAConstantFolding constFolding = new VBAConstantFolding(this.tokens, ctxvalue, this.rewriter, this.operations);
		ProxyParseTreeListener proxy = new ProxyParseTreeListener();
		proxy.add(commonFunctionsEval);
		proxy.add(exprEval);
		proxy.add(constFolding);
		walker.walk(proxy, this.tree);
		//walker.walk(proxy, this.tree);
		this.numberModifications+=commonFunctionsEval.getNumberModifications();
		this.numberModifications+=exprEval.getNumberModifications();
		this.numberModifications+=constFolding.getNumberModifications();
		//System.out.println("number modifications :" + String.valueOf(this.numberModifications));
		applyModifications();
	}
	
	public void applyModifications() {
		for(Entry<Token, RewriteOperation> entry: this.operations.entrySet()) {
		    //System.out.print("entry : ");
		    //System.out.println(entry.getValue().start);
			this.rewriter.replace(entry.getValue().start, entry.getValue().stop, entry.getValue().replacement);
		}
	}
	
	public String getdata() {
	    //System.out.println(this.rewriter.toString());
		/*for(Entry<Token, RewriteOperation> entry: this.operations.entrySet()) {
			System.out.print("entry : ");
			System.out.println(entry.getValue().start);
			//this.rewriter.replace(entry.getValue().start, entry.getValue().stop, entry.getValue().replacement);
		}*/
		return this.rewriter.getText();
	}
	
	public int getNumberModifications() {
		return this.numberModifications;
	}
	
}
