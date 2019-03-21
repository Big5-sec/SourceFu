package sourcefu.VBA.helpers;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConstantFoldingBaseScope {
	Map<String, Object> variables = new LinkedHashMap<String, Object>();
	
	public void addVariable(String varName, Object varValue) {
			this.variables.put(varName, varValue);
	}
	
	public Object getVariableValue(String varName) {
		return this.variables.get(varName);
	}
	
	public Boolean checkInVariables(String varName) {
		return this.variables.containsKey(varName);
	}
}

