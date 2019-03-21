package sourcefu.VBA.helpers;

import java.util.LinkedHashMap;
import java.util.Map;

public class GlobalScope extends BaseScope {
	
	public GlobalScope(Scope enclosingScope) { super(enclosingScope); }
    public String getScopeName() { return "globals"; }
    
    public Map<String, Symbol> getSymbols() {
    	return this.symbols;
    }
    
	@Override
	public boolean checkSymbolAdd(Symbol sym) {
		return true;
	}
}
