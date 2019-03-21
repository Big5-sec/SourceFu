package sourcefu.VBA;

import java.util.LinkedHashMap;
import java.util.Map;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import sourcefu.VBA.antlr.VBAParser;
import sourcefu.VBA.antlr.VBAParserBaseListener;

/*
 * This class is a simple modifier to interpret constants like vbLowerCase and such, and to transform them to the associated value
 */

public class VBAConstantsModifier extends VBAParserBaseListener {
	TokenStreamRewriter rewriter;
	Map<String, Integer> constantsNumeric = new LinkedHashMap<String, Integer>();
	Map<String, String> constantsString = new LinkedHashMap<String, String>();

	
	public void createConstantsMap() {
		//numeric first
		this.constantsNumeric.put("vbAbort", 3);
		this.constantsNumeric.put("vbAbortRetryIgnore",2);
		this.constantsNumeric.put("vbApplicationModal",0);
		this.constantsNumeric.put("vbArchive", 32);
		this.constantsNumeric.put("vbArray", 8192);
		this.constantsNumeric.put("vbBinaryCompare", 0);
		this.constantsNumeric.put("vbBoolean", 11);
		this.constantsNumeric.put("vbByte", 17);
		this.constantsNumeric.put("vbCancel", 2);
		this.constantsNumeric.put("vbCritical", 16);
		this.constantsNumeric.put("vbCurrency", 6);
		this.constantsNumeric.put("vbDate", 7);
		this.constantsNumeric.put("vbDecimal", 14);
		this.constantsNumeric.put("vbDefaultButton1", 0);
		this.constantsNumeric.put("vbDefaultButton2", 256);
		this.constantsNumeric.put("vbDefaultButton3", 512);
		this.constantsNumeric.put("vbDirectory", 16);
		this.constantsNumeric.put("vbDouble", 5);
		this.constantsNumeric.put("vbEmpty",0);
		this.constantsNumeric.put("vbExclamation", 48);
		this.constantsNumeric.put("vbFalse", 0);
		this.constantsNumeric.put("vbFirstFourDays", 2);
		this.constantsNumeric.put("vbFirstFullWeek", 3);
		this.constantsNumeric.put("vbFirstJan1", 1);
		this.constantsNumeric.put("vbFriday", 6);
		this.constantsNumeric.put("vbGeneralDate", 0);
		this.constantsNumeric.put("vbGet", 2);
		this.constantsNumeric.put("vbHidden", 2);
		this.constantsNumeric.put("vbHide", 0);
		this.constantsNumeric.put("vbHiragana", 32);
		this.constantsNumeric.put("vbIgnore", 5);
		this.constantsNumeric.put("vbInformation", 64);
		this.constantsNumeric.put("vbInteger", 3);
		this.constantsNumeric.put("vbKatakana", 16);
		this.constantsNumeric.put("vbLet", 4);
		this.constantsNumeric.put("vbLinguisticCasing", 1024);
		this.constantsNumeric.put("vbLong", 20);
		this.constantsNumeric.put("vbLongDate", 1);
		this.constantsNumeric.put("vbLongTime", 3);
		this.constantsNumeric.put("vbLowerCase", 2);
		this.constantsNumeric.put("vbmaximizedFocus", 3);
		this.constantsNumeric.put("vbMethod", 1);
		this.constantsNumeric.put("vbMinimizedFocus", 2);
		this.constantsNumeric.put("vbMinimizedNoFocus", 6);
		this.constantsNumeric.put("vbmonday", 2);
		this.constantsNumeric.put("vbMsgBoxHelp", 16384);
		this.constantsNumeric.put("vbMsgBoxRight", 524288);
		this.constantsNumeric.put("vbMsgBoxRtlReading", 1048576);
		this.constantsNumeric.put("vbMsgBoxSetForeground", 65536);
		this.constantsNumeric.put("vbnarrow", 8);
		this.constantsNumeric.put("vbNo", 7);
		this.constantsNumeric.put("vbNormal", 0);
		this.constantsNumeric.put("vbNormalFocus", 1);
		this.constantsNumeric.put("vbNormalNoFocus", 4);
		this.constantsNumeric.put("vbNull", 1);
		this.constantsNumeric.put("vbObject", 9);
		this.constantsNumeric.put("vbObjectError", -2147221504);
		this.constantsNumeric.put("vbOK", 1);
		this.constantsNumeric.put("vbOKCancel", 1);
		this.constantsNumeric.put("vbOKOnly", 0);
		this.constantsNumeric.put("vbProperCase", 3);
		this.constantsNumeric.put("vbQuestion", 32);
		this.constantsNumeric.put("vbReadOnly", 1);
		this.constantsNumeric.put("vbRetry", 4);
		this.constantsNumeric.put("vbRetryCancel", 5);
		this.constantsNumeric.put("vbSaturday", 7);
		this.constantsNumeric.put("vbSet", 8);
		this.constantsNumeric.put("vbShortDate", 2);
		this.constantsNumeric.put("vbShortTime", 4);
		this.constantsNumeric.put("vbSimplifiedChinese", 256);
		this.constantsNumeric.put("vbSingle", 4);
		this.constantsNumeric.put("vbString", 8);
		this.constantsNumeric.put("vbSunday", 1);
		this.constantsNumeric.put("vbSystem", 4);
		this.constantsNumeric.put("vbSystemModal", 4096);
		this.constantsNumeric.put("vbTextCompare", 1);
		this.constantsNumeric.put("vbThursday", 5);
		this.constantsNumeric.put("vbTraditionalChinese", 512);
		this.constantsNumeric.put("vbTrue", -1);
		this.constantsNumeric.put("vbTuesday", 3);
		this.constantsNumeric.put("vbUpperCase", 1);
		this.constantsNumeric.put("vbUseDefault", -2);
		this.constantsNumeric.put("vbUseDefinedType", 36);
		this.constantsNumeric.put("vbUseSystem", 0);
		this.constantsNumeric.put("vbUseSystemDayOfWeek", 0);
		this.constantsNumeric.put("vbVariant", 12);
		this.constantsNumeric.put("vbVolume", 8);
		this.constantsNumeric.put("vbWednesday", 4);
		this.constantsNumeric.put("vbWide", 4);
		this.constantsNumeric.put("vbYes", 6);
		this.constantsNumeric.put("vbYesNo", 4);
		this.constantsNumeric.put("vbYesNoCancel", 3);
		
		//string then
		this.constantsString.put("vbCr", "\"\\r\"");
		this.constantsString.put("vbCrLf", "\"\\r\\n\"");
		this.constantsString.put("vbLf", "\"\\n\"");
		this.constantsString.put("vbNewLine", "\"\\r\\n\"");
		this.constantsString.put("vbTab", "\"\\t\"");
		//this.constantsString.put("vbNullChar", new String(new char[1])); //TODO: not sure how this case should be handled
		this.constantsString.put("vbNullString", "\"\"");
		this.constantsString.put("vbFormFeed", "\"\\f\"");
		//this.constantsString.put("vbVerticalTab", "\v");
		this.constantsString.put("vbBack", "\"\\b\"") ;
	}
	
	public VBAConstantsModifier(CommonTokenStream tokens) {
		rewriter=new TokenStreamRewriter(tokens);
		createConstantsMap();
	}

	public void exitIdentifier(VBAParser.IdentifierContext ctx) {
		String name = ctx.getText();

		if(this.constantsNumeric.containsKey(name)) {
			rewriter.replace(ctx.start, ctx.stop, String.valueOf(this.constantsNumeric.get(name)));
		}
		
		if(this.constantsString.containsKey(name)) {
			rewriter.replace(ctx.start, ctx.stop, this.constantsString.get(name));
		}
	}

	public String getdata() {
		return rewriter.getText();
	}

}
