package sourcefu.VBA.helpers;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sourcefu.VBA.VBABeautifier;
import sourcefu.VBA.VBACommentsDeleter;
import sourcefu.VBA.VBADeadStore;
import sourcefu.VBA.VBAEmptyBlockRemover;
import sourcefu.VBA.VBAIFStmtSimplifier;
import sourcefu.VBA.VBAMain;
import sourcefu.VBA.VBAPartialEvaluator;
import sourcefu.VBA.VBARenamer;
import sourcefu.VBA.antlr.VBALexer;
import sourcefu.VBA.antlr.VBAParser;

public class VBAAPIUtils {
	public CharStream getCharStreamFromData(String data) {
		CharStream input = CharStreams.fromString(data);
		return input;
	}
	
	public CommonTokenStream generateTokens(CharStream input) {
		VBALexer lexer = new VBALexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return tokens;
	}
	
	public ParseTree generateTree(CommonTokenStream tokens) {
		VBAParser parser = new VBAParser(tokens);
		ParseTree tree = parser.startRule();
		return tree;
	}
	
	public String APIDeleteComments(String initial_data) {
	CharStream input = getCharStreamFromData(initial_data);
	CommonTokenStream tokens = generateTokens(input);
	ParseTree tree = generateTree(tokens);
	ParseTreeWalker walker = new ParseTreeWalker();
	VBACommentsDeleter comm_deleter = new VBACommentsDeleter(tokens);
	walker.walk(comm_deleter, tree);
	return comm_deleter.getdata();
	}
	
	public String APIDeadStore(String initial_data) {
		String output = "";
		while (true) { //multipass
			CharStream input = getCharStreamFromData(initial_data);
			CommonTokenStream tokens = generateTokens(input);
			ParseTree tree = generateTree(tokens);
			ParseTreeWalker walker = new ParseTreeWalker();
			VBADeadStore deadstorer = new VBADeadStore(tokens);
			walker.walk(deadstorer, tree);
			deadstorer.deadstore();
			if(deadstorer.getNumberModifications() == 0) {
				output = deadstorer.getdata();
				break;
			}
			initial_data = deadstorer.getdata();
		}
		return output;	
	}	
	
	public String APIBeautify(String initial_data) {
		CharStream input = getCharStreamFromData(initial_data);
		CommonTokenStream tokens = generateTokens(input);
		ParseTree tree = generateTree(tokens);
		ParseTreeWalker walker = new ParseTreeWalker();
		VBABeautifier beautifier = new VBABeautifier(tokens);
		walker.walk(beautifier, tree);
		return beautifier.getdata();
	}
	
	public String APIRename(String initial_data) {
		CharStream input = getCharStreamFromData(initial_data);
		CommonTokenStream tokens = generateTokens(input);
		ParseTree tree = generateTree(tokens);
		ParseTreeWalker walker = new ParseTreeWalker();
		VBARenamer renamer = new VBARenamer(tokens);
		walker.walk(renamer, tree);
		renamer.rename();
		return renamer.getdata();
	}
	
	public String APIExprEval(String initial_data) {
		String output = "";
		while (true) { //multipass
			CharStream input = getCharStreamFromData(initial_data);
			CommonTokenStream tokens = generateTokens(input);
			ParseTree tree = generateTree(tokens);
			VBAPartialEvaluator partialEval = new VBAPartialEvaluator(tree, tokens);
			partialEval.partialeval();
			//System.out.println("modifications : "+ String.valueOf(partialEval.getNumberModifications()));
			//System.out.println("data : ");
			//System.out.println(partialEval.getdata());
			if(partialEval.getNumberModifications() == 0) {
				output = partialEval.getdata();
				break;
			}
			initial_data = partialEval.getdata();
		}
		return output;
	}
	
	public String APISimplify(String initial_data) {
		CharStream input = getCharStreamFromData(initial_data);
		CommonTokenStream tokens = generateTokens(input);
		ParseTree tree = generateTree(tokens);
		ParseTreeWalker walker = new ParseTreeWalker();
		VBAIFStmtSimplifier ifsimplifier = new VBAIFStmtSimplifier(tokens);
		walker.walk(ifsimplifier, tree);
		return ifsimplifier.getdata();
	}
	
	public String APIFullAnalysis(String initial_data) {
		VBAMain engine = new VBAMain(initial_data);
		engine.run();
		return engine.getdata();
	}
	
	public String APIEMptyBlockRemoval(String initial_data) {
		CharStream input = getCharStreamFromData(initial_data);
		CommonTokenStream tokens = generateTokens(input);
		ParseTree tree = generateTree(tokens);
		ParseTreeWalker walker = new ParseTreeWalker();
		VBAEmptyBlockRemover emptier = new VBAEmptyBlockRemover(tokens);
		walker.walk(emptier, tree);
		return emptier.getdata();
	}
}
