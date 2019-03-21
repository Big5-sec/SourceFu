package sourcefu.VBA.helpers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeadStoreFunction extends DeadStoreBaseScope{
	String name;
	ArrayList<String> arguments = new ArrayList<String>();
	
	public DeadStoreFunction(String name) {
		this.name=name;
	}
	
	public void addArgument(String argname) {
		this.arguments.add(argname);
	}

	public boolean checkInDefs(String name) {
		if (this.defs.containsKey(name)) {
			return true; 
		} 
		return false;
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
