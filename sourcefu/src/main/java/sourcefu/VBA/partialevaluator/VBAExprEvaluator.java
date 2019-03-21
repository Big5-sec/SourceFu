package sourcefu.VBA.partialevaluator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;
import sourcefu.VBA.helpers.Symbol;
import sourcefu.helpers.ArithmeticHelper;
import sourcefu.helpers.Undefined;
import sourcefu.lib.CtxValue;
import sourcefu.lib.UnEscape;


/*
 * This class aims at implementing the simplification of the following part of the grammar :
 * 
 * 	expression :
    // Literal Expression has to come before lExpression, otherwise it'll be classified as simple name expression instead.
    whiteSpace? LPAREN whiteSpace? expression whiteSpace? RPAREN                                    # parenthesizedExpr
    | TYPEOF whiteSpace expression                                                                  # typeofexpr // To make the grammar SLL, the type-of-is-expression is actually the child of an IS relational op.
    | HASH expression                                                                               # markedFileNumberExpr // Added to support special forms such as Input(file1, #file1)
    | NEW whiteSpace expression                                                                     # newExpr
    | expression whiteSpace? POW whiteSpace? expression                                             # powOp
    | MINUS whiteSpace? expression                                                                  # unaryMinusOp
    | expression whiteSpace? (MULT | DIV) whiteSpace? expression                                    # multOp
    | expression whiteSpace? INTDIV whiteSpace? expression                                          # intDivOp
    | expression whiteSpace? MOD whiteSpace? expression                                             # modOp
    | expression whiteSpace? (PLUS | MINUS) whiteSpace? expression                                  # addOp
    | expression whiteSpace? AMPERSAND whiteSpace? expression                                       # concatOp
    | expression whiteSpace? (EQ | NEQ | LT | GT | LEQ | GEQ | LIKE | IS) whiteSpace? expression    # relationalOp
    | NOT whiteSpace? expression                                                                    # logicalNotOp
    | expression whiteSpace? AND whiteSpace? expression                                             # logicalAndOp
    | expression whiteSpace? OR whiteSpace? expression                                              # logicalOrOp
    | expression whiteSpace? XOR whiteSpace? expression                                             # logicalXorOp
    | expression whiteSpace? EQV whiteSpace? expression                                             # logicalEqvOp
    | expression whiteSpace? IMP whiteSpace? expression                                             # logicalImpOp
    | literalExpression                                                                             # literalExpr
    | lExpression                                                                                   # lExpr
    | builtInType                                                                                   # builtInTypeExpr
;

The idea is basically to supplement every operation by the associated value, and to set nodes values as such

ex : ((2+3)+4) -> (5+4) -> (9) -> 9

 */
public class VBAExprEvaluator extends VBAParserBaseListener {
	TokenStreamRewriter rewriter;
	Integer NumberModifications=0;
	CtxValue ctxvalue;
	Map<Token, RewriteOperation> operations;// = new LinkedHashMap<Token, RewriteOperation>(); //actually there is a problem when a composed expression is modified through tokenstreamrewriter. Indeed, the latter does not permit to have replace operations that are at the same index.
	//this map so permits to have unique operations
	
	public VBAExprEvaluator(CommonTokenStream tokens, CtxValue ctxvalue, TokenStreamRewriter rewriter, Map<Token, RewriteOperation> operations) {
		this.rewriter = rewriter;
		this.ctxvalue=ctxvalue;
		this.operations = operations;
	}
	
	
	//parser methods
	//==============
	
