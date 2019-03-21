package sourcefu.VBA.antlr;

// Generated from VBAParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VBAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANY=1, ARRAY=2, CBOOL=3, CBYTE=4, CCUR=5, CDATE=6, CDBL=7, CDEC=8, CINT=9, 
		CIRCLE=10, CLNG=11, CLNGLNG=12, CLNGPTR=13, CSNG=14, CSTR=15, CURRENCY=16, 
		CVAR=17, CVERR=18, DEBUG=19, DOEVENTS=20, EXIT=21, INPUTB=22, LBOUND=23, 
		LENB=24, LONGLONG=25, LONGPTR=26, MIDB=27, OPTION=28, PSET=29, SCALE=30, 
		UBOUND=31, COMMA=32, COLON=33, SEMICOLON=34, EXCLAMATIONPOINT=35, DOT=36, 
		HASH=37, AT=38, PERCENT=39, DOLLAR=40, AMPERSAND=41, ACCESS=42, ADDRESSOF=43, 
		ALIAS=44, AND=45, ATTRIBUTE=46, APPEND=47, AS=48, BEGINPROPERTY=49, BEGIN=50, 
		BINARY=51, BOOLEAN=52, BYVAL=53, BYREF=54, BYTE=55, CALL=56, CASE=57, 
		CDECL=58, CLASS=59, CLOSE=60, CONST=61, DATABASE=62, DATE=63, DECLARE=64, 
		DEFBOOL=65, DEFBYTE=66, DEFDATE=67, DEFDBL=68, DEFCUR=69, DEFINT=70, DEFLNG=71, 
		DEFLNGLNG=72, DEFLNGPTR=73, DEFOBJ=74, DEFSNG=75, DEFSTR=76, DEFVAR=77, 
		DIM=78, DO=79, DOUBLE=80, EACH=81, ELSE=82, ELSEIF=83, EMPTY=84, END_ENUM=85, 
		END_FUNCTION=86, END_IF=87, ENDPROPERTY=88, END_PROPERTY=89, END_SELECT=90, 
		END_SUB=91, END_TYPE=92, END_WITH=93, END=94, ENUM=95, EQV=96, ERASE=97, 
		ERROR=98, EVENT=99, EXIT_DO=100, EXIT_FOR=101, EXIT_FUNCTION=102, EXIT_PROPERTY=103, 
		EXIT_SUB=104, FALSE=105, FRIEND=106, FOR=107, FUNCTION=108, GET=109, GLOBAL=110, 
		GOSUB=111, GOTO=112, IF=113, IMP=114, IMPLEMENTS=115, IN=116, INPUT=117, 
		IS=118, INTEGER=119, LOCK=120, LONG=121, LOOP=122, LET=123, LIB=124, LIKE=125, 
		LINE_INPUT=126, LOCK_READ=127, LOCK_WRITE=128, LOCK_READ_WRITE=129, LSET=130, 
		ME=131, MOD=132, NAME=133, NEXT=134, NEW=135, NOT=136, NOTHING=137, NULL=138, 
		OBJECT=139, ON=140, ON_ERROR=141, ON_LOCAL_ERROR=142, OPEN=143, OPTIONAL=144, 
		OPTION_BASE=145, OPTION_EXPLICIT=146, OPTION_COMPARE=147, OPTION_PRIVATE_MODULE=148, 
		OR=149, OUTPUT=150, PARAMARRAY=151, PRESERVE=152, PRINT=153, PRIVATE=154, 
		PROPERTY_GET=155, PROPERTY_LET=156, PROPERTY_SET=157, PTRSAFE=158, PUBLIC=159, 
		PUT=160, RANDOM=161, RAISEEVENT=162, READ=163, READ_WRITE=164, REDIM=165, 
		REM=166, RESET=167, RESUME=168, RETURN=169, RSET=170, SEEK=171, SELECT=172, 
		SET=173, SHARED=174, SINGLE=175, SPC=176, STATIC=177, STEP=178, STOP=179, 
		STRING=180, SUB=181, TAB=182, TEXT=183, THEN=184, TO=185, TRUE=186, TYPE=187, 
		TYPEOF=188, UNLOCK=189, UNTIL=190, VARIANT=191, VERSION=192, WEND=193, 
		WHILE=194, WIDTH=195, WITH=196, WITHEVENTS=197, WRITE=198, XOR=199, CHOOSE=200, 
		ASC=201, CHR=202, FORMAT=203, INSTR=204, INSTRREV=205, LCASE=206, LEFT=207, 
		LEN=208, LTRIM=209, MID=210, REPLACE=211, RIGHT=212, RTRIM=213, SPACE=214, 
		SPLIT=215, STR=216, STRCOMP=217, STRCONV=218, STRREVERSE=219, TRIM=220, 
		UCASE=221, VAL=222, DATEADD=223, DATEDIFF=224, DATEPART=225, DATESERIAL=226, 
		DATEVALUE1=227, DAY=228, HOUR=229, MINUTE=230, MONTH=231, MONTHNAME1=232, 
		NOW=233, TIMESERIAL=234, TIMEVALUE1=235, WEEKDAY=236, WEEKDAYNAME=237, 
		YEAR=238, ABS=239, ATN=240, COS=241, EXP=242, FIX=243, INT=244, LOG=245, 
		RANDOMIZE=246, RND=247, ROUND=248, SGN=249, SIN=250, SQR=251, TAN=252, 
		ENVIRON=253, ISDATE=254, ISEMPTY=255, ISERROR=256, ISNULL=257, ISNUMERIC=258, 
		DDB=259, FV=260, IPMT=261, IRR=262, MIRR=263, NPER=264, NPV=265, PMT=266, 
		PPMT=267, PV=268, RATE=269, SLN=270, SYD=271, CHDIR=272, CHDRIVE=273, 
		CURDIR=274, DIR=275, FILEDATETIME=276, FILELEN=277, GETATTR=278, MKDIR=279, 
		SETATTR=280, CREATEOBJECT=281, ASCW=282, ROUNDUP=283, ROUNDDOWN=284, ASSIGN=285, 
		DIV=286, INTDIV=287, EQ=288, GEQ=289, GT=290, LEQ=291, LPAREN=292, LT=293, 
		MINUS=294, MULT=295, NEQ=296, PLUS=297, POW=298, RPAREN=299, L_SQUARE_BRACKET=300, 
		R_SQUARE_BRACKET=301, L_BRACE=302, R_BRACE=303, STRINGLITERAL=304, OCTLITERAL=305, 
		HEXLITERAL=306, FLOATLITERAL=307, INTEGERLITERAL=308, DATELITERAL=309, 
		NEWLINE=310, SINGLEQUOTE=311, UNDERSCORE=312, WS=313, GUIDLITERAL=314, 
		IDENTIFIER=315, LINE_CONTINUATION=316, BARE_HEX_LITERAL=317, ERRORCHAR=318;
	public static final int
		RULE_startRule = 0, RULE_module = 1, RULE_moduleHeader = 2, RULE_moduleConfigReferences = 3, 
		RULE_moduleConfigReferenceElement = 4, RULE_moduleConfig = 5, RULE_moduleConfigProperty = 6, 
		RULE_moduleConfigElement = 7, RULE_shortcut = 8, RULE_resource = 9, RULE_moduleAttributes = 10, 
		RULE_attributeStmt = 11, RULE_attributeName = 12, RULE_attributeValue = 13, 
		RULE_moduleDeclarations = 14, RULE_moduleOption = 15, RULE_moduleDeclarationsElement = 16, 
		RULE_moduleBody = 17, RULE_moduleBodyElement = 18, RULE_block = 19, RULE_unterminatedBlock = 20, 
		RULE_blockStmt = 21, RULE_mainBlockStmt = 22, RULE_fileStmt = 23, RULE_openStmt = 24, 
		RULE_pathName = 25, RULE_modeClause = 26, RULE_fileMode = 27, RULE_accessClause = 28, 
		RULE_access = 29, RULE_lock = 30, RULE_lenClause = 31, RULE_recLength = 32, 
		RULE_fileNumber = 33, RULE_markedFileNumber = 34, RULE_unmarkedFileNumber = 35, 
		RULE_closeStmt = 36, RULE_resetStmt = 37, RULE_fileNumberList = 38, RULE_seekStmt = 39, 
		RULE_position = 40, RULE_lockStmt = 41, RULE_recordRange = 42, RULE_startRecordNumber = 43, 
		RULE_endRecordNumber = 44, RULE_unlockStmt = 45, RULE_lineInputStmt = 46, 
		RULE_variableName = 47, RULE_widthStmt = 48, RULE_lineWidth = 49, RULE_debugPrintStmt = 50, 
		RULE_debugPrint = 51, RULE_debugModule = 52, RULE_debugPrintSub = 53, 
		RULE_printStmt = 54, RULE_outputList = 55, RULE_outputItem = 56, RULE_outputClause = 57, 
		RULE_charPosition = 58, RULE_outputExpression = 59, RULE_spcClause = 60, 
		RULE_spcNumber = 61, RULE_tabClause = 62, RULE_tabNumberClause = 63, RULE_tabNumber = 64, 
		RULE_writeStmt = 65, RULE_inputStmt = 66, RULE_inputList = 67, RULE_inputVariable = 68, 
		RULE_putStmt = 69, RULE_recordNumber = 70, RULE_data = 71, RULE_getStmt = 72, 
		RULE_variable = 73, RULE_constStmt = 74, RULE_constSubStmt = 75, RULE_declareStmt = 76, 
		RULE_argList = 77, RULE_arg = 78, RULE_argDefaultValue = 79, RULE_defDirective = 80, 
		RULE_defType = 81, RULE_letterSpec = 82, RULE_singleLetter = 83, RULE_universalLetterRange = 84, 
		RULE_letterRange = 85, RULE_doLoopStmt = 86, RULE_enumerationStmt = 87, 
		RULE_enumerationStmt_Constant = 88, RULE_endStmt = 89, RULE_eraseStmt = 90, 
		RULE_errorStmt = 91, RULE_eventStmt = 92, RULE_exitStmt = 93, RULE_forEachStmt = 94, 
		RULE_forNextStmt = 95, RULE_stepStmt = 96, RULE_functionStmt = 97, RULE_functionName = 98, 
		RULE_goSubStmt = 99, RULE_goToStmt = 100, RULE_ifStmt = 101, RULE_elseIfBlock = 102, 
		RULE_elseBlock = 103, RULE_singleLineIfStmt = 104, RULE_ifWithNonEmptyThen = 105, 
		RULE_ifWithEmptyThen = 106, RULE_singleLineElseClause = 107, RULE_listOrLabel = 108, 
		RULE_sameLineStatement = 109, RULE_booleanExpression = 110, RULE_implementsStmt = 111, 
		RULE_letStmt = 112, RULE_lsetStmt = 113, RULE_onErrorStmt = 114, RULE_onGoToStmt = 115, 
		RULE_onGoSubStmt = 116, RULE_propertyGetStmt = 117, RULE_propertySetStmt = 118, 
		RULE_propertyLetStmt = 119, RULE_raiseEventStmt = 120, RULE_eventArgumentList = 121, 
		RULE_eventArgument = 122, RULE_redimStmt = 123, RULE_redimDeclarationList = 124, 
		RULE_redimVariableDeclaration = 125, RULE_midStatement = 126, RULE_modeSpecifier = 127, 
		RULE_integerExpression = 128, RULE_callStmt = 129, RULE_resumeStmt = 130, 
		RULE_returnStmt = 131, RULE_rsetStmt = 132, RULE_stopStmt = 133, RULE_nameStmt = 134, 
		RULE_selectCaseStmt = 135, RULE_selectExpression = 136, RULE_caseClause = 137, 
		RULE_caseElseClause = 138, RULE_rangeClause = 139, RULE_selectStartValue = 140, 
		RULE_selectEndValue = 141, RULE_setStmt = 142, RULE_subStmt = 143, RULE_subroutineName = 144, 
		RULE_udtDeclaration = 145, RULE_udtMemberList = 146, RULE_udtMember = 147, 
		RULE_untypedNameMemberDeclaration = 148, RULE_reservedNameMemberDeclaration = 149, 
		RULE_optionalArrayClause = 150, RULE_arrayDim = 151, RULE_boundsList = 152, 
		RULE_dimSpec = 153, RULE_lowerBound = 154, RULE_upperBound = 155, RULE_constantExpression = 156, 
		RULE_variableStmt = 157, RULE_variableListStmt = 158, RULE_variableSubStmt = 159, 
		RULE_whileWendStmt = 160, RULE_withStmt = 161, RULE_lineSpecialForm = 162, 
		RULE_circleSpecialForm = 163, RULE_scaleSpecialForm = 164, RULE_pSetSpecialForm = 165, 
		RULE_tuple = 166, RULE_lineSpecialFormOption = 167, RULE_subscripts = 168, 
		RULE_subscript = 169, RULE_unrestrictedIdentifier = 170, RULE_legalLabelIdentifier = 171, 
		RULE_identifier = 172, RULE_untypedIdentifier = 173, RULE_typedIdentifier = 174, 
		RULE_identifierValue = 175, RULE_foreignName = 176, RULE_foreignIdentifier = 177, 
		RULE_asTypeClause = 178, RULE_baseType = 179, RULE_comparisonOperator = 180, 
		RULE_complexType = 181, RULE_fieldLength = 182, RULE_statementLabelDefinition = 183, 
		RULE_identifierStatementLabel = 184, RULE_standaloneLineNumberLabel = 185, 
		RULE_combinedLabels = 186, RULE_lineNumberLabel = 187, RULE_numberLiteral = 188, 
		RULE_type = 189, RULE_typeHint = 190, RULE_visibility = 191, RULE_expression = 192, 
		RULE_literalExpression = 193, RULE_literalIdentifier = 194, RULE_booleanLiteralIdentifier = 195, 
		RULE_objectLiteralIdentifier = 196, RULE_variantLiteralIdentifier = 197, 
		RULE_lExpression = 198, RULE_builtInType = 199, RULE_argumentList = 200, 
		RULE_requiredArgument = 201, RULE_argument = 202, RULE_positionalArgument = 203, 
		RULE_namedArgument = 204, RULE_missingArgument = 205, RULE_argumentExpression = 206, 
		RULE_lowerBoundArgumentExpression = 207, RULE_upperBoundArgumentExpression = 208, 
		RULE_addressOfExpression = 209, RULE_keyword = 210, RULE_markerKeyword = 211, 
		RULE_statementKeyword = 212, RULE_standardFunctionKeyword = 213, RULE_endOfLine = 214, 
		RULE_endOfStatement = 215, RULE_individualNonEOFEndOfStatement = 216, 
		RULE_commentOrAnnotation = 217, RULE_remComment = 218, RULE_comment = 219, 
		RULE_commentBody = 220, RULE_annotationList = 221, RULE_annotation = 222, 
		RULE_annotationName = 223, RULE_annotationArgList = 224, RULE_annotationArg = 225, 
		RULE_mandatoryLineContinuation = 226, RULE_whiteSpace = 227;
	public static final String[] ruleNames = {
		"startRule", "module", "moduleHeader", "moduleConfigReferences", "moduleConfigReferenceElement", 
		"moduleConfig", "moduleConfigProperty", "moduleConfigElement", "shortcut", 
		"resource", "moduleAttributes", "attributeStmt", "attributeName", "attributeValue", 
		"moduleDeclarations", "moduleOption", "moduleDeclarationsElement", "moduleBody", 
		"moduleBodyElement", "block", "unterminatedBlock", "blockStmt", "mainBlockStmt", 
		"fileStmt", "openStmt", "pathName", "modeClause", "fileMode", "accessClause", 
		"access", "lock", "lenClause", "recLength", "fileNumber", "markedFileNumber", 
		"unmarkedFileNumber", "closeStmt", "resetStmt", "fileNumberList", "seekStmt", 
		"position", "lockStmt", "recordRange", "startRecordNumber", "endRecordNumber", 
		"unlockStmt", "lineInputStmt", "variableName", "widthStmt", "lineWidth", 
		"debugPrintStmt", "debugPrint", "debugModule", "debugPrintSub", "printStmt", 
		"outputList", "outputItem", "outputClause", "charPosition", "outputExpression", 
		"spcClause", "spcNumber", "tabClause", "tabNumberClause", "tabNumber", 
		"writeStmt", "inputStmt", "inputList", "inputVariable", "putStmt", "recordNumber", 
		"data", "getStmt", "variable", "constStmt", "constSubStmt", "declareStmt", 
		"argList", "arg", "argDefaultValue", "defDirective", "defType", "letterSpec", 
		"singleLetter", "universalLetterRange", "letterRange", "doLoopStmt", "enumerationStmt", 
		"enumerationStmt_Constant", "endStmt", "eraseStmt", "errorStmt", "eventStmt", 
		"exitStmt", "forEachStmt", "forNextStmt", "stepStmt", "functionStmt", 
		"functionName", "goSubStmt", "goToStmt", "ifStmt", "elseIfBlock", "elseBlock", 
		"singleLineIfStmt", "ifWithNonEmptyThen", "ifWithEmptyThen", "singleLineElseClause", 
		"listOrLabel", "sameLineStatement", "booleanExpression", "implementsStmt", 
		"letStmt", "lsetStmt", "onErrorStmt", "onGoToStmt", "onGoSubStmt", "propertyGetStmt", 
		"propertySetStmt", "propertyLetStmt", "raiseEventStmt", "eventArgumentList", 
		"eventArgument", "redimStmt", "redimDeclarationList", "redimVariableDeclaration", 
		"midStatement", "modeSpecifier", "integerExpression", "callStmt", "resumeStmt", 
		"returnStmt", "rsetStmt", "stopStmt", "nameStmt", "selectCaseStmt", "selectExpression", 
		"caseClause", "caseElseClause", "rangeClause", "selectStartValue", "selectEndValue", 
		"setStmt", "subStmt", "subroutineName", "udtDeclaration", "udtMemberList", 
		"udtMember", "untypedNameMemberDeclaration", "reservedNameMemberDeclaration", 
		"optionalArrayClause", "arrayDim", "boundsList", "dimSpec", "lowerBound", 
		"upperBound", "constantExpression", "variableStmt", "variableListStmt", 
		"variableSubStmt", "whileWendStmt", "withStmt", "lineSpecialForm", "circleSpecialForm", 
		"scaleSpecialForm", "pSetSpecialForm", "tuple", "lineSpecialFormOption", 
		"subscripts", "subscript", "unrestrictedIdentifier", "legalLabelIdentifier", 
		"identifier", "untypedIdentifier", "typedIdentifier", "identifierValue", 
		"foreignName", "foreignIdentifier", "asTypeClause", "baseType", "comparisonOperator", 
		"complexType", "fieldLength", "statementLabelDefinition", "identifierStatementLabel", 
		"standaloneLineNumberLabel", "combinedLabels", "lineNumberLabel", "numberLiteral", 
		"type", "typeHint", "visibility", "expression", "literalExpression", "literalIdentifier", 
		"booleanLiteralIdentifier", "objectLiteralIdentifier", "variantLiteralIdentifier", 
		"lExpression", "builtInType", "argumentList", "requiredArgument", "argument", 
		"positionalArgument", "namedArgument", "missingArgument", "argumentExpression", 
		"lowerBoundArgumentExpression", "upperBoundArgumentExpression", "addressOfExpression", 
		"keyword", "markerKeyword", "statementKeyword", "standardFunctionKeyword", 
		"endOfLine", "endOfStatement", "individualNonEOFEndOfStatement", "commentOrAnnotation", 
		"remComment", "comment", "commentBody", "annotationList", "annotation", 
		"annotationName", "annotationArgList", "annotationArg", "mandatoryLineContinuation", 
		"whiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "','", "':'", "';'", "'!'", 
		"'.'", "'#'", "'@'", "'%'", "'$'", "'&'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "':='", "'/'", 
		"'\\'", "'='", null, "'>'", null, "'('", "'<'", "'-'", "'*'", null, "'+'", 
		"'^'", "')'", "'['", "']'", "'{'", "'}'", null, null, null, null, null, 
		null, null, "'''", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANY", "ARRAY", "CBOOL", "CBYTE", "CCUR", "CDATE", "CDBL", "CDEC", 
		"CINT", "CIRCLE", "CLNG", "CLNGLNG", "CLNGPTR", "CSNG", "CSTR", "CURRENCY", 
		"CVAR", "CVERR", "DEBUG", "DOEVENTS", "EXIT", "INPUTB", "LBOUND", "LENB", 
		"LONGLONG", "LONGPTR", "MIDB", "OPTION", "PSET", "SCALE", "UBOUND", "COMMA", 
		"COLON", "SEMICOLON", "EXCLAMATIONPOINT", "DOT", "HASH", "AT", "PERCENT", 
		"DOLLAR", "AMPERSAND", "ACCESS", "ADDRESSOF", "ALIAS", "AND", "ATTRIBUTE", 
		"APPEND", "AS", "BEGINPROPERTY", "BEGIN", "BINARY", "BOOLEAN", "BYVAL", 
		"BYREF", "BYTE", "CALL", "CASE", "CDECL", "CLASS", "CLOSE", "CONST", "DATABASE", 
		"DATE", "DECLARE", "DEFBOOL", "DEFBYTE", "DEFDATE", "DEFDBL", "DEFCUR", 
		"DEFINT", "DEFLNG", "DEFLNGLNG", "DEFLNGPTR", "DEFOBJ", "DEFSNG", "DEFSTR", 
		"DEFVAR", "DIM", "DO", "DOUBLE", "EACH", "ELSE", "ELSEIF", "EMPTY", "END_ENUM", 
		"END_FUNCTION", "END_IF", "ENDPROPERTY", "END_PROPERTY", "END_SELECT", 
		"END_SUB", "END_TYPE", "END_WITH", "END", "ENUM", "EQV", "ERASE", "ERROR", 
		"EVENT", "EXIT_DO", "EXIT_FOR", "EXIT_FUNCTION", "EXIT_PROPERTY", "EXIT_SUB", 
		"FALSE", "FRIEND", "FOR", "FUNCTION", "GET", "GLOBAL", "GOSUB", "GOTO", 
		"IF", "IMP", "IMPLEMENTS", "IN", "INPUT", "IS", "INTEGER", "LOCK", "LONG", 
		"LOOP", "LET", "LIB", "LIKE", "LINE_INPUT", "LOCK_READ", "LOCK_WRITE", 
		"LOCK_READ_WRITE", "LSET", "ME", "MOD", "NAME", "NEXT", "NEW", "NOT", 
		"NOTHING", "NULL", "OBJECT", "ON", "ON_ERROR", "ON_LOCAL_ERROR", "OPEN", 
		"OPTIONAL", "OPTION_BASE", "OPTION_EXPLICIT", "OPTION_COMPARE", "OPTION_PRIVATE_MODULE", 
		"OR", "OUTPUT", "PARAMARRAY", "PRESERVE", "PRINT", "PRIVATE", "PROPERTY_GET", 
		"PROPERTY_LET", "PROPERTY_SET", "PTRSAFE", "PUBLIC", "PUT", "RANDOM", 
		"RAISEEVENT", "READ", "READ_WRITE", "REDIM", "REM", "RESET", "RESUME", 
		"RETURN", "RSET", "SEEK", "SELECT", "SET", "SHARED", "SINGLE", "SPC", 
		"STATIC", "STEP", "STOP", "STRING", "SUB", "TAB", "TEXT", "THEN", "TO", 
		"TRUE", "TYPE", "TYPEOF", "UNLOCK", "UNTIL", "VARIANT", "VERSION", "WEND", 
		"WHILE", "WIDTH", "WITH", "WITHEVENTS", "WRITE", "XOR", "CHOOSE", "ASC", 
		"CHR", "FORMAT", "INSTR", "INSTRREV", "LCASE", "LEFT", "LEN", "LTRIM", 
		"MID", "REPLACE", "RIGHT", "RTRIM", "SPACE", "SPLIT", "STR", "STRCOMP", 
		"STRCONV", "STRREVERSE", "TRIM", "UCASE", "VAL", "DATEADD", "DATEDIFF", 
		"DATEPART", "DATESERIAL", "DATEVALUE1", "DAY", "HOUR", "MINUTE", "MONTH", 
		"MONTHNAME1", "NOW", "TIMESERIAL", "TIMEVALUE1", "WEEKDAY", "WEEKDAYNAME", 
		"YEAR", "ABS", "ATN", "COS", "EXP", "FIX", "INT", "LOG", "RANDOMIZE", 
		"RND", "ROUND", "SGN", "SIN", "SQR", "TAN", "ENVIRON", "ISDATE", "ISEMPTY", 
		"ISERROR", "ISNULL", "ISNUMERIC", "DDB", "FV", "IPMT", "IRR", "MIRR", 
		"NPER", "NPV", "PMT", "PPMT", "PV", "RATE", "SLN", "SYD", "CHDIR", "CHDRIVE", 
		"CURDIR", "DIR", "FILEDATETIME", "FILELEN", "GETATTR", "MKDIR", "SETATTR", 
		"CREATEOBJECT", "ASCW", "ROUNDUP", "ROUNDDOWN", "ASSIGN", "DIV", "INTDIV", 
		"EQ", "GEQ", "GT", "LEQ", "LPAREN", "LT", "MINUS", "MULT", "NEQ", "PLUS", 
		"POW", "RPAREN", "L_SQUARE_BRACKET", "R_SQUARE_BRACKET", "L_BRACE", "R_BRACE", 
		"STRINGLITERAL", "OCTLITERAL", "HEXLITERAL", "FLOATLITERAL", "INTEGERLITERAL", 
		"DATELITERAL", "NEWLINE", "SINGLEQUOTE", "UNDERSCORE", "WS", "GUIDLITERAL", 
		"IDENTIFIER", "LINE_CONTINUATION", "BARE_HEX_LITERAL", "ERRORCHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VBAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VBAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartRuleContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VBAParser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			module();
			setState(457);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public List<ModuleAttributesContext> moduleAttributes() {
			return getRuleContexts(ModuleAttributesContext.class);
		}
		public ModuleAttributesContext moduleAttributes(int i) {
			return getRuleContext(ModuleAttributesContext.class,i);
		}
		public ModuleDeclarationsContext moduleDeclarations() {
			return getRuleContext(ModuleDeclarationsContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public ModuleHeaderContext moduleHeader() {
			return getRuleContext(ModuleHeaderContext.class,0);
		}
		public ModuleConfigReferencesContext moduleConfigReferences() {
			return getRuleContext(ModuleConfigReferencesContext.class,0);
		}
		public ModuleConfigContext moduleConfig() {
			return getRuleContext(ModuleConfigContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(459);
				endOfStatement();
				}
				break;
			}
			setState(462);
			moduleAttributes();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(463);
				moduleHeader();
				}
			}

			setState(466);
			moduleAttributes();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT) {
				{
				setState(467);
				moduleConfigReferences();
				}
			}

			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(470);
				moduleConfig();
				}
			}

			setState(473);
			moduleAttributes();
			setState(474);
			moduleDeclarations();
			setState(475);
			moduleAttributes();
			setState(476);
			moduleBody();
			setState(477);
			moduleAttributes();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(478);
				whiteSpace();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleHeaderContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(VBAParser.VERSION, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(VBAParser.CLASS, 0); }
		public ModuleHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleHeaderContext moduleHeader() throws RecognitionException {
		ModuleHeaderContext _localctx = new ModuleHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(VERSION);
			setState(482);
			whiteSpace();
			setState(483);
			numberLiteral();
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(484);
				whiteSpace();
				}
				break;
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(487);
				match(CLASS);
				}
			}

			setState(490);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigReferencesContext extends ParserRuleContext {
		public List<ModuleConfigReferenceElementContext> moduleConfigReferenceElement() {
			return getRuleContexts(ModuleConfigReferenceElementContext.class);
		}
		public ModuleConfigReferenceElementContext moduleConfigReferenceElement(int i) {
			return getRuleContext(ModuleConfigReferenceElementContext.class,i);
		}
		public ModuleConfigReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfigReferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleConfigReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleConfigReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleConfigReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigReferencesContext moduleConfigReferences() throws RecognitionException {
		ModuleConfigReferencesContext _localctx = new ModuleConfigReferencesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleConfigReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(492);
				moduleConfigReferenceElement();
				}
				}
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OBJECT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigReferenceElementContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(VBAParser.OBJECT, 0); }
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public List<TerminalNode> STRINGLITERAL() { return getTokens(VBAParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(VBAParser.STRINGLITERAL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(VBAParser.SEMICOLON, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ModuleConfigReferenceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfigReferenceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleConfigReferenceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleConfigReferenceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleConfigReferenceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigReferenceElementContext moduleConfigReferenceElement() throws RecognitionException {
		ModuleConfigReferenceElementContext _localctx = new ModuleConfigReferenceElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleConfigReferenceElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(OBJECT);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(498);
				whiteSpace();
				}
			}

			setState(501);
			match(EQ);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(502);
				whiteSpace();
				}
			}

			setState(505);
			match(STRINGLITERAL);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(506);
				whiteSpace();
				}
			}

			setState(509);
			match(SEMICOLON);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(510);
				whiteSpace();
				}
			}

			setState(513);
			match(STRINGLITERAL);
			setState(514);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(VBAParser.BEGIN, 0); }
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public TerminalNode END() { return getToken(VBAParser.END, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public List<ModuleConfigContext> moduleConfig() {
			return getRuleContexts(ModuleConfigContext.class);
		}
		public ModuleConfigContext moduleConfig(int i) {
			return getRuleContext(ModuleConfigContext.class,i);
		}
		public List<ModuleConfigPropertyContext> moduleConfigProperty() {
			return getRuleContexts(ModuleConfigPropertyContext.class);
		}
		public ModuleConfigPropertyContext moduleConfigProperty(int i) {
			return getRuleContext(ModuleConfigPropertyContext.class,i);
		}
		public List<ModuleConfigElementContext> moduleConfigElement() {
			return getRuleContexts(ModuleConfigElementContext.class);
		}
		public ModuleConfigElementContext moduleConfigElement(int i) {
			return getRuleContext(ModuleConfigElementContext.class,i);
		}
		public TerminalNode GUIDLITERAL() { return getToken(VBAParser.GUIDLITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ModuleConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigContext moduleConfig() throws RecognitionException {
		ModuleConfigContext _localctx = new ModuleConfigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moduleConfig);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(BEGIN);
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(517);
				whiteSpace();
				setState(520);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GUIDLITERAL:
					{
					setState(518);
					match(GUIDLITERAL);
					}
					break;
				case ANY:
				case ARRAY:
				case CBOOL:
				case CBYTE:
				case CCUR:
				case CDATE:
				case CDBL:
				case CDEC:
				case CINT:
				case CLNG:
				case CLNGLNG:
				case CLNGPTR:
				case CSNG:
				case CSTR:
				case CURRENCY:
				case CVAR:
				case CVERR:
				case DEBUG:
				case DOEVENTS:
				case INPUTB:
				case LBOUND:
				case LENB:
				case LONGLONG:
				case LONGPTR:
				case MIDB:
				case PSET:
				case UBOUND:
				case EXCLAMATIONPOINT:
				case DOT:
				case HASH:
				case ACCESS:
				case ADDRESSOF:
				case ALIAS:
				case AND:
				case ATTRIBUTE:
				case APPEND:
				case BEGINPROPERTY:
				case BEGIN:
				case BINARY:
				case BOOLEAN:
				case BYVAL:
				case BYREF:
				case BYTE:
				case CLASS:
				case CLOSE:
				case DATABASE:
				case DATE:
				case DOUBLE:
				case EMPTY:
				case ENDPROPERTY:
				case END:
				case EQV:
				case ERROR:
				case FALSE:
				case GET:
				case IMP:
				case IN:
				case INPUT:
				case IS:
				case INTEGER:
				case LOCK:
				case LONG:
				case LIB:
				case LIKE:
				case LINE_INPUT:
				case LOCK_READ:
				case LOCK_WRITE:
				case LOCK_READ_WRITE:
				case ME:
				case MOD:
				case NAME:
				case NEW:
				case NOT:
				case NOTHING:
				case NULL:
				case OBJECT:
				case ON_ERROR:
				case OPEN:
				case OPTIONAL:
				case OR:
				case OUTPUT:
				case PARAMARRAY:
				case PRESERVE:
				case PRINT:
				case PTRSAFE:
				case PUT:
				case RANDOM:
				case READ:
				case READ_WRITE:
				case REM:
				case RESET:
				case SEEK:
				case SHARED:
				case SINGLE:
				case SPC:
				case STEP:
				case STRING:
				case TAB:
				case TEXT:
				case THEN:
				case TO:
				case TRUE:
				case TYPEOF:
				case UNLOCK:
				case UNTIL:
				case VARIANT:
				case VERSION:
				case WIDTH:
				case WITHEVENTS:
				case WRITE:
				case XOR:
				case CHOOSE:
				case ASC:
				case CHR:
				case FORMAT:
				case INSTR:
				case INSTRREV:
				case LCASE:
				case LEFT:
				case LEN:
				case LTRIM:
				case MID:
				case REPLACE:
				case RIGHT:
				case RTRIM:
				case SPACE:
				case SPLIT:
				case STR:
				case STRCOMP:
				case STRCONV:
				case STRREVERSE:
				case TRIM:
				case UCASE:
				case VAL:
				case DATEADD:
				case DATEDIFF:
				case DATEPART:
				case DATESERIAL:
				case DATEVALUE1:
				case DAY:
				case HOUR:
				case MINUTE:
				case MONTH:
				case MONTHNAME1:
				case NOW:
				case TIMESERIAL:
				case TIMEVALUE1:
				case WEEKDAY:
				case WEEKDAYNAME:
				case YEAR:
				case ABS:
				case ATN:
				case COS:
				case EXP:
				case FIX:
				case INT:
				case LOG:
				case RANDOMIZE:
				case RND:
				case ROUND:
				case SGN:
				case SIN:
				case SQR:
				case TAN:
				case ENVIRON:
				case ISDATE:
				case ISEMPTY:
				case ISERROR:
				case ISNULL:
				case ISNUMERIC:
				case DDB:
				case FV:
				case IPMT:
				case IRR:
				case MIRR:
				case NPER:
				case NPV:
				case PMT:
				case PPMT:
				case PV:
				case RATE:
				case SLN:
				case SYD:
				case CHDIR:
				case CHDRIVE:
				case CURDIR:
				case DIR:
				case FILEDATETIME:
				case FILELEN:
				case GETATTR:
				case MKDIR:
				case SETATTR:
				case CREATEOBJECT:
				case ASCW:
				case ROUNDUP:
				case ROUNDDOWN:
				case LPAREN:
				case MINUS:
				case L_SQUARE_BRACKET:
				case STRINGLITERAL:
				case OCTLITERAL:
				case HEXLITERAL:
				case FLOATLITERAL:
				case INTEGERLITERAL:
				case DATELITERAL:
				case WS:
				case IDENTIFIER:
				case LINE_CONTINUATION:
					{
					setState(519);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(522);
				whiteSpace();
				setState(523);
				unrestrictedIdentifier();
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(524);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
			setState(529);
			endOfStatement();
			setState(533); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(530);
						moduleConfig();
						}
						break;
					case 2:
						{
						setState(531);
						moduleConfigProperty();
						}
						break;
					case 3:
						{
						setState(532);
						moduleConfigElement();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(537);
			match(END);
			setState(538);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigPropertyContext extends ParserRuleContext {
		public TerminalNode BEGINPROPERTY() { return getToken(VBAParser.BEGINPROPERTY, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public TerminalNode ENDPROPERTY() { return getToken(VBAParser.ENDPROPERTY, 0); }
		public TerminalNode GUIDLITERAL() { return getToken(VBAParser.GUIDLITERAL, 0); }
		public List<ModuleConfigPropertyContext> moduleConfigProperty() {
			return getRuleContexts(ModuleConfigPropertyContext.class);
		}
		public ModuleConfigPropertyContext moduleConfigProperty(int i) {
			return getRuleContext(ModuleConfigPropertyContext.class,i);
		}
		public List<ModuleConfigElementContext> moduleConfigElement() {
			return getRuleContexts(ModuleConfigElementContext.class);
		}
		public ModuleConfigElementContext moduleConfigElement(int i) {
			return getRuleContext(ModuleConfigElementContext.class,i);
		}
		public ModuleConfigPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfigProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleConfigProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleConfigProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleConfigProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigPropertyContext moduleConfigProperty() throws RecognitionException {
		ModuleConfigPropertyContext _localctx = new ModuleConfigPropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moduleConfigProperty);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(BEGINPROPERTY);
			setState(541);
			whiteSpace();
			setState(542);
			unrestrictedIdentifier();
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(543);
				whiteSpace();
				setState(544);
				match(GUIDLITERAL);
				}
				break;
			}
			setState(548);
			endOfStatement();
			setState(551); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(549);
						moduleConfigProperty();
						}
						break;
					case 2:
						{
						setState(550);
						moduleConfigElement();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(553); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(555);
			match(ENDPROPERTY);
			setState(556);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigElementContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public ShortcutContext shortcut() {
			return getRuleContext(ShortcutContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ModuleConfigElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfigElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleConfigElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleConfigElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleConfigElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigElementContext moduleConfigElement() throws RecognitionException {
		ModuleConfigElementContext _localctx = new ModuleConfigElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleConfigElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(558);
				unrestrictedIdentifier();
				}
				break;
			case 2:
				{
				setState(559);
				lExpression(0);
				}
				break;
			}
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(562);
				whiteSpace();
				}
			}

			setState(565);
			match(EQ);
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(566);
				whiteSpace();
				}
				break;
			}
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(569);
				shortcut();
				}
				break;
			case 2:
				{
				setState(570);
				resource();
				}
				break;
			case 3:
				{
				setState(571);
				expression(0);
				}
				break;
			}
			setState(574);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortcutContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(VBAParser.POW, 0); }
		public SingleLetterContext singleLetter() {
			return getRuleContext(SingleLetterContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(VBAParser.L_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VBAParser.IDENTIFIER, 0); }
		public TerminalNode R_BRACE() { return getToken(VBAParser.R_BRACE, 0); }
		public TerminalNode PERCENT() { return getToken(VBAParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(VBAParser.PLUS, 0); }
		public ShortcutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterShortcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitShortcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitShortcut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortcutContext shortcut() throws RecognitionException {
		ShortcutContext _localctx = new ShortcutContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shortcut);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(576);
				match(POW);
				setState(577);
				singleLetter();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(585);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PERCENT:
					{
					setState(578);
					match(PERCENT);
					}
					break;
				case PLUS:
				case POW:
				case L_BRACE:
					{
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PLUS) {
						{
						setState(579);
						match(PLUS);
						}
					}

					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POW) {
						{
						setState(582);
						match(POW);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(587);
				match(L_BRACE);
				setState(588);
				match(IDENTIFIER);
				setState(589);
				match(R_BRACE);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VBAParser.COLON, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode BARE_HEX_LITERAL() { return getToken(VBAParser.BARE_HEX_LITERAL, 0); }
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(VBAParser.DOLLAR, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(592);
				match(DOLLAR);
				}
			}

			setState(595);
			expression(0);
			setState(596);
			match(COLON);
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCTLITERAL:
			case HEXLITERAL:
			case FLOATLITERAL:
			case INTEGERLITERAL:
				{
				setState(597);
				numberLiteral();
				}
				break;
			case BARE_HEX_LITERAL:
				{
				setState(598);
				match(BARE_HEX_LITERAL);
				}
				break;
			case ANY:
			case ARRAY:
			case CBOOL:
			case CBYTE:
			case CCUR:
			case CDATE:
			case CDBL:
			case CDEC:
			case CINT:
			case CLNG:
			case CLNGLNG:
			case CLNGPTR:
			case CSNG:
			case CSTR:
			case CURRENCY:
			case CVAR:
			case CVERR:
			case DEBUG:
			case DOEVENTS:
			case EXIT:
			case INPUTB:
			case LBOUND:
			case LENB:
			case LONGLONG:
			case LONGPTR:
			case MIDB:
			case OPTION:
			case PSET:
			case UBOUND:
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPEND:
			case AS:
			case BEGINPROPERTY:
			case BEGIN:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CASE:
			case CLASS:
			case CLOSE:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFLNGLNG:
			case DEFLNGPTR:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DIM:
			case DO:
			case DOUBLE:
			case ELSE:
			case ELSEIF:
			case ENDPROPERTY:
			case END_SELECT:
			case END_WITH:
			case END:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case EXIT_DO:
			case EXIT_FOR:
			case EXIT_FUNCTION:
			case EXIT_PROPERTY:
			case EXIT_SUB:
			case FALSE:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case LOCK:
			case LONG:
			case LOOP:
			case LET:
			case LIB:
			case LIKE:
			case LINE_INPUT:
			case LOCK_READ:
			case LOCK_WRITE:
			case LOCK_READ_WRITE:
			case LSET:
			case ME:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case OBJECT:
			case ON:
			case ON_ERROR:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PTRSAFE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RAISEEVENT:
			case READ:
			case READ_WRITE:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RSET:
			case SEEK:
			case SELECT:
			case SET:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STOP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case L_SQUARE_BRACKET:
			case IDENTIFIER:
				{
				setState(599);
				unrestrictedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleAttributesContext extends ParserRuleContext {
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public ModuleAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleAttributesContext moduleAttributes() throws RecognitionException {
		ModuleAttributesContext _localctx = new ModuleAttributesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_moduleAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602);
					attributeStmt();
					setState(603);
					endOfStatement();
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeStmtContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(VBAParser.ATTRIBUTE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public List<AttributeValueContext> attributeValue() {
			return getRuleContexts(AttributeValueContext.class);
		}
		public AttributeValueContext attributeValue(int i) {
			return getRuleContext(AttributeValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public AttributeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAttributeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAttributeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAttributeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeStmtContext attributeStmt() throws RecognitionException {
		AttributeStmtContext _localctx = new AttributeStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(ATTRIBUTE);
			setState(611);
			whiteSpace();
			setState(612);
			attributeName();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(613);
				whiteSpace();
				}
			}

			setState(616);
			match(EQ);
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(617);
				whiteSpace();
				}
				break;
			}
			setState(620);
			attributeValue();
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(621);
						whiteSpace();
						}
					}

					setState(624);
					match(COMMA);
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(625);
						whiteSpace();
						}
						break;
					}
					setState(628);
					attributeValue();
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			lExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationsContext extends ParserRuleContext {
		public List<ModuleDeclarationsElementContext> moduleDeclarationsElement() {
			return getRuleContexts(ModuleDeclarationsElementContext.class);
		}
		public ModuleDeclarationsElementContext moduleDeclarationsElement(int i) {
			return getRuleContext(ModuleDeclarationsElementContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public ModuleDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationsContext moduleDeclarations() throws RecognitionException {
		ModuleDeclarationsContext _localctx = new ModuleDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_moduleDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(638);
					moduleDeclarationsElement();
					setState(639);
					endOfStatement();
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleOptionContext extends ParserRuleContext {
		public ModuleOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleOption; }
	 
		public ModuleOptionContext() { }
		public void copyFrom(ModuleOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptionExplicitStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_EXPLICIT() { return getToken(VBAParser.OPTION_EXPLICIT, 0); }
		public OptionExplicitStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOptionExplicitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOptionExplicitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOptionExplicitStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionBaseStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_BASE() { return getToken(VBAParser.OPTION_BASE, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public OptionBaseStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOptionBaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOptionBaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOptionBaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionPrivateModuleStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_PRIVATE_MODULE() { return getToken(VBAParser.OPTION_PRIVATE_MODULE, 0); }
		public OptionPrivateModuleStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOptionPrivateModuleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOptionPrivateModuleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOptionPrivateModuleStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionCompareStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_COMPARE() { return getToken(VBAParser.OPTION_COMPARE, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(VBAParser.BINARY, 0); }
		public TerminalNode TEXT() { return getToken(VBAParser.TEXT, 0); }
		public TerminalNode DATABASE() { return getToken(VBAParser.DATABASE, 0); }
		public OptionCompareStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOptionCompareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOptionCompareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOptionCompareStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleOptionContext moduleOption() throws RecognitionException {
		ModuleOptionContext _localctx = new ModuleOptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_moduleOption);
		int _la;
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTION_BASE:
				_localctx = new OptionBaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				match(OPTION_BASE);
				setState(647);
				whiteSpace();
				setState(648);
				numberLiteral();
				}
				break;
			case OPTION_COMPARE:
				_localctx = new OptionCompareStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(OPTION_COMPARE);
				setState(651);
				whiteSpace();
				setState(652);
				_la = _input.LA(1);
				if ( !(_la==BINARY || _la==DATABASE || _la==TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case OPTION_EXPLICIT:
				_localctx = new OptionExplicitStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				match(OPTION_EXPLICIT);
				}
				break;
			case OPTION_PRIVATE_MODULE:
				_localctx = new OptionPrivateModuleStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				match(OPTION_PRIVATE_MODULE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationsElementContext extends ParserRuleContext {
		public AttributeStmtContext attributeStmt() {
			return getRuleContext(AttributeStmtContext.class,0);
		}
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public DefDirectiveContext defDirective() {
			return getRuleContext(DefDirectiveContext.class,0);
		}
		public EnumerationStmtContext enumerationStmt() {
			return getRuleContext(EnumerationStmtContext.class,0);
		}
		public EventStmtContext eventStmt() {
			return getRuleContext(EventStmtContext.class,0);
		}
		public ConstStmtContext constStmt() {
			return getRuleContext(ConstStmtContext.class,0);
		}
		public ImplementsStmtContext implementsStmt() {
			return getRuleContext(ImplementsStmtContext.class,0);
		}
		public VariableStmtContext variableStmt() {
			return getRuleContext(VariableStmtContext.class,0);
		}
		public ModuleOptionContext moduleOption() {
			return getRuleContext(ModuleOptionContext.class,0);
		}
		public UdtDeclarationContext udtDeclaration() {
			return getRuleContext(UdtDeclarationContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ModuleDeclarationsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclarationsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleDeclarationsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleDeclarationsElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleDeclarationsElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationsElementContext moduleDeclarationsElement() throws RecognitionException {
		ModuleDeclarationsElementContext _localctx = new ModuleDeclarationsElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_moduleDeclarationsElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(658);
				whiteSpace();
				}
			}

			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(661);
				attributeStmt();
				}
				break;
			case 2:
				{
				setState(662);
				declareStmt();
				}
				break;
			case 3:
				{
				setState(663);
				defDirective();
				}
				break;
			case 4:
				{
				setState(664);
				enumerationStmt();
				}
				break;
			case 5:
				{
				setState(665);
				eventStmt();
				}
				break;
			case 6:
				{
				setState(666);
				constStmt();
				}
				break;
			case 7:
				{
				setState(667);
				implementsStmt();
				}
				break;
			case 8:
				{
				setState(668);
				variableStmt();
				}
				break;
			case 9:
				{
				setState(669);
				moduleOption();
				}
				break;
			case 10:
				{
				setState(670);
				udtDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public List<ModuleBodyElementContext> moduleBodyElement() {
			return getRuleContexts(ModuleBodyElementContext.class);
		}
		public ModuleBodyElementContext moduleBodyElement(int i) {
			return getRuleContext(ModuleBodyElementContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(673);
				whiteSpace();
				}
				break;
			}
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (FUNCTION - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PROPERTY_GET - 106)) | (1L << (PROPERTY_LET - 106)) | (1L << (PROPERTY_SET - 106)) | (1L << (PUBLIC - 106)))) != 0) || _la==STATIC || _la==SUB) {
				{
				{
				setState(676);
				moduleBodyElement();
				setState(677);
				endOfStatement();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyElementContext extends ParserRuleContext {
		public FunctionStmtContext functionStmt() {
			return getRuleContext(FunctionStmtContext.class,0);
		}
		public PropertyGetStmtContext propertyGetStmt() {
			return getRuleContext(PropertyGetStmtContext.class,0);
		}
		public PropertySetStmtContext propertySetStmt() {
			return getRuleContext(PropertySetStmtContext.class,0);
		}
		public PropertyLetStmtContext propertyLetStmt() {
			return getRuleContext(PropertyLetStmtContext.class,0);
		}
		public SubStmtContext subStmt() {
			return getRuleContext(SubStmtContext.class,0);
		}
		public ModuleBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModuleBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModuleBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModuleBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBodyElementContext moduleBodyElement() throws RecognitionException {
		ModuleBodyElementContext _localctx = new ModuleBodyElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_moduleBodyElement);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				functionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				propertyGetStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				propertySetStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(687);
				propertyLetStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
				subStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(691);
					blockStmt();
					setState(692);
					endOfStatement();
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnterminatedBlockContext extends ParserRuleContext {
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public UnterminatedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unterminatedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUnterminatedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUnterminatedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUnterminatedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnterminatedBlockContext unterminatedBlock() throws RecognitionException {
		UnterminatedBlockContext _localctx = new UnterminatedBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unterminatedBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			blockStmt();
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					endOfStatement();
					setState(701);
					blockStmt();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtContext extends ParserRuleContext {
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public MainBlockStmtContext mainBlockStmt() {
			return getRuleContext(MainBlockStmtContext.class,0);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blockStmt);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				statementLabelDefinition();
				setState(710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(709);
					whiteSpace();
					}
					break;
				}
				setState(713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(712);
					mainBlockStmt();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				mainBlockStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainBlockStmtContext extends ParserRuleContext {
		public FileStmtContext fileStmt() {
			return getRuleContext(FileStmtContext.class,0);
		}
		public AttributeStmtContext attributeStmt() {
			return getRuleContext(AttributeStmtContext.class,0);
		}
		public ConstStmtContext constStmt() {
			return getRuleContext(ConstStmtContext.class,0);
		}
		public DoLoopStmtContext doLoopStmt() {
			return getRuleContext(DoLoopStmtContext.class,0);
		}
		public EndStmtContext endStmt() {
			return getRuleContext(EndStmtContext.class,0);
		}
		public EraseStmtContext eraseStmt() {
			return getRuleContext(EraseStmtContext.class,0);
		}
		public ErrorStmtContext errorStmt() {
			return getRuleContext(ErrorStmtContext.class,0);
		}
		public ExitStmtContext exitStmt() {
			return getRuleContext(ExitStmtContext.class,0);
		}
		public ForEachStmtContext forEachStmt() {
			return getRuleContext(ForEachStmtContext.class,0);
		}
		public ForNextStmtContext forNextStmt() {
			return getRuleContext(ForNextStmtContext.class,0);
		}
		public GoSubStmtContext goSubStmt() {
			return getRuleContext(GoSubStmtContext.class,0);
		}
		public GoToStmtContext goToStmt() {
			return getRuleContext(GoToStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SingleLineIfStmtContext singleLineIfStmt() {
			return getRuleContext(SingleLineIfStmtContext.class,0);
		}
		public ImplementsStmtContext implementsStmt() {
			return getRuleContext(ImplementsStmtContext.class,0);
		}
		public MidStatementContext midStatement() {
			return getRuleContext(MidStatementContext.class,0);
		}
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public LsetStmtContext lsetStmt() {
			return getRuleContext(LsetStmtContext.class,0);
		}
		public OnErrorStmtContext onErrorStmt() {
			return getRuleContext(OnErrorStmtContext.class,0);
		}
		public OnGoToStmtContext onGoToStmt() {
			return getRuleContext(OnGoToStmtContext.class,0);
		}
		public OnGoSubStmtContext onGoSubStmt() {
			return getRuleContext(OnGoSubStmtContext.class,0);
		}
		public RaiseEventStmtContext raiseEventStmt() {
			return getRuleContext(RaiseEventStmtContext.class,0);
		}
		public RedimStmtContext redimStmt() {
			return getRuleContext(RedimStmtContext.class,0);
		}
		public ResumeStmtContext resumeStmt() {
			return getRuleContext(ResumeStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public RsetStmtContext rsetStmt() {
			return getRuleContext(RsetStmtContext.class,0);
		}
		public SelectCaseStmtContext selectCaseStmt() {
			return getRuleContext(SelectCaseStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public StopStmtContext stopStmt() {
			return getRuleContext(StopStmtContext.class,0);
		}
		public VariableStmtContext variableStmt() {
			return getRuleContext(VariableStmtContext.class,0);
		}
		public WhileWendStmtContext whileWendStmt() {
			return getRuleContext(WhileWendStmtContext.class,0);
		}
		public WithStmtContext withStmt() {
			return getRuleContext(WithStmtContext.class,0);
		}
		public LineSpecialFormContext lineSpecialForm() {
			return getRuleContext(LineSpecialFormContext.class,0);
		}
		public CircleSpecialFormContext circleSpecialForm() {
			return getRuleContext(CircleSpecialFormContext.class,0);
		}
		public ScaleSpecialFormContext scaleSpecialForm() {
			return getRuleContext(ScaleSpecialFormContext.class,0);
		}
		public PSetSpecialFormContext pSetSpecialForm() {
			return getRuleContext(PSetSpecialFormContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public NameStmtContext nameStmt() {
			return getRuleContext(NameStmtContext.class,0);
		}
		public MainBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMainBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMainBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMainBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockStmtContext mainBlockStmt() throws RecognitionException {
		MainBlockStmtContext _localctx = new MainBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mainBlockStmt);
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				fileStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				attributeStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				constStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(721);
				doLoopStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(722);
				endStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(723);
				eraseStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(724);
				errorStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(725);
				exitStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(726);
				forEachStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(727);
				forNextStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(728);
				goSubStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(729);
				goToStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(730);
				ifStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(731);
				singleLineIfStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(732);
				implementsStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(733);
				midStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(734);
				letStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(735);
				lsetStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(736);
				onErrorStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(737);
				onGoToStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(738);
				onGoSubStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(739);
				raiseEventStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(740);
				redimStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(741);
				resumeStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(742);
				returnStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(743);
				rsetStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(744);
				selectCaseStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(745);
				setStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(746);
				stopStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(747);
				variableStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(748);
				whileWendStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(749);
				withStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(750);
				lineSpecialForm();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(751);
				circleSpecialForm();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(752);
				scaleSpecialForm();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(753);
				pSetSpecialForm();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(754);
				callStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(755);
				nameStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileStmtContext extends ParserRuleContext {
		public OpenStmtContext openStmt() {
			return getRuleContext(OpenStmtContext.class,0);
		}
		public ResetStmtContext resetStmt() {
			return getRuleContext(ResetStmtContext.class,0);
		}
		public CloseStmtContext closeStmt() {
			return getRuleContext(CloseStmtContext.class,0);
		}
		public SeekStmtContext seekStmt() {
			return getRuleContext(SeekStmtContext.class,0);
		}
		public LockStmtContext lockStmt() {
			return getRuleContext(LockStmtContext.class,0);
		}
		public UnlockStmtContext unlockStmt() {
			return getRuleContext(UnlockStmtContext.class,0);
		}
		public LineInputStmtContext lineInputStmt() {
			return getRuleContext(LineInputStmtContext.class,0);
		}
		public WidthStmtContext widthStmt() {
			return getRuleContext(WidthStmtContext.class,0);
		}
		public DebugPrintStmtContext debugPrintStmt() {
			return getRuleContext(DebugPrintStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public PutStmtContext putStmt() {
			return getRuleContext(PutStmtContext.class,0);
		}
		public GetStmtContext getStmt() {
			return getRuleContext(GetStmtContext.class,0);
		}
		public FileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterFileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitFileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitFileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileStmtContext fileStmt() throws RecognitionException {
		FileStmtContext _localctx = new FileStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fileStmt);
		try {
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				openStmt();
				}
				break;
			case RESET:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				resetStmt();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				closeStmt();
				}
				break;
			case SEEK:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				seekStmt();
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 5);
				{
				setState(762);
				lockStmt();
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 6);
				{
				setState(763);
				unlockStmt();
				}
				break;
			case LINE_INPUT:
				enterOuterAlt(_localctx, 7);
				{
				setState(764);
				lineInputStmt();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 8);
				{
				setState(765);
				widthStmt();
				}
				break;
			case DEBUG:
				enterOuterAlt(_localctx, 9);
				{
				setState(766);
				debugPrintStmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(767);
				printStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 11);
				{
				setState(768);
				writeStmt();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 12);
				{
				setState(769);
				inputStmt();
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 13);
				{
				setState(770);
				putStmt();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 14);
				{
				setState(771);
				getStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenStmtContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(VBAParser.OPEN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(VBAParser.AS, 0); }
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public ModeClauseContext modeClause() {
			return getRuleContext(ModeClauseContext.class,0);
		}
		public AccessClauseContext accessClause() {
			return getRuleContext(AccessClauseContext.class,0);
		}
		public LockContext lock() {
			return getRuleContext(LockContext.class,0);
		}
		public LenClauseContext lenClause() {
			return getRuleContext(LenClauseContext.class,0);
		}
		public OpenStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOpenStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOpenStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOpenStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenStmtContext openStmt() throws RecognitionException {
		OpenStmtContext _localctx = new OpenStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_openStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(OPEN);
			setState(775);
			whiteSpace();
			setState(776);
			pathName();
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(777);
				whiteSpace();
				setState(778);
				modeClause();
				}
				break;
			}
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(782);
				whiteSpace();
				setState(783);
				accessClause();
				}
				break;
			}
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(787);
				whiteSpace();
				setState(788);
				lock();
				}
				break;
			}
			setState(792);
			whiteSpace();
			setState(793);
			match(AS);
			setState(794);
			whiteSpace();
			setState(795);
			fileNumber();
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(796);
				whiteSpace();
				setState(797);
				lenClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathNameContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PathNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPathName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPathName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPathName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathNameContext pathName() throws RecognitionException {
		PathNameContext _localctx = new PathNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pathName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VBAParser.FOR, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public FileModeContext fileMode() {
			return getRuleContext(FileModeContext.class,0);
		}
		public ModeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeClauseContext modeClause() throws RecognitionException {
		ModeClauseContext _localctx = new ModeClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_modeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(FOR);
			setState(804);
			whiteSpace();
			setState(805);
			fileMode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileModeContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(VBAParser.APPEND, 0); }
		public TerminalNode BINARY() { return getToken(VBAParser.BINARY, 0); }
		public TerminalNode INPUT() { return getToken(VBAParser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(VBAParser.OUTPUT, 0); }
		public TerminalNode RANDOM() { return getToken(VBAParser.RANDOM, 0); }
		public FileModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterFileMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitFileMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitFileMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileModeContext fileMode() throws RecognitionException {
		FileModeContext _localctx = new FileModeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fileMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==BINARY || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (INPUT - 117)) | (1L << (OUTPUT - 117)) | (1L << (RANDOM - 117)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessClauseContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(VBAParser.ACCESS, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public AccessClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAccessClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAccessClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAccessClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessClauseContext accessClause() throws RecognitionException {
		AccessClauseContext _localctx = new AccessClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_accessClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(ACCESS);
			setState(810);
			whiteSpace();
			setState(811);
			access();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(VBAParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(VBAParser.WRITE, 0); }
		public TerminalNode READ_WRITE() { return getToken(VBAParser.READ_WRITE, 0); }
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (READ - 163)) | (1L << (READ_WRITE - 163)) | (1L << (WRITE - 163)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockContext extends ParserRuleContext {
		public TerminalNode SHARED() { return getToken(VBAParser.SHARED, 0); }
		public TerminalNode LOCK_READ() { return getToken(VBAParser.LOCK_READ, 0); }
		public TerminalNode LOCK_WRITE() { return getToken(VBAParser.LOCK_WRITE, 0); }
		public TerminalNode LOCK_READ_WRITE() { return getToken(VBAParser.LOCK_READ_WRITE, 0); }
		public LockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockContext lock() throws RecognitionException {
		LockContext _localctx = new LockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (LOCK_READ - 127)) | (1L << (LOCK_WRITE - 127)) | (1L << (LOCK_READ_WRITE - 127)) | (1L << (SHARED - 127)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LenClauseContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(VBAParser.LEN, 0); }
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public RecLengthContext recLength() {
			return getRuleContext(RecLengthContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenClauseContext lenClause() throws RecognitionException {
		LenClauseContext _localctx = new LenClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lenClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(LEN);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(818);
				whiteSpace();
				}
			}

			setState(821);
			match(EQ);
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(822);
				whiteSpace();
				}
				break;
			}
			setState(825);
			recLength();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RecLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRecLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRecLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRecLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecLengthContext recLength() throws RecognitionException {
		RecLengthContext _localctx = new RecLengthContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNumberContext extends ParserRuleContext {
		public MarkedFileNumberContext markedFileNumber() {
			return getRuleContext(MarkedFileNumberContext.class,0);
		}
		public UnmarkedFileNumberContext unmarkedFileNumber() {
			return getRuleContext(UnmarkedFileNumberContext.class,0);
		}
		public FileNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterFileNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitFileNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitFileNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNumberContext fileNumber() throws RecognitionException {
		FileNumberContext _localctx = new FileNumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fileNumber);
		try {
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				markedFileNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				unmarkedFileNumber();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkedFileNumberContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(VBAParser.HASH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MarkedFileNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markedFileNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMarkedFileNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMarkedFileNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMarkedFileNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkedFileNumberContext markedFileNumber() throws RecognitionException {
		MarkedFileNumberContext _localctx = new MarkedFileNumberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_markedFileNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(HASH);
			setState(834);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnmarkedFileNumberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnmarkedFileNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unmarkedFileNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUnmarkedFileNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUnmarkedFileNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUnmarkedFileNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnmarkedFileNumberContext unmarkedFileNumber() throws RecognitionException {
		UnmarkedFileNumberContext _localctx = new UnmarkedFileNumberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unmarkedFileNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseStmtContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(VBAParser.CLOSE, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public FileNumberListContext fileNumberList() {
			return getRuleContext(FileNumberListContext.class,0);
		}
		public CloseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCloseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCloseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCloseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseStmtContext closeStmt() throws RecognitionException {
		CloseStmtContext _localctx = new CloseStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_closeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(CLOSE);
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(839);
				whiteSpace();
				setState(840);
				fileNumberList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResetStmtContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(VBAParser.RESET, 0); }
		public ResetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterResetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitResetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitResetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResetStmtContext resetStmt() throws RecognitionException {
		ResetStmtContext _localctx = new ResetStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_resetStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(RESET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNumberListContext extends ParserRuleContext {
		public List<FileNumberContext> fileNumber() {
			return getRuleContexts(FileNumberContext.class);
		}
		public FileNumberContext fileNumber(int i) {
			return getRuleContext(FileNumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FileNumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileNumberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterFileNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitFileNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitFileNumberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNumberListContext fileNumberList() throws RecognitionException {
		FileNumberListContext _localctx = new FileNumberListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fileNumberList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			fileNumber();
			setState(857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(847);
						whiteSpace();
						}
					}

					setState(850);
					match(COMMA);
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(851);
						whiteSpace();
						}
						break;
					}
					setState(854);
					fileNumber();
					}
					} 
				}
				setState(859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeekStmtContext extends ParserRuleContext {
		public TerminalNode SEEK() { return getToken(VBAParser.SEEK, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public SeekStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seekStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSeekStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSeekStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSeekStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeekStmtContext seekStmt() throws RecognitionException {
		SeekStmtContext _localctx = new SeekStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_seekStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(SEEK);
			setState(861);
			whiteSpace();
			setState(862);
			fileNumber();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(863);
				whiteSpace();
				}
			}

			setState(866);
			match(COMMA);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(867);
				whiteSpace();
				}
				break;
			}
			setState(870);
			position();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockStmtContext extends ParserRuleContext {
		public TerminalNode LOCK() { return getToken(VBAParser.LOCK, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public RecordRangeContext recordRange() {
			return getRuleContext(RecordRangeContext.class,0);
		}
		public LockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockStmtContext lockStmt() throws RecognitionException {
		LockStmtContext _localctx = new LockStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(LOCK);
			setState(875);
			whiteSpace();
			setState(876);
			fileNumber();
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(877);
					whiteSpace();
					}
				}

				setState(880);
				match(COMMA);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(881);
					whiteSpace();
					}
					break;
				}
				setState(884);
				recordRange();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordRangeContext extends ParserRuleContext {
		public StartRecordNumberContext startRecordNumber() {
			return getRuleContext(StartRecordNumberContext.class,0);
		}
		public TerminalNode TO() { return getToken(VBAParser.TO, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public EndRecordNumberContext endRecordNumber() {
			return getRuleContext(EndRecordNumberContext.class,0);
		}
		public RecordRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRecordRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRecordRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRecordRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordRangeContext recordRange() throws RecognitionException {
		RecordRangeContext _localctx = new RecordRangeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_recordRange);
		try {
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				startRecordNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(888);
					startRecordNumber();
					setState(889);
					whiteSpace();
					}
					break;
				}
				setState(893);
				match(TO);
				setState(894);
				whiteSpace();
				setState(895);
				endRecordNumber();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartRecordNumberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartRecordNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRecordNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStartRecordNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStartRecordNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStartRecordNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRecordNumberContext startRecordNumber() throws RecognitionException {
		StartRecordNumberContext _localctx = new StartRecordNumberContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_startRecordNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndRecordNumberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndRecordNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endRecordNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEndRecordNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEndRecordNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEndRecordNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndRecordNumberContext endRecordNumber() throws RecognitionException {
		EndRecordNumberContext _localctx = new EndRecordNumberContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_endRecordNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlockStmtContext extends ParserRuleContext {
		public TerminalNode UNLOCK() { return getToken(VBAParser.UNLOCK, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public RecordRangeContext recordRange() {
			return getRuleContext(RecordRangeContext.class,0);
		}
		public UnlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUnlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUnlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUnlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlockStmtContext unlockStmt() throws RecognitionException {
		UnlockStmtContext _localctx = new UnlockStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(UNLOCK);
			setState(904);
			whiteSpace();
			setState(905);
			fileNumber();
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(906);
					whiteSpace();
					}
				}

				setState(909);
				match(COMMA);
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(910);
					whiteSpace();
					}
					break;
				}
				setState(913);
				recordRange();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineInputStmtContext extends ParserRuleContext {
		public TerminalNode LINE_INPUT() { return getToken(VBAParser.LINE_INPUT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public MarkedFileNumberContext markedFileNumber() {
			return getRuleContext(MarkedFileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public LineInputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineInputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLineInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLineInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLineInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineInputStmtContext lineInputStmt() throws RecognitionException {
		LineInputStmtContext _localctx = new LineInputStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_lineInputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(LINE_INPUT);
			setState(917);
			whiteSpace();
			setState(918);
			markedFileNumber();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(919);
				whiteSpace();
				}
			}

			setState(922);
			match(COMMA);
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(923);
				whiteSpace();
				}
				break;
			}
			setState(926);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthStmtContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(VBAParser.WIDTH, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public MarkedFileNumberContext markedFileNumber() {
			return getRuleContext(MarkedFileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public LineWidthContext lineWidth() {
			return getRuleContext(LineWidthContext.class,0);
		}
		public WidthStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWidthStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWidthStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWidthStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthStmtContext widthStmt() throws RecognitionException {
		WidthStmtContext _localctx = new WidthStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_widthStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(WIDTH);
			setState(931);
			whiteSpace();
			setState(932);
			markedFileNumber();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(933);
				whiteSpace();
				}
			}

			setState(936);
			match(COMMA);
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(937);
				whiteSpace();
				}
				break;
			}
			setState(940);
			lineWidth();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineWidthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LineWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineWidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLineWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLineWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLineWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineWidthContext lineWidth() throws RecognitionException {
		LineWidthContext _localctx = new LineWidthContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lineWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebugPrintStmtContext extends ParserRuleContext {
		public DebugPrintContext debugPrint() {
			return getRuleContext(DebugPrintContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public OutputListContext outputList() {
			return getRuleContext(OutputListContext.class,0);
		}
		public DebugPrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugPrintStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDebugPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDebugPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDebugPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugPrintStmtContext debugPrintStmt() throws RecognitionException {
		DebugPrintStmtContext _localctx = new DebugPrintStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_debugPrintStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			debugPrint();
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(945);
				whiteSpace();
				setState(946);
				outputList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebugPrintContext extends ParserRuleContext {
		public DebugModuleContext debugModule() {
			return getRuleContext(DebugModuleContext.class,0);
		}
		public TerminalNode DOT() { return getToken(VBAParser.DOT, 0); }
		public DebugPrintSubContext debugPrintSub() {
			return getRuleContext(DebugPrintSubContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public DebugPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDebugPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDebugPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDebugPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugPrintContext debugPrint() throws RecognitionException {
		DebugPrintContext _localctx = new DebugPrintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_debugPrint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			debugModule();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(951);
				whiteSpace();
				}
			}

			setState(954);
			match(DOT);
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(955);
				whiteSpace();
				}
			}

			setState(958);
			debugPrintSub();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebugModuleContext extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(VBAParser.DEBUG, 0); }
		public DebugModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDebugModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDebugModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDebugModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugModuleContext debugModule() throws RecognitionException {
		DebugModuleContext _localctx = new DebugModuleContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_debugModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(DEBUG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebugPrintSubContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(VBAParser.PRINT, 0); }
		public DebugPrintSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugPrintSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDebugPrintSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDebugPrintSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDebugPrintSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugPrintSubContext debugPrintSub() throws RecognitionException {
		DebugPrintSubContext _localctx = new DebugPrintSubContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_debugPrintSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(PRINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(VBAParser.PRINT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public MarkedFileNumberContext markedFileNumber() {
			return getRuleContext(MarkedFileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public OutputListContext outputList() {
			return getRuleContext(OutputListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(PRINT);
			setState(965);
			whiteSpace();
			setState(966);
			markedFileNumber();
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(967);
				whiteSpace();
				}
			}

			setState(970);
			match(COMMA);
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(971);
					whiteSpace();
					}
					break;
				}
				setState(974);
				outputList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputListContext extends ParserRuleContext {
		public List<OutputItemContext> outputItem() {
			return getRuleContexts(OutputItemContext.class);
		}
		public OutputItemContext outputItem(int i) {
			return getRuleContext(OutputItemContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public OutputListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOutputList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOutputList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOutputList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputListContext outputList() throws RecognitionException {
		OutputListContext _localctx = new OutputListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_outputList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			outputItem();
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(979);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(978);
						whiteSpace();
						}
						break;
					}
					setState(981);
					outputItem();
					}
					} 
				}
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputItemContext extends ParserRuleContext {
		public OutputClauseContext outputClause() {
			return getRuleContext(OutputClauseContext.class,0);
		}
		public CharPositionContext charPosition() {
			return getRuleContext(CharPositionContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public OutputItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOutputItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOutputItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOutputItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputItemContext outputItem() throws RecognitionException {
		OutputItemContext _localctx = new OutputItemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outputItem);
		int _la;
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				outputClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				charPosition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				outputClause();
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(990);
					whiteSpace();
					}
				}

				setState(993);
				charPosition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputClauseContext extends ParserRuleContext {
		public SpcClauseContext spcClause() {
			return getRuleContext(SpcClauseContext.class,0);
		}
		public TabClauseContext tabClause() {
			return getRuleContext(TabClauseContext.class,0);
		}
		public OutputExpressionContext outputExpression() {
			return getRuleContext(OutputExpressionContext.class,0);
		}
		public OutputClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOutputClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOutputClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOutputClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputClauseContext outputClause() throws RecognitionException {
		OutputClauseContext _localctx = new OutputClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outputClause);
		try {
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				spcClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				tabClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(999);
				outputExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharPositionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(VBAParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public CharPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCharPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCharPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCharPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharPositionContext charPosition() throws RecognitionException {
		CharPositionContext _localctx = new CharPositionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_charPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOutputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOutputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOutputExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputExpressionContext outputExpression() throws RecognitionException {
		OutputExpressionContext _localctx = new OutputExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_outputExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpcClauseContext extends ParserRuleContext {
		public TerminalNode SPC() { return getToken(VBAParser.SPC, 0); }
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public SpcNumberContext spcNumber() {
			return getRuleContext(SpcNumberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public SpcClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spcClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSpcClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSpcClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSpcClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpcClauseContext spcClause() throws RecognitionException {
		SpcClauseContext _localctx = new SpcClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_spcClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(SPC);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1007);
				whiteSpace();
				}
			}

			setState(1010);
			match(LPAREN);
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1011);
				whiteSpace();
				}
				break;
			}
			setState(1014);
			spcNumber();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1015);
				whiteSpace();
				}
			}

			setState(1018);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpcNumberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpcNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spcNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSpcNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSpcNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSpcNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpcNumberContext spcNumber() throws RecognitionException {
		SpcNumberContext _localctx = new SpcNumberContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_spcNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabClauseContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(VBAParser.TAB, 0); }
		public TabNumberClauseContext tabNumberClause() {
			return getRuleContext(TabNumberClauseContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public TabClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterTabClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitTabClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitTabClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabClauseContext tabClause() throws RecognitionException {
		TabClauseContext _localctx = new TabClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tabClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(TAB);
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1023);
					whiteSpace();
					}
				}

				setState(1026);
				tabNumberClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabNumberClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TabNumberContext tabNumber() {
			return getRuleContext(TabNumberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TabNumberClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabNumberClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterTabNumberClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitTabNumberClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitTabNumberClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabNumberClauseContext tabNumberClause() throws RecognitionException {
		TabNumberClauseContext _localctx = new TabNumberClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tabNumberClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(LPAREN);
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1030);
				whiteSpace();
				}
				break;
			}
			setState(1033);
			tabNumber();
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1034);
				whiteSpace();
				}
			}

			setState(1037);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabNumberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TabNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterTabNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitTabNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitTabNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabNumberContext tabNumber() throws RecognitionException {
		TabNumberContext _localctx = new TabNumberContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tabNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(VBAParser.WRITE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public MarkedFileNumberContext markedFileNumber() {
			return getRuleContext(MarkedFileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public OutputListContext outputList() {
			return getRuleContext(OutputListContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_writeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(WRITE);
			setState(1042);
			whiteSpace();
			setState(1043);
			markedFileNumber();
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1044);
				whiteSpace();
				}
			}

			setState(1047);
			match(COMMA);
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(1049);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1048);
					whiteSpace();
					}
					break;
				}
				setState(1051);
				outputList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(VBAParser.INPUT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public MarkedFileNumberContext markedFileNumber() {
			return getRuleContext(MarkedFileNumberContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public InputListContext inputList() {
			return getRuleContext(InputListContext.class,0);
		}
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_inputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(INPUT);
			setState(1055);
			whiteSpace();
			setState(1056);
			markedFileNumber();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1057);
				whiteSpace();
				}
			}

			setState(1060);
			match(COMMA);
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1061);
				whiteSpace();
				}
				break;
			}
			setState(1064);
			inputList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputListContext extends ParserRuleContext {
		public List<InputVariableContext> inputVariable() {
			return getRuleContexts(InputVariableContext.class);
		}
		public InputVariableContext inputVariable(int i) {
			return getRuleContext(InputVariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public InputListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterInputList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitInputList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitInputList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputListContext inputList() throws RecognitionException {
		InputListContext _localctx = new InputListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_inputList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			inputVariable();
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1067);
						whiteSpace();
						}
					}

					setState(1070);
					match(COMMA);
					setState(1072);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						setState(1071);
						whiteSpace();
						}
						break;
					}
					setState(1074);
					inputVariable();
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputVariableContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterInputVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitInputVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitInputVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputVariableContext inputVariable() throws RecognitionException {
		InputVariableContext _localctx = new InputVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_inputVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PutStmtContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(VBAParser.PUT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public RecordNumberContext recordNumber() {
			return getRuleContext(RecordNumberContext.class,0);
		}
		public PutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPutStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPutStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPutStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutStmtContext putStmt() throws RecognitionException {
		PutStmtContext _localctx = new PutStmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_putStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(PUT);
			setState(1083);
			whiteSpace();
			setState(1084);
			fileNumber();
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1085);
				whiteSpace();
				}
			}

			setState(1088);
			match(COMMA);
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1089);
				whiteSpace();
				}
				break;
			}
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1092);
				recordNumber();
				}
				break;
			}
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1095);
				whiteSpace();
				}
			}

			setState(1098);
			match(COMMA);
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1099);
				whiteSpace();
				}
				break;
			}
			setState(1102);
			data();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordNumberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RecordNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRecordNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRecordNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRecordNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordNumberContext recordNumber() throws RecognitionException {
		RecordNumberContext _localctx = new RecordNumberContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_recordNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetStmtContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(VBAParser.GET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RecordNumberContext recordNumber() {
			return getRuleContext(RecordNumberContext.class,0);
		}
		public GetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterGetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitGetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitGetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetStmtContext getStmt() throws RecognitionException {
		GetStmtContext _localctx = new GetStmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_getStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(GET);
			setState(1109);
			whiteSpace();
			setState(1110);
			fileNumber();
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1111);
				whiteSpace();
				}
			}

			setState(1114);
			match(COMMA);
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1115);
				whiteSpace();
				}
				break;
			}
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1118);
				recordNumber();
				}
				break;
			}
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1121);
				whiteSpace();
				}
			}

			setState(1124);
			match(COMMA);
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1125);
				whiteSpace();
				}
				break;
			}
			setState(1128);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstStmtContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(VBAParser.CONST, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ConstSubStmtContext> constSubStmt() {
			return getRuleContexts(ConstSubStmtContext.class);
		}
		public ConstSubStmtContext constSubStmt(int i) {
			return getRuleContext(ConstSubStmtContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public ConstStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterConstStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitConstStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitConstStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStmtContext constStmt() throws RecognitionException {
		ConstStmtContext _localctx = new ConstStmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_constStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1132);
				visibility();
				setState(1133);
				whiteSpace();
				}
			}

			setState(1137);
			match(CONST);
			setState(1138);
			whiteSpace();
			setState(1139);
			constSubStmt();
			setState(1150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1140);
						whiteSpace();
						}
					}

					setState(1143);
					match(COMMA);
					setState(1145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1144);
						whiteSpace();
						}
					}

					setState(1147);
					constSubStmt();
					}
					} 
				}
				setState(1152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSubStmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ConstSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterConstSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitConstSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitConstSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSubStmtContext constSubStmt() throws RecognitionException {
		ConstSubStmtContext _localctx = new ConstSubStmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_constSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			identifier();
			setState(1157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1154);
				whiteSpace();
				setState(1155);
				asTypeClause();
				}
				break;
			}
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1159);
				whiteSpace();
				}
			}

			setState(1162);
			match(EQ);
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1163);
				whiteSpace();
				}
				break;
			}
			setState(1166);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareStmtContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(VBAParser.DECLARE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIB() { return getToken(VBAParser.LIB, 0); }
		public List<TerminalNode> STRINGLITERAL() { return getTokens(VBAParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(VBAParser.STRINGLITERAL, i);
		}
		public TerminalNode FUNCTION() { return getToken(VBAParser.FUNCTION, 0); }
		public TerminalNode SUB() { return getToken(VBAParser.SUB, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode PTRSAFE() { return getToken(VBAParser.PTRSAFE, 0); }
		public TerminalNode CDECL() { return getToken(VBAParser.CDECL, 0); }
		public TerminalNode ALIAS() { return getToken(VBAParser.ALIAS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDeclareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDeclareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDeclareStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_declareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1168);
				visibility();
				setState(1169);
				whiteSpace();
				}
			}

			setState(1173);
			match(DECLARE);
			setState(1174);
			whiteSpace();
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PTRSAFE) {
				{
				setState(1175);
				match(PTRSAFE);
				setState(1176);
				whiteSpace();
				}
			}

			setState(1179);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1180);
			whiteSpace();
			setState(1181);
			identifier();
			setState(1182);
			whiteSpace();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CDECL) {
				{
				setState(1183);
				match(CDECL);
				setState(1184);
				whiteSpace();
				}
			}

			setState(1187);
			match(LIB);
			setState(1188);
			whiteSpace();
			setState(1189);
			match(STRINGLITERAL);
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1190);
				whiteSpace();
				setState(1191);
				match(ALIAS);
				setState(1192);
				whiteSpace();
				setState(1193);
				match(STRINGLITERAL);
				}
				break;
			}
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1197);
					whiteSpace();
					}
				}

				setState(1200);
				argList();
				}
				break;
			}
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1203);
				whiteSpace();
				setState(1204);
				asTypeClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(LPAREN);
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1209);
					whiteSpace();
					}
				}

				setState(1212);
				arg();
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1214);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(1213);
							whiteSpace();
							}
						}

						setState(1216);
						match(COMMA);
						setState(1218);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(1217);
							whiteSpace();
							}
						}

						setState(1220);
						arg();
						}
						} 
					}
					setState(1225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				}
				}
				break;
			}
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1228);
				whiteSpace();
				}
			}

			setState(1231);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(VBAParser.OPTIONAL, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode PARAMARRAY() { return getToken(VBAParser.PARAMARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ArgDefaultValueContext argDefaultValue() {
			return getRuleContext(ArgDefaultValueContext.class,0);
		}
		public TerminalNode BYVAL() { return getToken(VBAParser.BYVAL, 0); }
		public TerminalNode BYREF() { return getToken(VBAParser.BYREF, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1233);
				match(OPTIONAL);
				setState(1234);
				whiteSpace();
				}
				break;
			}
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1237);
				_la = _input.LA(1);
				if ( !(_la==BYVAL || _la==BYREF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1238);
				whiteSpace();
				}
				break;
			}
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1241);
				match(PARAMARRAY);
				setState(1242);
				whiteSpace();
				}
				break;
			}
			setState(1245);
			unrestrictedIdentifier();
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1246);
					whiteSpace();
					}
				}

				setState(1249);
				match(LPAREN);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1250);
					whiteSpace();
					}
				}

				setState(1253);
				match(RPAREN);
				}
				break;
			}
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1256);
					whiteSpace();
					}
				}

				setState(1259);
				asTypeClause();
				}
				break;
			}
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1262);
					whiteSpace();
					}
				}

				setState(1265);
				argDefaultValue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgDefaultValueContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ArgDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterArgDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitArgDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitArgDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDefaultValueContext argDefaultValue() throws RecognitionException {
		ArgDefaultValueContext _localctx = new ArgDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_argDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(EQ);
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1269);
				whiteSpace();
				}
				break;
			}
			setState(1272);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefDirectiveContext extends ParserRuleContext {
		public DefTypeContext defType() {
			return getRuleContext(DefTypeContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<LetterSpecContext> letterSpec() {
			return getRuleContexts(LetterSpecContext.class);
		}
		public LetterSpecContext letterSpec(int i) {
			return getRuleContext(LetterSpecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public DefDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDefDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDefDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDefDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefDirectiveContext defDirective() throws RecognitionException {
		DefDirectiveContext _localctx = new DefDirectiveContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_defDirective);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			defType();
			setState(1275);
			whiteSpace();
			setState(1276);
			letterSpec();
			setState(1287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1277);
						whiteSpace();
						}
					}

					setState(1280);
					match(COMMA);
					setState(1282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						setState(1281);
						whiteSpace();
						}
						break;
					}
					setState(1284);
					letterSpec();
					}
					} 
				}
				setState(1289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefTypeContext extends ParserRuleContext {
		public TerminalNode DEFBOOL() { return getToken(VBAParser.DEFBOOL, 0); }
		public TerminalNode DEFBYTE() { return getToken(VBAParser.DEFBYTE, 0); }
		public TerminalNode DEFINT() { return getToken(VBAParser.DEFINT, 0); }
		public TerminalNode DEFLNG() { return getToken(VBAParser.DEFLNG, 0); }
		public TerminalNode DEFLNGLNG() { return getToken(VBAParser.DEFLNGLNG, 0); }
		public TerminalNode DEFLNGPTR() { return getToken(VBAParser.DEFLNGPTR, 0); }
		public TerminalNode DEFCUR() { return getToken(VBAParser.DEFCUR, 0); }
		public TerminalNode DEFSNG() { return getToken(VBAParser.DEFSNG, 0); }
		public TerminalNode DEFDBL() { return getToken(VBAParser.DEFDBL, 0); }
		public TerminalNode DEFDATE() { return getToken(VBAParser.DEFDATE, 0); }
		public TerminalNode DEFSTR() { return getToken(VBAParser.DEFSTR, 0); }
		public TerminalNode DEFOBJ() { return getToken(VBAParser.DEFOBJ, 0); }
		public TerminalNode DEFVAR() { return getToken(VBAParser.DEFVAR, 0); }
		public DefTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDefType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDefType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDefType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTypeContext defType() throws RecognitionException {
		DefTypeContext _localctx = new DefTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_defType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEFBOOL - 65)) | (1L << (DEFBYTE - 65)) | (1L << (DEFDATE - 65)) | (1L << (DEFDBL - 65)) | (1L << (DEFCUR - 65)) | (1L << (DEFINT - 65)) | (1L << (DEFLNG - 65)) | (1L << (DEFLNGLNG - 65)) | (1L << (DEFLNGPTR - 65)) | (1L << (DEFOBJ - 65)) | (1L << (DEFSNG - 65)) | (1L << (DEFSTR - 65)) | (1L << (DEFVAR - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetterSpecContext extends ParserRuleContext {
		public UniversalLetterRangeContext universalLetterRange() {
			return getRuleContext(UniversalLetterRangeContext.class,0);
		}
		public LetterRangeContext letterRange() {
			return getRuleContext(LetterRangeContext.class,0);
		}
		public SingleLetterContext singleLetter() {
			return getRuleContext(SingleLetterContext.class,0);
		}
		public LetterSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLetterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLetterSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLetterSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterSpecContext letterSpec() throws RecognitionException {
		LetterSpecContext _localctx = new LetterSpecContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_letterSpec);
		try {
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				universalLetterRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				letterRange();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				singleLetter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLetterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VBAParser.IDENTIFIER, 0); }
		public SingleLetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSingleLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSingleLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSingleLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLetterContext singleLetter() throws RecognitionException {
		SingleLetterContext _localctx = new SingleLetterContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_singleLetter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			if (!(_input.LT(1).getText().length() == 1 && Character.isLetter(_input.LT(1).getText().charAt(0)))) throw new FailedPredicateException(this, "_input.LT(1).getText().length() == 1 && Character.isLetter(_input.LT(1).getText().charAt(0))");
			setState(1298);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniversalLetterRangeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(VBAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VBAParser.IDENTIFIER, i);
		}
		public TerminalNode MINUS() { return getToken(VBAParser.MINUS, 0); }
		public UniversalLetterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalLetterRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUniversalLetterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUniversalLetterRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUniversalLetterRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalLetterRangeContext universalLetterRange() throws RecognitionException {
		UniversalLetterRangeContext _localctx = new UniversalLetterRangeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_universalLetterRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			if (!(_input.LT(1).getText() == "A" && _input.LT(3).getText() == "Z")) throw new FailedPredicateException(this, "_input.LT(1).getText() == \"A\" && _input.LT(3).getText() == \"Z\"");
			setState(1301);
			match(IDENTIFIER);
			setState(1302);
			match(MINUS);
			setState(1303);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetterRangeContext extends ParserRuleContext {
		public List<SingleLetterContext> singleLetter() {
			return getRuleContexts(SingleLetterContext.class);
		}
		public SingleLetterContext singleLetter(int i) {
			return getRuleContext(SingleLetterContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(VBAParser.MINUS, 0); }
		public LetterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLetterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLetterRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLetterRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterRangeContext letterRange() throws RecognitionException {
		LetterRangeContext _localctx = new LetterRangeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_letterRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			singleLetter();
			setState(1306);
			match(MINUS);
			setState(1307);
			singleLetter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoLoopStmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(VBAParser.DO, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(VBAParser.LOOP, 0); }
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(VBAParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(VBAParser.UNTIL, 0); }
		public DoLoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doLoopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDoLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDoLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDoLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoLoopStmtContext doLoopStmt() throws RecognitionException {
		DoLoopStmtContext _localctx = new DoLoopStmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_doLoopStmt);
		int _la;
		try {
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				match(DO);
				setState(1310);
				endOfStatement();
				setState(1311);
				block();
				setState(1313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1312);
					statementLabelDefinition();
					}
					break;
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1315);
					whiteSpace();
					}
				}

				setState(1318);
				match(LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(DO);
				setState(1321);
				whiteSpace();
				setState(1322);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1323);
				whiteSpace();
				setState(1324);
				expression(0);
				setState(1325);
				endOfStatement();
				setState(1326);
				block();
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1327);
					statementLabelDefinition();
					}
					break;
				}
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1330);
					whiteSpace();
					}
				}

				setState(1333);
				match(LOOP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335);
				match(DO);
				setState(1336);
				endOfStatement();
				setState(1337);
				block();
				setState(1339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1338);
					statementLabelDefinition();
					}
					break;
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1341);
					whiteSpace();
					}
				}

				setState(1344);
				match(LOOP);
				setState(1345);
				whiteSpace();
				setState(1346);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1347);
				whiteSpace();
				setState(1348);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationStmtContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(VBAParser.ENUM, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_ENUM() { return getToken(VBAParser.END_ENUM, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<EnumerationStmt_ConstantContext> enumerationStmt_Constant() {
			return getRuleContexts(EnumerationStmt_ConstantContext.class);
		}
		public EnumerationStmt_ConstantContext enumerationStmt_Constant(int i) {
			return getRuleContext(EnumerationStmt_ConstantContext.class,i);
		}
		public EnumerationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEnumerationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEnumerationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEnumerationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationStmtContext enumerationStmt() throws RecognitionException {
		EnumerationStmtContext _localctx = new EnumerationStmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumerationStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1352);
				visibility();
				setState(1353);
				whiteSpace();
				}
			}

			setState(1357);
			match(ENUM);
			setState(1358);
			whiteSpace();
			setState(1359);
			identifier();
			setState(1360);
			endOfStatement();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << PSET) | (1L << UBOUND) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CLASS) | (1L << CLOSE) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (DOUBLE - 80)) | (1L << (ENDPROPERTY - 80)) | (1L << (END - 80)) | (1L << (EQV - 80)) | (1L << (ERROR - 80)) | (1L << (FALSE - 80)) | (1L << (GET - 80)) | (1L << (IMP - 80)) | (1L << (IN - 80)) | (1L << (INPUT - 80)) | (1L << (IS - 80)) | (1L << (INTEGER - 80)) | (1L << (LOCK - 80)) | (1L << (LONG - 80)) | (1L << (LIB - 80)) | (1L << (LIKE - 80)) | (1L << (LINE_INPUT - 80)) | (1L << (LOCK_READ - 80)) | (1L << (LOCK_WRITE - 80)) | (1L << (LOCK_READ_WRITE - 80)) | (1L << (ME - 80)) | (1L << (MOD - 80)) | (1L << (NAME - 80)) | (1L << (NEW - 80)) | (1L << (NOT - 80)) | (1L << (NOTHING - 80)) | (1L << (NULL - 80)) | (1L << (OBJECT - 80)) | (1L << (ON_ERROR - 80)) | (1L << (OPEN - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (OPTIONAL - 144)) | (1L << (OR - 144)) | (1L << (OUTPUT - 144)) | (1L << (PARAMARRAY - 144)) | (1L << (PRESERVE - 144)) | (1L << (PRINT - 144)) | (1L << (PTRSAFE - 144)) | (1L << (PUT - 144)) | (1L << (RANDOM - 144)) | (1L << (READ - 144)) | (1L << (READ_WRITE - 144)) | (1L << (REM - 144)) | (1L << (RESET - 144)) | (1L << (SEEK - 144)) | (1L << (SHARED - 144)) | (1L << (SINGLE - 144)) | (1L << (SPC - 144)) | (1L << (STEP - 144)) | (1L << (STRING - 144)) | (1L << (TAB - 144)) | (1L << (TEXT - 144)) | (1L << (THEN - 144)) | (1L << (TO - 144)) | (1L << (TRUE - 144)) | (1L << (TYPEOF - 144)) | (1L << (UNLOCK - 144)) | (1L << (UNTIL - 144)) | (1L << (VARIANT - 144)) | (1L << (VERSION - 144)) | (1L << (WIDTH - 144)) | (1L << (WITHEVENTS - 144)) | (1L << (WRITE - 144)) | (1L << (XOR - 144)))) != 0) || _la==L_SQUARE_BRACKET || _la==IDENTIFIER) {
				{
				{
				setState(1361);
				enumerationStmt_Constant();
				}
				}
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1367);
			match(END_ENUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationStmt_ConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public EnumerationStmt_ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationStmt_Constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEnumerationStmt_Constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEnumerationStmt_Constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEnumerationStmt_Constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationStmt_ConstantContext enumerationStmt_Constant() throws RecognitionException {
		EnumerationStmt_ConstantContext _localctx = new EnumerationStmt_ConstantContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumerationStmt_Constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			identifier();
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1370);
					whiteSpace();
					}
				}

				setState(1373);
				match(EQ);
				setState(1375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1374);
					whiteSpace();
					}
					break;
				}
				setState(1377);
				expression(0);
				}
				break;
			}
			setState(1380);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndStmtContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(VBAParser.END, 0); }
		public EndStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEndStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEndStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEndStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStmtContext endStmt() throws RecognitionException {
		EndStmtContext _localctx = new EndStmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_endStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EraseStmtContext extends ParserRuleContext {
		public TerminalNode ERASE() { return getToken(VBAParser.ERASE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public EraseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eraseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEraseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEraseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEraseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EraseStmtContext eraseStmt() throws RecognitionException {
		EraseStmtContext _localctx = new EraseStmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_eraseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(ERASE);
			setState(1385);
			whiteSpace();
			setState(1386);
			expression(0);
			setState(1397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1387);
						whiteSpace();
						}
					}

					setState(1390);
					match(COMMA);
					setState(1392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						setState(1391);
						whiteSpace();
						}
						break;
					}
					setState(1394);
					expression(0);
					}
					} 
				}
				setState(1399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorStmtContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(VBAParser.ERROR, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitErrorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitErrorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorStmtContext errorStmt() throws RecognitionException {
		ErrorStmtContext _localctx = new ErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			match(ERROR);
			setState(1401);
			whiteSpace();
			setState(1402);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventStmtContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(VBAParser.EVENT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public EventStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEventStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEventStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEventStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventStmtContext eventStmt() throws RecognitionException {
		EventStmtContext _localctx = new EventStmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_eventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1404);
				visibility();
				setState(1405);
				whiteSpace();
				}
			}

			setState(1409);
			match(EVENT);
			setState(1410);
			whiteSpace();
			setState(1411);
			identifier();
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1412);
				whiteSpace();
				}
			}

			setState(1415);
			argList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStmtContext extends ParserRuleContext {
		public TerminalNode EXIT_DO() { return getToken(VBAParser.EXIT_DO, 0); }
		public TerminalNode EXIT_FOR() { return getToken(VBAParser.EXIT_FOR, 0); }
		public TerminalNode EXIT_FUNCTION() { return getToken(VBAParser.EXIT_FUNCTION, 0); }
		public TerminalNode EXIT_PROPERTY() { return getToken(VBAParser.EXIT_PROPERTY, 0); }
		public TerminalNode EXIT_SUB() { return getToken(VBAParser.EXIT_SUB, 0); }
		public ExitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitExitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitExitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStmtContext exitStmt() throws RecognitionException {
		ExitStmtContext _localctx = new ExitStmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (EXIT_DO - 100)) | (1L << (EXIT_FOR - 100)) | (1L << (EXIT_FUNCTION - 100)) | (1L << (EXIT_PROPERTY - 100)) | (1L << (EXIT_SUB - 100)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VBAParser.FOR, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode EACH() { return getToken(VBAParser.EACH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(VBAParser.IN, 0); }
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(VBAParser.NEXT, 0); }
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public UnterminatedBlockContext unterminatedBlock() {
			return getRuleContext(UnterminatedBlockContext.class,0);
		}
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public ForEachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterForEachStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitForEachStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitForEachStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachStmtContext forEachStmt() throws RecognitionException {
		ForEachStmtContext _localctx = new ForEachStmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_forEachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(FOR);
			setState(1420);
			whiteSpace();
			setState(1421);
			match(EACH);
			setState(1422);
			whiteSpace();
			setState(1423);
			expression(0);
			setState(1424);
			whiteSpace();
			setState(1425);
			match(IN);
			setState(1426);
			whiteSpace();
			setState(1427);
			expression(0);
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1428);
				endOfStatement();
				setState(1429);
				unterminatedBlock();
				}
				break;
			}
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1433);
				endOfStatement();
				setState(1435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1434);
					statementLabelDefinition();
					}
					break;
				}
				setState(1438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1437);
					whiteSpace();
					}
				}

				setState(1440);
				match(NEXT);
				setState(1444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1441);
					whiteSpace();
					setState(1442);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1446);
					whiteSpace();
					}
				}

				setState(1449);
				match(COMMA);
				setState(1451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1450);
					whiteSpace();
					}
					break;
				}
				setState(1453);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForNextStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VBAParser.FOR, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(VBAParser.TO, 0); }
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(VBAParser.NEXT, 0); }
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public StepStmtContext stepStmt() {
			return getRuleContext(StepStmtContext.class,0);
		}
		public UnterminatedBlockContext unterminatedBlock() {
			return getRuleContext(UnterminatedBlockContext.class,0);
		}
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public ForNextStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forNextStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterForNextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitForNextStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitForNextStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForNextStmtContext forNextStmt() throws RecognitionException {
		ForNextStmtContext _localctx = new ForNextStmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_forNextStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			match(FOR);
			setState(1457);
			whiteSpace();
			setState(1458);
			expression(0);
			setState(1459);
			whiteSpace();
			setState(1460);
			match(TO);
			setState(1461);
			whiteSpace();
			setState(1462);
			expression(0);
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1463);
				stepStmt();
				}
				break;
			}
			setState(1469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1466);
					whiteSpace();
					}
					} 
				}
				setState(1471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1472);
				endOfStatement();
				setState(1473);
				unterminatedBlock();
				}
				break;
			}
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1477);
				endOfStatement();
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1478);
					statementLabelDefinition();
					}
					break;
				}
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1481);
					whiteSpace();
					}
				}

				setState(1484);
				match(NEXT);
				setState(1488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1485);
					whiteSpace();
					setState(1486);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1490);
					whiteSpace();
					}
				}

				setState(1493);
				match(COMMA);
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1494);
					whiteSpace();
					}
					break;
				}
				setState(1497);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepStmtContext extends ParserRuleContext {
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode STEP() { return getToken(VBAParser.STEP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StepStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStepStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStepStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStepStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepStmtContext stepStmt() throws RecognitionException {
		StepStmtContext _localctx = new StepStmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_stepStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			whiteSpace();
			setState(1501);
			match(STEP);
			setState(1502);
			whiteSpace();
			setState(1503);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStmtContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(VBAParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END_FUNCTION() { return getToken(VBAParser.END_FUNCTION, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode STATIC() { return getToken(VBAParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public FunctionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterFunctionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitFunctionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitFunctionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStmtContext functionStmt() throws RecognitionException {
		FunctionStmtContext _localctx = new FunctionStmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_functionStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1505);
				visibility();
				setState(1506);
				whiteSpace();
				}
			}

			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1510);
				match(STATIC);
				setState(1511);
				whiteSpace();
				}
			}

			setState(1514);
			match(FUNCTION);
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1515);
				whiteSpace();
				}
			}

			setState(1518);
			functionName();
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1519);
					whiteSpace();
					}
				}

				setState(1522);
				argList();
				}
				break;
			}
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1525);
					whiteSpace();
					}
				}

				setState(1528);
				asTypeClause();
				}
				break;
			}
			setState(1531);
			endOfStatement();
			setState(1532);
			block();
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1533);
				statementLabelDefinition();
				}
				break;
			}
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1536);
				whiteSpace();
				}
			}

			setState(1539);
			match(END_FUNCTION);
			setState(1545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1540);
					endOfLine();
					setState(1541);
					attributeStmt();
					}
					} 
				}
				setState(1547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoSubStmtContext extends ParserRuleContext {
		public TerminalNode GOSUB() { return getToken(VBAParser.GOSUB, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterGoSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitGoSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitGoSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoSubStmtContext goSubStmt() throws RecognitionException {
		GoSubStmtContext _localctx = new GoSubStmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_goSubStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(GOSUB);
			setState(1551);
			whiteSpace();
			setState(1552);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoToStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(VBAParser.GOTO, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoToStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goToStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterGoToStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitGoToStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitGoToStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoToStmtContext goToStmt() throws RecognitionException {
		GoToStmtContext _localctx = new GoToStmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_goToStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			match(GOTO);
			setState(1555);
			whiteSpace();
			setState(1556);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VBAParser.IF, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VBAParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(VBAParser.END_IF, 0); }
		public List<ElseIfBlockContext> elseIfBlock() {
			return getRuleContexts(ElseIfBlockContext.class);
		}
		public ElseIfBlockContext elseIfBlock(int i) {
			return getRuleContext(ElseIfBlockContext.class,i);
		}
		public List<StatementLabelDefinitionContext> statementLabelDefinition() {
			return getRuleContexts(StatementLabelDefinitionContext.class);
		}
		public StatementLabelDefinitionContext statementLabelDefinition(int i) {
			return getRuleContext(StatementLabelDefinitionContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			match(IF);
			setState(1559);
			whiteSpace();
			setState(1560);
			booleanExpression();
			setState(1561);
			whiteSpace();
			setState(1562);
			match(THEN);
			setState(1563);
			endOfStatement();
			setState(1564);
			block();
			setState(1574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1566);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						setState(1565);
						statementLabelDefinition();
						}
						break;
					}
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1568);
						whiteSpace();
						}
					}

					setState(1571);
					elseIfBlock();
					}
					} 
				}
				setState(1576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			{
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1577);
				statementLabelDefinition();
				}
				break;
			}
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1580);
				whiteSpace();
				}
				break;
			}
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1583);
				elseBlock();
				}
				break;
			}
			}
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1586);
				statementLabelDefinition();
				}
				break;
			}
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1589);
				whiteSpace();
				}
			}

			setState(1592);
			match(END_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfBlockContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(VBAParser.ELSEIF, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VBAParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterElseIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitElseIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitElseIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_elseIfBlock);
		try {
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				match(ELSEIF);
				setState(1595);
				whiteSpace();
				setState(1596);
				booleanExpression();
				setState(1597);
				whiteSpace();
				setState(1598);
				match(THEN);
				setState(1599);
				endOfStatement();
				setState(1600);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1602);
				match(ELSEIF);
				setState(1603);
				whiteSpace();
				setState(1604);
				booleanExpression();
				setState(1605);
				whiteSpace();
				setState(1606);
				match(THEN);
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1607);
					whiteSpace();
					}
					break;
				}
				setState(1610);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(VBAParser.ELSE, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			match(ELSE);
			setState(1615);
			endOfStatement();
			setState(1616);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLineIfStmtContext extends ParserRuleContext {
		public IfWithNonEmptyThenContext ifWithNonEmptyThen() {
			return getRuleContext(IfWithNonEmptyThenContext.class,0);
		}
		public IfWithEmptyThenContext ifWithEmptyThen() {
			return getRuleContext(IfWithEmptyThenContext.class,0);
		}
		public SingleLineIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineIfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSingleLineIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSingleLineIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSingleLineIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLineIfStmtContext singleLineIfStmt() throws RecognitionException {
		SingleLineIfStmtContext _localctx = new SingleLineIfStmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_singleLineIfStmt);
		try {
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1618);
				ifWithNonEmptyThen();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1619);
				ifWithEmptyThen();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfWithNonEmptyThenContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VBAParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VBAParser.THEN, 0); }
		public ListOrLabelContext listOrLabel() {
			return getRuleContext(ListOrLabelContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public SingleLineElseClauseContext singleLineElseClause() {
			return getRuleContext(SingleLineElseClauseContext.class,0);
		}
		public IfWithNonEmptyThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifWithNonEmptyThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIfWithNonEmptyThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIfWithNonEmptyThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIfWithNonEmptyThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfWithNonEmptyThenContext ifWithNonEmptyThen() throws RecognitionException {
		IfWithNonEmptyThenContext _localctx = new IfWithNonEmptyThenContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_ifWithNonEmptyThen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(IF);
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1623);
				whiteSpace();
				}
				break;
			}
			setState(1626);
			booleanExpression();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1627);
				whiteSpace();
				}
			}

			setState(1630);
			match(THEN);
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1631);
				whiteSpace();
				}
				break;
			}
			setState(1634);
			listOrLabel();
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1635);
				whiteSpace();
				setState(1636);
				singleLineElseClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfWithEmptyThenContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VBAParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VBAParser.THEN, 0); }
		public SingleLineElseClauseContext singleLineElseClause() {
			return getRuleContext(SingleLineElseClauseContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public IfWithEmptyThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifWithEmptyThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIfWithEmptyThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIfWithEmptyThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIfWithEmptyThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfWithEmptyThenContext ifWithEmptyThen() throws RecognitionException {
		IfWithEmptyThenContext _localctx = new IfWithEmptyThenContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_ifWithEmptyThen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(IF);
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1641);
				whiteSpace();
				}
				break;
			}
			setState(1644);
			booleanExpression();
			setState(1646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1645);
				whiteSpace();
				}
			}

			setState(1648);
			match(THEN);
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1649);
				endOfStatement();
				}
				break;
			}
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1652);
				whiteSpace();
				}
			}

			setState(1655);
			singleLineElseClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLineElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(VBAParser.ELSE, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ListOrLabelContext listOrLabel() {
			return getRuleContext(ListOrLabelContext.class,0);
		}
		public SingleLineElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineElseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSingleLineElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSingleLineElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSingleLineElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLineElseClauseContext singleLineElseClause() throws RecognitionException {
		SingleLineElseClauseContext _localctx = new SingleLineElseClauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_singleLineElseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(ELSE);
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1658);
				whiteSpace();
				}
				break;
			}
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1661);
				listOrLabel();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOrLabelContext extends ParserRuleContext {
		public LineNumberLabelContext lineNumberLabel() {
			return getRuleContext(LineNumberLabelContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(VBAParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VBAParser.COLON, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<SameLineStatementContext> sameLineStatement() {
			return getRuleContexts(SameLineStatementContext.class);
		}
		public SameLineStatementContext sameLineStatement(int i) {
			return getRuleContext(SameLineStatementContext.class,i);
		}
		public ListOrLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOrLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterListOrLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitListOrLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitListOrLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOrLabelContext listOrLabel() throws RecognitionException {
		ListOrLabelContext _localctx = new ListOrLabelContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_listOrLabel);
		int _la;
		try {
			int _alt;
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				lineNumberLabel();
				setState(1677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1666);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(1665);
							whiteSpace();
							}
						}

						setState(1668);
						match(COLON);
						setState(1670);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
						case 1:
							{
							setState(1669);
							whiteSpace();
							}
							break;
						}
						setState(1673);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
						case 1:
							{
							setState(1672);
							sameLineStatement();
							}
							break;
						}
						}
						} 
					}
					setState(1679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1680);
					match(COLON);
					setState(1682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(1681);
						whiteSpace();
						}
						break;
					}
					}
				}

				setState(1686);
				sameLineStatement();
				setState(1699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1688);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(1687);
							whiteSpace();
							}
						}

						setState(1690);
						match(COLON);
						setState(1692);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
						case 1:
							{
							setState(1691);
							whiteSpace();
							}
							break;
						}
						setState(1695);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
						case 1:
							{
							setState(1694);
							sameLineStatement();
							}
							break;
						}
						}
						} 
					}
					setState(1701);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SameLineStatementContext extends ParserRuleContext {
		public MainBlockStmtContext mainBlockStmt() {
			return getRuleContext(MainBlockStmtContext.class,0);
		}
		public SameLineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sameLineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSameLineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSameLineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSameLineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SameLineStatementContext sameLineStatement() throws RecognitionException {
		SameLineStatementContext _localctx = new SameLineStatementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_sameLineStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			mainBlockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsStmtContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(VBAParser.IMPLEMENTS, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImplementsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterImplementsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitImplementsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitImplementsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsStmtContext implementsStmt() throws RecognitionException {
		ImplementsStmtContext _localctx = new ImplementsStmtContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_implementsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			match(IMPLEMENTS);
			setState(1709);
			whiteSpace();
			setState(1710);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetStmtContext extends ParserRuleContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(VBAParser.LET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStmtContext letStmt() throws RecognitionException {
		LetStmtContext _localctx = new LetStmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(1712);
				match(LET);
				setState(1713);
				whiteSpace();
				}
			}

			setState(1716);
			lExpression(0);
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1717);
				whiteSpace();
				}
			}

			setState(1720);
			match(EQ);
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1721);
				whiteSpace();
				}
				break;
			}
			setState(1724);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LsetStmtContext extends ParserRuleContext {
		public TerminalNode LSET() { return getToken(VBAParser.LSET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public LsetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lsetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLsetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLsetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLsetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LsetStmtContext lsetStmt() throws RecognitionException {
		LsetStmtContext _localctx = new LsetStmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_lsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(LSET);
			setState(1727);
			whiteSpace();
			setState(1728);
			expression(0);
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1729);
				whiteSpace();
				}
			}

			setState(1732);
			match(EQ);
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1733);
				whiteSpace();
				}
				break;
			}
			setState(1736);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnErrorStmtContext extends ParserRuleContext {
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode ON_ERROR() { return getToken(VBAParser.ON_ERROR, 0); }
		public TerminalNode ON_LOCAL_ERROR() { return getToken(VBAParser.ON_LOCAL_ERROR, 0); }
		public TerminalNode GOTO() { return getToken(VBAParser.GOTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RESUME() { return getToken(VBAParser.RESUME, 0); }
		public TerminalNode NEXT() { return getToken(VBAParser.NEXT, 0); }
		public OnErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onErrorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOnErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOnErrorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOnErrorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnErrorStmtContext onErrorStmt() throws RecognitionException {
		OnErrorStmtContext _localctx = new OnErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_onErrorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			_la = _input.LA(1);
			if ( !(_la==ON_ERROR || _la==ON_LOCAL_ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1739);
			whiteSpace();
			setState(1748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(1740);
				match(GOTO);
				setState(1741);
				whiteSpace();
				setState(1742);
				expression(0);
				}
				break;
			case RESUME:
				{
				setState(1744);
				match(RESUME);
				setState(1745);
				whiteSpace();
				setState(1746);
				match(NEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnGoToStmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(VBAParser.ON, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GOTO() { return getToken(VBAParser.GOTO, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public OnGoToStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onGoToStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOnGoToStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOnGoToStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOnGoToStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnGoToStmtContext onGoToStmt() throws RecognitionException {
		OnGoToStmtContext _localctx = new OnGoToStmtContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_onGoToStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(ON);
			setState(1751);
			whiteSpace();
			setState(1752);
			expression(0);
			setState(1753);
			whiteSpace();
			setState(1754);
			match(GOTO);
			setState(1755);
			whiteSpace();
			setState(1756);
			expression(0);
			setState(1767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1757);
						whiteSpace();
						}
					}

					setState(1760);
					match(COMMA);
					setState(1762);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						setState(1761);
						whiteSpace();
						}
						break;
					}
					setState(1764);
					expression(0);
					}
					} 
				}
				setState(1769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnGoSubStmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(VBAParser.ON, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GOSUB() { return getToken(VBAParser.GOSUB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public OnGoSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onGoSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOnGoSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOnGoSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOnGoSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnGoSubStmtContext onGoSubStmt() throws RecognitionException {
		OnGoSubStmtContext _localctx = new OnGoSubStmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_onGoSubStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(ON);
			setState(1771);
			whiteSpace();
			setState(1772);
			expression(0);
			setState(1773);
			whiteSpace();
			setState(1774);
			match(GOSUB);
			setState(1775);
			whiteSpace();
			setState(1776);
			expression(0);
			setState(1787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1778);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1777);
						whiteSpace();
						}
					}

					setState(1780);
					match(COMMA);
					setState(1782);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
					case 1:
						{
						setState(1781);
						whiteSpace();
						}
						break;
					}
					setState(1784);
					expression(0);
					}
					} 
				}
				setState(1789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyGetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_GET() { return getToken(VBAParser.PROPERTY_GET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(VBAParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(VBAParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public PropertyGetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyGetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPropertyGetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPropertyGetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPropertyGetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyGetStmtContext propertyGetStmt() throws RecognitionException {
		PropertyGetStmtContext _localctx = new PropertyGetStmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_propertyGetStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1790);
				visibility();
				setState(1791);
				whiteSpace();
				}
			}

			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1795);
				match(STATIC);
				setState(1796);
				whiteSpace();
				}
			}

			setState(1799);
			match(PROPERTY_GET);
			setState(1800);
			whiteSpace();
			setState(1801);
			functionName();
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1802);
					whiteSpace();
					}
				}

				setState(1805);
				argList();
				}
				break;
			}
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1808);
				whiteSpace();
				setState(1809);
				asTypeClause();
				}
				break;
			}
			setState(1813);
			endOfStatement();
			setState(1814);
			block();
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1815);
				statementLabelDefinition();
				}
				break;
			}
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1818);
				whiteSpace();
				}
			}

			setState(1821);
			match(END_PROPERTY);
			setState(1827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1822);
					endOfLine();
					setState(1823);
					attributeStmt();
					}
					} 
				}
				setState(1829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_SET() { return getToken(VBAParser.PROPERTY_SET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(VBAParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(VBAParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public PropertySetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPropertySetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPropertySetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPropertySetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySetStmtContext propertySetStmt() throws RecognitionException {
		PropertySetStmtContext _localctx = new PropertySetStmtContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_propertySetStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1830);
				visibility();
				setState(1831);
				whiteSpace();
				}
			}

			setState(1837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1835);
				match(STATIC);
				setState(1836);
				whiteSpace();
				}
			}

			setState(1839);
			match(PROPERTY_SET);
			setState(1840);
			whiteSpace();
			setState(1841);
			subroutineName();
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1842);
					whiteSpace();
					}
				}

				setState(1845);
				argList();
				}
				break;
			}
			setState(1848);
			endOfStatement();
			setState(1849);
			block();
			setState(1851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1850);
				statementLabelDefinition();
				}
				break;
			}
			setState(1854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1853);
				whiteSpace();
				}
			}

			setState(1856);
			match(END_PROPERTY);
			setState(1862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1857);
					endOfLine();
					setState(1858);
					attributeStmt();
					}
					} 
				}
				setState(1864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyLetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_LET() { return getToken(VBAParser.PROPERTY_LET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(VBAParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(VBAParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public PropertyLetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyLetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPropertyLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPropertyLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPropertyLetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyLetStmtContext propertyLetStmt() throws RecognitionException {
		PropertyLetStmtContext _localctx = new PropertyLetStmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_propertyLetStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(1865);
				visibility();
				setState(1866);
				whiteSpace();
				}
			}

			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1870);
				match(STATIC);
				setState(1871);
				whiteSpace();
				}
			}

			setState(1874);
			match(PROPERTY_LET);
			setState(1875);
			whiteSpace();
			setState(1876);
			subroutineName();
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1877);
					whiteSpace();
					}
				}

				setState(1880);
				argList();
				}
				break;
			}
			setState(1883);
			endOfStatement();
			setState(1884);
			block();
			setState(1886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1885);
				statementLabelDefinition();
				}
				break;
			}
			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1888);
				whiteSpace();
				}
			}

			setState(1891);
			match(END_PROPERTY);
			setState(1897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1892);
					endOfLine();
					setState(1893);
					attributeStmt();
					}
					} 
				}
				setState(1899);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RaiseEventStmtContext extends ParserRuleContext {
		public TerminalNode RAISEEVENT() { return getToken(VBAParser.RAISEEVENT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public EventArgumentListContext eventArgumentList() {
			return getRuleContext(EventArgumentListContext.class,0);
		}
		public RaiseEventStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseEventStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRaiseEventStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRaiseEventStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRaiseEventStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseEventStmtContext raiseEventStmt() throws RecognitionException {
		RaiseEventStmtContext _localctx = new RaiseEventStmtContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_raiseEventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(RAISEEVENT);
			setState(1901);
			whiteSpace();
			setState(1902);
			identifier();
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1903);
					whiteSpace();
					}
				}

				setState(1906);
				match(LPAREN);
				setState(1908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1907);
					whiteSpace();
					}
					break;
				}
				setState(1911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1910);
					eventArgumentList();
					}
					break;
				}
				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1913);
					whiteSpace();
					}
				}

				setState(1916);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventArgumentListContext extends ParserRuleContext {
		public List<EventArgumentContext> eventArgument() {
			return getRuleContexts(EventArgumentContext.class);
		}
		public EventArgumentContext eventArgument(int i) {
			return getRuleContext(EventArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public EventArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEventArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEventArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEventArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventArgumentListContext eventArgumentList() throws RecognitionException {
		EventArgumentListContext _localctx = new EventArgumentListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_eventArgumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			eventArgument();
			setState(1930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1920);
						whiteSpace();
						}
					}

					setState(1923);
					match(COMMA);
					setState(1925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
					case 1:
						{
						setState(1924);
						whiteSpace();
						}
						break;
					}
					setState(1927);
					eventArgument();
					}
					} 
				}
				setState(1932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BYVAL() { return getToken(VBAParser.BYVAL, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public EventArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEventArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEventArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEventArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventArgumentContext eventArgument() throws RecognitionException {
		EventArgumentContext _localctx = new EventArgumentContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_eventArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1933);
				match(BYVAL);
				setState(1934);
				whiteSpace();
				}
				break;
			}
			setState(1937);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedimStmtContext extends ParserRuleContext {
		public TerminalNode REDIM() { return getToken(VBAParser.REDIM, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public RedimDeclarationListContext redimDeclarationList() {
			return getRuleContext(RedimDeclarationListContext.class,0);
		}
		public TerminalNode PRESERVE() { return getToken(VBAParser.PRESERVE, 0); }
		public RedimStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redimStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRedimStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRedimStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRedimStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedimStmtContext redimStmt() throws RecognitionException {
		RedimStmtContext _localctx = new RedimStmtContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_redimStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			match(REDIM);
			setState(1940);
			whiteSpace();
			setState(1943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(1941);
				match(PRESERVE);
				setState(1942);
				whiteSpace();
				}
				break;
			}
			setState(1945);
			redimDeclarationList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedimDeclarationListContext extends ParserRuleContext {
		public List<RedimVariableDeclarationContext> redimVariableDeclaration() {
			return getRuleContexts(RedimVariableDeclarationContext.class);
		}
		public RedimVariableDeclarationContext redimVariableDeclaration(int i) {
			return getRuleContext(RedimVariableDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public RedimDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redimDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRedimDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRedimDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRedimDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedimDeclarationListContext redimDeclarationList() throws RecognitionException {
		RedimDeclarationListContext _localctx = new RedimDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_redimDeclarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			redimVariableDeclaration();
			setState(1958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(1948);
						whiteSpace();
						}
					}

					setState(1951);
					match(COMMA);
					setState(1953);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
					case 1:
						{
						setState(1952);
						whiteSpace();
						}
						break;
					}
					setState(1955);
					redimVariableDeclaration();
					}
					} 
				}
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedimVariableDeclarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public RedimVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redimVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRedimVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRedimVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRedimVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedimVariableDeclarationContext redimVariableDeclaration() throws RecognitionException {
		RedimVariableDeclarationContext _localctx = new RedimVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_redimVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			expression(0);
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1962);
				whiteSpace();
				setState(1963);
				asTypeClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidStatementContext extends ParserRuleContext {
		public ModeSpecifierContext modeSpecifier() {
			return getRuleContext(ModeSpecifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public MidStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMidStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMidStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMidStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidStatementContext midStatement() throws RecognitionException {
		MidStatementContext _localctx = new MidStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_midStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			modeSpecifier();
			setState(1968);
			match(LPAREN);
			setState(1970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1969);
				whiteSpace();
				}
			}

			setState(1972);
			lExpression(0);
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1973);
				whiteSpace();
				}
			}

			setState(1976);
			match(COMMA);
			setState(1978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(1977);
				whiteSpace();
				}
				break;
			}
			setState(1980);
			expression(0);
			setState(1982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1981);
				whiteSpace();
				}
			}

			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1984);
				match(COMMA);
				setState(1986);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(1985);
					whiteSpace();
					}
					break;
				}
				setState(1988);
				expression(0);
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(1989);
					whiteSpace();
					}
				}

				}
			}

			setState(1994);
			match(RPAREN);
			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(1995);
				whiteSpace();
				}
			}

			setState(1998);
			match(EQ);
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(1999);
				whiteSpace();
				}
				break;
			}
			setState(2002);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeSpecifierContext extends ParserRuleContext {
		public TerminalNode MID() { return getToken(VBAParser.MID, 0); }
		public TerminalNode MIDB() { return getToken(VBAParser.MIDB, 0); }
		public TerminalNode DOLLAR() { return getToken(VBAParser.DOLLAR, 0); }
		public ModeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeSpecifierContext modeSpecifier() throws RecognitionException {
		ModeSpecifierContext _localctx = new ModeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_modeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			_la = _input.LA(1);
			if ( !(_la==MIDB || _la==MID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(2005);
				match(DOLLAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntegerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerExpressionContext integerExpression() throws RecognitionException {
		IntegerExpressionContext _localctx = new IntegerExpressionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_integerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(VBAParser.CALL, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_callStmt);
		try {
			setState(2020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010);
				match(CALL);
				setState(2011);
				whiteSpace();
				setState(2012);
				lExpression(0);
				}
				break;
			case ANY:
			case ARRAY:
			case CBOOL:
			case CBYTE:
			case CCUR:
			case CDATE:
			case CDBL:
			case CDEC:
			case CINT:
			case CLNG:
			case CLNGLNG:
			case CLNGPTR:
			case CSNG:
			case CSTR:
			case CURRENCY:
			case CVAR:
			case CVERR:
			case DEBUG:
			case DOEVENTS:
			case INPUTB:
			case LBOUND:
			case LENB:
			case LONGLONG:
			case LONGPTR:
			case MIDB:
			case PSET:
			case UBOUND:
			case EXCLAMATIONPOINT:
			case DOT:
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPEND:
			case BEGINPROPERTY:
			case BEGIN:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CLASS:
			case CLOSE:
			case DATABASE:
			case DATE:
			case DOUBLE:
			case ENDPROPERTY:
			case END:
			case EQV:
			case ERROR:
			case FALSE:
			case GET:
			case IMP:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case LOCK:
			case LONG:
			case LIB:
			case LIKE:
			case LINE_INPUT:
			case LOCK_READ:
			case LOCK_WRITE:
			case LOCK_READ_WRITE:
			case ME:
			case MOD:
			case NAME:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case OBJECT:
			case ON_ERROR:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PTRSAFE:
			case PUT:
			case RANDOM:
			case READ:
			case READ_WRITE:
			case REM:
			case RESET:
			case SEEK:
			case SHARED:
			case SINGLE:
			case SPC:
			case STEP:
			case STRING:
			case TAB:
			case TEXT:
			case THEN:
			case TO:
			case TRUE:
			case TYPEOF:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WIDTH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case CHOOSE:
			case ASC:
			case CHR:
			case FORMAT:
			case INSTR:
			case INSTRREV:
			case LCASE:
			case LEFT:
			case LEN:
			case LTRIM:
			case MID:
			case REPLACE:
			case RIGHT:
			case RTRIM:
			case SPACE:
			case SPLIT:
			case STR:
			case STRCOMP:
			case STRCONV:
			case STRREVERSE:
			case TRIM:
			case UCASE:
			case VAL:
			case DATEADD:
			case DATEDIFF:
			case DATEPART:
			case DATESERIAL:
			case DATEVALUE1:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case MONTHNAME1:
			case NOW:
			case TIMESERIAL:
			case TIMEVALUE1:
			case WEEKDAY:
			case WEEKDAYNAME:
			case YEAR:
			case ABS:
			case ATN:
			case COS:
			case EXP:
			case FIX:
			case INT:
			case LOG:
			case RANDOMIZE:
			case RND:
			case ROUND:
			case SGN:
			case SIN:
			case SQR:
			case TAN:
			case ENVIRON:
			case ISDATE:
			case ISEMPTY:
			case ISERROR:
			case ISNULL:
			case ISNUMERIC:
			case DDB:
			case FV:
			case IPMT:
			case IRR:
			case MIRR:
			case NPER:
			case NPV:
			case PMT:
			case PPMT:
			case PV:
			case RATE:
			case SLN:
			case SYD:
			case CHDIR:
			case CHDRIVE:
			case CURDIR:
			case DIR:
			case FILEDATETIME:
			case FILELEN:
			case GETATTR:
			case MKDIR:
			case SETATTR:
			case CREATEOBJECT:
			case ASCW:
			case ROUNDUP:
			case ROUNDDOWN:
			case L_SQUARE_BRACKET:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2014);
				lExpression(0);
				setState(2018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2015);
					whiteSpace();
					setState(2016);
					argumentList();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResumeStmtContext extends ParserRuleContext {
		public TerminalNode RESUME() { return getToken(VBAParser.RESUME, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(VBAParser.NEXT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResumeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resumeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterResumeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitResumeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitResumeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResumeStmtContext resumeStmt() throws RecognitionException {
		ResumeStmtContext _localctx = new ResumeStmtContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_resumeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			match(RESUME);
			setState(2028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2023);
				whiteSpace();
				setState(2026);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(2024);
					match(NEXT);
					}
					break;
				case ANY:
				case ARRAY:
				case CBOOL:
				case CBYTE:
				case CCUR:
				case CDATE:
				case CDBL:
				case CDEC:
				case CINT:
				case CLNG:
				case CLNGLNG:
				case CLNGPTR:
				case CSNG:
				case CSTR:
				case CURRENCY:
				case CVAR:
				case CVERR:
				case DEBUG:
				case DOEVENTS:
				case INPUTB:
				case LBOUND:
				case LENB:
				case LONGLONG:
				case LONGPTR:
				case MIDB:
				case PSET:
				case UBOUND:
				case EXCLAMATIONPOINT:
				case DOT:
				case HASH:
				case ACCESS:
				case ADDRESSOF:
				case ALIAS:
				case AND:
				case ATTRIBUTE:
				case APPEND:
				case BEGINPROPERTY:
				case BEGIN:
				case BINARY:
				case BOOLEAN:
				case BYVAL:
				case BYREF:
				case BYTE:
				case CLASS:
				case CLOSE:
				case DATABASE:
				case DATE:
				case DOUBLE:
				case EMPTY:
				case ENDPROPERTY:
				case END:
				case EQV:
				case ERROR:
				case FALSE:
				case GET:
				case IMP:
				case IN:
				case INPUT:
				case IS:
				case INTEGER:
				case LOCK:
				case LONG:
				case LIB:
				case LIKE:
				case LINE_INPUT:
				case LOCK_READ:
				case LOCK_WRITE:
				case LOCK_READ_WRITE:
				case ME:
				case MOD:
				case NAME:
				case NEW:
				case NOT:
				case NOTHING:
				case NULL:
				case OBJECT:
				case ON_ERROR:
				case OPEN:
				case OPTIONAL:
				case OR:
				case OUTPUT:
				case PARAMARRAY:
				case PRESERVE:
				case PRINT:
				case PTRSAFE:
				case PUT:
				case RANDOM:
				case READ:
				case READ_WRITE:
				case REM:
				case RESET:
				case SEEK:
				case SHARED:
				case SINGLE:
				case SPC:
				case STEP:
				case STRING:
				case TAB:
				case TEXT:
				case THEN:
				case TO:
				case TRUE:
				case TYPEOF:
				case UNLOCK:
				case UNTIL:
				case VARIANT:
				case VERSION:
				case WIDTH:
				case WITHEVENTS:
				case WRITE:
				case XOR:
				case CHOOSE:
				case ASC:
				case CHR:
				case FORMAT:
				case INSTR:
				case INSTRREV:
				case LCASE:
				case LEFT:
				case LEN:
				case LTRIM:
				case MID:
				case REPLACE:
				case RIGHT:
				case RTRIM:
				case SPACE:
				case SPLIT:
				case STR:
				case STRCOMP:
				case STRCONV:
				case STRREVERSE:
				case TRIM:
				case UCASE:
				case VAL:
				case DATEADD:
				case DATEDIFF:
				case DATEPART:
				case DATESERIAL:
				case DATEVALUE1:
				case DAY:
				case HOUR:
				case MINUTE:
				case MONTH:
				case MONTHNAME1:
				case NOW:
				case TIMESERIAL:
				case TIMEVALUE1:
				case WEEKDAY:
				case WEEKDAYNAME:
				case YEAR:
				case ABS:
				case ATN:
				case COS:
				case EXP:
				case FIX:
				case INT:
				case LOG:
				case RANDOMIZE:
				case RND:
				case ROUND:
				case SGN:
				case SIN:
				case SQR:
				case TAN:
				case ENVIRON:
				case ISDATE:
				case ISEMPTY:
				case ISERROR:
				case ISNULL:
				case ISNUMERIC:
				case DDB:
				case FV:
				case IPMT:
				case IRR:
				case MIRR:
				case NPER:
				case NPV:
				case PMT:
				case PPMT:
				case PV:
				case RATE:
				case SLN:
				case SYD:
				case CHDIR:
				case CHDRIVE:
				case CURDIR:
				case DIR:
				case FILEDATETIME:
				case FILELEN:
				case GETATTR:
				case MKDIR:
				case SETATTR:
				case CREATEOBJECT:
				case ASCW:
				case ROUNDUP:
				case ROUNDDOWN:
				case LPAREN:
				case MINUS:
				case L_SQUARE_BRACKET:
				case STRINGLITERAL:
				case OCTLITERAL:
				case HEXLITERAL:
				case FLOATLITERAL:
				case INTEGERLITERAL:
				case DATELITERAL:
				case WS:
				case IDENTIFIER:
				case LINE_CONTINUATION:
					{
					setState(2025);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(VBAParser.RETURN, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			match(RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RsetStmtContext extends ParserRuleContext {
		public TerminalNode RSET() { return getToken(VBAParser.RSET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public RsetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRsetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRsetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRsetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RsetStmtContext rsetStmt() throws RecognitionException {
		RsetStmtContext _localctx = new RsetStmtContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_rsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			match(RSET);
			setState(2033);
			whiteSpace();
			setState(2034);
			expression(0);
			setState(2036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2035);
				whiteSpace();
				}
			}

			setState(2038);
			match(EQ);
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2039);
				whiteSpace();
				}
				break;
			}
			setState(2042);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopStmtContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(VBAParser.STOP, 0); }
		public StopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopStmtContext stopStmt() throws RecognitionException {
		StopStmtContext _localctx = new StopStmtContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_stopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameStmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VBAParser.NAME, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(VBAParser.AS, 0); }
		public NameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterNameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitNameStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitNameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameStmtContext nameStmt() throws RecognitionException {
		NameStmtContext _localctx = new NameStmtContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_nameStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			match(NAME);
			setState(2047);
			whiteSpace();
			setState(2048);
			expression(0);
			setState(2049);
			whiteSpace();
			setState(2050);
			match(AS);
			setState(2051);
			whiteSpace();
			setState(2052);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectCaseStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(VBAParser.SELECT, 0); }
		public TerminalNode CASE() { return getToken(VBAParser.CASE, 0); }
		public SelectExpressionContext selectExpression() {
			return getRuleContext(SelectExpressionContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_SELECT() { return getToken(VBAParser.END_SELECT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public List<StatementLabelDefinitionContext> statementLabelDefinition() {
			return getRuleContexts(StatementLabelDefinitionContext.class);
		}
		public StatementLabelDefinitionContext statementLabelDefinition(int i) {
			return getRuleContext(StatementLabelDefinitionContext.class,i);
		}
		public CaseElseClauseContext caseElseClause() {
			return getRuleContext(CaseElseClauseContext.class,0);
		}
		public SelectCaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCaseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSelectCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSelectCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSelectCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectCaseStmtContext selectCaseStmt() throws RecognitionException {
		SelectCaseStmtContext _localctx = new SelectCaseStmtContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_selectCaseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			match(SELECT);
			setState(2056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2055);
				whiteSpace();
				}
			}

			setState(2058);
			match(CASE);
			setState(2060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2059);
				whiteSpace();
				}
				break;
			}
			setState(2062);
			selectExpression();
			setState(2063);
			endOfStatement();
			setState(2073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2065);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
					case 1:
						{
						setState(2064);
						statementLabelDefinition();
						}
						break;
					}
					setState(2068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2067);
						whiteSpace();
						}
					}

					setState(2070);
					caseClause();
					}
					} 
				}
				setState(2075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			setState(2077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2076);
				statementLabelDefinition();
				}
				break;
			}
			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2079);
				whiteSpace();
				}
				break;
			}
			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2082);
				caseElseClause();
				}
				break;
			}
			setState(2086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2085);
				statementLabelDefinition();
				}
				break;
			}
			setState(2089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2088);
				whiteSpace();
				}
			}

			setState(2091);
			match(END_SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSelectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSelectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_selectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VBAParser.CASE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<RangeClauseContext> rangeClause() {
			return getRuleContexts(RangeClauseContext.class);
		}
		public RangeClauseContext rangeClause(int i) {
			return getRuleContext(RangeClauseContext.class,i);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_caseClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			match(CASE);
			setState(2096);
			whiteSpace();
			setState(2097);
			rangeClause();
			setState(2108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2099);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2098);
						whiteSpace();
						}
					}

					setState(2101);
					match(COMMA);
					setState(2103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
					case 1:
						{
						setState(2102);
						whiteSpace();
						}
						break;
					}
					setState(2105);
					rangeClause();
					}
					} 
				}
				setState(2110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			setState(2111);
			endOfStatement();
			setState(2112);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseElseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VBAParser.CASE, 0); }
		public TerminalNode ELSE() { return getToken(VBAParser.ELSE, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public CaseElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCaseElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCaseElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCaseElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElseClauseContext caseElseClause() throws RecognitionException {
		CaseElseClauseContext _localctx = new CaseElseClauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_caseElseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(CASE);
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2115);
				whiteSpace();
				}
			}

			setState(2118);
			match(ELSE);
			setState(2119);
			endOfStatement();
			setState(2120);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeClauseContext extends ParserRuleContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(VBAParser.IS, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public SelectStartValueContext selectStartValue() {
			return getRuleContext(SelectStartValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(VBAParser.TO, 0); }
		public SelectEndValueContext selectEndValue() {
			return getRuleContext(SelectEndValueContext.class,0);
		}
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_rangeClause);
		int _la;
		try {
			setState(2141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2122);
					match(IS);
					setState(2124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2123);
						whiteSpace();
						}
					}

					}
					break;
				}
				setState(2128);
				comparisonOperator();
				setState(2130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2129);
					whiteSpace();
					}
					break;
				}
				setState(2132);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2134);
				selectStartValue();
				setState(2135);
				whiteSpace();
				setState(2136);
				match(TO);
				setState(2137);
				whiteSpace();
				setState(2138);
				selectEndValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2140);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStartValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectStartValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStartValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSelectStartValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSelectStartValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSelectStartValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStartValueContext selectStartValue() throws RecognitionException {
		SelectStartValueContext _localctx = new SelectStartValueContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_selectStartValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectEndValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectEndValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEndValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSelectEndValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSelectEndValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSelectEndValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectEndValueContext selectEndValue() throws RecognitionException {
		SelectEndValueContext _localctx = new SelectEndValueContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_selectEndValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(VBAParser.SET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_setStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			match(SET);
			setState(2148);
			whiteSpace();
			setState(2149);
			lExpression(0);
			setState(2151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2150);
				whiteSpace();
				}
			}

			setState(2153);
			match(EQ);
			setState(2155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2154);
				whiteSpace();
				}
				break;
			}
			setState(2157);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubStmtContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(VBAParser.SUB, 0); }
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END_SUB() { return getToken(VBAParser.END_SUB, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode STATIC() { return getToken(VBAParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public SubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubStmtContext subStmt() throws RecognitionException {
		SubStmtContext _localctx = new SubStmtContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_subStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(2159);
				visibility();
				setState(2160);
				whiteSpace();
				}
			}

			setState(2166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(2164);
				match(STATIC);
				setState(2165);
				whiteSpace();
				}
			}

			setState(2168);
			match(SUB);
			setState(2170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2169);
				whiteSpace();
				}
			}

			setState(2172);
			subroutineName();
			setState(2177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2173);
					whiteSpace();
					}
				}

				setState(2176);
				argList();
				}
				break;
			}
			setState(2179);
			endOfStatement();
			setState(2180);
			block();
			setState(2182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2181);
				statementLabelDefinition();
				}
				break;
			}
			setState(2185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2184);
				whiteSpace();
				}
			}

			setState(2187);
			match(END_SUB);
			setState(2193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2188);
					endOfLine();
					setState(2189);
					attributeStmt();
					}
					} 
				}
				setState(2195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SubroutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSubroutineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSubroutineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSubroutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineNameContext subroutineName() throws RecognitionException {
		SubroutineNameContext _localctx = new SubroutineNameContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_subroutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UdtDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(VBAParser.TYPE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public UntypedIdentifierContext untypedIdentifier() {
			return getRuleContext(UntypedIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public UdtMemberListContext udtMemberList() {
			return getRuleContext(UdtMemberListContext.class,0);
		}
		public TerminalNode END_TYPE() { return getToken(VBAParser.END_TYPE, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public UdtDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udtDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUdtDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUdtDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUdtDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UdtDeclarationContext udtDeclaration() throws RecognitionException {
		UdtDeclarationContext _localctx = new UdtDeclarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_udtDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) {
				{
				setState(2198);
				visibility();
				setState(2199);
				whiteSpace();
				}
			}

			setState(2203);
			match(TYPE);
			setState(2204);
			whiteSpace();
			setState(2205);
			untypedIdentifier();
			setState(2206);
			endOfStatement();
			setState(2207);
			udtMemberList();
			setState(2208);
			match(END_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UdtMemberListContext extends ParserRuleContext {
		public List<UdtMemberContext> udtMember() {
			return getRuleContexts(UdtMemberContext.class);
		}
		public UdtMemberContext udtMember(int i) {
			return getRuleContext(UdtMemberContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public UdtMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udtMemberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUdtMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUdtMemberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUdtMemberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UdtMemberListContext udtMemberList() throws RecognitionException {
		UdtMemberListContext _localctx = new UdtMemberListContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_udtMemberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2210);
				udtMember();
				setState(2211);
				endOfStatement();
				}
				}
				setState(2215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << EXIT) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << OPTION) | (1L << PSET) | (1L << UBOUND) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << AS) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CLASS) | (1L << CLOSE) | (1L << CONST) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DEFBOOL - 64)) | (1L << (DEFBYTE - 64)) | (1L << (DEFDATE - 64)) | (1L << (DEFDBL - 64)) | (1L << (DEFCUR - 64)) | (1L << (DEFINT - 64)) | (1L << (DEFLNG - 64)) | (1L << (DEFLNGLNG - 64)) | (1L << (DEFLNGPTR - 64)) | (1L << (DEFOBJ - 64)) | (1L << (DEFSNG - 64)) | (1L << (DEFSTR - 64)) | (1L << (DEFVAR - 64)) | (1L << (DIM - 64)) | (1L << (DO - 64)) | (1L << (DOUBLE - 64)) | (1L << (ELSE - 64)) | (1L << (ELSEIF - 64)) | (1L << (ENDPROPERTY - 64)) | (1L << (END_SELECT - 64)) | (1L << (END_WITH - 64)) | (1L << (END - 64)) | (1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LOCK_READ - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LOCK_WRITE - 128)) | (1L << (LOCK_READ_WRITE - 128)) | (1L << (LSET - 128)) | (1L << (ME - 128)) | (1L << (MOD - 128)) | (1L << (NAME - 128)) | (1L << (NEXT - 128)) | (1L << (NEW - 128)) | (1L << (NOT - 128)) | (1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (OBJECT - 128)) | (1L << (ON - 128)) | (1L << (ON_ERROR - 128)) | (1L << (OPEN - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PTRSAFE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (READ_WRITE - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RSET - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SET - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (VERSION - 192)) | (1L << (WEND - 192)) | (1L << (WHILE - 192)) | (1L << (WIDTH - 192)) | (1L << (WITH - 192)) | (1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)))) != 0) || _la==L_SQUARE_BRACKET || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UdtMemberContext extends ParserRuleContext {
		public ReservedNameMemberDeclarationContext reservedNameMemberDeclaration() {
			return getRuleContext(ReservedNameMemberDeclarationContext.class,0);
		}
		public UntypedNameMemberDeclarationContext untypedNameMemberDeclaration() {
			return getRuleContext(UntypedNameMemberDeclarationContext.class,0);
		}
		public UdtMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udtMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUdtMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUdtMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUdtMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UdtMemberContext udtMember() throws RecognitionException {
		UdtMemberContext _localctx = new UdtMemberContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_udtMember);
		try {
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2217);
				reservedNameMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
				untypedNameMemberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UntypedNameMemberDeclarationContext extends ParserRuleContext {
		public UntypedIdentifierContext untypedIdentifier() {
			return getRuleContext(UntypedIdentifierContext.class,0);
		}
		public OptionalArrayClauseContext optionalArrayClause() {
			return getRuleContext(OptionalArrayClauseContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public UntypedNameMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untypedNameMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUntypedNameMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUntypedNameMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUntypedNameMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntypedNameMemberDeclarationContext untypedNameMemberDeclaration() throws RecognitionException {
		UntypedNameMemberDeclarationContext _localctx = new UntypedNameMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_untypedNameMemberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			untypedIdentifier();
			setState(2223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2222);
				whiteSpace();
				}
			}

			setState(2225);
			optionalArrayClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedNameMemberDeclarationContext extends ParserRuleContext {
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ReservedNameMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedNameMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterReservedNameMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitReservedNameMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitReservedNameMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedNameMemberDeclarationContext reservedNameMemberDeclaration() throws RecognitionException {
		ReservedNameMemberDeclarationContext _localctx = new ReservedNameMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_reservedNameMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			unrestrictedIdentifier();
			setState(2228);
			whiteSpace();
			setState(2229);
			asTypeClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalArrayClauseContext extends ParserRuleContext {
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ArrayDimContext arrayDim() {
			return getRuleContext(ArrayDimContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public OptionalArrayClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalArrayClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterOptionalArrayClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitOptionalArrayClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitOptionalArrayClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalArrayClauseContext optionalArrayClause() throws RecognitionException {
		OptionalArrayClauseContext _localctx = new OptionalArrayClauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_optionalArrayClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2231);
				arrayDim();
				setState(2232);
				whiteSpace();
				}
			}

			setState(2236);
			asTypeClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDimContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public BoundsListContext boundsList() {
			return getRuleContext(BoundsListContext.class,0);
		}
		public ArrayDimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterArrayDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitArrayDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitArrayDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDimContext arrayDim() throws RecognitionException {
		ArrayDimContext _localctx = new ArrayDimContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_arrayDim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			match(LPAREN);
			setState(2240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2239);
				whiteSpace();
				}
				break;
			}
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2242);
				boundsList();
				}
				break;
			}
			setState(2246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2245);
				whiteSpace();
				}
			}

			setState(2248);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundsListContext extends ParserRuleContext {
		public List<DimSpecContext> dimSpec() {
			return getRuleContexts(DimSpecContext.class);
		}
		public DimSpecContext dimSpec(int i) {
			return getRuleContext(DimSpecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public BoundsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBoundsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBoundsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBoundsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundsListContext boundsList() throws RecognitionException {
		BoundsListContext _localctx = new BoundsListContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_boundsList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			dimSpec();
			setState(2261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2251);
						whiteSpace();
						}
					}

					setState(2254);
					match(COMMA);
					setState(2256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
					case 1:
						{
						setState(2255);
						whiteSpace();
						}
						break;
					}
					setState(2258);
					dimSpec();
					}
					} 
				}
				setState(2263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimSpecContext extends ParserRuleContext {
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public DimSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDimSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDimSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDimSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimSpecContext dimSpec() throws RecognitionException {
		DimSpecContext _localctx = new DimSpecContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_dimSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				{
				setState(2264);
				lowerBound();
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2265);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
			setState(2270);
			upperBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowerBoundContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode TO() { return getToken(VBAParser.TO, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLowerBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLowerBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLowerBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerBoundContext lowerBound() throws RecognitionException {
		LowerBoundContext _localctx = new LowerBoundContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			constantExpression();
			setState(2274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2273);
				whiteSpace();
				}
			}

			setState(2276);
			match(TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpperBoundContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUpperBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUpperBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUpperBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperBoundContext upperBound() throws RecognitionException {
		UpperBoundContext _localctx = new UpperBoundContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_upperBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			constantExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStmtContext extends ParserRuleContext {
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public VariableListStmtContext variableListStmt() {
			return getRuleContext(VariableListStmtContext.class,0);
		}
		public TerminalNode DIM() { return getToken(VBAParser.DIM, 0); }
		public TerminalNode STATIC() { return getToken(VBAParser.STATIC, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode WITHEVENTS() { return getToken(VBAParser.WITHEVENTS, 0); }
		public VariableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterVariableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitVariableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitVariableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStmtContext variableStmt() throws RecognitionException {
		VariableStmtContext _localctx = new VariableStmtContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_variableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIM:
				{
				setState(2282);
				match(DIM);
				}
				break;
			case STATIC:
				{
				setState(2283);
				match(STATIC);
				}
				break;
			case FRIEND:
			case GLOBAL:
			case PRIVATE:
			case PUBLIC:
				{
				setState(2284);
				visibility();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2287);
			whiteSpace();
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2288);
				match(WITHEVENTS);
				setState(2289);
				whiteSpace();
				}
				break;
			}
			setState(2292);
			variableListStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableListStmtContext extends ParserRuleContext {
		public List<VariableSubStmtContext> variableSubStmt() {
			return getRuleContexts(VariableSubStmtContext.class);
		}
		public VariableSubStmtContext variableSubStmt(int i) {
			return getRuleContext(VariableSubStmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public VariableListStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableListStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterVariableListStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitVariableListStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitVariableListStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListStmtContext variableListStmt() throws RecognitionException {
		VariableListStmtContext _localctx = new VariableListStmtContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_variableListStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			variableSubStmt();
			setState(2305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2295);
						whiteSpace();
						}
					}

					setState(2298);
					match(COMMA);
					setState(2300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2299);
						whiteSpace();
						}
					}

					setState(2302);
					variableSubStmt();
					}
					} 
				}
				setState(2307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableSubStmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public VariableSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterVariableSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitVariableSubStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitVariableSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableSubStmtContext variableSubStmt() throws RecognitionException {
		VariableSubStmtContext _localctx = new VariableSubStmtContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_variableSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			identifier();
			setState(2323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2309);
					whiteSpace();
					}
				}

				setState(2312);
				match(LPAREN);
				setState(2314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2313);
					whiteSpace();
					}
					break;
				}
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << PSET) | (1L << UBOUND) | (1L << EXCLAMATIONPOINT) | (1L << DOT) | (1L << HASH) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CLASS) | (1L << CLOSE) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (DOUBLE - 80)) | (1L << (EMPTY - 80)) | (1L << (ENDPROPERTY - 80)) | (1L << (END - 80)) | (1L << (EQV - 80)) | (1L << (ERROR - 80)) | (1L << (FALSE - 80)) | (1L << (GET - 80)) | (1L << (IMP - 80)) | (1L << (IN - 80)) | (1L << (INPUT - 80)) | (1L << (IS - 80)) | (1L << (INTEGER - 80)) | (1L << (LOCK - 80)) | (1L << (LONG - 80)) | (1L << (LIB - 80)) | (1L << (LIKE - 80)) | (1L << (LINE_INPUT - 80)) | (1L << (LOCK_READ - 80)) | (1L << (LOCK_WRITE - 80)) | (1L << (LOCK_READ_WRITE - 80)) | (1L << (ME - 80)) | (1L << (MOD - 80)) | (1L << (NAME - 80)) | (1L << (NEW - 80)) | (1L << (NOT - 80)) | (1L << (NOTHING - 80)) | (1L << (NULL - 80)) | (1L << (OBJECT - 80)) | (1L << (ON_ERROR - 80)) | (1L << (OPEN - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (OPTIONAL - 144)) | (1L << (OR - 144)) | (1L << (OUTPUT - 144)) | (1L << (PARAMARRAY - 144)) | (1L << (PRESERVE - 144)) | (1L << (PRINT - 144)) | (1L << (PTRSAFE - 144)) | (1L << (PUT - 144)) | (1L << (RANDOM - 144)) | (1L << (READ - 144)) | (1L << (READ_WRITE - 144)) | (1L << (REM - 144)) | (1L << (RESET - 144)) | (1L << (SEEK - 144)) | (1L << (SHARED - 144)) | (1L << (SINGLE - 144)) | (1L << (SPC - 144)) | (1L << (STEP - 144)) | (1L << (STRING - 144)) | (1L << (TAB - 144)) | (1L << (TEXT - 144)) | (1L << (THEN - 144)) | (1L << (TO - 144)) | (1L << (TRUE - 144)) | (1L << (TYPEOF - 144)) | (1L << (UNLOCK - 144)) | (1L << (UNTIL - 144)) | (1L << (VARIANT - 144)) | (1L << (VERSION - 144)) | (1L << (WIDTH - 144)) | (1L << (WITHEVENTS - 144)) | (1L << (WRITE - 144)) | (1L << (XOR - 144)) | (1L << (CHOOSE - 144)) | (1L << (ASC - 144)) | (1L << (CHR - 144)) | (1L << (FORMAT - 144)) | (1L << (INSTR - 144)) | (1L << (INSTRREV - 144)) | (1L << (LCASE - 144)) | (1L << (LEFT - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (LEN - 208)) | (1L << (LTRIM - 208)) | (1L << (MID - 208)) | (1L << (REPLACE - 208)) | (1L << (RIGHT - 208)) | (1L << (RTRIM - 208)) | (1L << (SPACE - 208)) | (1L << (SPLIT - 208)) | (1L << (STR - 208)) | (1L << (STRCOMP - 208)) | (1L << (STRCONV - 208)) | (1L << (STRREVERSE - 208)) | (1L << (TRIM - 208)) | (1L << (UCASE - 208)) | (1L << (VAL - 208)) | (1L << (DATEADD - 208)) | (1L << (DATEDIFF - 208)) | (1L << (DATEPART - 208)) | (1L << (DATESERIAL - 208)) | (1L << (DATEVALUE1 - 208)) | (1L << (DAY - 208)) | (1L << (HOUR - 208)) | (1L << (MINUTE - 208)) | (1L << (MONTH - 208)) | (1L << (MONTHNAME1 - 208)) | (1L << (NOW - 208)) | (1L << (TIMESERIAL - 208)) | (1L << (TIMEVALUE1 - 208)) | (1L << (WEEKDAY - 208)) | (1L << (WEEKDAYNAME - 208)) | (1L << (YEAR - 208)) | (1L << (ABS - 208)) | (1L << (ATN - 208)) | (1L << (COS - 208)) | (1L << (EXP - 208)) | (1L << (FIX - 208)) | (1L << (INT - 208)) | (1L << (LOG - 208)) | (1L << (RANDOMIZE - 208)) | (1L << (RND - 208)) | (1L << (ROUND - 208)) | (1L << (SGN - 208)) | (1L << (SIN - 208)) | (1L << (SQR - 208)) | (1L << (TAN - 208)) | (1L << (ENVIRON - 208)) | (1L << (ISDATE - 208)) | (1L << (ISEMPTY - 208)) | (1L << (ISERROR - 208)) | (1L << (ISNULL - 208)) | (1L << (ISNUMERIC - 208)) | (1L << (DDB - 208)) | (1L << (FV - 208)) | (1L << (IPMT - 208)) | (1L << (IRR - 208)) | (1L << (MIRR - 208)) | (1L << (NPER - 208)) | (1L << (NPV - 208)) | (1L << (PMT - 208)) | (1L << (PPMT - 208)) | (1L << (PV - 208)) | (1L << (RATE - 208)) | (1L << (SLN - 208)) | (1L << (SYD - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (CHDIR - 272)) | (1L << (CHDRIVE - 272)) | (1L << (CURDIR - 272)) | (1L << (DIR - 272)) | (1L << (FILEDATETIME - 272)) | (1L << (FILELEN - 272)) | (1L << (GETATTR - 272)) | (1L << (MKDIR - 272)) | (1L << (SETATTR - 272)) | (1L << (CREATEOBJECT - 272)) | (1L << (ASCW - 272)) | (1L << (ROUNDUP - 272)) | (1L << (ROUNDDOWN - 272)) | (1L << (LPAREN - 272)) | (1L << (MINUS - 272)) | (1L << (L_SQUARE_BRACKET - 272)) | (1L << (STRINGLITERAL - 272)) | (1L << (OCTLITERAL - 272)) | (1L << (HEXLITERAL - 272)) | (1L << (FLOATLITERAL - 272)) | (1L << (INTEGERLITERAL - 272)) | (1L << (DATELITERAL - 272)) | (1L << (WS - 272)) | (1L << (IDENTIFIER - 272)) | (1L << (LINE_CONTINUATION - 272)))) != 0)) {
					{
					setState(2316);
					subscripts();
					setState(2318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2317);
						whiteSpace();
						}
					}

					}
				}

				setState(2322);
				match(RPAREN);
				}
				break;
			}
			setState(2328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2325);
				whiteSpace();
				setState(2326);
				asTypeClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileWendStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VBAParser.WHILE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WEND() { return getToken(VBAParser.WEND, 0); }
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public WhileWendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileWendStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWhileWendStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWhileWendStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWhileWendStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileWendStmtContext whileWendStmt() throws RecognitionException {
		WhileWendStmtContext _localctx = new WhileWendStmtContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_whileWendStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			match(WHILE);
			setState(2331);
			whiteSpace();
			setState(2332);
			expression(0);
			setState(2333);
			endOfStatement();
			setState(2334);
			block();
			setState(2336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2335);
				statementLabelDefinition();
				}
				break;
			}
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2338);
				whiteSpace();
				}
			}

			setState(2341);
			match(WEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(VBAParser.WITH, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END_WITH() { return getToken(VBAParser.END_WITH, 0); }
		public StatementLabelDefinitionContext statementLabelDefinition() {
			return getRuleContext(StatementLabelDefinitionContext.class,0);
		}
		public WithStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWithStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWithStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWithStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStmtContext withStmt() throws RecognitionException {
		WithStmtContext _localctx = new WithStmtContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_withStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			match(WITH);
			setState(2344);
			whiteSpace();
			setState(2345);
			expression(0);
			setState(2346);
			endOfStatement();
			setState(2347);
			block();
			setState(2349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				{
				setState(2348);
				statementLabelDefinition();
				}
				break;
			}
			setState(2352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2351);
				whiteSpace();
				}
			}

			setState(2354);
			match(END_WITH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineSpecialFormContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(VBAParser.MINUS, 0); }
		public List<TupleContext> tuple() {
			return getRuleContexts(TupleContext.class);
		}
		public TupleContext tuple(int i) {
			return getRuleContext(TupleContext.class,i);
		}
		public List<TerminalNode> STEP() { return getTokens(VBAParser.STEP); }
		public TerminalNode STEP(int i) {
			return getToken(VBAParser.STEP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public LineSpecialFormOptionContext lineSpecialFormOption() {
			return getRuleContext(LineSpecialFormOptionContext.class,0);
		}
		public LineSpecialFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineSpecialForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLineSpecialForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLineSpecialForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLineSpecialForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineSpecialFormContext lineSpecialForm() throws RecognitionException {
		LineSpecialFormContext _localctx = new LineSpecialFormContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_lineSpecialForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			expression(0);
			setState(2357);
			whiteSpace();
			setState(2365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP || _la==LPAREN) {
				{
				setState(2362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STEP) {
					{
					setState(2358);
					match(STEP);
					setState(2360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2359);
						whiteSpace();
						}
					}

					}
				}

				setState(2364);
				tuple();
				}
			}

			setState(2367);
			match(MINUS);
			setState(2372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(2368);
				match(STEP);
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2369);
					whiteSpace();
					}
				}

				}
			}

			setState(2374);
			tuple();
			setState(2376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2375);
				whiteSpace();
				}
				break;
			}
			setState(2383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				setState(2378);
				match(COMMA);
				setState(2380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(2379);
					whiteSpace();
					}
					break;
				}
				setState(2382);
				expression(0);
				}
				break;
			}
			setState(2386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				{
				setState(2385);
				whiteSpace();
				}
				break;
			}
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2388);
				match(COMMA);
				setState(2390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
				case 1:
					{
					setState(2389);
					whiteSpace();
					}
					break;
				}
				setState(2392);
				lineSpecialFormOption();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CircleSpecialFormContext extends ParserRuleContext {
		public TerminalNode CIRCLE() { return getToken(VBAParser.CIRCLE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(VBAParser.DOT, 0); }
		public TerminalNode STEP() { return getToken(VBAParser.STEP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public CircleSpecialFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circleSpecialForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCircleSpecialForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCircleSpecialForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCircleSpecialForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleSpecialFormContext circleSpecialForm() throws RecognitionException {
		CircleSpecialFormContext _localctx = new CircleSpecialFormContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_circleSpecialForm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << PSET) | (1L << UBOUND) | (1L << EXCLAMATIONPOINT) | (1L << DOT) | (1L << HASH) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CLASS) | (1L << CLOSE) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (DOUBLE - 80)) | (1L << (EMPTY - 80)) | (1L << (ENDPROPERTY - 80)) | (1L << (END - 80)) | (1L << (EQV - 80)) | (1L << (ERROR - 80)) | (1L << (FALSE - 80)) | (1L << (GET - 80)) | (1L << (IMP - 80)) | (1L << (IN - 80)) | (1L << (INPUT - 80)) | (1L << (IS - 80)) | (1L << (INTEGER - 80)) | (1L << (LOCK - 80)) | (1L << (LONG - 80)) | (1L << (LIB - 80)) | (1L << (LIKE - 80)) | (1L << (LINE_INPUT - 80)) | (1L << (LOCK_READ - 80)) | (1L << (LOCK_WRITE - 80)) | (1L << (LOCK_READ_WRITE - 80)) | (1L << (ME - 80)) | (1L << (MOD - 80)) | (1L << (NAME - 80)) | (1L << (NEW - 80)) | (1L << (NOT - 80)) | (1L << (NOTHING - 80)) | (1L << (NULL - 80)) | (1L << (OBJECT - 80)) | (1L << (ON_ERROR - 80)) | (1L << (OPEN - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (OPTIONAL - 144)) | (1L << (OR - 144)) | (1L << (OUTPUT - 144)) | (1L << (PARAMARRAY - 144)) | (1L << (PRESERVE - 144)) | (1L << (PRINT - 144)) | (1L << (PTRSAFE - 144)) | (1L << (PUT - 144)) | (1L << (RANDOM - 144)) | (1L << (READ - 144)) | (1L << (READ_WRITE - 144)) | (1L << (REM - 144)) | (1L << (RESET - 144)) | (1L << (SEEK - 144)) | (1L << (SHARED - 144)) | (1L << (SINGLE - 144)) | (1L << (SPC - 144)) | (1L << (STEP - 144)) | (1L << (STRING - 144)) | (1L << (TAB - 144)) | (1L << (TEXT - 144)) | (1L << (THEN - 144)) | (1L << (TO - 144)) | (1L << (TRUE - 144)) | (1L << (TYPEOF - 144)) | (1L << (UNLOCK - 144)) | (1L << (UNTIL - 144)) | (1L << (VARIANT - 144)) | (1L << (VERSION - 144)) | (1L << (WIDTH - 144)) | (1L << (WITHEVENTS - 144)) | (1L << (WRITE - 144)) | (1L << (XOR - 144)) | (1L << (CHOOSE - 144)) | (1L << (ASC - 144)) | (1L << (CHR - 144)) | (1L << (FORMAT - 144)) | (1L << (INSTR - 144)) | (1L << (INSTRREV - 144)) | (1L << (LCASE - 144)) | (1L << (LEFT - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (LEN - 208)) | (1L << (LTRIM - 208)) | (1L << (MID - 208)) | (1L << (REPLACE - 208)) | (1L << (RIGHT - 208)) | (1L << (RTRIM - 208)) | (1L << (SPACE - 208)) | (1L << (SPLIT - 208)) | (1L << (STR - 208)) | (1L << (STRCOMP - 208)) | (1L << (STRCONV - 208)) | (1L << (STRREVERSE - 208)) | (1L << (TRIM - 208)) | (1L << (UCASE - 208)) | (1L << (VAL - 208)) | (1L << (DATEADD - 208)) | (1L << (DATEDIFF - 208)) | (1L << (DATEPART - 208)) | (1L << (DATESERIAL - 208)) | (1L << (DATEVALUE1 - 208)) | (1L << (DAY - 208)) | (1L << (HOUR - 208)) | (1L << (MINUTE - 208)) | (1L << (MONTH - 208)) | (1L << (MONTHNAME1 - 208)) | (1L << (NOW - 208)) | (1L << (TIMESERIAL - 208)) | (1L << (TIMEVALUE1 - 208)) | (1L << (WEEKDAY - 208)) | (1L << (WEEKDAYNAME - 208)) | (1L << (YEAR - 208)) | (1L << (ABS - 208)) | (1L << (ATN - 208)) | (1L << (COS - 208)) | (1L << (EXP - 208)) | (1L << (FIX - 208)) | (1L << (INT - 208)) | (1L << (LOG - 208)) | (1L << (RANDOMIZE - 208)) | (1L << (RND - 208)) | (1L << (ROUND - 208)) | (1L << (SGN - 208)) | (1L << (SIN - 208)) | (1L << (SQR - 208)) | (1L << (TAN - 208)) | (1L << (ENVIRON - 208)) | (1L << (ISDATE - 208)) | (1L << (ISEMPTY - 208)) | (1L << (ISERROR - 208)) | (1L << (ISNULL - 208)) | (1L << (ISNUMERIC - 208)) | (1L << (DDB - 208)) | (1L << (FV - 208)) | (1L << (IPMT - 208)) | (1L << (IRR - 208)) | (1L << (MIRR - 208)) | (1L << (NPER - 208)) | (1L << (NPV - 208)) | (1L << (PMT - 208)) | (1L << (PPMT - 208)) | (1L << (PV - 208)) | (1L << (RATE - 208)) | (1L << (SLN - 208)) | (1L << (SYD - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (CHDIR - 272)) | (1L << (CHDRIVE - 272)) | (1L << (CURDIR - 272)) | (1L << (DIR - 272)) | (1L << (FILEDATETIME - 272)) | (1L << (FILELEN - 272)) | (1L << (GETATTR - 272)) | (1L << (MKDIR - 272)) | (1L << (SETATTR - 272)) | (1L << (CREATEOBJECT - 272)) | (1L << (ASCW - 272)) | (1L << (ROUNDUP - 272)) | (1L << (ROUNDDOWN - 272)) | (1L << (LPAREN - 272)) | (1L << (MINUS - 272)) | (1L << (L_SQUARE_BRACKET - 272)) | (1L << (STRINGLITERAL - 272)) | (1L << (OCTLITERAL - 272)) | (1L << (HEXLITERAL - 272)) | (1L << (FLOATLITERAL - 272)) | (1L << (INTEGERLITERAL - 272)) | (1L << (DATELITERAL - 272)) | (1L << (WS - 272)) | (1L << (IDENTIFIER - 272)) | (1L << (LINE_CONTINUATION - 272)))) != 0)) {
				{
				setState(2395);
				expression(0);
				setState(2397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2396);
					whiteSpace();
					}
				}

				setState(2399);
				match(DOT);
				setState(2401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2400);
					whiteSpace();
					}
				}

				}
			}

			setState(2405);
			match(CIRCLE);
			setState(2406);
			whiteSpace();
			setState(2411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(2407);
				match(STEP);
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2408);
					whiteSpace();
					}
				}

				}
			}

			setState(2413);
			tuple();
			setState(2422); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2414);
						whiteSpace();
						}
					}

					setState(2417);
					match(COMMA);
					setState(2419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
					case 1:
						{
						setState(2418);
						whiteSpace();
						}
						break;
					}
					setState(2421);
					expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2424); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleSpecialFormContext extends ParserRuleContext {
		public TerminalNode SCALE() { return getToken(VBAParser.SCALE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<TupleContext> tuple() {
			return getRuleContexts(TupleContext.class);
		}
		public TupleContext tuple(int i) {
			return getRuleContext(TupleContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(VBAParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(VBAParser.DOT, 0); }
		public ScaleSpecialFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleSpecialForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterScaleSpecialForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitScaleSpecialForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitScaleSpecialForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleSpecialFormContext scaleSpecialForm() throws RecognitionException {
		ScaleSpecialFormContext _localctx = new ScaleSpecialFormContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_scaleSpecialForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << PSET) | (1L << UBOUND) | (1L << EXCLAMATIONPOINT) | (1L << DOT) | (1L << HASH) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CLASS) | (1L << CLOSE) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (DOUBLE - 80)) | (1L << (EMPTY - 80)) | (1L << (ENDPROPERTY - 80)) | (1L << (END - 80)) | (1L << (EQV - 80)) | (1L << (ERROR - 80)) | (1L << (FALSE - 80)) | (1L << (GET - 80)) | (1L << (IMP - 80)) | (1L << (IN - 80)) | (1L << (INPUT - 80)) | (1L << (IS - 80)) | (1L << (INTEGER - 80)) | (1L << (LOCK - 80)) | (1L << (LONG - 80)) | (1L << (LIB - 80)) | (1L << (LIKE - 80)) | (1L << (LINE_INPUT - 80)) | (1L << (LOCK_READ - 80)) | (1L << (LOCK_WRITE - 80)) | (1L << (LOCK_READ_WRITE - 80)) | (1L << (ME - 80)) | (1L << (MOD - 80)) | (1L << (NAME - 80)) | (1L << (NEW - 80)) | (1L << (NOT - 80)) | (1L << (NOTHING - 80)) | (1L << (NULL - 80)) | (1L << (OBJECT - 80)) | (1L << (ON_ERROR - 80)) | (1L << (OPEN - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (OPTIONAL - 144)) | (1L << (OR - 144)) | (1L << (OUTPUT - 144)) | (1L << (PARAMARRAY - 144)) | (1L << (PRESERVE - 144)) | (1L << (PRINT - 144)) | (1L << (PTRSAFE - 144)) | (1L << (PUT - 144)) | (1L << (RANDOM - 144)) | (1L << (READ - 144)) | (1L << (READ_WRITE - 144)) | (1L << (REM - 144)) | (1L << (RESET - 144)) | (1L << (SEEK - 144)) | (1L << (SHARED - 144)) | (1L << (SINGLE - 144)) | (1L << (SPC - 144)) | (1L << (STEP - 144)) | (1L << (STRING - 144)) | (1L << (TAB - 144)) | (1L << (TEXT - 144)) | (1L << (THEN - 144)) | (1L << (TO - 144)) | (1L << (TRUE - 144)) | (1L << (TYPEOF - 144)) | (1L << (UNLOCK - 144)) | (1L << (UNTIL - 144)) | (1L << (VARIANT - 144)) | (1L << (VERSION - 144)) | (1L << (WIDTH - 144)) | (1L << (WITHEVENTS - 144)) | (1L << (WRITE - 144)) | (1L << (XOR - 144)) | (1L << (CHOOSE - 144)) | (1L << (ASC - 144)) | (1L << (CHR - 144)) | (1L << (FORMAT - 144)) | (1L << (INSTR - 144)) | (1L << (INSTRREV - 144)) | (1L << (LCASE - 144)) | (1L << (LEFT - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (LEN - 208)) | (1L << (LTRIM - 208)) | (1L << (MID - 208)) | (1L << (REPLACE - 208)) | (1L << (RIGHT - 208)) | (1L << (RTRIM - 208)) | (1L << (SPACE - 208)) | (1L << (SPLIT - 208)) | (1L << (STR - 208)) | (1L << (STRCOMP - 208)) | (1L << (STRCONV - 208)) | (1L << (STRREVERSE - 208)) | (1L << (TRIM - 208)) | (1L << (UCASE - 208)) | (1L << (VAL - 208)) | (1L << (DATEADD - 208)) | (1L << (DATEDIFF - 208)) | (1L << (DATEPART - 208)) | (1L << (DATESERIAL - 208)) | (1L << (DATEVALUE1 - 208)) | (1L << (DAY - 208)) | (1L << (HOUR - 208)) | (1L << (MINUTE - 208)) | (1L << (MONTH - 208)) | (1L << (MONTHNAME1 - 208)) | (1L << (NOW - 208)) | (1L << (TIMESERIAL - 208)) | (1L << (TIMEVALUE1 - 208)) | (1L << (WEEKDAY - 208)) | (1L << (WEEKDAYNAME - 208)) | (1L << (YEAR - 208)) | (1L << (ABS - 208)) | (1L << (ATN - 208)) | (1L << (COS - 208)) | (1L << (EXP - 208)) | (1L << (FIX - 208)) | (1L << (INT - 208)) | (1L << (LOG - 208)) | (1L << (RANDOMIZE - 208)) | (1L << (RND - 208)) | (1L << (ROUND - 208)) | (1L << (SGN - 208)) | (1L << (SIN - 208)) | (1L << (SQR - 208)) | (1L << (TAN - 208)) | (1L << (ENVIRON - 208)) | (1L << (ISDATE - 208)) | (1L << (ISEMPTY - 208)) | (1L << (ISERROR - 208)) | (1L << (ISNULL - 208)) | (1L << (ISNUMERIC - 208)) | (1L << (DDB - 208)) | (1L << (FV - 208)) | (1L << (IPMT - 208)) | (1L << (IRR - 208)) | (1L << (MIRR - 208)) | (1L << (NPER - 208)) | (1L << (NPV - 208)) | (1L << (PMT - 208)) | (1L << (PPMT - 208)) | (1L << (PV - 208)) | (1L << (RATE - 208)) | (1L << (SLN - 208)) | (1L << (SYD - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (CHDIR - 272)) | (1L << (CHDRIVE - 272)) | (1L << (CURDIR - 272)) | (1L << (DIR - 272)) | (1L << (FILEDATETIME - 272)) | (1L << (FILELEN - 272)) | (1L << (GETATTR - 272)) | (1L << (MKDIR - 272)) | (1L << (SETATTR - 272)) | (1L << (CREATEOBJECT - 272)) | (1L << (ASCW - 272)) | (1L << (ROUNDUP - 272)) | (1L << (ROUNDDOWN - 272)) | (1L << (LPAREN - 272)) | (1L << (MINUS - 272)) | (1L << (L_SQUARE_BRACKET - 272)) | (1L << (STRINGLITERAL - 272)) | (1L << (OCTLITERAL - 272)) | (1L << (HEXLITERAL - 272)) | (1L << (FLOATLITERAL - 272)) | (1L << (INTEGERLITERAL - 272)) | (1L << (DATELITERAL - 272)) | (1L << (WS - 272)) | (1L << (IDENTIFIER - 272)) | (1L << (LINE_CONTINUATION - 272)))) != 0)) {
				{
				setState(2426);
				expression(0);
				setState(2428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2427);
					whiteSpace();
					}
				}

				setState(2430);
				match(DOT);
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2431);
					whiteSpace();
					}
				}

				}
			}

			setState(2436);
			match(SCALE);
			setState(2437);
			whiteSpace();
			setState(2438);
			tuple();
			setState(2440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2439);
				whiteSpace();
				}
			}

			setState(2442);
			match(MINUS);
			setState(2444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2443);
				whiteSpace();
				}
			}

			setState(2446);
			tuple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PSetSpecialFormContext extends ParserRuleContext {
		public TerminalNode PSET() { return getToken(VBAParser.PSET, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(VBAParser.DOT, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode STEP() { return getToken(VBAParser.STEP, 0); }
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public PSetSpecialFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pSetSpecialForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPSetSpecialForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPSetSpecialForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPSetSpecialForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PSetSpecialFormContext pSetSpecialForm() throws RecognitionException {
		PSetSpecialFormContext _localctx = new PSetSpecialFormContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_pSetSpecialForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2448);
				expression(0);
				setState(2450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2449);
					whiteSpace();
					}
				}

				setState(2452);
				match(DOT);
				setState(2454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2453);
					whiteSpace();
					}
				}

				}
				break;
			}
			setState(2458);
			match(PSET);
			setState(2462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				{
				setState(2459);
				whiteSpace();
				setState(2460);
				match(STEP);
				}
				break;
			}
			setState(2465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2464);
				whiteSpace();
				}
			}

			setState(2467);
			tuple();
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				setState(2468);
				whiteSpace();
				}
				break;
			}
			setState(2476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				{
				setState(2471);
				match(COMMA);
				setState(2473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2472);
					whiteSpace();
					}
					break;
				}
				setState(2475);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(VBAParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			match(LPAREN);
			setState(2480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				setState(2479);
				whiteSpace();
				}
				break;
			}
			setState(2482);
			expression(0);
			setState(2484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2483);
				whiteSpace();
				}
			}

			setState(2486);
			match(COMMA);
			setState(2488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				{
				setState(2487);
				whiteSpace();
				}
				break;
			}
			setState(2490);
			expression(0);
			setState(2492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2491);
				whiteSpace();
				}
			}

			setState(2494);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineSpecialFormOptionContext extends ParserRuleContext {
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public LineSpecialFormOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineSpecialFormOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLineSpecialFormOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLineSpecialFormOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLineSpecialFormOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineSpecialFormOptionContext lineSpecialFormOption() throws RecognitionException {
		LineSpecialFormOptionContext _localctx = new LineSpecialFormOptionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_lineSpecialFormOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			if (!(_input.LT(1).getText().toLowerCase() == "b" || _input.LT(1).getText().toLowerCase() == "bf")) throw new FailedPredicateException(this, "_input.LT(1).getText().toLowerCase() == \"b\" || _input.LT(1).getText().toLowerCase() == \"bf\"");
			setState(2497);
			unrestrictedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptsContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSubscripts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSubscripts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_subscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			subscript();
			setState(2510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS || _la==LINE_CONTINUATION) {
						{
						setState(2500);
						whiteSpace();
						}
					}

					setState(2503);
					match(COMMA);
					setState(2505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
					case 1:
						{
						setState(2504);
						whiteSpace();
						}
						break;
					}
					setState(2507);
					subscript();
					}
					} 
				}
				setState(2512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode TO() { return getToken(VBAParser.TO, 0); }
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				{
				setState(2513);
				expression(0);
				setState(2514);
				whiteSpace();
				setState(2515);
				match(TO);
				setState(2516);
				whiteSpace();
				}
				break;
			}
			setState(2520);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnrestrictedIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementKeywordContext statementKeyword() {
			return getRuleContext(StatementKeywordContext.class,0);
		}
		public MarkerKeywordContext markerKeyword() {
			return getRuleContext(MarkerKeywordContext.class,0);
		}
		public UnrestrictedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrestrictedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUnrestrictedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUnrestrictedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUnrestrictedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnrestrictedIdentifierContext unrestrictedIdentifier() throws RecognitionException {
		UnrestrictedIdentifierContext _localctx = new UnrestrictedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_unrestrictedIdentifier);
		try {
			setState(2525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case ARRAY:
			case CBOOL:
			case CBYTE:
			case CCUR:
			case CDATE:
			case CDBL:
			case CDEC:
			case CINT:
			case CLNG:
			case CLNGLNG:
			case CLNGPTR:
			case CSNG:
			case CSTR:
			case CURRENCY:
			case CVAR:
			case CVERR:
			case DEBUG:
			case DOEVENTS:
			case INPUTB:
			case LBOUND:
			case LENB:
			case LONGLONG:
			case LONGPTR:
			case MIDB:
			case PSET:
			case UBOUND:
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPEND:
			case BEGINPROPERTY:
			case BEGIN:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CLASS:
			case CLOSE:
			case DATABASE:
			case DATE:
			case DOUBLE:
			case ENDPROPERTY:
			case END:
			case EQV:
			case ERROR:
			case FALSE:
			case GET:
			case IMP:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case LOCK:
			case LONG:
			case LIB:
			case LIKE:
			case LINE_INPUT:
			case LOCK_READ:
			case LOCK_WRITE:
			case LOCK_READ_WRITE:
			case ME:
			case MOD:
			case NAME:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case OBJECT:
			case ON_ERROR:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PTRSAFE:
			case PUT:
			case RANDOM:
			case READ:
			case READ_WRITE:
			case REM:
			case RESET:
			case SEEK:
			case SHARED:
			case SINGLE:
			case SPC:
			case STEP:
			case STRING:
			case TAB:
			case TEXT:
			case THEN:
			case TO:
			case TRUE:
			case TYPEOF:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WIDTH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case L_SQUARE_BRACKET:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2522);
				identifier();
				}
				break;
			case EXIT:
			case OPTION:
			case CALL:
			case CASE:
			case CONST:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFLNGLNG:
			case DEFLNGPTR:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DIM:
			case DO:
			case ELSE:
			case ELSEIF:
			case END_SELECT:
			case END_WITH:
			case ENUM:
			case ERASE:
			case EVENT:
			case EXIT_DO:
			case EXIT_FOR:
			case EXIT_FUNCTION:
			case EXIT_PROPERTY:
			case EXIT_SUB:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMPLEMENTS:
			case LOOP:
			case LET:
			case LSET:
			case NEXT:
			case ON:
			case PRIVATE:
			case PUBLIC:
			case RAISEEVENT:
			case REDIM:
			case RESUME:
			case RETURN:
			case RSET:
			case SELECT:
			case SET:
			case STATIC:
			case STOP:
			case SUB:
			case TYPE:
			case WEND:
			case WHILE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2523);
				statementKeyword();
				}
				break;
			case AS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2524);
				markerKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegalLabelIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MarkerKeywordContext markerKeyword() {
			return getRuleContext(MarkerKeywordContext.class,0);
		}
		public LegalLabelIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legalLabelIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLegalLabelIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLegalLabelIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLegalLabelIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LegalLabelIdentifierContext legalLabelIdentifier() throws RecognitionException {
		LegalLabelIdentifierContext _localctx = new LegalLabelIdentifierContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_legalLabelIdentifier);
		try {
			setState(2530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2527);
				if (!( _input.LA(1) != DOEVENTS && _input.LA(1) != END && _input.LA(1) != CLOSE && _input.LA(1) != ELSE && _input.LA(1) != LOOP && _input.LA(1) != NEXT && _input.LA(1) != RANDOMIZE && _input.LA(1) != REM && _input.LA(1) != RESUME && _input.LA(1) != RETURN && _input.LA(1) != STOP && _input.LA(1) != WEND)) throw new FailedPredicateException(this, " _input.LA(1) != DOEVENTS && _input.LA(1) != END && _input.LA(1) != CLOSE && _input.LA(1) != ELSE && _input.LA(1) != LOOP && _input.LA(1) != NEXT && _input.LA(1) != RANDOMIZE && _input.LA(1) != REM && _input.LA(1) != RESUME && _input.LA(1) != RETURN && _input.LA(1) != STOP && _input.LA(1) != WEND");
				setState(2528);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2529);
				markerKeyword();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TypedIdentifierContext typedIdentifier() {
			return getRuleContext(TypedIdentifierContext.class,0);
		}
		public UntypedIdentifierContext untypedIdentifier() {
			return getRuleContext(UntypedIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_identifier);
		try {
			setState(2534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2532);
				typedIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2533);
				untypedIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UntypedIdentifierContext extends ParserRuleContext {
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public UntypedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untypedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUntypedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUntypedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUntypedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntypedIdentifierContext untypedIdentifier() throws RecognitionException {
		UntypedIdentifierContext _localctx = new UntypedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_untypedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			identifierValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedIdentifierContext extends ParserRuleContext {
		public UntypedIdentifierContext untypedIdentifier() {
			return getRuleContext(UntypedIdentifierContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TypedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterTypedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitTypedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitTypedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedIdentifierContext typedIdentifier() throws RecognitionException {
		TypedIdentifierContext _localctx = new TypedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_typedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			untypedIdentifier();
			setState(2539);
			typeHint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VBAParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ForeignNameContext foreignName() {
			return getRuleContext(ForeignNameContext.class,0);
		}
		public IdentifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIdentifierValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIdentifierValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierValueContext identifierValue() throws RecognitionException {
		IdentifierValueContext _localctx = new IdentifierValueContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_identifierValue);
		try {
			setState(2544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2541);
				match(IDENTIFIER);
				}
				break;
			case ANY:
			case ARRAY:
			case CBOOL:
			case CBYTE:
			case CCUR:
			case CDATE:
			case CDBL:
			case CDEC:
			case CINT:
			case CLNG:
			case CLNGLNG:
			case CLNGPTR:
			case CSNG:
			case CSTR:
			case CURRENCY:
			case CVAR:
			case CVERR:
			case DEBUG:
			case DOEVENTS:
			case INPUTB:
			case LBOUND:
			case LENB:
			case LONGLONG:
			case LONGPTR:
			case MIDB:
			case PSET:
			case UBOUND:
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPEND:
			case BEGINPROPERTY:
			case BEGIN:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CLASS:
			case CLOSE:
			case DATABASE:
			case DATE:
			case DOUBLE:
			case ENDPROPERTY:
			case END:
			case EQV:
			case ERROR:
			case FALSE:
			case GET:
			case IMP:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case LOCK:
			case LONG:
			case LIB:
			case LIKE:
			case LINE_INPUT:
			case LOCK_READ:
			case LOCK_WRITE:
			case LOCK_READ_WRITE:
			case ME:
			case MOD:
			case NAME:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case OBJECT:
			case ON_ERROR:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PTRSAFE:
			case PUT:
			case RANDOM:
			case READ:
			case READ_WRITE:
			case REM:
			case RESET:
			case SEEK:
			case SHARED:
			case SINGLE:
			case SPC:
			case STEP:
			case STRING:
			case TAB:
			case TEXT:
			case THEN:
			case TO:
			case TRUE:
			case TYPEOF:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WIDTH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2542);
				keyword();
				}
				break;
			case L_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(2543);
				foreignName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignNameContext extends ParserRuleContext {
		public TerminalNode L_SQUARE_BRACKET() { return getToken(VBAParser.L_SQUARE_BRACKET, 0); }
		public TerminalNode R_SQUARE_BRACKET() { return getToken(VBAParser.R_SQUARE_BRACKET, 0); }
		public List<ForeignIdentifierContext> foreignIdentifier() {
			return getRuleContexts(ForeignIdentifierContext.class);
		}
		public ForeignIdentifierContext foreignIdentifier(int i) {
			return getRuleContext(ForeignIdentifierContext.class,i);
		}
		public ForeignNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterForeignName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitForeignName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitForeignName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignNameContext foreignName() throws RecognitionException {
		ForeignNameContext _localctx = new ForeignNameContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_foreignName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			match(L_SQUARE_BRACKET);
			setState(2550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CIRCLE) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << EXIT) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << OPTION) | (1L << PSET) | (1L << SCALE) | (1L << UBOUND) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << EXCLAMATIONPOINT) | (1L << DOT) | (1L << HASH) | (1L << AT) | (1L << PERCENT) | (1L << DOLLAR) | (1L << AMPERSAND) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << AS) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CDECL) | (1L << CLASS) | (1L << CLOSE) | (1L << CONST) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DEFBOOL - 64)) | (1L << (DEFBYTE - 64)) | (1L << (DEFDATE - 64)) | (1L << (DEFDBL - 64)) | (1L << (DEFCUR - 64)) | (1L << (DEFINT - 64)) | (1L << (DEFLNG - 64)) | (1L << (DEFLNGLNG - 64)) | (1L << (DEFLNGPTR - 64)) | (1L << (DEFOBJ - 64)) | (1L << (DEFSNG - 64)) | (1L << (DEFSTR - 64)) | (1L << (DEFVAR - 64)) | (1L << (DIM - 64)) | (1L << (DO - 64)) | (1L << (DOUBLE - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ELSEIF - 64)) | (1L << (EMPTY - 64)) | (1L << (END_ENUM - 64)) | (1L << (END_FUNCTION - 64)) | (1L << (END_IF - 64)) | (1L << (ENDPROPERTY - 64)) | (1L << (END_PROPERTY - 64)) | (1L << (END_SELECT - 64)) | (1L << (END_SUB - 64)) | (1L << (END_TYPE - 64)) | (1L << (END_WITH - 64)) | (1L << (END - 64)) | (1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LOCK_READ - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LOCK_WRITE - 128)) | (1L << (LOCK_READ_WRITE - 128)) | (1L << (LSET - 128)) | (1L << (ME - 128)) | (1L << (MOD - 128)) | (1L << (NAME - 128)) | (1L << (NEXT - 128)) | (1L << (NEW - 128)) | (1L << (NOT - 128)) | (1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (OBJECT - 128)) | (1L << (ON - 128)) | (1L << (ON_ERROR - 128)) | (1L << (ON_LOCAL_ERROR - 128)) | (1L << (OPEN - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTION_BASE - 128)) | (1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PTRSAFE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (READ_WRITE - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RSET - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SET - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (VERSION - 192)) | (1L << (WEND - 192)) | (1L << (WHILE - 192)) | (1L << (WIDTH - 192)) | (1L << (WITH - 192)) | (1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (CHOOSE - 192)) | (1L << (ASC - 192)) | (1L << (CHR - 192)) | (1L << (FORMAT - 192)) | (1L << (INSTR - 192)) | (1L << (INSTRREV - 192)) | (1L << (LCASE - 192)) | (1L << (LEFT - 192)) | (1L << (LEN - 192)) | (1L << (LTRIM - 192)) | (1L << (MID - 192)) | (1L << (REPLACE - 192)) | (1L << (RIGHT - 192)) | (1L << (RTRIM - 192)) | (1L << (SPACE - 192)) | (1L << (SPLIT - 192)) | (1L << (STR - 192)) | (1L << (STRCOMP - 192)) | (1L << (STRCONV - 192)) | (1L << (STRREVERSE - 192)) | (1L << (TRIM - 192)) | (1L << (UCASE - 192)) | (1L << (VAL - 192)) | (1L << (DATEADD - 192)) | (1L << (DATEDIFF - 192)) | (1L << (DATEPART - 192)) | (1L << (DATESERIAL - 192)) | (1L << (DATEVALUE1 - 192)) | (1L << (DAY - 192)) | (1L << (HOUR - 192)) | (1L << (MINUTE - 192)) | (1L << (MONTH - 192)) | (1L << (MONTHNAME1 - 192)) | (1L << (NOW - 192)) | (1L << (TIMESERIAL - 192)) | (1L << (TIMEVALUE1 - 192)) | (1L << (WEEKDAY - 192)) | (1L << (WEEKDAYNAME - 192)) | (1L << (YEAR - 192)) | (1L << (ABS - 192)) | (1L << (ATN - 192)) | (1L << (COS - 192)) | (1L << (EXP - 192)) | (1L << (FIX - 192)) | (1L << (INT - 192)) | (1L << (LOG - 192)) | (1L << (RANDOMIZE - 192)) | (1L << (RND - 192)) | (1L << (ROUND - 192)) | (1L << (SGN - 192)) | (1L << (SIN - 192)) | (1L << (SQR - 192)) | (1L << (TAN - 192)) | (1L << (ENVIRON - 192)) | (1L << (ISDATE - 192)) | (1L << (ISEMPTY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (ISERROR - 256)) | (1L << (ISNULL - 256)) | (1L << (ISNUMERIC - 256)) | (1L << (DDB - 256)) | (1L << (FV - 256)) | (1L << (IPMT - 256)) | (1L << (IRR - 256)) | (1L << (MIRR - 256)) | (1L << (NPER - 256)) | (1L << (NPV - 256)) | (1L << (PMT - 256)) | (1L << (PPMT - 256)) | (1L << (PV - 256)) | (1L << (RATE - 256)) | (1L << (SLN - 256)) | (1L << (SYD - 256)) | (1L << (CHDIR - 256)) | (1L << (CHDRIVE - 256)) | (1L << (CURDIR - 256)) | (1L << (DIR - 256)) | (1L << (FILEDATETIME - 256)) | (1L << (FILELEN - 256)) | (1L << (GETATTR - 256)) | (1L << (MKDIR - 256)) | (1L << (SETATTR - 256)) | (1L << (CREATEOBJECT - 256)) | (1L << (ASCW - 256)) | (1L << (ROUNDUP - 256)) | (1L << (ROUNDDOWN - 256)) | (1L << (ASSIGN - 256)) | (1L << (DIV - 256)) | (1L << (INTDIV - 256)) | (1L << (EQ - 256)) | (1L << (GEQ - 256)) | (1L << (GT - 256)) | (1L << (LEQ - 256)) | (1L << (LPAREN - 256)) | (1L << (LT - 256)) | (1L << (MINUS - 256)) | (1L << (MULT - 256)) | (1L << (NEQ - 256)) | (1L << (PLUS - 256)) | (1L << (POW - 256)) | (1L << (RPAREN - 256)) | (1L << (L_SQUARE_BRACKET - 256)) | (1L << (L_BRACE - 256)) | (1L << (R_BRACE - 256)) | (1L << (STRINGLITERAL - 256)) | (1L << (OCTLITERAL - 256)) | (1L << (HEXLITERAL - 256)) | (1L << (FLOATLITERAL - 256)) | (1L << (INTEGERLITERAL - 256)) | (1L << (DATELITERAL - 256)) | (1L << (NEWLINE - 256)) | (1L << (SINGLEQUOTE - 256)) | (1L << (UNDERSCORE - 256)) | (1L << (WS - 256)) | (1L << (GUIDLITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (BARE_HEX_LITERAL - 256)) | (1L << (ERRORCHAR - 256)))) != 0)) {
				{
				{
				setState(2547);
				foreignIdentifier();
				}
				}
				setState(2552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2553);
			match(R_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignIdentifierContext extends ParserRuleContext {
		public TerminalNode L_SQUARE_BRACKET() { return getToken(VBAParser.L_SQUARE_BRACKET, 0); }
		public TerminalNode R_SQUARE_BRACKET() { return getToken(VBAParser.R_SQUARE_BRACKET, 0); }
		public ForeignNameContext foreignName() {
			return getRuleContext(ForeignNameContext.class,0);
		}
		public ForeignIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterForeignIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitForeignIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitForeignIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignIdentifierContext foreignIdentifier() throws RecognitionException {
		ForeignIdentifierContext _localctx = new ForeignIdentifierContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_foreignIdentifier);
		int _la;
		try {
			setState(2557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case ARRAY:
			case CBOOL:
			case CBYTE:
			case CCUR:
			case CDATE:
			case CDBL:
			case CDEC:
			case CINT:
			case CIRCLE:
			case CLNG:
			case CLNGLNG:
			case CLNGPTR:
			case CSNG:
			case CSTR:
			case CURRENCY:
			case CVAR:
			case CVERR:
			case DEBUG:
			case DOEVENTS:
			case EXIT:
			case INPUTB:
			case LBOUND:
			case LENB:
			case LONGLONG:
			case LONGPTR:
			case MIDB:
			case OPTION:
			case PSET:
			case SCALE:
			case UBOUND:
			case COMMA:
			case COLON:
			case SEMICOLON:
			case EXCLAMATIONPOINT:
			case DOT:
			case HASH:
			case AT:
			case PERCENT:
			case DOLLAR:
			case AMPERSAND:
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPEND:
			case AS:
			case BEGINPROPERTY:
			case BEGIN:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CASE:
			case CDECL:
			case CLASS:
			case CLOSE:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFLNGLNG:
			case DEFLNGPTR:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DIM:
			case DO:
			case DOUBLE:
			case EACH:
			case ELSE:
			case ELSEIF:
			case EMPTY:
			case END_ENUM:
			case END_FUNCTION:
			case END_IF:
			case ENDPROPERTY:
			case END_PROPERTY:
			case END_SELECT:
			case END_SUB:
			case END_TYPE:
			case END_WITH:
			case END:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case EXIT_DO:
			case EXIT_FOR:
			case EXIT_FUNCTION:
			case EXIT_PROPERTY:
			case EXIT_SUB:
			case FALSE:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case LOCK:
			case LONG:
			case LOOP:
			case LET:
			case LIB:
			case LIKE:
			case LINE_INPUT:
			case LOCK_READ:
			case LOCK_WRITE:
			case LOCK_READ_WRITE:
			case LSET:
			case ME:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case OBJECT:
			case ON:
			case ON_ERROR:
			case ON_LOCAL_ERROR:
			case OPEN:
			case OPTIONAL:
			case OPTION_BASE:
			case OPTION_EXPLICIT:
			case OPTION_COMPARE:
			case OPTION_PRIVATE_MODULE:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PROPERTY_GET:
			case PROPERTY_LET:
			case PROPERTY_SET:
			case PTRSAFE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RAISEEVENT:
			case READ:
			case READ_WRITE:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RSET:
			case SEEK:
			case SELECT:
			case SET:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STOP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case CHOOSE:
			case ASC:
			case CHR:
			case FORMAT:
			case INSTR:
			case INSTRREV:
			case LCASE:
			case LEFT:
			case LEN:
			case LTRIM:
			case MID:
			case REPLACE:
			case RIGHT:
			case RTRIM:
			case SPACE:
			case SPLIT:
			case STR:
			case STRCOMP:
			case STRCONV:
			case STRREVERSE:
			case TRIM:
			case UCASE:
			case VAL:
			case DATEADD:
			case DATEDIFF:
			case DATEPART:
			case DATESERIAL:
			case DATEVALUE1:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case MONTHNAME1:
			case NOW:
			case TIMESERIAL:
			case TIMEVALUE1:
			case WEEKDAY:
			case WEEKDAYNAME:
			case YEAR:
			case ABS:
			case ATN:
			case COS:
			case EXP:
			case FIX:
			case INT:
			case LOG:
			case RANDOMIZE:
			case RND:
			case ROUND:
			case SGN:
			case SIN:
			case SQR:
			case TAN:
			case ENVIRON:
			case ISDATE:
			case ISEMPTY:
			case ISERROR:
			case ISNULL:
			case ISNUMERIC:
			case DDB:
			case FV:
			case IPMT:
			case IRR:
			case MIRR:
			case NPER:
			case NPV:
			case PMT:
			case PPMT:
			case PV:
			case RATE:
			case SLN:
			case SYD:
			case CHDIR:
			case CHDRIVE:
			case CURDIR:
			case DIR:
			case FILEDATETIME:
			case FILELEN:
			case GETATTR:
			case MKDIR:
			case SETATTR:
			case CREATEOBJECT:
			case ASCW:
			case ROUNDUP:
			case ROUNDDOWN:
			case ASSIGN:
			case DIV:
			case INTDIV:
			case EQ:
			case GEQ:
			case GT:
			case LEQ:
			case LPAREN:
			case LT:
			case MINUS:
			case MULT:
			case NEQ:
			case PLUS:
			case POW:
			case RPAREN:
			case L_BRACE:
			case R_BRACE:
			case STRINGLITERAL:
			case OCTLITERAL:
			case HEXLITERAL:
			case FLOATLITERAL:
			case INTEGERLITERAL:
			case DATELITERAL:
			case NEWLINE:
			case SINGLEQUOTE:
			case UNDERSCORE:
			case WS:
			case GUIDLITERAL:
			case IDENTIFIER:
			case LINE_CONTINUATION:
			case BARE_HEX_LITERAL:
			case ERRORCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2555);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==L_SQUARE_BRACKET || _la==R_SQUARE_BRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case L_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2556);
				foreignName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsTypeClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(VBAParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode NEW() { return getToken(VBAParser.NEW, 0); }
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public AsTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asTypeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAsTypeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAsTypeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAsTypeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsTypeClauseContext asTypeClause() throws RecognitionException {
		AsTypeClauseContext _localctx = new AsTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_asTypeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
			match(AS);
			setState(2561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2560);
				whiteSpace();
				}
			}

			setState(2565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				{
				setState(2563);
				match(NEW);
				setState(2564);
				whiteSpace();
				}
				break;
			}
			setState(2567);
			type();
			setState(2572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				{
				setState(2569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2568);
					whiteSpace();
					}
				}

				setState(2571);
				fieldLength();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(VBAParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(VBAParser.BYTE, 0); }
		public TerminalNode CURRENCY() { return getToken(VBAParser.CURRENCY, 0); }
		public TerminalNode DATE() { return getToken(VBAParser.DATE, 0); }
		public TerminalNode DOUBLE() { return getToken(VBAParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(VBAParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(VBAParser.LONG, 0); }
		public TerminalNode LONGLONG() { return getToken(VBAParser.LONGLONG, 0); }
		public TerminalNode LONGPTR() { return getToken(VBAParser.LONGPTR, 0); }
		public TerminalNode SINGLE() { return getToken(VBAParser.SINGLE, 0); }
		public TerminalNode STRING() { return getToken(VBAParser.STRING, 0); }
		public TerminalNode VARIANT() { return getToken(VBAParser.VARIANT, 0); }
		public TerminalNode ANY() { return getToken(VBAParser.ANY, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << CURRENCY) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << BOOLEAN) | (1L << BYTE) | (1L << DATE))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (DOUBLE - 80)) | (1L << (INTEGER - 80)) | (1L << (LONG - 80)))) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (SINGLE - 175)) | (1L << (STRING - 175)) | (1L << (VARIANT - 175)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(VBAParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(VBAParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(VBAParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(VBAParser.GEQ, 0); }
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VBAParser.NEQ, 0); }
		public TerminalNode IS() { return getToken(VBAParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(VBAParser.LIKE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==LIKE || ((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (EQ - 288)) | (1L << (GEQ - 288)) | (1L << (GT - 288)) | (1L << (LEQ - 288)) | (1L << (LT - 288)) | (1L << (NEQ - 288)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexTypeContext extends ParserRuleContext {
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
	 
		public ComplexTypeContext() { }
		public void copyFrom(ComplexTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CtTypeofexprContext extends ComplexTypeContext {
		public TerminalNode TYPEOF() { return getToken(VBAParser.TYPEOF, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public CtTypeofexprContext(ComplexTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCtTypeofexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCtTypeofexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCtTypeofexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtMarkedFileNumberExprContext extends ComplexTypeContext {
		public TerminalNode HASH() { return getToken(VBAParser.HASH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CtMarkedFileNumberExprContext(ComplexTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCtMarkedFileNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCtMarkedFileNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCtMarkedFileNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtLiteralExprContext extends ComplexTypeContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public CtLiteralExprContext(ComplexTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCtLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCtLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCtLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtBuiltInTypeExprContext extends ComplexTypeContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public CtBuiltInTypeExprContext(ComplexTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCtBuiltInTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCtBuiltInTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCtBuiltInTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtNewExprContext extends ComplexTypeContext {
		public TerminalNode NEW() { return getToken(VBAParser.NEW, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public CtNewExprContext(ComplexTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCtNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCtNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCtNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtParenthesizedExprContext extends ComplexTypeContext {
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public CtParenthesizedExprContext(ComplexTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCtParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCtParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCtParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtLExprContext extends ComplexTypeContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public CtLExprContext(ComplexTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCtLExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCtLExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCtLExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_complexType);
		int _la;
		try {
			setState(2601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				_localctx = new CtLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2578);
				literalExpression();
				}
				break;
			case 2:
				_localctx = new CtLExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2579);
				lExpression(0);
				}
				break;
			case 3:
				_localctx = new CtBuiltInTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2580);
				builtInType();
				}
				break;
			case 4:
				_localctx = new CtParenthesizedExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2581);
				match(LPAREN);
				setState(2583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2582);
					whiteSpace();
					}
				}

				setState(2585);
				complexType();
				setState(2587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2586);
					whiteSpace();
					}
				}

				setState(2589);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new CtTypeofexprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2591);
				match(TYPEOF);
				setState(2592);
				whiteSpace();
				setState(2593);
				complexType();
				}
				break;
			case 6:
				_localctx = new CtNewExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2595);
				match(NEW);
				setState(2596);
				whiteSpace();
				setState(2597);
				complexType();
				}
				break;
			case 7:
				_localctx = new CtMarkedFileNumberExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2599);
				match(HASH);
				setState(2600);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldLengthContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(VBAParser.MULT, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public FieldLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterFieldLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitFieldLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitFieldLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldLengthContext fieldLength() throws RecognitionException {
		FieldLengthContext _localctx = new FieldLengthContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_fieldLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2603);
			match(MULT);
			setState(2605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2604);
				whiteSpace();
				}
			}

			setState(2609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCTLITERAL:
			case HEXLITERAL:
			case FLOATLITERAL:
			case INTEGERLITERAL:
				{
				setState(2607);
				numberLiteral();
				}
				break;
			case ANY:
			case ARRAY:
			case CBOOL:
			case CBYTE:
			case CCUR:
			case CDATE:
			case CDBL:
			case CDEC:
			case CINT:
			case CLNG:
			case CLNGLNG:
			case CLNGPTR:
			case CSNG:
			case CSTR:
			case CURRENCY:
			case CVAR:
			case CVERR:
			case DEBUG:
			case DOEVENTS:
			case INPUTB:
			case LBOUND:
			case LENB:
			case LONGLONG:
			case LONGPTR:
			case MIDB:
			case PSET:
			case UBOUND:
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPEND:
			case BEGINPROPERTY:
			case BEGIN:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CLASS:
			case CLOSE:
			case DATABASE:
			case DATE:
			case DOUBLE:
			case ENDPROPERTY:
			case END:
			case EQV:
			case ERROR:
			case FALSE:
			case GET:
			case IMP:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case LOCK:
			case LONG:
			case LIB:
			case LIKE:
			case LINE_INPUT:
			case LOCK_READ:
			case LOCK_WRITE:
			case LOCK_READ_WRITE:
			case ME:
			case MOD:
			case NAME:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case OBJECT:
			case ON_ERROR:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PTRSAFE:
			case PUT:
			case RANDOM:
			case READ:
			case READ_WRITE:
			case REM:
			case RESET:
			case SEEK:
			case SHARED:
			case SINGLE:
			case SPC:
			case STEP:
			case STRING:
			case TAB:
			case TEXT:
			case THEN:
			case TO:
			case TRUE:
			case TYPEOF:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WIDTH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case L_SQUARE_BRACKET:
			case IDENTIFIER:
				{
				setState(2608);
				identifierValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementLabelDefinitionContext extends ParserRuleContext {
		public CombinedLabelsContext combinedLabels() {
			return getRuleContext(CombinedLabelsContext.class,0);
		}
		public IdentifierStatementLabelContext identifierStatementLabel() {
			return getRuleContext(IdentifierStatementLabelContext.class,0);
		}
		public StandaloneLineNumberLabelContext standaloneLineNumberLabel() {
			return getRuleContext(StandaloneLineNumberLabelContext.class,0);
		}
		public StatementLabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementLabelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStatementLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStatementLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStatementLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementLabelDefinitionContext statementLabelDefinition() throws RecognitionException {
		StatementLabelDefinitionContext _localctx = new StatementLabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_statementLabelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611);
			if (!(_input.LA(-1) == NEWLINE || _input.LA(-1) == LINE_CONTINUATION)) throw new FailedPredicateException(this, "_input.LA(-1) == NEWLINE || _input.LA(-1) == LINE_CONTINUATION");
			setState(2615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				{
				setState(2612);
				combinedLabels();
				}
				break;
			case 2:
				{
				setState(2613);
				identifierStatementLabel();
				}
				break;
			case 3:
				{
				setState(2614);
				standaloneLineNumberLabel();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierStatementLabelContext extends ParserRuleContext {
		public LegalLabelIdentifierContext legalLabelIdentifier() {
			return getRuleContext(LegalLabelIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VBAParser.COLON, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public IdentifierStatementLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierStatementLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIdentifierStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIdentifierStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIdentifierStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierStatementLabelContext identifierStatementLabel() throws RecognitionException {
		IdentifierStatementLabelContext _localctx = new IdentifierStatementLabelContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_identifierStatementLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
			legalLabelIdentifier();
			setState(2619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2618);
				whiteSpace();
				}
			}

			setState(2621);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneLineNumberLabelContext extends ParserRuleContext {
		public LineNumberLabelContext lineNumberLabel() {
			return getRuleContext(LineNumberLabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VBAParser.COLON, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public StandaloneLineNumberLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneLineNumberLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStandaloneLineNumberLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStandaloneLineNumberLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStandaloneLineNumberLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneLineNumberLabelContext standaloneLineNumberLabel() throws RecognitionException {
		StandaloneLineNumberLabelContext _localctx = new StandaloneLineNumberLabelContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_standaloneLineNumberLabel);
		int _la;
		try {
			setState(2630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2623);
				lineNumberLabel();
				setState(2625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2624);
					whiteSpace();
					}
				}

				setState(2627);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2629);
				lineNumberLabel();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CombinedLabelsContext extends ParserRuleContext {
		public LineNumberLabelContext lineNumberLabel() {
			return getRuleContext(LineNumberLabelContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public IdentifierStatementLabelContext identifierStatementLabel() {
			return getRuleContext(IdentifierStatementLabelContext.class,0);
		}
		public CombinedLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinedLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCombinedLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCombinedLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCombinedLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinedLabelsContext combinedLabels() throws RecognitionException {
		CombinedLabelsContext _localctx = new CombinedLabelsContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_combinedLabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2632);
			lineNumberLabel();
			setState(2633);
			whiteSpace();
			setState(2634);
			identifierStatementLabel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineNumberLabelContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public LineNumberLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNumberLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLineNumberLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLineNumberLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLineNumberLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineNumberLabelContext lineNumberLabel() throws RecognitionException {
		LineNumberLabelContext _localctx = new LineNumberLabelContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_lineNumberLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2636);
			numberLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode HEXLITERAL() { return getToken(VBAParser.HEXLITERAL, 0); }
		public TerminalNode OCTLITERAL() { return getToken(VBAParser.OCTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(VBAParser.FLOATLITERAL, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(VBAParser.INTEGERLITERAL, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			_la = _input.LA(1);
			if ( !(((((_la - 305)) & ~0x3f) == 0 && ((1L << (_la - 305)) & ((1L << (OCTLITERAL - 305)) | (1L << (HEXLITERAL - 305)) | (1L << (FLOATLITERAL - 305)) | (1L << (INTEGERLITERAL - 305)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				{
				setState(2640);
				baseType();
				}
				break;
			case 2:
				{
				setState(2641);
				complexType();
				}
				break;
			}
			setState(2652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				{
				setState(2645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2644);
					whiteSpace();
					}
				}

				setState(2647);
				match(LPAREN);
				setState(2649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2648);
					whiteSpace();
					}
				}

				setState(2651);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeHintContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(VBAParser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(VBAParser.AMPERSAND, 0); }
		public TerminalNode POW() { return getToken(VBAParser.POW, 0); }
		public TerminalNode EXCLAMATIONPOINT() { return getToken(VBAParser.EXCLAMATIONPOINT, 0); }
		public TerminalNode HASH() { return getToken(VBAParser.HASH, 0); }
		public TerminalNode AT() { return getToken(VBAParser.AT, 0); }
		public TerminalNode DOLLAR() { return getToken(VBAParser.DOLLAR, 0); }
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitTypeHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2654);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATIONPOINT) | (1L << HASH) | (1L << AT) | (1L << PERCENT) | (1L << DOLLAR) | (1L << AMPERSAND))) != 0) || _la==POW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(VBAParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(VBAParser.PUBLIC, 0); }
		public TerminalNode FRIEND() { return getToken(VBAParser.FRIEND, 0); }
		public TerminalNode GLOBAL() { return getToken(VBAParser.GLOBAL, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2656);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (FRIEND - 106)) | (1L << (GLOBAL - 106)) | (1L << (PRIVATE - 106)) | (1L << (PUBLIC - 106)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(VBAParser.NEW, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusOpContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(VBAParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public UnaryMinusOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUnaryMinusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUnaryMinusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUnaryMinusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(VBAParser.POW, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public PowOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPowOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPowOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPowOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VBAParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VBAParser.MINUS, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public AddOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofexprContext extends ExpressionContext {
		public TerminalNode TYPEOF() { return getToken(VBAParser.TYPEOF, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeofexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterTypeofexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitTypeofexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitTypeofexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDivOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INTDIV() { return getToken(VBAParser.INTDIV, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public IntDivOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIntDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIntDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIntDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalImpOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IMP() { return getToken(VBAParser.IMP, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LogicalImpOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLogicalImpOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLogicalImpOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLogicalImpOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AMPERSAND() { return getToken(VBAParser.AMPERSAND, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ConcatOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterConcatOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitConcatOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitConcatOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MarkedFileNumberExprContext extends ExpressionContext {
		public TerminalNode HASH() { return getToken(VBAParser.HASH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MarkedFileNumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMarkedFileNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMarkedFileNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMarkedFileNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(VBAParser.MOD, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ModOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterModOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitModOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitModOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LExprContext extends ExpressionContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public LExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(VBAParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(VBAParser.DIV, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public MultOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalXorOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(VBAParser.XOR, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LogicalXorOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLogicalXorOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLogicalXorOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLogicalXorOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(VBAParser.AND, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LogicalAndOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLogicalAndOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLogicalAndOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLogicalAndOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(VBAParser.OR, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LogicalOrOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLogicalOrOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLogicalOrOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLogicalOrOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VBAParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VBAParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(VBAParser.LT, 0); }
		public TerminalNode GT() { return getToken(VBAParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(VBAParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(VBAParser.GEQ, 0); }
		public TerminalNode LIKE() { return getToken(VBAParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(VBAParser.IS, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public RelationalOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalEqvOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQV() { return getToken(VBAParser.EQV, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LogicalEqvOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLogicalEqvOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLogicalEqvOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLogicalEqvOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltInTypeExprContext extends ExpressionContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public BuiltInTypeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBuiltInTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBuiltInTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBuiltInTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotOpContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(VBAParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public LogicalNotOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLogicalNotOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLogicalNotOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLogicalNotOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 384;
		enterRecursionRule(_localctx, 384, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2659);
					whiteSpace();
					}
				}

				setState(2662);
				match(LPAREN);
				setState(2664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
				case 1:
					{
					setState(2663);
					whiteSpace();
					}
					break;
				}
				setState(2666);
				expression(0);
				setState(2668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2667);
					whiteSpace();
					}
				}

				setState(2670);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new TypeofexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2672);
				match(TYPEOF);
				setState(2673);
				whiteSpace();
				setState(2674);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new MarkedFileNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2676);
				match(HASH);
				setState(2677);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2678);
				match(NEW);
				setState(2679);
				whiteSpace();
				setState(2680);
				expression(18);
				}
				break;
			case 5:
				{
				_localctx = new UnaryMinusOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2682);
				match(MINUS);
				setState(2684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
				case 1:
					{
					setState(2683);
					whiteSpace();
					}
					break;
				}
				setState(2686);
				expression(16);
				}
				break;
			case 6:
				{
				_localctx = new LogicalNotOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2687);
				match(NOT);
				setState(2689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
				case 1:
					{
					setState(2688);
					whiteSpace();
					}
					break;
				}
				setState(2691);
				expression(9);
				}
				break;
			case 7:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2692);
				literalExpression();
				}
				break;
			case 8:
				{
				_localctx = new LExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2693);
				lExpression(0);
				}
				break;
			case 9:
				{
				_localctx = new BuiltInTypeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2694);
				builtInType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,436,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2805);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
					case 1:
						{
						_localctx = new PowOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2697);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2699);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2698);
							whiteSpace();
							}
						}

						setState(2701);
						match(POW);
						setState(2703);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
						case 1:
							{
							setState(2702);
							whiteSpace();
							}
							break;
						}
						setState(2705);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new MultOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2706);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2708);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2707);
							whiteSpace();
							}
						}

						setState(2710);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MULT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2712);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
						case 1:
							{
							setState(2711);
							whiteSpace();
							}
							break;
						}
						setState(2714);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new IntDivOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2715);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2717);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2716);
							whiteSpace();
							}
						}

						setState(2719);
						match(INTDIV);
						setState(2721);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
						case 1:
							{
							setState(2720);
							whiteSpace();
							}
							break;
						}
						setState(2723);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ModOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2724);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2726);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2725);
							whiteSpace();
							}
						}

						setState(2728);
						match(MOD);
						setState(2730);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
						case 1:
							{
							setState(2729);
							whiteSpace();
							}
							break;
						}
						setState(2732);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new AddOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2733);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2735);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2734);
							whiteSpace();
							}
						}

						setState(2737);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2739);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,420,_ctx) ) {
						case 1:
							{
							setState(2738);
							whiteSpace();
							}
							break;
						}
						setState(2741);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ConcatOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2742);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2744);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2743);
							whiteSpace();
							}
						}

						setState(2746);
						match(AMPERSAND);
						setState(2748);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
						case 1:
							{
							setState(2747);
							whiteSpace();
							}
							break;
						}
						setState(2750);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new RelationalOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2751);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2753);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2752);
							whiteSpace();
							}
						}

						setState(2755);
						_la = _input.LA(1);
						if ( !(_la==IS || _la==LIKE || ((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (EQ - 288)) | (1L << (GEQ - 288)) | (1L << (GT - 288)) | (1L << (LEQ - 288)) | (1L << (LT - 288)) | (1L << (NEQ - 288)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2757);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
						case 1:
							{
							setState(2756);
							whiteSpace();
							}
							break;
						}
						setState(2759);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new LogicalAndOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2760);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2762);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2761);
							whiteSpace();
							}
						}

						setState(2764);
						match(AND);
						setState(2766);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
						case 1:
							{
							setState(2765);
							whiteSpace();
							}
							break;
						}
						setState(2768);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new LogicalOrOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2769);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2771);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2770);
							whiteSpace();
							}
						}

						setState(2773);
						match(OR);
						setState(2775);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,428,_ctx) ) {
						case 1:
							{
							setState(2774);
							whiteSpace();
							}
							break;
						}
						setState(2777);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new LogicalXorOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2778);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2780);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2779);
							whiteSpace();
							}
						}

						setState(2782);
						match(XOR);
						setState(2784);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
						case 1:
							{
							setState(2783);
							whiteSpace();
							}
							break;
						}
						setState(2786);
						expression(7);
						}
						break;
					case 11:
						{
						_localctx = new LogicalEqvOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2787);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2789);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2788);
							whiteSpace();
							}
						}

						setState(2791);
						match(EQV);
						setState(2793);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
						case 1:
							{
							setState(2792);
							whiteSpace();
							}
							break;
						}
						setState(2795);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new LogicalImpOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2796);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2798);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2797);
							whiteSpace();
							}
						}

						setState(2800);
						match(IMP);
						setState(2802);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
						case 1:
							{
							setState(2801);
							whiteSpace();
							}
							break;
						}
						setState(2804);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(2809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,436,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralExpressionContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode DATELITERAL() { return getToken(VBAParser.DATELITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(VBAParser.STRINGLITERAL, 0); }
		public LiteralIdentifierContext literalIdentifier() {
			return getRuleContext(LiteralIdentifierContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_literalExpression);
		try {
			setState(2817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCTLITERAL:
			case HEXLITERAL:
			case FLOATLITERAL:
			case INTEGERLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2810);
				numberLiteral();
				}
				break;
			case DATELITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2811);
				match(DATELITERAL);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2812);
				match(STRINGLITERAL);
				}
				break;
			case EMPTY:
			case FALSE:
			case NOTHING:
			case NULL:
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2813);
				literalIdentifier();
				setState(2815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
				case 1:
					{
					setState(2814);
					typeHint();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralIdentifierContext extends ParserRuleContext {
		public BooleanLiteralIdentifierContext booleanLiteralIdentifier() {
			return getRuleContext(BooleanLiteralIdentifierContext.class,0);
		}
		public ObjectLiteralIdentifierContext objectLiteralIdentifier() {
			return getRuleContext(ObjectLiteralIdentifierContext.class,0);
		}
		public VariantLiteralIdentifierContext variantLiteralIdentifier() {
			return getRuleContext(VariantLiteralIdentifierContext.class,0);
		}
		public LiteralIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLiteralIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLiteralIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLiteralIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralIdentifierContext literalIdentifier() throws RecognitionException {
		LiteralIdentifierContext _localctx = new LiteralIdentifierContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_literalIdentifier);
		try {
			setState(2822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2819);
				booleanLiteralIdentifier();
				}
				break;
			case NOTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2820);
				objectLiteralIdentifier();
				}
				break;
			case EMPTY:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2821);
				variantLiteralIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralIdentifierContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(VBAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VBAParser.FALSE, 0); }
		public BooleanLiteralIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteralIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBooleanLiteralIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBooleanLiteralIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBooleanLiteralIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralIdentifierContext booleanLiteralIdentifier() throws RecognitionException {
		BooleanLiteralIdentifierContext _localctx = new BooleanLiteralIdentifierContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_booleanLiteralIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2824);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralIdentifierContext extends ParserRuleContext {
		public TerminalNode NOTHING() { return getToken(VBAParser.NOTHING, 0); }
		public ObjectLiteralIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteralIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterObjectLiteralIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitObjectLiteralIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitObjectLiteralIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralIdentifierContext objectLiteralIdentifier() throws RecognitionException {
		ObjectLiteralIdentifierContext _localctx = new ObjectLiteralIdentifierContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_objectLiteralIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2826);
			match(NOTHING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantLiteralIdentifierContext extends ParserRuleContext {
		public TerminalNode EMPTY() { return getToken(VBAParser.EMPTY, 0); }
		public TerminalNode NULL() { return getToken(VBAParser.NULL, 0); }
		public VariantLiteralIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantLiteralIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterVariantLiteralIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitVariantLiteralIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitVariantLiteralIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantLiteralIdentifierContext variantLiteralIdentifier() throws RecognitionException {
		VariantLiteralIdentifierContext _localctx = new VariantLiteralIdentifierContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_variantLiteralIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2828);
			_la = _input.LA(1);
			if ( !(_la==EMPTY || _la==NULL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LExpressionContext extends ParserRuleContext {
		public LExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lExpression; }
	 
		public LExpressionContext() { }
		public void copyFrom(LExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexExprContext extends LExpressionContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public IndexExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithMemberAccessExprContext extends LExpressionContext {
		public TerminalNode DOT() { return getToken(VBAParser.DOT, 0); }
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public MandatoryLineContinuationContext mandatoryLineContinuation() {
			return getRuleContext(MandatoryLineContinuationContext.class,0);
		}
		public WithMemberAccessExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWithMemberAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWithMemberAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWithMemberAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithDictionaryAccessExprContext extends LExpressionContext {
		public TerminalNode EXCLAMATIONPOINT() { return getToken(VBAParser.EXCLAMATIONPOINT, 0); }
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public MandatoryLineContinuationContext mandatoryLineContinuation() {
			return getRuleContext(MandatoryLineContinuationContext.class,0);
		}
		public WithDictionaryAccessExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWithDictionaryAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWithDictionaryAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWithDictionaryAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandardExprContext extends LExpressionContext {
		public StandardFunctionKeywordContext standardFunctionKeyword() {
			return getRuleContext(StandardFunctionKeywordContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public StandardExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStandardExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStandardExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStandardExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleNameExprContext extends LExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SimpleNameExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterSimpleNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitSimpleNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitSimpleNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessExprContext extends LExpressionContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(VBAParser.DOT, 0); }
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public List<MandatoryLineContinuationContext> mandatoryLineContinuation() {
			return getRuleContexts(MandatoryLineContinuationContext.class);
		}
		public MandatoryLineContinuationContext mandatoryLineContinuation(int i) {
			return getRuleContext(MandatoryLineContinuationContext.class,i);
		}
		public MemberAccessExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMemberAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMemberAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMemberAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceExprContext extends LExpressionContext {
		public TerminalNode ME() { return getToken(VBAParser.ME, 0); }
		public InstanceExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterInstanceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitInstanceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitInstanceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DictionaryAccessExprContext extends LExpressionContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public TerminalNode EXCLAMATIONPOINT() { return getToken(VBAParser.EXCLAMATIONPOINT, 0); }
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public List<MandatoryLineContinuationContext> mandatoryLineContinuation() {
			return getRuleContexts(MandatoryLineContinuationContext.class);
		}
		public MandatoryLineContinuationContext mandatoryLineContinuation(int i) {
			return getRuleContext(MandatoryLineContinuationContext.class,i);
		}
		public DictionaryAccessExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterDictionaryAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitDictionaryAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitDictionaryAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhitespaceIndexExprContext extends LExpressionContext {
		public LExpressionContext lExpression() {
			return getRuleContext(LExpressionContext.class,0);
		}
		public MandatoryLineContinuationContext mandatoryLineContinuation() {
			return getRuleContext(MandatoryLineContinuationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public WhitespaceIndexExprContext(LExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWhitespaceIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWhitespaceIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWhitespaceIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LExpressionContext lExpression() throws RecognitionException {
		return lExpression(0);
	}

	private LExpressionContext lExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LExpressionContext _localctx = new LExpressionContext(_ctx, _parentState);
		LExpressionContext _prevctx = _localctx;
		int _startState = 396;
		enterRecursionRule(_localctx, 396, RULE_lExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,445,_ctx) ) {
			case 1:
				{
				_localctx = new StandardExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2831);
				standardFunctionKeyword();
				setState(2832);
				match(LPAREN);
				setState(2834);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
				case 1:
					{
					setState(2833);
					whiteSpace();
					}
					break;
				}
				setState(2837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
				case 1:
					{
					setState(2836);
					argumentList();
					}
					break;
				}
				setState(2840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2839);
					whiteSpace();
					}
				}

				setState(2842);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new InstanceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2844);
				match(ME);
				}
				break;
			case 3:
				{
				_localctx = new SimpleNameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2845);
				identifier();
				}
				break;
			case 4:
				{
				_localctx = new WithMemberAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2846);
				match(DOT);
				setState(2848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_CONTINUATION) {
					{
					setState(2847);
					mandatoryLineContinuation();
					}
				}

				setState(2850);
				unrestrictedIdentifier();
				}
				break;
			case 5:
				{
				_localctx = new WithDictionaryAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2851);
				match(EXCLAMATIONPOINT);
				setState(2853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_CONTINUATION) {
					{
					setState(2852);
					mandatoryLineContinuation();
					}
				}

				setState(2855);
				unrestrictedIdentifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2905);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,457,_ctx) ) {
					case 1:
						{
						_localctx = new IndexExprContext(new LExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lExpression);
						setState(2858);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2859);
						match(LPAREN);
						setState(2861);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,446,_ctx) ) {
						case 1:
							{
							setState(2860);
							whiteSpace();
							}
							break;
						}
						setState(2864);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,447,_ctx) ) {
						case 1:
							{
							setState(2863);
							argumentList();
							}
							break;
						}
						setState(2867);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2866);
							whiteSpace();
							}
						}

						setState(2869);
						match(RPAREN);
						}
						break;
					case 2:
						{
						_localctx = new MemberAccessExprContext(new LExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lExpression);
						setState(2870);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2872);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LINE_CONTINUATION) {
							{
							setState(2871);
							mandatoryLineContinuation();
							}
						}

						setState(2874);
						match(DOT);
						setState(2876);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LINE_CONTINUATION) {
							{
							setState(2875);
							mandatoryLineContinuation();
							}
						}

						setState(2878);
						unrestrictedIdentifier();
						}
						break;
					case 3:
						{
						_localctx = new DictionaryAccessExprContext(new LExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lExpression);
						setState(2879);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2881);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LINE_CONTINUATION) {
							{
							setState(2880);
							mandatoryLineContinuation();
							}
						}

						setState(2883);
						match(EXCLAMATIONPOINT);
						setState(2885);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LINE_CONTINUATION) {
							{
							setState(2884);
							mandatoryLineContinuation();
							}
						}

						setState(2887);
						unrestrictedIdentifier();
						}
						break;
					case 4:
						{
						_localctx = new WhitespaceIndexExprContext(new LExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lExpression);
						setState(2888);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2889);
						mandatoryLineContinuation();
						setState(2891);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2890);
							whiteSpace();
							}
						}

						setState(2893);
						match(LPAREN);
						setState(2895);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,454,_ctx) ) {
						case 1:
							{
							setState(2894);
							whiteSpace();
							}
							break;
						}
						setState(2898);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,455,_ctx) ) {
						case 1:
							{
							setState(2897);
							argumentList();
							}
							break;
						}
						setState(2901);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2900);
							whiteSpace();
							}
						}

						setState(2903);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(2909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BuiltInTypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode L_SQUARE_BRACKET() { return getToken(VBAParser.L_SQUARE_BRACKET, 0); }
		public TerminalNode R_SQUARE_BRACKET() { return getToken(VBAParser.R_SQUARE_BRACKET, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode OBJECT() { return getToken(VBAParser.OBJECT, 0); }
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterBuiltInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitBuiltInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitBuiltInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_builtInType);
		int _la;
		try {
			setState(2931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,463,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2910);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2911);
				match(L_SQUARE_BRACKET);
				setState(2913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2912);
					whiteSpace();
					}
				}

				setState(2915);
				baseType();
				setState(2917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2916);
					whiteSpace();
					}
				}

				setState(2919);
				match(R_SQUARE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2921);
				match(OBJECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2922);
				match(L_SQUARE_BRACKET);
				setState(2924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2923);
					whiteSpace();
					}
				}

				setState(2926);
				match(OBJECT);
				setState(2928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(2927);
					whiteSpace();
					}
				}

				setState(2930);
				match(R_SQUARE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,464,_ctx) ) {
			case 1:
				{
				setState(2933);
				whiteSpace();
				}
				break;
			}
			setState(2952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,469,_ctx) ) {
			case 1+1:
				{
				setState(2937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,465,_ctx) ) {
				case 1:
					{
					setState(2936);
					argument();
					}
					break;
				}
				setState(2949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,468,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2940);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(2939);
							whiteSpace();
							}
						}

						setState(2942);
						match(COMMA);
						setState(2944);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,467,_ctx) ) {
						case 1:
							{
							setState(2943);
							whiteSpace();
							}
							break;
						}
						setState(2946);
						argument();
						}
						} 
					}
					setState(2951);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,468,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredArgumentContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public RequiredArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRequiredArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRequiredArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRequiredArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredArgumentContext requiredArgument() throws RecognitionException {
		RequiredArgumentContext _localctx = new RequiredArgumentContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_requiredArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2954);
			argument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public PositionalArgumentContext positionalArgument() {
			return getRuleContext(PositionalArgumentContext.class,0);
		}
		public NamedArgumentContext namedArgument() {
			return getRuleContext(NamedArgumentContext.class,0);
		}
		public MissingArgumentContext missingArgument() {
			return getRuleContext(MissingArgumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_argument);
		try {
			setState(2959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,470,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2956);
				positionalArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2957);
				namedArgument();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2958);
				missingArgument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionalArgumentContext extends ParserRuleContext {
		public ArgumentExpressionContext argumentExpression() {
			return getRuleContext(ArgumentExpressionContext.class,0);
		}
		public PositionalArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionalArgumentContext positionalArgument() throws RecognitionException {
		PositionalArgumentContext _localctx = new PositionalArgumentContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_positionalArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2961);
			argumentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentContext extends ParserRuleContext {
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VBAParser.ASSIGN, 0); }
		public ArgumentExpressionContext argumentExpression() {
			return getRuleContext(ArgumentExpressionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_namedArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2963);
			unrestrictedIdentifier();
			setState(2965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==LINE_CONTINUATION) {
				{
				setState(2964);
				whiteSpace();
				}
			}

			setState(2967);
			match(ASSIGN);
			setState(2969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,472,_ctx) ) {
			case 1:
				{
				setState(2968);
				whiteSpace();
				}
				break;
			}
			setState(2971);
			argumentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MissingArgumentContext extends ParserRuleContext {
		public MissingArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMissingArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMissingArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMissingArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingArgumentContext missingArgument() throws RecognitionException {
		MissingArgumentContext _localctx = new MissingArgumentContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_missingArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BYVAL() { return getToken(VBAParser.BYVAL, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public AddressOfExpressionContext addressOfExpression() {
			return getRuleContext(AddressOfExpressionContext.class,0);
		}
		public LowerBoundArgumentExpressionContext lowerBoundArgumentExpression() {
			return getRuleContext(LowerBoundArgumentExpressionContext.class,0);
		}
		public TerminalNode TO() { return getToken(VBAParser.TO, 0); }
		public UpperBoundArgumentExpressionContext upperBoundArgumentExpression() {
			return getRuleContext(UpperBoundArgumentExpressionContext.class,0);
		}
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitArgumentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitArgumentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_argumentExpression);
		try {
			setState(2987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,474,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,473,_ctx) ) {
				case 1:
					{
					setState(2975);
					match(BYVAL);
					setState(2976);
					whiteSpace();
					}
					break;
				}
				setState(2979);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2980);
				addressOfExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2981);
				lowerBoundArgumentExpression();
				setState(2982);
				whiteSpace();
				setState(2983);
				match(TO);
				setState(2984);
				whiteSpace();
				setState(2985);
				upperBoundArgumentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowerBoundArgumentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LowerBoundArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBoundArgumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterLowerBoundArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitLowerBoundArgumentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitLowerBoundArgumentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerBoundArgumentExpressionContext lowerBoundArgumentExpression() throws RecognitionException {
		LowerBoundArgumentExpressionContext _localctx = new LowerBoundArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_lowerBoundArgumentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2989);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpperBoundArgumentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpperBoundArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBoundArgumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterUpperBoundArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitUpperBoundArgumentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitUpperBoundArgumentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperBoundArgumentExpressionContext upperBoundArgumentExpression() throws RecognitionException {
		UpperBoundArgumentExpressionContext _localctx = new UpperBoundArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_upperBoundArgumentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2991);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressOfExpressionContext extends ParserRuleContext {
		public TerminalNode ADDRESSOF() { return getToken(VBAParser.ADDRESSOF, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddressOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAddressOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAddressOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAddressOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressOfExpressionContext addressOfExpression() throws RecognitionException {
		AddressOfExpressionContext _localctx = new AddressOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_addressOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2993);
			match(ADDRESSOF);
			setState(2994);
			whiteSpace();
			setState(2995);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ADDRESSOF() { return getToken(VBAParser.ADDRESSOF, 0); }
		public TerminalNode ALIAS() { return getToken(VBAParser.ALIAS, 0); }
		public TerminalNode AND() { return getToken(VBAParser.AND, 0); }
		public TerminalNode ANY() { return getToken(VBAParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(VBAParser.ARRAY, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(VBAParser.ATTRIBUTE, 0); }
		public TerminalNode BEGIN() { return getToken(VBAParser.BEGIN, 0); }
		public TerminalNode BEGINPROPERTY() { return getToken(VBAParser.BEGINPROPERTY, 0); }
		public TerminalNode BOOLEAN() { return getToken(VBAParser.BOOLEAN, 0); }
		public TerminalNode BYREF() { return getToken(VBAParser.BYREF, 0); }
		public TerminalNode BYTE() { return getToken(VBAParser.BYTE, 0); }
		public TerminalNode BYVAL() { return getToken(VBAParser.BYVAL, 0); }
		public TerminalNode CBOOL() { return getToken(VBAParser.CBOOL, 0); }
		public TerminalNode CBYTE() { return getToken(VBAParser.CBYTE, 0); }
		public TerminalNode CCUR() { return getToken(VBAParser.CCUR, 0); }
		public TerminalNode CDATE() { return getToken(VBAParser.CDATE, 0); }
		public TerminalNode CDBL() { return getToken(VBAParser.CDBL, 0); }
		public TerminalNode CDEC() { return getToken(VBAParser.CDEC, 0); }
		public TerminalNode CINT() { return getToken(VBAParser.CINT, 0); }
		public TerminalNode CLASS() { return getToken(VBAParser.CLASS, 0); }
		public TerminalNode CLNG() { return getToken(VBAParser.CLNG, 0); }
		public TerminalNode CLNGLNG() { return getToken(VBAParser.CLNGLNG, 0); }
		public TerminalNode CLNGPTR() { return getToken(VBAParser.CLNGPTR, 0); }
		public TerminalNode CSNG() { return getToken(VBAParser.CSNG, 0); }
		public TerminalNode CSTR() { return getToken(VBAParser.CSTR, 0); }
		public TerminalNode CURRENCY() { return getToken(VBAParser.CURRENCY, 0); }
		public TerminalNode CVAR() { return getToken(VBAParser.CVAR, 0); }
		public TerminalNode CVERR() { return getToken(VBAParser.CVERR, 0); }
		public TerminalNode DATABASE() { return getToken(VBAParser.DATABASE, 0); }
		public TerminalNode DATE() { return getToken(VBAParser.DATE, 0); }
		public TerminalNode DEBUG() { return getToken(VBAParser.DEBUG, 0); }
		public TerminalNode DOEVENTS() { return getToken(VBAParser.DOEVENTS, 0); }
		public TerminalNode DOUBLE() { return getToken(VBAParser.DOUBLE, 0); }
		public TerminalNode END() { return getToken(VBAParser.END, 0); }
		public TerminalNode ENDPROPERTY() { return getToken(VBAParser.ENDPROPERTY, 0); }
		public TerminalNode EQV() { return getToken(VBAParser.EQV, 0); }
		public TerminalNode FALSE() { return getToken(VBAParser.FALSE, 0); }
		public TerminalNode IMP() { return getToken(VBAParser.IMP, 0); }
		public TerminalNode IN() { return getToken(VBAParser.IN, 0); }
		public TerminalNode INPUTB() { return getToken(VBAParser.INPUTB, 0); }
		public TerminalNode INTEGER() { return getToken(VBAParser.INTEGER, 0); }
		public TerminalNode IS() { return getToken(VBAParser.IS, 0); }
		public TerminalNode LBOUND() { return getToken(VBAParser.LBOUND, 0); }
		public TerminalNode LENB() { return getToken(VBAParser.LENB, 0); }
		public TerminalNode LIB() { return getToken(VBAParser.LIB, 0); }
		public TerminalNode LIKE() { return getToken(VBAParser.LIKE, 0); }
		public TerminalNode LONG() { return getToken(VBAParser.LONG, 0); }
		public TerminalNode LONGLONG() { return getToken(VBAParser.LONGLONG, 0); }
		public TerminalNode LONGPTR() { return getToken(VBAParser.LONGPTR, 0); }
		public TerminalNode ME() { return getToken(VBAParser.ME, 0); }
		public TerminalNode MIDB() { return getToken(VBAParser.MIDB, 0); }
		public TerminalNode MOD() { return getToken(VBAParser.MOD, 0); }
		public TerminalNode NEW() { return getToken(VBAParser.NEW, 0); }
		public TerminalNode NOT() { return getToken(VBAParser.NOT, 0); }
		public TerminalNode NOTHING() { return getToken(VBAParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(VBAParser.NULL, 0); }
		public TerminalNode OBJECT() { return getToken(VBAParser.OBJECT, 0); }
		public TerminalNode OPTIONAL() { return getToken(VBAParser.OPTIONAL, 0); }
		public TerminalNode OR() { return getToken(VBAParser.OR, 0); }
		public TerminalNode PARAMARRAY() { return getToken(VBAParser.PARAMARRAY, 0); }
		public TerminalNode PRESERVE() { return getToken(VBAParser.PRESERVE, 0); }
		public TerminalNode PSET() { return getToken(VBAParser.PSET, 0); }
		public TerminalNode PTRSAFE() { return getToken(VBAParser.PTRSAFE, 0); }
		public TerminalNode REM() { return getToken(VBAParser.REM, 0); }
		public TerminalNode SINGLE() { return getToken(VBAParser.SINGLE, 0); }
		public TerminalNode SPC() { return getToken(VBAParser.SPC, 0); }
		public TerminalNode STRING() { return getToken(VBAParser.STRING, 0); }
		public TerminalNode TAB() { return getToken(VBAParser.TAB, 0); }
		public TerminalNode TEXT() { return getToken(VBAParser.TEXT, 0); }
		public TerminalNode THEN() { return getToken(VBAParser.THEN, 0); }
		public TerminalNode TO() { return getToken(VBAParser.TO, 0); }
		public TerminalNode TRUE() { return getToken(VBAParser.TRUE, 0); }
		public TerminalNode TYPEOF() { return getToken(VBAParser.TYPEOF, 0); }
		public TerminalNode UBOUND() { return getToken(VBAParser.UBOUND, 0); }
		public TerminalNode UNTIL() { return getToken(VBAParser.UNTIL, 0); }
		public TerminalNode VARIANT() { return getToken(VBAParser.VARIANT, 0); }
		public TerminalNode VERSION() { return getToken(VBAParser.VERSION, 0); }
		public TerminalNode WITHEVENTS() { return getToken(VBAParser.WITHEVENTS, 0); }
		public TerminalNode XOR() { return getToken(VBAParser.XOR, 0); }
		public TerminalNode STEP() { return getToken(VBAParser.STEP, 0); }
		public TerminalNode ON_ERROR() { return getToken(VBAParser.ON_ERROR, 0); }
		public TerminalNode ERROR() { return getToken(VBAParser.ERROR, 0); }
		public TerminalNode APPEND() { return getToken(VBAParser.APPEND, 0); }
		public TerminalNode BINARY() { return getToken(VBAParser.BINARY, 0); }
		public TerminalNode OUTPUT() { return getToken(VBAParser.OUTPUT, 0); }
		public TerminalNode RANDOM() { return getToken(VBAParser.RANDOM, 0); }
		public TerminalNode ACCESS() { return getToken(VBAParser.ACCESS, 0); }
		public TerminalNode READ() { return getToken(VBAParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(VBAParser.WRITE, 0); }
		public TerminalNode READ_WRITE() { return getToken(VBAParser.READ_WRITE, 0); }
		public TerminalNode SHARED() { return getToken(VBAParser.SHARED, 0); }
		public TerminalNode LOCK_READ() { return getToken(VBAParser.LOCK_READ, 0); }
		public TerminalNode LOCK_WRITE() { return getToken(VBAParser.LOCK_WRITE, 0); }
		public TerminalNode LOCK_READ_WRITE() { return getToken(VBAParser.LOCK_READ_WRITE, 0); }
		public TerminalNode LINE_INPUT() { return getToken(VBAParser.LINE_INPUT, 0); }
		public TerminalNode RESET() { return getToken(VBAParser.RESET, 0); }
		public TerminalNode WIDTH() { return getToken(VBAParser.WIDTH, 0); }
		public TerminalNode PRINT() { return getToken(VBAParser.PRINT, 0); }
		public TerminalNode GET() { return getToken(VBAParser.GET, 0); }
		public TerminalNode PUT() { return getToken(VBAParser.PUT, 0); }
		public TerminalNode CLOSE() { return getToken(VBAParser.CLOSE, 0); }
		public TerminalNode INPUT() { return getToken(VBAParser.INPUT, 0); }
		public TerminalNode LOCK() { return getToken(VBAParser.LOCK, 0); }
		public TerminalNode OPEN() { return getToken(VBAParser.OPEN, 0); }
		public TerminalNode SEEK() { return getToken(VBAParser.SEEK, 0); }
		public TerminalNode UNLOCK() { return getToken(VBAParser.UNLOCK, 0); }
		public TerminalNode NAME() { return getToken(VBAParser.NAME, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2997);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << PSET) | (1L << UBOUND) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CLASS) | (1L << CLOSE) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (DOUBLE - 80)) | (1L << (ENDPROPERTY - 80)) | (1L << (END - 80)) | (1L << (EQV - 80)) | (1L << (ERROR - 80)) | (1L << (FALSE - 80)) | (1L << (GET - 80)) | (1L << (IMP - 80)) | (1L << (IN - 80)) | (1L << (INPUT - 80)) | (1L << (IS - 80)) | (1L << (INTEGER - 80)) | (1L << (LOCK - 80)) | (1L << (LONG - 80)) | (1L << (LIB - 80)) | (1L << (LIKE - 80)) | (1L << (LINE_INPUT - 80)) | (1L << (LOCK_READ - 80)) | (1L << (LOCK_WRITE - 80)) | (1L << (LOCK_READ_WRITE - 80)) | (1L << (ME - 80)) | (1L << (MOD - 80)) | (1L << (NAME - 80)) | (1L << (NEW - 80)) | (1L << (NOT - 80)) | (1L << (NOTHING - 80)) | (1L << (NULL - 80)) | (1L << (OBJECT - 80)) | (1L << (ON_ERROR - 80)) | (1L << (OPEN - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (OPTIONAL - 144)) | (1L << (OR - 144)) | (1L << (OUTPUT - 144)) | (1L << (PARAMARRAY - 144)) | (1L << (PRESERVE - 144)) | (1L << (PRINT - 144)) | (1L << (PTRSAFE - 144)) | (1L << (PUT - 144)) | (1L << (RANDOM - 144)) | (1L << (READ - 144)) | (1L << (READ_WRITE - 144)) | (1L << (REM - 144)) | (1L << (RESET - 144)) | (1L << (SEEK - 144)) | (1L << (SHARED - 144)) | (1L << (SINGLE - 144)) | (1L << (SPC - 144)) | (1L << (STEP - 144)) | (1L << (STRING - 144)) | (1L << (TAB - 144)) | (1L << (TEXT - 144)) | (1L << (THEN - 144)) | (1L << (TO - 144)) | (1L << (TRUE - 144)) | (1L << (TYPEOF - 144)) | (1L << (UNLOCK - 144)) | (1L << (UNTIL - 144)) | (1L << (VARIANT - 144)) | (1L << (VERSION - 144)) | (1L << (WIDTH - 144)) | (1L << (WITHEVENTS - 144)) | (1L << (WRITE - 144)) | (1L << (XOR - 144)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerKeywordContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(VBAParser.AS, 0); }
		public MarkerKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMarkerKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMarkerKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMarkerKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerKeywordContext markerKeyword() throws RecognitionException {
		MarkerKeywordContext _localctx = new MarkerKeywordContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_markerKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2999);
			match(AS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementKeywordContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(VBAParser.CALL, 0); }
		public TerminalNode CASE() { return getToken(VBAParser.CASE, 0); }
		public TerminalNode CONST() { return getToken(VBAParser.CONST, 0); }
		public TerminalNode DECLARE() { return getToken(VBAParser.DECLARE, 0); }
		public TerminalNode DEFBOOL() { return getToken(VBAParser.DEFBOOL, 0); }
		public TerminalNode DEFBYTE() { return getToken(VBAParser.DEFBYTE, 0); }
		public TerminalNode DEFCUR() { return getToken(VBAParser.DEFCUR, 0); }
		public TerminalNode DEFDATE() { return getToken(VBAParser.DEFDATE, 0); }
		public TerminalNode DEFDBL() { return getToken(VBAParser.DEFDBL, 0); }
		public TerminalNode DEFINT() { return getToken(VBAParser.DEFINT, 0); }
		public TerminalNode DEFLNG() { return getToken(VBAParser.DEFLNG, 0); }
		public TerminalNode DEFLNGLNG() { return getToken(VBAParser.DEFLNGLNG, 0); }
		public TerminalNode DEFLNGPTR() { return getToken(VBAParser.DEFLNGPTR, 0); }
		public TerminalNode DEFOBJ() { return getToken(VBAParser.DEFOBJ, 0); }
		public TerminalNode DEFSNG() { return getToken(VBAParser.DEFSNG, 0); }
		public TerminalNode DEFSTR() { return getToken(VBAParser.DEFSTR, 0); }
		public TerminalNode DEFVAR() { return getToken(VBAParser.DEFVAR, 0); }
		public TerminalNode DIM() { return getToken(VBAParser.DIM, 0); }
		public TerminalNode DO() { return getToken(VBAParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(VBAParser.ELSE, 0); }
		public TerminalNode ELSEIF() { return getToken(VBAParser.ELSEIF, 0); }
		public TerminalNode ENUM() { return getToken(VBAParser.ENUM, 0); }
		public TerminalNode ERASE() { return getToken(VBAParser.ERASE, 0); }
		public TerminalNode EVENT() { return getToken(VBAParser.EVENT, 0); }
		public TerminalNode EXIT() { return getToken(VBAParser.EXIT, 0); }
		public TerminalNode EXIT_DO() { return getToken(VBAParser.EXIT_DO, 0); }
		public TerminalNode EXIT_FOR() { return getToken(VBAParser.EXIT_FOR, 0); }
		public TerminalNode EXIT_FUNCTION() { return getToken(VBAParser.EXIT_FUNCTION, 0); }
		public TerminalNode EXIT_PROPERTY() { return getToken(VBAParser.EXIT_PROPERTY, 0); }
		public TerminalNode EXIT_SUB() { return getToken(VBAParser.EXIT_SUB, 0); }
		public TerminalNode END_SELECT() { return getToken(VBAParser.END_SELECT, 0); }
		public TerminalNode END_WITH() { return getToken(VBAParser.END_WITH, 0); }
		public TerminalNode FOR() { return getToken(VBAParser.FOR, 0); }
		public TerminalNode FRIEND() { return getToken(VBAParser.FRIEND, 0); }
		public TerminalNode FUNCTION() { return getToken(VBAParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(VBAParser.GLOBAL, 0); }
		public TerminalNode GOSUB() { return getToken(VBAParser.GOSUB, 0); }
		public TerminalNode GOTO() { return getToken(VBAParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(VBAParser.IF, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(VBAParser.IMPLEMENTS, 0); }
		public TerminalNode LET() { return getToken(VBAParser.LET, 0); }
		public TerminalNode LOOP() { return getToken(VBAParser.LOOP, 0); }
		public TerminalNode LSET() { return getToken(VBAParser.LSET, 0); }
		public TerminalNode NEXT() { return getToken(VBAParser.NEXT, 0); }
		public TerminalNode ON() { return getToken(VBAParser.ON, 0); }
		public TerminalNode OPTION() { return getToken(VBAParser.OPTION, 0); }
		public TerminalNode PRIVATE() { return getToken(VBAParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(VBAParser.PUBLIC, 0); }
		public TerminalNode RAISEEVENT() { return getToken(VBAParser.RAISEEVENT, 0); }
		public TerminalNode REDIM() { return getToken(VBAParser.REDIM, 0); }
		public TerminalNode RESUME() { return getToken(VBAParser.RESUME, 0); }
		public TerminalNode RETURN() { return getToken(VBAParser.RETURN, 0); }
		public TerminalNode RSET() { return getToken(VBAParser.RSET, 0); }
		public TerminalNode SELECT() { return getToken(VBAParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(VBAParser.SET, 0); }
		public TerminalNode STATIC() { return getToken(VBAParser.STATIC, 0); }
		public TerminalNode STOP() { return getToken(VBAParser.STOP, 0); }
		public TerminalNode SUB() { return getToken(VBAParser.SUB, 0); }
		public TerminalNode TYPE() { return getToken(VBAParser.TYPE, 0); }
		public TerminalNode WEND() { return getToken(VBAParser.WEND, 0); }
		public TerminalNode WHILE() { return getToken(VBAParser.WHILE, 0); }
		public TerminalNode WITH() { return getToken(VBAParser.WITH, 0); }
		public StatementKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStatementKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStatementKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStatementKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementKeywordContext statementKeyword() throws RecognitionException {
		StatementKeywordContext _localctx = new StatementKeywordContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_statementKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3001);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (EXIT - 21)) | (1L << (OPTION - 21)) | (1L << (CALL - 21)) | (1L << (CASE - 21)) | (1L << (CONST - 21)) | (1L << (DECLARE - 21)) | (1L << (DEFBOOL - 21)) | (1L << (DEFBYTE - 21)) | (1L << (DEFDATE - 21)) | (1L << (DEFDBL - 21)) | (1L << (DEFCUR - 21)) | (1L << (DEFINT - 21)) | (1L << (DEFLNG - 21)) | (1L << (DEFLNGLNG - 21)) | (1L << (DEFLNGPTR - 21)) | (1L << (DEFOBJ - 21)) | (1L << (DEFSNG - 21)) | (1L << (DEFSTR - 21)) | (1L << (DEFVAR - 21)) | (1L << (DIM - 21)) | (1L << (DO - 21)) | (1L << (ELSE - 21)) | (1L << (ELSEIF - 21)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (END_SELECT - 90)) | (1L << (END_WITH - 90)) | (1L << (ENUM - 90)) | (1L << (ERASE - 90)) | (1L << (EVENT - 90)) | (1L << (EXIT_DO - 90)) | (1L << (EXIT_FOR - 90)) | (1L << (EXIT_FUNCTION - 90)) | (1L << (EXIT_PROPERTY - 90)) | (1L << (EXIT_SUB - 90)) | (1L << (FRIEND - 90)) | (1L << (FOR - 90)) | (1L << (FUNCTION - 90)) | (1L << (GLOBAL - 90)) | (1L << (GOSUB - 90)) | (1L << (GOTO - 90)) | (1L << (IF - 90)) | (1L << (IMPLEMENTS - 90)) | (1L << (LOOP - 90)) | (1L << (LET - 90)) | (1L << (LSET - 90)) | (1L << (NEXT - 90)) | (1L << (ON - 90)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (PRIVATE - 154)) | (1L << (PUBLIC - 154)) | (1L << (RAISEEVENT - 154)) | (1L << (REDIM - 154)) | (1L << (RESUME - 154)) | (1L << (RETURN - 154)) | (1L << (RSET - 154)) | (1L << (SELECT - 154)) | (1L << (SET - 154)) | (1L << (STATIC - 154)) | (1L << (STOP - 154)) | (1L << (SUB - 154)) | (1L << (TYPE - 154)) | (1L << (WEND - 154)) | (1L << (WHILE - 154)) | (1L << (WITH - 154)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardFunctionKeywordContext extends ParserRuleContext {
		public TerminalNode CHOOSE() { return getToken(VBAParser.CHOOSE, 0); }
		public TerminalNode ASC() { return getToken(VBAParser.ASC, 0); }
		public TerminalNode CHR() { return getToken(VBAParser.CHR, 0); }
		public TerminalNode FORMAT() { return getToken(VBAParser.FORMAT, 0); }
		public TerminalNode INSTR() { return getToken(VBAParser.INSTR, 0); }
		public TerminalNode INSTRREV() { return getToken(VBAParser.INSTRREV, 0); }
		public TerminalNode LCASE() { return getToken(VBAParser.LCASE, 0); }
		public TerminalNode LEFT() { return getToken(VBAParser.LEFT, 0); }
		public TerminalNode LEN() { return getToken(VBAParser.LEN, 0); }
		public TerminalNode LTRIM() { return getToken(VBAParser.LTRIM, 0); }
		public TerminalNode MID() { return getToken(VBAParser.MID, 0); }
		public TerminalNode REPLACE() { return getToken(VBAParser.REPLACE, 0); }
		public TerminalNode RIGHT() { return getToken(VBAParser.RIGHT, 0); }
		public TerminalNode RTRIM() { return getToken(VBAParser.RTRIM, 0); }
		public TerminalNode SPACE() { return getToken(VBAParser.SPACE, 0); }
		public TerminalNode SPLIT() { return getToken(VBAParser.SPLIT, 0); }
		public TerminalNode STR() { return getToken(VBAParser.STR, 0); }
		public TerminalNode STRCOMP() { return getToken(VBAParser.STRCOMP, 0); }
		public TerminalNode STRCONV() { return getToken(VBAParser.STRCONV, 0); }
		public TerminalNode STRREVERSE() { return getToken(VBAParser.STRREVERSE, 0); }
		public TerminalNode TRIM() { return getToken(VBAParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(VBAParser.UCASE, 0); }
		public TerminalNode VAL() { return getToken(VBAParser.VAL, 0); }
		public TerminalNode DATEADD() { return getToken(VBAParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(VBAParser.DATEDIFF, 0); }
		public TerminalNode DATEPART() { return getToken(VBAParser.DATEPART, 0); }
		public TerminalNode DATESERIAL() { return getToken(VBAParser.DATESERIAL, 0); }
		public TerminalNode DATEVALUE1() { return getToken(VBAParser.DATEVALUE1, 0); }
		public TerminalNode DAY() { return getToken(VBAParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(VBAParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(VBAParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(VBAParser.MONTH, 0); }
		public TerminalNode MONTHNAME1() { return getToken(VBAParser.MONTHNAME1, 0); }
		public TerminalNode NOW() { return getToken(VBAParser.NOW, 0); }
		public TerminalNode TIMESERIAL() { return getToken(VBAParser.TIMESERIAL, 0); }
		public TerminalNode TIMEVALUE1() { return getToken(VBAParser.TIMEVALUE1, 0); }
		public TerminalNode WEEKDAY() { return getToken(VBAParser.WEEKDAY, 0); }
		public TerminalNode WEEKDAYNAME() { return getToken(VBAParser.WEEKDAYNAME, 0); }
		public TerminalNode YEAR() { return getToken(VBAParser.YEAR, 0); }
		public TerminalNode ABS() { return getToken(VBAParser.ABS, 0); }
		public TerminalNode ATN() { return getToken(VBAParser.ATN, 0); }
		public TerminalNode COS() { return getToken(VBAParser.COS, 0); }
		public TerminalNode EXP() { return getToken(VBAParser.EXP, 0); }
		public TerminalNode FIX() { return getToken(VBAParser.FIX, 0); }
		public TerminalNode INT() { return getToken(VBAParser.INT, 0); }
		public TerminalNode LOG() { return getToken(VBAParser.LOG, 0); }
		public TerminalNode RANDOMIZE() { return getToken(VBAParser.RANDOMIZE, 0); }
		public TerminalNode RND() { return getToken(VBAParser.RND, 0); }
		public TerminalNode ROUND() { return getToken(VBAParser.ROUND, 0); }
		public TerminalNode SGN() { return getToken(VBAParser.SGN, 0); }
		public TerminalNode SIN() { return getToken(VBAParser.SIN, 0); }
		public TerminalNode SQR() { return getToken(VBAParser.SQR, 0); }
		public TerminalNode TAN() { return getToken(VBAParser.TAN, 0); }
		public TerminalNode ENVIRON() { return getToken(VBAParser.ENVIRON, 0); }
		public TerminalNode ISDATE() { return getToken(VBAParser.ISDATE, 0); }
		public TerminalNode ISEMPTY() { return getToken(VBAParser.ISEMPTY, 0); }
		public TerminalNode ISERROR() { return getToken(VBAParser.ISERROR, 0); }
		public TerminalNode ISNULL() { return getToken(VBAParser.ISNULL, 0); }
		public TerminalNode ISNUMERIC() { return getToken(VBAParser.ISNUMERIC, 0); }
		public TerminalNode DDB() { return getToken(VBAParser.DDB, 0); }
		public TerminalNode FV() { return getToken(VBAParser.FV, 0); }
		public TerminalNode IPMT() { return getToken(VBAParser.IPMT, 0); }
		public TerminalNode IRR() { return getToken(VBAParser.IRR, 0); }
		public TerminalNode MIRR() { return getToken(VBAParser.MIRR, 0); }
		public TerminalNode NPER() { return getToken(VBAParser.NPER, 0); }
		public TerminalNode NPV() { return getToken(VBAParser.NPV, 0); }
		public TerminalNode PMT() { return getToken(VBAParser.PMT, 0); }
		public TerminalNode PPMT() { return getToken(VBAParser.PPMT, 0); }
		public TerminalNode PV() { return getToken(VBAParser.PV, 0); }
		public TerminalNode RATE() { return getToken(VBAParser.RATE, 0); }
		public TerminalNode SLN() { return getToken(VBAParser.SLN, 0); }
		public TerminalNode SYD() { return getToken(VBAParser.SYD, 0); }
		public TerminalNode CHDIR() { return getToken(VBAParser.CHDIR, 0); }
		public TerminalNode CHDRIVE() { return getToken(VBAParser.CHDRIVE, 0); }
		public TerminalNode CURDIR() { return getToken(VBAParser.CURDIR, 0); }
		public TerminalNode DIR() { return getToken(VBAParser.DIR, 0); }
		public TerminalNode FILEDATETIME() { return getToken(VBAParser.FILEDATETIME, 0); }
		public TerminalNode FILELEN() { return getToken(VBAParser.FILELEN, 0); }
		public TerminalNode GETATTR() { return getToken(VBAParser.GETATTR, 0); }
		public TerminalNode MKDIR() { return getToken(VBAParser.MKDIR, 0); }
		public TerminalNode SETATTR() { return getToken(VBAParser.SETATTR, 0); }
		public TerminalNode CREATEOBJECT() { return getToken(VBAParser.CREATEOBJECT, 0); }
		public TerminalNode ASCW() { return getToken(VBAParser.ASCW, 0); }
		public TerminalNode ROUNDUP() { return getToken(VBAParser.ROUNDUP, 0); }
		public TerminalNode ROUNDDOWN() { return getToken(VBAParser.ROUNDDOWN, 0); }
		public StandardFunctionKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardFunctionKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterStandardFunctionKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitStandardFunctionKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitStandardFunctionKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardFunctionKeywordContext standardFunctionKeyword() throws RecognitionException {
		StandardFunctionKeywordContext _localctx = new StandardFunctionKeywordContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_standardFunctionKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3003);
			_la = _input.LA(1);
			if ( !(((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CHOOSE - 200)) | (1L << (ASC - 200)) | (1L << (CHR - 200)) | (1L << (FORMAT - 200)) | (1L << (INSTR - 200)) | (1L << (INSTRREV - 200)) | (1L << (LCASE - 200)) | (1L << (LEFT - 200)) | (1L << (LEN - 200)) | (1L << (LTRIM - 200)) | (1L << (MID - 200)) | (1L << (REPLACE - 200)) | (1L << (RIGHT - 200)) | (1L << (RTRIM - 200)) | (1L << (SPACE - 200)) | (1L << (SPLIT - 200)) | (1L << (STR - 200)) | (1L << (STRCOMP - 200)) | (1L << (STRCONV - 200)) | (1L << (STRREVERSE - 200)) | (1L << (TRIM - 200)) | (1L << (UCASE - 200)) | (1L << (VAL - 200)) | (1L << (DATEADD - 200)) | (1L << (DATEDIFF - 200)) | (1L << (DATEPART - 200)) | (1L << (DATESERIAL - 200)) | (1L << (DATEVALUE1 - 200)) | (1L << (DAY - 200)) | (1L << (HOUR - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MONTHNAME1 - 200)) | (1L << (NOW - 200)) | (1L << (TIMESERIAL - 200)) | (1L << (TIMEVALUE1 - 200)) | (1L << (WEEKDAY - 200)) | (1L << (WEEKDAYNAME - 200)) | (1L << (YEAR - 200)) | (1L << (ABS - 200)) | (1L << (ATN - 200)) | (1L << (COS - 200)) | (1L << (EXP - 200)) | (1L << (FIX - 200)) | (1L << (INT - 200)) | (1L << (LOG - 200)) | (1L << (RANDOMIZE - 200)) | (1L << (RND - 200)) | (1L << (ROUND - 200)) | (1L << (SGN - 200)) | (1L << (SIN - 200)) | (1L << (SQR - 200)) | (1L << (TAN - 200)) | (1L << (ENVIRON - 200)) | (1L << (ISDATE - 200)) | (1L << (ISEMPTY - 200)) | (1L << (ISERROR - 200)) | (1L << (ISNULL - 200)) | (1L << (ISNUMERIC - 200)) | (1L << (DDB - 200)) | (1L << (FV - 200)) | (1L << (IPMT - 200)) | (1L << (IRR - 200)) | (1L << (MIRR - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (NPER - 264)) | (1L << (NPV - 264)) | (1L << (PMT - 264)) | (1L << (PPMT - 264)) | (1L << (PV - 264)) | (1L << (RATE - 264)) | (1L << (SLN - 264)) | (1L << (SYD - 264)) | (1L << (CHDIR - 264)) | (1L << (CHDRIVE - 264)) | (1L << (CURDIR - 264)) | (1L << (DIR - 264)) | (1L << (FILEDATETIME - 264)) | (1L << (FILELEN - 264)) | (1L << (GETATTR - 264)) | (1L << (MKDIR - 264)) | (1L << (SETATTR - 264)) | (1L << (CREATEOBJECT - 264)) | (1L << (ASCW - 264)) | (1L << (ROUNDUP - 264)) | (1L << (ROUNDDOWN - 264)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndOfLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(VBAParser.NEWLINE, 0); }
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public CommentOrAnnotationContext commentOrAnnotation() {
			return getRuleContext(CommentOrAnnotationContext.class,0);
		}
		public EndOfLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEndOfLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEndOfLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEndOfLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfLineContext endOfLine() throws RecognitionException {
		EndOfLineContext _localctx = new EndOfLineContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_endOfLine);
		int _la;
		try {
			setState(3016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,478,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3005);
					whiteSpace();
					}
				}

				setState(3008);
				match(NEWLINE);
				setState(3010);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,476,_ctx) ) {
				case 1:
					{
					setState(3009);
					whiteSpace();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3012);
					whiteSpace();
					}
				}

				setState(3015);
				commentOrAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndOfStatementContext extends ParserRuleContext {
		public List<IndividualNonEOFEndOfStatementContext> individualNonEOFEndOfStatement() {
			return getRuleContexts(IndividualNonEOFEndOfStatementContext.class);
		}
		public IndividualNonEOFEndOfStatementContext individualNonEOFEndOfStatement(int i) {
			return getRuleContext(IndividualNonEOFEndOfStatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(VBAParser.EOF, 0); }
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public EndOfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterEndOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitEndOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitEndOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfStatementContext endOfStatement() throws RecognitionException {
		EndOfStatementContext _localctx = new EndOfStatementContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_endOfStatement);
		int _la;
		try {
			int _alt;
			setState(3027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,481,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3019); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3018);
						individualNonEOFEndOfStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3021); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3023);
					whiteSpace();
					}
				}

				setState(3026);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndividualNonEOFEndOfStatementContext extends ParserRuleContext {
		public EndOfLineContext endOfLine() {
			return getRuleContext(EndOfLineContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VBAParser.COLON, 0); }
		public IndividualNonEOFEndOfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individualNonEOFEndOfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterIndividualNonEOFEndOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitIndividualNonEOFEndOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitIndividualNonEOFEndOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndividualNonEOFEndOfStatementContext individualNonEOFEndOfStatement() throws RecognitionException {
		IndividualNonEOFEndOfStatementContext _localctx = new IndividualNonEOFEndOfStatementContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_individualNonEOFEndOfStatement);
		int _la;
		try {
			setState(3040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,485,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3029);
				endOfLine();
				setState(3031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,482,_ctx) ) {
				case 1:
					{
					setState(3030);
					whiteSpace();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3033);
					whiteSpace();
					}
				}

				setState(3036);
				match(COLON);
				setState(3038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,484,_ctx) ) {
				case 1:
					{
					setState(3037);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentOrAnnotationContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(VBAParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(VBAParser.EOF, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public RemCommentContext remComment() {
			return getRuleContext(RemCommentContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentOrAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentOrAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCommentOrAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCommentOrAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCommentOrAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentOrAnnotationContext commentOrAnnotation() throws RecognitionException {
		CommentOrAnnotationContext _localctx = new CommentOrAnnotationContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_commentOrAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,486,_ctx) ) {
			case 1:
				{
				setState(3042);
				annotationList();
				}
				break;
			case 2:
				{
				setState(3043);
				remComment();
				}
				break;
			case 3:
				{
				setState(3044);
				comment();
				}
				break;
			}
			setState(3047);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemCommentContext extends ParserRuleContext {
		public TerminalNode REM() { return getToken(VBAParser.REM, 0); }
		public CommentBodyContext commentBody() {
			return getRuleContext(CommentBodyContext.class,0);
		}
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public RemCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterRemComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitRemComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitRemComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemCommentContext remComment() throws RecognitionException {
		RemCommentContext _localctx = new RemCommentContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_remComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3049);
			match(REM);
			setState(3051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,487,_ctx) ) {
			case 1:
				{
				setState(3050);
				whiteSpace();
				}
				break;
			}
			setState(3053);
			commentBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLEQUOTE() { return getToken(VBAParser.SINGLEQUOTE, 0); }
		public CommentBodyContext commentBody() {
			return getRuleContext(CommentBodyContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3055);
			match(SINGLEQUOTE);
			setState(3056);
			commentBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentBodyContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(VBAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VBAParser.NEWLINE, i);
		}
		public CommentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterCommentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitCommentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitCommentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentBodyContext commentBody() throws RecognitionException {
		CommentBodyContext _localctx = new CommentBodyContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_commentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << ARRAY) | (1L << CBOOL) | (1L << CBYTE) | (1L << CCUR) | (1L << CDATE) | (1L << CDBL) | (1L << CDEC) | (1L << CINT) | (1L << CIRCLE) | (1L << CLNG) | (1L << CLNGLNG) | (1L << CLNGPTR) | (1L << CSNG) | (1L << CSTR) | (1L << CURRENCY) | (1L << CVAR) | (1L << CVERR) | (1L << DEBUG) | (1L << DOEVENTS) | (1L << EXIT) | (1L << INPUTB) | (1L << LBOUND) | (1L << LENB) | (1L << LONGLONG) | (1L << LONGPTR) | (1L << MIDB) | (1L << OPTION) | (1L << PSET) | (1L << SCALE) | (1L << UBOUND) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << EXCLAMATIONPOINT) | (1L << DOT) | (1L << HASH) | (1L << AT) | (1L << PERCENT) | (1L << DOLLAR) | (1L << AMPERSAND) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPEND) | (1L << AS) | (1L << BEGINPROPERTY) | (1L << BEGIN) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CASE) | (1L << CDECL) | (1L << CLASS) | (1L << CLOSE) | (1L << CONST) | (1L << DATABASE) | (1L << DATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DEFBOOL - 64)) | (1L << (DEFBYTE - 64)) | (1L << (DEFDATE - 64)) | (1L << (DEFDBL - 64)) | (1L << (DEFCUR - 64)) | (1L << (DEFINT - 64)) | (1L << (DEFLNG - 64)) | (1L << (DEFLNGLNG - 64)) | (1L << (DEFLNGPTR - 64)) | (1L << (DEFOBJ - 64)) | (1L << (DEFSNG - 64)) | (1L << (DEFSTR - 64)) | (1L << (DEFVAR - 64)) | (1L << (DIM - 64)) | (1L << (DO - 64)) | (1L << (DOUBLE - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ELSEIF - 64)) | (1L << (EMPTY - 64)) | (1L << (END_ENUM - 64)) | (1L << (END_FUNCTION - 64)) | (1L << (END_IF - 64)) | (1L << (ENDPROPERTY - 64)) | (1L << (END_PROPERTY - 64)) | (1L << (END_SELECT - 64)) | (1L << (END_SUB - 64)) | (1L << (END_TYPE - 64)) | (1L << (END_WITH - 64)) | (1L << (END - 64)) | (1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (FALSE - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LOCK_READ - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LOCK_WRITE - 128)) | (1L << (LOCK_READ_WRITE - 128)) | (1L << (LSET - 128)) | (1L << (ME - 128)) | (1L << (MOD - 128)) | (1L << (NAME - 128)) | (1L << (NEXT - 128)) | (1L << (NEW - 128)) | (1L << (NOT - 128)) | (1L << (NOTHING - 128)) | (1L << (NULL - 128)) | (1L << (OBJECT - 128)) | (1L << (ON - 128)) | (1L << (ON_ERROR - 128)) | (1L << (ON_LOCAL_ERROR - 128)) | (1L << (OPEN - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTION_BASE - 128)) | (1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PTRSAFE - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (READ_WRITE - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RSET - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SET - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (VERSION - 192)) | (1L << (WEND - 192)) | (1L << (WHILE - 192)) | (1L << (WIDTH - 192)) | (1L << (WITH - 192)) | (1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (CHOOSE - 192)) | (1L << (ASC - 192)) | (1L << (CHR - 192)) | (1L << (FORMAT - 192)) | (1L << (INSTR - 192)) | (1L << (INSTRREV - 192)) | (1L << (LCASE - 192)) | (1L << (LEFT - 192)) | (1L << (LEN - 192)) | (1L << (LTRIM - 192)) | (1L << (MID - 192)) | (1L << (REPLACE - 192)) | (1L << (RIGHT - 192)) | (1L << (RTRIM - 192)) | (1L << (SPACE - 192)) | (1L << (SPLIT - 192)) | (1L << (STR - 192)) | (1L << (STRCOMP - 192)) | (1L << (STRCONV - 192)) | (1L << (STRREVERSE - 192)) | (1L << (TRIM - 192)) | (1L << (UCASE - 192)) | (1L << (VAL - 192)) | (1L << (DATEADD - 192)) | (1L << (DATEDIFF - 192)) | (1L << (DATEPART - 192)) | (1L << (DATESERIAL - 192)) | (1L << (DATEVALUE1 - 192)) | (1L << (DAY - 192)) | (1L << (HOUR - 192)) | (1L << (MINUTE - 192)) | (1L << (MONTH - 192)) | (1L << (MONTHNAME1 - 192)) | (1L << (NOW - 192)) | (1L << (TIMESERIAL - 192)) | (1L << (TIMEVALUE1 - 192)) | (1L << (WEEKDAY - 192)) | (1L << (WEEKDAYNAME - 192)) | (1L << (YEAR - 192)) | (1L << (ABS - 192)) | (1L << (ATN - 192)) | (1L << (COS - 192)) | (1L << (EXP - 192)) | (1L << (FIX - 192)) | (1L << (INT - 192)) | (1L << (LOG - 192)) | (1L << (RANDOMIZE - 192)) | (1L << (RND - 192)) | (1L << (ROUND - 192)) | (1L << (SGN - 192)) | (1L << (SIN - 192)) | (1L << (SQR - 192)) | (1L << (TAN - 192)) | (1L << (ENVIRON - 192)) | (1L << (ISDATE - 192)) | (1L << (ISEMPTY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (ISERROR - 256)) | (1L << (ISNULL - 256)) | (1L << (ISNUMERIC - 256)) | (1L << (DDB - 256)) | (1L << (FV - 256)) | (1L << (IPMT - 256)) | (1L << (IRR - 256)) | (1L << (MIRR - 256)) | (1L << (NPER - 256)) | (1L << (NPV - 256)) | (1L << (PMT - 256)) | (1L << (PPMT - 256)) | (1L << (PV - 256)) | (1L << (RATE - 256)) | (1L << (SLN - 256)) | (1L << (SYD - 256)) | (1L << (CHDIR - 256)) | (1L << (CHDRIVE - 256)) | (1L << (CURDIR - 256)) | (1L << (DIR - 256)) | (1L << (FILEDATETIME - 256)) | (1L << (FILELEN - 256)) | (1L << (GETATTR - 256)) | (1L << (MKDIR - 256)) | (1L << (SETATTR - 256)) | (1L << (CREATEOBJECT - 256)) | (1L << (ASCW - 256)) | (1L << (ROUNDUP - 256)) | (1L << (ROUNDDOWN - 256)) | (1L << (ASSIGN - 256)) | (1L << (DIV - 256)) | (1L << (INTDIV - 256)) | (1L << (EQ - 256)) | (1L << (GEQ - 256)) | (1L << (GT - 256)) | (1L << (LEQ - 256)) | (1L << (LPAREN - 256)) | (1L << (LT - 256)) | (1L << (MINUS - 256)) | (1L << (MULT - 256)) | (1L << (NEQ - 256)) | (1L << (PLUS - 256)) | (1L << (POW - 256)) | (1L << (RPAREN - 256)) | (1L << (L_SQUARE_BRACKET - 256)) | (1L << (R_SQUARE_BRACKET - 256)) | (1L << (L_BRACE - 256)) | (1L << (R_BRACE - 256)) | (1L << (STRINGLITERAL - 256)) | (1L << (OCTLITERAL - 256)) | (1L << (HEXLITERAL - 256)) | (1L << (FLOATLITERAL - 256)) | (1L << (INTEGERLITERAL - 256)) | (1L << (DATELITERAL - 256)) | (1L << (SINGLEQUOTE - 256)) | (1L << (UNDERSCORE - 256)) | (1L << (WS - 256)) | (1L << (GUIDLITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (LINE_CONTINUATION - 256)) | (1L << (BARE_HEX_LITERAL - 256)) | (1L << (ERRORCHAR - 256)))) != 0)) {
				{
				{
				setState(3058);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(3063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationListContext extends ParserRuleContext {
		public TerminalNode SINGLEQUOTE() { return getToken(VBAParser.SINGLEQUOTE, 0); }
		public List<TerminalNode> AT() { return getTokens(VBAParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(VBAParser.AT, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VBAParser.COLON, 0); }
		public CommentBodyContext commentBody() {
			return getRuleContext(CommentBodyContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAnnotationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAnnotationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_annotationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3064);
			match(SINGLEQUOTE);
			setState(3070); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3065);
				match(AT);
				setState(3066);
				annotation();
				setState(3068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3067);
					whiteSpace();
					}
				}

				}
				}
				setState(3072); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			setState(3076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(3074);
				match(COLON);
				setState(3075);
				commentBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public AnnotationArgListContext annotationArgList() {
			return getRuleContext(AnnotationArgListContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3078);
			annotationName();
			setState(3080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,492,_ctx) ) {
			case 1:
				{
				setState(3079);
				annotationArgList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public UnrestrictedIdentifierContext unrestrictedIdentifier() {
			return getRuleContext(UnrestrictedIdentifierContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3082);
			unrestrictedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationArgListContext extends ParserRuleContext {
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<AnnotationArgContext> annotationArg() {
			return getRuleContexts(AnnotationArgContext.class);
		}
		public AnnotationArgContext annotationArg(int i) {
			return getRuleContext(AnnotationArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VBAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VBAParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(VBAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VBAParser.RPAREN, 0); }
		public AnnotationArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAnnotationArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAnnotationArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAnnotationArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationArgListContext annotationArgList() throws RecognitionException {
		AnnotationArgListContext _localctx = new AnnotationArgListContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_annotationArgList);
		int _la;
		try {
			int _alt;
			setState(3144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,506,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3084);
				whiteSpace();
				setState(3085);
				annotationArg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3087);
				whiteSpace();
				setState(3088);
				annotationArg();
				setState(3097); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3090);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(3089);
							whiteSpace();
							}
						}

						setState(3092);
						match(COMMA);
						setState(3094);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,494,_ctx) ) {
						case 1:
							{
							setState(3093);
							whiteSpace();
							}
							break;
						}
						setState(3096);
						annotationArg();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3099); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,495,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3101);
					whiteSpace();
					}
				}

				setState(3104);
				match(LPAREN);
				setState(3106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3105);
					whiteSpace();
					}
				}

				setState(3108);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3109);
					whiteSpace();
					}
				}

				setState(3112);
				match(LPAREN);
				setState(3114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,499,_ctx) ) {
				case 1:
					{
					setState(3113);
					whiteSpace();
					}
					break;
				}
				setState(3116);
				annotationArg();
				setState(3118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3117);
					whiteSpace();
					}
				}

				setState(3120);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3122);
					whiteSpace();
					}
				}

				setState(3125);
				match(LPAREN);
				setState(3126);
				annotationArg();
				setState(3135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3128);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS || _la==LINE_CONTINUATION) {
							{
							setState(3127);
							whiteSpace();
							}
						}

						setState(3130);
						match(COMMA);
						setState(3132);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,503,_ctx) ) {
						case 1:
							{
							setState(3131);
							whiteSpace();
							}
							break;
						}
						setState(3134);
						annotationArg();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,504,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==LINE_CONTINUATION) {
					{
					setState(3139);
					whiteSpace();
					}
				}

				setState(3142);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationArgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterAnnotationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitAnnotationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitAnnotationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationArgContext annotationArg() throws RecognitionException {
		AnnotationArgContext _localctx = new AnnotationArgContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_annotationArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3146);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MandatoryLineContinuationContext extends ParserRuleContext {
		public TerminalNode LINE_CONTINUATION() { return getToken(VBAParser.LINE_CONTINUATION, 0); }
		public List<TerminalNode> WS() { return getTokens(VBAParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VBAParser.WS, i);
		}
		public MandatoryLineContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatoryLineContinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterMandatoryLineContinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitMandatoryLineContinuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitMandatoryLineContinuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MandatoryLineContinuationContext mandatoryLineContinuation() throws RecognitionException {
		MandatoryLineContinuationContext _localctx = new MandatoryLineContinuationContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_mandatoryLineContinuation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3148);
			match(LINE_CONTINUATION);
			setState(3152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,507,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3149);
					match(WS);
					}
					} 
				}
				setState(3154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,507,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhiteSpaceContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(VBAParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VBAParser.WS, i);
		}
		public List<TerminalNode> LINE_CONTINUATION() { return getTokens(VBAParser.LINE_CONTINUATION); }
		public TerminalNode LINE_CONTINUATION(int i) {
			return getToken(VBAParser.LINE_CONTINUATION, i);
		}
		public WhiteSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiteSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).enterWhiteSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VBAParserListener ) ((VBAParserListener)listener).exitWhiteSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VBAParserVisitor ) return ((VBAParserVisitor<? extends T>)visitor).visitWhiteSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiteSpaceContext whiteSpace() throws RecognitionException {
		WhiteSpaceContext _localctx = new WhiteSpaceContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_whiteSpace);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3156); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3155);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==LINE_CONTINUATION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3158); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,508,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return singleLetter_sempred((SingleLetterContext)_localctx, predIndex);
		case 84:
			return universalLetterRange_sempred((UniversalLetterRangeContext)_localctx, predIndex);
		case 167:
			return lineSpecialFormOption_sempred((LineSpecialFormOptionContext)_localctx, predIndex);
		case 171:
			return legalLabelIdentifier_sempred((LegalLabelIdentifierContext)_localctx, predIndex);
		case 183:
			return statementLabelDefinition_sempred((StatementLabelDefinitionContext)_localctx, predIndex);
		case 192:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 198:
			return lExpression_sempred((LExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleLetter_sempred(SingleLetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LT(1).getText().length() == 1 && Character.isLetter(_input.LT(1).getText().charAt(0));
		}
		return true;
	}
	private boolean universalLetterRange_sempred(UniversalLetterRangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _input.LT(1).getText() == "A" && _input.LT(3).getText() == "Z";
		}
		return true;
	}
	private boolean lineSpecialFormOption_sempred(LineSpecialFormOptionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _input.LT(1).getText().toLowerCase() == "b" || _input.LT(1).getText().toLowerCase() == "bf";
		}
		return true;
	}
	private boolean legalLabelIdentifier_sempred(LegalLabelIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return  _input.LA(1) != DOEVENTS && _input.LA(1) != END && _input.LA(1) != CLOSE && _input.LA(1) != ELSE && _input.LA(1) != LOOP && _input.LA(1) != NEXT && _input.LA(1) != RANDOMIZE && _input.LA(1) != REM && _input.LA(1) != RESUME && _input.LA(1) != RETURN && _input.LA(1) != STOP && _input.LA(1) != WEND;
		}
		return true;
	}
	private boolean statementLabelDefinition_sempred(StatementLabelDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _input.LA(-1) == NEWLINE || _input.LA(-1) == LINE_CONTINUATION;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 6);
		case 15:
			return precpred(_ctx, 5);
		case 16:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean lExpression_sempred(LExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 8);
		case 18:
			return precpred(_ctx, 7);
		case 19:
			return precpred(_ctx, 6);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0140\u0c5b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\3\2\3\2\3\2\3\3\5\3\u01cf\n\3\3\3\3\3"+
		"\5\3\u01d3\n\3\3\3\3\3\5\3\u01d7\n\3\3\3\5\3\u01da\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u01e2\n\3\3\4\3\4\3\4\3\4\5\4\u01e8\n\4\3\4\5\4\u01eb\n\4"+
		"\3\4\3\4\3\5\6\5\u01f0\n\5\r\5\16\5\u01f1\3\6\3\6\5\6\u01f6\n\6\3\6\3"+
		"\6\5\6\u01fa\n\6\3\6\3\6\5\6\u01fe\n\6\3\6\3\6\5\6\u0202\n\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7\u020b\n\7\3\7\3\7\3\7\5\7\u0210\n\7\5\7\u0212\n"+
		"\7\3\7\3\7\3\7\3\7\6\7\u0218\n\7\r\7\16\7\u0219\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0225\n\b\3\b\3\b\3\b\6\b\u022a\n\b\r\b\16\b\u022b"+
		"\3\b\3\b\3\b\3\t\3\t\5\t\u0233\n\t\3\t\5\t\u0236\n\t\3\t\3\t\5\t\u023a"+
		"\n\t\3\t\3\t\3\t\5\t\u023f\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0247\n\n\3"+
		"\n\5\n\u024a\n\n\5\n\u024c\n\n\3\n\3\n\3\n\5\n\u0251\n\n\3\13\5\13\u0254"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u025b\n\13\3\f\3\f\3\f\7\f\u0260\n"+
		"\f\f\f\16\f\u0263\13\f\3\r\3\r\3\r\3\r\5\r\u0269\n\r\3\r\3\r\5\r\u026d"+
		"\n\r\3\r\3\r\5\r\u0271\n\r\3\r\3\r\5\r\u0275\n\r\3\r\7\r\u0278\n\r\f\r"+
		"\16\r\u027b\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u0284\n\20\f"+
		"\20\16\20\u0287\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0293\n\21\3\22\5\22\u0296\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u02a2\n\22\3\23\5\23\u02a5\n\23\3\23\3\23\3\23"+
		"\7\23\u02aa\n\23\f\23\16\23\u02ad\13\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u02b4\n\24\3\25\3\25\3\25\7\25\u02b9\n\25\f\25\16\25\u02bc\13\25\3\26"+
		"\3\26\3\26\3\26\7\26\u02c2\n\26\f\26\16\26\u02c5\13\26\3\27\3\27\5\27"+
		"\u02c9\n\27\3\27\5\27\u02cc\n\27\3\27\5\27\u02cf\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02f7\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0307\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u030f\n\32\3\32\3\32\3\32\5\32\u0314\n"+
		"\32\3\32\3\32\3\32\5\32\u0319\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0322\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\5!\u0336\n!\3!\3!\5!\u033a\n!\3!\3!\3\"\3"+
		"\"\3#\3#\5#\u0342\n#\3$\3$\3$\3%\3%\3&\3&\3&\3&\5&\u034d\n&\3\'\3\'\3"+
		"(\3(\5(\u0353\n(\3(\3(\5(\u0357\n(\3(\7(\u035a\n(\f(\16(\u035d\13(\3)"+
		"\3)\3)\3)\5)\u0363\n)\3)\3)\5)\u0367\n)\3)\3)\3*\3*\3+\3+\3+\3+\5+\u0371"+
		"\n+\3+\3+\5+\u0375\n+\3+\5+\u0378\n+\3,\3,\3,\3,\5,\u037e\n,\3,\3,\3,"+
		"\3,\5,\u0384\n,\3-\3-\3.\3.\3/\3/\3/\3/\5/\u038e\n/\3/\3/\5/\u0392\n/"+
		"\3/\5/\u0395\n/\3\60\3\60\3\60\3\60\5\60\u039b\n\60\3\60\3\60\5\60\u039f"+
		"\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u03a9\n\62\3\62\3\62"+
		"\5\62\u03ad\n\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u03b7\n"+
		"\64\3\65\3\65\5\65\u03bb\n\65\3\65\3\65\5\65\u03bf\n\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\38\38\58\u03cb\n8\38\38\58\u03cf\n8\38\58\u03d2"+
		"\n8\39\39\59\u03d6\n9\39\79\u03d9\n9\f9\169\u03dc\139\3:\3:\3:\3:\5:\u03e2"+
		"\n:\3:\3:\5:\u03e6\n:\3;\3;\3;\5;\u03eb\n;\3<\3<\3=\3=\3>\3>\5>\u03f3"+
		"\n>\3>\3>\5>\u03f7\n>\3>\3>\5>\u03fb\n>\3>\3>\3?\3?\3@\3@\5@\u0403\n@"+
		"\3@\5@\u0406\n@\3A\3A\5A\u040a\nA\3A\3A\5A\u040e\nA\3A\3A\3B\3B\3C\3C"+
		"\3C\3C\5C\u0418\nC\3C\3C\5C\u041c\nC\3C\5C\u041f\nC\3D\3D\3D\3D\5D\u0425"+
		"\nD\3D\3D\5D\u0429\nD\3D\3D\3E\3E\5E\u042f\nE\3E\3E\5E\u0433\nE\3E\7E"+
		"\u0436\nE\fE\16E\u0439\13E\3F\3F\3G\3G\3G\3G\5G\u0441\nG\3G\3G\5G\u0445"+
		"\nG\3G\5G\u0448\nG\3G\5G\u044b\nG\3G\3G\5G\u044f\nG\3G\3G\3H\3H\3I\3I"+
		"\3J\3J\3J\3J\5J\u045b\nJ\3J\3J\5J\u045f\nJ\3J\5J\u0462\nJ\3J\5J\u0465"+
		"\nJ\3J\3J\5J\u0469\nJ\3J\3J\3K\3K\3L\3L\3L\5L\u0472\nL\3L\3L\3L\3L\5L"+
		"\u0478\nL\3L\3L\5L\u047c\nL\3L\7L\u047f\nL\fL\16L\u0482\13L\3M\3M\3M\3"+
		"M\5M\u0488\nM\3M\5M\u048b\nM\3M\3M\5M\u048f\nM\3M\3M\3N\3N\3N\5N\u0496"+
		"\nN\3N\3N\3N\3N\5N\u049c\nN\3N\3N\3N\3N\3N\3N\5N\u04a4\nN\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\5N\u04ae\nN\3N\5N\u04b1\nN\3N\5N\u04b4\nN\3N\3N\3N\5N\u04b9"+
		"\nN\3O\3O\5O\u04bd\nO\3O\3O\5O\u04c1\nO\3O\3O\5O\u04c5\nO\3O\7O\u04c8"+
		"\nO\fO\16O\u04cb\13O\5O\u04cd\nO\3O\5O\u04d0\nO\3O\3O\3P\3P\5P\u04d6\n"+
		"P\3P\3P\5P\u04da\nP\3P\3P\5P\u04de\nP\3P\3P\5P\u04e2\nP\3P\3P\5P\u04e6"+
		"\nP\3P\5P\u04e9\nP\3P\5P\u04ec\nP\3P\5P\u04ef\nP\3P\5P\u04f2\nP\3P\5P"+
		"\u04f5\nP\3Q\3Q\5Q\u04f9\nQ\3Q\3Q\3R\3R\3R\3R\5R\u0501\nR\3R\3R\5R\u0505"+
		"\nR\3R\7R\u0508\nR\fR\16R\u050b\13R\3S\3S\3T\3T\3T\5T\u0512\nT\3U\3U\3"+
		"U\3V\3V\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\5X\u0524\nX\3X\5X\u0527\nX\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0533\nX\3X\5X\u0536\nX\3X\3X\3X\3X\3"+
		"X\3X\5X\u053e\nX\3X\5X\u0541\nX\3X\3X\3X\3X\3X\3X\5X\u0549\nX\3Y\3Y\3"+
		"Y\5Y\u054e\nY\3Y\3Y\3Y\3Y\3Y\7Y\u0555\nY\fY\16Y\u0558\13Y\3Y\3Y\3Z\3Z"+
		"\5Z\u055e\nZ\3Z\3Z\5Z\u0562\nZ\3Z\5Z\u0565\nZ\3Z\3Z\3[\3[\3\\\3\\\3\\"+
		"\3\\\5\\\u056f\n\\\3\\\3\\\5\\\u0573\n\\\3\\\7\\\u0576\n\\\f\\\16\\\u0579"+
		"\13\\\3]\3]\3]\3]\3^\3^\3^\5^\u0582\n^\3^\3^\3^\3^\5^\u0588\n^\3^\3^\3"+
		"_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u059a\n`\3`\3`\5`\u059e\n"+
		"`\3`\5`\u05a1\n`\3`\3`\3`\3`\5`\u05a7\n`\3`\5`\u05aa\n`\3`\3`\5`\u05ae"+
		"\n`\3`\5`\u05b1\n`\3a\3a\3a\3a\3a\3a\3a\3a\5a\u05bb\na\3a\7a\u05be\na"+
		"\fa\16a\u05c1\13a\3a\3a\3a\5a\u05c6\na\3a\3a\5a\u05ca\na\3a\5a\u05cd\n"+
		"a\3a\3a\3a\3a\5a\u05d3\na\3a\5a\u05d6\na\3a\3a\5a\u05da\na\3a\5a\u05dd"+
		"\na\3b\3b\3b\3b\3b\3c\3c\3c\5c\u05e7\nc\3c\3c\5c\u05eb\nc\3c\3c\5c\u05ef"+
		"\nc\3c\3c\5c\u05f3\nc\3c\5c\u05f6\nc\3c\5c\u05f9\nc\3c\5c\u05fc\nc\3c"+
		"\3c\3c\5c\u0601\nc\3c\5c\u0604\nc\3c\3c\3c\3c\7c\u060a\nc\fc\16c\u060d"+
		"\13c\3d\3d\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0621\n"+
		"g\3g\5g\u0624\ng\3g\7g\u0627\ng\fg\16g\u062a\13g\3g\5g\u062d\ng\3g\5g"+
		"\u0630\ng\3g\5g\u0633\ng\3g\5g\u0636\ng\3g\5g\u0639\ng\3g\3g\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u064b\nh\3h\3h\5h\u064f\nh\3i\3i"+
		"\3i\3i\3j\3j\5j\u0657\nj\3k\3k\5k\u065b\nk\3k\3k\5k\u065f\nk\3k\3k\5k"+
		"\u0663\nk\3k\3k\3k\3k\5k\u0669\nk\3l\3l\5l\u066d\nl\3l\3l\5l\u0671\nl"+
		"\3l\3l\5l\u0675\nl\3l\5l\u0678\nl\3l\3l\3m\3m\5m\u067e\nm\3m\5m\u0681"+
		"\nm\3n\3n\5n\u0685\nn\3n\3n\5n\u0689\nn\3n\5n\u068c\nn\7n\u068e\nn\fn"+
		"\16n\u0691\13n\3n\3n\5n\u0695\nn\5n\u0697\nn\3n\3n\5n\u069b\nn\3n\3n\5"+
		"n\u069f\nn\3n\5n\u06a2\nn\7n\u06a4\nn\fn\16n\u06a7\13n\5n\u06a9\nn\3o"+
		"\3o\3p\3p\3q\3q\3q\3q\3r\3r\5r\u06b5\nr\3r\3r\5r\u06b9\nr\3r\3r\5r\u06bd"+
		"\nr\3r\3r\3s\3s\3s\3s\5s\u06c5\ns\3s\3s\5s\u06c9\ns\3s\3s\3t\3t\3t\3t"+
		"\3t\3t\3t\3t\3t\3t\5t\u06d7\nt\3u\3u\3u\3u\3u\3u\3u\3u\5u\u06e1\nu\3u"+
		"\3u\5u\u06e5\nu\3u\7u\u06e8\nu\fu\16u\u06eb\13u\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\5v\u06f5\nv\3v\3v\5v\u06f9\nv\3v\7v\u06fc\nv\fv\16v\u06ff\13v\3w\3w"+
		"\3w\5w\u0704\nw\3w\3w\5w\u0708\nw\3w\3w\3w\3w\5w\u070e\nw\3w\5w\u0711"+
		"\nw\3w\3w\3w\5w\u0716\nw\3w\3w\3w\5w\u071b\nw\3w\5w\u071e\nw\3w\3w\3w"+
		"\3w\7w\u0724\nw\fw\16w\u0727\13w\3x\3x\3x\5x\u072c\nx\3x\3x\5x\u0730\n"+
		"x\3x\3x\3x\3x\5x\u0736\nx\3x\5x\u0739\nx\3x\3x\3x\5x\u073e\nx\3x\5x\u0741"+
		"\nx\3x\3x\3x\3x\7x\u0747\nx\fx\16x\u074a\13x\3y\3y\3y\5y\u074f\ny\3y\3"+
		"y\5y\u0753\ny\3y\3y\3y\3y\5y\u0759\ny\3y\5y\u075c\ny\3y\3y\3y\5y\u0761"+
		"\ny\3y\5y\u0764\ny\3y\3y\3y\3y\7y\u076a\ny\fy\16y\u076d\13y\3z\3z\3z\3"+
		"z\5z\u0773\nz\3z\3z\5z\u0777\nz\3z\5z\u077a\nz\3z\5z\u077d\nz\3z\5z\u0780"+
		"\nz\3{\3{\5{\u0784\n{\3{\3{\5{\u0788\n{\3{\7{\u078b\n{\f{\16{\u078e\13"+
		"{\3|\3|\5|\u0792\n|\3|\3|\3}\3}\3}\3}\5}\u079a\n}\3}\3}\3~\3~\5~\u07a0"+
		"\n~\3~\3~\5~\u07a4\n~\3~\7~\u07a7\n~\f~\16~\u07aa\13~\3\177\3\177\3\177"+
		"\3\177\5\177\u07b0\n\177\3\u0080\3\u0080\3\u0080\5\u0080\u07b5\n\u0080"+
		"\3\u0080\3\u0080\5\u0080\u07b9\n\u0080\3\u0080\3\u0080\5\u0080\u07bd\n"+
		"\u0080\3\u0080\3\u0080\5\u0080\u07c1\n\u0080\3\u0080\3\u0080\5\u0080\u07c5"+
		"\n\u0080\3\u0080\3\u0080\5\u0080\u07c9\n\u0080\5\u0080\u07cb\n\u0080\3"+
		"\u0080\3\u0080\5\u0080\u07cf\n\u0080\3\u0080\3\u0080\5\u0080\u07d3\n\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u07d9\n\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u07e5\n\u0083\5\u0083\u07e7\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5"+
		"\u0084\u07ed\n\u0084\5\u0084\u07ef\n\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u07f7\n\u0086\3\u0086\3\u0086\5\u0086\u07fb\n"+
		"\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\5\u0089\u080b\n\u0089"+
		"\3\u0089\3\u0089\5\u0089\u080f\n\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u0814\n\u0089\3\u0089\5\u0089\u0817\n\u0089\3\u0089\7\u0089\u081a\n\u0089"+
		"\f\u0089\16\u0089\u081d\13\u0089\3\u0089\5\u0089\u0820\n\u0089\3\u0089"+
		"\5\u0089\u0823\n\u0089\3\u0089\5\u0089\u0826\n\u0089\3\u0089\5\u0089\u0829"+
		"\n\u0089\3\u0089\5\u0089\u082c\n\u0089\3\u0089\3\u0089\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0836\n\u008b\3\u008b\3\u008b"+
		"\5\u008b\u083a\n\u008b\3\u008b\7\u008b\u083d\n\u008b\f\u008b\16\u008b"+
		"\u0840\13\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u0847"+
		"\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\5\u008d\u084f"+
		"\n\u008d\5\u008d\u0851\n\u008d\3\u008d\3\u008d\5\u008d\u0855\n\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u0860\n\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u086a\n\u0090\3\u0090\3\u0090\5\u0090\u086e\n"+
		"\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u0875\n\u0091\3"+
		"\u0091\3\u0091\5\u0091\u0879\n\u0091\3\u0091\3\u0091\5\u0091\u087d\n\u0091"+
		"\3\u0091\3\u0091\5\u0091\u0881\n\u0091\3\u0091\5\u0091\u0884\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\5\u0091\u0889\n\u0091\3\u0091\5\u0091\u088c\n\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u0892\n\u0091\f\u0091\16\u0091"+
		"\u0895\13\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\5\u0093\u089c"+
		"\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\6\u0094\u08a8\n\u0094\r\u0094\16\u0094\u08a9\3\u0095"+
		"\3\u0095\5\u0095\u08ae\n\u0095\3\u0096\3\u0096\5\u0096\u08b2\n\u0096\3"+
		"\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\5\u0098\u08bd\n\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u08c3\n"+
		"\u0099\3\u0099\5\u0099\u08c6\n\u0099\3\u0099\5\u0099\u08c9\n\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\5\u009a\u08cf\n\u009a\3\u009a\3\u009a\5\u009a"+
		"\u08d3\n\u009a\3\u009a\7\u009a\u08d6\n\u009a\f\u009a\16\u009a\u08d9\13"+
		"\u009a\3\u009b\3\u009b\5\u009b\u08dd\n\u009b\5\u009b\u08df\n\u009b\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\5\u009c\u08e5\n\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\5\u009f\u08f0\n\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u08f5\n\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\5\u00a0\u08fb\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u08ff\n\u00a0\3"+
		"\u00a0\7\u00a0\u0902\n\u00a0\f\u00a0\16\u00a0\u0905\13\u00a0\3\u00a1\3"+
		"\u00a1\5\u00a1\u0909\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u090d\n\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u0911\n\u00a1\5\u00a1\u0913\n\u00a1\3\u00a1\5\u00a1\u0916"+
		"\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u091b\n\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0923\n\u00a2\3\u00a2\5\u00a2"+
		"\u0926\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0930\n\u00a3\3\u00a3\5\u00a3\u0933\n\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u093b\n\u00a4\5\u00a4\u093d"+
		"\n\u00a4\3\u00a4\5\u00a4\u0940\n\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0945\n\u00a4\5\u00a4\u0947\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u094b\n\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u094f\n\u00a4\3\u00a4\5\u00a4\u0952\n\u00a4\3"+
		"\u00a4\5\u00a4\u0955\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u0959\n\u00a4\3\u00a4"+
		"\5\u00a4\u095c\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u0960\n\u00a5\3\u00a5\3"+
		"\u00a5\5\u00a5\u0964\n\u00a5\5\u00a5\u0966\n\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u096c\n\u00a5\5\u00a5\u096e\n\u00a5\3\u00a5\3\u00a5\5"+
		"\u00a5\u0972\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u0976\n\u00a5\3\u00a5\6\u00a5"+
		"\u0979\n\u00a5\r\u00a5\16\u00a5\u097a\3\u00a6\3\u00a6\5\u00a6\u097f\n"+
		"\u00a6\3\u00a6\3\u00a6\5\u00a6\u0983\n\u00a6\5\u00a6\u0985\n\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u098b\n\u00a6\3\u00a6\3\u00a6\5\u00a6"+
		"\u098f\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\5\u00a7\u0995\n\u00a7\3"+
		"\u00a7\3\u00a7\5\u00a7\u0999\n\u00a7\5\u00a7\u099b\n\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\5\u00a7\u09a1\n\u00a7\3\u00a7\5\u00a7\u09a4\n\u00a7\3"+
		"\u00a7\3\u00a7\5\u00a7\u09a8\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u09ac\n\u00a7"+
		"\3\u00a7\5\u00a7\u09af\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u09b3\n\u00a8\3"+
		"\u00a8\3\u00a8\5\u00a8\u09b7\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u09bb\n\u00a8"+
		"\3\u00a8\3\u00a8\5\u00a8\u09bf\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u09c8\n\u00aa\3\u00aa\3\u00aa\5\u00aa"+
		"\u09cc\n\u00aa\3\u00aa\7\u00aa\u09cf\n\u00aa\f\u00aa\16\u00aa\u09d2\13"+
		"\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u09d9\n\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u09e0\n\u00ac\3\u00ad\3"+
		"\u00ad\3\u00ad\5\u00ad\u09e5\n\u00ad\3\u00ae\3\u00ae\5\u00ae\u09e9\n\u00ae"+
		"\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u09f3\n\u00b1\3\u00b2\3\u00b2\7\u00b2\u09f7\n\u00b2\f\u00b2\16\u00b2"+
		"\u09fa\13\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u0a00\n\u00b3"+
		"\3\u00b4\3\u00b4\5\u00b4\u0a04\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u0a08\n"+
		"\u00b4\3\u00b4\3\u00b4\5\u00b4\u0a0c\n\u00b4\3\u00b4\5\u00b4\u0a0f\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\5\u00b7\u0a1a\n\u00b7\3\u00b7\3\u00b7\5\u00b7\u0a1e\n\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\5\u00b7\u0a2c\n\u00b7\3\u00b8\3\u00b8\5\u00b8\u0a30\n"+
		"\u00b8\3\u00b8\3\u00b8\5\u00b8\u0a34\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3"+
		"\u00b9\5\u00b9\u0a3a\n\u00b9\3\u00ba\3\u00ba\5\u00ba\u0a3e\n\u00ba\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\5\u00bb\u0a44\n\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u0a49\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd"+
		"\3\u00be\3\u00be\3\u00bf\3\u00bf\5\u00bf\u0a55\n\u00bf\3\u00bf\5\u00bf"+
		"\u0a58\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0a5c\n\u00bf\3\u00bf\5\u00bf\u0a5f"+
		"\n\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\5\u00c2\u0a67"+
		"\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a6b\n\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u0a6f\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a7f"+
		"\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a84\n\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\5\u00c2\u0a8a\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a8e\n"+
		"\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a92\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5"+
		"\u00c2\u0a97\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a9b\n\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\5\u00c2\u0aa0\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0aa4\n\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\5\u00c2\u0aa9\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0aad"+
		"\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ab2\n\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u0ab6\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0abb\n\u00c2\3"+
		"\u00c2\3\u00c2\5\u00c2\u0abf\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ac4"+
		"\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ac8\n\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u0acd\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ad1\n\u00c2\3\u00c2\3"+
		"\u00c2\3\u00c2\5\u00c2\u0ad6\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ada\n\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0adf\n\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u0ae3\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ae8\n\u00c2\3\u00c2\3"+
		"\u00c2\5\u00c2\u0aec\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0af1\n\u00c2"+
		"\3\u00c2\3\u00c2\5\u00c2\u0af5\n\u00c2\3\u00c2\7\u00c2\u0af8\n\u00c2\f"+
		"\u00c2\16\u00c2\u0afb\13\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u0b02\n\u00c3\5\u00c3\u0b04\n\u00c3\3\u00c4\3\u00c4\3\u00c4\5"+
		"\u00c4\u0b09\n\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b15\n\u00c8\3\u00c8\5\u00c8\u0b18"+
		"\n\u00c8\3\u00c8\5\u00c8\u0b1b\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u0b23\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u0b28\n\u00c8\3\u00c8\5\u00c8\u0b2b\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5"+
		"\u00c8\u0b30\n\u00c8\3\u00c8\5\u00c8\u0b33\n\u00c8\3\u00c8\5\u00c8\u0b36"+
		"\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b3b\n\u00c8\3\u00c8\3\u00c8"+
		"\5\u00c8\u0b3f\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b44\n\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u0b48\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5"+
		"\u00c8\u0b4e\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b52\n\u00c8\3\u00c8\5\u00c8"+
		"\u0b55\n\u00c8\3\u00c8\5\u00c8\u0b58\n\u00c8\3\u00c8\3\u00c8\7\u00c8\u0b5c"+
		"\n\u00c8\f\u00c8\16\u00c8\u0b5f\13\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0b64\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u0b68\n\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\5\u00c9\u0b6f\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u0b73"+
		"\n\u00c9\3\u00c9\5\u00c9\u0b76\n\u00c9\3\u00ca\5\u00ca\u0b79\n\u00ca\3"+
		"\u00ca\5\u00ca\u0b7c\n\u00ca\3\u00ca\5\u00ca\u0b7f\n\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u0b83\n\u00ca\3\u00ca\7\u00ca\u0b86\n\u00ca\f\u00ca\16\u00ca"+
		"\u0b89\13\u00ca\5\u00ca\u0b8b\n\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\5\u00cc\u0b92\n\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\5\u00ce"+
		"\u0b98\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b9c\n\u00ce\3\u00ce\3\u00ce\3"+
		"\u00cf\3\u00cf\3\u00d0\3\u00d0\5\u00d0\u0ba4\n\u00d0\3\u00d0\3\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0bae\n\u00d0\3"+
		"\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4"+
		"\3\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d8\5\u00d8"+
		"\u0bc1\n\u00d8\3\u00d8\3\u00d8\5\u00d8\u0bc5\n\u00d8\3\u00d8\5\u00d8\u0bc8"+
		"\n\u00d8\3\u00d8\5\u00d8\u0bcb\n\u00d8\3\u00d9\6\u00d9\u0bce\n\u00d9\r"+
		"\u00d9\16\u00d9\u0bcf\3\u00d9\5\u00d9\u0bd3\n\u00d9\3\u00d9\5\u00d9\u0bd6"+
		"\n\u00d9\3\u00da\3\u00da\5\u00da\u0bda\n\u00da\3\u00da\5\u00da\u0bdd\n"+
		"\u00da\3\u00da\3\u00da\5\u00da\u0be1\n\u00da\5\u00da\u0be3\n\u00da\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0be8\n\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc"+
		"\5\u00dc\u0bee\n\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00de"+
		"\7\u00de\u0bf6\n\u00de\f\u00de\16\u00de\u0bf9\13\u00de\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\5\u00df\u0bff\n\u00df\6\u00df\u0c01\n\u00df\r\u00df\16"+
		"\u00df\u0c02\3\u00df\3\u00df\5\u00df\u0c07\n\u00df\3\u00e0\3\u00e0\5\u00e0"+
		"\u0c0b\n\u00e0\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\5\u00e2\u0c15\n\u00e2\3\u00e2\3\u00e2\5\u00e2\u0c19\n\u00e2\3"+
		"\u00e2\6\u00e2\u0c1c\n\u00e2\r\u00e2\16\u00e2\u0c1d\3\u00e2\5\u00e2\u0c21"+
		"\n\u00e2\3\u00e2\3\u00e2\5\u00e2\u0c25\n\u00e2\3\u00e2\3\u00e2\5\u00e2"+
		"\u0c29\n\u00e2\3\u00e2\3\u00e2\5\u00e2\u0c2d\n\u00e2\3\u00e2\3\u00e2\5"+
		"\u00e2\u0c31\n\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0c36\n\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\5\u00e2\u0c3b\n\u00e2\3\u00e2\3\u00e2\5\u00e2\u0c3f\n"+
		"\u00e2\3\u00e2\6\u00e2\u0c42\n\u00e2\r\u00e2\16\u00e2\u0c43\3\u00e2\5"+
		"\u00e2\u0c47\n\u00e2\3\u00e2\3\u00e2\5\u00e2\u0c4b\n\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e4\3\u00e4\7\u00e4\u0c51\n\u00e4\f\u00e4\16\u00e4\u0c54\13\u00e4"+
		"\3\u00e5\6\u00e5\u0c57\n\u00e5\r\u00e5\16\u00e5\u0c58\3\u00e5\3\u0b8a"+
		"\4\u0182\u018e\u00e6\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6"+
		"\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be"+
		"\u01c0\u01c2\u01c4\u01c6\u01c8\2\36\5\2\65\65@@\u00b9\u00b9\7\2\61\61"+
		"\65\65ww\u0098\u0098\u00a3\u00a3\4\2\u00a5\u00a6\u00c8\u00c8\4\2\u0081"+
		"\u0083\u00b0\u00b0\4\2\"\"$$\4\2nn\u00b7\u00b7\3\2\678\3\2CO\4\2\u00c0"+
		"\u00c0\u00c4\u00c4\3\2fj\3\2\u008f\u0090\4\2\35\35\u00d4\u00d4\3\2\u012e"+
		"\u012f\16\2\3\3\22\22\33\34\66\6699AARRyy{{\u00b1\u00b1\u00b6\u00b6\u00c1"+
		"\u00c1\7\2xx\177\177\u0122\u0125\u0127\u0127\u012a\u012a\3\2\u0133\u0136"+
		"\5\2%%\'+\u012c\u012c\6\2llpp\u009c\u009c\u00a1\u00a1\4\2\u0120\u0120"+
		"\u0129\u0129\4\2\u0128\u0128\u012b\u012b\4\2kk\u00bc\u00bc\4\2VV\u008c"+
		"\u008c&\2\3\13\r\26\30\35\37\37!!,\61\639=>@ARRZZ``bbddkkoottv{~\u0083"+
		"\u0085\u0087\u0089\u008d\u008f\u008f\u0091\u0092\u0097\u009b\u00a0\u00a0"+
		"\u00a2\u00a3\u00a5\u00a6\u00a8\u00a9\u00ad\u00ad\u00b0\u00b2\u00b4\u00b4"+
		"\u00b6\u00b6\u00b8\u00bc\u00be\u00c2\u00c5\u00c5\u00c7\u00c9 \2\27\27"+
		"\36\36:;??BQTU\\\\__aaccejlnpsuu|}\u0084\u0084\u0088\u0088\u008e\u008e"+
		"\u009c\u009c\u00a1\u00a1\u00a4\u00a4\u00a7\u00a7\u00aa\u00ac\u00ae\u00af"+
		"\u00b3\u00b3\u00b5\u00b5\u00b7\u00b7\u00bd\u00bd\u00c3\u00c4\u00c6\u00c6"+
		"\3\2\u00ca\u011e\3\3\u0138\u0138\3\2\u0138\u0138\4\2\u013b\u013b\u013e"+
		"\u013e\2\u0de2\2\u01ca\3\2\2\2\4\u01ce\3\2\2\2\6\u01e3\3\2\2\2\b\u01ef"+
		"\3\2\2\2\n\u01f3\3\2\2\2\f\u0206\3\2\2\2\16\u021e\3\2\2\2\20\u0232\3\2"+
		"\2\2\22\u0250\3\2\2\2\24\u0253\3\2\2\2\26\u0261\3\2\2\2\30\u0264\3\2\2"+
		"\2\32\u027c\3\2\2\2\34\u027e\3\2\2\2\36\u0285\3\2\2\2 \u0292\3\2\2\2\""+
		"\u0295\3\2\2\2$\u02a4\3\2\2\2&\u02b3\3\2\2\2(\u02ba\3\2\2\2*\u02bd\3\2"+
		"\2\2,\u02ce\3\2\2\2.\u02f6\3\2\2\2\60\u0306\3\2\2\2\62\u0308\3\2\2\2\64"+
		"\u0323\3\2\2\2\66\u0325\3\2\2\28\u0329\3\2\2\2:\u032b\3\2\2\2<\u032f\3"+
		"\2\2\2>\u0331\3\2\2\2@\u0333\3\2\2\2B\u033d\3\2\2\2D\u0341\3\2\2\2F\u0343"+
		"\3\2\2\2H\u0346\3\2\2\2J\u0348\3\2\2\2L\u034e\3\2\2\2N\u0350\3\2\2\2P"+
		"\u035e\3\2\2\2R\u036a\3\2\2\2T\u036c\3\2\2\2V\u0383\3\2\2\2X\u0385\3\2"+
		"\2\2Z\u0387\3\2\2\2\\\u0389\3\2\2\2^\u0396\3\2\2\2`\u03a2\3\2\2\2b\u03a4"+
		"\3\2\2\2d\u03b0\3\2\2\2f\u03b2\3\2\2\2h\u03b8\3\2\2\2j\u03c2\3\2\2\2l"+
		"\u03c4\3\2\2\2n\u03c6\3\2\2\2p\u03d3\3\2\2\2r\u03e5\3\2\2\2t\u03ea\3\2"+
		"\2\2v\u03ec\3\2\2\2x\u03ee\3\2\2\2z\u03f0\3\2\2\2|\u03fe\3\2\2\2~\u0400"+
		"\3\2\2\2\u0080\u0407\3\2\2\2\u0082\u0411\3\2\2\2\u0084\u0413\3\2\2\2\u0086"+
		"\u0420\3\2\2\2\u0088\u042c\3\2\2\2\u008a\u043a\3\2\2\2\u008c\u043c\3\2"+
		"\2\2\u008e\u0452\3\2\2\2\u0090\u0454\3\2\2\2\u0092\u0456\3\2\2\2\u0094"+
		"\u046c\3\2\2\2\u0096\u0471\3\2\2\2\u0098\u0483\3\2\2\2\u009a\u0495\3\2"+
		"\2\2\u009c\u04ba\3\2\2\2\u009e\u04d5\3\2\2\2\u00a0\u04f6\3\2\2\2\u00a2"+
		"\u04fc\3\2\2\2\u00a4\u050c\3\2\2\2\u00a6\u0511\3\2\2\2\u00a8\u0513\3\2"+
		"\2\2\u00aa\u0516\3\2\2\2\u00ac\u051b\3\2\2\2\u00ae\u0548\3\2\2\2\u00b0"+
		"\u054d\3\2\2\2\u00b2\u055b\3\2\2\2\u00b4\u0568\3\2\2\2\u00b6\u056a\3\2"+
		"\2\2\u00b8\u057a\3\2\2\2\u00ba\u0581\3\2\2\2\u00bc\u058b\3\2\2\2\u00be"+
		"\u058d\3\2\2\2\u00c0\u05b2\3\2\2\2\u00c2\u05de\3\2\2\2\u00c4\u05e6\3\2"+
		"\2\2\u00c6\u060e\3\2\2\2\u00c8\u0610\3\2\2\2\u00ca\u0614\3\2\2\2\u00cc"+
		"\u0618\3\2\2\2\u00ce\u064e\3\2\2\2\u00d0\u0650\3\2\2\2\u00d2\u0656\3\2"+
		"\2\2\u00d4\u0658\3\2\2\2\u00d6\u066a\3\2\2\2\u00d8\u067b\3\2\2\2\u00da"+
		"\u06a8\3\2\2\2\u00dc\u06aa\3\2\2\2\u00de\u06ac\3\2\2\2\u00e0\u06ae\3\2"+
		"\2\2\u00e2\u06b4\3\2\2\2\u00e4\u06c0\3\2\2\2\u00e6\u06cc\3\2\2\2\u00e8"+
		"\u06d8\3\2\2\2\u00ea\u06ec\3\2\2\2\u00ec\u0703\3\2\2\2\u00ee\u072b\3\2"+
		"\2\2\u00f0\u074e\3\2\2\2\u00f2\u076e\3\2\2\2\u00f4\u0781\3\2\2\2\u00f6"+
		"\u0791\3\2\2\2\u00f8\u0795\3\2\2\2\u00fa\u079d\3\2\2\2\u00fc\u07ab\3\2"+
		"\2\2\u00fe\u07b1\3\2\2\2\u0100\u07d6\3\2\2\2\u0102\u07da\3\2\2\2\u0104"+
		"\u07e6\3\2\2\2\u0106\u07e8\3\2\2\2\u0108\u07f0\3\2\2\2\u010a\u07f2\3\2"+
		"\2\2\u010c\u07fe\3\2\2\2\u010e\u0800\3\2\2\2\u0110\u0808\3\2\2\2\u0112"+
		"\u082f\3\2\2\2\u0114\u0831\3\2\2\2\u0116\u0844\3\2\2\2\u0118\u085f\3\2"+
		"\2\2\u011a\u0861\3\2\2\2\u011c\u0863\3\2\2\2\u011e\u0865\3\2\2\2\u0120"+
		"\u0874\3\2\2\2\u0122\u0896\3\2\2\2\u0124\u089b\3\2\2\2\u0126\u08a7\3\2"+
		"\2\2\u0128\u08ad\3\2\2\2\u012a\u08af\3\2\2\2\u012c\u08b5\3\2\2\2\u012e"+
		"\u08bc\3\2\2\2\u0130\u08c0\3\2\2\2\u0132\u08cc\3\2\2\2\u0134\u08de\3\2"+
		"\2\2\u0136\u08e2\3\2\2\2\u0138\u08e8\3\2\2\2\u013a\u08ea\3\2\2\2\u013c"+
		"\u08ef\3\2\2\2\u013e\u08f8\3\2\2\2\u0140\u0906\3\2\2\2\u0142\u091c\3\2"+
		"\2\2\u0144\u0929\3\2\2\2\u0146\u0936\3\2\2\2\u0148\u0965\3\2\2\2\u014a"+
		"\u0984\3\2\2\2\u014c\u099a\3\2\2\2\u014e\u09b0\3\2\2\2\u0150\u09c2\3\2"+
		"\2\2\u0152\u09c5\3\2\2\2\u0154\u09d8\3\2\2\2\u0156\u09df\3\2\2\2\u0158"+
		"\u09e4\3\2\2\2\u015a\u09e8\3\2\2\2\u015c\u09ea\3\2\2\2\u015e\u09ec\3\2"+
		"\2\2\u0160\u09f2\3\2\2\2\u0162\u09f4\3\2\2\2\u0164\u09ff\3\2\2\2\u0166"+
		"\u0a01\3\2\2\2\u0168\u0a10\3\2\2\2\u016a\u0a12\3\2\2\2\u016c\u0a2b\3\2"+
		"\2\2\u016e\u0a2d\3\2\2\2\u0170\u0a35\3\2\2\2\u0172\u0a3b\3\2\2\2\u0174"+
		"\u0a48\3\2\2\2\u0176\u0a4a\3\2\2\2\u0178\u0a4e\3\2\2\2\u017a\u0a50\3\2"+
		"\2\2\u017c\u0a54\3\2\2\2\u017e\u0a60\3\2\2\2\u0180\u0a62\3\2\2\2\u0182"+
		"\u0a89\3\2\2\2\u0184\u0b03\3\2\2\2\u0186\u0b08\3\2\2\2\u0188\u0b0a\3\2"+
		"\2\2\u018a\u0b0c\3\2\2\2\u018c\u0b0e\3\2\2\2\u018e\u0b2a\3\2\2\2\u0190"+
		"\u0b75\3\2\2\2\u0192\u0b78\3\2\2\2\u0194\u0b8c\3\2\2\2\u0196\u0b91\3\2"+
		"\2\2\u0198\u0b93\3\2\2\2\u019a\u0b95\3\2\2\2\u019c\u0b9f\3\2\2\2\u019e"+
		"\u0bad\3\2\2\2\u01a0\u0baf\3\2\2\2\u01a2\u0bb1\3\2\2\2\u01a4\u0bb3\3\2"+
		"\2\2\u01a6\u0bb7\3\2\2\2\u01a8\u0bb9\3\2\2\2\u01aa\u0bbb\3\2\2\2\u01ac"+
		"\u0bbd\3\2\2\2\u01ae\u0bca\3\2\2\2\u01b0\u0bd5\3\2\2\2\u01b2\u0be2\3\2"+
		"\2\2\u01b4\u0be7\3\2\2\2\u01b6\u0beb\3\2\2\2\u01b8\u0bf1\3\2\2\2\u01ba"+
		"\u0bf7\3\2\2\2\u01bc\u0bfa\3\2\2\2\u01be\u0c08\3\2\2\2\u01c0\u0c0c\3\2"+
		"\2\2\u01c2\u0c4a\3\2\2\2\u01c4\u0c4c\3\2\2\2\u01c6\u0c4e\3\2\2\2\u01c8"+
		"\u0c56\3\2\2\2\u01ca\u01cb\5\4\3\2\u01cb\u01cc\7\2\2\3\u01cc\3\3\2\2\2"+
		"\u01cd\u01cf\5\u01b0\u00d9\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d2\5\26\f\2\u01d1\u01d3\5\6\4\2\u01d2\u01d1\3"+
		"\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\5\26\f\2\u01d5"+
		"\u01d7\5\b\5\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01da\5\f\7\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\5\26\f\2\u01dc\u01dd\5\36\20\2\u01dd\u01de"+
		"\5\26\f\2\u01de\u01df\5$\23\2\u01df\u01e1\5\26\f\2\u01e0\u01e2\5\u01c8"+
		"\u00e5\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\5\3\2\2\2\u01e3"+
		"\u01e4\7\u00c2\2\2\u01e4\u01e5\5\u01c8\u00e5\2\u01e5\u01e7\5\u017a\u00be"+
		"\2\u01e6\u01e8\5\u01c8\u00e5\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2"+
		"\u01e8\u01ea\3\2\2\2\u01e9\u01eb\7=\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\5\u01b0\u00d9\2\u01ed\7\3\2\2"+
		"\2\u01ee\u01f0\5\n\6\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\t\3\2\2\2\u01f3\u01f5\7\u008d\2\2\u01f4"+
		"\u01f6\5\u01c8\u00e5\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f9\7\u0122\2\2\u01f8\u01fa\5\u01c8\u00e5\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\7\u0132\2"+
		"\2\u01fc\u01fe\5\u01c8\u00e5\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2"+
		"\u01fe\u01ff\3\2\2\2\u01ff\u0201\7$\2\2\u0200\u0202\5\u01c8\u00e5\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\u0132"+
		"\2\2\u0204\u0205\5\u01b0\u00d9\2\u0205\13\3\2\2\2\u0206\u0211\7\64\2\2"+
		"\u0207\u020a\5\u01c8\u00e5\2\u0208\u020b\7\u013c\2\2\u0209\u020b\5\u0182"+
		"\u00c2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\5\u01c8\u00e5\2\u020d\u020f\5\u0156\u00ac\2\u020e\u0210\5\u01c8"+
		"\u00e5\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u0207\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0217\5\u01b0"+
		"\u00d9\2\u0214\u0218\5\f\7\2\u0215\u0218\5\16\b\2\u0216\u0218\5\20\t\2"+
		"\u0217\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\7`\2\2\u021c\u021d\5\u01b0\u00d9\2\u021d\r\3\2\2\2\u021e\u021f"+
		"\7\63\2\2\u021f\u0220\5\u01c8\u00e5\2\u0220\u0224\5\u0156\u00ac\2\u0221"+
		"\u0222\5\u01c8\u00e5\2\u0222\u0223\7\u013c\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u0221\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0229\5\u01b0"+
		"\u00d9\2\u0227\u022a\5\16\b\2\u0228\u022a\5\20\t\2\u0229\u0227\3\2\2\2"+
		"\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7Z\2\2\u022e\u022f\5\u01b0\u00d9"+
		"\2\u022f\17\3\2\2\2\u0230\u0233\5\u0156\u00ac\2\u0231\u0233\5\u018e\u00c8"+
		"\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236"+
		"\5\u01c8\u00e5\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3"+
		"\2\2\2\u0237\u0239\7\u0122\2\2\u0238\u023a\5\u01c8\u00e5\2\u0239\u0238"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023e\3\2\2\2\u023b\u023f\5\22\n\2"+
		"\u023c\u023f\5\24\13\2\u023d\u023f\5\u0182\u00c2\2\u023e\u023b\3\2\2\2"+
		"\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241"+
		"\5\u01b0\u00d9\2\u0241\21\3\2\2\2\u0242\u0243\7\u012c\2\2\u0243\u0251"+
		"\5\u00a8U\2\u0244\u024c\7)\2\2\u0245\u0247\7\u012b\2\2\u0246\u0245\3\2"+
		"\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u024a\7\u012c\2\2\u0249"+
		"\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0244\3\2"+
		"\2\2\u024b\u0246\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7\u0130\2\2\u024e"+
		"\u024f\7\u013d\2\2\u024f\u0251\7\u0131\2\2\u0250\u0242\3\2\2\2\u0250\u024b"+
		"\3\2\2\2\u0251\23\3\2\2\2\u0252\u0254\7*\2\2\u0253\u0252\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\5\u0182\u00c2\2\u0256\u025a"+
		"\7#\2\2\u0257\u025b\5\u017a\u00be\2\u0258\u025b\7\u013f\2\2\u0259\u025b"+
		"\5\u0156\u00ac\2\u025a\u0257\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u0259\3"+
		"\2\2\2\u025b\25\3\2\2\2\u025c\u025d\5\30\r\2\u025d\u025e\5\u01b0\u00d9"+
		"\2\u025e\u0260\3\2\2\2\u025f\u025c\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\27\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0265\7\60\2\2\u0265\u0266\5\u01c8\u00e5\2\u0266\u0268\5\32\16\2\u0267"+
		"\u0269\5\u01c8\u00e5\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u026c\7\u0122\2\2\u026b\u026d\5\u01c8\u00e5\2\u026c\u026b"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0279\5\34\17\2"+
		"\u026f\u0271\5\u01c8\u00e5\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0274\7\"\2\2\u0273\u0275\5\u01c8\u00e5\2\u0274\u0273"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\5\34\17\2"+
		"\u0277\u0270\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\31\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\5\u018e\u00c8"+
		"\2\u027d\33\3\2\2\2\u027e\u027f\5\u0182\u00c2\2\u027f\35\3\2\2\2\u0280"+
		"\u0281\5\"\22\2\u0281\u0282\5\u01b0\u00d9\2\u0282\u0284\3\2\2\2\u0283"+
		"\u0280\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\37\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u0289\7\u0093\2\2\u0289"+
		"\u028a\5\u01c8\u00e5\2\u028a\u028b\5\u017a\u00be\2\u028b\u0293\3\2\2\2"+
		"\u028c\u028d\7\u0095\2\2\u028d\u028e\5\u01c8\u00e5\2\u028e\u028f\t\2\2"+
		"\2\u028f\u0293\3\2\2\2\u0290\u0293\7\u0094\2\2\u0291\u0293\7\u0096\2\2"+
		"\u0292\u0288\3\2\2\2\u0292\u028c\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0291"+
		"\3\2\2\2\u0293!\3\2\2\2\u0294\u0296\5\u01c8\u00e5\2\u0295\u0294\3\2\2"+
		"\2\u0295\u0296\3\2\2\2\u0296\u02a1\3\2\2\2\u0297\u02a2\5\30\r\2\u0298"+
		"\u02a2\5\u009aN\2\u0299\u02a2\5\u00a2R\2\u029a\u02a2\5\u00b0Y\2\u029b"+
		"\u02a2\5\u00ba^\2\u029c\u02a2\5\u0096L\2\u029d\u02a2\5\u00e0q\2\u029e"+
		"\u02a2\5\u013c\u009f\2\u029f\u02a2\5 \21\2\u02a0\u02a2\5\u0124\u0093\2"+
		"\u02a1\u0297\3\2\2\2\u02a1\u0298\3\2\2\2\u02a1\u0299\3\2\2\2\u02a1\u029a"+
		"\3\2\2\2\u02a1\u029b\3\2\2\2\u02a1\u029c\3\2\2\2\u02a1\u029d\3\2\2\2\u02a1"+
		"\u029e\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2#\3\2\2\2"+
		"\u02a3\u02a5\5\u01c8\u00e5\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02ab\3\2\2\2\u02a6\u02a7\5&\24\2\u02a7\u02a8\5\u01b0\u00d9\2\u02a8\u02aa"+
		"\3\2\2\2\u02a9\u02a6\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac%\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b4\5\u00c4"+
		"c\2\u02af\u02b4\5\u00ecw\2\u02b0\u02b4\5\u00eex\2\u02b1\u02b4\5\u00f0"+
		"y\2\u02b2\u02b4\5\u0120\u0091\2\u02b3\u02ae\3\2\2\2\u02b3\u02af\3\2\2"+
		"\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\'"+
		"\3\2\2\2\u02b5\u02b6\5,\27\2\u02b6\u02b7\5\u01b0\u00d9\2\u02b7\u02b9\3"+
		"\2\2\2\u02b8\u02b5\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb)\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02c3\5,\27\2"+
		"\u02be\u02bf\5\u01b0\u00d9\2\u02bf\u02c0\5,\27\2\u02c0\u02c2\3\2\2\2\u02c1"+
		"\u02be\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2"+
		"\2\2\u02c4+\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c8\5\u0170\u00b9\2\u02c7"+
		"\u02c9\5\u01c8\u00e5\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb"+
		"\3\2\2\2\u02ca\u02cc\5.\30\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02cf\3\2\2\2\u02cd\u02cf\5.\30\2\u02ce\u02c6\3\2\2\2\u02ce\u02cd\3\2"+
		"\2\2\u02cf-\3\2\2\2\u02d0\u02f7\5\60\31\2\u02d1\u02f7\5\30\r\2\u02d2\u02f7"+
		"\5\u0096L\2\u02d3\u02f7\5\u00aeX\2\u02d4\u02f7\5\u00b4[\2\u02d5\u02f7"+
		"\5\u00b6\\\2\u02d6\u02f7\5\u00b8]\2\u02d7\u02f7\5\u00bc_\2\u02d8\u02f7"+
		"\5\u00be`\2\u02d9\u02f7\5\u00c0a\2\u02da\u02f7\5\u00c8e\2\u02db\u02f7"+
		"\5\u00caf\2\u02dc\u02f7\5\u00ccg\2\u02dd\u02f7\5\u00d2j\2\u02de\u02f7"+
		"\5\u00e0q\2\u02df\u02f7\5\u00fe\u0080\2\u02e0\u02f7\5\u00e2r\2\u02e1\u02f7"+
		"\5\u00e4s\2\u02e2\u02f7\5\u00e6t\2\u02e3\u02f7\5\u00e8u\2\u02e4\u02f7"+
		"\5\u00eav\2\u02e5\u02f7\5\u00f2z\2\u02e6\u02f7\5\u00f8}\2\u02e7\u02f7"+
		"\5\u0106\u0084\2\u02e8\u02f7\5\u0108\u0085\2\u02e9\u02f7\5\u010a\u0086"+
		"\2\u02ea\u02f7\5\u0110\u0089\2\u02eb\u02f7\5\u011e\u0090\2\u02ec\u02f7"+
		"\5\u010c\u0087\2\u02ed\u02f7\5\u013c\u009f\2\u02ee\u02f7\5\u0142\u00a2"+
		"\2\u02ef\u02f7\5\u0144\u00a3\2\u02f0\u02f7\5\u0146\u00a4\2\u02f1\u02f7"+
		"\5\u0148\u00a5\2\u02f2\u02f7\5\u014a\u00a6\2\u02f3\u02f7\5\u014c\u00a7"+
		"\2\u02f4\u02f7\5\u0104\u0083\2\u02f5\u02f7\5\u010e\u0088\2\u02f6\u02d0"+
		"\3\2\2\2\u02f6\u02d1\3\2\2\2\u02f6\u02d2\3\2\2\2\u02f6\u02d3\3\2\2\2\u02f6"+
		"\u02d4\3\2\2\2\u02f6\u02d5\3\2\2\2\u02f6\u02d6\3\2\2\2\u02f6\u02d7\3\2"+
		"\2\2\u02f6\u02d8\3\2\2\2\u02f6\u02d9\3\2\2\2\u02f6\u02da\3\2\2\2\u02f6"+
		"\u02db\3\2\2\2\u02f6\u02dc\3\2\2\2\u02f6\u02dd\3\2\2\2\u02f6\u02de\3\2"+
		"\2\2\u02f6\u02df\3\2\2\2\u02f6\u02e0\3\2\2\2\u02f6\u02e1\3\2\2\2\u02f6"+
		"\u02e2\3\2\2\2\u02f6\u02e3\3\2\2\2\u02f6\u02e4\3\2\2\2\u02f6\u02e5\3\2"+
		"\2\2\u02f6\u02e6\3\2\2\2\u02f6\u02e7\3\2\2\2\u02f6\u02e8\3\2\2\2\u02f6"+
		"\u02e9\3\2\2\2\u02f6\u02ea\3\2\2\2\u02f6\u02eb\3\2\2\2\u02f6\u02ec\3\2"+
		"\2\2\u02f6\u02ed\3\2\2\2\u02f6\u02ee\3\2\2\2\u02f6\u02ef\3\2\2\2\u02f6"+
		"\u02f0\3\2\2\2\u02f6\u02f1\3\2\2\2\u02f6\u02f2\3\2\2\2\u02f6\u02f3\3\2"+
		"\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7/\3\2\2\2\u02f8\u0307"+
		"\5\62\32\2\u02f9\u0307\5L\'\2\u02fa\u0307\5J&\2\u02fb\u0307\5P)\2\u02fc"+
		"\u0307\5T+\2\u02fd\u0307\5\\/\2\u02fe\u0307\5^\60\2\u02ff\u0307\5b\62"+
		"\2\u0300\u0307\5f\64\2\u0301\u0307\5n8\2\u0302\u0307\5\u0084C\2\u0303"+
		"\u0307\5\u0086D\2\u0304\u0307\5\u008cG\2\u0305\u0307\5\u0092J\2\u0306"+
		"\u02f8\3\2\2\2\u0306\u02f9\3\2\2\2\u0306\u02fa\3\2\2\2\u0306\u02fb\3\2"+
		"\2\2\u0306\u02fc\3\2\2\2\u0306\u02fd\3\2\2\2\u0306\u02fe\3\2\2\2\u0306"+
		"\u02ff\3\2\2\2\u0306\u0300\3\2\2\2\u0306\u0301\3\2\2\2\u0306\u0302\3\2"+
		"\2\2\u0306\u0303\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307"+
		"\61\3\2\2\2\u0308\u0309\7\u0091\2\2\u0309\u030a\5\u01c8\u00e5\2\u030a"+
		"\u030e\5\64\33\2\u030b\u030c\5\u01c8\u00e5\2\u030c\u030d\5\66\34\2\u030d"+
		"\u030f\3\2\2\2\u030e\u030b\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0313\3\2"+
		"\2\2\u0310\u0311\5\u01c8\u00e5\2\u0311\u0312\5:\36\2\u0312\u0314\3\2\2"+
		"\2\u0313\u0310\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0318\3\2\2\2\u0315\u0316"+
		"\5\u01c8\u00e5\2\u0316\u0317\5> \2\u0317\u0319\3\2\2\2\u0318\u0315\3\2"+
		"\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\5\u01c8\u00e5"+
		"\2\u031b\u031c\7\62\2\2\u031c\u031d\5\u01c8\u00e5\2\u031d\u0321\5D#\2"+
		"\u031e\u031f\5\u01c8\u00e5\2\u031f\u0320\5@!\2\u0320\u0322\3\2\2\2\u0321"+
		"\u031e\3\2\2\2\u0321\u0322\3\2\2\2\u0322\63\3\2\2\2\u0323\u0324\5\u0182"+
		"\u00c2\2\u0324\65\3\2\2\2\u0325\u0326\7m\2\2\u0326\u0327\5\u01c8\u00e5"+
		"\2\u0327\u0328\58\35\2\u0328\67\3\2\2\2\u0329\u032a\t\3\2\2\u032a9\3\2"+
		"\2\2\u032b\u032c\7,\2\2\u032c\u032d\5\u01c8\u00e5\2\u032d\u032e\5<\37"+
		"\2\u032e;\3\2\2\2\u032f\u0330\t\4\2\2\u0330=\3\2\2\2\u0331\u0332\t\5\2"+
		"\2\u0332?\3\2\2\2\u0333\u0335\7\u00d2\2\2\u0334\u0336\5\u01c8\u00e5\2"+
		"\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339"+
		"\7\u0122\2\2\u0338\u033a\5\u01c8\u00e5\2\u0339\u0338\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\5B\"\2\u033cA\3\2\2\2\u033d\u033e"+
		"\5\u0182\u00c2\2\u033eC\3\2\2\2\u033f\u0342\5F$\2\u0340\u0342\5H%\2\u0341"+
		"\u033f\3\2\2\2\u0341\u0340\3\2\2\2\u0342E\3\2\2\2\u0343\u0344\7\'\2\2"+
		"\u0344\u0345\5\u0182\u00c2\2\u0345G\3\2\2\2\u0346\u0347\5\u0182\u00c2"+
		"\2\u0347I\3\2\2\2\u0348\u034c\7>\2\2\u0349\u034a\5\u01c8\u00e5\2\u034a"+
		"\u034b\5N(\2\u034b\u034d\3\2\2\2\u034c\u0349\3\2\2\2\u034c\u034d\3\2\2"+
		"\2\u034dK\3\2\2\2\u034e\u034f\7\u00a9\2\2\u034fM\3\2\2\2\u0350\u035b\5"+
		"D#\2\u0351\u0353\5\u01c8\u00e5\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2"+
		"\2\u0353\u0354\3\2\2\2\u0354\u0356\7\"\2\2\u0355\u0357\5\u01c8\u00e5\2"+
		"\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035a"+
		"\5D#\2\u0359\u0352\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035cO\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u035f\7\u00ad"+
		"\2\2\u035f\u0360\5\u01c8\u00e5\2\u0360\u0362\5D#\2\u0361\u0363\5\u01c8"+
		"\u00e5\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0366\7\"\2\2\u0365\u0367\5\u01c8\u00e5\2\u0366\u0365\3\2\2\2\u0366\u0367"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\5R*\2\u0369Q\3\2\2\2\u036a\u036b"+
		"\5\u0182\u00c2\2\u036bS\3\2\2\2\u036c\u036d\7z\2\2\u036d\u036e\5\u01c8"+
		"\u00e5\2\u036e\u0377\5D#\2\u036f\u0371\5\u01c8\u00e5\2\u0370\u036f\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\7\"\2\2\u0373"+
		"\u0375\5\u01c8\u00e5\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0378\5V,\2\u0377\u0370\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"U\3\2\2\2\u0379\u0384\5X-\2\u037a\u037b\5X-\2\u037b\u037c\5\u01c8\u00e5"+
		"\2\u037c\u037e\3\2\2\2\u037d\u037a\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u0380\7\u00bb\2\2\u0380\u0381\5\u01c8\u00e5\2\u0381\u0382"+
		"\5Z.\2\u0382\u0384\3\2\2\2\u0383\u0379\3\2\2\2\u0383\u037d\3\2\2\2\u0384"+
		"W\3\2\2\2\u0385\u0386\5\u0182\u00c2\2\u0386Y\3\2\2\2\u0387\u0388\5\u0182"+
		"\u00c2\2\u0388[\3\2\2\2\u0389\u038a\7\u00bf\2\2\u038a\u038b\5\u01c8\u00e5"+
		"\2\u038b\u0394\5D#\2\u038c\u038e\5\u01c8\u00e5\2\u038d\u038c\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\7\"\2\2\u0390\u0392\5\u01c8"+
		"\u00e5\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u0395\5V,\2\u0394\u038d\3\2\2\2\u0394\u0395\3\2\2\2\u0395]\3\2\2\2\u0396"+
		"\u0397\7\u0080\2\2\u0397\u0398\5\u01c8\u00e5\2\u0398\u039a\5F$\2\u0399"+
		"\u039b\5\u01c8\u00e5\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c"+
		"\3\2\2\2\u039c\u039e\7\"\2\2\u039d\u039f\5\u01c8\u00e5\2\u039e\u039d\3"+
		"\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\5`\61\2\u03a1"+
		"_\3\2\2\2\u03a2\u03a3\5\u0182\u00c2\2\u03a3a\3\2\2\2\u03a4\u03a5\7\u00c5"+
		"\2\2\u03a5\u03a6\5\u01c8\u00e5\2\u03a6\u03a8\5F$\2\u03a7\u03a9\5\u01c8"+
		"\u00e5\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ac\7\"\2\2\u03ab\u03ad\5\u01c8\u00e5\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\5d\63\2\u03afc\3\2\2\2\u03b0"+
		"\u03b1\5\u0182\u00c2\2\u03b1e\3\2\2\2\u03b2\u03b6\5h\65\2\u03b3\u03b4"+
		"\5\u01c8\u00e5\2\u03b4\u03b5\5p9\2\u03b5\u03b7\3\2\2\2\u03b6\u03b3\3\2"+
		"\2\2\u03b6\u03b7\3\2\2\2\u03b7g\3\2\2\2\u03b8\u03ba\5j\66\2\u03b9\u03bb"+
		"\5\u01c8\u00e5\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3"+
		"\2\2\2\u03bc\u03be\7&\2\2\u03bd\u03bf\5\u01c8\u00e5\2\u03be\u03bd\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\5l\67\2\u03c1"+
		"i\3\2\2\2\u03c2\u03c3\7\25\2\2\u03c3k\3\2\2\2\u03c4\u03c5\7\u009b\2\2"+
		"\u03c5m\3\2\2\2\u03c6\u03c7\7\u009b\2\2\u03c7\u03c8\5\u01c8\u00e5\2\u03c8"+
		"\u03ca\5F$\2\u03c9\u03cb\5\u01c8\u00e5\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d1\7\"\2\2\u03cd\u03cf\5\u01c8\u00e5"+
		"\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2"+
		"\5p9\2\u03d1\u03ce\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2o\3\2\2\2\u03d3\u03da"+
		"\5r:\2\u03d4\u03d6\5\u01c8\u00e5\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2"+
		"\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\5r:\2\u03d8\u03d5\3\2\2\2\u03d9\u03dc"+
		"\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03dbq\3\2\2\2\u03dc"+
		"\u03da\3\2\2\2\u03dd\u03e6\5t;\2\u03de\u03e6\5v<\2\u03df\u03e1\5t;\2\u03e0"+
		"\u03e2\5\u01c8\u00e5\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3"+
		"\3\2\2\2\u03e3\u03e4\5v<\2\u03e4\u03e6\3\2\2\2\u03e5\u03dd\3\2\2\2\u03e5"+
		"\u03de\3\2\2\2\u03e5\u03df\3\2\2\2\u03e6s\3\2\2\2\u03e7\u03eb\5z>\2\u03e8"+
		"\u03eb\5~@\2\u03e9\u03eb\5x=\2\u03ea\u03e7\3\2\2\2\u03ea\u03e8\3\2\2\2"+
		"\u03ea\u03e9\3\2\2\2\u03ebu\3\2\2\2\u03ec\u03ed\t\6\2\2\u03edw\3\2\2\2"+
		"\u03ee\u03ef\5\u0182\u00c2\2\u03efy\3\2\2\2\u03f0\u03f2\7\u00b2\2\2\u03f1"+
		"\u03f3\5\u01c8\u00e5\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4"+
		"\3\2\2\2\u03f4\u03f6\7\u0126\2\2\u03f5\u03f7\5\u01c8\u00e5\2\u03f6\u03f5"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\5|?\2\u03f9"+
		"\u03fb\5\u01c8\u00e5\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc"+
		"\3\2\2\2\u03fc\u03fd\7\u012d\2\2\u03fd{\3\2\2\2\u03fe\u03ff\5\u0182\u00c2"+
		"\2\u03ff}\3\2\2\2\u0400\u0405\7\u00b8\2\2\u0401\u0403\5\u01c8\u00e5\2"+
		"\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406"+
		"\5\u0080A\2\u0405\u0402\3\2\2\2\u0405\u0406\3\2\2\2\u0406\177\3\2\2\2"+
		"\u0407\u0409\7\u0126\2\2\u0408\u040a\5\u01c8\u00e5\2\u0409\u0408\3\2\2"+
		"\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040d\5\u0082B\2\u040c"+
		"\u040e\5\u01c8\u00e5\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f"+
		"\3\2\2\2\u040f\u0410\7\u012d\2\2\u0410\u0081\3\2\2\2\u0411\u0412\5\u0182"+
		"\u00c2\2\u0412\u0083\3\2\2\2\u0413\u0414\7\u00c8\2\2\u0414\u0415\5\u01c8"+
		"\u00e5\2\u0415\u0417\5F$\2\u0416\u0418\5\u01c8\u00e5\2\u0417\u0416\3\2"+
		"\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041e\7\"\2\2\u041a"+
		"\u041c\5\u01c8\u00e5\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d"+
		"\3\2\2\2\u041d\u041f\5p9\2\u041e\u041b\3\2\2\2\u041e\u041f\3\2\2\2\u041f"+
		"\u0085\3\2\2\2\u0420\u0421\7w\2\2\u0421\u0422\5\u01c8\u00e5\2\u0422\u0424"+
		"\5F$\2\u0423\u0425\5\u01c8\u00e5\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0428\7\"\2\2\u0427\u0429\5\u01c8\u00e5"+
		"\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b"+
		"\5\u0088E\2\u042b\u0087\3\2\2\2\u042c\u0437\5\u008aF\2\u042d\u042f\5\u01c8"+
		"\u00e5\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0432\7\"\2\2\u0431\u0433\5\u01c8\u00e5\2\u0432\u0431\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436\5\u008aF\2\u0435\u042e\3\2\2"+
		"\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0089"+
		"\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u043b\5\u0182\u00c2\2\u043b\u008b\3"+
		"\2\2\2\u043c\u043d\7\u00a2\2\2\u043d\u043e\5\u01c8\u00e5\2\u043e\u0440"+
		"\5D#\2\u043f\u0441\5\u01c8\u00e5\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2"+
		"\2\2\u0441\u0442\3\2\2\2\u0442\u0444\7\"\2\2\u0443\u0445\5\u01c8\u00e5"+
		"\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0448"+
		"\5\u008eH\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2\2"+
		"\2\u0449\u044b\5\u01c8\u00e5\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2"+
		"\u044b\u044c\3\2\2\2\u044c\u044e\7\"\2\2\u044d\u044f\5\u01c8\u00e5\2\u044e"+
		"\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\5\u0090"+
		"I\2\u0451\u008d\3\2\2\2\u0452\u0453\5\u0182\u00c2\2\u0453\u008f\3\2\2"+
		"\2\u0454\u0455\5\u0182\u00c2\2\u0455\u0091\3\2\2\2\u0456\u0457\7o\2\2"+
		"\u0457\u0458\5\u01c8\u00e5\2\u0458\u045a\5D#\2\u0459\u045b\5\u01c8\u00e5"+
		"\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e"+
		"\7\"\2\2\u045d\u045f\5\u01c8\u00e5\2\u045e\u045d\3\2\2\2\u045e\u045f\3"+
		"\2\2\2\u045f\u0461\3\2\2\2\u0460\u0462\5\u008eH\2\u0461\u0460\3\2\2\2"+
		"\u0461\u0462\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0465\5\u01c8\u00e5\2\u0464"+
		"\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\7\""+
		"\2\2\u0467\u0469\5\u01c8\u00e5\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2"+
		"\2\u0469\u046a\3\2\2\2\u046a\u046b\5\u0094K\2\u046b\u0093\3\2\2\2\u046c"+
		"\u046d\5\u0182\u00c2\2\u046d\u0095\3\2\2\2\u046e\u046f\5\u0180\u00c1\2"+
		"\u046f\u0470\5\u01c8\u00e5\2\u0470\u0472\3\2\2\2\u0471\u046e\3\2\2\2\u0471"+
		"\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\7?\2\2\u0474\u0475\5\u01c8"+
		"\u00e5\2\u0475\u0480\5\u0098M\2\u0476\u0478\5\u01c8\u00e5\2\u0477\u0476"+
		"\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\7\"\2\2\u047a"+
		"\u047c\5\u01c8\u00e5\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d"+
		"\3\2\2\2\u047d\u047f\5\u0098M\2\u047e\u0477\3\2\2\2\u047f\u0482\3\2\2"+
		"\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0097\3\2\2\2\u0482\u0480"+
		"\3\2\2\2\u0483\u0487\5\u015a\u00ae\2\u0484\u0485\5\u01c8\u00e5\2\u0485"+
		"\u0486\5\u0166\u00b4\2\u0486\u0488\3\2\2\2\u0487\u0484\3\2\2\2\u0487\u0488"+
		"\3\2\2\2\u0488\u048a\3\2\2\2\u0489\u048b\5\u01c8\u00e5\2\u048a\u0489\3"+
		"\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\7\u0122\2\2"+
		"\u048d\u048f\5\u01c8\u00e5\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u0491\5\u0182\u00c2\2\u0491\u0099\3\2\2\2\u0492\u0493"+
		"\5\u0180\u00c1\2\u0493\u0494\5\u01c8\u00e5\2\u0494\u0496\3\2\2\2\u0495"+
		"\u0492\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\7B"+
		"\2\2\u0498\u049b\5\u01c8\u00e5\2\u0499\u049a\7\u00a0\2\2\u049a\u049c\5"+
		"\u01c8\u00e5\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2"+
		"\2\2\u049d\u049e\t\7\2\2\u049e\u049f\5\u01c8\u00e5\2\u049f\u04a0\5\u015a"+
		"\u00ae\2\u04a0\u04a3\5\u01c8\u00e5\2\u04a1\u04a2\7<\2\2\u04a2\u04a4\5"+
		"\u01c8\u00e5\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2"+
		"\2\2\u04a5\u04a6\7~\2\2\u04a6\u04a7\5\u01c8\u00e5\2\u04a7\u04ad\7\u0132"+
		"\2\2\u04a8\u04a9\5\u01c8\u00e5\2\u04a9\u04aa\7.\2\2\u04aa\u04ab\5\u01c8"+
		"\u00e5\2\u04ab\u04ac\7\u0132\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04a8\3\2\2"+
		"\2\u04ad\u04ae\3\2\2\2\u04ae\u04b3\3\2\2\2\u04af\u04b1\5\u01c8\u00e5\2"+
		"\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b4"+
		"\5\u009cO\2\u04b3\u04b0\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b8\3\2\2"+
		"\2\u04b5\u04b6\5\u01c8\u00e5\2\u04b6\u04b7\5\u0166\u00b4\2\u04b7\u04b9"+
		"\3\2\2\2\u04b8\u04b5\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u009b\3\2\2\2\u04ba"+
		"\u04cc\7\u0126\2\2\u04bb\u04bd\5\u01c8\u00e5\2\u04bc\u04bb\3\2\2\2\u04bc"+
		"\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c9\5\u009eP\2\u04bf\u04c1"+
		"\5\u01c8\u00e5\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3"+
		"\2\2\2\u04c2\u04c4\7\"\2\2\u04c3\u04c5\5\u01c8\u00e5\2\u04c4\u04c3\3\2"+
		"\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\5\u009eP\2\u04c7"+
		"\u04c0\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca\3\2"+
		"\2\2\u04ca\u04cd\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04bc\3\2\2\2\u04cc"+
		"\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04d0\5\u01c8\u00e5\2\u04cf\u04ce"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\7\u012d\2"+
		"\2\u04d2\u009d\3\2\2\2\u04d3\u04d4\7\u0092\2\2\u04d4\u04d6\5\u01c8\u00e5"+
		"\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d8"+
		"\t\b\2\2\u04d8\u04da\5\u01c8\u00e5\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3"+
		"\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04dc\7\u0099\2\2\u04dc\u04de\5\u01c8"+
		"\u00e5\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u04e8\5\u0156\u00ac\2\u04e0\u04e2\5\u01c8\u00e5\2\u04e1\u04e0\3\2\2\2"+
		"\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\7\u0126\2\2\u04e4"+
		"\u04e6\5\u01c8\u00e5\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7"+
		"\3\2\2\2\u04e7\u04e9\7\u012d\2\2\u04e8\u04e1\3\2\2\2\u04e8\u04e9\3\2\2"+
		"\2\u04e9\u04ee\3\2\2\2\u04ea\u04ec\5\u01c8\u00e5\2\u04eb\u04ea\3\2\2\2"+
		"\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\5\u0166\u00b4\2\u04ee"+
		"\u04eb\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f4\3\2\2\2\u04f0\u04f2\5\u01c8"+
		"\u00e5\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3"+
		"\u04f5\5\u00a0Q\2\u04f4\u04f1\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u009f"+
		"\3\2\2\2\u04f6\u04f8\7\u0122\2\2\u04f7\u04f9\5\u01c8\u00e5\2\u04f8\u04f7"+
		"\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\5\u0182\u00c2"+
		"\2\u04fb\u00a1\3\2\2\2\u04fc\u04fd\5\u00a4S\2\u04fd\u04fe\5\u01c8\u00e5"+
		"\2\u04fe\u0509\5\u00a6T\2\u04ff\u0501\5\u01c8\u00e5\2\u0500\u04ff\3\2"+
		"\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\7\"\2\2\u0503"+
		"\u0505\5\u01c8\u00e5\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506"+
		"\3\2\2\2\u0506\u0508\5\u00a6T\2\u0507\u0500\3\2\2\2\u0508\u050b\3\2\2"+
		"\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u00a3\3\2\2\2\u050b\u0509"+
		"\3\2\2\2\u050c\u050d\t\t\2\2\u050d\u00a5\3\2\2\2\u050e\u0512\5\u00aaV"+
		"\2\u050f\u0512\5\u00acW\2\u0510\u0512\5\u00a8U\2\u0511\u050e\3\2\2\2\u0511"+
		"\u050f\3\2\2\2\u0511\u0510\3\2\2\2\u0512\u00a7\3\2\2\2\u0513\u0514\6U"+
		"\2\2\u0514\u0515\7\u013d\2\2\u0515\u00a9\3\2\2\2\u0516\u0517\6V\3\2\u0517"+
		"\u0518\7\u013d\2\2\u0518\u0519\7\u0128\2\2\u0519\u051a\7\u013d\2\2\u051a"+
		"\u00ab\3\2\2\2\u051b\u051c\5\u00a8U\2\u051c\u051d\7\u0128\2\2\u051d\u051e"+
		"\5\u00a8U\2\u051e\u00ad\3\2\2\2\u051f\u0520\7Q\2\2\u0520\u0521\5\u01b0"+
		"\u00d9\2\u0521\u0523\5(\25\2\u0522\u0524\5\u0170\u00b9\2\u0523\u0522\3"+
		"\2\2\2\u0523\u0524\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u0527\5\u01c8\u00e5"+
		"\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529"+
		"\7|\2\2\u0529\u0549\3\2\2\2\u052a\u052b\7Q\2\2\u052b\u052c\5\u01c8\u00e5"+
		"\2\u052c\u052d\t\n\2\2\u052d\u052e\5\u01c8\u00e5\2\u052e\u052f\5\u0182"+
		"\u00c2\2\u052f\u0530\5\u01b0\u00d9\2\u0530\u0532\5(\25\2\u0531\u0533\5"+
		"\u0170\u00b9\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2"+
		"\2\2\u0534\u0536\5\u01c8\u00e5\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2"+
		"\2\u0536\u0537\3\2\2\2\u0537\u0538\7|\2\2\u0538\u0549\3\2\2\2\u0539\u053a"+
		"\7Q\2\2\u053a\u053b\5\u01b0\u00d9\2\u053b\u053d\5(\25\2\u053c\u053e\5"+
		"\u0170\u00b9\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0540\3\2"+
		"\2\2\u053f\u0541\5\u01c8\u00e5\2\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2"+
		"\2\u0541\u0542\3\2\2\2\u0542\u0543\7|\2\2\u0543\u0544\5\u01c8\u00e5\2"+
		"\u0544\u0545\t\n\2\2\u0545\u0546\5\u01c8\u00e5\2\u0546\u0547\5\u0182\u00c2"+
		"\2\u0547\u0549\3\2\2\2\u0548\u051f\3\2\2\2\u0548\u052a\3\2\2\2\u0548\u0539"+
		"\3\2\2\2\u0549\u00af\3\2\2\2\u054a\u054b\5\u0180\u00c1\2\u054b\u054c\5"+
		"\u01c8\u00e5\2\u054c\u054e\3\2\2\2\u054d\u054a\3\2\2\2\u054d\u054e\3\2"+
		"\2\2\u054e\u054f\3\2\2\2\u054f\u0550\7a\2\2\u0550\u0551\5\u01c8\u00e5"+
		"\2\u0551\u0552\5\u015a\u00ae\2\u0552\u0556\5\u01b0\u00d9\2\u0553\u0555"+
		"\5\u00b2Z\2\u0554\u0553\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2\2"+
		"\2\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2\u0558\u0556\3\2\2\2\u0559\u055a"+
		"\7W\2\2\u055a\u00b1\3\2\2\2\u055b\u0564\5\u015a\u00ae\2\u055c\u055e\5"+
		"\u01c8\u00e5\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2"+
		"\2\2\u055f\u0561\7\u0122\2\2\u0560\u0562\5\u01c8\u00e5\2\u0561\u0560\3"+
		"\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\5\u0182\u00c2"+
		"\2\u0564\u055d\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567"+
		"\5\u01b0\u00d9\2\u0567\u00b3\3\2\2\2\u0568\u0569\7`\2\2\u0569\u00b5\3"+
		"\2\2\2\u056a\u056b\7c\2\2\u056b\u056c\5\u01c8\u00e5\2\u056c\u0577\5\u0182"+
		"\u00c2\2\u056d\u056f\5\u01c8\u00e5\2\u056e\u056d\3\2\2\2\u056e\u056f\3"+
		"\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\7\"\2\2\u0571\u0573\5\u01c8\u00e5"+
		"\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576"+
		"\5\u0182\u00c2\2\u0575\u056e\3\2\2\2\u0576\u0579\3\2\2\2\u0577\u0575\3"+
		"\2\2\2\u0577\u0578\3\2\2\2\u0578\u00b7\3\2\2\2\u0579\u0577\3\2\2\2\u057a"+
		"\u057b\7d\2\2\u057b\u057c\5\u01c8\u00e5\2\u057c\u057d\5\u0182\u00c2\2"+
		"\u057d\u00b9\3\2\2\2\u057e\u057f\5\u0180\u00c1\2\u057f\u0580\5\u01c8\u00e5"+
		"\2\u0580\u0582\3\2\2\2\u0581\u057e\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583"+
		"\3\2\2\2\u0583\u0584\7e\2\2\u0584\u0585\5\u01c8\u00e5\2\u0585\u0587\5"+
		"\u015a\u00ae\2\u0586\u0588\5\u01c8\u00e5\2\u0587\u0586\3\2\2\2\u0587\u0588"+
		"\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\5\u009cO\2\u058a\u00bb\3\2\2"+
		"\2\u058b\u058c\t\13\2\2\u058c\u00bd\3\2\2\2\u058d\u058e\7m\2\2\u058e\u058f"+
		"\5\u01c8\u00e5\2\u058f\u0590\7S\2\2\u0590\u0591\5\u01c8\u00e5\2\u0591"+
		"\u0592\5\u0182\u00c2\2\u0592\u0593\5\u01c8\u00e5\2\u0593\u0594\7v\2\2"+
		"\u0594\u0595\5\u01c8\u00e5\2\u0595\u0599\5\u0182\u00c2\2\u0596\u0597\5"+
		"\u01b0\u00d9\2\u0597\u0598\5*\26\2\u0598\u059a\3\2\2\2\u0599\u0596\3\2"+
		"\2\2\u0599\u059a\3\2\2\2\u059a\u05b0\3\2\2\2\u059b\u059d\5\u01b0\u00d9"+
		"\2\u059c\u059e\5\u0170\u00b9\2\u059d\u059c\3\2\2\2\u059d\u059e\3\2\2\2"+
		"\u059e\u05a0\3\2\2\2\u059f\u05a1\5\u01c8\u00e5\2\u05a0\u059f\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a6\7\u0088\2\2\u05a3\u05a4"+
		"\5\u01c8\u00e5\2\u05a4\u05a5\5\u0182\u00c2\2\u05a5\u05a7\3\2\2\2\u05a6"+
		"\u05a3\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05b1\3\2\2\2\u05a8\u05aa\5\u01c8"+
		"\u00e5\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab"+
		"\u05ad\7\"\2\2\u05ac\u05ae\5\u01c8\u00e5\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae"+
		"\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b1\5\u0182\u00c2\2\u05b0\u059b\3"+
		"\2\2\2\u05b0\u05a9\3\2\2\2\u05b1\u00bf\3\2\2\2\u05b2\u05b3\7m\2\2\u05b3"+
		"\u05b4\5\u01c8\u00e5\2\u05b4\u05b5\5\u0182\u00c2\2\u05b5\u05b6\5\u01c8"+
		"\u00e5\2\u05b6\u05b7\7\u00bb\2\2\u05b7\u05b8\5\u01c8\u00e5\2\u05b8\u05ba"+
		"\5\u0182\u00c2\2\u05b9\u05bb\5\u00c2b\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05bf\3\2\2\2\u05bc\u05be\5\u01c8\u00e5\2\u05bd\u05bc\3"+
		"\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c5\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u05c3\5\u01b0\u00d9\2\u05c3\u05c4"+
		"\5*\26\2\u05c4\u05c6\3\2\2\2\u05c5\u05c2\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u05dc\3\2\2\2\u05c7\u05c9\5\u01b0\u00d9\2\u05c8\u05ca\5\u0170\u00b9\2"+
		"\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05cd"+
		"\5\u01c8\u00e5\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3"+
		"\2\2\2\u05ce\u05d2\7\u0088\2\2\u05cf\u05d0\5\u01c8\u00e5\2\u05d0\u05d1"+
		"\5\u0182\u00c2\2\u05d1\u05d3\3\2\2\2\u05d2\u05cf\3\2\2\2\u05d2\u05d3\3"+
		"\2\2\2\u05d3\u05dd\3\2\2\2\u05d4\u05d6\5\u01c8\u00e5\2\u05d5\u05d4\3\2"+
		"\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\7\"\2\2\u05d8"+
		"\u05da\5\u01c8\u00e5\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db"+
		"\3\2\2\2\u05db\u05dd\5\u0182\u00c2\2\u05dc\u05c7\3\2\2\2\u05dc\u05d5\3"+
		"\2\2\2\u05dd\u00c1\3\2\2\2\u05de\u05df\5\u01c8\u00e5\2\u05df\u05e0\7\u00b4"+
		"\2\2\u05e0\u05e1\5\u01c8\u00e5\2\u05e1\u05e2\5\u0182\u00c2\2\u05e2\u00c3"+
		"\3\2\2\2\u05e3\u05e4\5\u0180\u00c1\2\u05e4\u05e5\5\u01c8\u00e5\2\u05e5"+
		"\u05e7\3\2\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05ea\3\2"+
		"\2\2\u05e8\u05e9\7\u00b3\2\2\u05e9\u05eb\5\u01c8\u00e5\2\u05ea\u05e8\3"+
		"\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\7n\2\2\u05ed"+
		"\u05ef\5\u01c8\u00e5\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f5\5\u00c6d\2\u05f1\u05f3\5\u01c8\u00e5\2\u05f2\u05f1"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\5\u009cO"+
		"\2\u05f5\u05f2\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05fb\3\2\2\2\u05f7\u05f9"+
		"\5\u01c8\u00e5\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\3"+
		"\2\2\2\u05fa\u05fc\5\u0166\u00b4\2\u05fb\u05f8\3\2\2\2\u05fb\u05fc\3\2"+
		"\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\5\u01b0\u00d9\2\u05fe\u0600\5(\25"+
		"\2\u05ff\u0601\5\u0170\u00b9\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2"+
		"\u0601\u0603\3\2\2\2\u0602\u0604\5\u01c8\u00e5\2\u0603\u0602\3\2\2\2\u0603"+
		"\u0604\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u060b\7X\2\2\u0606\u0607\5\u01ae"+
		"\u00d8\2\u0607\u0608\5\30\r\2\u0608\u060a\3\2\2\2\u0609\u0606\3\2\2\2"+
		"\u060a\u060d\3\2\2\2\u060b\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u00c5"+
		"\3\2\2\2\u060d\u060b\3\2\2\2\u060e\u060f\5\u015a\u00ae\2\u060f\u00c7\3"+
		"\2\2\2\u0610\u0611\7q\2\2\u0611\u0612\5\u01c8\u00e5\2\u0612\u0613\5\u0182"+
		"\u00c2\2\u0613\u00c9\3\2\2\2\u0614\u0615\7r\2\2\u0615\u0616\5\u01c8\u00e5"+
		"\2\u0616\u0617\5\u0182\u00c2\2\u0617\u00cb\3\2\2\2\u0618\u0619\7s\2\2"+
		"\u0619\u061a\5\u01c8\u00e5\2\u061a\u061b\5\u00dep\2\u061b\u061c\5\u01c8"+
		"\u00e5\2\u061c\u061d\7\u00ba\2\2\u061d\u061e\5\u01b0\u00d9\2\u061e\u0628"+
		"\5(\25\2\u061f\u0621\5\u0170\u00b9\2\u0620\u061f\3\2\2\2\u0620\u0621\3"+
		"\2\2\2\u0621\u0623\3\2\2\2\u0622\u0624\5\u01c8\u00e5\2\u0623\u0622\3\2"+
		"\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0627\5\u00ceh\2\u0626"+
		"\u0620\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2"+
		"\2\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u062d\5\u0170\u00b9"+
		"\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u0630"+
		"\5\u01c8\u00e5\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3"+
		"\2\2\2\u0631\u0633\5\u00d0i\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2"+
		"\u0633\u0635\3\2\2\2\u0634\u0636\5\u0170\u00b9\2\u0635\u0634\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637\u0639\5\u01c8\u00e5\2\u0638\u0637"+
		"\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\7Y\2\2\u063b"+
		"\u00cd\3\2\2\2\u063c\u063d\7U\2\2\u063d\u063e\5\u01c8\u00e5\2\u063e\u063f"+
		"\5\u00dep\2\u063f\u0640\5\u01c8\u00e5\2\u0640\u0641\7\u00ba\2\2\u0641"+
		"\u0642\5\u01b0\u00d9\2\u0642\u0643\5(\25\2\u0643\u064f\3\2\2\2\u0644\u0645"+
		"\7U\2\2\u0645\u0646\5\u01c8\u00e5\2\u0646\u0647\5\u00dep\2\u0647\u0648"+
		"\5\u01c8\u00e5\2\u0648\u064a\7\u00ba\2\2\u0649\u064b\5\u01c8\u00e5\2\u064a"+
		"\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\5("+
		"\25\2\u064d\u064f\3\2\2\2\u064e\u063c\3\2\2\2\u064e\u0644\3\2\2\2\u064f"+
		"\u00cf\3\2\2\2\u0650\u0651\7T\2\2\u0651\u0652\5\u01b0\u00d9\2\u0652\u0653"+
		"\5(\25\2\u0653\u00d1\3\2\2\2\u0654\u0657\5\u00d4k\2\u0655\u0657\5\u00d6"+
		"l\2\u0656\u0654\3\2\2\2\u0656\u0655\3\2\2\2\u0657\u00d3\3\2\2\2\u0658"+
		"\u065a\7s\2\2\u0659\u065b\5\u01c8\u00e5\2\u065a\u0659\3\2\2\2\u065a\u065b"+
		"\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065e\5\u00dep\2\u065d\u065f\5\u01c8"+
		"\u00e5\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\3\2\2\2\u0660"+
		"\u0662\7\u00ba\2\2\u0661\u0663\5\u01c8\u00e5\2\u0662\u0661\3\2\2\2\u0662"+
		"\u0663\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0668\5\u00dan\2\u0665\u0666"+
		"\5\u01c8\u00e5\2\u0666\u0667\5\u00d8m\2\u0667\u0669\3\2\2\2\u0668\u0665"+
		"\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u00d5\3\2\2\2\u066a\u066c\7s\2\2\u066b"+
		"\u066d\5\u01c8\u00e5\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u0670\5\u00dep\2\u066f\u0671\5\u01c8\u00e5\2\u0670\u066f"+
		"\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0674\7\u00ba\2"+
		"\2\u0673\u0675\5\u01b0\u00d9\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2"+
		"\u0675\u0677\3\2\2\2\u0676\u0678\5\u01c8\u00e5\2\u0677\u0676\3\2\2\2\u0677"+
		"\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a\5\u00d8m\2\u067a\u00d7"+
		"\3\2\2\2\u067b\u067d\7T\2\2\u067c\u067e\5\u01c8\u00e5\2\u067d\u067c\3"+
		"\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0681\5\u00dan\2"+
		"\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u00d9\3\2\2\2\u0682\u068f"+
		"\5\u0178\u00bd\2\u0683\u0685\5\u01c8\u00e5\2\u0684\u0683\3\2\2\2\u0684"+
		"\u0685\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0688\7#\2\2\u0687\u0689\5\u01c8"+
		"\u00e5\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3\2\2\2\u068a"+
		"\u068c\5\u00dco\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e"+
		"\3\2\2\2\u068d\u0684\3\2\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u06a9\3\2\2\2\u0691\u068f\3\2\2\2\u0692\u0694\7#"+
		"\2\2\u0693\u0695\5\u01c8\u00e5\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2"+
		"\2\u0695\u0697\3\2\2\2\u0696\u0692\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698"+
		"\3\2\2\2\u0698\u06a5\5\u00dco\2\u0699\u069b\5\u01c8\u00e5\2\u069a\u0699"+
		"\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\7#\2\2\u069d"+
		"\u069f\5\u01c8\u00e5\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a1"+
		"\3\2\2\2\u06a0\u06a2\5\u00dco\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2"+
		"\2\u06a2\u06a4\3\2\2\2\u06a3\u069a\3\2\2\2\u06a4\u06a7\3\2\2\2\u06a5\u06a3"+
		"\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a8"+
		"\u0682\3\2\2\2\u06a8\u0696\3\2\2\2\u06a9\u00db\3\2\2\2\u06aa\u06ab\5."+
		"\30\2\u06ab\u00dd\3\2\2\2\u06ac\u06ad\5\u0182\u00c2\2\u06ad\u00df\3\2"+
		"\2\2\u06ae\u06af\7u\2\2\u06af\u06b0\5\u01c8\u00e5\2\u06b0\u06b1\5\u0182"+
		"\u00c2\2\u06b1\u00e1\3\2\2\2\u06b2\u06b3\7}\2\2\u06b3\u06b5\5\u01c8\u00e5"+
		"\2\u06b4\u06b2\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b8"+
		"\5\u018e\u00c8\2\u06b7\u06b9\5\u01c8\u00e5\2\u06b8\u06b7\3\2\2\2\u06b8"+
		"\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc\7\u0122\2\2\u06bb\u06bd"+
		"\5\u01c8\u00e5\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06be\3"+
		"\2\2\2\u06be\u06bf\5\u0182\u00c2\2\u06bf\u00e3\3\2\2\2\u06c0\u06c1\7\u0084"+
		"\2\2\u06c1\u06c2\5\u01c8\u00e5\2\u06c2\u06c4\5\u0182\u00c2\2\u06c3\u06c5"+
		"\5\u01c8\u00e5\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3"+
		"\2\2\2\u06c6\u06c8\7\u0122\2\2\u06c7\u06c9\5\u01c8\u00e5\2\u06c8\u06c7"+
		"\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\5\u0182\u00c2"+
		"\2\u06cb\u00e5\3\2\2\2\u06cc\u06cd\t\f\2\2\u06cd\u06d6\5\u01c8\u00e5\2"+
		"\u06ce\u06cf\7r\2\2\u06cf\u06d0\5\u01c8\u00e5\2\u06d0\u06d1\5\u0182\u00c2"+
		"\2\u06d1\u06d7\3\2\2\2\u06d2\u06d3\7\u00aa\2\2\u06d3\u06d4\5\u01c8\u00e5"+
		"\2\u06d4\u06d5\7\u0088\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06ce\3\2\2\2\u06d6"+
		"\u06d2\3\2\2\2\u06d7\u00e7\3\2\2\2\u06d8\u06d9\7\u008e\2\2\u06d9\u06da"+
		"\5\u01c8\u00e5\2\u06da\u06db\5\u0182\u00c2\2\u06db\u06dc\5\u01c8\u00e5"+
		"\2\u06dc\u06dd\7r\2\2\u06dd\u06de\5\u01c8\u00e5\2\u06de\u06e9\5\u0182"+
		"\u00c2\2\u06df\u06e1\5\u01c8\u00e5\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3"+
		"\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e4\7\"\2\2\u06e3\u06e5\5\u01c8\u00e5"+
		"\2\u06e4\u06e3\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8"+
		"\5\u0182\u00c2\2\u06e7\u06e0\3\2\2\2\u06e8\u06eb\3\2\2\2\u06e9\u06e7\3"+
		"\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u00e9\3\2\2\2\u06eb\u06e9\3\2\2\2\u06ec"+
		"\u06ed\7\u008e\2\2\u06ed\u06ee\5\u01c8\u00e5\2\u06ee\u06ef\5\u0182\u00c2"+
		"\2\u06ef\u06f0\5\u01c8\u00e5\2\u06f0\u06f1\7q\2\2\u06f1\u06f2\5\u01c8"+
		"\u00e5\2\u06f2\u06fd\5\u0182\u00c2\2\u06f3\u06f5\5\u01c8\u00e5\2\u06f4"+
		"\u06f3\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8\7\""+
		"\2\2\u06f7\u06f9\5\u01c8\u00e5\2\u06f8\u06f7\3\2\2\2\u06f8\u06f9\3\2\2"+
		"\2\u06f9\u06fa\3\2\2\2\u06fa\u06fc\5\u0182\u00c2\2\u06fb\u06f4\3\2\2\2"+
		"\u06fc\u06ff\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u00eb"+
		"\3\2\2\2\u06ff\u06fd\3\2\2\2\u0700\u0701\5\u0180\u00c1\2\u0701\u0702\5"+
		"\u01c8\u00e5\2\u0702\u0704\3\2\2\2\u0703\u0700\3\2\2\2\u0703\u0704\3\2"+
		"\2\2\u0704\u0707\3\2\2\2\u0705\u0706\7\u00b3\2\2\u0706\u0708\5\u01c8\u00e5"+
		"\2\u0707\u0705\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a"+
		"\7\u009d\2\2\u070a\u070b\5\u01c8\u00e5\2\u070b\u0710\5\u00c6d\2\u070c"+
		"\u070e\5\u01c8\u00e5\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f"+
		"\3\2\2\2\u070f\u0711\5\u009cO\2\u0710\u070d\3\2\2\2\u0710\u0711\3\2\2"+
		"\2\u0711\u0715\3\2\2\2\u0712\u0713\5\u01c8\u00e5\2\u0713\u0714\5\u0166"+
		"\u00b4\2\u0714\u0716\3\2\2\2\u0715\u0712\3\2\2\2\u0715\u0716\3\2\2\2\u0716"+
		"\u0717\3\2\2\2\u0717\u0718\5\u01b0\u00d9\2\u0718\u071a\5(\25\2\u0719\u071b"+
		"\5\u0170\u00b9\2\u071a\u0719\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071d\3"+
		"\2\2\2\u071c\u071e\5\u01c8\u00e5\2\u071d\u071c\3\2\2\2\u071d\u071e\3\2"+
		"\2\2\u071e\u071f\3\2\2\2\u071f\u0725\7[\2\2\u0720\u0721\5\u01ae\u00d8"+
		"\2\u0721\u0722\5\30\r\2\u0722\u0724\3\2\2\2\u0723\u0720\3\2\2\2\u0724"+
		"\u0727\3\2\2\2\u0725\u0723\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u00ed\3\2"+
		"\2\2\u0727\u0725\3\2\2\2\u0728\u0729\5\u0180\u00c1\2\u0729\u072a\5\u01c8"+
		"\u00e5\2\u072a\u072c\3\2\2\2\u072b\u0728\3\2\2\2\u072b\u072c\3\2\2\2\u072c"+
		"\u072f\3\2\2\2\u072d\u072e\7\u00b3\2\2\u072e\u0730\5\u01c8\u00e5\2\u072f"+
		"\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\7\u009f"+
		"\2\2\u0732\u0733\5\u01c8\u00e5\2\u0733\u0738\5\u0122\u0092\2\u0734\u0736"+
		"\5\u01c8\u00e5\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\3"+
		"\2\2\2\u0737\u0739\5\u009cO\2\u0738\u0735\3\2\2\2\u0738\u0739\3\2\2\2"+
		"\u0739\u073a\3\2\2\2\u073a\u073b\5\u01b0\u00d9\2\u073b\u073d\5(\25\2\u073c"+
		"\u073e\5\u0170\u00b9\2\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0740"+
		"\3\2\2\2\u073f\u0741\5\u01c8\u00e5\2\u0740\u073f\3\2\2\2\u0740\u0741\3"+
		"\2\2\2\u0741\u0742\3\2\2\2\u0742\u0748\7[\2\2\u0743\u0744\5\u01ae\u00d8"+
		"\2\u0744\u0745\5\30\r\2\u0745\u0747\3\2\2\2\u0746\u0743\3\2\2\2\u0747"+
		"\u074a\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u00ef\3\2"+
		"\2\2\u074a\u0748\3\2\2\2\u074b\u074c\5\u0180\u00c1\2\u074c\u074d\5\u01c8"+
		"\u00e5\2\u074d\u074f\3\2\2\2\u074e\u074b\3\2\2\2\u074e\u074f\3\2\2\2\u074f"+
		"\u0752\3\2\2\2\u0750\u0751\7\u00b3\2\2\u0751\u0753\5\u01c8\u00e5\2\u0752"+
		"\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\7\u009e"+
		"\2\2\u0755\u0756\5\u01c8\u00e5\2\u0756\u075b\5\u0122\u0092\2\u0757\u0759"+
		"\5\u01c8\u00e5\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075a\3"+
		"\2\2\2\u075a\u075c\5\u009cO\2\u075b\u0758\3\2\2\2\u075b\u075c\3\2\2\2"+
		"\u075c\u075d\3\2\2\2\u075d\u075e\5\u01b0\u00d9\2\u075e\u0760\5(\25\2\u075f"+
		"\u0761\5\u0170\u00b9\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763"+
		"\3\2\2\2\u0762\u0764\5\u01c8\u00e5\2\u0763\u0762\3\2\2\2\u0763\u0764\3"+
		"\2\2\2\u0764\u0765\3\2\2\2\u0765\u076b\7[\2\2\u0766\u0767\5\u01ae\u00d8"+
		"\2\u0767\u0768\5\30\r\2\u0768\u076a\3\2\2\2\u0769\u0766\3\2\2\2\u076a"+
		"\u076d\3\2\2\2\u076b\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u00f1\3\2"+
		"\2\2\u076d\u076b\3\2\2\2\u076e\u076f\7\u00a4\2\2\u076f\u0770\5\u01c8\u00e5"+
		"\2\u0770\u077f\5\u015a\u00ae\2\u0771\u0773\5\u01c8\u00e5\2\u0772\u0771"+
		"\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0776\7\u0126\2"+
		"\2\u0775\u0777\5\u01c8\u00e5\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2\2"+
		"\u0777\u0779\3\2\2\2\u0778\u077a\5\u00f4{\2\u0779\u0778\3\2\2\2\u0779"+
		"\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u077d\5\u01c8\u00e5\2\u077c\u077b"+
		"\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u0780\7\u012d\2"+
		"\2\u077f\u0772\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u00f3\3\2\2\2\u0781\u078c"+
		"\5\u00f6|\2\u0782\u0784\5\u01c8\u00e5\2\u0783\u0782\3\2\2\2\u0783\u0784"+
		"\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787\7\"\2\2\u0786\u0788\5\u01c8\u00e5"+
		"\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078b"+
		"\5\u00f6|\2\u078a\u0783\3\2\2\2\u078b\u078e\3\2\2\2\u078c\u078a\3\2\2"+
		"\2\u078c\u078d\3\2\2\2\u078d\u00f5\3\2\2\2\u078e\u078c\3\2\2\2\u078f\u0790"+
		"\7\67\2\2\u0790\u0792\5\u01c8\u00e5\2\u0791\u078f\3\2\2\2\u0791\u0792"+
		"\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\5\u0182\u00c2\2\u0794\u00f7\3"+
		"\2\2\2\u0795\u0796\7\u00a7\2\2\u0796\u0799\5\u01c8\u00e5\2\u0797\u0798"+
		"\7\u009a\2\2\u0798\u079a\5\u01c8\u00e5\2\u0799\u0797\3\2\2\2\u0799\u079a"+
		"\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\5\u00fa~\2\u079c\u00f9\3\2\2"+
		"\2\u079d\u07a8\5\u00fc\177\2\u079e\u07a0\5\u01c8\u00e5\2\u079f\u079e\3"+
		"\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a3\7\"\2\2\u07a2"+
		"\u07a4\5\u01c8\u00e5\2\u07a3\u07a2\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a5"+
		"\3\2\2\2\u07a5\u07a7\5\u00fc\177\2\u07a6\u079f\3\2\2\2\u07a7\u07aa\3\2"+
		"\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u00fb\3\2\2\2\u07aa"+
		"\u07a8\3\2\2\2\u07ab\u07af\5\u0182\u00c2\2\u07ac\u07ad\5\u01c8\u00e5\2"+
		"\u07ad\u07ae\5\u0166\u00b4\2\u07ae\u07b0\3\2\2\2\u07af\u07ac\3\2\2\2\u07af"+
		"\u07b0\3\2\2\2\u07b0\u00fd\3\2\2\2\u07b1\u07b2\5\u0100\u0081\2\u07b2\u07b4"+
		"\7\u0126\2\2\u07b3\u07b5\5\u01c8\u00e5\2\u07b4\u07b3\3\2\2\2\u07b4\u07b5"+
		"\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b8\5\u018e\u00c8\2\u07b7\u07b9\5"+
		"\u01c8\u00e5\2\u07b8\u07b7\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\3\2"+
		"\2\2\u07ba\u07bc\7\"\2\2\u07bb\u07bd\5\u01c8\u00e5\2\u07bc\u07bb\3\2\2"+
		"\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c0\5\u0182\u00c2\2"+
		"\u07bf\u07c1\5\u01c8\u00e5\2\u07c0\u07bf\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1"+
		"\u07ca\3\2\2\2\u07c2\u07c4\7\"\2\2\u07c3\u07c5\5\u01c8\u00e5\2\u07c4\u07c3"+
		"\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c8\5\u0182\u00c2"+
		"\2\u07c7\u07c9\5\u01c8\u00e5\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2\2\2"+
		"\u07c9\u07cb\3\2\2\2\u07ca\u07c2\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cc"+
		"\3\2\2\2\u07cc\u07ce\7\u012d\2\2\u07cd\u07cf\5\u01c8\u00e5\2\u07ce\u07cd"+
		"\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2\7\u0122\2"+
		"\2\u07d1\u07d3\5\u01c8\u00e5\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2"+
		"\u07d3\u07d4\3\2\2\2\u07d4\u07d5\5\u0182\u00c2\2\u07d5\u00ff\3\2\2\2\u07d6"+
		"\u07d8\t\r\2\2\u07d7\u07d9\7*\2\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2"+
		"\2\2\u07d9\u0101\3\2\2\2\u07da\u07db\5\u0182\u00c2\2\u07db\u0103\3\2\2"+
		"\2\u07dc\u07dd\7:\2\2\u07dd\u07de\5\u01c8\u00e5\2\u07de\u07df\5\u018e"+
		"\u00c8\2\u07df\u07e7\3\2\2\2\u07e0\u07e4\5\u018e\u00c8\2\u07e1\u07e2\5"+
		"\u01c8\u00e5\2\u07e2\u07e3\5\u0192\u00ca\2\u07e3\u07e5\3\2\2\2\u07e4\u07e1"+
		"\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e7\3\2\2\2\u07e6\u07dc\3\2\2\2\u07e6"+
		"\u07e0\3\2\2\2\u07e7\u0105\3\2\2\2\u07e8\u07ee\7\u00aa\2\2\u07e9\u07ec"+
		"\5\u01c8\u00e5\2\u07ea\u07ed\7\u0088\2\2\u07eb\u07ed\5\u0182\u00c2\2\u07ec"+
		"\u07ea\3\2\2\2\u07ec\u07eb\3\2\2\2\u07ed\u07ef\3\2\2\2\u07ee\u07e9\3\2"+
		"\2\2\u07ee\u07ef\3\2\2\2\u07ef\u0107\3\2\2\2\u07f0\u07f1\7\u00ab\2\2\u07f1"+
		"\u0109\3\2\2\2\u07f2\u07f3\7\u00ac\2\2\u07f3\u07f4\5\u01c8\u00e5\2\u07f4"+
		"\u07f6\5\u0182\u00c2\2\u07f5\u07f7\5\u01c8\u00e5\2\u07f6\u07f5\3\2\2\2"+
		"\u07f6\u07f7\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fa\7\u0122\2\2\u07f9"+
		"\u07fb\5\u01c8\u00e5\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc"+
		"\3\2\2\2\u07fc\u07fd\5\u0182\u00c2\2\u07fd\u010b\3\2\2\2\u07fe\u07ff\7"+
		"\u00b5\2\2\u07ff\u010d\3\2\2\2\u0800\u0801\7\u0087\2\2\u0801\u0802\5\u01c8"+
		"\u00e5\2\u0802\u0803\5\u0182\u00c2\2\u0803\u0804\5\u01c8\u00e5\2\u0804"+
		"\u0805\7\62\2\2\u0805\u0806\5\u01c8\u00e5\2\u0806\u0807\5\u0182\u00c2"+
		"\2\u0807\u010f\3\2\2\2\u0808\u080a\7\u00ae\2\2\u0809\u080b\5\u01c8\u00e5"+
		"\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e"+
		"\7;\2\2\u080d\u080f\5\u01c8\u00e5\2\u080e\u080d\3\2\2\2\u080e\u080f\3"+
		"\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\5\u0112\u008a\2\u0811\u081b\5\u01b0"+
		"\u00d9\2\u0812\u0814\5\u0170\u00b9\2\u0813\u0812\3\2\2\2\u0813\u0814\3"+
		"\2\2\2\u0814\u0816\3\2\2\2\u0815\u0817\5\u01c8\u00e5\2\u0816\u0815\3\2"+
		"\2\2\u0816\u0817\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\5\u0114\u008b"+
		"\2\u0819\u0813\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c"+
		"\3\2\2\2\u081c\u081f\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u0820\5\u0170\u00b9"+
		"\2\u081f\u081e\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0822\3\2\2\2\u0821\u0823"+
		"\5\u01c8\u00e5\2\u0822\u0821\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0825\3"+
		"\2\2\2\u0824\u0826\5\u0116\u008c\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2"+
		"\2\2\u0826\u0828\3\2\2\2\u0827\u0829\5\u0170\u00b9\2\u0828\u0827\3\2\2"+
		"\2\u0828\u0829\3\2\2\2\u0829\u082b\3\2\2\2\u082a\u082c\5\u01c8\u00e5\2"+
		"\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082e"+
		"\7\\\2\2\u082e\u0111\3\2\2\2\u082f\u0830\5\u0182\u00c2\2\u0830\u0113\3"+
		"\2\2\2\u0831\u0832\7;\2\2\u0832\u0833\5\u01c8\u00e5\2\u0833\u083e\5\u0118"+
		"\u008d\2\u0834\u0836\5\u01c8\u00e5\2\u0835\u0834\3\2\2\2\u0835\u0836\3"+
		"\2\2\2\u0836\u0837\3\2\2\2\u0837\u0839\7\"\2\2\u0838\u083a\5\u01c8\u00e5"+
		"\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083d"+
		"\5\u0118\u008d\2\u083c\u0835\3\2\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3"+
		"\2\2\2\u083e\u083f\3\2\2\2\u083f\u0841\3\2\2\2\u0840\u083e\3\2\2\2\u0841"+
		"\u0842\5\u01b0\u00d9\2\u0842\u0843\5(\25\2\u0843\u0115\3\2\2\2\u0844\u0846"+
		"\7;\2\2\u0845\u0847\5\u01c8\u00e5\2\u0846\u0845\3\2\2\2\u0846\u0847\3"+
		"\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\7T\2\2\u0849\u084a\5\u01b0\u00d9"+
		"\2\u084a\u084b\5(\25\2\u084b\u0117\3\2\2\2\u084c\u084e\7x\2\2\u084d\u084f"+
		"\5\u01c8\u00e5\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\3"+
		"\2\2\2\u0850\u084c\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\3\2\2\2\u0852"+
		"\u0854\5\u016a\u00b6\2\u0853\u0855\5\u01c8\u00e5\2\u0854\u0853\3\2\2\2"+
		"\u0854\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0857\5\u0182\u00c2\2\u0857"+
		"\u0860\3\2\2\2\u0858\u0859\5\u011a\u008e\2\u0859\u085a\5\u01c8\u00e5\2"+
		"\u085a\u085b\7\u00bb\2\2\u085b\u085c\5\u01c8\u00e5\2\u085c\u085d\5\u011c"+
		"\u008f\2\u085d\u0860\3\2\2\2\u085e\u0860\5\u0182\u00c2\2\u085f\u0850\3"+
		"\2\2\2\u085f\u0858\3\2\2\2\u085f\u085e\3\2\2\2\u0860\u0119\3\2\2\2\u0861"+
		"\u0862\5\u0182\u00c2\2\u0862\u011b\3\2\2\2\u0863\u0864\5\u0182\u00c2\2"+
		"\u0864\u011d\3\2\2\2\u0865\u0866\7\u00af\2\2\u0866\u0867\5\u01c8\u00e5"+
		"\2\u0867\u0869\5\u018e\u00c8\2\u0868\u086a\5\u01c8\u00e5\2\u0869\u0868"+
		"\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086d\7\u0122\2"+
		"\2\u086c\u086e\5\u01c8\u00e5\2\u086d\u086c\3\2\2\2\u086d\u086e\3\2\2\2"+
		"\u086e\u086f\3\2\2\2\u086f\u0870\5\u0182\u00c2\2\u0870\u011f\3\2\2\2\u0871"+
		"\u0872\5\u0180\u00c1\2\u0872\u0873\5\u01c8\u00e5\2\u0873\u0875\3\2\2\2"+
		"\u0874\u0871\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0878\3\2\2\2\u0876\u0877"+
		"\7\u00b3\2\2\u0877\u0879\5\u01c8\u00e5\2\u0878\u0876\3\2\2\2\u0878\u0879"+
		"\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c\7\u00b7\2\2\u087b\u087d\5\u01c8"+
		"\u00e5\2\u087c\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087e\3\2\2\2\u087e"+
		"\u0883\5\u0122\u0092\2\u087f\u0881\5\u01c8\u00e5\2\u0880\u087f\3\2\2\2"+
		"\u0880\u0881\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0884\5\u009cO\2\u0883"+
		"\u0880\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0886\5\u01b0"+
		"\u00d9\2\u0886\u0888\5(\25\2\u0887\u0889\5\u0170\u00b9\2\u0888\u0887\3"+
		"\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b\3\2\2\2\u088a\u088c\5\u01c8\u00e5"+
		"\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u0893"+
		"\7]\2\2\u088e\u088f\5\u01ae\u00d8\2\u088f\u0890\5\30\r\2\u0890\u0892\3"+
		"\2\2\2\u0891\u088e\3\2\2\2\u0892\u0895\3\2\2\2\u0893\u0891\3\2\2\2\u0893"+
		"\u0894\3\2\2\2\u0894\u0121\3\2\2\2\u0895\u0893\3\2\2\2\u0896\u0897\5\u015a"+
		"\u00ae\2\u0897\u0123\3\2\2\2\u0898\u0899\5\u0180\u00c1\2\u0899\u089a\5"+
		"\u01c8\u00e5\2\u089a\u089c\3\2\2\2\u089b\u0898\3\2\2\2\u089b\u089c\3\2"+
		"\2\2\u089c\u089d\3\2\2\2\u089d\u089e\7\u00bd\2\2\u089e\u089f\5\u01c8\u00e5"+
		"\2\u089f\u08a0\5\u015c\u00af\2\u08a0\u08a1\5\u01b0\u00d9\2\u08a1\u08a2"+
		"\5\u0126\u0094\2\u08a2\u08a3\7^\2\2\u08a3\u0125\3\2\2\2\u08a4\u08a5\5"+
		"\u0128\u0095\2\u08a5\u08a6\5\u01b0\u00d9\2\u08a6\u08a8\3\2\2\2\u08a7\u08a4"+
		"\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa"+
		"\u0127\3\2\2\2\u08ab\u08ae\5\u012c\u0097\2\u08ac\u08ae\5\u012a\u0096\2"+
		"\u08ad\u08ab\3\2\2\2\u08ad\u08ac\3\2\2\2\u08ae\u0129\3\2\2\2\u08af\u08b1"+
		"\5\u015c\u00af\2\u08b0\u08b2\5\u01c8\u00e5\2\u08b1\u08b0\3\2\2\2\u08b1"+
		"\u08b2\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\5\u012e\u0098\2\u08b4\u012b"+
		"\3\2\2\2\u08b5\u08b6\5\u0156\u00ac\2\u08b6\u08b7\5\u01c8\u00e5\2\u08b7"+
		"\u08b8\5\u0166\u00b4\2\u08b8\u012d\3\2\2\2\u08b9\u08ba\5\u0130\u0099\2"+
		"\u08ba\u08bb\5\u01c8\u00e5\2\u08bb\u08bd\3\2\2\2\u08bc\u08b9\3\2\2\2\u08bc"+
		"\u08bd\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\5\u0166\u00b4\2\u08bf\u012f"+
		"\3\2\2\2\u08c0\u08c2\7\u0126\2\2\u08c1\u08c3\5\u01c8\u00e5\2\u08c2\u08c1"+
		"\3\2\2\2\u08c2\u08c3\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u08c3\u08c5\3\2\2\2\u08c4\u08c6\5\u0132\u009a\2\u08c5\u08c4\3\2\2\2\u08c5"+
		"\u08c6\3\2\2\2\u08c6\u08c8\3\2\2\2\u08c7\u08c9\5\u01c8\u00e5\2\u08c8\u08c7"+
		"\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\7\u012d\2"+
		"\2\u08cb\u0131\3\2\2\2\u08cc\u08d7\5\u0134\u009b\2\u08cd\u08cf\5\u01c8"+
		"\u00e5\2\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0"+
		"\u08d2\7\"\2\2\u08d1\u08d3\5\u01c8\u00e5\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3"+
		"\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\5\u0134\u009b\2\u08d5\u08ce\3"+
		"\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8"+
		"\u0133\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da\u08dc\5\u0136\u009c\2\u08db\u08dd"+
		"\5\u01c8\u00e5\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08df\3"+
		"\2\2\2\u08de\u08da\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0"+
		"\u08e1\5\u0138\u009d\2\u08e1\u0135\3\2\2\2\u08e2\u08e4\5\u013a\u009e\2"+
		"\u08e3\u08e5\5\u01c8\u00e5\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5"+
		"\u08e6\3\2\2\2\u08e6\u08e7\7\u00bb\2\2\u08e7\u0137\3\2\2\2\u08e8\u08e9"+
		"\5\u013a\u009e\2\u08e9\u0139\3\2\2\2\u08ea\u08eb\5\u0182\u00c2\2\u08eb"+
		"\u013b\3\2\2\2\u08ec\u08f0\7P\2\2\u08ed\u08f0\7\u00b3\2\2\u08ee\u08f0"+
		"\5\u0180\u00c1\2\u08ef\u08ec\3\2\2\2\u08ef\u08ed\3\2\2\2\u08ef\u08ee\3"+
		"\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f4\5\u01c8\u00e5\2\u08f2\u08f3\7\u00c7"+
		"\2\2\u08f3\u08f5\5\u01c8\u00e5\2\u08f4\u08f2\3\2\2\2\u08f4\u08f5\3\2\2"+
		"\2\u08f5\u08f6\3\2\2\2\u08f6\u08f7\5\u013e\u00a0\2\u08f7\u013d\3\2\2\2"+
		"\u08f8\u0903\5\u0140\u00a1\2\u08f9\u08fb\5\u01c8\u00e5\2\u08fa\u08f9\3"+
		"\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fe\7\"\2\2\u08fd"+
		"\u08ff\5\u01c8\u00e5\2\u08fe\u08fd\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0900"+
		"\3\2\2\2\u0900\u0902\5\u0140\u00a1\2\u0901\u08fa\3\2\2\2\u0902\u0905\3"+
		"\2\2\2\u0903\u0901\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u013f\3\2\2\2\u0905"+
		"\u0903\3\2\2\2\u0906\u0915\5\u015a\u00ae\2\u0907\u0909\5\u01c8\u00e5\2"+
		"\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090c"+
		"\7\u0126\2\2\u090b\u090d\5\u01c8\u00e5\2\u090c\u090b\3\2\2\2\u090c\u090d"+
		"\3\2\2\2\u090d\u0912\3\2\2\2\u090e\u0910\5\u0152\u00aa\2\u090f\u0911\5"+
		"\u01c8\u00e5\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0913\3\2"+
		"\2\2\u0912\u090e\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\3\2\2\2\u0914"+
		"\u0916\7\u012d\2\2\u0915\u0908\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u091a"+
		"\3\2\2\2\u0917\u0918\5\u01c8\u00e5\2\u0918\u0919\5\u0166\u00b4\2\u0919"+
		"\u091b\3\2\2\2\u091a\u0917\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u0141\3\2"+
		"\2\2\u091c\u091d\7\u00c4\2\2\u091d\u091e\5\u01c8\u00e5\2\u091e\u091f\5"+
		"\u0182\u00c2\2\u091f\u0920\5\u01b0\u00d9\2\u0920\u0922\5(\25\2\u0921\u0923"+
		"\5\u0170\u00b9\2\u0922\u0921\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0925\3"+
		"\2\2\2\u0924\u0926\5\u01c8\u00e5\2\u0925\u0924\3\2\2\2\u0925\u0926\3\2"+
		"\2\2\u0926\u0927\3\2\2\2\u0927\u0928\7\u00c3\2\2\u0928\u0143\3\2\2\2\u0929"+
		"\u092a\7\u00c6\2\2\u092a\u092b\5\u01c8\u00e5\2\u092b\u092c\5\u0182\u00c2"+
		"\2\u092c\u092d\5\u01b0\u00d9\2\u092d\u092f\5(\25\2\u092e\u0930\5\u0170"+
		"\u00b9\2\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0932\3\2\2\2\u0931"+
		"\u0933\5\u01c8\u00e5\2\u0932\u0931\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934"+
		"\3\2\2\2\u0934\u0935\7_\2\2\u0935\u0145\3\2\2\2\u0936\u0937\5\u0182\u00c2"+
		"\2\u0937\u093f\5\u01c8\u00e5\2\u0938\u093a\7\u00b4\2\2\u0939\u093b\5\u01c8"+
		"\u00e5\2\u093a\u0939\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093d\3\2\2\2\u093c"+
		"\u0938\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0940\5\u014e"+
		"\u00a8\2\u093f\u093c\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0941\3\2\2\2\u0941"+
		"\u0946\7\u0128\2\2\u0942\u0944\7\u00b4\2\2\u0943\u0945\5\u01c8\u00e5\2"+
		"\u0944\u0943\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0947\3\2\2\2\u0946\u0942"+
		"\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u094a\5\u014e\u00a8"+
		"\2\u0949\u094b\5\u01c8\u00e5\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2"+
		"\u094b\u0951\3\2\2\2\u094c\u094e\7\"\2\2\u094d\u094f\5\u01c8\u00e5\2\u094e"+
		"\u094d\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0952\5\u0182"+
		"\u00c2\2\u0951\u094c\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0954\3\2\2\2\u0953"+
		"\u0955\5\u01c8\u00e5\2\u0954\u0953\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u095b"+
		"\3\2\2\2\u0956\u0958\7\"\2\2\u0957\u0959\5\u01c8\u00e5\2\u0958\u0957\3"+
		"\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095c\5\u0150\u00a9"+
		"\2\u095b\u0956\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u0147\3\2\2\2\u095d\u095f"+
		"\5\u0182\u00c2\2\u095e\u0960\5\u01c8\u00e5\2\u095f\u095e\3\2\2\2\u095f"+
		"\u0960\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0963\7&\2\2\u0962\u0964\5\u01c8"+
		"\u00e5\2\u0963\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0966\3\2\2\2\u0965"+
		"\u095d\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\7\f"+
		"\2\2\u0968\u096d\5\u01c8\u00e5\2\u0969\u096b\7\u00b4\2\2\u096a\u096c\5"+
		"\u01c8\u00e5\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096e\3\2"+
		"\2\2\u096d\u0969\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\3\2\2\2\u096f"+
		"\u0978\5\u014e\u00a8\2\u0970\u0972\5\u01c8\u00e5\2\u0971\u0970\3\2\2\2"+
		"\u0971\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0975\7\"\2\2\u0974\u0976"+
		"\5\u01c8\u00e5\2\u0975\u0974\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0977\3"+
		"\2\2\2\u0977\u0979\5\u0182\u00c2\2\u0978\u0971\3\2\2\2\u0979\u097a\3\2"+
		"\2\2\u097a\u0978\3\2\2\2\u097a\u097b\3\2\2\2\u097b\u0149\3\2\2\2\u097c"+
		"\u097e\5\u0182\u00c2\2\u097d\u097f\5\u01c8\u00e5\2\u097e\u097d\3\2\2\2"+
		"\u097e\u097f\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0982\7&\2\2\u0981\u0983"+
		"\5\u01c8\u00e5\2\u0982\u0981\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0985\3"+
		"\2\2\2\u0984\u097c\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986\3\2\2\2\u0986"+
		"\u0987\7 \2\2\u0987\u0988\5\u01c8\u00e5\2\u0988\u098a\5\u014e\u00a8\2"+
		"\u0989\u098b\5\u01c8\u00e5\2\u098a\u0989\3\2\2\2\u098a\u098b\3\2\2\2\u098b"+
		"\u098c\3\2\2\2\u098c\u098e\7\u0128\2\2\u098d\u098f\5\u01c8\u00e5\2\u098e"+
		"\u098d\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\5\u014e"+
		"\u00a8\2\u0991\u014b\3\2\2\2\u0992\u0994\5\u0182\u00c2\2\u0993\u0995\5"+
		"\u01c8\u00e5\2\u0994\u0993\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0996\3\2"+
		"\2\2\u0996\u0998\7&\2\2\u0997\u0999\5\u01c8\u00e5\2\u0998\u0997\3\2\2"+
		"\2\u0998\u0999\3\2\2\2\u0999\u099b\3\2\2\2\u099a\u0992\3\2\2\2\u099a\u099b"+
		"\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u09a0\7\37\2\2\u099d\u099e\5\u01c8"+
		"\u00e5\2\u099e\u099f\7\u00b4\2\2\u099f\u09a1\3\2\2\2\u09a0\u099d\3\2\2"+
		"\2\u09a0\u09a1\3\2\2\2\u09a1\u09a3\3\2\2\2\u09a2\u09a4\5\u01c8\u00e5\2"+
		"\u09a3\u09a2\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a7"+
		"\5\u014e\u00a8\2\u09a6\u09a8\5\u01c8\u00e5\2\u09a7\u09a6\3\2\2\2\u09a7"+
		"\u09a8\3\2\2\2\u09a8\u09ae\3\2\2\2\u09a9\u09ab\7\"\2\2\u09aa\u09ac\5\u01c8"+
		"\u00e5\2\u09ab\u09aa\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad"+
		"\u09af\5\u0182\u00c2\2\u09ae\u09a9\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u014d"+
		"\3\2\2\2\u09b0\u09b2\7\u0126\2\2\u09b1\u09b3\5\u01c8\u00e5\2\u09b2\u09b1"+
		"\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u09b6\5\u0182\u00c2"+
		"\2\u09b5\u09b7\5\u01c8\u00e5\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3\2\2\2"+
		"\u09b7\u09b8\3\2\2\2\u09b8\u09ba\7\"\2\2\u09b9\u09bb\5\u01c8\u00e5\2\u09ba"+
		"\u09b9\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09be\5\u0182"+
		"\u00c2\2\u09bd\u09bf\5\u01c8\u00e5\2\u09be\u09bd\3\2\2\2\u09be\u09bf\3"+
		"\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c1\7\u012d\2\2\u09c1\u014f\3\2\2\2"+
		"\u09c2\u09c3\6\u00a9\4\2\u09c3\u09c4\5\u0156\u00ac\2\u09c4\u0151\3\2\2"+
		"\2\u09c5\u09d0\5\u0154\u00ab\2\u09c6\u09c8\5\u01c8\u00e5\2\u09c7\u09c6"+
		"\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09cb\7\"\2\2\u09ca"+
		"\u09cc\5\u01c8\u00e5\2\u09cb\u09ca\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd"+
		"\3\2\2\2\u09cd\u09cf\5\u0154\u00ab\2\u09ce\u09c7\3\2\2\2\u09cf\u09d2\3"+
		"\2\2\2\u09d0\u09ce\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u0153\3\2\2\2\u09d2"+
		"\u09d0\3\2\2\2\u09d3\u09d4\5\u0182\u00c2\2\u09d4\u09d5\5\u01c8\u00e5\2"+
		"\u09d5\u09d6\7\u00bb\2\2\u09d6\u09d7\5\u01c8\u00e5\2\u09d7\u09d9\3\2\2"+
		"\2\u09d8\u09d3\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db"+
		"\5\u0182\u00c2\2\u09db\u0155\3\2\2\2\u09dc\u09e0\5\u015a\u00ae\2\u09dd"+
		"\u09e0\5\u01aa\u00d6\2\u09de\u09e0\5\u01a8\u00d5\2\u09df\u09dc\3\2\2\2"+
		"\u09df\u09dd\3\2\2\2\u09df\u09de\3\2\2\2\u09e0\u0157\3\2\2\2\u09e1\u09e2"+
		"\6\u00ad\5\2\u09e2\u09e5\5\u015a\u00ae\2\u09e3\u09e5\5\u01a8\u00d5\2\u09e4"+
		"\u09e1\3\2\2\2\u09e4\u09e3\3\2\2\2\u09e5\u0159\3\2\2\2\u09e6\u09e9\5\u015e"+
		"\u00b0\2\u09e7\u09e9\5\u015c\u00af\2\u09e8\u09e6\3\2\2\2\u09e8\u09e7\3"+
		"\2\2\2\u09e9\u015b\3\2\2\2\u09ea\u09eb\5\u0160\u00b1\2\u09eb\u015d\3\2"+
		"\2\2\u09ec\u09ed\5\u015c\u00af\2\u09ed\u09ee\5\u017e\u00c0\2\u09ee\u015f"+
		"\3\2\2\2\u09ef\u09f3\7\u013d\2\2\u09f0\u09f3\5\u01a6\u00d4\2\u09f1\u09f3"+
		"\5\u0162\u00b2\2\u09f2\u09ef\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f2\u09f1\3"+
		"\2\2\2\u09f3\u0161\3\2\2\2\u09f4\u09f8\7\u012e\2\2\u09f5\u09f7\5\u0164"+
		"\u00b3\2\u09f6\u09f5\3\2\2\2\u09f7\u09fa\3\2\2\2\u09f8\u09f6\3\2\2\2\u09f8"+
		"\u09f9\3\2\2\2\u09f9\u09fb\3\2\2\2\u09fa\u09f8\3\2\2\2\u09fb\u09fc\7\u012f"+
		"\2\2\u09fc\u0163\3\2\2\2\u09fd\u0a00\n\16\2\2\u09fe\u0a00\5\u0162\u00b2"+
		"\2\u09ff\u09fd\3\2\2\2\u09ff\u09fe\3\2\2\2\u0a00\u0165\3\2\2\2\u0a01\u0a03"+
		"\7\62\2\2\u0a02\u0a04\5\u01c8\u00e5\2\u0a03\u0a02\3\2\2\2\u0a03\u0a04"+
		"\3\2\2\2\u0a04\u0a07\3\2\2\2\u0a05\u0a06\7\u0089\2\2\u0a06\u0a08\5\u01c8"+
		"\u00e5\2\u0a07\u0a05\3\2\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09"+
		"\u0a0e\5\u017c\u00bf\2\u0a0a\u0a0c\5\u01c8\u00e5\2\u0a0b\u0a0a\3\2\2\2"+
		"\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0f\5\u016e\u00b8\2\u0a0e"+
		"\u0a0b\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0167\3\2\2\2\u0a10\u0a11\t\17"+
		"\2\2\u0a11\u0169\3\2\2\2\u0a12\u0a13\t\20\2\2\u0a13\u016b\3\2\2\2\u0a14"+
		"\u0a2c\5\u0184\u00c3\2\u0a15\u0a2c\5\u018e\u00c8\2\u0a16\u0a2c\5\u0190"+
		"\u00c9\2\u0a17\u0a19\7\u0126\2\2\u0a18\u0a1a\5\u01c8\u00e5\2\u0a19\u0a18"+
		"\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1d\5\u016c\u00b7"+
		"\2\u0a1c\u0a1e\5\u01c8\u00e5\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3\2\2\2"+
		"\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a20\7\u012d\2\2\u0a20\u0a2c\3\2\2\2\u0a21"+
		"\u0a22\7\u00be\2\2\u0a22\u0a23\5\u01c8\u00e5\2\u0a23\u0a24\5\u016c\u00b7"+
		"\2\u0a24\u0a2c\3\2\2\2\u0a25\u0a26\7\u0089\2\2\u0a26\u0a27\5\u01c8\u00e5"+
		"\2\u0a27\u0a28\5\u016c\u00b7\2\u0a28\u0a2c\3\2\2\2\u0a29\u0a2a\7\'\2\2"+
		"\u0a2a\u0a2c\5\u0182\u00c2\2\u0a2b\u0a14\3\2\2\2\u0a2b\u0a15\3\2\2\2\u0a2b"+
		"\u0a16\3\2\2\2\u0a2b\u0a17\3\2\2\2\u0a2b\u0a21\3\2\2\2\u0a2b\u0a25\3\2"+
		"\2\2\u0a2b\u0a29\3\2\2\2\u0a2c\u016d\3\2\2\2\u0a2d\u0a2f\7\u0129\2\2\u0a2e"+
		"\u0a30\5\u01c8\u00e5\2\u0a2f\u0a2e\3\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a33"+
		"\3\2\2\2\u0a31\u0a34\5\u017a\u00be\2\u0a32\u0a34\5\u0160\u00b1\2\u0a33"+
		"\u0a31\3\2\2\2\u0a33\u0a32\3\2\2\2\u0a34\u016f\3\2\2\2\u0a35\u0a39\6\u00b9"+
		"\6\2\u0a36\u0a3a\5\u0176\u00bc\2\u0a37\u0a3a\5\u0172\u00ba\2\u0a38\u0a3a"+
		"\5\u0174\u00bb\2\u0a39\u0a36\3\2\2\2\u0a39\u0a37\3\2\2\2\u0a39\u0a38\3"+
		"\2\2\2\u0a3a\u0171\3\2\2\2\u0a3b\u0a3d\5\u0158\u00ad\2\u0a3c\u0a3e\5\u01c8"+
		"\u00e5\2\u0a3d\u0a3c\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f"+
		"\u0a40\7#\2\2\u0a40\u0173\3\2\2\2\u0a41\u0a43\5\u0178\u00bd\2\u0a42\u0a44"+
		"\5\u01c8\u00e5\2\u0a43\u0a42\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a45\3"+
		"\2\2\2\u0a45\u0a46\7#\2\2\u0a46\u0a49\3\2\2\2\u0a47\u0a49\5\u0178\u00bd"+
		"\2\u0a48\u0a41\3\2\2\2\u0a48\u0a47\3\2\2\2\u0a49\u0175\3\2\2\2\u0a4a\u0a4b"+
		"\5\u0178\u00bd\2\u0a4b\u0a4c\5\u01c8\u00e5\2\u0a4c\u0a4d\5\u0172\u00ba"+
		"\2\u0a4d\u0177\3\2\2\2\u0a4e\u0a4f\5\u017a\u00be\2\u0a4f\u0179\3\2\2\2"+
		"\u0a50\u0a51\t\21\2\2\u0a51\u017b\3\2\2\2\u0a52\u0a55\5\u0168\u00b5\2"+
		"\u0a53\u0a55\5\u016c\u00b7\2\u0a54\u0a52\3\2\2\2\u0a54\u0a53\3\2\2\2\u0a55"+
		"\u0a5e\3\2\2\2\u0a56\u0a58\5\u01c8\u00e5\2\u0a57\u0a56\3\2\2\2\u0a57\u0a58"+
		"\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5b\7\u0126\2\2\u0a5a\u0a5c\5\u01c8"+
		"\u00e5\2\u0a5b\u0a5a\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d"+
		"\u0a5f\7\u012d\2\2\u0a5e\u0a57\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u017d"+
		"\3\2\2\2\u0a60\u0a61\t\22\2\2\u0a61\u017f\3\2\2\2\u0a62\u0a63\t\23\2\2"+
		"\u0a63\u0181\3\2\2\2\u0a64\u0a66\b\u00c2\1\2\u0a65\u0a67\5\u01c8\u00e5"+
		"\2\u0a66\u0a65\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u0a68\3\2\2\2\u0a68\u0a6a"+
		"\7\u0126\2\2\u0a69\u0a6b\5\u01c8\u00e5\2\u0a6a\u0a69\3\2\2\2\u0a6a\u0a6b"+
		"\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6e\5\u0182\u00c2\2\u0a6d\u0a6f\5"+
		"\u01c8\u00e5\2\u0a6e\u0a6d\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a70\3\2"+
		"\2\2\u0a70\u0a71\7\u012d\2\2\u0a71\u0a8a\3\2\2\2\u0a72\u0a73\7\u00be\2"+
		"\2\u0a73\u0a74\5\u01c8\u00e5\2\u0a74\u0a75\5\u0182\u00c2\26\u0a75\u0a8a"+
		"\3\2\2\2\u0a76\u0a77\7\'\2\2\u0a77\u0a8a\5\u0182\u00c2\25\u0a78\u0a79"+
		"\7\u0089\2\2\u0a79\u0a7a\5\u01c8\u00e5\2\u0a7a\u0a7b\5\u0182\u00c2\24"+
		"\u0a7b\u0a8a\3\2\2\2\u0a7c\u0a7e\7\u0128\2\2\u0a7d\u0a7f\5\u01c8\u00e5"+
		"\2\u0a7e\u0a7d\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a8a"+
		"\5\u0182\u00c2\22\u0a81\u0a83\7\u008a\2\2\u0a82\u0a84\5\u01c8\u00e5\2"+
		"\u0a83\u0a82\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u0a8a"+
		"\5\u0182\u00c2\13\u0a86\u0a8a\5\u0184\u00c3\2\u0a87\u0a8a\5\u018e\u00c8"+
		"\2\u0a88\u0a8a\5\u0190\u00c9\2\u0a89\u0a64\3\2\2\2\u0a89\u0a72\3\2\2\2"+
		"\u0a89\u0a76\3\2\2\2\u0a89\u0a78\3\2\2\2\u0a89\u0a7c\3\2\2\2\u0a89\u0a81"+
		"\3\2\2\2\u0a89\u0a86\3\2\2\2\u0a89\u0a87\3\2\2\2\u0a89\u0a88\3\2\2\2\u0a8a"+
		"\u0af9\3\2\2\2\u0a8b\u0a8d\f\23\2\2\u0a8c\u0a8e\5\u01c8\u00e5\2\u0a8d"+
		"\u0a8c\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0a91\7\u012c"+
		"\2\2\u0a90\u0a92\5\u01c8\u00e5\2\u0a91\u0a90\3\2\2\2\u0a91\u0a92\3\2\2"+
		"\2\u0a92\u0a93\3\2\2\2\u0a93\u0af8\5\u0182\u00c2\24\u0a94\u0a96\f\21\2"+
		"\2\u0a95\u0a97\5\u01c8\u00e5\2\u0a96\u0a95\3\2\2\2\u0a96\u0a97\3\2\2\2"+
		"\u0a97\u0a98\3\2\2\2\u0a98\u0a9a\t\24\2\2\u0a99\u0a9b\5\u01c8\u00e5\2"+
		"\u0a9a\u0a99\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0af8"+
		"\5\u0182\u00c2\22\u0a9d\u0a9f\f\20\2\2\u0a9e\u0aa0\5\u01c8\u00e5\2\u0a9f"+
		"\u0a9e\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1\u0aa3\7\u0121"+
		"\2\2\u0aa2\u0aa4\5\u01c8\u00e5\2\u0aa3\u0aa2\3\2\2\2\u0aa3\u0aa4\3\2\2"+
		"\2\u0aa4\u0aa5\3\2\2\2\u0aa5\u0af8\5\u0182\u00c2\21\u0aa6\u0aa8\f\17\2"+
		"\2\u0aa7\u0aa9\5\u01c8\u00e5\2\u0aa8\u0aa7\3\2\2\2\u0aa8\u0aa9\3\2\2\2"+
		"\u0aa9\u0aaa\3\2\2\2\u0aaa\u0aac\7\u0086\2\2\u0aab\u0aad\5\u01c8\u00e5"+
		"\2\u0aac\u0aab\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u0aae\3\2\2\2\u0aae\u0af8"+
		"\5\u0182\u00c2\20\u0aaf\u0ab1\f\16\2\2\u0ab0\u0ab2\5\u01c8\u00e5\2\u0ab1"+
		"\u0ab0\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab5\t\25"+
		"\2\2\u0ab4\u0ab6\5\u01c8\u00e5\2\u0ab5\u0ab4\3\2\2\2\u0ab5\u0ab6\3\2\2"+
		"\2\u0ab6\u0ab7\3\2\2\2\u0ab7\u0af8\5\u0182\u00c2\17\u0ab8\u0aba\f\r\2"+
		"\2\u0ab9\u0abb\5\u01c8\u00e5\2\u0aba\u0ab9\3\2\2\2\u0aba\u0abb\3\2\2\2"+
		"\u0abb\u0abc\3\2\2\2\u0abc\u0abe\7+\2\2\u0abd\u0abf\5\u01c8\u00e5\2\u0abe"+
		"\u0abd\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0af8\5\u0182"+
		"\u00c2\16\u0ac1\u0ac3\f\f\2\2\u0ac2\u0ac4\5\u01c8\u00e5\2\u0ac3\u0ac2"+
		"\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0ac7\t\20\2\2"+
		"\u0ac6\u0ac8\5\u01c8\u00e5\2\u0ac7\u0ac6\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8"+
		"\u0ac9\3\2\2\2\u0ac9\u0af8\5\u0182\u00c2\r\u0aca\u0acc\f\n\2\2\u0acb\u0acd"+
		"\5\u01c8\u00e5\2\u0acc\u0acb\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0ace\3"+
		"\2\2\2\u0ace\u0ad0\7/\2\2\u0acf\u0ad1\5\u01c8\u00e5\2\u0ad0\u0acf\3\2"+
		"\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0ad2\3\2\2\2\u0ad2\u0af8\5\u0182\u00c2"+
		"\13\u0ad3\u0ad5\f\t\2\2\u0ad4\u0ad6\5\u01c8\u00e5\2\u0ad5\u0ad4\3\2\2"+
		"\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ad9\7\u0097\2\2\u0ad8"+
		"\u0ada\5\u01c8\u00e5\2\u0ad9\u0ad8\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adb"+
		"\3\2\2\2\u0adb\u0af8\5\u0182\u00c2\n\u0adc\u0ade\f\b\2\2\u0add\u0adf\5"+
		"\u01c8\u00e5\2\u0ade\u0add\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0ae0\3\2"+
		"\2\2\u0ae0\u0ae2\7\u00c9\2\2\u0ae1\u0ae3\5\u01c8\u00e5\2\u0ae2\u0ae1\3"+
		"\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u0af8\5\u0182\u00c2"+
		"\t\u0ae5\u0ae7\f\7\2\2\u0ae6\u0ae8\5\u01c8\u00e5\2\u0ae7\u0ae6\3\2\2\2"+
		"\u0ae7\u0ae8\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0aeb\7b\2\2\u0aea\u0aec"+
		"\5\u01c8\u00e5\2\u0aeb\u0aea\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aed\3"+
		"\2\2\2\u0aed\u0af8\5\u0182\u00c2\b\u0aee\u0af0\f\6\2\2\u0aef\u0af1\5\u01c8"+
		"\u00e5\2\u0af0\u0aef\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2"+
		"\u0af4\7t\2\2\u0af3\u0af5\5\u01c8\u00e5\2\u0af4\u0af3\3\2\2\2\u0af4\u0af5"+
		"\3\2\2\2\u0af5\u0af6\3\2\2\2\u0af6\u0af8\5\u0182\u00c2\7\u0af7\u0a8b\3"+
		"\2\2\2\u0af7\u0a94\3\2\2\2\u0af7\u0a9d\3\2\2\2\u0af7\u0aa6\3\2\2\2\u0af7"+
		"\u0aaf\3\2\2\2\u0af7\u0ab8\3\2\2\2\u0af7\u0ac1\3\2\2\2\u0af7\u0aca\3\2"+
		"\2\2\u0af7\u0ad3\3\2\2\2\u0af7\u0adc\3\2\2\2\u0af7\u0ae5\3\2\2\2\u0af7"+
		"\u0aee\3\2\2\2\u0af8\u0afb\3\2\2\2\u0af9\u0af7\3\2\2\2\u0af9\u0afa\3\2"+
		"\2\2\u0afa\u0183\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afc\u0b04\5\u017a\u00be"+
		"\2\u0afd\u0b04\7\u0137\2\2\u0afe\u0b04\7\u0132\2\2\u0aff\u0b01\5\u0186"+
		"\u00c4\2\u0b00\u0b02\5\u017e\u00c0\2\u0b01\u0b00\3\2\2\2\u0b01\u0b02\3"+
		"\2\2\2\u0b02\u0b04\3\2\2\2\u0b03\u0afc\3\2\2\2\u0b03\u0afd\3\2\2\2\u0b03"+
		"\u0afe\3\2\2\2\u0b03\u0aff\3\2\2\2\u0b04\u0185\3\2\2\2\u0b05\u0b09\5\u0188"+
		"\u00c5\2\u0b06\u0b09\5\u018a\u00c6\2\u0b07\u0b09\5\u018c\u00c7\2\u0b08"+
		"\u0b05\3\2\2\2\u0b08\u0b06\3\2\2\2\u0b08\u0b07\3\2\2\2\u0b09\u0187\3\2"+
		"\2\2\u0b0a\u0b0b\t\26\2\2\u0b0b\u0189\3\2\2\2\u0b0c\u0b0d\7\u008b\2\2"+
		"\u0b0d\u018b\3\2\2\2\u0b0e\u0b0f\t\27\2\2\u0b0f\u018d\3\2\2\2\u0b10\u0b11"+
		"\b\u00c8\1\2\u0b11\u0b12\5\u01ac\u00d7\2\u0b12\u0b14\7\u0126\2\2\u0b13"+
		"\u0b15\5\u01c8\u00e5\2\u0b14\u0b13\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15\u0b17"+
		"\3\2\2\2\u0b16\u0b18\5\u0192\u00ca\2\u0b17\u0b16\3\2\2\2\u0b17\u0b18\3"+
		"\2\2\2\u0b18\u0b1a\3\2\2\2\u0b19\u0b1b\5\u01c8\u00e5\2\u0b1a\u0b19\3\2"+
		"\2\2\u0b1a\u0b1b\3\2\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c\u0b1d\7\u012d\2\2\u0b1d"+
		"\u0b2b\3\2\2\2\u0b1e\u0b2b\7\u0085\2\2\u0b1f\u0b2b\5\u015a\u00ae\2\u0b20"+
		"\u0b22\7&\2\2\u0b21\u0b23\5\u01c6\u00e4\2\u0b22\u0b21\3\2\2\2\u0b22\u0b23"+
		"\3\2\2\2\u0b23\u0b24\3\2\2\2\u0b24\u0b2b\5\u0156\u00ac\2\u0b25\u0b27\7"+
		"%\2\2\u0b26\u0b28\5\u01c6\u00e4\2\u0b27\u0b26\3\2\2\2\u0b27\u0b28\3\2"+
		"\2\2\u0b28\u0b29\3\2\2\2\u0b29\u0b2b\5\u0156\u00ac\2\u0b2a\u0b10\3\2\2"+
		"\2\u0b2a\u0b1e\3\2\2\2\u0b2a\u0b1f\3\2\2\2\u0b2a\u0b20\3\2\2\2\u0b2a\u0b25"+
		"\3\2\2\2\u0b2b\u0b5d\3\2\2\2\u0b2c\u0b2d\f\n\2\2\u0b2d\u0b2f\7\u0126\2"+
		"\2\u0b2e\u0b30\5\u01c8\u00e5\2\u0b2f\u0b2e\3\2\2\2\u0b2f\u0b30\3\2\2\2"+
		"\u0b30\u0b32\3\2\2\2\u0b31\u0b33\5\u0192\u00ca\2\u0b32\u0b31\3\2\2\2\u0b32"+
		"\u0b33\3\2\2\2\u0b33\u0b35\3\2\2\2\u0b34\u0b36\5\u01c8\u00e5\2\u0b35\u0b34"+
		"\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b37\3\2\2\2\u0b37\u0b5c\7\u012d\2"+
		"\2\u0b38\u0b3a\f\t\2\2\u0b39\u0b3b\5\u01c6\u00e4\2\u0b3a\u0b39\3\2\2\2"+
		"\u0b3a\u0b3b\3\2\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c\u0b3e\7&\2\2\u0b3d\u0b3f"+
		"\5\u01c6\u00e4\2\u0b3e\u0b3d\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u0b40\3"+
		"\2\2\2\u0b40\u0b5c\5\u0156\u00ac\2\u0b41\u0b43\f\b\2\2\u0b42\u0b44\5\u01c6"+
		"\u00e4\2\u0b43\u0b42\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45"+
		"\u0b47\7%\2\2\u0b46\u0b48\5\u01c6\u00e4\2\u0b47\u0b46\3\2\2\2\u0b47\u0b48"+
		"\3\2\2\2\u0b48\u0b49\3\2\2\2\u0b49\u0b5c\5\u0156\u00ac\2\u0b4a\u0b4b\f"+
		"\3\2\2\u0b4b\u0b4d\5\u01c6\u00e4\2\u0b4c\u0b4e\5\u01c8\u00e5\2\u0b4d\u0b4c"+
		"\3\2\2\2\u0b4d\u0b4e\3\2\2\2\u0b4e\u0b4f\3\2\2\2\u0b4f\u0b51\7\u0126\2"+
		"\2\u0b50\u0b52\5\u01c8\u00e5\2\u0b51\u0b50\3\2\2\2\u0b51\u0b52\3\2\2\2"+
		"\u0b52\u0b54\3\2\2\2\u0b53\u0b55\5\u0192\u00ca\2\u0b54\u0b53\3\2\2\2\u0b54"+
		"\u0b55\3\2\2\2\u0b55\u0b57\3\2\2\2\u0b56\u0b58\5\u01c8\u00e5\2\u0b57\u0b56"+
		"\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58\u0b59\3\2\2\2\u0b59\u0b5a\7\u012d\2"+
		"\2\u0b5a\u0b5c\3\2\2\2\u0b5b\u0b2c\3\2\2\2\u0b5b\u0b38\3\2\2\2\u0b5b\u0b41"+
		"\3\2\2\2\u0b5b\u0b4a\3\2\2\2\u0b5c\u0b5f\3\2\2\2\u0b5d\u0b5b\3\2\2\2\u0b5d"+
		"\u0b5e\3\2\2\2\u0b5e\u018f\3\2\2\2\u0b5f\u0b5d\3\2\2\2\u0b60\u0b76\5\u0168"+
		"\u00b5\2\u0b61\u0b63\7\u012e\2\2\u0b62\u0b64\5\u01c8\u00e5\2\u0b63\u0b62"+
		"\3\2\2\2\u0b63\u0b64\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65\u0b67\5\u0168\u00b5"+
		"\2\u0b66\u0b68\5\u01c8\u00e5\2\u0b67\u0b66\3\2\2\2\u0b67\u0b68\3\2\2\2"+
		"\u0b68\u0b69\3\2\2\2\u0b69\u0b6a\7\u012f\2\2\u0b6a\u0b76\3\2\2\2\u0b6b"+
		"\u0b76\7\u008d\2\2\u0b6c\u0b6e\7\u012e\2\2\u0b6d\u0b6f\5\u01c8\u00e5\2"+
		"\u0b6e\u0b6d\3\2\2\2\u0b6e\u0b6f\3\2\2\2\u0b6f\u0b70\3\2\2\2\u0b70\u0b72"+
		"\7\u008d\2\2\u0b71\u0b73\5\u01c8\u00e5\2\u0b72\u0b71\3\2\2\2\u0b72\u0b73"+
		"\3\2\2\2\u0b73\u0b74\3\2\2\2\u0b74\u0b76\7\u012f\2\2\u0b75\u0b60\3\2\2"+
		"\2\u0b75\u0b61\3\2\2\2\u0b75\u0b6b\3\2\2\2\u0b75\u0b6c\3\2\2\2\u0b76\u0191"+
		"\3\2\2\2\u0b77\u0b79\5\u01c8\u00e5\2\u0b78\u0b77\3\2\2\2\u0b78\u0b79\3"+
		"\2\2\2\u0b79\u0b8a\3\2\2\2\u0b7a\u0b7c\5\u0196\u00cc\2\u0b7b\u0b7a\3\2"+
		"\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c\u0b87\3\2\2\2\u0b7d\u0b7f\5\u01c8\u00e5"+
		"\2\u0b7e\u0b7d\3\2\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u0b80\3\2\2\2\u0b80\u0b82"+
		"\7\"\2\2\u0b81\u0b83\5\u01c8\u00e5\2\u0b82\u0b81\3\2\2\2\u0b82\u0b83\3"+
		"\2\2\2\u0b83\u0b84\3\2\2\2\u0b84\u0b86\5\u0196\u00cc\2\u0b85\u0b7e\3\2"+
		"\2\2\u0b86\u0b89\3\2\2\2\u0b87\u0b85\3\2\2\2\u0b87\u0b88\3\2\2\2\u0b88"+
		"\u0b8b\3\2\2\2\u0b89\u0b87\3\2\2\2\u0b8a\u0b8b\3\2\2\2\u0b8a\u0b7b\3\2"+
		"\2\2\u0b8b\u0193\3\2\2\2\u0b8c\u0b8d\5\u0196\u00cc\2\u0b8d\u0195\3\2\2"+
		"\2\u0b8e\u0b92\5\u0198\u00cd\2\u0b8f\u0b92\5\u019a\u00ce\2\u0b90\u0b92"+
		"\5\u019c\u00cf\2\u0b91\u0b8e\3\2\2\2\u0b91\u0b8f\3\2\2\2\u0b91\u0b90\3"+
		"\2\2\2\u0b92\u0197\3\2\2\2\u0b93\u0b94\5\u019e\u00d0\2\u0b94\u0199\3\2"+
		"\2\2\u0b95\u0b97\5\u0156\u00ac\2\u0b96\u0b98\5\u01c8\u00e5\2\u0b97\u0b96"+
		"\3\2\2\2\u0b97\u0b98\3\2\2\2\u0b98\u0b99\3\2\2\2\u0b99\u0b9b\7\u011f\2"+
		"\2\u0b9a\u0b9c\5\u01c8\u00e5\2\u0b9b\u0b9a\3\2\2\2\u0b9b\u0b9c\3\2\2\2"+
		"\u0b9c\u0b9d\3\2\2\2\u0b9d\u0b9e\5\u019e\u00d0\2\u0b9e\u019b\3\2\2\2\u0b9f"+
		"\u0ba0\3\2\2\2\u0ba0\u019d\3\2\2\2\u0ba1\u0ba2\7\67\2\2\u0ba2\u0ba4\5"+
		"\u01c8\u00e5\2\u0ba3\u0ba1\3\2\2\2\u0ba3\u0ba4\3\2\2\2\u0ba4\u0ba5\3\2"+
		"\2\2\u0ba5\u0bae\5\u0182\u00c2\2\u0ba6\u0bae\5\u01a4\u00d3\2\u0ba7\u0ba8"+
		"\5\u01a0\u00d1\2\u0ba8\u0ba9\5\u01c8\u00e5\2\u0ba9\u0baa\7\u00bb\2\2\u0baa"+
		"\u0bab\5\u01c8\u00e5\2\u0bab\u0bac\5\u01a2\u00d2\2\u0bac\u0bae\3\2\2\2"+
		"\u0bad\u0ba3\3\2\2\2\u0bad\u0ba6\3\2\2\2\u0bad\u0ba7\3\2\2\2\u0bae\u019f"+
		"\3\2\2\2\u0baf\u0bb0\5\u0182\u00c2\2\u0bb0\u01a1\3\2\2\2\u0bb1\u0bb2\5"+
		"\u0182\u00c2\2\u0bb2\u01a3\3\2\2\2\u0bb3\u0bb4\7-\2\2\u0bb4\u0bb5\5\u01c8"+
		"\u00e5\2\u0bb5\u0bb6\5\u0182\u00c2\2\u0bb6\u01a5\3\2\2\2\u0bb7\u0bb8\t"+
		"\30\2\2\u0bb8\u01a7\3\2\2\2\u0bb9\u0bba\7\62\2\2\u0bba\u01a9\3\2\2\2\u0bbb"+
		"\u0bbc\t\31\2\2\u0bbc\u01ab\3\2\2\2\u0bbd\u0bbe\t\32\2\2\u0bbe\u01ad\3"+
		"\2\2\2\u0bbf\u0bc1\5\u01c8\u00e5\2\u0bc0\u0bbf\3\2\2\2\u0bc0\u0bc1\3\2"+
		"\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2\u0bc4\7\u0138\2\2\u0bc3\u0bc5\5\u01c8\u00e5"+
		"\2\u0bc4\u0bc3\3\2\2\2\u0bc4\u0bc5\3\2\2\2\u0bc5\u0bcb\3\2\2\2\u0bc6\u0bc8"+
		"\5\u01c8\u00e5\2\u0bc7\u0bc6\3\2\2\2\u0bc7\u0bc8\3\2\2\2\u0bc8\u0bc9\3"+
		"\2\2\2\u0bc9\u0bcb\5\u01b4\u00db\2\u0bca\u0bc0\3\2\2\2\u0bca\u0bc7\3\2"+
		"\2\2\u0bcb\u01af\3\2\2\2\u0bcc\u0bce\5\u01b2\u00da\2\u0bcd\u0bcc\3\2\2"+
		"\2\u0bce\u0bcf\3\2\2\2\u0bcf\u0bcd\3\2\2\2\u0bcf\u0bd0\3\2\2\2\u0bd0\u0bd6"+
		"\3\2\2\2\u0bd1\u0bd3\5\u01c8\u00e5\2\u0bd2\u0bd1\3\2\2\2\u0bd2\u0bd3\3"+
		"\2\2\2\u0bd3\u0bd4\3\2\2\2\u0bd4\u0bd6\7\2\2\3\u0bd5\u0bcd\3\2\2\2\u0bd5"+
		"\u0bd2\3\2\2\2\u0bd6\u01b1\3\2\2\2\u0bd7\u0bd9\5\u01ae\u00d8\2\u0bd8\u0bda"+
		"\5\u01c8\u00e5\2\u0bd9\u0bd8\3\2\2\2\u0bd9\u0bda\3\2\2\2\u0bda\u0be3\3"+
		"\2\2\2\u0bdb\u0bdd\5\u01c8\u00e5\2\u0bdc\u0bdb\3\2\2\2\u0bdc\u0bdd\3\2"+
		"\2\2\u0bdd\u0bde\3\2\2\2\u0bde\u0be0\7#\2\2\u0bdf\u0be1\5\u01c8\u00e5"+
		"\2\u0be0\u0bdf\3\2\2\2\u0be0\u0be1\3\2\2\2\u0be1\u0be3\3\2\2\2\u0be2\u0bd7"+
		"\3\2\2\2\u0be2\u0bdc\3\2\2\2\u0be3\u01b3\3\2\2\2\u0be4\u0be8\5\u01bc\u00df"+
		"\2\u0be5\u0be8\5\u01b6\u00dc\2\u0be6\u0be8\5\u01b8\u00dd\2\u0be7\u0be4"+
		"\3\2\2\2\u0be7\u0be5\3\2\2\2\u0be7\u0be6\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9"+
		"\u0bea\t\33\2\2\u0bea\u01b5\3\2\2\2\u0beb\u0bed\7\u00a8\2\2\u0bec\u0bee"+
		"\5\u01c8\u00e5\2\u0bed\u0bec\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0bef\3"+
		"\2\2\2\u0bef\u0bf0\5\u01ba\u00de\2\u0bf0\u01b7\3\2\2\2\u0bf1\u0bf2\7\u0139"+
		"\2\2\u0bf2\u0bf3\5\u01ba\u00de\2\u0bf3\u01b9\3\2\2\2\u0bf4\u0bf6\n\34"+
		"\2\2\u0bf5\u0bf4\3\2\2\2\u0bf6\u0bf9\3\2\2\2\u0bf7\u0bf5\3\2\2\2\u0bf7"+
		"\u0bf8\3\2\2\2\u0bf8\u01bb\3\2\2\2\u0bf9\u0bf7\3\2\2\2\u0bfa\u0c00\7\u0139"+
		"\2\2\u0bfb\u0bfc\7(\2\2\u0bfc\u0bfe\5\u01be\u00e0\2\u0bfd\u0bff\5\u01c8"+
		"\u00e5\2\u0bfe\u0bfd\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff\u0c01\3\2\2\2\u0c00"+
		"\u0bfb\3\2\2\2\u0c01\u0c02\3\2\2\2\u0c02\u0c00\3\2\2\2\u0c02\u0c03\3\2"+
		"\2\2\u0c03\u0c06\3\2\2\2\u0c04\u0c05\7#\2\2\u0c05\u0c07\5\u01ba\u00de"+
		"\2\u0c06\u0c04\3\2\2\2\u0c06\u0c07\3\2\2\2\u0c07\u01bd\3\2\2\2\u0c08\u0c0a"+
		"\5\u01c0\u00e1\2\u0c09\u0c0b\5\u01c2\u00e2\2\u0c0a\u0c09\3\2\2\2\u0c0a"+
		"\u0c0b\3\2\2\2\u0c0b\u01bf\3\2\2\2\u0c0c\u0c0d\5\u0156\u00ac\2\u0c0d\u01c1"+
		"\3\2\2\2\u0c0e\u0c0f\5\u01c8\u00e5\2\u0c0f\u0c10\5\u01c4\u00e3\2\u0c10"+
		"\u0c4b\3\2\2\2\u0c11\u0c12\5\u01c8\u00e5\2\u0c12\u0c1b\5\u01c4\u00e3\2"+
		"\u0c13\u0c15\5\u01c8\u00e5\2\u0c14\u0c13\3\2\2\2\u0c14\u0c15\3\2\2\2\u0c15"+
		"\u0c16\3\2\2\2\u0c16\u0c18\7\"\2\2\u0c17\u0c19\5\u01c8\u00e5\2\u0c18\u0c17"+
		"\3\2\2\2\u0c18\u0c19\3\2\2\2\u0c19\u0c1a\3\2\2\2\u0c1a\u0c1c\5\u01c4\u00e3"+
		"\2\u0c1b\u0c14\3\2\2\2\u0c1c\u0c1d\3\2\2\2\u0c1d\u0c1b\3\2\2\2\u0c1d\u0c1e"+
		"\3\2\2\2\u0c1e\u0c4b\3\2\2\2\u0c1f\u0c21\5\u01c8\u00e5\2\u0c20\u0c1f\3"+
		"\2\2\2\u0c20\u0c21\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22\u0c24\7\u0126\2\2"+
		"\u0c23\u0c25\5\u01c8\u00e5\2\u0c24\u0c23\3\2\2\2\u0c24\u0c25\3\2\2\2\u0c25"+
		"\u0c26\3\2\2\2\u0c26\u0c4b\7\u012d\2\2\u0c27\u0c29\5\u01c8\u00e5\2\u0c28"+
		"\u0c27\3\2\2\2\u0c28\u0c29\3\2\2\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0c2c\7\u0126"+
		"\2\2\u0c2b\u0c2d\5\u01c8\u00e5\2\u0c2c\u0c2b\3\2\2\2\u0c2c\u0c2d\3\2\2"+
		"\2\u0c2d\u0c2e\3\2\2\2\u0c2e\u0c30\5\u01c4\u00e3\2\u0c2f\u0c31\5\u01c8"+
		"\u00e5\2\u0c30\u0c2f\3\2\2\2\u0c30\u0c31\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32"+
		"\u0c33\7\u012d\2\2\u0c33\u0c4b\3\2\2\2\u0c34\u0c36\5\u01c8\u00e5\2\u0c35"+
		"\u0c34\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36\u0c37\3\2\2\2\u0c37\u0c38\7\u0126"+
		"\2\2\u0c38\u0c41\5\u01c4\u00e3\2\u0c39\u0c3b\5\u01c8\u00e5\2\u0c3a\u0c39"+
		"\3\2\2\2\u0c3a\u0c3b\3\2\2\2\u0c3b\u0c3c\3\2\2\2\u0c3c\u0c3e\7\"\2\2\u0c3d"+
		"\u0c3f\5\u01c8\u00e5\2\u0c3e\u0c3d\3\2\2\2\u0c3e\u0c3f\3\2\2\2\u0c3f\u0c40"+
		"\3\2\2\2\u0c40\u0c42\5\u01c4\u00e3\2\u0c41\u0c3a\3\2\2\2\u0c42\u0c43\3"+
		"\2\2\2\u0c43\u0c41\3\2\2\2\u0c43\u0c44\3\2\2\2\u0c44\u0c46\3\2\2\2\u0c45"+
		"\u0c47\5\u01c8\u00e5\2\u0c46\u0c45\3\2\2\2\u0c46\u0c47\3\2\2\2\u0c47\u0c48"+
		"\3\2\2\2\u0c48\u0c49\7\u012d\2\2\u0c49\u0c4b\3\2\2\2\u0c4a\u0c0e\3\2\2"+
		"\2\u0c4a\u0c11\3\2\2\2\u0c4a\u0c20\3\2\2\2\u0c4a\u0c28\3\2\2\2\u0c4a\u0c35"+
		"\3\2\2\2\u0c4b\u01c3\3\2\2\2\u0c4c\u0c4d\5\u0182\u00c2\2\u0c4d\u01c5\3"+
		"\2\2\2\u0c4e\u0c52\7\u013e\2\2\u0c4f\u0c51\7\u013b\2\2\u0c50\u0c4f\3\2"+
		"\2\2\u0c51\u0c54\3\2\2\2\u0c52\u0c50\3\2\2\2\u0c52\u0c53\3\2\2\2\u0c53"+
		"\u01c7\3\2\2\2\u0c54\u0c52\3\2\2\2\u0c55\u0c57\t\35\2\2\u0c56\u0c55\3"+
		"\2\2\2\u0c57\u0c58\3\2\2\2\u0c58\u0c56\3\2\2\2\u0c58\u0c59\3\2\2\2\u0c59"+
		"\u01c9\3\2\2\2\u01ff\u01ce\u01d2\u01d6\u01d9\u01e1\u01e7\u01ea\u01f1\u01f5"+
		"\u01f9\u01fd\u0201\u020a\u020f\u0211\u0217\u0219\u0224\u0229\u022b\u0232"+
		"\u0235\u0239\u023e\u0246\u0249\u024b\u0250\u0253\u025a\u0261\u0268\u026c"+
		"\u0270\u0274\u0279\u0285\u0292\u0295\u02a1\u02a4\u02ab\u02b3\u02ba\u02c3"+
		"\u02c8\u02cb\u02ce\u02f6\u0306\u030e\u0313\u0318\u0321\u0335\u0339\u0341"+
		"\u034c\u0352\u0356\u035b\u0362\u0366\u0370\u0374\u0377\u037d\u0383\u038d"+
		"\u0391\u0394\u039a\u039e\u03a8\u03ac\u03b6\u03ba\u03be\u03ca\u03ce\u03d1"+
		"\u03d5\u03da\u03e1\u03e5\u03ea\u03f2\u03f6\u03fa\u0402\u0405\u0409\u040d"+
		"\u0417\u041b\u041e\u0424\u0428\u042e\u0432\u0437\u0440\u0444\u0447\u044a"+
		"\u044e\u045a\u045e\u0461\u0464\u0468\u0471\u0477\u047b\u0480\u0487\u048a"+
		"\u048e\u0495\u049b\u04a3\u04ad\u04b0\u04b3\u04b8\u04bc\u04c0\u04c4\u04c9"+
		"\u04cc\u04cf\u04d5\u04d9\u04dd\u04e1\u04e5\u04e8\u04eb\u04ee\u04f1\u04f4"+
		"\u04f8\u0500\u0504\u0509\u0511\u0523\u0526\u0532\u0535\u053d\u0540\u0548"+
		"\u054d\u0556\u055d\u0561\u0564\u056e\u0572\u0577\u0581\u0587\u0599\u059d"+
		"\u05a0\u05a6\u05a9\u05ad\u05b0\u05ba\u05bf\u05c5\u05c9\u05cc\u05d2\u05d5"+
		"\u05d9\u05dc\u05e6\u05ea\u05ee\u05f2\u05f5\u05f8\u05fb\u0600\u0603\u060b"+
		"\u0620\u0623\u0628\u062c\u062f\u0632\u0635\u0638\u064a\u064e\u0656\u065a"+
		"\u065e\u0662\u0668\u066c\u0670\u0674\u0677\u067d\u0680\u0684\u0688\u068b"+
		"\u068f\u0694\u0696\u069a\u069e\u06a1\u06a5\u06a8\u06b4\u06b8\u06bc\u06c4"+
		"\u06c8\u06d6\u06e0\u06e4\u06e9\u06f4\u06f8\u06fd\u0703\u0707\u070d\u0710"+
		"\u0715\u071a\u071d\u0725\u072b\u072f\u0735\u0738\u073d\u0740\u0748\u074e"+
		"\u0752\u0758\u075b\u0760\u0763\u076b\u0772\u0776\u0779\u077c\u077f\u0783"+
		"\u0787\u078c\u0791\u0799\u079f\u07a3\u07a8\u07af\u07b4\u07b8\u07bc\u07c0"+
		"\u07c4\u07c8\u07ca\u07ce\u07d2\u07d8\u07e4\u07e6\u07ec\u07ee\u07f6\u07fa"+
		"\u080a\u080e\u0813\u0816\u081b\u081f\u0822\u0825\u0828\u082b\u0835\u0839"+
		"\u083e\u0846\u084e\u0850\u0854\u085f\u0869\u086d\u0874\u0878\u087c\u0880"+
		"\u0883\u0888\u088b\u0893\u089b\u08a9\u08ad\u08b1\u08bc\u08c2\u08c5\u08c8"+
		"\u08ce\u08d2\u08d7\u08dc\u08de\u08e4\u08ef\u08f4\u08fa\u08fe\u0903\u0908"+
		"\u090c\u0910\u0912\u0915\u091a\u0922\u0925\u092f\u0932\u093a\u093c\u093f"+
		"\u0944\u0946\u094a\u094e\u0951\u0954\u0958\u095b\u095f\u0963\u0965\u096b"+
		"\u096d\u0971\u0975\u097a\u097e\u0982\u0984\u098a\u098e\u0994\u0998\u099a"+
		"\u09a0\u09a3\u09a7\u09ab\u09ae\u09b2\u09b6\u09ba\u09be\u09c7\u09cb\u09d0"+
		"\u09d8\u09df\u09e4\u09e8\u09f2\u09f8\u09ff\u0a03\u0a07\u0a0b\u0a0e\u0a19"+
		"\u0a1d\u0a2b\u0a2f\u0a33\u0a39\u0a3d\u0a43\u0a48\u0a54\u0a57\u0a5b\u0a5e"+
		"\u0a66\u0a6a\u0a6e\u0a7e\u0a83\u0a89\u0a8d\u0a91\u0a96\u0a9a\u0a9f\u0aa3"+
		"\u0aa8\u0aac\u0ab1\u0ab5\u0aba\u0abe\u0ac3\u0ac7\u0acc\u0ad0\u0ad5\u0ad9"+
		"\u0ade\u0ae2\u0ae7\u0aeb\u0af0\u0af4\u0af7\u0af9\u0b01\u0b03\u0b08\u0b14"+
		"\u0b17\u0b1a\u0b22\u0b27\u0b2a\u0b2f\u0b32\u0b35\u0b3a\u0b3e\u0b43\u0b47"+
		"\u0b4d\u0b51\u0b54\u0b57\u0b5b\u0b5d\u0b63\u0b67\u0b6e\u0b72\u0b75\u0b78"+
		"\u0b7b\u0b7e\u0b82\u0b87\u0b8a\u0b91\u0b97\u0b9b\u0ba3\u0bad\u0bc0\u0bc4"+
		"\u0bc7\u0bca\u0bcf\u0bd2\u0bd5\u0bd9\u0bdc\u0be0\u0be2\u0be7\u0bed\u0bf7"+
		"\u0bfe\u0c02\u0c06\u0c0a\u0c14\u0c18\u0c1d\u0c20\u0c24\u0c28\u0c2c\u0c30"+
		"\u0c35\u0c3a\u0c3e\u0c43\u0c46\u0c4a\u0c52\u0c58";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}