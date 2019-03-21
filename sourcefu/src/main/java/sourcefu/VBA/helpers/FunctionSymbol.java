package sourcefu.VBA.helpers;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {
    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    public Map<String, Symbol> getArguments() {
		return arguments;
	}

	public void setArguments(Map<String, Symbol> arguments) {
		this.arguments = arguments;
	}

	Map<String, Symbol> locals = new LinkedHashMap<String, Symbol>();
    public Map<String, Symbol> getLocals() {
		return locals;
	}

	public void setLocals(Map<String, Symbol> locals) {
		this.locals = locals;
	}

	GlobalScope globalScope;

    public FunctionSymbol(String name, Integer index, GlobalScope globalScope) {
        super(name, index);
        this.globalScope = globalScope;
    }
    
    public FunctionSymbol(String name, Integer index, GlobalScope globalScope,String altname) {
        this(name,index,globalScope);
        this.altname=altname;
    }


    public boolean checkArg(Symbol s) {
        if(arguments.containsKey(s.name)) {
        	return true;
        }
        return false;
    }
    
    public boolean checkLocal(Symbol s) {
        if(locals.containsKey(s.name)) {
        	return true;
        }
        return false;
    }
    
    public Symbol checkGlobal(Symbol s) {
        Symbol checkMe = globalScope.resolve(s.name);
        return checkMe;
    }

    public boolean checkSymbolAdd(Symbol sym) {
    	if ( sym.name.equals(this.name) && sym.index.equals(this.index)) { //is the identifier the function name?
    		return false;
    	}
    	
    	if (arguments.containsKey(sym.name)) {
    		for(Map.Entry<String, Symbol> entry:arguments.entrySet()) {
    			if((entry.getKey().equals(sym.name))&&(entry.getValue().index.equals(sym.index))) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    public void define(Symbol sym) {
    	if (!checkSymbolAdd(sym)) {
    			return;
		}
    	
    	if (checkArg(sym)) {
    		arguments.get(sym.name).addIndex(sym.index.get(0));
    	}else if(checkLocal(sym)) {
    		locals.get(sym.name).addIndex(sym.index.get(0));
    	}else if(checkGlobal(sym)!=null) {
            globalScope.symbols.get(sym.name).addIndex(sym.index.get(0));
    	}else {
    		locals.put(sym.name, sym);
    	}
    }
    
    public void defineArgs(Symbol sym) {
        arguments.put(sym.name, sym);
    }

    public Scope getEnclosingScope() { return globalScope; }
    public String getScopeName() { return name; }

    public String toString() { return "function"+super.toString()+":"+arguments.values()+":"+locals.values(); }

	@Override
	public Symbol resolve(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
