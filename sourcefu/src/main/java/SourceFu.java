import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.RunLast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sourcefu.JS.JSMain;
import sourcefu.JS.antlr.JavaScriptLexer;
import sourcefu.JS.antlr.JavaScriptParser;
import sourcefu.VBA.VBACommentsDeleter;
import sourcefu.VBA.VBADeadStore;
import sourcefu.VBA.VBAEmptyBlockRemover;
import sourcefu.VBA.VBAMain;
import sourcefu.VBA.VBARenamer;
import sourcefu.VBA.antlr.VBALexer;
import sourcefu.VBA.antlr.VBAParser;
import sourcefu.apiserver.APIServer;
import sourcefu.lib.*;
import sourcefu.webserver.WebServer;

/*
 * this class is just the main, ie for parsing options and initiate engines behind.
 */
@Command(name = "sourcefu", mixinStandardHelpOptions = true, version = "SourceFu v0.0001")
public class SourceFu {

	static
	@Command(name="standalone",
	header="run terminal version of SourceFu",
	description="this option permits to run sourcefu without any window, so it can be added to scripts."+ 
	"This is the only viable option for now. please be indulgent."+
	"Also, stdin is not supported, so the user should provide a file as input.")
	class TerminalSourceFu implements Runnable{
		//used for debug for now
		@Option(names = { "-s", "--show" }, description = "show viewer", hidden=true)
		private boolean show = false;
		
		//generic options
		//@Option(names = { "-q", "--quiet" }, description = "do not output anything on terminal")
		private boolean quiet = false;
		
		@Option(names = { "-t", "--source-type" }, description = "type of the input, i.e. vba, php, powershell and so on.")
		private String input_type = "undefined";
		
		@Option(names="-v",description = "specify multiple -v options to increase verbosity")
		private boolean[] verbosity; 
		
		//operations options
		@Option(names= {"-B", "--beautify"}, description = "perform a beautify operation")
		private boolean doBeautify = false;
		
		//@Option(names= {"--indent"}, description = "value to use for indentation while performing beautify operation")
		private String indent = "  ";
		
		@Option(names= {"-C", "--comments"}, description = "perform a comments deletion operation")
		private boolean doComments = false;
		
		@Option(names= {"-D", "--deadstore"}, description = "perform a deadstore operation")
		private boolean doDeadStore = false;
		
		@Option(names= {"-E", "--empty"}, description = "perform a \"empty block deletion\" operation")
		private boolean doEmpty = false;
		
		@Option(names= {"-R", "--rename"}, description = "perform a rename operation")
		private boolean doRename = false;
		
		@Option(names= {"-K", "--constantsmodify"}, description = "perform the transformation of internal language variables")
		private boolean doConstantsModify = false;
		
		@Option(names= {"-V", "--partialeval"}, description = "perform the transformation of internal language variables")
		private boolean doPartialEval = false;
		
		@Parameters(paramLabel = "INFILE", arity="1", index="0", description = "File to process.")
		private String inputFile;   
		
		@Parameters(paramLabel = "OUTFILE", index = "1", arity="0..1", description = "File to write with deobfuscated data.")
		private String outputFile;   

