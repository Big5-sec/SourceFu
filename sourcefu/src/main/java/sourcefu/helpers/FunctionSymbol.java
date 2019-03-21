package sourcefu.helpers;

import java.util.LinkedHashMap;
import java.util.Map;

import sourcefu.VBA.helpers.Scope;
import sourcefu.VBA.helpers.Symbol;

public class FunctionSymbol extends Symbol implements Scope {

	public FunctionSymbol(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
//    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();
//    Scope enclosingScope;
//
//    public FunctionSymbol(String name, Integer index, Scope enclosingScope) {
//        super(name, index);
//        this.enclosingScope = enclosingScope;
//    }
//
//    public Symbol resolve(String name) {
//        Symbol s = arguments.get(name);
//        if ( s!=null ) return s;
//        // if not here, check any enclosing scope
//        if ( getEnclosingScope() != null ) {
//            return getEnclosingScope().resolve(name);
//        }
//        return null; // not found
//    }
//
//    public boolean checkSymbolAdd(Symbol sym) {
//    	if ( sym.name.equals(this.name)) { //is the identifier the function name?
//    		return false;
//    	}
//    	
//    	if (arguments.containsKey(sym.name)) {
//    		for(Map.Entry<String, Symbol> entry:arguments.entrySet()) {
//    			if((entry.getKey().equals(sym.name))&&(entry.getValue().index.equals(sym.index))) {
//    				return false;
//    			}
//    		}
//    	}
//    	return true;
//    }
//    
//    public void define(Symbol sym) {
//        symbols.put(sym.name, sym);
//        sym.scope = this; // track the scope in each symbol
//    }
//    
//    public void defineArgs(Symbol sym) {
//        arguments.put(sym.name, sym);
//        sym.scope = this; // track the scope in each symbol
//    }
//
//    public Scope getEnclosingScope() { return enclosingScope; }
//    public String getScopeName() { return name; }
//
//    public String toString() { return "function"+super.toString()+":"+arguments.values()+":"+symbols.values(); }
//    
	@Override
	public String getScopeName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scope getEnclosingScope() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void define(Symbol sym) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Symbol resolve(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkSymbolAdd(Symbol sym) {
		// TODO Auto-generated method stub
		return false;
	}
}
