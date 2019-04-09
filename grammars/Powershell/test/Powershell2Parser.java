// Generated from Powershell2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Powershell2Parser extends Parser {
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
		T__52=53, PostfixOperator=54, TYPELITERAL=55, ExpandableStringToken=56, 
		LiteralStringToken=57, VariableToken=58, ParameterToken=59, ParameterArgumentToken=60, 
		PropertyNameToken=61, CmdletName=62, NEWLINES=63, MultiLineComment=64, 
		SingleLineComment=65, WhiteSpaces=66, ASSIGNMENTOPERATOR=67, NumberToken=68, 
		DEQ=69, DNE=70, DGE=71, DGT=72, DLT=73, DLE=74, DIEQ=75, DINE=76, DIGE=77, 
		DIGT=78, DILT=79, DILE=80, DCEQ=81, DCNE=82, DCGE=83, DCGT=84, DCLT=85, 
		CLE=86, DLIKE=87, DNOTLIKE=88, DMATCH=89, DNOTMATCH=90, DILIKE=91, DINOTLIKE=92, 
		DIMATCH=93, DINOTMATCH=94, DCLIKE=95, DCNOTLIKE=96, DCMATCH=97, DCNOTMATCH=98, 
		DCONTAINS=99, DNOTCONTAINS=100, DICONTAINS=101, DINOTCONTAINS=102, DCCONTAINS=103, 
		DCNOTCONTAINS=104, DISNOT=105, DIS=106, DAS=107, DREPLACE=108, DIREPLACE=109, 
		DCREPLACE=110, STATEMENTTERMINATOR=111, LABEL=112;
	public static final int
		RULE_startRule = 0, RULE_statementList = 1, RULE_statement = 2, RULE_labeledStatement = 3, 
		RULE_pipeline = 4, RULE_assignmentExpression = 5, RULE_lvalueExpression = 6, 
		RULE_lvalue = 7, RULE_simplelvalue = 8, RULE_firstPipelineElement = 9, 
		RULE_cmdletCall = 10, RULE_commandInvocationOperator = 11, RULE_commandElement = 12, 
		RULE_redirection = 13, RULE_statementBlock = 14, RULE_ifStatement = 15, 
		RULE_elseifClause = 16, RULE_elseClause = 17, RULE_switchStatement = 18, 
		RULE_switchParameter = 19, RULE_switchCondition = 20, RULE_switchFilename = 21, 
		RULE_switchBody = 22, RULE_switchClause = 23, RULE_switchClauseCondition = 24, 
		RULE_propertyorarrayreference = 25, RULE_propertyorarrayreferenceoperator = 26, 
		RULE_trapStatement = 27, RULE_flowControlStatement = 28, RULE_labelExpression = 29, 
		RULE_expression = 30, RULE_value = 31, RULE_comparisonOperator = 32, RULE_redirectionOperator = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "statementList", "statement", "labeledStatement", "pipeline", 
			"assignmentExpression", "lvalueExpression", "lvalue", "simplelvalue", 
			"firstPipelineElement", "cmdletCall", "commandInvocationOperator", "commandElement", 
			"redirection", "statementBlock", "ifStatement", "elseifClause", "elseClause", 
			"switchStatement", "switchParameter", "switchCondition", "switchFilename", 
			"switchBody", "switchClause", "switchClauseCondition", "propertyorarrayreference", 
			"propertyorarrayreferenceoperator", "trapStatement", "flowControlStatement", 
			"labelExpression", "expression", "value", "comparisonOperator", "redirectionOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'['", "']'", "'&'", "'.'", "'{'", "'}'", "'if'", "'('", 
			"')'", "'elseif'", "'else'", "'switch'", "'-regex'", "'-wildcard'", "'-exact'", 
			"'-casesensitive'", "'-parallel'", "'-file'", "'default'", "'trap'", 
			"'break'", "'continue'", "'throw'", "'return'", "'exit'", "'::'", "'-join'", 
			"'-split'", "'++'", "'--'", "'+'", "'-'", "'-not'", "'-bnot'", "'!'", 
			"'..'", "'-f'", "'*'", "'/'", "'%'", "'-bxor'", "'-bor'", "'-band'", 
			"'-xor'", "'-or'", "'-and'", "'2>&1'", "'3>&1'", "'4>&1'", "'5>&1'", 
			"'6>&1'", "'1>&2'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PostfixOperator", "TYPELITERAL", 
			"ExpandableStringToken", "LiteralStringToken", "VariableToken", "ParameterToken", 
			"ParameterArgumentToken", "PropertyNameToken", "CmdletName", "NEWLINES", 
			"MultiLineComment", "SingleLineComment", "WhiteSpaces", "ASSIGNMENTOPERATOR", 
			"NumberToken", "DEQ", "DNE", "DGE", "DGT", "DLT", "DLE", "DIEQ", "DINE", 
			"DIGE", "DIGT", "DILT", "DILE", "DCEQ", "DCNE", "DCGE", "DCGT", "DCLT", 
			"CLE", "DLIKE", "DNOTLIKE", "DMATCH", "DNOTMATCH", "DILIKE", "DINOTLIKE", 
			"DIMATCH", "DINOTMATCH", "DCLIKE", "DCNOTLIKE", "DCMATCH", "DCNOTMATCH", 
			"DCONTAINS", "DNOTCONTAINS", "DICONTAINS", "DINOTCONTAINS", "DCCONTAINS", 
			"DCNOTCONTAINS", "DISNOT", "DIS", "DAS", "DREPLACE", "DIREPLACE", "DCREPLACE", 
			"STATEMENTTERMINATOR", "LABEL"
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
	public String getGrammarFileName() { return "Powershell2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Powershell2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Powershell2Parser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			statementList();
			setState(69);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> STATEMENTTERMINATOR() { return getTokens(Powershell2Parser.STATEMENTTERMINATOR); }
		public TerminalNode STATEMENTTERMINATOR(int i) {
			return getToken(Powershell2Parser.STATEMENTTERMINATOR, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			statement();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATEMENTTERMINATOR) {
				{
				{
				setState(72);
				match(STATEMENTTERMINATOR);
				setState(73);
				statement();
				}
				}
				setState(78);
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
		public TerminalNode LABEL() { return getToken(Powershell2Parser.LABEL, 0); }
		public FlowControlStatementContext flowControlStatement() {
			return getRuleContext(FlowControlStatementContext.class,0);
		}
		public TrapStatementContext trapStatement() {
			return getRuleContext(TrapStatementContext.class,0);
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
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(80);
					match(LABEL);
					}
				}

				setState(83);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				flowControlStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				trapStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				pipeline();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			switchStatement();
			}
		}
		catch (RecognitionException re) {
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
		public FirstPipelineElementContext firstPipelineElement() {
			return getRuleContext(FirstPipelineElementContext.class,0);
		}
		public List<CmdletCallContext> cmdletCall() {
			return getRuleContexts(CmdletCallContext.class);
		}
		public CmdletCallContext cmdletCall(int i) {
			return getRuleContext(CmdletCallContext.class,i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pipeline);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				firstPipelineElement();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(93);
					match(T__0);
					setState(94);
					cmdletCall();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public LvalueExpressionContext lvalueExpression() {
			return getRuleContext(LvalueExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(Powershell2Parser.ASSIGNMENTOPERATOR, 0); }
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			lvalueExpression();
			setState(103);
			match(ASSIGNMENTOPERATOR);
			setState(104);
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

	public static class LvalueExpressionContext extends ParserRuleContext {
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public LvalueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterLvalueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitLvalueExpression(this);
		}
	}

	public final LvalueExpressionContext lvalueExpression() throws RecognitionException {
		LvalueExpressionContext _localctx = new LvalueExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lvalueExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			lvalue();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(113);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(107);
					match(T__1);
					setState(108);
					lvalue();
					setState(109);
					match(T__2);
					}
					break;
				case T__0:
					{
					setState(111);
					match(T__0);
					setState(112);
					lvalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(117);
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

	public static class LvalueContext extends ParserRuleContext {
		public SimplelvalueContext simplelvalue() {
			return getRuleContext(SimplelvalueContext.class,0);
		}
		public List<PropertyorarrayreferenceoperatorContext> propertyorarrayreferenceoperator() {
			return getRuleContexts(PropertyorarrayreferenceoperatorContext.class);
		}
		public PropertyorarrayreferenceoperatorContext propertyorarrayreferenceoperator(int i) {
			return getRuleContext(PropertyorarrayreferenceoperatorContext.class,i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lvalue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			simplelvalue();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					propertyorarrayreferenceoperator();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class SimplelvalueContext extends ParserRuleContext {
		public TerminalNode VariableToken() { return getToken(Powershell2Parser.VariableToken, 0); }
		public List<TerminalNode> TYPELITERAL() { return getTokens(Powershell2Parser.TYPELITERAL); }
		public TerminalNode TYPELITERAL(int i) {
			return getToken(Powershell2Parser.TYPELITERAL, i);
		}
		public SimplelvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplelvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSimplelvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSimplelvalue(this);
		}
	}

	public final SimplelvalueContext simplelvalue() throws RecognitionException {
		SimplelvalueContext _localctx = new SimplelvalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simplelvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPELITERAL) {
				{
				{
				setState(125);
				match(TYPELITERAL);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(VariableToken);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstPipelineElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdletCallContext cmdletCall() {
			return getRuleContext(CmdletCallContext.class,0);
		}
		public FirstPipelineElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstPipelineElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterFirstPipelineElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitFirstPipelineElement(this);
		}
	}

	public final FirstPipelineElementContext firstPipelineElement() throws RecognitionException {
		FirstPipelineElementContext _localctx = new FirstPipelineElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_firstPipelineElement);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				cmdletCall();
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

	public static class CmdletCallContext extends ParserRuleContext {
		public TerminalNode CmdletName() { return getToken(Powershell2Parser.CmdletName, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandInvocationOperatorContext commandInvocationOperator() {
			return getRuleContext(CommandInvocationOperatorContext.class,0);
		}
		public List<CommandElementContext> commandElement() {
			return getRuleContexts(CommandElementContext.class);
		}
		public CommandElementContext commandElement(int i) {
			return getRuleContext(CommandElementContext.class,i);
		}
		public CmdletCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdletCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterCmdletCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitCmdletCall(this);
		}
	}

	public final CmdletCallContext cmdletCall() throws RecognitionException {
		CmdletCallContext _localctx = new CmdletCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdletCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(137);
				commandInvocationOperator();
				}
				break;
			}
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(140);
				match(CmdletName);
				}
				break;
			case 2:
				{
				setState(141);
				expression(0);
				}
				break;
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << PostfixOperator) | (1L << ParameterToken) | (1L << ParameterArgumentToken))) != 0)) {
				{
				{
				setState(144);
				commandElement();
				}
				}
				setState(149);
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

	public static class CommandInvocationOperatorContext extends ParserRuleContext {
		public CommandInvocationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandInvocationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterCommandInvocationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitCommandInvocationOperator(this);
		}
	}

	public final CommandInvocationOperatorContext commandInvocationOperator() throws RecognitionException {
		CommandInvocationOperatorContext _localctx = new CommandInvocationOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_commandInvocationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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

	public static class CommandElementContext extends ParserRuleContext {
		public TerminalNode ParameterToken() { return getToken(Powershell2Parser.ParameterToken, 0); }
		public TerminalNode ParameterArgumentToken() { return getToken(Powershell2Parser.ParameterArgumentToken, 0); }
		public TerminalNode PostfixOperator() { return getToken(Powershell2Parser.PostfixOperator, 0); }
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public CommandElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterCommandElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitCommandElement(this);
		}
	}

	public final CommandElementContext commandElement() throws RecognitionException {
		CommandElementContext _localctx = new CommandElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commandElement);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParameterToken:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ParameterToken);
				}
				break;
			case ParameterArgumentToken:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(ParameterArgumentToken);
				}
				break;
			case PostfixOperator:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(PostfixOperator);
				}
				break;
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				redirection();
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

	public static class RedirectionContext extends ParserRuleContext {
		public RedirectionOperatorContext redirectionOperator() {
			return getRuleContext(RedirectionOperatorContext.class,0);
		}
		public PropertyorarrayreferenceContext propertyorarrayreference() {
			return getRuleContext(PropertyorarrayreferenceContext.class,0);
		}
		public RedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterRedirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitRedirection(this);
		}
	}

	public final RedirectionContext redirection() throws RecognitionException {
		RedirectionContext _localctx = new RedirectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_redirection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			redirectionOperator();
			setState(159);
			propertyorarrayreference();
			}
		}
		catch (RecognitionException re) {
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
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitStatementBlock(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__5);
			setState(162);
			statementList();
			setState(163);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public List<ElseifClauseContext> elseifClause() {
			return getRuleContexts(ElseifClauseContext.class);
		}
		public ElseifClauseContext elseifClause(int i) {
			return getRuleContext(ElseifClauseContext.class,i);
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
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__7);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(166);
				match(NEWLINES);
				}
			}

			setState(169);
			match(T__8);
			setState(170);
			pipeline();
			setState(171);
			match(T__9);
			setState(172);
			statementBlock();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(173);
				elseifClause();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(179);
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

	public static class ElseifClauseContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public ElseifClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterElseifClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitElseifClause(this);
		}
	}

	public final ElseifClauseContext elseifClause() throws RecognitionException {
		ElseifClauseContext _localctx = new ElseifClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseifClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__10);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(183);
				match(NEWLINES);
				}
			}

			setState(186);
			match(T__8);
			setState(187);
			pipeline();
			setState(188);
			match(T__9);
			setState(189);
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
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitElseClause(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__11);
			setState(192);
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
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public List<SwitchParameterContext> switchParameter() {
			return getRuleContexts(SwitchParameterContext.class);
		}
		public SwitchParameterContext switchParameter(int i) {
			return getRuleContext(SwitchParameterContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__12);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(195);
				match(NEWLINES);
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(198);
				switchParameter();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			switchCondition();
			setState(205);
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

	public static class SwitchParameterContext extends ParserRuleContext {
		public SwitchParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSwitchParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSwitchParameter(this);
		}
	}

	public final SwitchParameterContext switchParameter() throws RecognitionException {
		SwitchParameterContext _localctx = new SwitchParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switchParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		public List<TerminalNode> NEWLINES() { return getTokens(Powershell2Parser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(Powershell2Parser.NEWLINES, i);
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
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSwitchCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSwitchCondition(this);
		}
	}

	public final SwitchConditionContext switchCondition() throws RecognitionException {
		SwitchConditionContext _localctx = new SwitchConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchCondition);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__8);
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(210);
					match(NEWLINES);
					}
					break;
				}
				setState(213);
				pipeline();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(214);
					match(NEWLINES);
					}
				}

				setState(217);
				match(T__9);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__18);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(220);
					match(NEWLINES);
					}
					break;
				}
				setState(223);
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
		public PropertyorarrayreferenceContext propertyorarrayreference() {
			return getRuleContext(PropertyorarrayreferenceContext.class,0);
		}
		public SwitchFilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchFilename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSwitchFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSwitchFilename(this);
		}
	}

	public final SwitchFilenameContext switchFilename() throws RecognitionException {
		SwitchFilenameContext _localctx = new SwitchFilenameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchFilename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			propertyorarrayreference();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> NEWLINES() { return getTokens(Powershell2Parser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(Powershell2Parser.NEWLINES, i);
		}
		public List<SwitchClauseContext> switchClause() {
			return getRuleContexts(SwitchClauseContext.class);
		}
		public SwitchClauseContext switchClause(int i) {
			return getRuleContext(SwitchClauseContext.class,i);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSwitchBody(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(228);
				match(NEWLINES);
				}
			}

			setState(231);
			match(T__5);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(232);
				match(NEWLINES);
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__19) | (1L << ExpandableStringToken) | (1L << LiteralStringToken) | (1L << VariableToken) | (1L << ParameterArgumentToken))) != 0) || _la==NumberToken) {
				{
				{
				setState(235);
				switchClause();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		public SwitchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSwitchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSwitchClause(this);
		}
	}

	public final SwitchClauseContext switchClause() throws RecognitionException {
		SwitchClauseContext _localctx = new SwitchClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			switchClauseCondition();
			setState(244);
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

	public static class SwitchClauseConditionContext extends ParserRuleContext {
		public TerminalNode ParameterArgumentToken() { return getToken(Powershell2Parser.ParameterArgumentToken, 0); }
		public PropertyorarrayreferenceContext propertyorarrayreference() {
			return getRuleContext(PropertyorarrayreferenceContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public SwitchClauseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchClauseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSwitchClauseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSwitchClauseCondition(this);
		}
	}

	public final SwitchClauseConditionContext switchClauseCondition() throws RecognitionException {
		SwitchClauseConditionContext _localctx = new SwitchClauseConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchClauseCondition);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(ParameterArgumentToken);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				propertyorarrayreference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
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

	public static class PropertyorarrayreferenceContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<PropertyorarrayreferenceoperatorContext> propertyorarrayreferenceoperator() {
			return getRuleContexts(PropertyorarrayreferenceoperatorContext.class);
		}
		public PropertyorarrayreferenceoperatorContext propertyorarrayreferenceoperator(int i) {
			return getRuleContext(PropertyorarrayreferenceoperatorContext.class,i);
		}
		public PropertyorarrayreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyorarrayreference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterPropertyorarrayreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitPropertyorarrayreference(this);
		}
	}

	public final PropertyorarrayreferenceContext propertyorarrayreference() throws RecognitionException {
		PropertyorarrayreferenceContext _localctx = new PropertyorarrayreferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_propertyorarrayreference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			value();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__4) {
				{
				{
				setState(253);
				propertyorarrayreferenceoperator();
				}
				}
				setState(258);
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

	public static class PropertyorarrayreferenceoperatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertyorarrayreferenceoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyorarrayreferenceoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterPropertyorarrayreferenceoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitPropertyorarrayreferenceoperator(this);
		}
	}

	public final PropertyorarrayreferenceoperatorContext propertyorarrayreferenceoperator() throws RecognitionException {
		PropertyorarrayreferenceoperatorContext _localctx = new PropertyorarrayreferenceoperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_propertyorarrayreferenceoperator);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__1);
				setState(260);
				expression(0);
				setState(261);
				match(T__2);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__4);
				setState(264);
				value();
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

	public static class TrapStatementContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public TerminalNode TYPELITERAL() { return getToken(Powershell2Parser.TYPELITERAL, 0); }
		public TrapStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trapStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterTrapStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitTrapStatement(this);
		}
	}

	public final TrapStatementContext trapStatement() throws RecognitionException {
		TrapStatementContext _localctx = new TrapStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_trapStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__20);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(268);
				match(NEWLINES);
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPELITERAL) {
				{
				setState(271);
				match(TYPELITERAL);
				}
			}

			setState(274);
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
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterFlowControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitFlowControlStatement(this);
		}
	}

	public final FlowControlStatementContext flowControlStatement() throws RecognitionException {
		FlowControlStatementContext _localctx = new FlowControlStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_flowControlStatement);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__21);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(277);
					labelExpression();
					}
					break;
				}
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(T__22);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(281);
					labelExpression();
					}
					break;
				}
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__23);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(285);
					pipeline();
					}
					break;
				}
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(T__24);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(289);
					pipeline();
					}
					break;
				}
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				match(T__25);
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(293);
					pipeline();
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

	public static class LabelExpressionContext extends ParserRuleContext {
		public TerminalNode PropertyNameToken() { return getToken(Powershell2Parser.PropertyNameToken, 0); }
		public PropertyorarrayreferenceContext propertyorarrayreference() {
			return getRuleContext(PropertyorarrayreferenceContext.class,0);
		}
		public LabelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitLabelExpression(this);
		}
	}

	public final LabelExpressionContext labelExpression() throws RecognitionException {
		LabelExpressionContext _localctx = new LabelExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_labelExpression);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PropertyNameToken:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(PropertyNameToken);
				}
				break;
			case EOF:
			case T__1:
			case T__4:
			case T__6:
			case ExpandableStringToken:
			case LiteralStringToken:
			case VariableToken:
			case NumberToken:
			case STATEMENTTERMINATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				propertyorarrayreference();
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
		public List<TerminalNode> NEWLINES() { return getTokens(Powershell2Parser.NEWLINES); }
		public TerminalNode NEWLINES(int i) {
			return getToken(Powershell2Parser.NEWLINES, i);
		}
		public ElementAccessExpreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterElementAccessExpre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitElementAccessExpre(this);
		}
	}
	public static class ValueExpressionContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitValueExpression(this);
		}
	}
	public static class FormatExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public FormatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterFormatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitFormatExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitAdditiveExpression(this);
		}
	}
	public static class XorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public XorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitXorExpression(this);
		}
	}
	public static class BorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public BorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterBorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitBorExpression(this);
		}
	}
	public static class BandExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public BandExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterBandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitBandExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitNotExpression(this);
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
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitComparisonExpression(this);
		}
	}
	public static class PreDecrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitPreDecrementExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BxorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public BxorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterBxorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitBxorExpression(this);
		}
	}
	public static class NotexclamExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotexclamExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterNotexclamExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitNotexclamExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitOrExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode TYPELITERAL() { return getToken(Powershell2Parser.TYPELITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitCastExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitAndExpression(this);
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
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterMemberClassAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitMemberClassAccessExpression(this);
		}
	}
	public static class JoinExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public JoinExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterJoinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitJoinExpression(this);
		}
	}
	public static class SplitExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public SplitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterSplitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitSplitExpression(this);
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
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitMemberAccessExpression(this);
		}
	}
	public static class RangeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINES() { return getToken(Powershell2Parser.NEWLINES, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitRangeExpression(this);
		}
	}
	public static class PreIncrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitPreIncrementExpression(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(303);
				match(TYPELITERAL);
				setState(304);
				expression(21);
				}
				break;
			case 2:
				{
				_localctx = new JoinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(T__27);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(306);
					match(NEWLINES);
					}
					break;
				}
				setState(309);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new SplitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(T__28);
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(311);
					match(NEWLINES);
					}
					break;
				}
				setState(314);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(T__29);
				setState(316);
				expression(18);
				}
				break;
			case 5:
				{
				_localctx = new PreDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(T__30);
				setState(318);
				expression(17);
				}
				break;
			case 6:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(T__31);
				setState(320);
				expression(16);
				}
				break;
			case 7:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(T__32);
				setState(322);
				expression(15);
				}
				break;
			case 8:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				_la = _input.LA(1);
				if ( !(_la==T__33 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(324);
					match(NEWLINES);
					}
					break;
				}
				setState(327);
				expression(14);
				}
				break;
			case 9:
				{
				_localctx = new NotexclamExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(T__35);
				setState(329);
				expression(13);
				}
				break;
			case 10:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(334);
						match(T__4);
						setState(335);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MemberClassAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(337);
						match(T__26);
						setState(338);
						expression(24);
						}
						break;
					case 3:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(340);
						match(T__36);
						setState(342);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(341);
							match(NEWLINES);
							}
							break;
						}
						setState(344);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new FormatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(346);
						match(T__37);
						setState(348);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(347);
							match(NEWLINES);
							}
							break;
						}
						setState(350);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(352);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(354);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(353);
							match(NEWLINES);
							}
							break;
						}
						setState(356);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(358);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(360);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(359);
							match(NEWLINES);
							}
							break;
						}
						setState(362);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(364);
						comparisonOperator();
						setState(366);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(365);
							match(NEWLINES);
							}
							break;
						}
						setState(368);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new BxorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(371);
						match(T__41);
						setState(373);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(372);
							match(NEWLINES);
							}
							break;
						}
						setState(375);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new BorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(377);
						match(T__42);
						setState(379);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(378);
							match(NEWLINES);
							}
							break;
						}
						setState(381);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new BandExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(383);
						match(T__43);
						setState(385);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(384);
							match(NEWLINES);
							}
							break;
						}
						setState(387);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new XorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(389);
						match(T__44);
						setState(391);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(390);
							match(NEWLINES);
							}
							break;
						}
						setState(393);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(394);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(395);
						match(T__45);
						setState(397);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(396);
							match(NEWLINES);
							}
							break;
						}
						setState(399);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(400);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(401);
						match(T__46);
						setState(403);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(402);
							match(NEWLINES);
							}
							break;
						}
						setState(405);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ElementAccessExpreContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(406);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(407);
						match(T__1);
						setState(409);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(408);
							match(NEWLINES);
							}
							break;
						}
						setState(411);
						expression(0);
						setState(413);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(412);
							match(NEWLINES);
							}
						}

						setState(415);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		public TerminalNode NumberToken() { return getToken(Powershell2Parser.NumberToken, 0); }
		public TerminalNode LiteralStringToken() { return getToken(Powershell2Parser.LiteralStringToken, 0); }
		public TerminalNode ExpandableStringToken() { return getToken(Powershell2Parser.ExpandableStringToken, 0); }
		public TerminalNode VariableToken() { return getToken(Powershell2Parser.VariableToken, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_value);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(NumberToken);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				match(LiteralStringToken);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(ExpandableStringToken);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				match(VariableToken);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode DEQ() { return getToken(Powershell2Parser.DEQ, 0); }
		public TerminalNode DNE() { return getToken(Powershell2Parser.DNE, 0); }
		public TerminalNode DGE() { return getToken(Powershell2Parser.DGE, 0); }
		public TerminalNode DGT() { return getToken(Powershell2Parser.DGT, 0); }
		public TerminalNode DLT() { return getToken(Powershell2Parser.DLT, 0); }
		public TerminalNode DLE() { return getToken(Powershell2Parser.DLE, 0); }
		public TerminalNode DIEQ() { return getToken(Powershell2Parser.DIEQ, 0); }
		public TerminalNode DINE() { return getToken(Powershell2Parser.DINE, 0); }
		public TerminalNode DIGE() { return getToken(Powershell2Parser.DIGE, 0); }
		public TerminalNode DIGT() { return getToken(Powershell2Parser.DIGT, 0); }
		public TerminalNode DILT() { return getToken(Powershell2Parser.DILT, 0); }
		public TerminalNode DILE() { return getToken(Powershell2Parser.DILE, 0); }
		public TerminalNode DCEQ() { return getToken(Powershell2Parser.DCEQ, 0); }
		public TerminalNode DCNE() { return getToken(Powershell2Parser.DCNE, 0); }
		public TerminalNode DCGE() { return getToken(Powershell2Parser.DCGE, 0); }
		public TerminalNode DCGT() { return getToken(Powershell2Parser.DCGT, 0); }
		public TerminalNode DCLT() { return getToken(Powershell2Parser.DCLT, 0); }
		public TerminalNode CLE() { return getToken(Powershell2Parser.CLE, 0); }
		public TerminalNode DLIKE() { return getToken(Powershell2Parser.DLIKE, 0); }
		public TerminalNode DNOTLIKE() { return getToken(Powershell2Parser.DNOTLIKE, 0); }
		public TerminalNode DMATCH() { return getToken(Powershell2Parser.DMATCH, 0); }
		public TerminalNode DNOTMATCH() { return getToken(Powershell2Parser.DNOTMATCH, 0); }
		public TerminalNode DILIKE() { return getToken(Powershell2Parser.DILIKE, 0); }
		public TerminalNode DINOTLIKE() { return getToken(Powershell2Parser.DINOTLIKE, 0); }
		public TerminalNode DIMATCH() { return getToken(Powershell2Parser.DIMATCH, 0); }
		public TerminalNode DINOTMATCH() { return getToken(Powershell2Parser.DINOTMATCH, 0); }
		public TerminalNode DCLIKE() { return getToken(Powershell2Parser.DCLIKE, 0); }
		public TerminalNode DCNOTLIKE() { return getToken(Powershell2Parser.DCNOTLIKE, 0); }
		public TerminalNode DCMATCH() { return getToken(Powershell2Parser.DCMATCH, 0); }
		public TerminalNode DCNOTMATCH() { return getToken(Powershell2Parser.DCNOTMATCH, 0); }
		public TerminalNode DCONTAINS() { return getToken(Powershell2Parser.DCONTAINS, 0); }
		public TerminalNode DNOTCONTAINS() { return getToken(Powershell2Parser.DNOTCONTAINS, 0); }
		public TerminalNode DICONTAINS() { return getToken(Powershell2Parser.DICONTAINS, 0); }
		public TerminalNode DINOTCONTAINS() { return getToken(Powershell2Parser.DINOTCONTAINS, 0); }
		public TerminalNode DCCONTAINS() { return getToken(Powershell2Parser.DCCONTAINS, 0); }
		public TerminalNode DCNOTCONTAINS() { return getToken(Powershell2Parser.DCNOTCONTAINS, 0); }
		public TerminalNode DISNOT() { return getToken(Powershell2Parser.DISNOT, 0); }
		public TerminalNode DIS() { return getToken(Powershell2Parser.DIS, 0); }
		public TerminalNode DAS() { return getToken(Powershell2Parser.DAS, 0); }
		public TerminalNode DREPLACE() { return getToken(Powershell2Parser.DREPLACE, 0); }
		public TerminalNode DIREPLACE() { return getToken(Powershell2Parser.DIREPLACE, 0); }
		public TerminalNode DCREPLACE() { return getToken(Powershell2Parser.DCREPLACE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (DEQ - 69)) | (1L << (DNE - 69)) | (1L << (DGE - 69)) | (1L << (DGT - 69)) | (1L << (DLT - 69)) | (1L << (DLE - 69)) | (1L << (DIEQ - 69)) | (1L << (DINE - 69)) | (1L << (DIGE - 69)) | (1L << (DIGT - 69)) | (1L << (DILT - 69)) | (1L << (DILE - 69)) | (1L << (DCEQ - 69)) | (1L << (DCNE - 69)) | (1L << (DCGE - 69)) | (1L << (DCGT - 69)) | (1L << (DCLT - 69)) | (1L << (CLE - 69)) | (1L << (DLIKE - 69)) | (1L << (DNOTLIKE - 69)) | (1L << (DMATCH - 69)) | (1L << (DNOTMATCH - 69)) | (1L << (DILIKE - 69)) | (1L << (DINOTLIKE - 69)) | (1L << (DIMATCH - 69)) | (1L << (DINOTMATCH - 69)) | (1L << (DCLIKE - 69)) | (1L << (DCNOTLIKE - 69)) | (1L << (DCMATCH - 69)) | (1L << (DCNOTMATCH - 69)) | (1L << (DCONTAINS - 69)) | (1L << (DNOTCONTAINS - 69)) | (1L << (DICONTAINS - 69)) | (1L << (DINOTCONTAINS - 69)) | (1L << (DCCONTAINS - 69)) | (1L << (DCNOTCONTAINS - 69)) | (1L << (DISNOT - 69)) | (1L << (DIS - 69)) | (1L << (DAS - 69)) | (1L << (DREPLACE - 69)) | (1L << (DIREPLACE - 69)) | (1L << (DCREPLACE - 69)))) != 0)) ) {
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

	public static class RedirectionOperatorContext extends ParserRuleContext {
		public RedirectionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirectionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).enterRedirectionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Powershell2Listener ) ((Powershell2Listener)listener).exitRedirectionOperator(this);
		}
	}

	public final RedirectionOperatorContext redirectionOperator() throws RecognitionException {
		RedirectionOperatorContext _localctx = new RedirectionOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_redirectionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
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
		case 30:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u01b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\4"+
		"\3\4\5\4T\n\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6b\n"+
		"\6\f\6\16\6e\13\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\bt\n\b\f\b\16\bw\13\b\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\7\n\u0081"+
		"\n\n\f\n\16\n\u0084\13\n\3\n\3\n\3\13\3\13\5\13\u008a\n\13\3\f\5\f\u008d"+
		"\n\f\3\f\3\f\5\f\u0091\n\f\3\f\7\f\u0094\n\f\f\f\16\f\u0097\13\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\5\21\u00aa\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b1\n\21"+
		"\f\21\16\21\u00b4\13\21\3\21\5\21\u00b7\n\21\3\22\3\22\5\22\u00bb\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\5\24\u00c7\n\24\3\24"+
		"\7\24\u00ca\n\24\f\24\16\24\u00cd\13\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\5\26\u00d6\n\26\3\26\3\26\5\26\u00da\n\26\3\26\3\26\3\26\3\26\5"+
		"\26\u00e0\n\26\3\26\5\26\u00e3\n\26\3\27\3\27\3\30\5\30\u00e8\n\30\3\30"+
		"\3\30\5\30\u00ec\n\30\3\30\7\30\u00ef\n\30\f\30\16\30\u00f2\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00fd\n\32\3\33\3\33\7\33"+
		"\u0101\n\33\f\33\16\33\u0104\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u010c\n\34\3\35\3\35\5\35\u0110\n\35\3\35\5\35\u0113\n\35\3\35\3\35\3"+
		"\36\3\36\5\36\u0119\n\36\3\36\3\36\5\36\u011d\n\36\3\36\3\36\5\36\u0121"+
		"\n\36\3\36\3\36\5\36\u0125\n\36\3\36\3\36\5\36\u0129\n\36\5\36\u012b\n"+
		"\36\3\37\3\37\5\37\u012f\n\37\3 \3 \3 \3 \3 \5 \u0136\n \3 \3 \3 \5 \u013b"+
		"\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0148\n \3 \3 \3 \3 \5 \u014e"+
		"\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0159\n \3 \3 \3 \3 \5 \u015f\n \3 "+
		"\3 \3 \3 \5 \u0165\n \3 \3 \3 \3 \5 \u016b\n \3 \3 \3 \3 \5 \u0171\n "+
		"\3 \3 \3 \3 \3 \5 \u0178\n \3 \3 \3 \3 \5 \u017e\n \3 \3 \3 \3 \5 \u0184"+
		"\n \3 \3 \3 \3 \5 \u018a\n \3 \3 \3 \3 \5 \u0190\n \3 \3 \3 \3 \5 \u0196"+
		"\n \3 \3 \3 \3 \5 \u019c\n \3 \3 \5 \u01a0\n \3 \3 \7 \u01a4\n \f \16"+
		" \u01a7\13 \3!\3!\3!\3!\3!\5!\u01ae\n!\3\"\3\"\3#\3#\3#\2\3>$\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\t\3\2\6"+
		"\7\3\2\20\24\3\2$%\3\2)+\3\2\"#\3\2Gp\3\2\62\67\2\u01ed\2F\3\2\2\2\4I"+
		"\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\nf\3\2\2\2\fh\3\2\2\2\16l\3\2\2\2\20x\3"+
		"\2\2\2\22\u0082\3\2\2\2\24\u0089\3\2\2\2\26\u008c\3\2\2\2\30\u0098\3\2"+
		"\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a3\3\2\2\2 \u00a7\3\2\2\2"+
		"\"\u00b8\3\2\2\2$\u00c1\3\2\2\2&\u00c4\3\2\2\2(\u00d1\3\2\2\2*\u00e2\3"+
		"\2\2\2,\u00e4\3\2\2\2.\u00e7\3\2\2\2\60\u00f5\3\2\2\2\62\u00fc\3\2\2\2"+
		"\64\u00fe\3\2\2\2\66\u010b\3\2\2\28\u010d\3\2\2\2:\u012a\3\2\2\2<\u012e"+
		"\3\2\2\2>\u014d\3\2\2\2@\u01ad\3\2\2\2B\u01af\3\2\2\2D\u01b1\3\2\2\2F"+
		"G\5\4\3\2GH\7\2\2\3H\3\3\2\2\2IN\5\6\4\2JK\7q\2\2KM\5\6\4\2LJ\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PN\3\2\2\2QZ\5 \21\2RT\7r\2\2"+
		"SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UZ\5\b\5\2VZ\5:\36\2WZ\58\35\2XZ\5\n\6\2"+
		"YQ\3\2\2\2YS\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[\\\5&\24"+
		"\2\\\t\3\2\2\2]g\5\f\7\2^c\5\24\13\2_`\7\3\2\2`b\5\26\f\2a_\3\2\2\2be"+
		"\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f]\3\2\2\2f^\3\2\2\2g"+
		"\13\3\2\2\2hi\5\16\b\2ij\7E\2\2jk\5\n\6\2k\r\3\2\2\2lu\5\20\t\2mn\7\4"+
		"\2\2no\5\20\t\2op\7\5\2\2pt\3\2\2\2qr\7\3\2\2rt\5\20\t\2sm\3\2\2\2sq\3"+
		"\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wu\3\2\2\2x|\5\22\n\2"+
		"y{\5\66\34\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~|\3\2"+
		"\2\2\177\u0081\79\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7<\2\2\u0086\23\3\2\2\2\u0087\u008a\5> \2\u0088\u008a\5\26\f\2"+
		"\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\25\3\2\2\2\u008b\u008d"+
		"\5\30\r\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2"+
		"\u008e\u0091\7@\2\2\u008f\u0091\5> \2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0095\3\2\2\2\u0092\u0094\5\32\16\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\27"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\t\2\2\2\u0099\31\3\2\2\2\u009a"+
		"\u009f\7=\2\2\u009b\u009f\7>\2\2\u009c\u009f\78\2\2\u009d\u009f\5\34\17"+
		"\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5D#\2\u00a1\u00a2\5\64\33\2\u00a2"+
		"\35\3\2\2\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6\7\t\2"+
		"\2\u00a6\37\3\2\2\2\u00a7\u00a9\7\n\2\2\u00a8\u00aa\7A\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\13\2\2"+
		"\u00ac\u00ad\5\n\6\2\u00ad\u00ae\7\f\2\2\u00ae\u00b2\5\36\20\2\u00af\u00b1"+
		"\5\"\22\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7"+
		"\5$\23\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3\2\2\2\u00b8"+
		"\u00ba\7\r\2\2\u00b9\u00bb\7A\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\5\n\6\2\u00be"+
		"\u00bf\7\f\2\2\u00bf\u00c0\5\36\20\2\u00c0#\3\2\2\2\u00c1\u00c2\7\16\2"+
		"\2\u00c2\u00c3\5\36\20\2\u00c3%\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c7"+
		"\7A\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cb\3\2\2\2\u00c8"+
		"\u00ca\5(\25\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\5*\26\2\u00cf\u00d0\5.\30\2\u00d0\'\3\2\2\2\u00d1\u00d2\t\3\2\2"+
		"\u00d2)\3\2\2\2\u00d3\u00d5\7\13\2\2\u00d4\u00d6\7A\2\2\u00d5\u00d4\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\5\n\6\2\u00d8"+
		"\u00da\7A\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\7\f\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00df\7\25\2\2\u00de"+
		"\u00e0\7A\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\5,\27\2\u00e2\u00d3\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3"+
		"+\3\2\2\2\u00e4\u00e5\5\64\33\2\u00e5-\3\2\2\2\u00e6\u00e8\7A\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7\b"+
		"\2\2\u00ea\u00ec\7A\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00f0\3\2\2\2\u00ed\u00ef\5\60\31\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7\t\2\2\u00f4/\3\2\2\2\u00f5\u00f6\5\62\32"+
		"\2\u00f6\u00f7\5\36\20\2\u00f7\61\3\2\2\2\u00f8\u00fd\7\26\2\2\u00f9\u00fd"+
		"\7>\2\2\u00fa\u00fd\5\64\33\2\u00fb\u00fd\5\36\20\2\u00fc\u00f8\3\2\2"+
		"\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\63"+
		"\3\2\2\2\u00fe\u0102\5@!\2\u00ff\u0101\5\66\34\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\65\3\2\2"+
		"\2\u0104\u0102\3\2\2\2\u0105\u0106\7\4\2\2\u0106\u0107\5> \2\u0107\u0108"+
		"\7\5\2\2\u0108\u010c\3\2\2\2\u0109\u010a\7\7\2\2\u010a\u010c\5@!\2\u010b"+
		"\u0105\3\2\2\2\u010b\u0109\3\2\2\2\u010c\67\3\2\2\2\u010d\u010f\7\27\2"+
		"\2\u010e\u0110\7A\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u0113\79\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\5\36\20\2\u01159\3\2\2\2\u0116\u0118\7\30\2"+
		"\2\u0117\u0119\5<\37\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u012b"+
		"\3\2\2\2\u011a\u011c\7\31\2\2\u011b\u011d\5<\37\2\u011c\u011b\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u012b\3\2\2\2\u011e\u0120\7\32\2\2\u011f\u0121"+
		"\5\n\6\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u012b\3\2\2\2\u0122"+
		"\u0124\7\33\2\2\u0123\u0125\5\n\6\2\u0124\u0123\3\2\2\2\u0124\u0125\3"+
		"\2\2\2\u0125\u012b\3\2\2\2\u0126\u0128\7\34\2\2\u0127\u0129\5\n\6\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0116\3\2"+
		"\2\2\u012a\u011a\3\2\2\2\u012a\u011e\3\2\2\2\u012a\u0122\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012b;\3\2\2\2\u012c\u012f\7?\2\2\u012d\u012f\5\64\33\2"+
		"\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f=\3\2\2\2\u0130\u0131\b"+
		" \1\2\u0131\u0132\79\2\2\u0132\u014e\5> \27\u0133\u0135\7\36\2\2\u0134"+
		"\u0136\7A\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u014e\5> \26\u0138\u013a\7\37\2\2\u0139\u013b\7A\2\2\u013a"+
		"\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u014e\5>"+
		" \25\u013d\u013e\7 \2\2\u013e\u014e\5> \24\u013f\u0140\7!\2\2\u0140\u014e"+
		"\5> \23\u0141\u0142\7\"\2\2\u0142\u014e\5> \22\u0143\u0144\7#\2\2\u0144"+
		"\u014e\5> \21\u0145\u0147\t\4\2\2\u0146\u0148\7A\2\2\u0147\u0146\3\2\2"+
		"\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014e\5> \20\u014a\u014b"+
		"\7&\2\2\u014b\u014e\5> \17\u014c\u014e\5@!\2\u014d\u0130\3\2\2\2\u014d"+
		"\u0133\3\2\2\2\u014d\u0138\3\2\2\2\u014d\u013d\3\2\2\2\u014d\u013f\3\2"+
		"\2\2\u014d\u0141\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0145\3\2\2\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u01a5\3\2\2\2\u014f\u0150\f\32"+
		"\2\2\u0150\u0151\7\7\2\2\u0151\u01a4\5> \33\u0152\u0153\f\31\2\2\u0153"+
		"\u0154\7\35\2\2\u0154\u01a4\5> \32\u0155\u0156\f\16\2\2\u0156\u0158\7"+
		"\'\2\2\u0157\u0159\7A\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u01a4\5> \17\u015b\u015c\f\r\2\2\u015c\u015e\7(\2"+
		"\2\u015d\u015f\7A\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u01a4\5> \16\u0161\u0162\f\f\2\2\u0162\u0164\t\5\2\2\u0163"+
		"\u0165\7A\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u01a4\5> \r\u0167\u0168\f\13\2\2\u0168\u016a\t\6\2\2\u0169"+
		"\u016b\7A\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u01a4\5> \f\u016d\u016e\f\n\2\2\u016e\u0170\5B\"\2\u016f\u0171"+
		"\7A\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\5> \13\u0173\u01a4\3\2\2\2\u0174\u0175\f\t\2\2\u0175\u0177\7,\2"+
		"\2\u0176\u0178\7A\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u01a4\5> \n\u017a\u017b\f\b\2\2\u017b\u017d\7-\2\2\u017c"+
		"\u017e\7A\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u01a4\5> \t\u0180\u0181\f\7\2\2\u0181\u0183\7.\2\2\u0182\u0184"+
		"\7A\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u01a4\5> \b\u0186\u0187\f\6\2\2\u0187\u0189\7/\2\2\u0188\u018a\7A\2\2"+
		"\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u01a4"+
		"\5> \7\u018c\u018d\f\5\2\2\u018d\u018f\7\60\2\2\u018e\u0190\7A\2\2\u018f"+
		"\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u01a4\5>"+
		" \6\u0192\u0193\f\4\2\2\u0193\u0195\7\61\2\2\u0194\u0196\7A\2\2\u0195"+
		"\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01a4\5>"+
		" \5\u0198\u0199\f\30\2\2\u0199\u019b\7\4\2\2\u019a\u019c\7A\2\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\5>"+
		" \2\u019e\u01a0\7A\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a2\7\5\2\2\u01a2\u01a4\3\2\2\2\u01a3\u014f\3\2\2\2\u01a3"+
		"\u0152\3\2\2\2\u01a3\u0155\3\2\2\2\u01a3\u015b\3\2\2\2\u01a3\u0161\3\2"+
		"\2\2\u01a3\u0167\3\2\2\2\u01a3\u016d\3\2\2\2\u01a3\u0174\3\2\2\2\u01a3"+
		"\u017a\3\2\2\2\u01a3\u0180\3\2\2\2\u01a3\u0186\3\2\2\2\u01a3\u018c\3\2"+
		"\2\2\u01a3\u0192\3\2\2\2\u01a3\u0198\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6?\3\2\2\2\u01a7\u01a5\3\2\2\2"+
		"\u01a8\u01ae\3\2\2\2\u01a9\u01ae\7F\2\2\u01aa\u01ae\7;\2\2\u01ab\u01ae"+
		"\7:\2\2\u01ac\u01ae\7<\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad"+
		"\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeA\3\2\2\2"+
		"\u01af\u01b0\t\7\2\2\u01b0C\3\2\2\2\u01b1\u01b2\t\b\2\2\u01b2E\3\2\2\2"+
		"=NSYcfsu|\u0082\u0089\u008c\u0090\u0095\u009e\u00a9\u00b2\u00b6\u00ba"+
		"\u00c6\u00cb\u00d5\u00d9\u00df\u00e2\u00e7\u00eb\u00f0\u00fc\u0102\u010b"+
		"\u010f\u0112\u0118\u011c\u0120\u0124\u0128\u012a\u012e\u0135\u013a\u0147"+
		"\u014d\u0158\u015e\u0164\u016a\u0170\u0177\u017d\u0183\u0189\u018f\u0195"+
		"\u019b\u019f\u01a3\u01a5\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}