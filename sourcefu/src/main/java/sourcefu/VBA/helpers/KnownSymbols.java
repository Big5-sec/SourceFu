package sourcefu.VBA.helpers;

import java.util.ArrayList;
import java.util.List;

public class KnownSymbols {
	List<String> symbols = new ArrayList<String>();
	
	public KnownSymbols() {
		createKnownSymbols();
	}
	
	private void createKnownSymbols() {
		this.symbols.add("AutoOpen");
		this.symbols.add("AutoClose");

		this.symbols.add("vbAbort");
		this.symbols.add("vbAbortRetryIgnore");
		this.symbols.add("vbApplicationModal");
		this.symbols.add("vbArchive");
		this.symbols.add("vbArray");
		this.symbols.add("vbBinaryCompare");
		this.symbols.add("vbBoolean");
		this.symbols.add("vbByte");
		this.symbols.add("vbCancel");
		this.symbols.add("vbCritical");
		this.symbols.add("vbCurrency");
		this.symbols.add("vbDate");
		this.symbols.add("vbDecimal");
		this.symbols.add("vbDefaultButton1");
		this.symbols.add("vbDefaultButton2");
		this.symbols.add("vbDefaultButton3");
		this.symbols.add("vbDirectory");
		this.symbols.add("vbDouble");
		this.symbols.add("vbEmpty");
		this.symbols.add("vbExclamation");
		this.symbols.add("vbFalse");
		this.symbols.add("vbFirstFourDays");
		this.symbols.add("vbFirstFullWeek");
		this.symbols.add("vbFirstJan1");
		this.symbols.add("vbFriday");
		this.symbols.add("vbGeneralDate");
		this.symbols.add("vbGet");
		this.symbols.add("vbHidden");
		this.symbols.add("vbHide");
		this.symbols.add("vbHiragana");
		this.symbols.add("vbIgnore");
		this.symbols.add("vbInformation");
		this.symbols.add("vbInteger");
		this.symbols.add("vbKatakana");
		this.symbols.add("vbLet");
		this.symbols.add("vbLinguisticCasing");
		this.symbols.add("vbLong");
		this.symbols.add("vbLongDate");
		this.symbols.add("vbLongTime");
		this.symbols.add("vbLowerCase");
		this.symbols.add("vbmaximizedFocus");
		this.symbols.add("vbMethod");
		this.symbols.add("vbMinimizedFocus");
		this.symbols.add("vbMinimizedNoFocus");
		this.symbols.add("vbmonday");
		this.symbols.add("vbMsgBoxHelp");
		this.symbols.add("vbMsgBoxRight");
		this.symbols.add("vbMsgBoxRtlReading");
		this.symbols.add("vbMsgBoxSetForeground");
		this.symbols.add("vbnarrow");
		this.symbols.add("vbNo");
		this.symbols.add("vbNormal");
		this.symbols.add("vbNormalFocus");
		this.symbols.add("vbNormalNoFocus");
		this.symbols.add("vbNull");
		this.symbols.add("vbObject");
		this.symbols.add("vbObjectError");
		this.symbols.add("vbOK");
		this.symbols.add("vbOKCancel");
		this.symbols.add("vbOKOnly");
		this.symbols.add("vbProperCase");
		this.symbols.add("vbQuestion");
		this.symbols.add("vbReadOnly");
		this.symbols.add("vbRetry");
		this.symbols.add("vbRetryCancel");
		this.symbols.add("vbSaturday");
		this.symbols.add("vbSet");
		this.symbols.add("vbShortDate");
		this.symbols.add("vbShortTime");
		this.symbols.add("vbSimplifiedChinese");
		this.symbols.add("vbSingle");
		this.symbols.add("vbString");
		this.symbols.add("vbSunday");
		this.symbols.add("vbSystem");
		this.symbols.add("vbSystemModal");
		this.symbols.add("vbTextCompare");
		this.symbols.add("vbThursday");
		this.symbols.add("vbTraditionalChinese");
		this.symbols.add("vbTrue");
		this.symbols.add("vbTuesday");
		this.symbols.add("vbUpperCase");
		this.symbols.add("vbUseDefault");
		this.symbols.add("vbUseDefinedType");
		this.symbols.add("vbUseSystem");
		this.symbols.add("vbUseSystemDayOfWeek");
		this.symbols.add("vbVariant");
		this.symbols.add("vbVolume");
		this.symbols.add("vbWednesday");
		this.symbols.add("vbWide");
		this.symbols.add("vbYes");
		this.symbols.add("vbYesNo");
		this.symbols.add("vbYesNoCancel");
		
		this.symbols.add("vbCr");
		this.symbols.add("vbCrLf");
		this.symbols.add("vbLf");
		this.symbols.add("vbNewLine");
		this.symbols.add("vbTab");
		this.symbols.add("vbNullChar");
		this.symbols.add("vbNullString");
		this.symbols.add("vbFormFeed");
		//this.symbols.add("vbVerticalTab", "\v");
		this.symbols.add("vbBack") ;
	}
	
	public List<String> getsymbols(){
		return this.symbols;
	}
	
}
