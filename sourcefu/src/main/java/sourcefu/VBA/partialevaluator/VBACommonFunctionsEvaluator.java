package sourcefu.VBA.partialevaluator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Map;

import org.antlr.v4.runtime.*;
import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;
import sourcefu.helpers.Undefined;
import sourcefu.lib.CtxValue;
import sourcefu.lib.UnEscape;

import sourcefu.VBA.antlr.VBAParserBaseVisitor;

public class VBACommonFunctionsEvaluator extends VBAParserBaseListener {

	TokenStreamRewriter rewriter;
	Integer NumberModifications=0;
	sourcefu.lib.CtxValue ctxvalue;
	Map<Token, RewriteOperation> operations;
	
	public VBACommonFunctionsEvaluator(CommonTokenStream tokens, CtxValue ctxvalue,TokenStreamRewriter rewriter, Map<Token, RewriteOperation> operations) {
		//rewriter=new TokenStreamRewriter(tokens);
		this.ctxvalue=ctxvalue;
		this.rewriter = rewriter;
		this.operations = operations;
	}
	
	
	
	//parser methods
	//================================================

	public void exitPositionalArgument(VBAParser.PositionalArgumentContext ctx) { 
		Object value = ctxvalue.getValue(ctx.argumentExpression());
		ctxvalue.setValue(ctx,value);
	}
	
	public void exitArgument(VBAParser.ArgumentContext ctx) { //TODO
		if(ctx.positionalArgument()!=null) {
			Object value = ctxvalue.getValue(ctx.positionalArgument());
			ctxvalue.setValue(ctx,value);
		}
	}

	public void exitNumberLiteral(VBAParser.NumberLiteralContext ctx) {
		if(ctx.INTEGERLITERAL()!=null) {
			String intText = ctx.INTEGERLITERAL().getText(); 
			ctxvalue.setValue(ctx, Integer.valueOf(intText));
		}
		else if (ctx.FLOATLITERAL()!=null) {
			String floatText = ctx.FLOATLITERAL().getText();
			ctxvalue.setValue(ctx, Double.valueOf(floatText));
		}else if (ctx.OCTLITERAL()!=null) {
			String octText = ctx.OCTLITERAL().getText();
			ctxvalue.setValue(ctx,Integer.valueOf(octText,8));
		}else if (ctx.HEXLITERAL()!=null) {
			String hexText = ctx.HEXLITERAL().getText();
			ctxvalue.setValue(ctx,Integer.valueOf(hexText,16));
		}else {
			throw new RuntimeException("parsing problem in exitNumberLiteral, can't find a correct child");
		}
	}

