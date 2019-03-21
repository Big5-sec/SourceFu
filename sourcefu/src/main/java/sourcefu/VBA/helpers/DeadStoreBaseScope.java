package sourcefu.VBA.helpers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeadStoreBaseScope {
	
	Map<String, ArrayList<DeadStoreStatement>> defs = new LinkedHashMap<String, ArrayList<DeadStoreStatement>>();
	
	public Map<String, ArrayList<DeadStoreStatement>> getDefs() {
		return defs;
	}
	
	public void addDefs(DeadStoreStatement def) {
		if(this.defs.containsKey(def.varName)) {
			ArrayList<DeadStoreStatement> actual_stmts = this.defs.get(def.varName);
			actual_stmts.add(def);
			this.defs.put(def.varName, actual_stmts);
		}else { //our map do not contain the object, create a new object with its statements
			ArrayList<DeadStoreStatement> stmts = new ArrayList<DeadStoreStatement>();
			stmts.add(def);
			this.defs.put(def.varName,stmts);
		}
	}
	
	public boolean checkInDefs(String name) {
		if (this.defs.containsKey(name)) {
			return true; 
		}
		return false;
	}
	
	public DeadStoreStatement getDefByName(String name) {
		return this.defs.get(name).get(this.defs.get(name).size()-1); //we always return the last member
	}
	
	public void setUsed(String name) {
		DeadStoreStatement stmt = getDefByName(name);
		stmt.setToErase(false);
		this.defs.get(name).set(this.defs.get(name).size()-1, stmt);
	}
}
