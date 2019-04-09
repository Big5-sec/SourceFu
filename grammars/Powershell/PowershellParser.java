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
		T__31=32, MultiLineComment=33, SingleLineComment=34, WhiteSpaces=35, ASSIGNMENTOPERATOR=36, 
		FORMATOPERATOR=37, MERGINGREDIRECTIONOPERATOR=38, FILEREDIRECTIONOPERATOR=39, 
		VARIABLE=40, COMMANDPARAMETER=41, DEQ=42, DNE=43, DGE=44, DGT=45, DLT=46, 
		DLE=47, DIEQ=48, DINE=49, DIGE=50, DIGT=51, DILT=52, DILE=53, DCEQ=54, 
		DCNE=55, DCGE=56, DCGT=57, DCLT=58, CLE=59, DLIKE=60, DNOTLIKE=61, DMATCH=62, 
		DNOTMATCH=63, DILIKE=64, DINOTLIKE=65, DIMATCH=66, DINOTMATCH=67, DCLIKE=68, 
		DCNOTLIKE=69, DCMATCH=70, DCNOTMATCH=71, DCONTAINS=72, DNOTCONTAINS=73, 
		DICONTAINS=74, DINOTCONTAINS=75, DCCONTAINS=76, DCNOTCONTAINS=77, DISNOT=78, 
		DIS=79, DAS=80, DREPLACE=81, DIREPLACE=82, DCREPLACE=83, STATEMENTTERMINATOR=84, 
		NEWLINES=85, STRINGLITERAL=86, STRINGLITERALWITHSUBEXPRESSION=87, GENERICTOKENWITHSUBEXPRSTART=88, 
		TYPENAMEIDENTIFIERCHAR=89, TYPELITERAL=90, LABEL=91, LITERAL=92, SIMPLENAME=93, 
		PROPERTYNAME=94;
	public static final int
		RULE_startRule = 0, RULE_pipeline = 1, RULE_assignmentExpression = 2, 
		RULE_pipelineTail = 3, RULE_redirections = 4, RULE_redirection = 5, RULE_redirectedFileName = 6, 
		RULE_command = 7, RULE_commandInvocationOperator = 8, RULE_commandModule = 9, 
		RULE_commandName = 10, RULE_genericToken = 11, RULE_commandNameExpr = 12, 
		RULE_commandElement = 13, RULE_commandArgument = 14, RULE_expression = 15, 
		RULE_value = 16, RULE_statementTerminators = 17, RULE_memberName = 18, 
		RULE_argumentList = 19, RULE_argumentExpressionList = 20, RULE_argumentExpression = 21, 
		RULE_blockName = 22, RULE_comparisonOperator = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "pipeline", "assignmentExpression", "pipelineTail", "redirections", 
			"redirection", "redirectedFileName", "command", "commandInvocationOperator", 
			"commandModule", "commandName", "genericToken", "commandNameExpr", "commandElement", 
			"commandArgument", "expression", "value", "statementTerminators", "memberName", 
			"argumentList", "argumentExpressionList", "argumentExpression", "blockName", 
			"comparisonOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'&'", "'.'", "'::'", "'['", "']'", "'-join'", "'-split'", 
			"'++'", "'--'", "'+'", "'-'", "'-not'", "'-bnot'", "'!'", "'..'", "'*'", 
			"'/'", "'%'", "'-bxor'", "'-bor'", "'-band'", "'-xor'", "'-or'", "'-and'", 
			"'('", "')'", "','", "'dynamicparam'", "'begin'", "'process'", "'end'", 
			null, null, null, null, "'-f'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "MultiLineComment", 
			"SingleLineComment", "WhiteSpaces", "ASSIGNMENTOPERATOR", "FORMATOPERATOR", 
			"MERGINGREDIRECTIONOPERATOR", "FILEREDIRECTIONOPERATOR", "VARIABLE", 
			"COMMANDPARAMETER", "DEQ", "DNE", "DGE", "DGT", "DLT", "DLE", "DIEQ", 
			"DINE", "DIGE", "DIGT", "DILT", "DILE", "DCEQ", "DCNE", "DCGE", "DCGT", 
			"DCLT", "CLE", "DLIKE", "DNOTLIKE", "DMATCH", "DNOTMATCH", "DILIKE", 
			"DINOTLIKE", "DIMATCH", "DINOTMATCH", "DCLIKE", "DCNOTLIKE", "DCMATCH", 
			"DCNOTMATCH", "DCONTAINS", "DNOTCONTAINS", "DICONTAINS", "DINOTCONTAINS", 
			"DCCONTAINS", "DCNOTCONTAINS", "DISNOT", "DIS", "DAS", "DREPLACE", "DIREPLACE", 
			"DCREPLACE", "STATEMENTTERMINATOR", "NEWLINES", "STRINGLITERAL", "STRINGLITERALWITHSUBEXPRESSION", 
			"GENERICTOKENWITHSUBEXPRSTART", "TYPENAMEIDENTIFIERCHAR", "TYPELITERAL", 
			"LABEL", "LITERAL", "SIMPLENAME", "PROPERTYNAME"
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
		public List<PipelineContext> pipeline() {
			return getRuleContexts(PipelineContext.class);
		}
		public PipelineContext pipeline(int i) {
			return getRuleContext(PipelineContext.class,i);
		}
		public List<StatementTerminatorsContext> statementTerminators() {
			return getRuleContexts(StatementTerminatorsContext.class);
		}
		public StatementTerminatorsContext statementTerminators(int i) {
			return getRuleContext(StatementTerminatorsContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << VARIABLE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (STRINGLITERAL - 86)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 86)) | (1L << (TYPELITERAL - 86)) | (1L << (LITERAL - 86)) | (1L << (SIMPLENAME - 86)))) != 0)) {
				{
				{
				setState(48);
				pipeline();
				setState(49);
				statementTerminators();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
		enterRule(_localctx, 2, RULE_pipeline);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				command();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(60);
					pipelineTail();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				expression(0);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MERGINGREDIRECTIONOPERATOR || _la==FILEREDIRECTIONOPERATOR) {
					{
					setState(64);
					redirections();
					}
				}

				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(67);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(PowershellParser.ASSIGNMENTOPERATOR, 0); }
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
		enterRule(_localctx, 4, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			expression(0);
			setState(73);
			match(ASSIGNMENTOPERATOR);
			setState(74);
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
		enterRule(_localctx, 6, RULE_pipelineTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(T__0);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(77);
					match(NEWLINES);
					}
				}

				setState(80);
				command();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_redirections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				redirection();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MERGINGREDIRECTIONOPERATOR || _la==FILEREDIRECTIONOPERATOR );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode MERGINGREDIRECTIONOPERATOR() { return getToken(PowershellParser.MERGINGREDIRECTIONOPERATOR, 0); }
		public TerminalNode FILEREDIRECTIONOPERATOR() { return getToken(PowershellParser.FILEREDIRECTIONOPERATOR, 0); }
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
		enterRule(_localctx, 10, RULE_redirection);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MERGINGREDIRECTIONOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(MERGINGREDIRECTIONOPERATOR);
				}
				break;
			case FILEREDIRECTIONOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(FILEREDIRECTIONOPERATOR);
				setState(92);
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
		enterRule(_localctx, 12, RULE_redirectedFileName);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				commandArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
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
		enterRule(_localctx, 14, RULE_command);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				commandName();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << MERGINGREDIRECTIONOPERATOR) | (1L << FILEREDIRECTIONOPERATOR) | (1L << VARIABLE) | (1L << COMMANDPARAMETER))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (STRINGLITERAL - 86)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 86)) | (1L << (TYPELITERAL - 86)) | (1L << (LITERAL - 86)) | (1L << (SIMPLENAME - 86)))) != 0)) {
					{
					{
					setState(100);
					commandElement();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				commandInvocationOperator();
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(107);
					commandModule();
					}
					break;
				}
				setState(110);
				commandNameExpr();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << MERGINGREDIRECTIONOPERATOR) | (1L << FILEREDIRECTIONOPERATOR) | (1L << VARIABLE) | (1L << COMMANDPARAMETER))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (STRINGLITERAL - 86)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 86)) | (1L << (TYPELITERAL - 86)) | (1L << (LITERAL - 86)) | (1L << (SIMPLENAME - 86)))) != 0)) {
					{
					{
					setState(111);
					commandElement();
					}
					}
					setState(116);
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
		enterRule(_localctx, 16, RULE_commandInvocationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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
		enterRule(_localctx, 18, RULE_commandModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 20, RULE_commandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 22, RULE_genericToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 24, RULE_commandNameExpr);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				commandName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
		enterRule(_localctx, 26, RULE_commandElement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case VARIABLE:
			case STRINGLITERAL:
			case STRINGLITERALWITHSUBEXPRESSION:
			case TYPELITERAL:
			case LITERAL:
			case SIMPLENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				commandNameExpr();
				}
				break;
			case MERGINGREDIRECTIONOPERATOR:
			case FILEREDIRECTIONOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				redirection();
				}
				break;
			case COMMANDPARAMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
		enterRule(_localctx, 28, RULE_commandArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				match(TYPELITERAL);
				setState(140);
				expression(21);
				}
				break;
			case 2:
				{
				_localctx = new JoinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(T__6);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(142);
					match(NEWLINES);
					}
				}

				setState(145);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new SplitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(T__7);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(147);
					match(NEWLINES);
					}
				}

				setState(150);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__8);
				setState(152);
				expression(18);
				}
				break;
			case 5:
				{
				_localctx = new PreDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__9);
				setState(154);
				expression(17);
				}
				break;
			case 6:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__10);
				setState(156);
				expression(16);
				}
				break;
			case 7:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__11);
				setState(158);
				expression(15);
				}
				break;
			case 8:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINES) {
					{
					setState(160);
					match(NEWLINES);
					}
				}

				setState(163);
				expression(14);
				}
				break;
			case 9:
				{
				_localctx = new NotexclamExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(T__14);
				setState(165);
				expression(13);
				}
				break;
			case 10:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(170);
						match(T__2);
						setState(171);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MemberClassAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(173);
						match(T__3);
						setState(174);
						expression(24);
						}
						break;
					case 3:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(176);
						match(T__15);
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(177);
							match(NEWLINES);
							}
						}

						setState(180);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new FormatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(182);
						match(FORMATOPERATOR);
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
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(189);
							match(NEWLINES);
							}
						}

						setState(192);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(194);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(195);
							match(NEWLINES);
							}
						}

						setState(198);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						comparisonOperator();
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(201);
							match(NEWLINES);
							}
						}

						setState(204);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new BxorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(207);
						match(T__19);
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(208);
							match(NEWLINES);
							}
						}

						setState(211);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new BorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(213);
						match(T__20);
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
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new BandExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
						match(T__21);
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(220);
							match(NEWLINES);
							}
						}

						setState(223);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new XorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(225);
						match(T__22);
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(226);
							match(NEWLINES);
							}
						}

						setState(229);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(231);
						match(T__23);
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(232);
							match(NEWLINES);
							}
						}

						setState(235);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(237);
						match(T__24);
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(238);
							match(NEWLINES);
							}
						}

						setState(241);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ElementAccessExpreContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(243);
						match(T__4);
						setState(245);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(244);
							match(NEWLINES);
							}
						}

						setState(247);
						expression(0);
						setState(249);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINES) {
							{
							setState(248);
							match(NEWLINES);
							}
						}

						setState(251);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (VARIABLE - 40)) | (1L << (STRINGLITERAL - 40)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 40)) | (1L << (TYPELITERAL - 40)) | (1L << (LITERAL - 40)) | (1L << (SIMPLENAME - 40)))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_statementTerminators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				match(STATEMENTTERMINATOR);
				}
				}
				setState(263); 
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
		enterRule(_localctx, 36, RULE_memberName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (STRINGLITERAL - 86)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 86)) | (1L << (SIMPLENAME - 86)))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__25);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << VARIABLE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (STRINGLITERAL - 86)) | (1L << (STRINGLITERALWITHSUBEXPRESSION - 86)) | (1L << (TYPELITERAL - 86)) | (1L << (LITERAL - 86)) | (1L << (SIMPLENAME - 86)))) != 0)) {
				{
				setState(268);
				argumentExpressionList();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINES) {
				{
				setState(271);
				match(NEWLINES);
				}
			}

			setState(274);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_argumentExpressionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			argumentExpression();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINES) {
						{
						setState(277);
						match(NEWLINES);
						}
					}

					setState(280);
					match(T__27);
					setState(281);
					argumentExpression();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 42, RULE_argumentExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expression(0);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(T__27);
					setState(289);
					expression(0);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 44, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (DEQ - 42)) | (1L << (DNE - 42)) | (1L << (DGE - 42)) | (1L << (DGT - 42)) | (1L << (DLT - 42)) | (1L << (DLE - 42)) | (1L << (DIEQ - 42)) | (1L << (DINE - 42)) | (1L << (DIGE - 42)) | (1L << (DIGT - 42)) | (1L << (DILT - 42)) | (1L << (DILE - 42)) | (1L << (DCEQ - 42)) | (1L << (DCNE - 42)) | (1L << (DCGE - 42)) | (1L << (DCGT - 42)) | (1L << (DCLT - 42)) | (1L << (CLE - 42)) | (1L << (DLIKE - 42)) | (1L << (DNOTLIKE - 42)) | (1L << (DMATCH - 42)) | (1L << (DNOTMATCH - 42)) | (1L << (DILIKE - 42)) | (1L << (DINOTLIKE - 42)) | (1L << (DIMATCH - 42)) | (1L << (DINOTMATCH - 42)) | (1L << (DCLIKE - 42)) | (1L << (DCNOTLIKE - 42)) | (1L << (DCMATCH - 42)) | (1L << (DCNOTMATCH - 42)) | (1L << (DCONTAINS - 42)) | (1L << (DNOTCONTAINS - 42)) | (1L << (DICONTAINS - 42)) | (1L << (DINOTCONTAINS - 42)) | (1L << (DCCONTAINS - 42)) | (1L << (DCNOTCONTAINS - 42)) | (1L << (DISNOT - 42)) | (1L << (DIS - 42)) | (1L << (DAS - 42)) | (1L << (DREPLACE - 42)) | (1L << (DIREPLACE - 42)) | (1L << (DCREPLACE - 42)))) != 0)) ) {
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\5\3@\n\3\3"+
		"\3\3\3\5\3D\n\3\3\3\5\3G\n\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5Q\n\5"+
		"\3\5\6\5T\n\5\r\5\16\5U\3\6\6\6Y\n\6\r\6\16\6Z\3\7\3\7\3\7\5\7`\n\7\3"+
		"\b\3\b\5\bd\n\b\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\5\to\n\t\3\t\3"+
		"\t\7\ts\n\t\f\t\16\tv\13\t\5\tx\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\5\16\u0084\n\16\3\17\3\17\3\17\5\17\u0089\n\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0092\n\21\3\21\3\21\3\21\5\21\u0097\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a4\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00aa\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00b5\n\21\3\21\3\21\3\21\3\21\5\21\u00bb\n\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00c1\n\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00cd\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d4\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00da\n\21\3\21\3\21\3\21\3\21\5\21\u00e0"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\3\21\3\21\5\21\u00ec"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u00f2\n\21\3\21\3\21\3\21\3\21\5\21\u00f8"+
		"\n\21\3\21\3\21\5\21\u00fc\n\21\3\21\3\21\7\21\u0100\n\21\f\21\16\21\u0103"+
		"\13\21\3\22\3\22\3\23\6\23\u0108\n\23\r\23\16\23\u0109\3\24\3\24\3\25"+
		"\3\25\5\25\u0110\n\25\3\25\5\25\u0113\n\25\3\25\3\25\3\26\3\26\5\26\u0119"+
		"\n\26\3\26\3\26\7\26\u011d\n\26\f\26\16\26\u0120\13\26\3\27\3\27\3\27"+
		"\7\27\u0125\n\27\f\27\16\27\u0128\13\27\3\30\3\30\3\31\3\31\3\31\2\3 "+
		"\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\n\3\2\4\5\3\2"+
		"\17\20\3\2\23\25\3\2\r\16\6\2**XY\\\\^_\4\2XY__\3\2\37\"\3\2,U\2\u0154"+
		"\2\67\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\bS\3\2\2\2\nX\3\2\2\2\f_\3\2\2\2\16"+
		"c\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\177\3\2\2"+
		"\2\32\u0083\3\2\2\2\34\u0088\3\2\2\2\36\u008a\3\2\2\2 \u00a9\3\2\2\2\""+
		"\u0104\3\2\2\2$\u0107\3\2\2\2&\u010b\3\2\2\2(\u010d\3\2\2\2*\u0116\3\2"+
		"\2\2,\u0121\3\2\2\2.\u0129\3\2\2\2\60\u012b\3\2\2\2\62\63\5\4\3\2\63\64"+
		"\5$\23\2\64\66\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28:\3\2\2\29\67\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<I\5\6\4\2=?\5\20\t\2>"+
		"@\5\b\5\2?>\3\2\2\2?@\3\2\2\2@I\3\2\2\2AC\5 \21\2BD\5\n\6\2CB\3\2\2\2"+
		"CD\3\2\2\2DF\3\2\2\2EG\5\b\5\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2H<\3\2\2\2"+
		"H=\3\2\2\2HA\3\2\2\2I\5\3\2\2\2JK\5 \21\2KL\7&\2\2LM\5 \21\2M\7\3\2\2"+
		"\2NP\7\3\2\2OQ\7W\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\5\20\t\2SN\3\2\2"+
		"\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WY\5\f\7\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\`\7(\2\2]^\7)\2\2^`\5\16\b\2_\\"+
		"\3\2\2\2_]\3\2\2\2`\r\3\2\2\2ad\5\36\20\2bd\5 \21\2ca\3\2\2\2cb\3\2\2"+
		"\2d\17\3\2\2\2ei\5\26\f\2fh\5\34\17\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij"+
		"\3\2\2\2jx\3\2\2\2ki\3\2\2\2ln\5\22\n\2mo\5\24\13\2nm\3\2\2\2no\3\2\2"+
		"\2op\3\2\2\2pt\5\32\16\2qs\5\34\17\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2we\3\2\2\2wl\3\2\2\2x\21\3\2\2\2yz\t\2\2\2z"+
		"\23\3\2\2\2{|\5 \21\2|\25\3\2\2\2}~\5\30\r\2~\27\3\2\2\2\177\u0080\7_"+
		"\2\2\u0080\31\3\2\2\2\u0081\u0084\5\26\f\2\u0082\u0084\5 \21\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0082\3\2\2\2\u0084\33\3\2\2\2\u0085\u0089\5\32\16\2\u0086"+
		"\u0089\5\f\7\2\u0087\u0089\7+\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\35\3\2\2\2\u008a\u008b\5\32\16\2\u008b"+
		"\37\3\2\2\2\u008c\u008d\b\21\1\2\u008d\u008e\7\\\2\2\u008e\u00aa\5 \21"+
		"\27\u008f\u0091\7\t\2\2\u0090\u0092\7W\2\2\u0091\u0090\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00aa\5 \21\26\u0094\u0096\7\n\2\2"+
		"\u0095\u0097\7W\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u00aa\5 \21\25\u0099\u009a\7\13\2\2\u009a\u00aa\5 \21\24"+
		"\u009b\u009c\7\f\2\2\u009c\u00aa\5 \21\23\u009d\u009e\7\r\2\2\u009e\u00aa"+
		"\5 \21\22\u009f\u00a0\7\16\2\2\u00a0\u00aa\5 \21\21\u00a1\u00a3\t\3\2"+
		"\2\u00a2\u00a4\7W\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00aa\5 \21\20\u00a6\u00a7\7\21\2\2\u00a7\u00aa\5 \21\17"+
		"\u00a8\u00aa\5\"\22\2\u00a9\u008c\3\2\2\2\u00a9\u008f\3\2\2\2\u00a9\u0094"+
		"\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9\u009b\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9"+
		"\u009f\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\u0101\3\2\2\2\u00ab\u00ac\f\32\2\2\u00ac\u00ad\7\5\2\2\u00ad"+
		"\u0100\5 \21\33\u00ae\u00af\f\31\2\2\u00af\u00b0\7\6\2\2\u00b0\u0100\5"+
		" \21\32\u00b1\u00b2\f\16\2\2\u00b2\u00b4\7\22\2\2\u00b3\u00b5\7W\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u0100\5 "+
		"\21\17\u00b7\u00b8\f\r\2\2\u00b8\u00ba\7\'\2\2\u00b9\u00bb\7W\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u0100\5 "+
		"\21\16\u00bd\u00be\f\f\2\2\u00be\u00c0\t\4\2\2\u00bf\u00c1\7W\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u0100\5 "+
		"\21\r\u00c3\u00c4\f\13\2\2\u00c4\u00c6\t\5\2\2\u00c5\u00c7\7W\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u0100\5 "+
		"\21\f\u00c9\u00ca\f\n\2\2\u00ca\u00cc\5\60\31\2\u00cb\u00cd\7W\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5 "+
		"\21\13\u00cf\u0100\3\2\2\2\u00d0\u00d1\f\t\2\2\u00d1\u00d3\7\26\2\2\u00d2"+
		"\u00d4\7W\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u0100\5 \21\n\u00d6\u00d7\f\b\2\2\u00d7\u00d9\7\27\2\2\u00d8"+
		"\u00da\7W\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u0100\5 \21\t\u00dc\u00dd\f\7\2\2\u00dd\u00df\7\30\2\2\u00de"+
		"\u00e0\7W\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u0100\5 \21\b\u00e2\u00e3\f\6\2\2\u00e3\u00e5\7\31\2\2\u00e4"+
		"\u00e6\7W\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u0100\5 \21\7\u00e8\u00e9\f\5\2\2\u00e9\u00eb\7\32\2\2\u00ea"+
		"\u00ec\7W\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u0100\5 \21\6\u00ee\u00ef\f\4\2\2\u00ef\u00f1\7\33\2\2\u00f0"+
		"\u00f2\7W\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u0100\5 \21\5\u00f4\u00f5\f\30\2\2\u00f5\u00f7\7\7\2\2\u00f6"+
		"\u00f8\7W\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fb\5 \21\2\u00fa\u00fc\7W\2\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\b\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00ab\3\2\2\2\u00ff\u00ae\3\2\2\2\u00ff\u00b1\3\2\2\2\u00ff"+
		"\u00b7\3\2\2\2\u00ff\u00bd\3\2\2\2\u00ff\u00c3\3\2\2\2\u00ff\u00c9\3\2"+
		"\2\2\u00ff\u00d0\3\2\2\2\u00ff\u00d6\3\2\2\2\u00ff\u00dc\3\2\2\2\u00ff"+
		"\u00e2\3\2\2\2\u00ff\u00e8\3\2\2\2\u00ff\u00ee\3\2\2\2\u00ff\u00f4\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"!\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\t\6\2\2\u0105#\3\2\2\2\u0106"+
		"\u0108\7V\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a%\3\2\2\2\u010b\u010c\t\7\2\2\u010c\'\3"+
		"\2\2\2\u010d\u010f\7\34\2\2\u010e\u0110\5*\26\2\u010f\u010e\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0113\7W\2\2\u0112\u0111\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\35\2\2\u0115"+
		")\3\2\2\2\u0116\u011e\5,\27\2\u0117\u0119\7W\2\2\u0118\u0117\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\36\2\2\u011b\u011d\5"+
		",\27\2\u011c\u0118\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f+\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\5 \21\2"+
		"\u0122\u0123\7\36\2\2\u0123\u0125\5 \21\2\u0124\u0122\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127-\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\t\b\2\2\u012a/\3\2\2\2\u012b\u012c\t\t\2\2"+
		"\u012c\61\3\2\2\2+\67?CFHPUZ_cintw\u0083\u0088\u0091\u0096\u00a3\u00a9"+
		"\u00b4\u00ba\u00c0\u00c6\u00cc\u00d3\u00d9\u00df\u00e5\u00eb\u00f1\u00f7"+
		"\u00fb\u00ff\u0101\u0109\u010f\u0112\u0118\u011e\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}