	public void exitPowOp(VBAParser.PowOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if ((right instanceof Number)&&(left instanceof Number)) {
			throw new RuntimeException("not implemented for now");
		}
		else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitUnaryMinusOp(VBAParser.UnaryMinusOpContext ctx) {
		Object expr = ctxvalue.getValue(ctx.expression());
		if(expr instanceof Number) {
			Number value = ArithmeticHelper.unaryMinusNumber((Number)expr);
			ctxvalue.setValue(ctx,value);
			
		}
		else {
			//System.out.println("operation UnaryMinusOp not defined!");
			Undefined value1 = new Undefined();
			ctxvalue.setValue(ctx,value1);
		}
	}
	
	public void exitMultOp(VBAParser.MultOpContext ctx) {
		Boolean MultOpe = true;
		if (ctx.DIV() != null)
			MultOpe = false;
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if ((right instanceof Number)&&(left instanceof Number)) {
			Number value=multNumbers((Number)left, (Number)right, MultOpe);
			ctxvalue.setValueNumber(ctx,value);
			//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
			operations.put(ctx.start, op);
			this.NumberModifications+=1;
		}
		else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitIntDivOp(VBAParser.IntDivOpContext ctx) {
		//System.out.println("operation not defined!");
		Undefined value = new Undefined();
		ctxvalue.setValue(ctx,value);
	}
	
	public void exitModOp(VBAParser.ModOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if ((right instanceof Number)&&(left instanceof Number)) {
			Integer value=(Integer)left % (Integer)right;
			ctxvalue.setValueNumber(ctx,value);
			//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
			operations.put(ctx.start, op);
			this.NumberModifications+=1;
		}
		else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	
	public void exitAddOp(VBAParser.AddOpContext ctx) {
		//System.out.println("add op");
		Boolean AddOpe = true;
		if (ctx.MINUS() != null)
			AddOpe = false;
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if ((right instanceof Number)&&(left instanceof Number)) {
			Number right1 = (Number) right;
			//System.out.println("args : " + String.valueOf(right1.doubleValue()));
			Number value=addNumbers((Number)left, (Number)right, AddOpe);
			ctxvalue.setValueNumber(ctx,value);
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
			operations.put(ctx.start, op);
			//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
			this.NumberModifications +=1;
		}
		else if ((right instanceof String) && (left instanceof String)) {
			String left1 = removeLastChar((String)left);
			String right1 = removeFirstChar((String)right);
			ctxvalue.setValue(ctx, left1 + right1);
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+left1+right1+"\"");
			operations.put(ctx.start, op);
			//rewriter.replace(ctx.start, ctx.stop, "\""+left1+right1+"\"");
			this.NumberModifications +=1;
		}
		else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	
	
	public void exitConcatOp(VBAParser.ConcatOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		//System.out.println("concat op");
		//System.out.println(left);
		//System.out.println(right);
		//System.out.println(ctx.start);
		//System.out.println(ctx);
		//System.out.println(ctx.start.getStartIndex());
		if ((right instanceof String) && (left instanceof String)) {
			String left1 = ((String)left);
			String right1 = ((String)right);
			ctxvalue.setValue(ctx, left1 + right1);
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+left1+right1+"\"");
			operations.put(ctx.start, op);
			//System.out.println((String)ctxvalue.getValue(ctx));
			//System.out.println()
			//rewriter.replace(ctx.start, ctx.stop,"\""+left1+right1+"\"");
			this.NumberModifications +=1;
		} else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitRelationalOp(VBAParser.RelationalOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if ((right instanceof String) && (left instanceof String)) {
			String left1 = (String)left; //should remove the ""
			String right1 = (String)right;
			int retval = left1.compareTo(right1); //TODO: check for method used (seems that string difference is not the same in VBA)
			if (ctx.EQ()!=null) {
				if (retval == 0) {
					ctxvalue.setValue(ctx, true);
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.NEQ()!=null) {
				if (retval != 0) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.LT()!=null) {
				if (retval < 0 ) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			}  else if (ctx.GT()!=null) {
				if (retval > 0) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.LEQ()!=null) {
				if (retval <= 0) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.GEQ()!=null) {
				if (retval >= 0) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.LIKE()!=null) {
				//TODO: implement
			} else if (ctx.IS()!=null) {
				//this case should not exists as like is used for strings
				//System.out.println("operation not defined in IS relationalOp!");
				Undefined value = new Undefined();
				ctxvalue.setValue(ctx,value);
			}
		} else if (right instanceof Number && left instanceof Number) {
			Number left1 = (Number) left;
			Number right1 = (Number) right;
			if (ctx.EQ()!=null) {
				if (left1.doubleValue() == right1.doubleValue()) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.NEQ()!=null) {
				if (left1.doubleValue() != right1.doubleValue()) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.LT()!=null) {
				if (left1.doubleValue() < right1.doubleValue()) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			}  else if (ctx.GT()!=null) {
				if (left1.doubleValue() > right1.doubleValue()) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.LEQ()!=null) {
				if (left1.doubleValue() <= right1.doubleValue()) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.GEQ()!=null) {
				if (left1.doubleValue() >= right1.doubleValue()) {
					ctxvalue.setValue(ctx, true);
					//rewriter.replace(ctx.start, ctx.stop, "True");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					ctxvalue.setValue(ctx, false);
					//rewriter.replace(ctx.start, ctx.stop, "False");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			} else if (ctx.LIKE()!=null) {
				//this case should not exists as like is used for strings
				//System.out.println("operation not defined in LIKE relationalOp!");
				Undefined value = new Undefined();
				ctxvalue.setValue(ctx,value);
			} else if (ctx.IS()!=null) {
				//this case should not exists as like is used for strings
				//System.out.println("operation not defined in IS relationalOp!");
				Undefined value = new Undefined();
				ctxvalue.setValue(ctx,value);
			}
		//TODO: the case of IS should be treated apart...
		} else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitLogicalNotOp(VBAParser.LogicalNotOpContext ctx) {
		Object arg = ctxvalue.getValue(ctx.expression());
		if (arg instanceof Boolean) {
			Boolean val = (Boolean) arg;
			ctxvalue.setValue(ctx, !val);
			if (!val) {
				rewriter.replace(ctx.start, ctx.stop, "True");
			} else {
				rewriter.replace(ctx.start, ctx.stop, "False");
			}
			this.NumberModifications +=1;
		} else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitLogicalAndOp(VBAParser.LogicalAndOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if (left instanceof Boolean && right instanceof Boolean) {
			Boolean left1 = (Boolean) left;
			Boolean right1 = (Boolean) right;
			ctxvalue.setValue(ctx, left1 && right1);
			if (left1 && right1) {
				//rewriter.replace(ctx.start, ctx.stop, "True");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
				operations.put(ctx.start, op);
			} else {
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
				operations.put(ctx.start, op);
				//rewriter.replace(ctx.start, ctx.stop, "False");
			}
			this.NumberModifications +=1;
		} else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitLogicalOrOp(VBAParser.LogicalOrOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if (left instanceof Boolean && right instanceof Boolean) {
			Boolean left1 = (Boolean) left;
			Boolean right1 = (Boolean) right;
			ctxvalue.setValue(ctx, left1 || right1);
			if (left1 || right1) {
				//rewriter.replace(ctx.start, ctx.stop, "True");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
				operations.put(ctx.start, op);
			} else {
				//rewriter.replace(ctx.start, ctx.stop, "False");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
				operations.put(ctx.start, op);
			}
			this.NumberModifications +=1;
		} else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	
	public void exitLogicalXorOp(VBAParser.LogicalXorOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if (left instanceof Boolean && right instanceof Boolean) {
			Boolean left1 = (Boolean) left;
			Boolean right1 = (Boolean) right;
			ctxvalue.setValue(ctx, left1 ^ right1);
			if (left1 ^ right1) {
				//rewriter.replace(ctx.start, ctx.stop, "True");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
				operations.put(ctx.start, op);
			} else {
				//rewriter.replace(ctx.start, ctx.stop, "False");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
				operations.put(ctx.start, op);
			}
			this.NumberModifications +=1;
		} else if (left instanceof Integer && right instanceof Integer) { //it seems quite unlikely that there will be anything but integers
			Integer left1 = (Integer) left;
			Integer right1 = (Integer) right;
			Integer value = left1 ^ right1;
			ctxvalue.setValue(ctx, value);
			//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
			operations.put(ctx.start, op);
			this.NumberModifications +=1;
		} else if (left instanceof Boolean && right instanceof Integer) {
			Boolean left1 = (Boolean) left;
			Integer left2;
			if (left1) {
				left2 = -1;
			} else {
				left2 = 0;
			}
			Integer right1 = (Integer) right;
			Integer value = left2 ^ right1;
			ctxvalue.setValue(ctx, value);
			//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
			operations.put(ctx.start, op);
			this.NumberModifications +=1;
		} else if (left instanceof Integer && right instanceof Boolean) {
			Boolean right1 = (Boolean) right;
			Integer right2;
			if (right1) {
				right2 = -1;
			} else {
				right2 = 0;
			}
			Integer left1 = (Integer) left;
			Integer value = left1 ^ right2;
			ctxvalue.setValue(ctx, value);
			//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
			operations.put(ctx.start, op);
			this.NumberModifications +=1;
		}
	}
	
	public void exitLogicalEqvOp(VBAParser.LogicalEqvOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if (left instanceof Boolean && right instanceof Boolean) {
			Boolean left1 = (Boolean) left;
			Boolean right1 = (Boolean) right;
			ctxvalue.setValue(ctx, !(left1 ^ right1));
			if (!(left1 ^ right1)) {
				//rewriter.replace(ctx.start, ctx.stop, "True");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
				operations.put(ctx.start, op);
			} else {
				//rewriter.replace(ctx.start, ctx.stop, "False");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
				operations.put(ctx.start, op);
			}
			this.NumberModifications +=1;
		} else {
			//System.out.println("operation not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitLogicalImpOp(VBAParser.LogicalImpOpContext ctx) {
		Object left = ctxvalue.getValue(ctx.expression(0));
		Object right = ctxvalue.getValue(ctx.expression(1));
		if (left instanceof Boolean && right instanceof Boolean) {
			Boolean left1 = (Boolean) left;
			Boolean right1 = (Boolean) right;
			ctxvalue.setValue(ctx, !(left1 && (!right1)));
			if (!(left1 && !(right1))) {
				//rewriter.replace(ctx.start, ctx.stop, "True");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "True");
				operations.put(ctx.start, op);
			} else {
				//rewriter.replace(ctx.start, ctx.stop, "False");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "False");
				operations.put(ctx.start, op);
			}
			this.NumberModifications +=1;
		} else {
		    //System.out.println("operation logical imply not defined!");
			Undefined value = new Undefined();
			ctxvalue.setValue(ctx,value);
		}
	}
	
	public void exitLiteralExpr(VBAParser.LiteralExprContext ctx) {
		//System.out.println("literal expr");
		Object value = ctxvalue.getValue(ctx.literalExpression());
		if (value instanceof Number) {
				Number value1 = ctxvalue.getValue(ctx.literalExpression());
				ctxvalue.setValue(ctx,value1);
		}
		else if (value instanceof String) {
			//String value1 = UnEscape.unescape_perl_string((String)ctxvalue.getValue(ctx.literalExpression()));
			String value1 = (String)ctxvalue.getValue(ctx.literalExpression());
			ctxvalue.setValue(ctx,value1);
		}
	}

	public void exitLiteralExpression(VBAParser.LiteralExpressionContext ctx) {
		if (ctx.numberLiteral() != null) {
			Number value = ctxvalue.getValue(ctx.numberLiteral());
			ctxvalue.setValue(ctx,value);
		}
		else if (ctx.STRINGLITERAL()!= null) {
			String value = ctx.STRINGLITERAL().getText();
			value = value.substring(1, value.length()-1);
			ctxvalue.setValue(ctx,value);
		}
	}
	
	/*
	public void exitLetStmt(VBAParser.LetStmtContext ctx) { 
		Object expr = ctxvalue.getValue(ctx.expression());
		if (expr instanceof String) {
			String value = (String) expr;
			rewriter.replace(ctx.expression().start, ctx.expression().stop,"\""+value+"\"");
		}
	}*/
	
	public void exitArgumentExpression(VBAParser.ArgumentExpressionContext ctx) { //TODO
		if(ctx.expression()!=null) {
			Object value = ctxvalue.getValue(ctx.expression());
			ctxvalue.setValue(ctx,value);
		}
	}
		
	//helpers that need to be moved out
	public static String removeLastChar(String str) {
		return str.substring(0, str.length()-1);
	}
	
	public static String removeFirstChar(String str) {
		return str.substring(1, str.length());
	}
	
	public static Number multNumbers(Number a, Number b, Boolean operand) {
	    if(a instanceof Double || b instanceof Double) {
	    	if (operand) {
	    		return a.doubleValue() * b.doubleValue();
	    	}else {
	    		return a.doubleValue() / b.doubleValue();
	    	}
	    } else if(a instanceof Float || b instanceof Float) {
	    	if (operand) {
	    		return a.floatValue() * b.floatValue();
	    	}else {
	    		return a.floatValue() / b.floatValue();
	    	}
	    } else if(a instanceof Long || b instanceof Long) {
	    	if (operand) {
	    		return a.longValue() * b.longValue();
	    	}else {
	    		return a.longValue()  / b.longValue();
	    	}
	    } else {
	    	if (operand) {
	    		return a.intValue() * b.intValue();
	    	}else {
	    		return a.intValue() / b.intValue();
	    	}
	    }
	}
	

	public static Number addNumbers(Number a, Number b, Boolean operand) {
	    if(a instanceof Double || b instanceof Double) {
	    	if (operand) {
	    		return a.doubleValue() + b.doubleValue();
	    	}else {
	    		return a.doubleValue() - b.doubleValue();
	    	}
	    } else if(a instanceof Float || b instanceof Float) {
	    	if (operand) {
	    		return a.floatValue() + b.floatValue();
	    	}else {
	    		return a.floatValue() - b.floatValue();
	    	}
	    } else if(a instanceof Long || b instanceof Long) {
	    	if (operand) {
	    		return a.longValue() + b.longValue();
	    	}else {
	    		return a.longValue()  - b.longValue();
	    	}
	    } else {
	    	if (operand) {
	    		return a.intValue() + b.intValue();
	    	}else {
	    		return a.intValue() - b.intValue();
	    	}
	    }
	}
	
	
	public void applyModifications() {
		for(Entry<Token, RewriteOperation> entry: this.operations.entrySet()) {
			//System.out.print("entry : ");
			//System.out.println(entry.getValue().start);
			rewriter.replace(entry.getValue().start, entry.getValue().stop, entry.getValue().replacement);
		}
	}



	public Integer getNumberModifications() {
		//applyModifications();
		return this.NumberModifications;
	}
}
