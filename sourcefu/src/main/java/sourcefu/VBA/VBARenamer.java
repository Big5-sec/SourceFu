package sourcefu.VBA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;
import sourcefu.VBA.helpers.GlobalScope;
import sourcefu.VBA.helpers.KnownSymbols;
import sourcefu.VBA.helpers.Scope;
import sourcefu.VBA.helpers.Symbol;
import sourcefu.VBA.helpers.VariableSymbol;
import sourcefu.VBA.helpers.FunctionSymbol;

public class VBARenamer extends VBAParserBaseListener{
	
	TokenStreamRewriter rewriter;
	GlobalScope globals;
	List<FunctionSymbol> Subs = new ArrayList<FunctionSymbol>();
	List<FunctionSymbol> Functions = new ArrayList<FunctionSymbol>();
	Integer currentSubIndex=0;
	Integer currentFunctionIndex=0;
	Integer currentLocalIndex=0;
	Integer currentArgIndex=0;
	Scope currentScope;
	
	List<String> knownSymbols = new KnownSymbols().getsymbols();
	
	public VBARenamer(CommonTokenStream tokens) {
		rewriter=new TokenStreamRewriter(tokens);
	}

	public void enterStartRule(VBAParser.StartRuleContext ctx) { 
		globals = new GlobalScope(null);
		currentScope = globals;
	}

	public void enterFunctionStmt(VBAParser.FunctionStmtContext ctx) { 
		String name = ctx.functionName().getText();
		FunctionSymbol function = new FunctionSymbol(name, ctx.functionName().start.getTokenIndex(), globals, "Function_"+String.valueOf(this.currentFunctionIndex));
		this.currentFunctionIndex++;
		if(this.knownSymbols.contains(name)) {
			this.currentFunctionIndex--;
		}
		for(int i=0;i<ctx.argList().arg().size();i++) {
			VariableSymbol arg= new VariableSymbol(ctx.argList().arg(i).unrestrictedIdentifier().getText(),ctx.argList().arg(i).unrestrictedIdentifier().start.getTokenIndex());
			function.defineArgs(arg);
		}
		this.Functions.add(function);
		this.currentScope.define(function);
		this.currentScope = function;
	}
	
	public void exitFunctionStmt(VBAParser.FunctionStmtContext ctx) { 
		this.currentScope = this.globals;
	}
	
	public void enterSubStmt(VBAParser.SubStmtContext ctx) { 
		String name = ctx.subroutineName().getText();
		FunctionSymbol sub = new FunctionSymbol(name, ctx.subroutineName().start.getTokenIndex(), globals, "Sub_"+String.valueOf(this.currentSubIndex));
		this.currentSubIndex++;
		if(this.knownSymbols.contains(name)) {
			this.currentSubIndex--;
		}
		for(int i=0;i<ctx.argList().arg().size();i++) {
			VariableSymbol arg= new VariableSymbol(ctx.argList().arg(i).unrestrictedIdentifier().getText(),ctx.argList().arg(i).unrestrictedIdentifier().start.getTokenIndex());
			sub.defineArgs(arg);
		}
		this.Subs.add(sub);
		this.currentScope.define(sub);
		this.currentScope = sub;
	}
	
	public void exitSubStmt(VBAParser.SubStmtContext ctx) { 
		this.currentScope = this.globals;
	}
	
	public void exitIdentifier(VBAParser.IdentifierContext ctx) {
		boolean checkFunction = false;
		
		if(ctx.untypedIdentifier()!=null) {
			if (ctx.untypedIdentifier().identifierValue().keyword()!=null) {
				return;
			}
		}else {
			if(ctx.typedIdentifier().untypedIdentifier().identifierValue().keyword()!=null) {
				return;
			}
		}
		//System.out.println(ctx.getText());
		//System.out.println(ctx.getParent().getClass());
		//System.out.println(ctx.getParent().getParent().getClass());
		if(ctx.getParent() instanceof VBAParser.UnrestrictedIdentifierContext && ctx.getParent().getParent() instanceof VBAParser.MemberAccessExprContext) {
			return; //avoid renaming object access
		}
		
		if(ctx.getParent().getParent() instanceof VBAParser.IndexExprContext) { //avoid renaming unknown functions in case of Func(arg)
			checkFunction = true;
		}
		
		//avoid renaming for call stmt when func name is unknown
		if(ctx.getParent() instanceof VBAParser.SimpleNameExprContext && ctx.getParent().getParent() instanceof VBAParser.CallStmtContext) {
			checkFunction = true;
		}
		
    	VariableSymbol var = new VariableSymbol(ctx.getText(), ctx.start.getTokenIndex(), checkFunction);
    	currentScope.define(var);	
	}
	
	public void rename() {
		for(Iterator<FunctionSymbol> it=this.Functions.iterator();it.hasNext();) {
			funcRenamer(it.next(), this.rewriter);
		}
		for(Iterator<FunctionSymbol> it=this.Subs.iterator();it.hasNext();) {
			funcRenamer(it.next(), rewriter);
		}
		globalsRenamer(globals, rewriter);
	}
	
	public void globalsRenamer(GlobalScope globals,TokenStreamRewriter rewriter) {
		Set<Entry<String, Symbol>> setSym = globals.getSymbols().entrySet();
	      Iterator<Entry<String, Symbol>> it = setSym.iterator();
	      while(it.hasNext()){
	         Entry<String, Symbol> e = it.next();
	         if (e.getValue().getAltname()!=null) {
	        	 if(this.knownSymbols.contains(e.getKey())) {
	        		 continue;
	        	 }
	        	 for(int i=0;i<e.getValue().getIndex().size();i++) {
		        	 rewriter.replace(e.getValue().getIndex().get(i), e.getValue().getAltname());
		         } 
	         }
	      }

	}
	
	public void funcRenamer(FunctionSymbol function, TokenStreamRewriter rewriter) {
		this.currentLocalIndex=0;
		Set<Entry<String, Symbol>> setSym = function.getLocals().entrySet();
	      Iterator<Entry<String, Symbol>> it = setSym.iterator();
	      while(it.hasNext()){
	    	 String newname;
	         Entry<String, Symbol> e = it.next();
	         if(this.knownSymbols.contains(e.getKey())) {
        		 continue;
        	 }
	         if(this.globals.resolve(e.getKey())!=null){
	        	  newname = this.globals.resolve(e.getKey()).getAltname();
	         }else {
	        	 if(e.getValue().getisFuncCall()) {
	        		 continue;
	        	 }
	        	 newname = "local_"+String.valueOf(this.currentLocalIndex);
	         }
	         for(int i=0;i<e.getValue().getIndex().size();i++) {
	        	 rewriter.replace(e.getValue().getIndex().get(i), newname);
	         }
	         this.currentLocalIndex++;
	      }
	      
	   this.currentArgIndex=0;
	   Set<Entry<String, Symbol>> setArgs = function.getArguments().entrySet();
	      Iterator<Entry<String, Symbol>> it2 = setArgs.iterator();
	      while(it2.hasNext()){
	         Entry<String, Symbol> e = it2.next();
	         String newname = "arg_"+String.valueOf(this.currentArgIndex);
	         for(int i=0;i<e.getValue().getIndex().size();i++) {
	        	 rewriter.replace(e.getValue().getIndex().get(i), newname);
	        	 //rewriter.getText();
	         }
	         this.currentArgIndex++;
	      }
	}
	
	public String getdata() {
		return rewriter.getText();
	}
}
