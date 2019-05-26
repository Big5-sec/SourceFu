package sourcefu.apiserver;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import sourcefu.JS.antlr.JavaScriptLexer;
import sourcefu.JS.antlr.JavaScriptParser;
import sourcefu.VBA.antlr.VBALexer;
import sourcefu.VBA.antlr.VBAParser;

/*This class gives all methods used by the APIServer that are generic*/
public class APIServerUtils {
	
	/* this function does not work very well, and should be improved*/
	public String getSampleLanguage(String initial_data) {
		CharStream input = CharStreams.fromString(initial_data);
		boolean parse = false;
		VBALexer lexer = new VBALexer(input);
		lexer.removeErrorListeners();
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		VBAParser parser = new VBAParser(tokens);
		parser.removeErrorListeners();
		parser.setErrorHandler(new BailErrorStrategy());
		try {
			parser.startRule();
			parse = true;
		} catch (ParseCancellationException e) {
		} finally {
			if(parse) {
				return "VBA";
			}
		}

		JavaScriptLexer lexer2 = new JavaScriptLexer(input);
		lexer2.removeErrorListeners();
		CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
		JavaScriptParser parser2 = new JavaScriptParser(tokens2);
		parser2.removeErrorListeners();
		parser2.setErrorHandler(new BailErrorStrategy());
		try {
			parser2.program();
			parse = true;
		} catch (ParseCancellationException e) {
		} finally {
			if(parse) {
				return "JS";
			}
		}
		return "undefined";
	}

}
