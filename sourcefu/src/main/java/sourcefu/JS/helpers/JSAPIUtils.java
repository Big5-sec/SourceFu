package sourcefu.JS.helpers;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sourcefu.JS.JSRenamer;
import sourcefu.JS.antlr.JavaScriptBaseLexer;
import sourcefu.JS.antlr.JavaScriptLexer;
import sourcefu.JS.antlr.JavaScriptParser;

public class JSAPIUtils {
	
	public CharStream getCharStreamFromData(String data) {
		CharStream input = CharStreams.fromString(data);
		return input;
	}
	
	public CommonTokenStream generateTokens(CharStream input) {
		JavaScriptLexer lexer = new JavaScriptLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return tokens;
	}
	
	public ParseTree generateTree(CommonTokenStream tokens) {
		JavaScriptParser parser = new JavaScriptParser(tokens);
		ParseTree tree = parser.program();
		return tree;
	}
	
	public String APIRename(String initial_data) {
		CharStream input = getCharStreamFromData(initial_data);
		CommonTokenStream tokens = generateTokens(input);
		ParseTree tree = generateTree(tokens);
		ParseTreeWalker walker = new ParseTreeWalker();
		JSRenamer renamer = new JSRenamer(tokens);
		walker.walk(renamer, tree);
		renamer.rename();
		return renamer.getdata();
	}

}
