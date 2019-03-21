package sourcefu.VBA.helpers;

public class LocalScope extends BaseScope {
    public LocalScope(Scope parent) { super(parent); }
    public String getScopeName() { return "locals"; }
	@Override
	public boolean checkSymbolAdd(Symbol sym) {
		return true;
	}
}