		private String getSampleLanguage(String inputFile) {
			String initial_data="";
			try {
				 byte[] file_contents = Files.readAllBytes(Paths.get(inputFile));
				 initial_data = new String(file_contents);
			}catch(Exception e){
				System.out.println("[-] cannot read input file, exiting...");
				System.exit(1);
			}

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
		
		
		public void run() {
			//first make some checks on input options
			if(!indent.equals("  ") && !doBeautify) {
				throw new RuntimeException("indent argument can be only used if beautify operation is set");
			}
			
			
			if (!quiet) {
				new Logo();
			}
			new Infos();
			
			Integer verbosityLevel=0;
			if(verbosity!=null) {
				verbosityLevel = verbosity.length;
			}
				
			//System.out.println(String.valueOf(verbosityLevel));
			
			if(input_type.equals("undefined")) {
				//TODO: method to get automatically source type without parsing
				InputStream is = System.in;
				try {
					is = new FileInputStream(inputFile);
					//do checks
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			List<String> input_types = Arrays.asList("VBA", "JS"); //will be completed in future
			if(input_type.equals("undefined")) {
				System.out.println("[+] Trying to autodetect sample language...");
				input_type = getSampleLanguage(inputFile);
				if (!input_type.equals("undefined")) {
					System.out.println("[+] Detected sample language : " + input_type);
				}	
			} else {
				if(!input_types.contains(input_type)) {
					System.out.println("[!] Input sample language not recognized! Trying autodetection...");
					input_type = getSampleLanguage(inputFile);
					if (!input_type.equals("undefined")) {
						System.out.println("[+] Detected sample language : " + input_type);
					}
				}
			}
			
			if(input_type.equals("undefined")) {
				System.out.println("[-] Sample language not found by the application... However, this might be due to the absence of error recovery in parsing.");
				System.out.println("[*] If you determined the sample language by hand, then use --type option to force the sample language and use error recovery");
				System.out.println("[*] Exiting...");
				System.exit(1);;
			}
			
			//there should dispatch between possible types.
			//like new VBASourceFU(args)
			if(input_type.equals("VBA")) {
				VBAMain new_main = new VBAMain(doBeautify,doComments,doDeadStore,doEmpty,doRename, doConstantsModify, doPartialEval, inputFile, show, verbosityLevel);
				new_main.run();
				//System.out.println(new_main.getdata());
				new Printing().printSidebySide(new_main.getinitdata(), new_main.getdata()); //TODO: output choice
				if(outputFile!=null) {
					new Printing().printToFile(new_main.getdata(), outputFile);
				}
			} else if(input_type.equals("JS")) {
				JSMain new_main = new JSMain(doBeautify,doComments,doDeadStore,doEmpty,doRename, doConstantsModify, doPartialEval, inputFile, show, verbosityLevel);
				new_main.run();
				//System.out.println(new_main.getdata());
				new Printing().printSidebySide(new_main.getinitdata(), new_main.getdata()); //TODO: output choice
				if(outputFile!=null) {
					new Printing().printToFile(new_main.getdata(), outputFile);
				}
			}else {
				throw new RuntimeException("cannot do the job due to input type");
			}
		}
	}

	static
	@Command(name="apiserver",
	header="run API server of SourceFu",
	description="The API server permits to programmatically interact with an instance of Sourcefu on a remote machine")
	class APIServerSourceFu implements Runnable{
		@Option(names = { "-p", "--port" }, description = "port to be used for API Server")
		private int port=0;

		@Override
		public void run() {
			APIServer apiServer = new APIServer();
		}
		
	}
	
	static
	@Command(name="webserver",
	header="run web server of SourceFu",
	description="The API server permits to programmatically interact with an instance of Sourcefu on a remote machine")
	class WebServerSourceFu implements Runnable{
		@Option(names = { "-p", "--port" }, description = "port to be used for API Server")
		private int port=0;

		@Override
		public void run() {
			WebServer webServer = new WebServer();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		CommandLine commandLine = new CommandLine(new SourceFu()).addSubcommand("help", new CommandLine.HelpCommand());
		commandLine.addSubcommand("standalone", new TerminalSourceFu());
		commandLine.addSubcommand("apiserver", new APIServerSourceFu());
		commandLine.addSubcommand("webserver", new WebServerSourceFu());
		//commandLine.addSubcommand("graphical", new GraphicalSourceFu());
		//List<CommandLine> parsed = commandLine.parse(args);
		//handleParseResult(parsed);
		try {
			commandLine.parseWithHandler(new RunLast(), System.err, args);
		} catch (Exception e) {
			System.out.println("Invalid command specified. Please use --help.");
		}
		//commandLine.parseWithHandler(new RunLast(), System.err, args);
	}
}
