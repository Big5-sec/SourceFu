package sourcefu.VBA.helpers;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sourcefu.VBA.VBACommentsDeleter;
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
}
