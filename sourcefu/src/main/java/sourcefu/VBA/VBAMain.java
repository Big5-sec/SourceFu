package sourcefu.VBA;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.atomic.DoubleAccumulator;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sourcefu.VBA.antlr.VBALexer;
import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.partialevaluator.VBACommonFunctionsEvaluator;
import sourcefu.VBA.partialevaluator.VBAExprEvaluator;
import sourcefu.lib.CtxValue;
import sourcefu.lib.ProxyParseTreeListener;
/*
 * this class is responsible for the whole dispatch and actions from options given on commandline
 */
public class VBAMain {
	//class variables for multipass
	Integer numberModifications;
	boolean doWork=true;
	
	
	
	private boolean doBeautify = false;
	//private String indent = "  "; TODO:later
	private boolean doComments = false;
	private boolean doDeadStore = false;
	private boolean doEmpty = false;
	private boolean doRename = false;
	private boolean doShow = false;
	private boolean doConstantsModify = false;
	private boolean doPartialEval = false;
	
	//variables holding the source
	String initial_data; //original source
	private Integer verbosityLevel=0;
	String temp_data=null; //source while deobfuscated
	String final_data; //source at the end of operations
	
	public VBAMain(boolean doBeautify, boolean doComments, boolean doDeadStore, boolean doEmpty, boolean doRename, boolean doConstantsModify, boolean doPartialEval, String inputFile, boolean doShow,  Integer verbosityLevel) {
		this.doBeautify = doBeautify;
		this.doComments = doComments;
		this.doDeadStore = doDeadStore;
		this.doEmpty = doEmpty;
		this.doRename = doRename;
		this.doShow = doShow;
		this.doConstantsModify = doConstantsModify;
		this.doPartialEval = doPartialEval;
		this.verbosityLevel=verbosityLevel;
		
		try {
			 byte[] file_contents = Files.readAllBytes(Paths.get(inputFile));
			 this.initial_data = new String(file_contents);
		}catch(Exception e){
			System.out.println("cannot get input");
		}
	}
	
	public VBAMain(String inputData) {
		this.initial_data = inputData;
	}
	
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
	
