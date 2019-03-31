package sourcefu.JS.helpers;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    Scope enclosingScope; // null if global (outermost) scope
    String name;
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public Scope(Scope enclosingScope) { this.enclosingScope = enclosingScope;  }
    public Scope(Scope enclosingScope, String name) { this(enclosingScope); this.name = name; }
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Symbol> getSymbols() {
		return symbols;
	}
	public void setSymbols(Map<String, Symbol> symbols) {
		this.symbols = symbols;
	}
	public void define(Symbol sym) {
        symbols.put(sym.name, sym);
    }

    public Scope getEnclosingScope() { return enclosingScope; }

	public void resolveAndAddIndex(String text, int index, String altname) {
		Symbol s = symbols.get(text);
        if ( s!=null ) {
        	s.addIndex(index);
        	define(s);
        	return;
        }
        
        // if not here, check any enclosing scope
        if ( enclosingScope != null ) {
        	enclosingScope.resolveAndAddIndex(text, index, altname);
        	return;
        }
        
        if (enclosingScope == null) { //we are at the global point so define
        	Symbol sym = new Symbol(text, index, altname);
        	define(sym);
        }
        
	}
}