	//generic function cases
	//TODO : add roundup, rounddown, ascw cases
	public void exitStandardExpr(VBAParser.StandardExprContext ctx) {
		try {
		if(ctx.standardFunctionKeyword().CHOOSE()!=null) {
			//todo
		}else if(ctx.standardFunctionKeyword().ASC()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				Integer value = (int)string.charAt(0);
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().CHR()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof Integer) {
				int num = (Integer)arg;
				char c = (char)num;
				String value = Character.toString(c);
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+ String.valueOf(value) + "\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+ String.valueOf(value) + "\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().FORMAT()!=null) {
			//TODO
		}else if(ctx.standardFunctionKeyword().INSTR()!=null) {
			//TODO
		}else if(ctx.standardFunctionKeyword().INSTRREV()!=null) {
			//TODO
		}else if(ctx.standardFunctionKeyword().LCASE()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String) arg;
				String value = string.toLowerCase();
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().LEFT()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
			if(arg0 instanceof String && arg1 instanceof Integer) {
				String string = (String)arg0;
				Integer j = (Integer)arg1;
				String value = string.substring(0, j);
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().LEN()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				String string1 = UnEscape.unescape_perl_string(string);
				Integer value = string1.length();
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().LTRIM()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			//System.out.println("========> "+arg);
			if(arg instanceof String) {
				String string = (String)arg;
				String value = string.replaceAll("^\\s+","");
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().MID()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
			if (arg0 instanceof String && arg1 instanceof Integer) {
				String string = (String)arg0;
				Integer j = (Integer)arg1;
				if(ctx.argumentList().argument().size()>2) {
					Object arg2 = ctxvalue.getValue(ctx.argumentList().argument(2));
					if( arg2 instanceof Integer) {
						Integer k = (Integer)arg2;
						String value = string.substring(j-1, j+k-1);
						ctxvalue.setValue(ctx,value);
						//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
						RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
						operations.put(ctx.start, op);
						this.NumberModifications +=1;
					}
				} else {
					String value = string.substring(j-1);
					ctxvalue.setValue(ctx,value);
					//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
			}
		}else if(ctx.standardFunctionKeyword().REPLACE()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
			Object arg2 = ctxvalue.getValue(ctx.argumentList().argument(2));
			if(arg0 instanceof String && arg1 instanceof String && arg2 instanceof String) {
				String str0 = (String) arg0;
				String str1 = (String) arg1;
				String str2 = (String) arg2;
				if(ctx.argumentList().argument().size()==3) {				
					String value = str0.replaceAll(str1, str2);
					ctxvalue.setValue(ctx,value);
					//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}else if(ctx.argumentList().argument().size()>3) {
					Object arg3=ctxvalue.getValue(ctx.argumentList().argument(3));
					if(arg3 instanceof Integer) {
						Integer start = (Integer) arg3;
						if(ctx.argumentList().argument().size()==4) {
							String temp = str0.substring(start);
							String value = temp.replaceAll(str1, str2);
							ctxvalue.setValue(ctx,value);
							//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
							RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
							operations.put(ctx.start, op);
							this.NumberModifications +=1;
						}else if(ctx.argumentList().argument().size()>4) {
							//Object arg4=getValue(ctx.argumentList().argument(4));
							if(arg3 instanceof Integer) {
								//Integer count = (Integer) arg4;
								if(ctx.argumentList().argument().size()==5) {
									String temp = str0.substring(start);
									String value = temp.replaceAll(str1, str2);//TODO:take count into account
									ctxvalue.setValue(ctx,value);
									//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
									RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
									operations.put(ctx.start, op);
									this.NumberModifications +=1;
								}else {
									//TODO: last case with compare
								}
							}
						}
					}
				}
			}
		}else if(ctx.standardFunctionKeyword().RIGHT()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
			if(arg0 instanceof String && arg1 instanceof Integer) {
				String string = (String)arg0;
				Integer j = (Integer)arg1;
				String value = string.substring(string.length() - j);
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().RTRIM()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				String value = string.replaceAll("\\s+$","");
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().SPACE()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof Integer) {
				Integer j = (Integer) arg;
				String value = new String(new char[j]).replace("\0"," ");
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().SPLIT()!=null) {
			//TODO
		}else if(ctx.standardFunctionKeyword().STRCOMP()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
			if(arg0 instanceof String && arg1 instanceof String) {
				String str0 = (String) arg0;
				String str1 = (String) arg1;
				if(ctx.argumentList().argument().size()<=2) {
					Integer value = str0.compareTo(str1);
					ctxvalue.setValue(ctx,value);
					//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}else {
					//TODO
				}
			}
		}else if(ctx.standardFunctionKeyword().STRCONV()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
			if(arg0 instanceof String && arg1 instanceof Integer) {
				String str0 = (String) arg0;
				Integer j = (Integer) arg1;
				if(ctx.argumentList().argument().size()<=2) {
					if(j==1) { //TODO: should we use a flag method or not, not really clear
						String value = str0.toUpperCase();
						ctxvalue.setValue(ctx,value);
						//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
						RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
						operations.put(ctx.start, op);
						this.NumberModifications +=1;
					}else if (j==2) {
						String value = str0.toLowerCase();
						ctxvalue.setValue(ctx,value);
						//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
						RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
						operations.put(ctx.start, op);
						this.NumberModifications +=1;
					}else if (j==3) {
						StringBuilder properCase = new StringBuilder();
						boolean nextProperCase = true;
						for (char c: str0.toCharArray()) {
							if (Character.isSpaceChar(c)) {
								nextProperCase = true;
							} else if (nextProperCase) {
								c = Character.toTitleCase(c);
								nextProperCase = false;
							}
							properCase.append(c);
						}
						String value = properCase.toString();
						ctxvalue.setValue(ctx,value);
						//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
						RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
						operations.put(ctx.start, op);
						this.NumberModifications +=1;
					}else {
						//TODO
					}
				}else {
					//TODO
				}
			}
		}else if(ctx.standardFunctionKeyword().STRREVERSE()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				String value = new StringBuilder(string).reverse().toString();
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().TRIM()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				String value = string.trim();
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().UCASE()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				String value = string.toUpperCase();
				ctxvalue.setValue(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, "\""+value+"\"");
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, "\""+value+"\"");
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().SGN()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof Number) {
				Number num = (Number) arg;
				Integer value;
				if(num.doubleValue()<0) {
					value = -1;
				}else if(num.doubleValue()>0) {
					value = 1;
				}else {
					value = 0;
				}
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().ROUND()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg0 instanceof Number) {
				Number num0 = (Number) arg0;
				if(ctx.argumentList().argument().size()==1) {				
					Long value = Math.round(num0.doubleValue());
					ctxvalue.setValue(ctx,value);
					//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}else if(ctx.argumentList().argument().size()>1) {
					Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
					if(arg1 instanceof Integer) {
						Integer decimals = (Integer) arg1;
						String temp0 = new String(new char[decimals]).replace("\0","#");
						DecimalFormat df = new DecimalFormat("#."+temp0);
						df.setRoundingMode(RoundingMode.CEILING);
						String roundedstring = df.format(num0.doubleValue());
						Double value = Double.parseDouble(roundedstring);
						ctxvalue.setValueNumber(ctx,value);
						//rewriter.replace(ctx.start, ctx.stop, roundedstring);
						RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, roundedstring);
						operations.put(ctx.start, op);
						this.NumberModifications +=1;
					}
				}
			}
		/*}else if(ctx.standardFunctionKeyword().ROUNDUP()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg0 instanceof Number) {
				Number num0 = (Number) arg0;
				if(ctx.argumentList().argument().size()==1) {				
					Long value = Math.round(num0.doubleValue());
					setValue(ctx,value);
					rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				}else if(ctx.argumentList().argument().size()>1) {
					Object arg1 = getValue(ctx.argumentList().argument(1));
					if(arg1 instanceof Integer) {
						Integer decimals = (Integer) arg1;
						String temp0 = new String(new char[decimals]).replace("\0","#");
						DecimalFormat df = new DecimalFormat("#."+temp0);
						df.setRoundingMode(RoundingMode.CEILING);
						String roundedstring = df.format(num0.doubleValue());
						Double value = Double.parseDouble(roundedstring);
						setValueNumber(ctx,value);
						rewriter.replace(ctx.start, ctx.stop, roundedstring);
					}
				}
			}*/
			//TODO: implement in grammar
		}else if(ctx.standardFunctionKeyword().FIX()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg0 instanceof Number) {
				Number num0 = (Number) arg0;
				Integer value = (int)(num0.doubleValue());
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		}else if(ctx.standardFunctionKeyword().VAL()!=null) {
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg0 instanceof Number) {
				Number num = (Number) arg0;
				Double value = num.doubleValue();
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			} else if (arg0 instanceof String) {
				String str = (String) arg0;
				StringBuilder validStr = new StringBuilder();
				boolean seenDot = false;
				boolean seenDigit = false;
				for(int i=0;i<str.length();i++) {
					char c = str.charAt(i);
					if (c=='.' && !seenDot) {
						seenDot = true;
						validStr.append(c);
					} else if ((c == '-' || c == '+') && !seenDigit) {
						validStr.append(c);
					} else if (Character.isDigit(c)) {
						seenDigit = true;
						validStr.append(c);
					} else if (Character.isWhitespace(c)) {
						continue;
					} else {
						break;
					}
				}
				if(validStr.toString().isEmpty()) {
					Integer value = 0;
					ctxvalue.setValueNumber(ctx,value);
					//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				} else {
					Double value = Double.parseDouble(validStr.toString());
					ctxvalue.setValueNumber(ctx,value);
					//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
					RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
					operations.put(ctx.start, op);
					this.NumberModifications +=1;
				}
				
			}
		} else if (ctx.standardFunctionKeyword().INT()!=null) {
			//System.out.println("int keyword");
			Object arg0 = ctxvalue.getValue(ctx.argumentList().argument(0));
			if (arg0 instanceof Number) {
				Number num = (Number) arg0;
				//System.out.println("arg0 : " + String.valueOf(num));
				Integer value = (int)(num.doubleValue());
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		} else if (ctx.standardFunctionKeyword().MONTH()!=null) {
			if(ctx.argumentList().argument(0).getText().equals("Date")) {
				Integer value = Calendar.getInstance().get(Calendar.MONTH) + 1;
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
			//TODO : other cases
		} else if (ctx.standardFunctionKeyword().YEAR()!=null) {
			if(ctx.argumentList().argument(0).getText().equals("Date")) {
				Integer value = Calendar.getInstance().get(Calendar.YEAR);
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
			//TODO : other cases
		} else if (ctx.standardFunctionKeyword().DAY()!=null) {
			if(ctx.argumentList().argument(0).getText().equals("Date")) {
				Integer value = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
			//TODO : other cases	
		} else if (ctx.standardFunctionKeyword().WEEKDAY()!=null) {
			Integer value=1;
			//System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
			if(ctx.argumentList().argument(0).getText().equals("Date")) {
				value = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
			}
			//TODO: case with real date
			
			if(ctx.argumentList().argument().size()>1) {
				Object arg1 = ctxvalue.getValue(ctx.argumentList().argument(1));
				if (arg1 instanceof Integer) {
					Integer daystart = (Integer) arg1;
					value = (value - daystart+1)%7;
					if(value==0) {
						value=7;
					}
				}else {
					return;
				}
			}
			ctxvalue.setValueNumber(ctx,value);
			//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
			RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
			operations.put(ctx.start, op);
			this.NumberModifications +=1;
		} else if (ctx.standardFunctionKeyword().ASCW()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				Integer value = (int)string.charAt(0); //have to be sure there TODO
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		} else if (ctx.standardFunctionKeyword().ABS()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if (arg instanceof Number) {
				Number num = (Number) arg;
				Integer value = (int)(num.doubleValue());
				value = Math.abs(value);
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}
		/*} else if (ctx.standardFunctionKeyword().ASCB()!=null) {
			Object arg = ctxvalue.getValue(ctx.argumentList().argument(0));
			if(arg instanceof String) {
				String string = (String)arg;
				Integer value = (int)string.charAt(0); //have to be sure there TODO
				ctxvalue.setValueNumber(ctx,value);
				//rewriter.replace(ctx.start, ctx.stop, String.valueOf(value));
				RewriteOperation op = new RewriteOperation(ctx.start, ctx.stop, String.valueOf(value));
				operations.put(ctx.start, op);
				this.NumberModifications +=1;
			}*/
		} else {
			//TODO : implement other cases
		}
		}catch(Exception e){
			Undefined undef = new Undefined();
			ctxvalue.setValue(ctx,undef);
		}
	}
	
	
	//generic methods
	//==================================================
	
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
	
	
	public String getdata() {return rewriter.getText();}



	public Integer getNumberModifications() {
		return this.NumberModifications;
	}
	
}
