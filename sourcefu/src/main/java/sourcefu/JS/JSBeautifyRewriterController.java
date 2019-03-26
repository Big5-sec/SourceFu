package sourcefu.JS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import sourcefu.VBA.helpers.DeadStoreStatement;
import sourcefu.VBA.partialevaluator.RewriteOperation;

public class JSBeautifyRewriterController {
	Map<Integer, String> operations = new HashMap<Integer, String>();
	
	public void addRewriteOperation(JSBeautifyRewriteOperation op) {
		if(this.operations.containsKey(op.index)) {
			String currentReplacement = this.operations.get(op.index);
			String myReplacement = currentReplacement + op.replacement;
			this.operations.put(op.index, myReplacement);
		}else { //our map do not contain the object, create a new object with its statements
			this.operations.put(op.index, op.replacement);
		}
	}

	public Map<Integer, String> getOperations() {
		return operations;
	}
	
}
