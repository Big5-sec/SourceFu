package sourcefu.helpers;

public class ArithmeticHelper {

	public static Number unaryMinusNumber(Number a) {
		if (a instanceof Integer) {
			return (-1 * a.intValue());
		}else if (a instanceof Float) {
			return (-1* a.floatValue());
		}else if (a instanceof Long) {
			return (-1 * a.longValue());
		}else if (a instanceof Double) {
			return (-1 * a.doubleValue());
		}else {
			throw new RuntimeException("unable to calculate the unaryMinuxNumber");
		}
	}
	
}
