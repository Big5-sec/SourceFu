package sourcefu.VBA;

import java.util.ArrayList;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParser.SimpleNameExprContext;
import sourcefu.VBA.antlr.VBAParserBaseListener;
import sourcefu.VBA.helpers.DeadStoreBaseScope;
import sourcefu.VBA.helpers.DeadStoreFunction;
import sourcefu.VBA.helpers.DeadStoreStatement;

//TODO: check for global variables
/* algorithm explanation
 * =====================
 * 
 * this class constructs the deadstore of a vba script, i.e. is able to construct the definitions to be removed.
 * 
 *  1) when the script is parsed, 3 different definitions can be encountered :
 *  - dim declarations
 *  - const declarations
 *  - implicit declarations like "X = 2"
 *  
 *  When encountering the first one, a deadstore stmt (basically, start, stop and variable name) is created and added to the current scope.
 *  Same for second one.
 *  For the third one, we have to make sure that we do not call a function for now (cause deadstore is not able to handle that). If it's not the case, then the statement is constructed.
 *  to add a statement, we check if a definition already exists, if so, we create a second definition. Indeed, if not use is detected in between, first declaration can be erased.
 *  
 *  2) when parsing the script, an identifier is encountered:
 *  - zero check it's not function's name
 *  - first check it's not the one of an actual definition
 *  - second check it's not a definition like X=X+1
 *  - if at this step, that means the symbol is encountered at a further step later than definition, and so it's used. update so def to say, it's not to delete.
 *  
 *  3) delete defs that are marked "to delete"
 *  
 */
public class VBADeadStore extends VBAParserBaseListener{
	
	TokenStreamRewriter rewriter;
	CommonTokenStream tokens;
	DeadStoreBaseScope global;
	ArrayList<DeadStoreFunction> Subs = new ArrayList<DeadStoreFunction>();
	ArrayList<DeadStoreFunction> Functions = new ArrayList<DeadStoreFunction>();
	Integer currentSubIndex=0;
	Integer currentFunctionIndex=0;
	DeadStoreBaseScope currentScope;
	Integer numberModifications=0;
	Boolean inloop = false;
	
	public VBADeadStore(CommonTokenStream tokens) {
		this.tokens=tokens;
		rewriter=new TokenStreamRewriter(tokens);
	}
	
	public void enterStartRule(VBAParser.StartRuleContext ctx) { 
		global = new DeadStoreBaseScope();
	}

	public void enterFunctionStmt(VBAParser.FunctionStmtContext ctx) { 
		String name = ctx.functionName().getText();
		DeadStoreFunction function = new DeadStoreFunction(name);
		for(int i=0;i<ctx.argList().arg().size();i++) {
			function.addArgument(ctx.argList().arg(i).unrestrictedIdentifier().getText());
		}
		this.Functions.add(function);
		this.currentScope = function;
	}
	
	public void exitFunctionStmt(VBAParser.FunctionStmtContext ctx) { 
		this.currentScope = this.global;
	}
	
	public void enterSubStmt(VBAParser.SubStmtContext ctx) { 
		String name = ctx.subroutineName().getText();
		DeadStoreFunction sub = new DeadStoreFunction(name);
		for(int i=0;i<ctx.argList().arg().size();i++) {
			sub.addArgument(ctx.argList().arg(i).unrestrictedIdentifier().getText());
		}
		this.Subs.add(sub);
		this.currentScope = sub;
	}
	
	public void exitSubStmt(VBAParser.SubStmtContext ctx) { 
		this.currentScope = this.global;
	}
	//TODO: avoid typehint on identifiers
	public void exitVariableSubStmt(VBAParser.VariableSubStmtContext ctx) {
		String name = ctx.identifier().getText();
		Integer start = ctx.getParent().getParent().start.getTokenIndex();
		Integer stop = ctx.getParent().getParent().stop.getTokenIndex();
		Integer varNameTokenIndex = ctx.identifier().start.getTokenIndex();
		DeadStoreStatement def = new DeadStoreStatement(start,stop,name,varNameTokenIndex);
		this.currentScope.addDefs(def);
	}
	
	public void exitConstSubStmt(VBAParser.ConstSubStmtContext ctx) { 
		String name = ctx.identifier().getText();
		Integer start = ctx.getParent().start.getTokenIndex();
		Integer stop = ctx.getParent().stop.getTokenIndex();
		Integer varNameTokenIndex = ctx.identifier().start.getTokenIndex();
		DeadStoreStatement def = new DeadStoreStatement(start,stop,name,varNameTokenIndex);
		this.currentScope.addDefs(def);
	}
	
