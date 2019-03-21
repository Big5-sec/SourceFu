package sourcefu.VBA.helpers;

import java.util.ArrayList;

public class ConstantFoldingFunction extends ConstantFoldingBaseScope{
	String name;
	ArrayList<String> arguments = new ArrayList<String>();
	
	public ConstantFoldingFunction(String name) {
		this.name=name;
	}
	
	public void addArgument(String argname) {
		this.arguments.add(argname);
	}

	public boolean checkInArgs(String name) {
		if (this.arguments.contains(name)) {
			return true; 
		} 
		return false;
	}

	public String getName() {
		return name;
	}
}