	//the following function is in fact really used for debug
	public void showTree() {
		if (doShow) {
			CharStream input = getCharStreamFromData(this.temp_data);
			CommonTokenStream tokens = generateTokens(input);
			VBAParser parser = new VBAParser(tokens);
			ParseTree tree = parser.startRule();
			TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
			viewr.open();
		}
	}
	//the actual function doing smthing
	public void run() {
		
		//ParseTree tree = generateTree(this.input);
		
		if((this.doBeautify || this.doComments ||                       //in the case no options are selected, that means that
				this.doDeadStore || this.doEmpty || this.doRename || 
				this.doConstantsModify || this.doPartialEval)      //a full analysis should be conducted. so each one of those
				== false) { 											//is reverted
			this.doBeautify = true;
			this.doComments = true;
			this.doDeadStore = true;
			this.doEmpty = true;
			this.doRename = true;
			this.doConstantsModify = true;
			this.doPartialEval = true;
		}
		
		/*
		 * in the following, the algorithm is the following
		 * 1) erase useless things like empty and comments
		 * 2) do constants modifier
		 * 3) do the deadstore
		 * 4) do the rename
		 * 5) do the beautify
		 */
		if(this.doComments) {
			CharStream input = getCharStreamFromData(this.initial_data);
			CommonTokenStream tokens = generateTokens(input);
			ParseTree tree = generateTree(tokens);
			
			ParseTreeWalker walker = new ParseTreeWalker();
			VBACommentsDeleter comm_deleter = new VBACommentsDeleter(tokens);
			walker.walk(comm_deleter, tree);
			this.temp_data = comm_deleter.getdata();
		}
		
		showTree();
		if(this.temp_data==null) {
			this.temp_data = this.initial_data;
		}
		
		if(this.doConstantsModify) {
			CharStream input = getCharStreamFromData(this.temp_data);
			CommonTokenStream tokens = generateTokens(input);
			ParseTree tree = generateTree(tokens);
			ParseTreeWalker walker = new ParseTreeWalker();
			VBAConstantsModifier consmodifier = new VBAConstantsModifier(tokens);
			walker.walk(consmodifier, tree);
			this.temp_data = consmodifier.getdata();
		}
		
		if(this.temp_data==null) {
			this.temp_data = this.initial_data;
		}
		
		while (this.doWork) { //multipass
			this.numberModifications=0;
			if(this.doEmpty) {
				CharStream input = getCharStreamFromData(this.temp_data);
				CommonTokenStream tokens = generateTokens(input);
				ParseTree tree = generateTree(tokens);
				ParseTreeWalker walker = new ParseTreeWalker();
				VBAEmptyBlockRemover emptier = new VBAEmptyBlockRemover(tokens);
				walker.walk(emptier, tree);
				this.temp_data = emptier.getdata();
				this.numberModifications+=emptier.getNumberModifications();
			}
			
			if(this.temp_data==null) {
				this.temp_data = this.initial_data;
			}
			
			if(this.doDeadStore) {
				CharStream input = getCharStreamFromData(this.temp_data);
				CommonTokenStream tokens = generateTokens(input);
				ParseTree tree = generateTree(tokens);
				ParseTreeWalker walker = new ParseTreeWalker();
				VBADeadStore deadstorer = new VBADeadStore(tokens);
				walker.walk(deadstorer, tree);
				deadstorer.deadstore();
				this.temp_data = deadstorer.getdata();
				this.numberModifications+=deadstorer.getNumberModifications();
			}
			
			if(this.temp_data==null) {
				this.temp_data = this.initial_data;
			}
			
			if(this.doDeadStore) { //TODO:change
				CharStream input = getCharStreamFromData(this.temp_data);
				CommonTokenStream tokens = generateTokens(input);
				ParseTree tree = generateTree(tokens);
				ParseTreeWalker walker = new ParseTreeWalker();
				VBAIFStmtSimplifier ifsimplifier = new VBAIFStmtSimplifier(tokens);
				walker.walk(ifsimplifier, tree);
				this.temp_data = ifsimplifier.getdata();
				this.numberModifications+=ifsimplifier.getNumberModifications();
			}
			
			if(this.temp_data==null) {
				this.temp_data = this.initial_data;
			}
			
			if(this.doPartialEval) { //actually to avoid having a too big class realizing partial evaluations, we use a generic class using the proxyparsetreelistener that can run multiple listeners in parallel
				CharStream input = getCharStreamFromData(this.temp_data);
				//System.out.println("*************");
				//System.out.println(this.temp_data);
				//System.out.println("#####################");
				CommonTokenStream tokens = generateTokens(input);
				ParseTree tree = generateTree(tokens);
				VBAPartialEvaluator partialEval = new VBAPartialEvaluator(tree, tokens);
				partialEval.partialeval();
				this.temp_data = partialEval.getdata();
				//this.temp_data = partialEval.getdata();
				this.numberModifications+=partialEval.getNumberModifications();
			}
			
			if(this.temp_data==null) {
				this.temp_data = this.initial_data;
			}
			
			//check for end of loop
			if(this.numberModifications==0) {
				this.doWork = false;
			}
			
			if(this.verbosityLevel>0) {
				System.out.println("=============="); //TODO: better output
				System.out.println(this.temp_data);
			}
		}
		
		if(this.doRename) {
			CharStream input = getCharStreamFromData(this.temp_data);
			CommonTokenStream tokens = generateTokens(input);
			ParseTree tree = generateTree(tokens);
			ParseTreeWalker walker = new ParseTreeWalker();
			VBARenamer renamer = new VBARenamer(tokens);
			walker.walk(renamer, tree);
			renamer.rename();
			this.temp_data = renamer.getdata();
		}
		
		if(this.temp_data==null) {
			this.temp_data = this.initial_data;
		}
		
		if(this.doBeautify) {
			CharStream input = getCharStreamFromData(this.temp_data);
			CommonTokenStream tokens = generateTokens(input);
			ParseTree tree = generateTree(tokens);
			ParseTreeWalker walker = new ParseTreeWalker();
			VBABeautifier beautifier = new VBABeautifier(tokens);
			walker.walk(beautifier, tree);
			this.temp_data = beautifier.getdata();
		}
		this.final_data = this.temp_data;
	}
	
	public String getdata() {
		return this.final_data;
	}
	
	public String getinitdata() {
		return this.initial_data;
	}

}
