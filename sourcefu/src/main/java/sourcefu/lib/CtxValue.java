package sourcefu.lib;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class CtxValue {
	ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();
	
	public CtxValue() {
		
	}

	public void setValue(ParseTree node, Object value) { values.put(node, value); }
	
	public void setValueNumber(ParseTree node, Number value) {
		if (value instanceof Integer) {
			values.put(node, (Integer)value);
		}
		else if (value instanceof Float) {
			values.put(node, (Float)value);
		}
		else if (value instanceof Double) {
			values.put(node, (Double)value);
		}
		else if (value instanceof Long) {
			values.put(node, (Long)value);
		}
		else {
			throw new RuntimeException("trying to add two things not in range");
		}
		 
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getValue(ParseTree node) { 
		return (T)values.get(node);
	}
	
}
