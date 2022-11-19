// Generated from l:\Clouds\Onedrive\Mein_Konto\OneDrive\FH Bielefeld\Master\CompilerBau\Blatt01\MiniPython.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, STRING=15, DIGIT=16, BOOLTRUE=17, 
		BOOLFALSE=18, NEWLINE=19, END=20, COMMENT=21, WHITESPACE=22, DIVISION=23, 
		MULTIPLICATION=24, ADDITION=25, SUBTRACTION=26, ASSERTEQUAL=27, ASSERTNOTEQUAL=28, 
		ASSERTLESS=29, ASSERTMORE=30, ASSERTLESSEQUAL=31, ASSERTMOREEQUAL=32, 
		LOGICOR=33, LOGICAND=34, LOGICNOT=35;
	public static final int
		RULE_start = 0, RULE_end = 1, RULE_funcDef = 2, RULE_funcDefBody = 3, 
		RULE_funcCall = 4, RULE_parameter = 5, RULE_variableAssignment = 6, RULE_returnCall = 7, 
		RULE_whileCall = 8, RULE_whileBody = 9, RULE_ifCall = 10, RULE_ifBody = 11, 
		RULE_elifCall = 12, RULE_elifBody = 13, RULE_elseCall = 14, RULE_elseBody = 15, 
		RULE_ifElifElse = 16, RULE_value = 17, RULE_statement = 18, RULE_expression = 19, 
		RULE_assertion = 20, RULE_assertOperation = 21, RULE_mathOperation = 22, 
		RULE_classDef = 23, RULE_classDefBody = 24, RULE_methodCall = 25, RULE_bool = 26, 
		RULE_integer = 27, RULE_mathOperator = 28, RULE_assertOperator = 29, RULE_logicOperator = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "end", "funcDef", "funcDefBody", "funcCall", "parameter", "variableAssignment", 
			"returnCall", "whileCall", "whileBody", "ifCall", "ifBody", "elifCall", 
			"elifBody", "elseCall", "elseBody", "ifElifElse", "value", "statement", 
			"expression", "assertion", "assertOperation", "mathOperation", "classDef", 
			"classDefBody", "methodCall", "bool", "integer", "mathOperator", "assertOperator", 
			"logicOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "','", "')'", "':'", "'='", "'return'", "'while'", 
			"'if'", "'elif'", "'else'", "'class'", "'.'", null, null, null, "'True'", 
			"'False'", null, null, null, null, "'/'", "'*'", "'+'", "'-'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'or'", "'and'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "STRING", "DIGIT", "BOOLTRUE", "BOOLFALSE", "NEWLINE", 
			"END", "COMMENT", "WHITESPACE", "DIVISION", "MULTIPLICATION", "ADDITION", 
			"SUBTRACTION", "ASSERTEQUAL", "ASSERTNOTEQUAL", "ASSERTLESS", "ASSERTMORE", 
			"ASSERTLESSEQUAL", "ASSERTMOREEQUAL", "LOGICOR", "LOGICAND", "LOGICNOT"
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
	public String getGrammarFileName() { return "MiniPython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public IfElifElseContext ifElifElse() {
			return getRuleContext(IfElifElseContext.class,0);
		}
		public WhileCallContext whileCall() {
			return getRuleContext(WhileCallContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				funcDef();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				classDef();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				ifElifElse();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				whileCall();
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(MiniPythonParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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

	public static class FuncDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public FuncDefBodyContext funcDefBody() {
			return getRuleContext(FuncDefBodyContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFuncDef(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(ID);
			setState(73);
			match(T__1);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(74);
				match(ID);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(75);
					match(T__2);
					setState(76);
					match(ID);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(84);
			match(T__3);
			setState(85);
			match(T__4);
			setState(86);
			match(NEWLINE);
			setState(87);
			funcDefBody();
			setState(88);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPythonParser.NEWLINE, i);
		}
		public FuncDefBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFuncDefBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFuncDefBody(this);
		}
	}

	public final FuncDefBodyContext funcDefBody() throws RecognitionException {
		FuncDefBodyContext _localctx = new FuncDefBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDefBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==ID) {
				{
				{
				setState(90);
				statement();
				setState(91);
				match(NEWLINE);
				}
				}
				setState(97);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(T__1);
			setState(100);
			parameter();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(101);
				match(T__2);
				setState(102);
				parameter();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				funcCall();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(T__5);
			setState(117);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterReturnCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitReturnCall(this);
		}
	}

	public final ReturnCallContext returnCall() throws RecognitionException {
		ReturnCallContext _localctx = new ReturnCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__6);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(120);
				match(ID);
				}
				break;
			case 2:
				{
				setState(121);
				expression();
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

	public static class WhileCallContext extends ParserRuleContext {
		public AssertOperationContext assertOperation() {
			return getRuleContext(AssertOperationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public WhileCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterWhileCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitWhileCall(this);
		}
	}

	public final WhileCallContext whileCall() throws RecognitionException {
		WhileCallContext _localctx = new WhileCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__7);
			setState(125);
			match(T__1);
			setState(126);
			assertOperation();
			setState(127);
			match(T__3);
			setState(128);
			match(T__4);
			setState(129);
			match(NEWLINE);
			setState(130);
			whileBody();
			setState(131);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPythonParser.NEWLINE, i);
		}
		public WhileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterWhileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitWhileBody(this);
		}
	}

	public final WhileBodyContext whileBody() throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==ID) {
				{
				{
				setState(133);
				statement();
				setState(134);
				match(NEWLINE);
				}
				}
				setState(140);
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

	public static class IfCallContext extends ParserRuleContext {
		public AssertOperationContext assertOperation() {
			return getRuleContext(AssertOperationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public IfCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterIfCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitIfCall(this);
		}
	}

	public final IfCallContext ifCall() throws RecognitionException {
		IfCallContext _localctx = new IfCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__8);
			setState(142);
			assertOperation();
			setState(143);
			match(T__4);
			setState(144);
			match(NEWLINE);
			setState(145);
			ifBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPythonParser.NEWLINE, i);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitIfBody(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==ID) {
				{
				{
				setState(147);
				statement();
				setState(148);
				match(NEWLINE);
				}
				}
				setState(154);
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

	public static class ElifCallContext extends ParserRuleContext {
		public AssertOperationContext assertOperation() {
			return getRuleContext(AssertOperationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ElifBodyContext elifBody() {
			return getRuleContext(ElifBodyContext.class,0);
		}
		public ElifCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterElifCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitElifCall(this);
		}
	}

	public final ElifCallContext elifCall() throws RecognitionException {
		ElifCallContext _localctx = new ElifCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elifCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__9);
			setState(156);
			assertOperation();
			setState(157);
			match(T__4);
			setState(158);
			match(NEWLINE);
			setState(159);
			elifBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPythonParser.NEWLINE, i);
		}
		public ElifBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterElifBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitElifBody(this);
		}
	}

	public final ElifBodyContext elifBody() throws RecognitionException {
		ElifBodyContext _localctx = new ElifBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elifBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==ID) {
				{
				{
				setState(161);
				statement();
				setState(162);
				match(NEWLINE);
				}
				}
				setState(168);
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

	public static class ElseCallContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
		}
		public ElseCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterElseCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitElseCall(this);
		}
	}

	public final ElseCallContext elseCall() throws RecognitionException {
		ElseCallContext _localctx = new ElseCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__10);
			setState(170);
			match(T__4);
			setState(171);
			match(NEWLINE);
			setState(172);
			elseBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPythonParser.NEWLINE, i);
		}
		public ElseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterElseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitElseBody(this);
		}
	}

	public final ElseBodyContext elseBody() throws RecognitionException {
		ElseBodyContext _localctx = new ElseBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==ID) {
				{
				{
				setState(174);
				statement();
				setState(175);
				match(NEWLINE);
				}
				}
				setState(181);
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

	public static class IfElifElseContext extends ParserRuleContext {
		public IfCallContext ifCall() {
			return getRuleContext(IfCallContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<ElifCallContext> elifCall() {
			return getRuleContexts(ElifCallContext.class);
		}
		public ElifCallContext elifCall(int i) {
			return getRuleContext(ElifCallContext.class,i);
		}
		public ElseCallContext elseCall() {
			return getRuleContext(ElseCallContext.class,0);
		}
		public IfElifElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterIfElifElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitIfElifElse(this);
		}
	}

	public final IfElifElseContext ifElifElse() throws RecognitionException {
		IfElifElseContext _localctx = new IfElifElseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifElifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			ifCall();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(183);
				elifCall();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(189);
				elseCall();
				}
			}

			setState(192);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MiniPythonParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLTRUE:
			case BOOLFALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				bool();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				integer();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(STRING);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ReturnCallContext returnCall() {
			return getRuleContext(ReturnCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				returnCall();
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

	public static class ExpressionContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssertOperationContext assertOperation() {
			return getRuleContext(AssertOperationContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				assertOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				mathOperation();
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

	public static class AssertionContext extends ParserRuleContext {
		public AssertOperatorContext assertOperator() {
			return getRuleContext(AssertOperatorContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<FuncCallContext> funcCall() {
			return getRuleContexts(FuncCallContext.class);
		}
		public FuncCallContext funcCall(int i) {
			return getRuleContext(FuncCallContext.class,i);
		}
		public List<MathOperationContext> mathOperation() {
			return getRuleContexts(MathOperationContext.class);
		}
		public MathOperationContext mathOperation(int i) {
			return getRuleContext(MathOperationContext.class,i);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(210);
				match(ID);
				}
				break;
			case 2:
				{
				setState(211);
				value();
				}
				break;
			case 3:
				{
				setState(212);
				funcCall();
				}
				break;
			case 4:
				{
				setState(213);
				mathOperation();
				}
				break;
			}
			setState(216);
			assertOperator();
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(217);
				match(ID);
				}
				break;
			case 2:
				{
				setState(218);
				value();
				}
				break;
			case 3:
				{
				setState(219);
				funcCall();
				}
				break;
			case 4:
				{
				setState(220);
				mathOperation();
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

	public static class AssertOperationContext extends ParserRuleContext {
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public TerminalNode LOGICNOT() { return getToken(MiniPythonParser.LOGICNOT, 0); }
		public List<LogicOperatorContext> logicOperator() {
			return getRuleContexts(LogicOperatorContext.class);
		}
		public LogicOperatorContext logicOperator(int i) {
			return getRuleContext(LogicOperatorContext.class,i);
		}
		public AssertOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterAssertOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitAssertOperation(this);
		}
	}

	public final AssertOperationContext assertOperation() throws RecognitionException {
		AssertOperationContext _localctx = new AssertOperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assertOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGICNOT) {
				{
				setState(223);
				match(LOGICNOT);
				}
			}

			setState(226);
			assertion();
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				logicOperator();
				setState(228);
				assertion();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOGICOR || _la==LOGICAND );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathOperationContext extends ParserRuleContext {
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<FuncCallContext> funcCall() {
			return getRuleContexts(FuncCallContext.class);
		}
		public FuncCallContext funcCall(int i) {
			return getRuleContext(FuncCallContext.class,i);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public MathOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterMathOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitMathOperation(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		MathOperationContext _localctx = new MathOperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mathOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(234);
				match(ID);
				}
				break;
			case 2:
				{
				setState(235);
				value();
				}
				break;
			case 3:
				{
				setState(236);
				funcCall();
				}
				break;
			}
			setState(239);
			mathOperator();
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(240);
					match(ID);
					}
					break;
				case 2:
					{
					setState(241);
					value();
					}
					break;
				case 3:
					{
					setState(242);
					funcCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(245);
				mathOperation();
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

	public static class ClassDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ClassDefBodyContext classDefBody() {
			return getRuleContext(ClassDefBodyContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitClassDef(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__11);
			setState(249);
			match(ID);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(250);
				match(T__1);
				setState(251);
				match(ID);
				setState(252);
				match(T__3);
				}
			}

			setState(255);
			match(T__4);
			setState(256);
			match(NEWLINE);
			setState(257);
			classDefBody();
			setState(258);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefBodyContext extends ParserRuleContext {
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public ClassDefBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterClassDefBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitClassDefBody(this);
		}
	}

	public final ClassDefBodyContext classDefBody() throws RecognitionException {
		ClassDefBodyContext _localctx = new ClassDefBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classDefBody);
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
				funcDef();
				}
				}
				setState(263); 
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

	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ID);
			setState(266);
			match(T__12);
			setState(267);
			match(ID);
			setState(268);
			match(T__1);
			setState(269);
			parameter();
			setState(270);
			match(T__3);
			setState(271);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOLTRUE() { return getToken(MiniPythonParser.BOOLTRUE, 0); }
		public TerminalNode BOOLFALSE() { return getToken(MiniPythonParser.BOOLFALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==BOOLTRUE || _la==BOOLFALSE) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MiniPythonParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MiniPythonParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(275);
				match(DIGIT);
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathOperatorContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(MiniPythonParser.DIVISION, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(MiniPythonParser.MULTIPLICATION, 0); }
		public TerminalNode ADDITION() { return getToken(MiniPythonParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(MiniPythonParser.SUBTRACTION, 0); }
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitMathOperator(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVISION) | (1L << MULTIPLICATION) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0)) ) {
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

	public static class AssertOperatorContext extends ParserRuleContext {
		public TerminalNode ASSERTEQUAL() { return getToken(MiniPythonParser.ASSERTEQUAL, 0); }
		public TerminalNode ASSERTLESS() { return getToken(MiniPythonParser.ASSERTLESS, 0); }
		public TerminalNode ASSERTMORE() { return getToken(MiniPythonParser.ASSERTMORE, 0); }
		public TerminalNode ASSERTLESSEQUAL() { return getToken(MiniPythonParser.ASSERTLESSEQUAL, 0); }
		public TerminalNode ASSERTMOREEQUAL() { return getToken(MiniPythonParser.ASSERTMOREEQUAL, 0); }
		public TerminalNode ASSERTNOTEQUAL() { return getToken(MiniPythonParser.ASSERTNOTEQUAL, 0); }
		public AssertOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterAssertOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitAssertOperator(this);
		}
	}

	public final AssertOperatorContext assertOperator() throws RecognitionException {
		AssertOperatorContext _localctx = new AssertOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assertOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERTEQUAL) | (1L << ASSERTNOTEQUAL) | (1L << ASSERTLESS) | (1L << ASSERTMORE) | (1L << ASSERTLESSEQUAL) | (1L << ASSERTMOREEQUAL))) != 0)) ) {
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

	public static class LogicOperatorContext extends ParserRuleContext {
		public TerminalNode LOGICOR() { return getToken(MiniPythonParser.LOGICOR, 0); }
		public TerminalNode LOGICAND() { return getToken(MiniPythonParser.LOGICAND, 0); }
		public LogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterLogicOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitLogicOperator(this);
		}
	}

	public final LogicOperatorContext logicOperator() throws RecognitionException {
		LogicOperatorContext _localctx = new LogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logicOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==LOGICOR || _la==LOGICAND) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4"+
		"\16\4S\13\4\5\4U\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5`\n\5\f\5"+
		"\16\5c\13\5\3\6\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\5\7t\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u0099\n\r\f\r\16\r\u009c\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16"+
		"\17\u00aa\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00b4\n\21"+
		"\f\21\16\21\u00b7\13\21\3\22\3\22\7\22\u00bb\n\22\f\22\16\22\u00be\13"+
		"\22\3\22\5\22\u00c1\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u00c8\n\23\3\24"+
		"\3\24\3\24\5\24\u00cd\n\24\3\25\3\25\3\25\3\25\5\25\u00d3\n\25\3\26\3"+
		"\26\3\26\3\26\5\26\u00d9\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e0\n\26"+
		"\3\27\5\27\u00e3\n\27\3\27\3\27\3\27\3\27\6\27\u00e9\n\27\r\27\16\27\u00ea"+
		"\3\30\3\30\3\30\5\30\u00f0\n\30\3\30\3\30\3\30\3\30\5\30\u00f6\n\30\3"+
		"\30\5\30\u00f9\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0100\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\6\32\u0108\n\32\r\32\16\32\u0109\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\6\35\u0117\n\35\r\35\16\35\u0118"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>\2\6\3\2\23\24\3\2\31\34\3\2\35\"\3\2#$\2"+
		"\u0129\2E\3\2\2\2\4G\3\2\2\2\6I\3\2\2\2\ba\3\2\2\2\nd\3\2\2\2\fs\3\2\2"+
		"\2\16u\3\2\2\2\20y\3\2\2\2\22~\3\2\2\2\24\u008c\3\2\2\2\26\u008f\3\2\2"+
		"\2\30\u009a\3\2\2\2\32\u009d\3\2\2\2\34\u00a8\3\2\2\2\36\u00ab\3\2\2\2"+
		" \u00b5\3\2\2\2\"\u00b8\3\2\2\2$\u00c7\3\2\2\2&\u00cc\3\2\2\2(\u00d2\3"+
		"\2\2\2*\u00d8\3\2\2\2,\u00e2\3\2\2\2.\u00ef\3\2\2\2\60\u00fa\3\2\2\2\62"+
		"\u0107\3\2\2\2\64\u010b\3\2\2\2\66\u0113\3\2\2\28\u0116\3\2\2\2:\u011a"+
		"\3\2\2\2<\u011c\3\2\2\2>\u011e\3\2\2\2@F\5&\24\2AF\5\6\4\2BF\5\60\31\2"+
		"CF\5\"\22\2DF\5\22\n\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2"+
		"\2F\3\3\2\2\2GH\7\26\2\2H\5\3\2\2\2IJ\7\3\2\2JK\7\20\2\2KT\7\4\2\2LQ\7"+
		"\20\2\2MN\7\5\2\2NP\7\20\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R"+
		"U\3\2\2\2SQ\3\2\2\2TL\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\6\2\2WX\7\7\2\2"+
		"XY\7\25\2\2YZ\5\b\5\2Z[\5\4\3\2[\7\3\2\2\2\\]\5&\24\2]^\7\25\2\2^`\3\2"+
		"\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2de\7"+
		"\20\2\2ef\7\4\2\2fk\5\f\7\2gh\7\5\2\2hj\5\f\7\2ig\3\2\2\2jm\3\2\2\2ki"+
		"\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\6\2\2o\13\3\2\2\2pt\7\20\2"+
		"\2qt\5$\23\2rt\5\n\6\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\r\3\2\2\2uv\7\20"+
		"\2\2vw\7\b\2\2wx\5(\25\2x\17\3\2\2\2y|\7\t\2\2z}\7\20\2\2{}\5(\25\2|z"+
		"\3\2\2\2|{\3\2\2\2}\21\3\2\2\2~\177\7\n\2\2\177\u0080\7\4\2\2\u0080\u0081"+
		"\5,\27\2\u0081\u0082\7\6\2\2\u0082\u0083\7\7\2\2\u0083\u0084\7\25\2\2"+
		"\u0084\u0085\5\24\13\2\u0085\u0086\5\4\3\2\u0086\23\3\2\2\2\u0087\u0088"+
		"\5&\24\2\u0088\u0089\7\25\2\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0091\5,\27\2"+
		"\u0091\u0092\7\7\2\2\u0092\u0093\7\25\2\2\u0093\u0094\5\30\r\2\u0094\27"+
		"\3\2\2\2\u0095\u0096\5&\24\2\u0096\u0097\7\25\2\2\u0097\u0099\3\2\2\2"+
		"\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\31\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\f\2\2\u009e"+
		"\u009f\5,\27\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2\5"+
		"\34\17\2\u00a2\33\3\2\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7\25\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\7\r\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\5 \21\2"+
		"\u00af\37\3\2\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\7\25\2\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bc\5\26\f\2"+
		"\u00b9\u00bb\5\32\16\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\5\36\20\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\5\4\3\2\u00c3#\3\2\2\2\u00c4\u00c8\5\66\34\2\u00c5"+
		"\u00c8\58\35\2\u00c6\u00c8\7\21\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c8%\3\2\2\2\u00c9\u00cd\5\16\b\2\u00ca\u00cd"+
		"\5\n\6\2\u00cb\u00cd\5\20\t\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\'\3\2\2\2\u00ce\u00d3\5\n\6\2\u00cf\u00d3\5"+
		"$\23\2\u00d0\u00d3\5,\27\2\u00d1\u00d3\5.\30\2\u00d2\u00ce\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3)\3\2\2\2"+
		"\u00d4\u00d9\7\20\2\2\u00d5\u00d9\5$\23\2\u00d6\u00d9\5\n\6\2\u00d7\u00d9"+
		"\5.\30\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00df\5<\37\2\u00db\u00e0\7\20"+
		"\2\2\u00dc\u00e0\5$\23\2\u00dd\u00e0\5\n\6\2\u00de\u00e0\5.\30\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2"+
		"\2\2\u00e0+\3\2\2\2\u00e1\u00e3\7%\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\5*\26\2\u00e5\u00e6\5> \2\u00e6"+
		"\u00e7\5*\26\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb-\3\2\2\2\u00ec\u00f0"+
		"\7\20\2\2\u00ed\u00f0\5$\23\2\u00ee\u00f0\5\n\6\2\u00ef\u00ec\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f8"+
		"\5:\36\2\u00f2\u00f6\7\20\2\2\u00f3\u00f6\5$\23\2\u00f4\u00f6\5\n\6\2"+
		"\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f9\5.\30\2\u00f8\u00f5\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"/\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb\u00ff\7\20\2\2\u00fc\u00fd\7\4\2"+
		"\2\u00fd\u00fe\7\20\2\2\u00fe\u0100\7\6\2\2\u00ff\u00fc\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\7\2\2\u0102\u0103\7\25"+
		"\2\2\u0103\u0104\5\62\32\2\u0104\u0105\5\4\3\2\u0105\61\3\2\2\2\u0106"+
		"\u0108\5\6\4\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\63\3\2\2\2\u010b\u010c\7\20\2\2\u010c\u010d"+
		"\7\17\2\2\u010d\u010e\7\20\2\2\u010e\u010f\7\4\2\2\u010f\u0110\5\f\7\2"+
		"\u0110\u0111\7\6\2\2\u0111\u0112\7\25\2\2\u0112\65\3\2\2\2\u0113\u0114"+
		"\t\2\2\2\u0114\67\3\2\2\2\u0115\u0117\7\22\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u01199\3\2\2\2"+
		"\u011a\u011b\t\3\2\2\u011b;\3\2\2\2\u011c\u011d\t\4\2\2\u011d=\3\2\2\2"+
		"\u011e\u011f\t\5\2\2\u011f?\3\2\2\2\34EQTaks|\u008c\u009a\u00a8\u00b5"+
		"\u00bc\u00c0\u00c7\u00cc\u00d2\u00d8\u00df\u00e2\u00ea\u00ef\u00f5\u00f8"+
		"\u00ff\u0109\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}