	public void exitLetStmt(VBAParser.LetStmtContext ctx) {
		if(ctx.lExpression() instanceof VBAParser.SimpleNameExprContext) { //check that our lexpression is an identifier basically
			if(ctx.expression() instanceof VBAParser.LExprContext) {
				return;
			}
			VBAParser.SimpleNameExprContext new_ctx = (SimpleNameExprContext) ctx.lExpression();
			String name = new_ctx.identifier().getText();
			//if (!this.currentScope.checkInDefs(name)) { //TODO: wrong multiple def can be possible
				
				if(this.currentScope instanceof DeadStoreFunction) {
					DeadStoreFunction temp = (DeadStoreFunction) this.currentScope;
					
					if(name.equals(temp.getName())) {
						//System.out.println("func name!");
						return;
					}
					
					
					if(!temp.checkInArgs(name)) {
						Integer start = ctx.getParent().start.getTokenIndex();
						Integer stop = ctx.getParent().stop.getTokenIndex();
						Integer varNameTokenIndex = new_ctx.identifier().start.getTokenIndex();
						DeadStoreStatement def = new DeadStoreStatement(start,stop,name,varNameTokenIndex);
						this.currentScope.addDefs(def);						
					}
				}
				else {
					Integer start = ctx.getParent().start.getTokenIndex();
					Integer stop = ctx.getParent().stop.getTokenIndex();
					Integer varNameTokenIndex = new_ctx.identifier().start.getTokenIndex();
					DeadStoreStatement def = new DeadStoreStatement(start,stop,name,varNameTokenIndex);
					this.currentScope.addDefs(def);
				}

			//}
		}
		//TODO: treat other letstmt??
	}
	
	public void exitIdentifier(VBAParser.IdentifierContext ctx) {
		//avoid the case where identifier is function/sub name
		//System.out.println("new identifier : " + ctx.getText());
		if (this.currentScope instanceof DeadStoreFunction) {
			DeadStoreFunction temp = (DeadStoreFunction) this.currentScope;
			if(temp.getName().equals(ctx.getText())) {
				//System.out.println("func/sub name!");
				return;
			}
		}
		
		if(this.currentScope.checkInDefs(ctx.getText())) { //if the identifier is not in def, don't care 
			//checking 1) is the identifier the lexpression of one of our defs?, 2) if we are in the def, like X=X+1
			if(this.currentScope.getDefByName(ctx.getText()).getVarNameTokenIndex().equals(ctx.start.getTokenIndex())) {
				//System.out.println("def lexpression!");
				return;
			}
			
			//2)basically, defs like X = X+1 should be ignored unless we are in a loop
			if((!(this.inloop)) && (this.currentScope.getDefByName(ctx.getText()).getStmtStop() > ctx.stop.getTokenIndex())) {
				//System.out.println("definition like X=X+1 and not in loop");
				return;
			}
						
			//otherwise variable is used
			this.currentScope.setUsed(ctx.getText());
		}
	}

	/*
	 * the following functions permits to check if we are in loop for identifier use
	 */
	public void enterDoLoopStmt(VBAParser.DoLoopStmtContext ctx) { 
		this.inloop = true;
	}
	
	public void exitDoLoopStmt(VBAParser.DoLoopStmtContext ctx) { 
		this.inloop = false;
	}
	
	public void enterForEachStmt(VBAParser.ForEachStmtContext ctx) { 
		this.inloop = true;
	} 
	
	public void exitForEachStmt(VBAParser.ForEachStmtContext ctx) { 
		this.inloop = false;
	} 
	
	public void enterForNextStmt(VBAParser.ForNextStmtContext ctx) { 
		this.inloop = true;
	}
	
	public void exitForNextStmt(VBAParser.ForNextStmtContext ctx) { 
		this.inloop = false;
	}
	
	public void enterWhileWendStmt(VBAParser.WhileWendStmtContext ctx) { 
		this.inloop = true;
	}
	
	public void exitWhileWendStmt(VBAParser.WhileWendStmtContext ctx) { 
		this.inloop = false;
	}
	
	//TODO: we should not delete a dim definition if the next one is a letstmt one. Should include an enum in deadstorestmt
	public void deadstore() {
		for(int i=0;i<this.Subs.size();i++) {
			ArrayList<ArrayList<DeadStoreStatement>> l = new ArrayList(this.Subs.get(i).getDefs().values()); //yeah i'm used to C
			for(int j=0;j<this.Subs.get(i).getDefs().size();j++) {
				for(int k=0;k<l.get(j).size();k++) {
					if(l.get(j).get(k).getToErase()) {
						this.rewriter.delete(l.get(j).get(k).getStmtStart()-1, l.get(j).get(k).getStmtStop());
						this.numberModifications+=1;
						this.rewriter.getText();
					}
				}
			}
		}
		for(int i=0;i<this.Functions.size();i++) {
			ArrayList<ArrayList<DeadStoreStatement>> l = new ArrayList(this.Functions.get(i).getDefs().values()); 
			//System.out.println(l);
			for(int j=0;j<this.Functions.get(i).getDefs().size();j++) {
				for(int k=0;k<l.get(j).size();k++) {
					if(l.get(j).get(k).getToErase()) {
						this.rewriter.delete(l.get(j).get(k).getStmtStart()-1, l.get(j).get(k).getStmtStop());
						this.numberModifications+=1;
						this.rewriter.getText();
					}
				}
			}
		}
		//TODO: global variables, need to modify algorithm
	}
	
	
	public String getdata() {
		return rewriter.getText();
	}
	
	public Integer getNumberModifications() {
		return this.numberModifications;
	}
}