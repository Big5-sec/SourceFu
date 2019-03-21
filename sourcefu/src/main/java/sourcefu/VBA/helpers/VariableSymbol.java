package sourcefu.VBA.helpers;

public class VariableSymbol extends Symbol {
    public VariableSymbol(String name, Integer index) { super(name, index); }

	public VariableSymbol(String name, Integer index, String altname) {
		super(name, index, altname);
		// TODO Auto-generated constructor stub
	}
	
	public VariableSymbol(String name, Integer index, String altname, boolean isFuncCall) {
		super(name,index,altname,isFuncCall);
	}

	public VariableSymbol(String name, Integer index,boolean isFuncCall) { 
		super(name, index, isFuncCall); 
	}
	
	public VariableSymbol(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
