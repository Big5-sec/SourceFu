// Generated from Powershell.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PowershellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, MultiLineComment=101, 
		SingleLineComment=102, WhiteSpaces=103, FORMATOPERATOR=104, VARIABLE=105, 
		COMMANDPARAMETER=106, DEQ=107, DNE=108, DGE=109, DGT=110, DLT=111, DLE=112, 
		DIEQ=113, DINE=114, DIGE=115, DIGT=116, DILT=117, DILE=118, DCEQ=119, 
		DCNE=120, DCGE=121, DCGT=122, DCLT=123, CLE=124, DLIKE=125, DNOTLIKE=126, 
		DMATCH=127, DNOTMATCH=128, DILIKE=129, DINOTLIKE=130, DIMATCH=131, DINOTMATCH=132, 
		DCLIKE=133, DCNOTLIKE=134, DCMATCH=135, DCNOTMATCH=136, DCONTAINS=137, 
		DNOTCONTAINS=138, DICONTAINS=139, DINOTCONTAINS=140, DCCONTAINS=141, DCNOTCONTAINS=142, 
		DISNOT=143, DIS=144, DAS=145, DREPLACE=146, DIREPLACE=147, DCREPLACE=148, 
		STATEMENTTERMINATOR=149, NEWLINES=150, STRINGLITERAL=151, STRINGLITERALWITHSUBEXPRESSION=152, 
		GENERICTOKENWITHSUBEXPRSTART=153, TYPENAMEIDENTIFIERCHAR=154, TYPELITERAL=155, 
		LABEL=156, LITERAL=157, SIMPLENAME=158, PROPERTYNAME=159;
	public static final int
		RULE_startRule = 0, RULE_scriptBlock = 1, RULE_parameterList = 2, RULE_scriptParameter = 3, 
		RULE_scriptParameterDefault = 4, RULE_attributeList = 5, RULE_attribute = 6, 
		RULE_attributeName = 7, RULE_attributeArguments = 8, RULE_attributeArgument = 9, 
		RULE_typeSpec = 10, RULE_arrayTypeName = 11, RULE_genericTypeName = 12, 
		RULE_dimension = 13, RULE_genericTypeArguments = 14, RULE_typeName = 15, 
		RULE_namespaceTypeName = 16, RULE_assemblyNameSpec = 17, RULE_nestedTypeName = 18, 
		RULE_namespaceSpec = 19, RULE_typeNameIDENTIFIER = 20, RULE_scriptBlockBody = 21, 
		RULE_statementBlock = 22, RULE_statementList = 23, RULE_statement = 24, 
		RULE_labeledStatement = 25, RULE_flowControlStatement = 26, RULE_labelExpression = 27, 
		RULE_keyExpression = 28, RULE_ifStatement = 29, RULE_elseifClauses = 30, 
		RULE_elseifClause = 31, RULE_elseClause = 32, RULE_switchStatement = 33, 
		RULE_switchParameters = 34, RULE_switchParameter = 35, RULE_switchCondition = 36, 
		RULE_switchFilename = 37, RULE_switchBody = 38, RULE_switchClauses = 39, 
		RULE_switchClause = 40, RULE_switchClauseCondition = 41, RULE_configurationStatement = 42, 
		RULE_singleNameExpression = 43, RULE_foreachStatement = 44, RULE_foreachParameters = 45, 
		RULE_foreachParameter = 46, RULE_foreachThrottleLimit = 47, RULE_forStatement = 48, 
		RULE_forInitializer = 49, RULE_forCondition = 50, RULE_forIterator = 51, 
		RULE_whileStatement = 52, RULE_doStatement = 53, RULE_whileCondition = 54, 
		RULE_classStatement = 55, RULE_className = 56, RULE_baseTypeList = 57, 
		RULE_baseClassList = 58, RULE_baseClass = 59, RULE_classMemberList = 60, 
		RULE_classMember = 61, RULE_methodMember = 62, RULE_propertyMember = 63, 
		RULE_memberAttributeList = 64, RULE_memberAttribute = 65, RULE_enumStatement = 66, 
		RULE_enumName = 67, RULE_enumMemberList = 68, RULE_enumMember = 69, RULE_enumMemberName = 70, 
		RULE_methodStatement = 71, RULE_baseCtorCall = 72, RULE_functionStatement = 73, 
		RULE_functionName = 74, RULE_functionParameterDeclaration = 75, RULE_trapStatement = 76, 
		RULE_tryStatement = 77, RULE_catchClauses = 78, RULE_catchClause = 79, 
		RULE_catchTypeList = 80, RULE_finallyClause = 81, RULE_dataStatement = 82, 
		RULE_dataName = 83, RULE_dataCommandsAllowed = 84, RULE_dataCommandsList = 85, 
		RULE_dataCommand = 86, RULE_pipeline = 87, RULE_assignmentExpression = 88, 
		RULE_pipelineTail = 89, RULE_redirections = 90, RULE_redirection = 91, 
		RULE_redirectedFileName = 92, RULE_command = 93, RULE_commandInvocationOperator = 94, 
		RULE_commandModule = 95, RULE_commandName = 96, RULE_genericToken = 97, 
		RULE_commandNameExpr = 98, RULE_commandElement = 99, RULE_commandArgument = 100, 
		RULE_expression = 101, RULE_value = 102, RULE_statementTerminators = 103, 
		RULE_parenthesizedExpression = 104, RULE_memberName = 105, RULE_argumentList = 106, 
		RULE_argumentExpressionList = 107, RULE_argumentExpression = 108, RULE_blockName = 109, 
		RULE_comparisonOperator = 110, RULE_assignmentOperator = 111, RULE_mergingredirectionoperator = 112, 
		RULE_fileredirectionoperator = 113;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "scriptBlock", "parameterList", "scriptParameter", "scriptParameterDefault", 
			"attributeList", "attribute", "attributeName", "attributeArguments", 
			"attributeArgument", "typeSpec", "arrayTypeName", "genericTypeName", 
			"dimension", "genericTypeArguments", "typeName", "namespaceTypeName", 
			"assemblyNameSpec", "nestedTypeName", "namespaceSpec", "typeNameIDENTIFIER", 
			"scriptBlockBody", "statementBlock", "statementList", "statement", "labeledStatement", 
			"flowControlStatement", "labelExpression", "keyExpression", "ifStatement", 
			"elseifClauses", "elseifClause", "elseClause", "switchStatement", "switchParameters", 
			"switchParameter", "switchCondition", "switchFilename", "switchBody", 
			"switchClauses", "switchClause", "switchClauseCondition", "configurationStatement", 
			"singleNameExpression", "foreachStatement", "foreachParameters", "foreachParameter", 
			"foreachThrottleLimit", "forStatement", "forInitializer", "forCondition", 
			"forIterator", "whileStatement", "doStatement", "whileCondition", "classStatement", 
			"className", "baseTypeList", "baseClassList", "baseClass", "classMemberList", 
			"classMember", "methodMember", "propertyMember", "memberAttributeList", 
			"memberAttribute", "enumStatement", "enumName", "enumMemberList", "enumMember", 
			"enumMemberName", "methodStatement", "baseCtorCall", "functionStatement", 
			"functionName", "functionParameterDeclaration", "trapStatement", "tryStatement", 
			"catchClauses", "catchClause", "catchTypeList", "finallyClause", "dataStatement", 
			"dataName", "dataCommandsAllowed", "dataCommandsList", "dataCommand", 
			"pipeline", "assignmentExpression", "pipelineTail", "redirections", "redirection", 
			"redirectedFileName", "command", "commandInvocationOperator", "commandModule", 
			"commandName", "genericToken", "commandNameExpr", "commandElement", "commandArgument", 
			"expression", "value", "statementTerminators", "parenthesizedExpression", 
			"memberName", "argumentList", "argumentExpressionList", "argumentExpression", 
			"blockName", "comparisonOperator", "assignmentOperator", "mergingredirectionoperator", 
			"fileredirectionoperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'['", "'('", "')'", "']'", "'.'", "'+'", "'{'", 
			"'}'", "'break'", "'continue'", "'throw'", "'return'", "'exit'", "'if'", 
			"'elseif'", "'else'", "'switch'", "'-regex'", "'-wildcard'", "'-exact'", 
			"'-casesensitive'", "'-parallel'", "'-file'", "'configuration'", "'foreach'", 
			"'in'", "'-throttelimit'", "'for'", "'while'", "'do'", "'until'", "'class'", 
			"':'", "'static'", "'hidden'", "'enum'", "'base'", "'function'", "'filter'", 
			"'workflow'", "'trap'", "'try'", "'catch'", "'finally'", "'data'", "'-suportedcommand'", 
			"'|'", "'&'", "'::'", "'-join'", "'-split'", "'++'", "'--'", "'-'", "'-not'", 
			"'-bnot'", "'!'", "'..'", "'*'", "'/'", "'%'", "'-bxor'", "'-bor'", "'-band'", 
			"'-xor'", "'-or'", "'-and'", "'dynamicparam'", "'begin'", "'process'", 
			"'end'", "'+='", "'-='", "'*='", "'/='", "'%='", "'2>&1'", "'3>&1'", 
			"'4>&1'", "'5>&1'", "'6>&1'", "'1>&2'", "'>>'", "'>'", "'<<'", "'<'", 
			"'>|'", "'2>'", "'2>>'", "'1>>'", "'3>'", "'3>>'", "'4>'", "'4>>'", "'5>'", 
			"'5>>'", "'*>'", "'*>>'", null, null, null, "'-f'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "MultiLineComment", "SingleLineComment", 
			"WhiteSpaces", "FORMATOPERATOR", "VARIABLE", "COMMANDPARAMETER", "DEQ", 
			"DNE", "DGE", "DGT", "DLT", "DLE", "DIEQ", "DINE", "DIGE", "DIGT", "DILT", 
			"DILE", "DCEQ", "DCNE", "DCGE", "DCGT", "DCLT", "CLE", "DLIKE", "DNOTLIKE", 
			"DMATCH", "DNOTMATCH", "DILIKE", "DINOTLIKE", "DIMATCH", "DINOTMATCH", 
			"DCLIKE", "DCNOTLIKE", "DCMATCH", "DCNOTMATCH", "DCONTAINS", "DNOTCONTAINS", 
			"DICONTAINS", "DINOTCONTAINS", "DCCONTAINS", "DCNOTCONTAINS", "DISNOT", 
			"DIS", "DAS", "DREPLACE", "DIREPLACE", "DCREPLACE", "STATEMENTTERMINATOR", 
			"NEWLINES", "STRINGLITERAL", "STRINGLITERALWITHSUBEXPRESSION", "GENERICTOKENWITHSUBEXPRSTART", 
			"TYPENAMEIDENTIFIERCHAR", "TYPELITERAL", "LABEL", "LITERAL", "SIMPLENAME", 
			"PROPERTYNAME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Powershell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PowershellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PowershellParser.EOF, 0); }
		public ScriptBlockBodyContext scriptBlockBody() {
			return getRuleContext(ScriptBlockBodyContext.class,0);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(228);
				scriptBlockBody();
				}
				break;
			}
			setState(231);
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

	public static class ScriptBlockContext extends ParserRuleContext {
		public ScriptBlockBodyContext scriptBlockBody() {
			return getRuleContext(ScriptBlockBodyContext.class,0);
		}
		public ScriptBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterScriptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitScriptBlock(this);
		}
	}

	public final ScriptBlockContext scriptBlock() throws RecognitionException {
		ScriptBlockContext _localctx = new ScriptBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(233);
				scriptBlockBody();
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ScriptParameterContext> scriptParameter() {
			return getRuleContexts(ScriptParameterContext.class);
		}
		public ScriptParameterContext scriptParameter(int i) {
			return getRuleContext(ScriptParameterContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			scriptParameter();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINES) {
						{
						setState(237);
						match(NEWLINES);
						}
					}

					setState(240);
					match(T__0);
					setState(241);
					scriptParameter();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ScriptParameterContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PowershellParser.VARIABLE, 0); }
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ScriptParameterDefaultContext scriptParameterDefault() {
			return getRuleContext(ScriptParameterDefaultContext.class,0);
		}
		public ScriptParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterScriptParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitScriptParameter(this);
		}
	}

	public final ScriptParameterContext scriptParameter() throws RecognitionException {
		ScriptParameterContext _localctx = new ScriptParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(247);
				match(NEWLINES);
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(250);
				attributeList();
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(253);
				match(NEWLINES);
				}
			}

			setState(256);
			match(VARIABLE);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(257);
				scriptParameterDefault();
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

	public static class ScriptParameterDefaultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ScriptParameterDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptParameterDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterScriptParameterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitScriptParameterDefault(this);
		}
	}

	public final ScriptParameterDefaultContext scriptParameterDefault() throws RecognitionException {
		ScriptParameterDefaultContext _localctx = new ScriptParameterDefaultContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptParameterDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(260);
				match(NEWLINES);
				}
			}

			setState(263);
			match(T__1);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(264);
				match(NEWLINES);
				}
			}

			setState(267);
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

	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				attribute();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeArgumentsContext attributeArguments() {
			return getRuleContext(AttributeArgumentsContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__2);
			setState(275);
			attributeName();
			setState(276);
			match(T__3);
			setState(277);
			attributeArguments();
			setState(278);
			match(T__4);
			setState(279);
			match(T__5);
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
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			typeSpec();
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

	public static class AttributeArgumentsContext extends ParserRuleContext {
		public List<AttributeArgumentContext> attributeArgument() {
			return getRuleContexts(AttributeArgumentContext.class);
		}
		public AttributeArgumentContext attributeArgument(int i) {
			return getRuleContext(AttributeArgumentContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public AttributeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAttributeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAttributeArguments(this);
		}
	}

	public final AttributeArgumentsContext attributeArguments() throws RecognitionException {
		AttributeArgumentsContext _localctx = new AttributeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			attributeArgument();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NEWLINES) {
				{
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(284);
					match(NEWLINES);
					}
				}

				setState(287);
				match(T__0);
				setState(288);
				attributeArgument();
				}
				}
				setState(293);
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

	public static class AttributeArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public TerminalNode PROPERTYNAME() { return getToken(PowershellParser.PROPERTYNAME, 0); }
		public AttributeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAttributeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAttributeArgument(this);
		}
	}

	public final AttributeArgumentContext attributeArgument() throws RecognitionException {
		AttributeArgumentContext _localctx = new AttributeArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeArgument);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(294);
					match(NEWLINES);
					}
				}

				setState(297);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(298);
					match(NEWLINES);
					}
				}

				setState(301);
				match(PROPERTYNAME);
				setState(302);
				match(T__1);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(303);
					match(NEWLINES);
					}
				}

				setState(306);
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

	public static class TypeSpecContext extends ParserRuleContext {
		public ArrayTypeNameContext arrayTypeName() {
			return getRuleContext(ArrayTypeNameContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public GenericTypeNameContext genericTypeName() {
			return getRuleContext(GenericTypeNameContext.class,0);
		}
		public GenericTypeArgumentsContext genericTypeArguments() {
			return getRuleContext(GenericTypeArgumentsContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeSpec);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				arrayTypeName();
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(310);
					dimension();
					}
					break;
				}
				setState(313);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				genericTypeName();
				setState(316);
				genericTypeArguments();
				setState(317);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				typeName();
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

	public static class ArrayTypeNameContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ArrayTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterArrayTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitArrayTypeName(this);
		}
	}

	public final ArrayTypeNameContext arrayTypeName() throws RecognitionException {
		ArrayTypeNameContext _localctx = new ArrayTypeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			typeName();
			setState(323);
			match(T__2);
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

	public static class GenericTypeNameContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public GenericTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterGenericTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitGenericTypeName(this);
		}
	}

	public final GenericTypeNameContext genericTypeName() throws RecognitionException {
		GenericTypeNameContext _localctx = new GenericTypeNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_genericTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			typeName();
			setState(326);
			match(T__2);
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

	public static class DimensionContext extends ParserRuleContext {
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(328);
				match(T__0);
				}
				}
				setState(333);
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

	public static class GenericTypeArgumentsContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public GenericTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterGenericTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitGenericTypeArguments(this);
		}
	}

	public final GenericTypeArgumentsContext genericTypeArguments() throws RecognitionException {
		GenericTypeArgumentsContext _localctx = new GenericTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_genericTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			typeSpec();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(335);
				match(T__0);
				setState(336);
				typeSpec();
				}
				}
				setState(341);
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

	public static class TypeNameContext extends ParserRuleContext {
		public NamespaceTypeNameContext namespaceTypeName() {
			return getRuleContext(NamespaceTypeNameContext.class,0);
		}
		public AssemblyNameSpecContext assemblyNameSpec() {
			return getRuleContext(AssemblyNameSpecContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			namespaceTypeName();
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(343);
				match(T__0);
				setState(344);
				assemblyNameSpec();
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

	public static class NamespaceTypeNameContext extends ParserRuleContext {
		public NestedTypeNameContext nestedTypeName() {
			return getRuleContext(NestedTypeNameContext.class,0);
		}
		public NamespaceSpecContext namespaceSpec() {
			return getRuleContext(NamespaceSpecContext.class,0);
		}
		public NamespaceTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterNamespaceTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitNamespaceTypeName(this);
		}
	}

	public final NamespaceTypeNameContext namespaceTypeName() throws RecognitionException {
		NamespaceTypeNameContext _localctx = new NamespaceTypeNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_namespaceTypeName);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				nestedTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				namespaceSpec();
				setState(349);
				match(T__6);
				setState(350);
				nestedTypeName();
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

	public static class AssemblyNameSpecContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(PowershellParser.LABEL, 0); }
		public AssemblyNameSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyNameSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAssemblyNameSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAssemblyNameSpec(this);
		}
	}

	public final AssemblyNameSpecContext assemblyNameSpec() throws RecognitionException {
		AssemblyNameSpecContext _localctx = new AssemblyNameSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assemblyNameSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LABEL);
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

	public static class NestedTypeNameContext extends ParserRuleContext {
		public List<TypeNameIDENTIFIERContext> typeNameIDENTIFIER() {
			return getRuleContexts(TypeNameIDENTIFIERContext.class);
		}
		public TypeNameIDENTIFIERContext typeNameIDENTIFIER(int i) {
			return getRuleContext(TypeNameIDENTIFIERContext.class,i);
		}
		public NestedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterNestedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitNestedTypeName(this);
		}
	}

	public final NestedTypeNameContext nestedTypeName() throws RecognitionException {
		NestedTypeNameContext _localctx = new NestedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nestedTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			typeNameIDENTIFIER();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(357);
				match(T__7);
				setState(358);
				typeNameIDENTIFIER();
				}
				}
				setState(363);
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

	public static class NamespaceSpecContext extends ParserRuleContext {
		public List<TypeNameIDENTIFIERContext> typeNameIDENTIFIER() {
			return getRuleContexts(TypeNameIDENTIFIERContext.class);
		}
		public TypeNameIDENTIFIERContext typeNameIDENTIFIER(int i) {
			return getRuleContext(TypeNameIDENTIFIERContext.class,i);
		}
		public NamespaceSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterNamespaceSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitNamespaceSpec(this);
		}
	}

	public final NamespaceSpecContext namespaceSpec() throws RecognitionException {
		NamespaceSpecContext _localctx = new NamespaceSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namespaceSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			typeNameIDENTIFIER();
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(365);
					match(T__6);
					setState(366);
					typeNameIDENTIFIER();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class TypeNameIDENTIFIERContext extends ParserRuleContext {
		public List<TerminalNode> TYPENAMEIDENTIFIERCHAR() { return getTokens(PowershellParser.TYPENAMEIDENTIFIERCHAR); }
		public TerminalNode TYPENAMEIDENTIFIERCHAR(int i) {
			return getToken(PowershellParser.TYPENAMEIDENTIFIERCHAR, i);
		}
		public TypeNameIDENTIFIERContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameIDENTIFIER; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterTypeNameIDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitTypeNameIDENTIFIER(this);
		}
	}

	public final TypeNameIDENTIFIERContext typeNameIDENTIFIER() throws RecognitionException {
		TypeNameIDENTIFIERContext _localctx = new TypeNameIDENTIFIERContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeNameIDENTIFIER);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(372);
				match(TYPENAMEIDENTIFIERCHAR);
				}
				}
				setState(375); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPENAMEIDENTIFIERCHAR );
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

	public static class ScriptBlockBodyContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ScriptBlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBlockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterScriptBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitScriptBlockBody(this);
		}
	}

	public final ScriptBlockBodyContext scriptBlockBody() throws RecognitionException {
		ScriptBlockBodyContext _localctx = new ScriptBlockBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scriptBlockBody);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case NEWLINES:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				statementBlock();
				}
				break;
			case EOF:
			case T__6:
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__26:
			case T__29:
			case T__30:
			case T__31:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__46:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case VARIABLE:
			case STRINGLITERAL:
			case STRINGLITERALWITHSUBEXPRESSION:
			case TYPELITERAL:
			case LABEL:
			case LITERAL:
			case SIMPLENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				statementList();
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

	public static class StatementBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitStatementBlock(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(381);
				match(NEWLINES);
				}
			}

			setState(384);
			match(T__8);
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(385);
				statementList();
				}
				break;
			}
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(388);
				match(NEWLINES);
				}
			}

			setState(391);
			match(T__9);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> STATEMENTTERMINATOR() { return getTokens(PowershellParser.STATEMENTTERMINATOR); }
		public TerminalNode STATEMENTTERMINATOR(int i) {
			return getToken(PowershellParser.STATEMENTTERMINATOR, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LABEL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
				{
				{
				setState(393);
				statement();
				setState(394);
				match(STATEMENTTERMINATOR);
				}
				}
				setState(400);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(PowershellParser.LABEL, 0); }
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public FlowControlStatementContext flowControlStatement() {
			return getRuleContext(FlowControlStatementContext.class,0);
		}
		public TrapStatementContext trapStatement() {
			return getRuleContext(TrapStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DataStatementContext dataStatement() {
			return getRuleContext(DataStatementContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				ifStatement();
				}
				break;
			case T__18:
			case T__26:
			case T__29:
			case T__30:
			case T__31:
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(402);
					match(LABEL);
					}
				}

				setState(405);
				labeledStatement();
				}
				break;
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				functionStatement();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				flowControlStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
				trapStatement();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				tryStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 7);
				{
				setState(410);
				dataStatement();
				}
				break;
			case T__6:
			case T__7:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case VARIABLE:
			case STRINGLITERAL:
			case STRINGLITERALWITHSUBEXPRESSION:
			case TYPELITERAL:
			case LITERAL:
			case SIMPLENAME:
				enterOuterAlt(_localctx, 8);
				{
				setState(411);
				pipeline();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_labeledStatement);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				switchStatement();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				foreachStatement();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				forStatement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				whileStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				doStatement();
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

	public static class FlowControlStatementContext extends ParserRuleContext {
		public LabelExpressionContext labelExpression() {
			return getRuleContext(LabelExpressionContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public FlowControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterFlowControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitFlowControlStatement(this);
		}
	}

	public final FlowControlStatementContext flowControlStatement() throws RecognitionException {
		FlowControlStatementContext _localctx = new FlowControlStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_flowControlStatement);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(T__10);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(422);
					labelExpression();
					}
				}

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(T__11);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(426);
					labelExpression();
					}
				}

				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(T__12);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(430);
					pipeline();
					}
				}

				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				match(T__13);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(434);
					pipeline();
					}
				}

				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				match(T__14);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(438);
					pipeline();
					}
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

	public static class LabelExpressionContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitLabelExpression(this);
		}
	}

	public final LabelExpressionContext labelExpression() throws RecognitionException {
		LabelExpressionContext _localctx = new LabelExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_labelExpression);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(SIMPLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
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

	public static class KeyExpressionContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterKeyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitKeyExpression(this);
		}
	}

	public final KeyExpressionContext keyExpression() throws RecognitionException {
		KeyExpressionContext _localctx = new KeyExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_keyExpression);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(SIMPLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
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

	public static class IfStatementContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public ElseifClausesContext elseifClauses() {
			return getRuleContext(ElseifClausesContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__15);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(452);
				match(NEWLINES);
				}
			}

			setState(455);
			match(T__3);
			setState(456);
			pipeline();
			setState(457);
			match(T__4);
			setState(458);
			statementBlock();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(459);
				elseifClauses();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(462);
				elseClause();
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

	public static class ElseifClausesContext extends ParserRuleContext {
		public List<ElseifClauseContext> elseifClause() {
			return getRuleContexts(ElseifClauseContext.class);
		}
		public ElseifClauseContext elseifClause(int i) {
			return getRuleContext(ElseifClauseContext.class,i);
		}
		public ElseifClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterElseifClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitElseifClauses(this);
		}
	}

	public final ElseifClausesContext elseifClauses() throws RecognitionException {
		ElseifClausesContext _localctx = new ElseifClausesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseifClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(465);
				elseifClause();
				}
				}
				setState(468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
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

	public static class ElseifClauseContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public ElseifClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterElseifClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitElseifClause(this);
		}
	}

	public final ElseifClauseContext elseifClause() throws RecognitionException {
		ElseifClauseContext _localctx = new ElseifClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseifClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__16);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(471);
				match(NEWLINES);
				}
			}

			setState(474);
			match(T__3);
			setState(475);
			pipeline();
			setState(476);
			match(T__4);
			setState(477);
			statementBlock();
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

	public static class ElseClauseContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitElseClause(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__17);
			setState(480);
			statementBlock();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchConditionContext switchCondition() {
			return getRuleContext(SwitchConditionContext.class,0);
		}
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public SwitchParametersContext switchParameters() {
			return getRuleContext(SwitchParametersContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__18);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(483);
				match(NEWLINES);
				}
			}

			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				setState(486);
				switchParameters();
				}
			}

			setState(489);
			switchCondition();
			setState(490);
			switchBody();
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

	public static class SwitchParametersContext extends ParserRuleContext {
		public List<SwitchParameterContext> switchParameter() {
			return getRuleContexts(SwitchParameterContext.class);
		}
		public SwitchParameterContext switchParameter(int i) {
			return getRuleContext(SwitchParameterContext.class,i);
		}
		public SwitchParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchParameters(this);
		}
	}

	public final SwitchParametersContext switchParameters() throws RecognitionException {
		SwitchParametersContext _localctx = new SwitchParametersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchParameters);
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
				switchParameter();
				}
				}
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0) );
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

	public static class SwitchParameterContext extends ParserRuleContext {
		public SwitchParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchParameter(this);
		}
	}

	public final SwitchParameterContext switchParameter() throws RecognitionException {
		SwitchParameterContext _localctx = new SwitchParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switchParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class SwitchConditionContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public SwitchFilenameContext switchFilename() {
			return getRuleContext(SwitchFilenameContext.class,0);
		}
		public SwitchConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchCondition(this);
		}
	}

	public final SwitchConditionContext switchCondition() throws RecognitionException {
		SwitchConditionContext _localctx = new SwitchConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchCondition);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(T__3);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(500);
					match(NEWLINES);
					}
				}

				setState(503);
				pipeline();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(504);
					match(NEWLINES);
					}
				}

				setState(507);
				match(T__4);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(T__24);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(510);
					match(NEWLINES);
					}
				}

				setState(513);
				switchFilename();
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

	public static class SwitchFilenameContext extends ParserRuleContext {
		public CommandArgumentContext commandArgument() {
			return getRuleContext(CommandArgumentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchFilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchFilename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchFilename(this);
		}
	}

	public final SwitchFilenameContext switchFilename() throws RecognitionException {
		SwitchFilenameContext _localctx = new SwitchFilenameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switchFilename);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				commandArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
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

	public static class SwitchBodyContext extends ParserRuleContext {
		public SwitchClausesContext switchClauses() {
			return getRuleContext(SwitchClausesContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchBody(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(520);
				match(NEWLINES);
				}
			}

			setState(523);
			match(T__8);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(524);
				match(NEWLINES);
				}
			}

			setState(527);
			switchClauses();
			setState(528);
			match(T__9);
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

	public static class SwitchClausesContext extends ParserRuleContext {
		public List<SwitchClauseContext> switchClause() {
			return getRuleContexts(SwitchClauseContext.class);
		}
		public SwitchClauseContext switchClause(int i) {
			return getRuleContext(SwitchClauseContext.class,i);
		}
		public SwitchClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchClauses(this);
		}
	}

	public final SwitchClausesContext switchClauses() throws RecognitionException {
		SwitchClausesContext _localctx = new SwitchClausesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(530);
				switchClause();
				}
				}
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0) );
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

	public static class SwitchClauseContext extends ParserRuleContext {
		public SwitchClauseConditionContext switchClauseCondition() {
			return getRuleContext(SwitchClauseConditionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementTerminatorsContext statementTerminators() {
			return getRuleContext(StatementTerminatorsContext.class,0);
		}
		public SwitchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchClause(this);
		}
	}

	public final SwitchClauseContext switchClause() throws RecognitionException {
		SwitchClauseContext _localctx = new SwitchClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			switchClauseCondition();
			setState(536);
			statementBlock();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENTTERMINATOR) {
				{
				setState(537);
				statementTerminators();
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

	public static class SwitchClauseConditionContext extends ParserRuleContext {
		public CommandArgumentContext commandArgument() {
			return getRuleContext(CommandArgumentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchClauseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchClauseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSwitchClauseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSwitchClauseCondition(this);
		}
	}

	public final SwitchClauseConditionContext switchClauseCondition() throws RecognitionException {
		SwitchClauseConditionContext _localctx = new SwitchClauseConditionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switchClauseCondition);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				commandArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
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

	public static class ConfigurationStatementContext extends ParserRuleContext {
		public SingleNameExpressionContext singleNameExpression() {
			return getRuleContext(SingleNameExpressionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ConfigurationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterConfigurationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitConfigurationStatement(this);
		}
	}

	public final ConfigurationStatementContext configurationStatement() throws RecognitionException {
		ConfigurationStatementContext _localctx = new ConfigurationStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_configurationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__25);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(545);
				match(NEWLINES);
				}
			}

			setState(548);
			singleNameExpression();
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(549);
				match(NEWLINES);
				}
				break;
			}
			setState(552);
			statementBlock();
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

	public static class SingleNameExpressionContext extends ParserRuleContext {
		public CommandArgumentContext commandArgument() {
			return getRuleContext(CommandArgumentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSingleNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSingleNameExpression(this);
		}
	}

	public final SingleNameExpressionContext singleNameExpression() throws RecognitionException {
		SingleNameExpressionContext _localctx = new SingleNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_singleNameExpression);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				commandArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PowershellParser.VARIABLE, 0); }
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ForeachParametersContext foreachParameters() {
			return getRuleContext(ForeachParametersContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForeachStatement(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T__26);
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(559);
				match(NEWLINES);
				}
				break;
			}
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==T__28) {
				{
				setState(562);
				foreachParameters();
				}
			}

			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(565);
				match(NEWLINES);
				}
			}

			setState(568);
			match(T__3);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(569);
				match(NEWLINES);
				}
			}

			setState(572);
			match(VARIABLE);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(573);
				match(NEWLINES);
				}
			}

			setState(576);
			match(T__27);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(577);
				match(NEWLINES);
				}
			}

			setState(580);
			pipeline();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(581);
				match(NEWLINES);
				}
			}

			setState(584);
			match(T__4);
			setState(585);
			statementBlock();
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

	public static class ForeachParametersContext extends ParserRuleContext {
		public List<ForeachParameterContext> foreachParameter() {
			return getRuleContexts(ForeachParameterContext.class);
		}
		public ForeachParameterContext foreachParameter(int i) {
			return getRuleContext(ForeachParameterContext.class,i);
		}
		public ForeachParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForeachParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForeachParameters(this);
		}
	}

	public final ForeachParametersContext foreachParameters() throws RecognitionException {
		ForeachParametersContext _localctx = new ForeachParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_foreachParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(587);
				foreachParameter();
				}
				}
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__23 || _la==T__28 );
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

	public static class ForeachParameterContext extends ParserRuleContext {
		public ForeachThrottleLimitContext foreachThrottleLimit() {
			return getRuleContext(ForeachThrottleLimitContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public ForeachParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForeachParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForeachParameter(this);
		}
	}

	public final ForeachParameterContext foreachParameter() throws RecognitionException {
		ForeachParameterContext _localctx = new ForeachParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_foreachParameter);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(T__23);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(T__28);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(594);
					match(NEWLINES);
					}
				}

				setState(597);
				foreachThrottleLimit();
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

	public static class ForeachThrottleLimitContext extends ParserRuleContext {
		public CommandArgumentContext commandArgument() {
			return getRuleContext(CommandArgumentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForeachThrottleLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachThrottleLimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForeachThrottleLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForeachThrottleLimit(this);
		}
	}

	public final ForeachThrottleLimitContext foreachThrottleLimit() throws RecognitionException {
		ForeachThrottleLimitContext _localctx = new ForeachThrottleLimitContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_foreachThrottleLimit);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				commandArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
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

	public static class ForStatementContext extends ParserRuleContext {
		public List<TerminalNode> STATEMENTTERMINATOR() { return getTokens(PowershellParser.STATEMENTTERMINATOR); }
		public TerminalNode STATEMENTTERMINATOR(int i) {
			return getToken(PowershellParser.STATEMENTTERMINATOR, i);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ForInitializerContext forInitializer() {
			return getRuleContext(ForInitializerContext.class,0);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public ForIteratorContext forIterator() {
			return getRuleContext(ForIteratorContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forStatement);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(T__29);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(605);
					match(NEWLINES);
					}
				}

				setState(608);
				match(T__3);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(609);
					match(NEWLINES);
					}
				}

				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(612);
					forInitializer();
					}
				}

				setState(615);
				match(STATEMENTTERMINATOR);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(616);
					match(NEWLINES);
					}
				}

				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(619);
					forCondition();
					}
				}

				setState(622);
				match(STATEMENTTERMINATOR);
				setState(624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(623);
					match(NEWLINES);
					}
					break;
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(626);
					forIterator();
					}
				}

				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(629);
					match(NEWLINES);
					}
				}

				setState(632);
				match(T__4);
				setState(633);
				statementBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(T__29);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(635);
					match(NEWLINES);
					}
				}

				setState(638);
				match(T__3);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(639);
					match(NEWLINES);
					}
				}

				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(642);
					forInitializer();
					}
				}

				setState(645);
				match(STATEMENTTERMINATOR);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(646);
					match(NEWLINES);
					}
					break;
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(649);
					forCondition();
					}
				}

				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(652);
					match(NEWLINES);
					}
				}

				setState(655);
				match(T__4);
				setState(656);
				statementBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				match(T__29);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(658);
					match(NEWLINES);
					}
				}

				setState(661);
				match(T__3);
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(662);
					match(NEWLINES);
					}
					break;
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
					{
					setState(665);
					forInitializer();
					}
				}

				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(668);
					match(NEWLINES);
					}
				}

				setState(671);
				match(T__4);
				setState(672);
				statementBlock();
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

	public static class ForInitializerContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public ForInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForInitializer(this);
		}
	}

	public final ForInitializerContext forInitializer() throws RecognitionException {
		ForInitializerContext _localctx = new ForInitializerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			pipeline();
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

	public static class ForConditionContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForCondition(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			pipeline();
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

	public static class ForIteratorContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public ForIteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterForIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitForIterator(this);
		}
	}

	public final ForIteratorContext forIterator() throws RecognitionException {
		ForIteratorContext _localctx = new ForIteratorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forIterator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			pipeline();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__30);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(682);
				match(NEWLINES);
				}
			}

			setState(685);
			match(T__3);
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(686);
				match(NEWLINES);
				}
				break;
			}
			setState(689);
			whileCondition();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(690);
				match(NEWLINES);
				}
			}

			setState(693);
			match(T__4);
			setState(694);
			statementBlock();
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

	public static class DoStatementContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_doStatement);
		int _la;
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				match(T__31);
				setState(697);
				statementBlock();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(698);
					match(NEWLINES);
					}
				}

				setState(701);
				match(T__30);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(702);
					match(NEWLINES);
					}
				}

				setState(705);
				match(T__3);
				setState(706);
				whileCondition();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(707);
					match(NEWLINES);
					}
				}

				setState(710);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				match(T__31);
				setState(713);
				statementBlock();
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(714);
					match(NEWLINES);
					}
				}

				setState(717);
				match(T__32);
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(718);
					match(NEWLINES);
					}
				}

				setState(721);
				match(T__3);
				setState(722);
				whileCondition();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(723);
					match(NEWLINES);
					}
				}

				setState(726);
				match(T__4);
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

	public static class WhileConditionContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitWhileCondition(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_whileCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(730);
				match(NEWLINES);
				}
			}

			setState(733);
			pipeline();
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

	public static class ClassStatementContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassMemberListContext classMemberList() {
			return getRuleContext(ClassMemberListContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public BaseTypeListContext baseTypeList() {
			return getRuleContext(BaseTypeListContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitClassStatement(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classStatement);
		int _la;
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(735);
					attributeList();
					}
				}

				setState(738);
				match(T__33);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(739);
					match(NEWLINES);
					}
				}

				setState(742);
				className();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(743);
					match(NEWLINES);
					}
				}

				setState(746);
				match(T__8);
				setState(747);
				classMemberList();
				setState(748);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(750);
					attributeList();
					}
				}

				setState(753);
				match(T__33);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(754);
					match(NEWLINES);
					}
				}

				setState(757);
				className();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(758);
					match(NEWLINES);
					}
				}

				setState(761);
				match(T__34);
				setState(762);
				baseTypeList();
				setState(763);
				match(T__8);
				setState(764);
				classMemberList();
				setState(765);
				match(T__9);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(SIMPLENAME);
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

	public static class BaseTypeListContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public BaseClassListContext baseClassList() {
			return getRuleContext(BaseClassListContext.class,0);
		}
		public BaseTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBaseTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBaseTypeList(this);
		}
	}

	public final BaseTypeListContext baseTypeList() throws RecognitionException {
		BaseTypeListContext _localctx = new BaseTypeListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_baseTypeList);
		int _la;
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINES:
			case TYPENAMEIDENTIFIERCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(771);
					match(NEWLINES);
					}
				}

				setState(774);
				typeName();
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(775);
					match(NEWLINES);
					}
				}

				}
				break;
			case SIMPLENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				baseClassList();
				setState(779);
				match(T__0);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(780);
					match(NEWLINES);
					}
				}

				setState(783);
				typeName();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(784);
					match(NEWLINES);
					}
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

	public static class BaseClassListContext extends ParserRuleContext {
		public List<BaseClassContext> baseClass() {
			return getRuleContexts(BaseClassContext.class);
		}
		public BaseClassContext baseClass(int i) {
			return getRuleContext(BaseClassContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public BaseClassListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClassList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBaseClassList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBaseClassList(this);
		}
	}

	public final BaseClassListContext baseClassList() throws RecognitionException {
		BaseClassListContext _localctx = new BaseClassListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_baseClassList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(789);
				baseClass();
				setState(790);
				match(NEWLINES);
				}
				}
				setState(794); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIMPLENAME );
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

	public static class BaseClassContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public BaseClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBaseClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBaseClass(this);
		}
	}

	public final BaseClassContext baseClass() throws RecognitionException {
		BaseClassContext _localctx = new BaseClassContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_baseClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			className();
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

	public static class ClassMemberListContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ClassMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterClassMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitClassMemberList(this);
		}
	}

	public final ClassMemberListContext classMemberList() throws RecognitionException {
		ClassMemberListContext _localctx = new ClassMemberListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_classMemberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(798);
				classMember();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(799);
					match(NEWLINES);
					}
				}

				}
				}
				setState(804); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || _la==VARIABLE );
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

	public static class ClassMemberContext extends ParserRuleContext {
		public MethodMemberContext methodMember() {
			return getRuleContext(MethodMemberContext.class,0);
		}
		public PropertyMemberContext propertyMember() {
			return getRuleContext(PropertyMemberContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_classMember);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				methodMember();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				propertyMember();
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

	public static class MethodMemberContext extends ParserRuleContext {
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public MemberAttributeListContext memberAttributeList() {
			return getRuleContext(MemberAttributeListContext.class,0);
		}
		public MethodMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMethodMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMethodMember(this);
		}
	}

	public final MethodMemberContext methodMember() throws RecognitionException {
		MethodMemberContext _localctx = new MethodMemberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_methodMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(810);
				memberAttributeList();
				}
			}

			setState(813);
			functionStatement();
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

	public static class PropertyMemberContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PowershellParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberAttributeListContext memberAttributeList() {
			return getRuleContext(MemberAttributeListContext.class,0);
		}
		public PropertyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterPropertyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitPropertyMember(this);
		}
	}

	public final PropertyMemberContext propertyMember() throws RecognitionException {
		PropertyMemberContext _localctx = new PropertyMemberContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_propertyMember);
		int _la;
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__35) | (1L << T__36))) != 0)) {
					{
					setState(815);
					memberAttributeList();
					}
				}

				setState(818);
				match(VARIABLE);
				setState(819);
				match(T__1);
				setState(820);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__35) | (1L << T__36))) != 0)) {
					{
					setState(821);
					memberAttributeList();
					}
				}

				setState(824);
				match(VARIABLE);
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

	public static class MemberAttributeListContext extends ParserRuleContext {
		public List<MemberAttributeContext> memberAttribute() {
			return getRuleContexts(MemberAttributeContext.class);
		}
		public MemberAttributeContext memberAttribute(int i) {
			return getRuleContext(MemberAttributeContext.class,i);
		}
		public MemberAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMemberAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMemberAttributeList(this);
		}
	}

	public final MemberAttributeListContext memberAttributeList() throws RecognitionException {
		MemberAttributeListContext _localctx = new MemberAttributeListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_memberAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(827);
				memberAttribute();
				}
				}
				setState(830); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__35) | (1L << T__36))) != 0) );
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

	public static class MemberAttributeContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public MemberAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMemberAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMemberAttribute(this);
		}
	}

	public final MemberAttributeContext memberAttribute() throws RecognitionException {
		MemberAttributeContext _localctx = new MemberAttributeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_memberAttribute);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				attribute();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				match(T__36);
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

	public static class EnumStatementContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public EnumMemberListContext enumMemberList() {
			return getRuleContext(EnumMemberListContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public EnumStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterEnumStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitEnumStatement(this);
		}
	}

	public final EnumStatementContext enumStatement() throws RecognitionException {
		EnumStatementContext _localctx = new EnumStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_enumStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(T__37);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(838);
				match(NEWLINES);
				}
			}

			setState(841);
			enumName();
			setState(842);
			match(T__8);
			setState(843);
			enumMemberList();
			setState(844);
			match(T__9);
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(SIMPLENAME);
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

	public static class EnumMemberListContext extends ParserRuleContext {
		public List<EnumMemberContext> enumMember() {
			return getRuleContexts(EnumMemberContext.class);
		}
		public EnumMemberContext enumMember(int i) {
			return getRuleContext(EnumMemberContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public EnumMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMemberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterEnumMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitEnumMemberList(this);
		}
	}

	public final EnumMemberListContext enumMemberList() throws RecognitionException {
		EnumMemberListContext _localctx = new EnumMemberListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_enumMemberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(848);
				enumMember();
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(849);
					match(NEWLINES);
					}
				}

				}
				}
				setState(854); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIMPLENAME );
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

	public static class EnumMemberContext extends ParserRuleContext {
		public EnumMemberNameContext enumMemberName() {
			return getRuleContext(EnumMemberNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitEnumMember(this);
		}
	}

	public final EnumMemberContext enumMember() throws RecognitionException {
		EnumMemberContext _localctx = new EnumMemberContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_enumMember);
		try {
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				enumMemberName();
				setState(857);
				match(T__1);
				setState(858);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				enumMemberName();
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

	public static class EnumMemberNameContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public EnumMemberNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMemberName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterEnumMemberName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitEnumMemberName(this);
		}
	}

	public final EnumMemberNameContext enumMemberName() throws RecognitionException {
		EnumMemberNameContext _localctx = new EnumMemberNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_enumMemberName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(SIMPLENAME);
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

	public static class MethodStatementContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionParameterDeclarationContext functionParameterDeclaration() {
			return getRuleContext(FunctionParameterDeclarationContext.class,0);
		}
		public ScriptBlockContext scriptBlock() {
			return getRuleContext(ScriptBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public MethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMethodStatement(this);
		}
	}

	public final MethodStatementContext methodStatement() throws RecognitionException {
		MethodStatementContext _localctx = new MethodStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(865);
				match(NEWLINES);
				}
			}

			setState(868);
			functionName();
			setState(869);
			functionParameterDeclaration();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(870);
				baseCtorCall();
				}
			}

			setState(873);
			match(T__8);
			setState(874);
			scriptBlock();
			setState(875);
			match(T__9);
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

	public static class BaseCtorCallContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public BaseCtorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseCtorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBaseCtorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBaseCtorCall(this);
		}
	}

	public final BaseCtorCallContext baseCtorCall() throws RecognitionException {
		BaseCtorCallContext _localctx = new BaseCtorCallContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_baseCtorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(T__34);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(878);
				match(NEWLINES);
				}
			}

			setState(881);
			match(T__38);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(882);
				match(NEWLINES);
				}
			}

			setState(885);
			parenthesizedExpression();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(886);
				match(NEWLINES);
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ScriptBlockContext scriptBlock() {
			return getRuleContext(ScriptBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public FunctionParameterDeclarationContext functionParameterDeclaration() {
			return getRuleContext(FunctionParameterDeclarationContext.class,0);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitFunctionStatement(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionStatement);
		int _la;
		try {
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(T__39);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(890);
					match(NEWLINES);
					}
				}

				setState(893);
				functionName();
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==NEWLINES) {
					{
					setState(894);
					functionParameterDeclaration();
					}
				}

				setState(897);
				match(T__8);
				setState(898);
				scriptBlock();
				setState(899);
				match(T__9);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(T__40);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(902);
					match(NEWLINES);
					}
				}

				setState(905);
				functionName();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==NEWLINES) {
					{
					setState(906);
					functionParameterDeclaration();
					}
				}

				setState(909);
				match(T__8);
				setState(910);
				scriptBlock();
				setState(911);
				match(T__9);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(913);
				match(T__41);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(914);
					match(NEWLINES);
					}
				}

				setState(917);
				functionName();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==NEWLINES) {
					{
					setState(918);
					functionParameterDeclaration();
					}
				}

				setState(921);
				match(T__8);
				setState(922);
				scriptBlock();
				setState(923);
				match(T__9);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public CommandArgumentContext commandArgument() {
			return getRuleContext(CommandArgumentContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			commandArgument();
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

	public static class FunctionParameterDeclarationContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public FunctionParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterFunctionParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitFunctionParameterDeclaration(this);
		}
	}

	public final FunctionParameterDeclarationContext functionParameterDeclaration() throws RecognitionException {
		FunctionParameterDeclarationContext _localctx = new FunctionParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionParameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(929);
				match(NEWLINES);
				}
			}

			setState(932);
			match(T__3);
			setState(933);
			parameterList();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(934);
				match(NEWLINES);
				}
			}

			setState(937);
			match(T__4);
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

	public static class TrapStatementContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public TerminalNode TYPELITERAL() { return getToken(PowershellParser.TYPELITERAL, 0); }
		public TrapStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trapStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterTrapStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitTrapStatement(this);
		}
	}

	public final TrapStatementContext trapStatement() throws RecognitionException {
		TrapStatementContext _localctx = new TrapStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trapStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(T__42);
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(940);
				match(NEWLINES);
				}
				break;
			}
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPELITERAL) {
				{
				setState(943);
				match(TYPELITERAL);
				}
			}

			setState(946);
			statementBlock();
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

	public static class TryStatementContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tryStatement);
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				match(T__43);
				setState(949);
				statementBlock();
				setState(950);
				catchClauses();
				setState(951);
				finallyClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				match(T__43);
				setState(954);
				statementBlock();
				setState(955);
				finallyClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(T__43);
				setState(958);
				statementBlock();
				setState(959);
				catchClauses();
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

	public static class CatchClausesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCatchClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCatchClauses(this);
		}
	}

	public final CatchClausesContext catchClauses() throws RecognitionException {
		CatchClausesContext _localctx = new CatchClausesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_catchClauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(964); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(963);
					catchClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(966); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public CatchTypeListContext catchTypeList() {
			return getRuleContext(CatchTypeListContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(968);
				match(NEWLINES);
				}
			}

			setState(971);
			match(T__44);
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(972);
				catchTypeList();
				}
				break;
			}
			setState(975);
			statementBlock();
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

	public static class CatchTypeListContext extends ParserRuleContext {
		public List<TerminalNode> TYPELITERAL() { return getTokens(PowershellParser.TYPELITERAL); }
		public TerminalNode TYPELITERAL(int i) {
			return getToken(PowershellParser.TYPELITERAL, i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public CatchTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCatchTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCatchTypeList(this);
		}
	}

	public final CatchTypeListContext catchTypeList() throws RecognitionException {
		CatchTypeListContext _localctx = new CatchTypeListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_catchTypeList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(977);
				match(NEWLINES);
				}
			}

			setState(980);
			match(TYPELITERAL);
			setState(991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINES) {
						{
						setState(981);
						match(NEWLINES);
						}
					}

					setState(984);
					match(T__0);
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINES) {
						{
						setState(985);
						match(NEWLINES);
						}
					}

					setState(988);
					match(TYPELITERAL);
					}
					} 
				}
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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

	public static class FinallyClauseContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitFinallyClause(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_finallyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(994);
				match(NEWLINES);
				}
			}

			setState(997);
			match(T__45);
			setState(998);
			statementBlock();
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

	public static class DataStatementContext extends ParserRuleContext {
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public DataCommandsAllowedContext dataCommandsAllowed() {
			return getRuleContext(DataCommandsAllowedContext.class,0);
		}
		public DataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitDataStatement(this);
		}
	}

	public final DataStatementContext dataStatement() throws RecognitionException {
		DataStatementContext _localctx = new DataStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_dataStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__46);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(1001);
				match(NEWLINES);
				}
			}

			setState(1004);
			dataName();
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1005);
				dataCommandsAllowed();
				}
				break;
			}
			setState(1008);
			statementBlock();
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

	public static class DataNameContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public DataNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterDataName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitDataName(this);
		}
	}

	public final DataNameContext dataName() throws RecognitionException {
		DataNameContext _localctx = new DataNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_dataName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(SIMPLENAME);
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

	public static class DataCommandsAllowedContext extends ParserRuleContext {
		public DataCommandsListContext dataCommandsList() {
			return getRuleContext(DataCommandsListContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public DataCommandsAllowedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCommandsAllowed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterDataCommandsAllowed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitDataCommandsAllowed(this);
		}
	}

	public final DataCommandsAllowedContext dataCommandsAllowed() throws RecognitionException {
		DataCommandsAllowedContext _localctx = new DataCommandsAllowedContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dataCommandsAllowed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(1012);
				match(NEWLINES);
				}
			}

			setState(1015);
			match(T__47);
			setState(1016);
			dataCommandsList();
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

	public static class DataCommandsListContext extends ParserRuleContext {
		public List<DataCommandContext> dataCommand() {
			return getRuleContexts(DataCommandContext.class);
		}
		public DataCommandContext dataCommand(int i) {
			return getRuleContext(DataCommandContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public DataCommandsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCommandsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterDataCommandsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitDataCommandsList(this);
		}
	}

	public final DataCommandsListContext dataCommandsList() throws RecognitionException {
		DataCommandsListContext _localctx = new DataCommandsListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_dataCommandsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(1018);
				match(NEWLINES);
				}
			}

			setState(1021);
			dataCommand();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1022);
				match(T__0);
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(1023);
					match(NEWLINES);
					}
				}

				setState(1026);
				dataCommand();
				}
				}
				setState(1031);
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

	public static class DataCommandContext extends ParserRuleContext {
		public CommandNameExprContext commandNameExpr() {
			return getRuleContext(CommandNameExprContext.class,0);
		}
		public DataCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterDataCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitDataCommand(this);
		}
	}

	public final DataCommandContext dataCommand() throws RecognitionException {
		DataCommandContext _localctx = new DataCommandContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_dataCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			commandNameExpr();
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

	public static class PipelineContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public PipelineTailContext pipelineTail() {
			return getRuleContext(PipelineTailContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RedirectionsContext redirections() {
			return getRuleContext(RedirectionsContext.class,0);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_pipeline);
		int _la;
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				command();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1036);
					pipelineTail();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
				expression(0);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__83 - 79)) | (1L << (T__84 - 79)) | (1L << (T__85 - 79)) | (1L << (T__86 - 79)) | (1L << (T__87 - 79)) | (1L << (T__88 - 79)) | (1L << (T__89 - 79)) | (1L << (T__90 - 79)) | (1L << (T__91 - 79)) | (1L << (T__92 - 79)) | (1L << (T__93 - 79)) | (1L << (T__94 - 79)) | (1L << (T__95 - 79)) | (1L << (T__96 - 79)) | (1L << (T__97 - 79)) | (1L << (T__98 - 79)) | (1L << (T__99 - 79)))) != 0)) {
					{
					setState(1040);
					redirections();
					}
				}

				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1043);
					pipelineTail();
					}
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			expression(0);
			setState(1049);
			assignmentOperator();
			setState(1050);
			statement();
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

	public static class PipelineTailContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public PipelineTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipelineTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterPipelineTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitPipelineTail(this);
		}
	}

	public final PipelineTailContext pipelineTail() throws RecognitionException {
		PipelineTailContext _localctx = new PipelineTailContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_pipelineTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1052);
				match(T__48);
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(1053);
					match(NEWLINES);
					}
				}

				setState(1056);
				command();
				}
				}
				setState(1059); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__48 );
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

	public static class RedirectionsContext extends ParserRuleContext {
		public List<RedirectionContext> redirection() {
			return getRuleContexts(RedirectionContext.class);
		}
		public RedirectionContext redirection(int i) {
			return getRuleContext(RedirectionContext.class,i);
		}
		public RedirectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterRedirections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitRedirections(this);
		}
	}

	public final RedirectionsContext redirections() throws RecognitionException {
		RedirectionsContext _localctx = new RedirectionsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_redirections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1061);
				redirection();
				}
				}
				setState(1064); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__83 - 79)) | (1L << (T__84 - 79)) | (1L << (T__85 - 79)) | (1L << (T__86 - 79)) | (1L << (T__87 - 79)) | (1L << (T__88 - 79)) | (1L << (T__89 - 79)) | (1L << (T__90 - 79)) | (1L << (T__91 - 79)) | (1L << (T__92 - 79)) | (1L << (T__93 - 79)) | (1L << (T__94 - 79)) | (1L << (T__95 - 79)) | (1L << (T__96 - 79)) | (1L << (T__97 - 79)) | (1L << (T__98 - 79)) | (1L << (T__99 - 79)))) != 0) );
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

	public static class RedirectionContext extends ParserRuleContext {
		public MergingredirectionoperatorContext mergingredirectionoperator() {
			return getRuleContext(MergingredirectionoperatorContext.class,0);
		}
		public FileredirectionoperatorContext fileredirectionoperator() {
			return getRuleContext(FileredirectionoperatorContext.class,0);
		}
		public RedirectedFileNameContext redirectedFileName() {
			return getRuleContext(RedirectedFileNameContext.class,0);
		}
		public RedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterRedirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitRedirection(this);
		}
	}

	public final RedirectionContext redirection() throws RecognitionException {
		RedirectionContext _localctx = new RedirectionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_redirection);
		try {
			setState(1070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				mergingredirectionoperator();
				}
				break;
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				fileredirectionoperator();
				setState(1068);
				redirectedFileName();
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

	public static class RedirectedFileNameContext extends ParserRuleContext {
		public CommandArgumentContext commandArgument() {
			return getRuleContext(CommandArgumentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RedirectedFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirectedFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterRedirectedFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitRedirectedFileName(this);
		}
	}

	public final RedirectedFileNameContext redirectedFileName() throws RecognitionException {
		RedirectedFileNameContext _localctx = new RedirectedFileNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_redirectedFileName);
		try {
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				commandArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandNameContext commandName() {
			return getRuleContext(CommandNameContext.class,0);
		}
		public List<CommandElementContext> commandElement() {
			return getRuleContexts(CommandElementContext.class);
		}
		public CommandElementContext commandElement(int i) {
			return getRuleContext(CommandElementContext.class,i);
		}
		public CommandInvocationOperatorContext commandInvocationOperator() {
			return getRuleContext(CommandInvocationOperatorContext.class,0);
		}
		public CommandNameExprContext commandNameExpr() {
			return getRuleContext(CommandNameExprContext.class,0);
		}
		public CommandModuleContext commandModule() {
			return getRuleContext(CommandModuleContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_command);
		int _la;
		try {
			setState(1094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				commandName();
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__83 - 79)) | (1L << (T__84 - 79)) | (1L << (T__85 - 79)) | (1L << (T__86 - 79)) | (1L << (T__87 - 79)) | (1L << (T__88 - 79)) | (1L << (T__89 - 79)) | (1L << (T__90 - 79)) | (1L << (T__91 - 79)) | (1L << (T__92 - 79)) | (1L << (T__93 - 79)) | (1L << (T__94 - 79)) | (1L << (T__95 - 79)) | (1L << (T__96 - 79)) | (1L << (T__97 - 79)) | (1L << (T__98 - 79)) | (1L << (T__99 - 79)) | (1L << (VARIABLE - 79)) | (1L << (COMMANDPARAMETER - 79)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (STRINGLITERAL - 151)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 151)) | (1L << (TYPELITERAL - 151)) | (1L << (LITERAL - 151)) | (1L << (SIMPLENAME - 151)))) != 0)) {
					{
					{
					setState(1077);
					commandElement();
					}
					}
					setState(1082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				commandInvocationOperator();
				setState(1085);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1084);
					commandModule();
					}
					break;
				}
				setState(1087);
				commandNameExpr();
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__83 - 79)) | (1L << (T__84 - 79)) | (1L << (T__85 - 79)) | (1L << (T__86 - 79)) | (1L << (T__87 - 79)) | (1L << (T__88 - 79)) | (1L << (T__89 - 79)) | (1L << (T__90 - 79)) | (1L << (T__91 - 79)) | (1L << (T__92 - 79)) | (1L << (T__93 - 79)) | (1L << (T__94 - 79)) | (1L << (T__95 - 79)) | (1L << (T__96 - 79)) | (1L << (T__97 - 79)) | (1L << (T__98 - 79)) | (1L << (T__99 - 79)) | (1L << (VARIABLE - 79)) | (1L << (COMMANDPARAMETER - 79)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (STRINGLITERAL - 151)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 151)) | (1L << (TYPELITERAL - 151)) | (1L << (LITERAL - 151)) | (1L << (SIMPLENAME - 151)))) != 0)) {
					{
					{
					setState(1088);
					commandElement();
					}
					}
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class CommandInvocationOperatorContext extends ParserRuleContext {
		public CommandInvocationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandInvocationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCommandInvocationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCommandInvocationOperator(this);
		}
	}

	public final CommandInvocationOperatorContext commandInvocationOperator() throws RecognitionException {
		CommandInvocationOperatorContext _localctx = new CommandInvocationOperatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_commandInvocationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__49) ) {
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

	public static class CommandModuleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCommandModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCommandModule(this);
		}
	}

	public final CommandModuleContext commandModule() throws RecognitionException {
		CommandModuleContext _localctx = new CommandModuleContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_commandModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
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

	public static class CommandNameContext extends ParserRuleContext {
		public GenericTokenContext genericToken() {
			return getRuleContext(GenericTokenContext.class,0);
		}
		public CommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCommandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCommandName(this);
		}
	}

	public final CommandNameContext commandName() throws RecognitionException {
		CommandNameContext _localctx = new CommandNameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_commandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			genericToken();
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

	public static class GenericTokenContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public GenericTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterGenericToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitGenericToken(this);
		}
	}

	public final GenericTokenContext genericToken() throws RecognitionException {
		GenericTokenContext _localctx = new GenericTokenContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_genericToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(SIMPLENAME);
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

	public static class CommandNameExprContext extends ParserRuleContext {
		public CommandNameContext commandName() {
			return getRuleContext(CommandNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandNameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandNameExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCommandNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCommandNameExpr(this);
		}
	}

	public final CommandNameExprContext commandNameExpr() throws RecognitionException {
		CommandNameExprContext _localctx = new CommandNameExprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_commandNameExpr);
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1104);
				commandName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
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

	public static class CommandElementContext extends ParserRuleContext {
		public CommandNameExprContext commandNameExpr() {
			return getRuleContext(CommandNameExprContext.class,0);
		}
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public TerminalNode COMMANDPARAMETER() { return getToken(PowershellParser.COMMANDPARAMETER, 0); }
		public CommandElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCommandElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCommandElement(this);
		}
	}

	public final CommandElementContext commandElement() throws RecognitionException {
		CommandElementContext _localctx = new CommandElementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_commandElement);
		try {
			setState(1111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case VARIABLE:
			case STRINGLITERAL:
			case STRINGLITERALWITHSUBEXPRESSION:
			case TYPELITERAL:
			case LITERAL:
			case SIMPLENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				commandNameExpr();
				}
				break;
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				redirection();
				}
				break;
			case COMMANDPARAMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				match(COMMANDPARAMETER);
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

	public static class CommandArgumentContext extends ParserRuleContext {
		public CommandNameExprContext commandNameExpr() {
			return getRuleContext(CommandNameExprContext.class,0);
		}
		public CommandArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCommandArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCommandArgument(this);
		}
	}

	public final CommandArgumentContext commandArgument() throws RecognitionException {
		CommandArgumentContext _localctx = new CommandArgumentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_commandArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			commandNameExpr();
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
	public static class ElementAccessExpreContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ElementAccessExpreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterElementAccessExpre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitElementAccessExpre(this);
		}
	}
	public static class ValueExpressionContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitValueExpression(this);
		}
	}
	public static class FormatExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FORMATOPERATOR() { return getToken(PowershellParser.FORMATOPERATOR, 0); }
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public FormatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterFormatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitFormatExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class XorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public XorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitXorExpression(this);
		}
	}
	public static class BorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public BorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBorExpression(this);
		}
	}
	public static class BandExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public BandExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBandExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitNotExpression(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitComparisonExpression(this);
		}
	}
	public static class PreDecrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitPreDecrementExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BxorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public BxorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBxorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBxorExpression(this);
		}
	}
	public static class NotexclamExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotexclamExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterNotexclamExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitNotexclamExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitOrExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode TYPELITERAL() { return getToken(PowershellParser.TYPELITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitCastExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAndExpression(this);
		}
	}
	public static class MemberClassAccessExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberClassAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMemberClassAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMemberClassAccessExpression(this);
		}
	}
	public static class JoinExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public JoinExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterJoinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitJoinExpression(this);
		}
	}
	public static class SplitExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public SplitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterSplitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitSplitExpression(this);
		}
	}
	public static class MemberAccessExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMemberAccessExpression(this);
		}
	}
	public static class RangeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitRangeExpression(this);
		}
	}
	public static class PreIncrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitPreIncrementExpression(this);
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
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1116);
				match(TYPELITERAL);
				setState(1117);
				expression(21);
				}
				break;
			case 2:
				{
				_localctx = new JoinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1118);
				match(T__51);
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(1119);
					match(NEWLINES);
					}
				}

				setState(1122);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new SplitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1123);
				match(T__52);
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(1124);
					match(NEWLINES);
					}
				}

				setState(1127);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1128);
				match(T__53);
				setState(1129);
				expression(18);
				}
				break;
			case 5:
				{
				_localctx = new PreDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1130);
				match(T__54);
				setState(1131);
				expression(17);
				}
				break;
			case 6:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1132);
				match(T__7);
				setState(1133);
				expression(16);
				}
				break;
			case 7:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1134);
				match(T__55);
				setState(1135);
				expression(15);
				}
				break;
			case 8:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1136);
				_la = _input.LA(1);
				if ( !(_la==T__56 || _la==T__57) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(1137);
					match(NEWLINES);
					}
				}

				setState(1140);
				expression(14);
				}
				break;
			case 9:
				{
				_localctx = new NotexclamExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1141);
				match(T__58);
				setState(1142);
				expression(13);
				}
				break;
			case 10:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1143);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1146);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1147);
						match(T__6);
						setState(1148);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MemberClassAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1150);
						match(T__50);
						setState(1151);
						expression(24);
						}
						break;
					case 3:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1153);
						match(T__59);
						setState(1155);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1154);
							match(NEWLINES);
							}
						}

						setState(1157);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new FormatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1158);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1159);
						match(FORMATOPERATOR);
						setState(1161);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1160);
							match(NEWLINES);
							}
						}

						setState(1163);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1164);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1165);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1166);
							match(NEWLINES);
							}
						}

						setState(1169);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1170);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1171);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__55) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1172);
							match(NEWLINES);
							}
						}

						setState(1175);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1177);
						comparisonOperator();
						setState(1179);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1178);
							match(NEWLINES);
							}
						}

						setState(1181);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new BxorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1184);
						match(T__63);
						setState(1186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1185);
							match(NEWLINES);
							}
						}

						setState(1188);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new BorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1190);
						match(T__64);
						setState(1192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1191);
							match(NEWLINES);
							}
						}

						setState(1194);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new BandExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1196);
						match(T__65);
						setState(1198);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1197);
							match(NEWLINES);
							}
						}

						setState(1200);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new XorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1202);
						match(T__66);
						setState(1204);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1203);
							match(NEWLINES);
							}
						}

						setState(1206);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1208);
						match(T__67);
						setState(1210);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1209);
							match(NEWLINES);
							}
						}

						setState(1212);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1214);
						match(T__68);
						setState(1216);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1215);
							match(NEWLINES);
							}
						}

						setState(1218);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ElementAccessExpreContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1219);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1220);
						match(T__2);
						setState(1222);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1221);
							match(NEWLINES);
							}
						}

						setState(1224);
						expression(0);
						setState(1226);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(1225);
							match(NEWLINES);
							}
						}

						setState(1228);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(1234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(PowershellParser.STRINGLITERAL, 0); }
		public TerminalNode STRINGLITERALWITHSUBEXPRESSION() { return getToken(PowershellParser.STRINGLITERALWITHSUBEXPRESSION, 0); }
		public TerminalNode LITERAL() { return getToken(PowershellParser.LITERAL, 0); }
		public TerminalNode TYPELITERAL() { return getToken(PowershellParser.TYPELITERAL, 0); }
		public TerminalNode VARIABLE() { return getToken(PowershellParser.VARIABLE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) ) {
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

	public static class StatementTerminatorsContext extends ParserRuleContext {
		public List<TerminalNode> STATEMENTTERMINATOR() { return getTokens(PowershellParser.STATEMENTTERMINATOR); }
		public TerminalNode STATEMENTTERMINATOR(int i) {
			return getToken(PowershellParser.STATEMENTTERMINATOR, i);
		}
		public StatementTerminatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementTerminators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterStatementTerminators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitStatementTerminators(this);
		}
	}

	public final StatementTerminatorsContext statementTerminators() throws RecognitionException {
		StatementTerminatorsContext _localctx = new StatementTerminatorsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_statementTerminators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1237);
				match(STATEMENTTERMINATOR);
				}
				}
				setState(1240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STATEMENTTERMINATOR );
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

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitParenthesizedExpression(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_parenthesizedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			match(T__3);
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(1243);
				match(NEWLINES);
				}
			}

			setState(1246);
			pipeline();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(1247);
				match(NEWLINES);
				}
			}

			setState(1250);
			match(T__4);
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

	public static class MemberNameContext extends ParserRuleContext {
		public TerminalNode SIMPLENAME() { return getToken(PowershellParser.SIMPLENAME, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(PowershellParser.STRINGLITERAL, 0); }
		public TerminalNode STRINGLITERALWITHSUBEXPRESSION() { return getToken(PowershellParser.STRINGLITERALWITHSUBEXPRESSION, 0); }
		public MemberNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMemberName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMemberName(this);
		}
	}

	public final MemberNameContext memberName() throws RecognitionException {
		MemberNameContext _localctx = new MemberNameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_memberName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			_la = _input.LA(1);
			if ( !(((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (STRINGLITERAL - 151)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 151)) | (1L << (SIMPLENAME - 151)))) != 0)) ) {
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(PowershellParser.NEWLINES, 0); }
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(T__3);
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (VARIABLE - 105)) | (1L << (STRINGLITERAL - 105)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 105)) | (1L << (TYPELITERAL - 105)) | (1L << (LITERAL - 105)) | (1L << (SIMPLENAME - 105)))) != 0)) {
				{
				setState(1255);
				argumentExpressionList();
				}
			}

			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(1258);
				match(NEWLINES);
				}
			}

			setState(1261);
			match(T__4);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<ArgumentExpressionContext> argumentExpression() {
			return getRuleContexts(ArgumentExpressionContext.class);
		}
		public ArgumentExpressionContext argumentExpression(int i) {
			return getRuleContext(ArgumentExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINES() { return getTokens(PowershellParser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(PowershellParser.NEWLINES, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_argumentExpressionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			argumentExpression();
			setState(1271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINES) {
						{
						setState(1264);
						match(NEWLINES);
						}
					}

					setState(1267);
					match(T__0);
					setState(1268);
					argumentExpression();
					}
					} 
				}
				setState(1273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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

	public static class ArgumentExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitArgumentExpression(this);
		}
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_argumentExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			expression(0);
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1275);
					match(T__0);
					setState(1276);
					expression(0);
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class BlockNameContext extends ParserRuleContext {
		public BlockNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterBlockName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitBlockName(this);
		}
	}

	public final BlockNameContext blockName() throws RecognitionException {
		BlockNameContext _localctx = new BlockNameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)))) != 0)) ) {
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
		public TerminalNode DEQ() { return getToken(PowershellParser.DEQ, 0); }
		public TerminalNode DNE() { return getToken(PowershellParser.DNE, 0); }
		public TerminalNode DGE() { return getToken(PowershellParser.DGE, 0); }
		public TerminalNode DGT() { return getToken(PowershellParser.DGT, 0); }
		public TerminalNode DLT() { return getToken(PowershellParser.DLT, 0); }
		public TerminalNode DLE() { return getToken(PowershellParser.DLE, 0); }
		public TerminalNode DIEQ() { return getToken(PowershellParser.DIEQ, 0); }
		public TerminalNode DINE() { return getToken(PowershellParser.DINE, 0); }
		public TerminalNode DIGE() { return getToken(PowershellParser.DIGE, 0); }
		public TerminalNode DIGT() { return getToken(PowershellParser.DIGT, 0); }
		public TerminalNode DILT() { return getToken(PowershellParser.DILT, 0); }
		public TerminalNode DILE() { return getToken(PowershellParser.DILE, 0); }
		public TerminalNode DCEQ() { return getToken(PowershellParser.DCEQ, 0); }
		public TerminalNode DCNE() { return getToken(PowershellParser.DCNE, 0); }
		public TerminalNode DCGE() { return getToken(PowershellParser.DCGE, 0); }
		public TerminalNode DCGT() { return getToken(PowershellParser.DCGT, 0); }
		public TerminalNode DCLT() { return getToken(PowershellParser.DCLT, 0); }
		public TerminalNode CLE() { return getToken(PowershellParser.CLE, 0); }
		public TerminalNode DLIKE() { return getToken(PowershellParser.DLIKE, 0); }
		public TerminalNode DNOTLIKE() { return getToken(PowershellParser.DNOTLIKE, 0); }
		public TerminalNode DMATCH() { return getToken(PowershellParser.DMATCH, 0); }
		public TerminalNode DNOTMATCH() { return getToken(PowershellParser.DNOTMATCH, 0); }
		public TerminalNode DILIKE() { return getToken(PowershellParser.DILIKE, 0); }
		public TerminalNode DINOTLIKE() { return getToken(PowershellParser.DINOTLIKE, 0); }
		public TerminalNode DIMATCH() { return getToken(PowershellParser.DIMATCH, 0); }
		public TerminalNode DINOTMATCH() { return getToken(PowershellParser.DINOTMATCH, 0); }
		public TerminalNode DCLIKE() { return getToken(PowershellParser.DCLIKE, 0); }
		public TerminalNode DCNOTLIKE() { return getToken(PowershellParser.DCNOTLIKE, 0); }
		public TerminalNode DCMATCH() { return getToken(PowershellParser.DCMATCH, 0); }
		public TerminalNode DCNOTMATCH() { return getToken(PowershellParser.DCNOTMATCH, 0); }
		public TerminalNode DCONTAINS() { return getToken(PowershellParser.DCONTAINS, 0); }
		public TerminalNode DNOTCONTAINS() { return getToken(PowershellParser.DNOTCONTAINS, 0); }
		public TerminalNode DICONTAINS() { return getToken(PowershellParser.DICONTAINS, 0); }
		public TerminalNode DINOTCONTAINS() { return getToken(PowershellParser.DINOTCONTAINS, 0); }
		public TerminalNode DCCONTAINS() { return getToken(PowershellParser.DCCONTAINS, 0); }
		public TerminalNode DCNOTCONTAINS() { return getToken(PowershellParser.DCNOTCONTAINS, 0); }
		public TerminalNode DISNOT() { return getToken(PowershellParser.DISNOT, 0); }
		public TerminalNode DIS() { return getToken(PowershellParser.DIS, 0); }
		public TerminalNode DAS() { return getToken(PowershellParser.DAS, 0); }
		public TerminalNode DREPLACE() { return getToken(PowershellParser.DREPLACE, 0); }
		public TerminalNode DIREPLACE() { return getToken(PowershellParser.DIREPLACE, 0); }
		public TerminalNode DCREPLACE() { return getToken(PowershellParser.DCREPLACE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (DEQ - 107)) | (1L << (DNE - 107)) | (1L << (DGE - 107)) | (1L << (DGT - 107)) | (1L << (DLT - 107)) | (1L << (DLE - 107)) | (1L << (DIEQ - 107)) | (1L << (DINE - 107)) | (1L << (DIGE - 107)) | (1L << (DIGT - 107)) | (1L << (DILT - 107)) | (1L << (DILE - 107)) | (1L << (DCEQ - 107)) | (1L << (DCNE - 107)) | (1L << (DCGE - 107)) | (1L << (DCGT - 107)) | (1L << (DCLT - 107)) | (1L << (CLE - 107)) | (1L << (DLIKE - 107)) | (1L << (DNOTLIKE - 107)) | (1L << (DMATCH - 107)) | (1L << (DNOTMATCH - 107)) | (1L << (DILIKE - 107)) | (1L << (DINOTLIKE - 107)) | (1L << (DIMATCH - 107)) | (1L << (DINOTMATCH - 107)) | (1L << (DCLIKE - 107)) | (1L << (DCNOTLIKE - 107)) | (1L << (DCMATCH - 107)) | (1L << (DCNOTMATCH - 107)) | (1L << (DCONTAINS - 107)) | (1L << (DNOTCONTAINS - 107)) | (1L << (DICONTAINS - 107)) | (1L << (DINOTCONTAINS - 107)) | (1L << (DCCONTAINS - 107)) | (1L << (DCNOTCONTAINS - 107)) | (1L << (DISNOT - 107)) | (1L << (DIS - 107)) | (1L << (DAS - 107)) | (1L << (DREPLACE - 107)) | (1L << (DIREPLACE - 107)) | (1L << (DCREPLACE - 107)))) != 0)) ) {
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_la = _input.LA(1);
			if ( !(_la==T__1 || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__77 - 74)))) != 0)) ) {
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

	public static class MergingredirectionoperatorContext extends ParserRuleContext {
		public MergingredirectionoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergingredirectionoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterMergingredirectionoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitMergingredirectionoperator(this);
		}
	}

	public final MergingredirectionoperatorContext mergingredirectionoperator() throws RecognitionException {
		MergingredirectionoperatorContext _localctx = new MergingredirectionoperatorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_mergingredirectionoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__83 - 79)))) != 0)) ) {
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

	public static class FileredirectionoperatorContext extends ParserRuleContext {
		public FileredirectionoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileredirectionoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).enterFileredirectionoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowershellListener ) ((PowershellListener)listener).exitFileredirectionoperator(this);
		}
	}

	public final FileredirectionoperatorContext fileredirectionoperator() throws RecognitionException {
		FileredirectionoperatorContext _localctx = new FileredirectionoperatorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fileredirectionoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)) | (1L << (T__87 - 85)) | (1L << (T__88 - 85)) | (1L << (T__89 - 85)) | (1L << (T__90 - 85)) | (1L << (T__91 - 85)) | (1L << (T__92 - 85)) | (1L << (T__93 - 85)) | (1L << (T__94 - 85)) | (1L << (T__95 - 85)) | (1L << (T__96 - 85)) | (1L << (T__97 - 85)) | (1L << (T__98 - 85)) | (1L << (T__99 - 85)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 101:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a1\u050f\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\5\2\u00e8\n\2\3"+
		"\2\3\2\3\3\5\3\u00ed\n\3\3\4\3\4\5\4\u00f1\n\4\3\4\3\4\7\4\u00f5\n\4\f"+
		"\4\16\4\u00f8\13\4\3\5\5\5\u00fb\n\5\3\5\5\5\u00fe\n\5\3\5\5\5\u0101\n"+
		"\5\3\5\3\5\5\5\u0105\n\5\3\6\5\6\u0108\n\6\3\6\3\6\5\6\u010c\n\6\3\6\3"+
		"\6\3\7\6\7\u0111\n\7\r\7\16\7\u0112\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\5\n\u0120\n\n\3\n\3\n\7\n\u0124\n\n\f\n\16\n\u0127\13\n\3\13"+
		"\5\13\u012a\n\13\3\13\3\13\5\13\u012e\n\13\3\13\3\13\3\13\5\13\u0133\n"+
		"\13\3\13\5\13\u0136\n\13\3\f\3\f\5\f\u013a\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0143\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\7\17\u014c\n\17\f\17"+
		"\16\17\u014f\13\17\3\20\3\20\3\20\7\20\u0154\n\20\f\20\16\20\u0157\13"+
		"\20\3\21\3\21\3\21\5\21\u015c\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0163"+
		"\n\22\3\23\3\23\3\24\3\24\3\24\7\24\u016a\n\24\f\24\16\24\u016d\13\24"+
		"\3\25\3\25\3\25\7\25\u0172\n\25\f\25\16\25\u0175\13\25\3\26\6\26\u0178"+
		"\n\26\r\26\16\26\u0179\3\27\3\27\5\27\u017e\n\27\3\30\5\30\u0181\n\30"+
		"\3\30\3\30\5\30\u0185\n\30\3\30\5\30\u0188\n\30\3\30\3\30\3\31\3\31\3"+
		"\31\7\31\u018f\n\31\f\31\16\31\u0192\13\31\3\32\3\32\5\32\u0196\n\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019f\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u01a6\n\33\3\34\3\34\5\34\u01aa\n\34\3\34\3\34\5\34\u01ae\n"+
		"\34\3\34\3\34\5\34\u01b2\n\34\3\34\3\34\5\34\u01b6\n\34\3\34\3\34\5\34"+
		"\u01ba\n\34\5\34\u01bc\n\34\3\35\3\35\5\35\u01c0\n\35\3\36\3\36\5\36\u01c4"+
		"\n\36\3\37\3\37\5\37\u01c8\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u01cf\n"+
		"\37\3\37\5\37\u01d2\n\37\3 \6 \u01d5\n \r \16 \u01d6\3!\3!\5!\u01db\n"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\5#\u01e7\n#\3#\5#\u01ea\n#\3#\3#\3"+
		"#\3$\6$\u01f0\n$\r$\16$\u01f1\3%\3%\3&\3&\5&\u01f8\n&\3&\3&\5&\u01fc\n"+
		"&\3&\3&\3&\3&\5&\u0202\n&\3&\5&\u0205\n&\3\'\3\'\5\'\u0209\n\'\3(\5(\u020c"+
		"\n(\3(\3(\5(\u0210\n(\3(\3(\3(\3)\6)\u0216\n)\r)\16)\u0217\3*\3*\3*\5"+
		"*\u021d\n*\3+\3+\5+\u0221\n+\3,\3,\5,\u0225\n,\3,\3,\5,\u0229\n,\3,\3"+
		",\3-\3-\5-\u022f\n-\3.\3.\5.\u0233\n.\3.\5.\u0236\n.\3.\5.\u0239\n.\3"+
		".\3.\5.\u023d\n.\3.\3.\5.\u0241\n.\3.\3.\5.\u0245\n.\3.\3.\5.\u0249\n"+
		".\3.\3.\3.\3/\6/\u024f\n/\r/\16/\u0250\3\60\3\60\3\60\5\60\u0256\n\60"+
		"\3\60\5\60\u0259\n\60\3\61\3\61\5\61\u025d\n\61\3\62\3\62\5\62\u0261\n"+
		"\62\3\62\3\62\5\62\u0265\n\62\3\62\5\62\u0268\n\62\3\62\3\62\5\62\u026c"+
		"\n\62\3\62\5\62\u026f\n\62\3\62\3\62\5\62\u0273\n\62\3\62\5\62\u0276\n"+
		"\62\3\62\5\62\u0279\n\62\3\62\3\62\3\62\3\62\5\62\u027f\n\62\3\62\3\62"+
		"\5\62\u0283\n\62\3\62\5\62\u0286\n\62\3\62\3\62\5\62\u028a\n\62\3\62\5"+
		"\62\u028d\n\62\3\62\5\62\u0290\n\62\3\62\3\62\3\62\3\62\5\62\u0296\n\62"+
		"\3\62\3\62\5\62\u029a\n\62\3\62\5\62\u029d\n\62\3\62\5\62\u02a0\n\62\3"+
		"\62\3\62\5\62\u02a4\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66"+
		"\u02ae\n\66\3\66\3\66\5\66\u02b2\n\66\3\66\3\66\5\66\u02b6\n\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\5\67\u02be\n\67\3\67\3\67\5\67\u02c2\n\67\3\67"+
		"\3\67\3\67\5\67\u02c7\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u02ce\n\67\3"+
		"\67\3\67\5\67\u02d2\n\67\3\67\3\67\3\67\5\67\u02d7\n\67\3\67\3\67\5\67"+
		"\u02db\n\67\38\58\u02de\n8\38\38\39\59\u02e3\n9\39\39\59\u02e7\n9\39\3"+
		"9\59\u02eb\n9\39\39\39\39\39\59\u02f2\n9\39\39\59\u02f6\n9\39\39\59\u02fa"+
		"\n9\39\39\39\39\39\39\59\u0302\n9\3:\3:\3;\5;\u0307\n;\3;\3;\5;\u030b"+
		"\n;\3;\3;\3;\5;\u0310\n;\3;\3;\5;\u0314\n;\5;\u0316\n;\3<\3<\3<\6<\u031b"+
		"\n<\r<\16<\u031c\3=\3=\3>\3>\5>\u0323\n>\6>\u0325\n>\r>\16>\u0326\3?\3"+
		"?\5?\u032b\n?\3@\5@\u032e\n@\3@\3@\3A\5A\u0333\nA\3A\3A\3A\3A\5A\u0339"+
		"\nA\3A\5A\u033c\nA\3B\6B\u033f\nB\rB\16B\u0340\3C\3C\3C\5C\u0346\nC\3"+
		"D\3D\5D\u034a\nD\3D\3D\3D\3D\3D\3E\3E\3F\3F\5F\u0355\nF\6F\u0357\nF\r"+
		"F\16F\u0358\3G\3G\3G\3G\3G\5G\u0360\nG\3H\3H\3I\5I\u0365\nI\3I\3I\3I\5"+
		"I\u036a\nI\3I\3I\3I\3I\3J\3J\5J\u0372\nJ\3J\3J\5J\u0376\nJ\3J\3J\5J\u037a"+
		"\nJ\3K\3K\5K\u037e\nK\3K\3K\5K\u0382\nK\3K\3K\3K\3K\3K\3K\5K\u038a\nK"+
		"\3K\3K\5K\u038e\nK\3K\3K\3K\3K\3K\3K\5K\u0396\nK\3K\3K\5K\u039a\nK\3K"+
		"\3K\3K\3K\5K\u03a0\nK\3L\3L\3M\5M\u03a5\nM\3M\3M\3M\5M\u03aa\nM\3M\3M"+
		"\3N\3N\5N\u03b0\nN\3N\5N\u03b3\nN\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\5O\u03c4\nO\3P\6P\u03c7\nP\rP\16P\u03c8\3Q\5Q\u03cc\nQ\3Q\3"+
		"Q\5Q\u03d0\nQ\3Q\3Q\3R\5R\u03d5\nR\3R\3R\5R\u03d9\nR\3R\3R\5R\u03dd\n"+
		"R\3R\7R\u03e0\nR\fR\16R\u03e3\13R\3S\5S\u03e6\nS\3S\3S\3S\3T\3T\5T\u03ed"+
		"\nT\3T\3T\5T\u03f1\nT\3T\3T\3U\3U\3V\5V\u03f8\nV\3V\3V\3V\3W\5W\u03fe"+
		"\nW\3W\3W\3W\5W\u0403\nW\3W\7W\u0406\nW\fW\16W\u0409\13W\3X\3X\3Y\3Y\3"+
		"Y\5Y\u0410\nY\3Y\3Y\5Y\u0414\nY\3Y\5Y\u0417\nY\5Y\u0419\nY\3Z\3Z\3Z\3"+
		"Z\3[\3[\5[\u0421\n[\3[\6[\u0424\n[\r[\16[\u0425\3\\\6\\\u0429\n\\\r\\"+
		"\16\\\u042a\3]\3]\3]\3]\5]\u0431\n]\3^\3^\5^\u0435\n^\3_\3_\7_\u0439\n"+
		"_\f_\16_\u043c\13_\3_\3_\5_\u0440\n_\3_\3_\7_\u0444\n_\f_\16_\u0447\13"+
		"_\5_\u0449\n_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\5d\u0455\nd\3e\3e\3e\5e\u045a"+
		"\ne\3f\3f\3g\3g\3g\3g\3g\5g\u0463\ng\3g\3g\3g\5g\u0468\ng\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\5g\u0475\ng\3g\3g\3g\3g\5g\u047b\ng\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\5g\u0486\ng\3g\3g\3g\3g\5g\u048c\ng\3g\3g\3g\3g\5g\u0492"+
		"\ng\3g\3g\3g\3g\5g\u0498\ng\3g\3g\3g\3g\5g\u049e\ng\3g\3g\3g\3g\3g\5g"+
		"\u04a5\ng\3g\3g\3g\3g\5g\u04ab\ng\3g\3g\3g\3g\5g\u04b1\ng\3g\3g\3g\3g"+
		"\5g\u04b7\ng\3g\3g\3g\3g\5g\u04bd\ng\3g\3g\3g\3g\5g\u04c3\ng\3g\3g\3g"+
		"\3g\5g\u04c9\ng\3g\3g\5g\u04cd\ng\3g\3g\7g\u04d1\ng\fg\16g\u04d4\13g\3"+
		"h\3h\3i\6i\u04d9\ni\ri\16i\u04da\3j\3j\5j\u04df\nj\3j\3j\5j\u04e3\nj\3"+
		"j\3j\3k\3k\3l\3l\5l\u04eb\nl\3l\5l\u04ee\nl\3l\3l\3m\3m\5m\u04f4\nm\3"+
		"m\3m\7m\u04f8\nm\fm\16m\u04fb\13m\3n\3n\3n\7n\u0500\nn\fn\16n\u0503\13"+
		"n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3s\2\3\u00cct\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\2\16\3\2\26\32\4\2\t\t\64\64\3\2;<\3\2?A\4\2"+
		"\n\n::\6\2kk\u0099\u009a\u009d\u009d\u009f\u00a0\4\2\u0099\u009a\u00a0"+
		"\u00a0\3\2HK\3\2m\u0096\4\2\4\4LP\3\2QV\3\2Wf\2\u058e\2\u00e7\3\2\2\2"+
		"\4\u00ec\3\2\2\2\6\u00ee\3\2\2\2\b\u00fa\3\2\2\2\n\u0107\3\2\2\2\f\u0110"+
		"\3\2\2\2\16\u0114\3\2\2\2\20\u011b\3\2\2\2\22\u011d\3\2\2\2\24\u0135\3"+
		"\2\2\2\26\u0142\3\2\2\2\30\u0144\3\2\2\2\32\u0147\3\2\2\2\34\u014d\3\2"+
		"\2\2\36\u0150\3\2\2\2 \u0158\3\2\2\2\"\u0162\3\2\2\2$\u0164\3\2\2\2&\u0166"+
		"\3\2\2\2(\u016e\3\2\2\2*\u0177\3\2\2\2,\u017d\3\2\2\2.\u0180\3\2\2\2\60"+
		"\u0190\3\2\2\2\62\u019e\3\2\2\2\64\u01a5\3\2\2\2\66\u01bb\3\2\2\28\u01bf"+
		"\3\2\2\2:\u01c3\3\2\2\2<\u01c5\3\2\2\2>\u01d4\3\2\2\2@\u01d8\3\2\2\2B"+
		"\u01e1\3\2\2\2D\u01e4\3\2\2\2F\u01ef\3\2\2\2H\u01f3\3\2\2\2J\u0204\3\2"+
		"\2\2L\u0208\3\2\2\2N\u020b\3\2\2\2P\u0215\3\2\2\2R\u0219\3\2\2\2T\u0220"+
		"\3\2\2\2V\u0222\3\2\2\2X\u022e\3\2\2\2Z\u0230\3\2\2\2\\\u024e\3\2\2\2"+
		"^\u0258\3\2\2\2`\u025c\3\2\2\2b\u02a3\3\2\2\2d\u02a5\3\2\2\2f\u02a7\3"+
		"\2\2\2h\u02a9\3\2\2\2j\u02ab\3\2\2\2l\u02da\3\2\2\2n\u02dd\3\2\2\2p\u0301"+
		"\3\2\2\2r\u0303\3\2\2\2t\u0315\3\2\2\2v\u031a\3\2\2\2x\u031e\3\2\2\2z"+
		"\u0324\3\2\2\2|\u032a\3\2\2\2~\u032d\3\2\2\2\u0080\u033b\3\2\2\2\u0082"+
		"\u033e\3\2\2\2\u0084\u0345\3\2\2\2\u0086\u0347\3\2\2\2\u0088\u0350\3\2"+
		"\2\2\u008a\u0356\3\2\2\2\u008c\u035f\3\2\2\2\u008e\u0361\3\2\2\2\u0090"+
		"\u0364\3\2\2\2\u0092\u036f\3\2\2\2\u0094\u039f\3\2\2\2\u0096\u03a1\3\2"+
		"\2\2\u0098\u03a4\3\2\2\2\u009a\u03ad\3\2\2\2\u009c\u03c3\3\2\2\2\u009e"+
		"\u03c6\3\2\2\2\u00a0\u03cb\3\2\2\2\u00a2\u03d4\3\2\2\2\u00a4\u03e5\3\2"+
		"\2\2\u00a6\u03ea\3\2\2\2\u00a8\u03f4\3\2\2\2\u00aa\u03f7\3\2\2\2\u00ac"+
		"\u03fd\3\2\2\2\u00ae\u040a\3\2\2\2\u00b0\u0418\3\2\2\2\u00b2\u041a\3\2"+
		"\2\2\u00b4\u0423\3\2\2\2\u00b6\u0428\3\2\2\2\u00b8\u0430\3\2\2\2\u00ba"+
		"\u0434\3\2\2\2\u00bc\u0448\3\2\2\2\u00be\u044a\3\2\2\2\u00c0\u044c\3\2"+
		"\2\2\u00c2\u044e\3\2\2\2\u00c4\u0450\3\2\2\2\u00c6\u0454\3\2\2\2\u00c8"+
		"\u0459\3\2\2\2\u00ca\u045b\3\2\2\2\u00cc\u047a\3\2\2\2\u00ce\u04d5\3\2"+
		"\2\2\u00d0\u04d8\3\2\2\2\u00d2\u04dc\3\2\2\2\u00d4\u04e6\3\2\2\2\u00d6"+
		"\u04e8\3\2\2\2\u00d8\u04f1\3\2\2\2\u00da\u04fc\3\2\2\2\u00dc\u0504\3\2"+
		"\2\2\u00de\u0506\3\2\2\2\u00e0\u0508\3\2\2\2\u00e2\u050a\3\2\2\2\u00e4"+
		"\u050c\3\2\2\2\u00e6\u00e8\5,\27\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\2\2\3\u00ea\3\3\2\2\2\u00eb\u00ed"+
		"\5,\27\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\5\3\2\2\2\u00ee"+
		"\u00f6\5\b\5\2\u00ef\u00f1\7\u0098\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\3\2\2\u00f3\u00f5\5\b\5\2\u00f4"+
		"\u00f0\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\7\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\7\u0098\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe\5\f"+
		"\7\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u0101\7\u0098\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0104\7k\2\2\u0103\u0105\5\n\6\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\t\3\2\2\2\u0106\u0108\7\u0098\2\2\u0107\u0106\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\7\4\2\2\u010a"+
		"\u010c\7\u0098\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\5\u00ccg\2\u010e\13\3\2\2\2\u010f\u0111\5\16\b\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\r\3\2\2\2\u0114\u0115\7\5\2\2\u0115\u0116\5\20\t\2\u0116"+
		"\u0117\7\6\2\2\u0117\u0118\5\22\n\2\u0118\u0119\7\7\2\2\u0119\u011a\7"+
		"\b\2\2\u011a\17\3\2\2\2\u011b\u011c\5\26\f\2\u011c\21\3\2\2\2\u011d\u0125"+
		"\5\24\13\2\u011e\u0120\7\u0098\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\3\2\2\u0122\u0124\5\24\13\2\u0123"+
		"\u011f\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\23\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\7\u0098\2\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0136\5\u00cc"+
		"g\2\u012c\u012e\7\u0098\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\7\u00a1\2\2\u0130\u0132\7\4\2\2\u0131\u0133"+
		"\7\u0098\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2"+
		"\2\u0134\u0136\5\u00ccg\2\u0135\u0129\3\2\2\2\u0135\u012d\3\2\2\2\u0136"+
		"\25\3\2\2\2\u0137\u0139\5\30\r\2\u0138\u013a\5\34\17\2\u0139\u0138\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\b\2\2\u013c"+
		"\u0143\3\2\2\2\u013d\u013e\5\32\16\2\u013e\u013f\5\36\20\2\u013f\u0140"+
		"\7\b\2\2\u0140\u0143\3\2\2\2\u0141\u0143\5 \21\2\u0142\u0137\3\2\2\2\u0142"+
		"\u013d\3\2\2\2\u0142\u0141\3\2\2\2\u0143\27\3\2\2\2\u0144\u0145\5 \21"+
		"\2\u0145\u0146\7\5\2\2\u0146\31\3\2\2\2\u0147\u0148\5 \21\2\u0148\u0149"+
		"\7\5\2\2\u0149\33\3\2\2\2\u014a\u014c\7\3\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\35\3\2\2"+
		"\2\u014f\u014d\3\2\2\2\u0150\u0155\5\26\f\2\u0151\u0152\7\3\2\2\u0152"+
		"\u0154\5\26\f\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\37\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015b\5\"\22\2\u0159\u015a\7\3\2\2\u015a\u015c\5$\23\2\u015b\u0159\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c!\3\2\2\2\u015d\u0163\5&\24\2\u015e\u015f"+
		"\5(\25\2\u015f\u0160\7\t\2\2\u0160\u0161\5&\24\2\u0161\u0163\3\2\2\2\u0162"+
		"\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0163#\3\2\2\2\u0164\u0165\7\u009e"+
		"\2\2\u0165%\3\2\2\2\u0166\u016b\5*\26\2\u0167\u0168\7\n\2\2\u0168\u016a"+
		"\5*\26\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\'\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0173\5*\26\2"+
		"\u016f\u0170\7\t\2\2\u0170\u0172\5*\26\2\u0171\u016f\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174)\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0178\7\u009c\2\2\u0177\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a+\3\2\2\2\u017b"+
		"\u017e\5.\30\2\u017c\u017e\5\60\31\2\u017d\u017b\3\2\2\2\u017d\u017c\3"+
		"\2\2\2\u017e-\3\2\2\2\u017f\u0181\7\u0098\2\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\7\13\2\2\u0183\u0185\5"+
		"\60\31\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0188\7\u0098\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\7\f\2\2\u018a/\3\2\2\2\u018b\u018c\5\62\32\2\u018c"+
		"\u018d\7\u0097\2\2\u018d\u018f\3\2\2\2\u018e\u018b\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\61\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u019f\5<\37\2\u0194\u0196\7\u009e\2\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019f\5\64\33\2"+
		"\u0198\u019f\5\u0094K\2\u0199\u019f\5\66\34\2\u019a\u019f\5\u009aN\2\u019b"+
		"\u019f\5\u009cO\2\u019c\u019f\5\u00a6T\2\u019d\u019f\5\u00b0Y\2\u019e"+
		"\u0193\3\2\2\2\u019e\u0195\3\2\2\2\u019e\u0198\3\2\2\2\u019e\u0199\3\2"+
		"\2\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\63\3\2\2\2\u01a0\u01a6\5D#\2\u01a1\u01a6\5Z.\2\u01a2"+
		"\u01a6\5b\62\2\u01a3\u01a6\5j\66\2\u01a4\u01a6\5l\67\2\u01a5\u01a0\3\2"+
		"\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a4\3\2\2\2\u01a6\65\3\2\2\2\u01a7\u01a9\7\r\2\2\u01a8\u01aa\58\35"+
		"\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01bc\3\2\2\2\u01ab\u01ad"+
		"\7\16\2\2\u01ac\u01ae\58\35\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2"+
		"\u01ae\u01bc\3\2\2\2\u01af\u01b1\7\17\2\2\u01b0\u01b2\5\u00b0Y\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01bc\3\2\2\2\u01b3\u01b5\7\20"+
		"\2\2\u01b4\u01b6\5\u00b0Y\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01bc\3\2\2\2\u01b7\u01b9\7\21\2\2\u01b8\u01ba\5\u00b0Y\2\u01b9\u01b8"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01a7\3\2\2\2\u01bb"+
		"\u01ab\3\2\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01b7\3\2"+
		"\2\2\u01bc\67\3\2\2\2\u01bd\u01c0\7\u00a0\2\2\u01be\u01c0\5\u00ccg\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c09\3\2\2\2\u01c1\u01c4\7\u00a0"+
		"\2\2\u01c2\u01c4\5\u00ccg\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		";\3\2\2\2\u01c5\u01c7\7\22\2\2\u01c6\u01c8\7\u0098\2\2\u01c7\u01c6\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\6\2\2\u01ca"+
		"\u01cb\5\u00b0Y\2\u01cb\u01cc\7\7\2\2\u01cc\u01ce\5.\30\2\u01cd\u01cf"+
		"\5> \2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01d2\5B\"\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2=\3\2\2\2\u01d3"+
		"\u01d5\5@!\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7?\3\2\2\2\u01d8\u01da\7\23\2\2\u01d9\u01db"+
		"\7\u0098\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2"+
		"\2\u01dc\u01dd\7\6\2\2\u01dd\u01de\5\u00b0Y\2\u01de\u01df\7\7\2\2\u01df"+
		"\u01e0\5.\30\2\u01e0A\3\2\2\2\u01e1\u01e2\7\24\2\2\u01e2\u01e3\5.\30\2"+
		"\u01e3C\3\2\2\2\u01e4\u01e6\7\25\2\2\u01e5\u01e7\7\u0098\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea\5F$\2\u01e9"+
		"\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5J"+
		"&\2\u01ec\u01ed\5N(\2\u01edE\3\2\2\2\u01ee\u01f0\5H%\2\u01ef\u01ee\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"G\3\2\2\2\u01f3\u01f4\t\2\2\2\u01f4I\3\2\2\2\u01f5\u01f7\7\6\2\2\u01f6"+
		"\u01f8\7\u0098\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fb\5\u00b0Y\2\u01fa\u01fc\7\u0098\2\2\u01fb\u01fa\3"+
		"\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7\7\2\2\u01fe"+
		"\u0205\3\2\2\2\u01ff\u0201\7\33\2\2\u0200\u0202\7\u0098\2\2\u0201\u0200"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\5L\'\2\u0204"+
		"\u01f5\3\2\2\2\u0204\u01ff\3\2\2\2\u0205K\3\2\2\2\u0206\u0209\5\u00ca"+
		"f\2\u0207\u0209\5\u00ccg\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209"+
		"M\3\2\2\2\u020a\u020c\7\u0098\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u020f\7\13\2\2\u020e\u0210\7\u0098\2\2"+
		"\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212"+
		"\5P)\2\u0212\u0213\7\f\2\2\u0213O\3\2\2\2\u0214\u0216\5R*\2\u0215\u0214"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"Q\3\2\2\2\u0219\u021a\5T+\2\u021a\u021c\5.\30\2\u021b\u021d\5\u00d0i\2"+
		"\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021dS\3\2\2\2\u021e\u0221\5"+
		"\u00caf\2\u021f\u0221\5\u00ccg\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2"+
		"\2\u0221U\3\2\2\2\u0222\u0224\7\34\2\2\u0223\u0225\7\u0098\2\2\u0224\u0223"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\5X-\2\u0227"+
		"\u0229\7\u0098\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022b\5.\30\2\u022bW\3\2\2\2\u022c\u022f\5\u00caf\2\u022d"+
		"\u022f\5\u00ccg\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022fY\3\2\2"+
		"\2\u0230\u0232\7\35\2\2\u0231\u0233\7\u0098\2\2\u0232\u0231\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236\5\\/\2\u0235\u0234\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\7\u0098\2\2\u0238"+
		"\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\7\6"+
		"\2\2\u023b\u023d\7\u0098\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0240\7k\2\2\u023f\u0241\7\u0098\2\2\u0240\u023f"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\7\36\2\2"+
		"\u0243\u0245\7\u0098\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\5\u00b0Y\2\u0247\u0249\7\u0098\2\2\u0248\u0247"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\7\7\2\2\u024b"+
		"\u024c\5.\30\2\u024c[\3\2\2\2\u024d\u024f\5^\60\2\u024e\u024d\3\2\2\2"+
		"\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251]\3"+
		"\2\2\2\u0252\u0259\7\32\2\2\u0253\u0255\7\37\2\2\u0254\u0256\7\u0098\2"+
		"\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259"+
		"\5`\61\2\u0258\u0252\3\2\2\2\u0258\u0253\3\2\2\2\u0259_\3\2\2\2\u025a"+
		"\u025d\5\u00caf\2\u025b\u025d\5\u00ccg\2\u025c\u025a\3\2\2\2\u025c\u025b"+
		"\3\2\2\2\u025da\3\2\2\2\u025e\u0260\7 \2\2\u025f\u0261\7\u0098\2\2\u0260"+
		"\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\7\6"+
		"\2\2\u0263\u0265\7\u0098\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0268\5d\63\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026b\7\u0097\2\2\u026a\u026c\7\u0098\2"+
		"\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026f"+
		"\5f\64\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0272\7\u0097\2\2\u0271\u0273\7\u0098\2\2\u0272\u0271\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0276\5h\65\2\u0275\u0274\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0279\7\u0098\2\2\u0278\u0277"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7\7\2\2\u027b"+
		"\u02a4\5.\30\2\u027c\u027e\7 \2\2\u027d\u027f\7\u0098\2\2\u027e\u027d"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\7\6\2\2\u0281"+
		"\u0283\7\u0098\2\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285"+
		"\3\2\2\2\u0284\u0286\5d\63\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u0289\7\u0097\2\2\u0288\u028a\7\u0098\2\2\u0289\u0288"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u028d\5f\64\2\u028c"+
		"\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0290\7\u0098"+
		"\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0292\7\7\2\2\u0292\u02a4\5.\30\2\u0293\u0295\7 \2\2\u0294\u0296\7\u0098"+
		"\2\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0299\7\6\2\2\u0298\u029a\7\u0098\2\2\u0299\u0298\3\2\2\2\u0299\u029a"+
		"\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u029d\5d\63\2\u029c\u029b\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u02a0\7\u0098\2\2\u029f\u029e"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\7\7\2\2\u02a2"+
		"\u02a4\5.\30\2\u02a3\u025e\3\2\2\2\u02a3\u027c\3\2\2\2\u02a3\u0293\3\2"+
		"\2\2\u02a4c\3\2\2\2\u02a5\u02a6\5\u00b0Y\2\u02a6e\3\2\2\2\u02a7\u02a8"+
		"\5\u00b0Y\2\u02a8g\3\2\2\2\u02a9\u02aa\5\u00b0Y\2\u02aai\3\2\2\2\u02ab"+
		"\u02ad\7!\2\2\u02ac\u02ae\7\u0098\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\7\6\2\2\u02b0\u02b2\7\u0098\2"+
		"\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5"+
		"\5n8\2\u02b4\u02b6\7\u0098\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2"+
		"\u02b6\u02b7\3\2\2\2\u02b7\u02b8\7\7\2\2\u02b8\u02b9\5.\30\2\u02b9k\3"+
		"\2\2\2\u02ba\u02bb\7\"\2\2\u02bb\u02bd\5.\30\2\u02bc\u02be\7\u0098\2\2"+
		"\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1"+
		"\7!\2\2\u02c0\u02c2\7\u0098\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2"+
		"\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\6\2\2\u02c4\u02c6\5n8\2\u02c5\u02c7"+
		"\7\u0098\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2"+
		"\2\u02c8\u02c9\7\7\2\2\u02c9\u02db\3\2\2\2\u02ca\u02cb\7\"\2\2\u02cb\u02cd"+
		"\5.\30\2\u02cc\u02ce\7\u0098\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2"+
		"\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\7#\2\2\u02d0\u02d2\7\u0098\2\2\u02d1"+
		"\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\7\6"+
		"\2\2\u02d4\u02d6\5n8\2\u02d5\u02d7\7\u0098\2\2\u02d6\u02d5\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\7\7\2\2\u02d9\u02db\3\2"+
		"\2\2\u02da\u02ba\3\2\2\2\u02da\u02ca\3\2\2\2\u02dbm\3\2\2\2\u02dc\u02de"+
		"\7\u0098\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2"+
		"\2\u02df\u02e0\5\u00b0Y\2\u02e0o\3\2\2\2\u02e1\u02e3\5\f\7\2\u02e2\u02e1"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7$\2\2\u02e5"+
		"\u02e7\7\u0098\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8"+
		"\3\2\2\2\u02e8\u02ea\5r:\2\u02e9\u02eb\7\u0098\2\2\u02ea\u02e9\3\2\2\2"+
		"\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\7\13\2\2\u02ed\u02ee"+
		"\5z>\2\u02ee\u02ef\7\f\2\2\u02ef\u0302\3\2\2\2\u02f0\u02f2\5\f\7\2\u02f1"+
		"\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\7$"+
		"\2\2\u02f4\u02f6\7\u0098\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f9\5r:\2\u02f8\u02fa\7\u0098\2\2\u02f9\u02f8\3"+
		"\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7%\2\2\u02fc"+
		"\u02fd\5t;\2\u02fd\u02fe\7\13\2\2\u02fe\u02ff\5z>\2\u02ff\u0300\7\f\2"+
		"\2\u0300\u0302\3\2\2\2\u0301\u02e2\3\2\2\2\u0301\u02f1\3\2\2\2\u0302q"+
		"\3\2\2\2\u0303\u0304\7\u00a0\2\2\u0304s\3\2\2\2\u0305\u0307\7\u0098\2"+
		"\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a"+
		"\5 \21\2\u0309\u030b\7\u0098\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2"+
		"\2\u030b\u0316\3\2\2\2\u030c\u030d\5v<\2\u030d\u030f\7\3\2\2\u030e\u0310"+
		"\7\u0098\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2"+
		"\2\u0311\u0313\5 \21\2\u0312\u0314\7\u0098\2\2\u0313\u0312\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u0306\3\2\2\2\u0315\u030c\3\2"+
		"\2\2\u0316u\3\2\2\2\u0317\u0318\5x=\2\u0318\u0319\7\u0098\2\2\u0319\u031b"+
		"\3\2\2\2\u031a\u0317\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031dw\3\2\2\2\u031e\u031f\5r:\2\u031fy\3\2\2\2\u0320\u0322"+
		"\5|?\2\u0321\u0323\7\u0098\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2"+
		"\u0323\u0325\3\2\2\2\u0324\u0320\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0324"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327{\3\2\2\2\u0328\u032b\5~@\2\u0329\u032b"+
		"\5\u0080A\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032b}\3\2\2\2\u032c"+
		"\u032e\5\u0082B\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0330\5\u0094K\2\u0330\177\3\2\2\2\u0331\u0333\5\u0082"+
		"B\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0335\7k\2\2\u0335\u0336\7\4\2\2\u0336\u033c\5\u00ccg\2\u0337\u0339\5"+
		"\u0082B\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\3\2\2\2"+
		"\u033a\u033c\7k\2\2\u033b\u0332\3\2\2\2\u033b\u0338\3\2\2\2\u033c\u0081"+
		"\3\2\2\2\u033d\u033f\5\u0084C\2\u033e\u033d\3\2\2\2\u033f\u0340\3\2\2"+
		"\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0083\3\2\2\2\u0342\u0346"+
		"\5\16\b\2\u0343\u0346\7&\2\2\u0344\u0346\7\'\2\2\u0345\u0342\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0344\3\2\2\2\u0346\u0085\3\2\2\2\u0347\u0349\7("+
		"\2\2\u0348\u034a\7\u0098\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034c\5\u0088E\2\u034c\u034d\7\13\2\2\u034d\u034e"+
		"\5\u008aF\2\u034e\u034f\7\f\2\2\u034f\u0087\3\2\2\2\u0350\u0351\7\u00a0"+
		"\2\2\u0351\u0089\3\2\2\2\u0352\u0354\5\u008cG\2\u0353\u0355\7\u0098\2"+
		"\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0352"+
		"\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u008b\3\2\2\2\u035a\u035b\5\u008eH\2\u035b\u035c\7\4\2\2\u035c\u035d"+
		"\5\u00ccg\2\u035d\u0360\3\2\2\2\u035e\u0360\5\u008eH\2\u035f\u035a\3\2"+
		"\2\2\u035f\u035e\3\2\2\2\u0360\u008d\3\2\2\2\u0361\u0362\7\u00a0\2\2\u0362"+
		"\u008f\3\2\2\2\u0363\u0365\7\u0098\2\2\u0364\u0363\3\2\2\2\u0364\u0365"+
		"\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\5\u0096L\2\u0367\u0369\5\u0098"+
		"M\2\u0368\u036a\5\u0092J\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036c\7\13\2\2\u036c\u036d\5\4\3\2\u036d\u036e\7"+
		"\f\2\2\u036e\u0091\3\2\2\2\u036f\u0371\7%\2\2\u0370\u0372\7\u0098\2\2"+
		"\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375"+
		"\7)\2\2\u0374\u0376\7\u0098\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2"+
		"\2\u0376\u0377\3\2\2\2\u0377\u0379\5\u00d2j\2\u0378\u037a\7\u0098\2\2"+
		"\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0093\3\2\2\2\u037b\u037d"+
		"\7*\2\2\u037c\u037e\7\u0098\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u0381\5\u0096L\2\u0380\u0382\5\u0098M\2\u0381"+
		"\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\7\13"+
		"\2\2\u0384\u0385\5\4\3\2\u0385\u0386\7\f\2\2\u0386\u03a0\3\2\2\2\u0387"+
		"\u0389\7+\2\2\u0388\u038a\7\u0098\2\2\u0389\u0388\3\2\2\2\u0389\u038a"+
		"\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\5\u0096L\2\u038c\u038e\5\u0098"+
		"M\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\7\13\2\2\u0390\u0391\5\4\3\2\u0391\u0392\7\f\2\2\u0392\u03a0\3"+
		"\2\2\2\u0393\u0395\7,\2\2\u0394\u0396\7\u0098\2\2\u0395\u0394\3\2\2\2"+
		"\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\5\u0096L\2\u0398"+
		"\u039a\5\u0098M\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b"+
		"\3\2\2\2\u039b\u039c\7\13\2\2\u039c\u039d\5\4\3\2\u039d\u039e\7\f\2\2"+
		"\u039e\u03a0\3\2\2\2\u039f\u037b\3\2\2\2\u039f\u0387\3\2\2\2\u039f\u0393"+
		"\3\2\2\2\u03a0\u0095\3\2\2\2\u03a1\u03a2\5\u00caf\2\u03a2\u0097\3\2\2"+
		"\2\u03a3\u03a5\7\u0098\2\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u03a7\7\6\2\2\u03a7\u03a9\5\6\4\2\u03a8\u03aa\7\u0098"+
		"\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ac\7\7\2\2\u03ac\u0099\3\2\2\2\u03ad\u03af\7-\2\2\u03ae\u03b0\7\u0098"+
		"\2\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1"+
		"\u03b3\7\u009d\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4"+
		"\3\2\2\2\u03b4\u03b5\5.\30\2\u03b5\u009b\3\2\2\2\u03b6\u03b7\7.\2\2\u03b7"+
		"\u03b8\5.\30\2\u03b8\u03b9\5\u009eP\2\u03b9\u03ba\5\u00a4S\2\u03ba\u03c4"+
		"\3\2\2\2\u03bb\u03bc\7.\2\2\u03bc\u03bd\5.\30\2\u03bd\u03be\5\u00a4S\2"+
		"\u03be\u03c4\3\2\2\2\u03bf\u03c0\7.\2\2\u03c0\u03c1\5.\30\2\u03c1\u03c2"+
		"\5\u009eP\2\u03c2\u03c4\3\2\2\2\u03c3\u03b6\3\2\2\2\u03c3\u03bb\3\2\2"+
		"\2\u03c3\u03bf\3\2\2\2\u03c4\u009d\3\2\2\2\u03c5\u03c7\5\u00a0Q\2\u03c6"+
		"\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2"+
		"\2\2\u03c9\u009f\3\2\2\2\u03ca\u03cc\7\u0098\2\2\u03cb\u03ca\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\7/\2\2\u03ce\u03d0\5\u00a2"+
		"R\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\5.\30\2\u03d2\u00a1\3\2\2\2\u03d3\u03d5\7\u0098\2\2\u03d4\u03d3"+
		"\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03e1\7\u009d\2"+
		"\2\u03d7\u03d9\7\u0098\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03da\3\2\2\2\u03da\u03dc\7\3\2\2\u03db\u03dd\7\u0098\2\2\u03dc\u03db"+
		"\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\7\u009d\2"+
		"\2\u03df\u03d8\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2"+
		"\3\2\2\2\u03e2\u00a3\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03e6\7\u0098\2"+
		"\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8"+
		"\7\60\2\2\u03e8\u03e9\5.\30\2\u03e9\u00a5\3\2\2\2\u03ea\u03ec\7\61\2\2"+
		"\u03eb\u03ed\7\u0098\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03f0\5\u00a8U\2\u03ef\u03f1\5\u00aaV\2\u03f0\u03ef"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\5.\30\2\u03f3"+
		"\u00a7\3\2\2\2\u03f4\u03f5\7\u00a0\2\2\u03f5\u00a9\3\2\2\2\u03f6\u03f8"+
		"\7\u0098\2\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2"+
		"\2\u03f9\u03fa\7\62\2\2\u03fa\u03fb\5\u00acW\2\u03fb\u00ab\3\2\2\2\u03fc"+
		"\u03fe\7\u0098\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u0407\5\u00aeX\2\u0400\u0402\7\3\2\2\u0401\u0403\7\u0098"+
		"\2\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0406\5\u00aeX\2\u0405\u0400\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405"+
		"\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u00ad\3\2\2\2\u0409\u0407\3\2\2\2\u040a"+
		"\u040b\5\u00c6d\2\u040b\u00af\3\2\2\2\u040c\u0419\5\u00b2Z\2\u040d\u040f"+
		"\5\u00bc_\2\u040e\u0410\5\u00b4[\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0419\3\2\2\2\u0411\u0413\5\u00ccg\2\u0412\u0414\5\u00b6\\"+
		"\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415\u0417"+
		"\5\u00b4[\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\3\2\2"+
		"\2\u0418\u040c\3\2\2\2\u0418\u040d\3\2\2\2\u0418\u0411\3\2\2\2\u0419\u00b1"+
		"\3\2\2\2\u041a\u041b\5\u00ccg\2\u041b\u041c\5\u00e0q\2\u041c\u041d\5\62"+
		"\32\2\u041d\u00b3\3\2\2\2\u041e\u0420\7\63\2\2\u041f\u0421\7\u0098\2\2"+
		"\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424"+
		"\5\u00bc_\2\u0423\u041e\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0423\3\2\2"+
		"\2\u0425\u0426\3\2\2\2\u0426\u00b5\3\2\2\2\u0427\u0429\5\u00b8]\2\u0428"+
		"\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2"+
		"\2\2\u042b\u00b7\3\2\2\2\u042c\u0431\5\u00e2r\2\u042d\u042e\5\u00e4s\2"+
		"\u042e\u042f\5\u00ba^\2\u042f\u0431\3\2\2\2\u0430\u042c\3\2\2\2\u0430"+
		"\u042d\3\2\2\2\u0431\u00b9\3\2\2\2\u0432\u0435\5\u00caf\2\u0433\u0435"+
		"\5\u00ccg\2\u0434\u0432\3\2\2\2\u0434\u0433\3\2\2\2\u0435\u00bb\3\2\2"+
		"\2\u0436\u043a\5\u00c2b\2\u0437\u0439\5\u00c8e\2\u0438\u0437\3\2\2\2\u0439"+
		"\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0449\3\2"+
		"\2\2\u043c\u043a\3\2\2\2\u043d\u043f\5\u00be`\2\u043e\u0440\5\u00c0a\2"+
		"\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0445"+
		"\5\u00c6d\2\u0442\u0444\5\u00c8e\2\u0443\u0442\3\2\2\2\u0444\u0447\3\2"+
		"\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0449\3\2\2\2\u0447"+
		"\u0445\3\2\2\2\u0448\u0436\3\2\2\2\u0448\u043d\3\2\2\2\u0449\u00bd\3\2"+
		"\2\2\u044a\u044b\t\3\2\2\u044b\u00bf\3\2\2\2\u044c\u044d\5\u00ccg\2\u044d"+
		"\u00c1\3\2\2\2\u044e\u044f\5\u00c4c\2\u044f\u00c3\3\2\2\2\u0450\u0451"+
		"\7\u00a0\2\2\u0451\u00c5\3\2\2\2\u0452\u0455\5\u00c2b\2\u0453\u0455\5"+
		"\u00ccg\2\u0454\u0452\3\2\2\2\u0454\u0453\3\2\2\2\u0455\u00c7\3\2\2\2"+
		"\u0456\u045a\5\u00c6d\2\u0457\u045a\5\u00b8]\2\u0458\u045a\7l\2\2\u0459"+
		"\u0456\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u0458\3\2\2\2\u045a\u00c9\3\2"+
		"\2\2\u045b\u045c\5\u00c6d\2\u045c\u00cb\3\2\2\2\u045d\u045e\bg\1\2\u045e"+
		"\u045f\7\u009d\2\2\u045f\u047b\5\u00ccg\27\u0460\u0462\7\66\2\2\u0461"+
		"\u0463\7\u0098\2\2\u0462\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464"+
		"\3\2\2\2\u0464\u047b\5\u00ccg\26\u0465\u0467\7\67\2\2\u0466\u0468\7\u0098"+
		"\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u047b\5\u00ccg\25\u046a\u046b\78\2\2\u046b\u047b\5\u00ccg\24\u046c\u046d"+
		"\79\2\2\u046d\u047b\5\u00ccg\23\u046e\u046f\7\n\2\2\u046f\u047b\5\u00cc"+
		"g\22\u0470\u0471\7:\2\2\u0471\u047b\5\u00ccg\21\u0472\u0474\t\4\2\2\u0473"+
		"\u0475\7\u0098\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u047b\5\u00ccg\20\u0477\u0478\7=\2\2\u0478\u047b\5\u00cc"+
		"g\17\u0479\u047b\5\u00ceh\2\u047a\u045d\3\2\2\2\u047a\u0460\3\2\2\2\u047a"+
		"\u0465\3\2\2\2\u047a\u046a\3\2\2\2\u047a\u046c\3\2\2\2\u047a\u046e\3\2"+
		"\2\2\u047a\u0470\3\2\2\2\u047a\u0472\3\2\2\2\u047a\u0477\3\2\2\2\u047a"+
		"\u0479\3\2\2\2\u047b\u04d2\3\2\2\2\u047c\u047d\f\32\2\2\u047d\u047e\7"+
		"\t\2\2\u047e\u04d1\5\u00ccg\33\u047f\u0480\f\31\2\2\u0480\u0481\7\65\2"+
		"\2\u0481\u04d1\5\u00ccg\32\u0482\u0483\f\16\2\2\u0483\u0485\7>\2\2\u0484"+
		"\u0486\7\u0098\2\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487"+
		"\3\2\2\2\u0487\u04d1\5\u00ccg\17\u0488\u0489\f\r\2\2\u0489\u048b\7j\2"+
		"\2\u048a\u048c\7\u0098\2\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"\u048d\3\2\2\2\u048d\u04d1\5\u00ccg\16\u048e\u048f\f\f\2\2\u048f\u0491"+
		"\t\5\2\2\u0490\u0492\7\u0098\2\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2"+
		"\2\u0492\u0493\3\2\2\2\u0493\u04d1\5\u00ccg\r\u0494\u0495\f\13\2\2\u0495"+
		"\u0497\t\6\2\2\u0496\u0498\7\u0098\2\2\u0497\u0496\3\2\2\2\u0497\u0498"+
		"\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u04d1\5\u00ccg\f\u049a\u049b\f\n\2"+
		"\2\u049b\u049d\5\u00dep\2\u049c\u049e\7\u0098\2\2\u049d\u049c\3\2\2\2"+
		"\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\5\u00ccg\13\u04a0"+
		"\u04d1\3\2\2\2\u04a1\u04a2\f\t\2\2\u04a2\u04a4\7B\2\2\u04a3\u04a5\7\u0098"+
		"\2\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04d1\5\u00ccg\n\u04a7\u04a8\f\b\2\2\u04a8\u04aa\7C\2\2\u04a9\u04ab\7"+
		"\u0098\2\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2"+
		"\u04ac\u04d1\5\u00ccg\t\u04ad\u04ae\f\7\2\2\u04ae\u04b0\7D\2\2\u04af\u04b1"+
		"\7\u0098\2\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2"+
		"\2\u04b2\u04d1\5\u00ccg\b\u04b3\u04b4\f\6\2\2\u04b4\u04b6\7E\2\2\u04b5"+
		"\u04b7\7\u0098\2\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8"+
		"\3\2\2\2\u04b8\u04d1\5\u00ccg\7\u04b9\u04ba\f\5\2\2\u04ba\u04bc\7F\2\2"+
		"\u04bb\u04bd\7\u0098\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04d1\5\u00ccg\6\u04bf\u04c0\f\4\2\2\u04c0\u04c2"+
		"\7G\2\2\u04c1\u04c3\7\u0098\2\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2"+
		"\2\u04c3\u04c4\3\2\2\2\u04c4\u04d1\5\u00ccg\5\u04c5\u04c6\f\30\2\2\u04c6"+
		"\u04c8\7\5\2\2\u04c7\u04c9\7\u0098\2\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9"+
		"\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\5\u00ccg\2\u04cb\u04cd\7\u0098"+
		"\2\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04cf\7\b\2\2\u04cf\u04d1\3\2\2\2\u04d0\u047c\3\2\2\2\u04d0\u047f\3\2"+
		"\2\2\u04d0\u0482\3\2\2\2\u04d0\u0488\3\2\2\2\u04d0\u048e\3\2\2\2\u04d0"+
		"\u0494\3\2\2\2\u04d0\u049a\3\2\2\2\u04d0\u04a1\3\2\2\2\u04d0\u04a7\3\2"+
		"\2\2\u04d0\u04ad\3\2\2\2\u04d0\u04b3\3\2\2\2\u04d0\u04b9\3\2\2\2\u04d0"+
		"\u04bf\3\2\2\2\u04d0\u04c5\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2"+
		"\2\2\u04d2\u04d3\3\2\2\2\u04d3\u00cd\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5"+
		"\u04d6\t\7\2\2\u04d6\u00cf\3\2\2\2\u04d7\u04d9\7\u0097\2\2\u04d8\u04d7"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u00d1\3\2\2\2\u04dc\u04de\7\6\2\2\u04dd\u04df\7\u0098\2\2\u04de\u04dd"+
		"\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2\5\u00b0Y"+
		"\2\u04e1\u04e3\7\u0098\2\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e4\3\2\2\2\u04e4\u04e5\7\7\2\2\u04e5\u00d3\3\2\2\2\u04e6\u04e7\t\b"+
		"\2\2\u04e7\u00d5\3\2\2\2\u04e8\u04ea\7\6\2\2\u04e9\u04eb\5\u00d8m\2\u04ea"+
		"\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04ee\7\u0098"+
		"\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f0\7\7\2\2\u04f0\u00d7\3\2\2\2\u04f1\u04f9\5\u00dan\2\u04f2\u04f4"+
		"\7\u0098\2\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2"+
		"\2\u04f5\u04f6\7\3\2\2\u04f6\u04f8\5\u00dan\2\u04f7\u04f3\3\2\2\2\u04f8"+
		"\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u00d9\3\2"+
		"\2\2\u04fb\u04f9\3\2\2\2\u04fc\u0501\5\u00ccg\2\u04fd\u04fe\7\3\2\2\u04fe"+
		"\u0500\5\u00ccg\2\u04ff\u04fd\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u00db\3\2\2\2\u0503\u0501\3\2\2\2\u0504"+
		"\u0505\t\t\2\2\u0505\u00dd\3\2\2\2\u0506\u0507\t\n\2\2\u0507\u00df\3\2"+
		"\2\2\u0508\u0509\t\13\2\2\u0509\u00e1\3\2\2\2\u050a\u050b\t\f\2\2\u050b"+
		"\u00e3\3\2\2\2\u050c\u050d\t\r\2\2\u050d\u00e5\3\2\2\2\u00cd\u00e7\u00ec"+
		"\u00f0\u00f6\u00fa\u00fd\u0100\u0104\u0107\u010b\u0112\u011f\u0125\u0129"+
		"\u012d\u0132\u0135\u0139\u0142\u014d\u0155\u015b\u0162\u016b\u0173\u0179"+
		"\u017d\u0180\u0184\u0187\u0190\u0195\u019e\u01a5\u01a9\u01ad\u01b1\u01b5"+
		"\u01b9\u01bb\u01bf\u01c3\u01c7\u01ce\u01d1\u01d6\u01da\u01e6\u01e9\u01f1"+
		"\u01f7\u01fb\u0201\u0204\u0208\u020b\u020f\u0217\u021c\u0220\u0224\u0228"+
		"\u022e\u0232\u0235\u0238\u023c\u0240\u0244\u0248\u0250\u0255\u0258\u025c"+
		"\u0260\u0264\u0267\u026b\u026e\u0272\u0275\u0278\u027e\u0282\u0285\u0289"+
		"\u028c\u028f\u0295\u0299\u029c\u029f\u02a3\u02ad\u02b1\u02b5\u02bd\u02c1"+
		"\u02c6\u02cd\u02d1\u02d6\u02da\u02dd\u02e2\u02e6\u02ea\u02f1\u02f5\u02f9"+
		"\u0301\u0306\u030a\u030f\u0313\u0315\u031c\u0322\u0326\u032a\u032d\u0332"+
		"\u0338\u033b\u0340\u0345\u0349\u0354\u0358\u035f\u0364\u0369\u0371\u0375"+
		"\u0379\u037d\u0381\u0389\u038d\u0395\u0399\u039f\u03a4\u03a9\u03af\u03b2"+
		"\u03c3\u03c8\u03cb\u03cf\u03d4\u03d8\u03dc\u03e1\u03e5\u03ec\u03f0\u03f7"+
		"\u03fd\u0402\u0407\u040f\u0413\u0416\u0418\u0420\u0425\u042a\u0430\u0434"+
		"\u043a\u043f\u0445\u0448\u0454\u0459\u0462\u0467\u0474\u047a\u0485\u048b"+
		"\u0491\u0497\u049d\u04a4\u04aa\u04b0\u04b6\u04bc\u04c2\u04c8\u04cc\u04d0"+
		"\u04d2\u04da\u04de\u04e2\u04ea\u04ed\u04f3\u04f9\u0501";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}