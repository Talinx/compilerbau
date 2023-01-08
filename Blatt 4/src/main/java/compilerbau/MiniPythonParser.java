package compilerbau;

// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, END=19, COMMENT=20, WS=21, ID=22, INTLITERAL=23, STRINGLITERAL=24, 
		BOOLEANLITERAL=25, MATHMULDIV=26, MATHADDSUB=27, DIVISION=28, MULTIPLICATION=29, 
		ADDITION=30, SUBTRACTION=31, ASSERTOPERATOR=32, ASSERTEQUAL=33, ASSERTNOTEQUAL=34, 
		ASSERTLESS=35, ASSERTMORE=36, ASSERTLESSEQUAL=37, ASSERTMOREEQUAL=38;
	public static final int
		RULE_startbuildingblock = 0, RULE_start = 1, RULE_startfile = 2, RULE_literal = 3, 
		RULE_ellipsis = 4, RULE_statement = 5, RULE_body = 6, RULE_classDef = 7, 
		RULE_classid = 8, RULE_variableAssignment = 9, RULE_parameterdecl = 10, 
		RULE_deffunccontent = 11, RULE_deffunc = 12, RULE_parametercall = 13, 
		RULE_funccall = 14, RULE_classfunccall = 15, RULE_ifElifElse = 16, RULE_elif = 17, 
		RULE_elses = 18, RULE_whileCall = 19, RULE_baseexpr = 20, RULE_opadd = 21, 
		RULE_opmul = 22, RULE_opcompare = 23, RULE_opand = 24, RULE_opdisjunction = 25, 
		RULE_opnot = 26, RULE_expr = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"startbuildingblock", "start", "startfile", "literal", "ellipsis", "statement", 
			"body", "classDef", "classid", "variableAssignment", "parameterdecl", 
			"deffunccontent", "deffunc", "parametercall", "funccall", "classfunccall", 
			"ifElifElse", "elif", "elses", "whileCall", "baseexpr", "opadd", "opmul", 
			"opcompare", "opand", "opdisjunction", "opnot", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'pass'", "'class'", "'('", "')'", "':'", "'.'", "'='", 
			"','", "'return'", "'def'", "'if'", "'elif'", "'else:'", "'while'", "'and'", 
			"'or'", "'not'", null, null, null, null, null, null, null, null, null, 
			"'/'", "'*'", "'+'", "'-'", null, "'=='", "'!='", "'<'", "'>'", "'<='", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "END", "COMMENT", "WS", "ID", 
			"INTLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", "MATHMULDIV", "MATHADDSUB", 
			"DIVISION", "MULTIPLICATION", "ADDITION", "SUBTRACTION", "ASSERTOPERATOR", 
			"ASSERTEQUAL", "ASSERTNOTEQUAL", "ASSERTLESS", "ASSERTMORE", "ASSERTLESSEQUAL", 
			"ASSERTMOREEQUAL"
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class StartbuildingblockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeffuncContext deffunc() {
			return getRuleContext(DeffuncContext.class,0);
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
		public StartbuildingblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startbuildingblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterStartbuildingblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitStartbuildingblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitStartbuildingblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartbuildingblockContext startbuildingblock() throws RecognitionException {
		StartbuildingblockContext _localctx = new StartbuildingblockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startbuildingblock);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				deffunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				classDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				ifElifElse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				whileCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<StartbuildingblockContext> startbuildingblock() {
			return getRuleContexts(StartbuildingblockContext.class);
		}
		public StartbuildingblockContext startbuildingblock(int i) {
			return getRuleContext(StartbuildingblockContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 63215646L) != 0) {
				{
				{
				setState(63);
				startbuildingblock();
				}
				}
				setState(68);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartfileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniPythonParser.EOF, 0); }
		public List<StartbuildingblockContext> startbuildingblock() {
			return getRuleContexts(StartbuildingblockContext.class);
		}
		public StartbuildingblockContext startbuildingblock(int i) {
			return getRuleContext(StartbuildingblockContext.class,i);
		}
		public StartfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterStartfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitStartfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitStartfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartfileContext startfile() throws RecognitionException {
		StartfileContext _localctx = new StartfileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 63215646L) != 0) {
				{
				{
				setState(69);
				startbuildingblock();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(MiniPythonParser.INTLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(MiniPythonParser.STRINGLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(MiniPythonParser.BOOLEANLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EllipsisContext extends ParserRuleContext {
		public EllipsisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterEllipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitEllipsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitEllipsis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EllipsisContext ellipsis() throws RecognitionException {
		EllipsisContext _localctx = new EllipsisContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ellipsis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public EllipsisContext ellipsis() {
			return getRuleContext(EllipsisContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public DeffuncContext deffunc() {
			return getRuleContext(DeffuncContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public IfElifElseContext ifElifElse() {
			return getRuleContext(IfElifElseContext.class,0);
		}
		public WhileCallContext whileCall() {
			return getRuleContext(WhileCallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				ellipsis();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				classDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				deffunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				variableAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				ifElifElse();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				whileCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				statement();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 63215646L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public TerminalNode END() { return getToken(MiniPythonParser.END, 0); }
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public List<DeffuncContext> deffunc() {
			return getRuleContexts(DeffuncContext.class);
		}
		public DeffuncContext deffunc(int i) {
			return getRuleContext(DeffuncContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__2);
			setState(97);
			match(ID);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(98);
				match(T__3);
				setState(99);
				match(ID);
				setState(100);
				match(T__4);
				}
			}

			setState(103);
			match(T__5);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(104);
				variableAssignment();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(110);
				deffunc();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassidContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public ClassidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterClassid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitClassid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitClassid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassidContext classid() throws RecognitionException {
		ClassidContext _localctx = new ClassidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(119);
			match(T__6);
			setState(120);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableAssignment);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(ID);
				setState(123);
				match(T__7);
				setState(124);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(ID);
				setState(126);
				match(T__6);
				setState(127);
				match(ID);
				setState(128);
				match(T__7);
				setState(129);
				expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterdeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public ParameterdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterParameterdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitParameterdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitParameterdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclContext parameterdecl() throws RecognitionException {
		ParameterdeclContext _localctx = new ParameterdeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterdecl);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(132);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(ID);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(136);
					match(T__8);
					setState(137);
					match(ID);
					}
					}
					setState(142);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeffunccontentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DeffunccontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffunccontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterDeffunccontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitDeffunccontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitDeffunccontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunccontentContext deffunccontent() throws RecognitionException {
		DeffunccontentContext _localctx = new DeffunccontentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_deffunccontent);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__9);
				setState(146);
				expr();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__10:
			case T__11:
			case T__14:
			case T__17:
			case ID:
			case INTLITERAL:
			case STRINGLITERAL:
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					statement();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 63215646L) != 0 );
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(152);
					match(T__9);
					setState(153);
					expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeffuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public ParameterdeclContext parameterdecl() {
			return getRuleContext(ParameterdeclContext.class,0);
		}
		public DeffunccontentContext deffunccontent() {
			return getRuleContext(DeffunccontentContext.class,0);
		}
		public TerminalNode END() { return getToken(MiniPythonParser.END, 0); }
		public DeffuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterDeffunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitDeffunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitDeffunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffuncContext deffunc() throws RecognitionException {
		DeffuncContext _localctx = new DeffuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_deffunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__10);
			setState(159);
			match(ID);
			setState(160);
			match(T__3);
			setState(161);
			parameterdecl();
			setState(162);
			match(T__4);
			setState(163);
			match(T__5);
			setState(164);
			deffunccontent();
			setState(165);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametercallContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParametercallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametercall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterParametercall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitParametercall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitParametercall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametercallContext parametercall() throws RecognitionException {
		ParametercallContext _localctx = new ParametercallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametercall);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 63176720L) != 0) {
					{
					setState(167);
					expr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				expr();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(171);
					match(T__8);
					setState(172);
					expr();
					}
					}
					setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public ParametercallContext parametercall() {
			return getRuleContext(ParametercallContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(T__3);
			setState(182);
			parametercall();
			setState(183);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassfunccallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public ParametercallContext parametercall() {
			return getRuleContext(ParametercallContext.class,0);
		}
		public ClassfunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classfunccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterClassfunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitClassfunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitClassfunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassfunccallContext classfunccall() throws RecognitionException {
		ClassfunccallContext _localctx = new ClassfunccallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classfunccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(186);
			match(T__6);
			setState(187);
			match(ID);
			setState(188);
			match(T__3);
			setState(189);
			parametercall();
			setState(190);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfElifElseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(MiniPythonParser.END, 0); }
		public List<ElifContext> elif() {
			return getRuleContexts(ElifContext.class);
		}
		public ElifContext elif(int i) {
			return getRuleContext(ElifContext.class,i);
		}
		public ElsesContext elses() {
			return getRuleContext(ElsesContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitIfElifElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElifElseContext ifElifElse() throws RecognitionException {
		IfElifElseContext _localctx = new IfElifElseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifElifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__11);
			setState(193);
			expr();
			setState(194);
			match(T__5);
			setState(195);
			body();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(196);
				elif();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(202);
				elses();
				}
			}

			setState(205);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__12);
			setState(208);
			expr();
			setState(209);
			match(T__5);
			setState(210);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElsesContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterElses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitElses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitElses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsesContext elses() throws RecognitionException {
		ElsesContext _localctx = new ElsesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__13);
			setState(213);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileCallContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(MiniPythonParser.END, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitWhileCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCallContext whileCall() throws RecognitionException {
		WhileCallContext _localctx = new WhileCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__14);
			setState(216);
			expr();
			setState(217);
			match(T__5);
			setState(218);
			body();
			setState(219);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BaseexprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public ClassfunccallContext classfunccall() {
			return getRuleContext(ClassfunccallContext.class,0);
		}
		public ClassidContext classid() {
			return getRuleContext(ClassidContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BaseexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterBaseexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitBaseexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitBaseexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseexprContext baseexpr() throws RecognitionException {
		BaseexprContext _localctx = new BaseexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_baseexpr);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				funccall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				classfunccall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				classid();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(T__3);
				setState(227);
				expr();
				setState(228);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpaddContext extends ParserRuleContext {
		public List<BaseexprContext> baseexpr() {
			return getRuleContexts(BaseexprContext.class);
		}
		public BaseexprContext baseexpr(int i) {
			return getRuleContext(BaseexprContext.class,i);
		}
		public List<TerminalNode> MATHADDSUB() { return getTokens(MiniPythonParser.MATHADDSUB); }
		public TerminalNode MATHADDSUB(int i) {
			return getToken(MiniPythonParser.MATHADDSUB, i);
		}
		public OpaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opadd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterOpadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitOpadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitOpadd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaddContext opadd() throws RecognitionException {
		OpaddContext _localctx = new OpaddContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opadd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			baseexpr();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATHADDSUB) {
				{
				{
				setState(233);
				match(MATHADDSUB);
				setState(234);
				baseexpr();
				}
				}
				setState(239);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpmulContext extends ParserRuleContext {
		public List<OpaddContext> opadd() {
			return getRuleContexts(OpaddContext.class);
		}
		public OpaddContext opadd(int i) {
			return getRuleContext(OpaddContext.class,i);
		}
		public List<TerminalNode> MATHMULDIV() { return getTokens(MiniPythonParser.MATHMULDIV); }
		public TerminalNode MATHMULDIV(int i) {
			return getToken(MiniPythonParser.MATHMULDIV, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpmulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opmul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterOpmul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitOpmul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitOpmul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpmulContext opmul() throws RecognitionException {
		OpmulContext _localctx = new OpmulContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opmul);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				opadd();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MATHMULDIV) {
					{
					{
					setState(241);
					match(MATHMULDIV);
					setState(242);
					opadd();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__3);
				setState(249);
				expr();
				setState(250);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompareContext extends ParserRuleContext {
		public List<OpmulContext> opmul() {
			return getRuleContexts(OpmulContext.class);
		}
		public OpmulContext opmul(int i) {
			return getRuleContext(OpmulContext.class,i);
		}
		public List<TerminalNode> ASSERTOPERATOR() { return getTokens(MiniPythonParser.ASSERTOPERATOR); }
		public TerminalNode ASSERTOPERATOR(int i) {
			return getToken(MiniPythonParser.ASSERTOPERATOR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpcompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterOpcompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitOpcompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitOpcompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompareContext opcompare() throws RecognitionException {
		OpcompareContext _localctx = new OpcompareContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opcompare);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				opmul();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSERTOPERATOR) {
					{
					{
					setState(255);
					match(ASSERTOPERATOR);
					setState(256);
					opmul();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__3);
				setState(263);
				expr();
				setState(264);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpandContext extends ParserRuleContext {
		public List<OpcompareContext> opcompare() {
			return getRuleContexts(OpcompareContext.class);
		}
		public OpcompareContext opcompare(int i) {
			return getRuleContext(OpcompareContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterOpand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitOpand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitOpand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpandContext opand() throws RecognitionException {
		OpandContext _localctx = new OpandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opand);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				opcompare();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(269);
					match(T__15);
					setState(270);
					opcompare();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__3);
				setState(277);
				expr();
				setState(278);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpdisjunctionContext extends ParserRuleContext {
		public List<OpandContext> opand() {
			return getRuleContexts(OpandContext.class);
		}
		public OpandContext opand(int i) {
			return getRuleContext(OpandContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpdisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opdisjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterOpdisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitOpdisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitOpdisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpdisjunctionContext opdisjunction() throws RecognitionException {
		OpdisjunctionContext _localctx = new OpdisjunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opdisjunction);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				opand();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(283);
					match(T__16);
					setState(284);
					opand();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__3);
				setState(291);
				expr();
				setState(292);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpnotContext extends ParserRuleContext {
		public OpdisjunctionContext opdisjunction() {
			return getRuleContext(OpdisjunctionContext.class,0);
		}
		public OpnotContext opnot() {
			return getRuleContext(OpnotContext.class,0);
		}
		public OpnotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opnot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterOpnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitOpnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitOpnot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpnotContext opnot() throws RecognitionException {
		OpnotContext _localctx = new OpnotContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opnot);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case ID:
			case INTLITERAL:
			case STRINGLITERAL:
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				opdisjunction();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__17);
				setState(298);
				opnot();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpnotContext opnot() {
			return getRuleContext(OpnotContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				funccall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__3);
				setState(303);
				expr();
				setState(304);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				opnot();
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

	public static final String _serializedATN =
		"\u0004\u0001&\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		">\b\u0000\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001"+
		"\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005Z\b\u0005\u0001\u0006\u0004\u0006]\b\u0006\u000b\u0006"+
		"\f\u0006^\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007f\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007j\b\u0007\n\u0007"+
		"\f\u0007m\t\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007s\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0083"+
		"\b\t\u0001\n\u0003\n\u0086\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u008b\b"+
		"\n\n\n\f\n\u008e\t\n\u0003\n\u0090\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0095\b\u000b\u000b\u000b\f\u000b\u0096\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u009b\b\u000b\u0003\u000b\u009d\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0003"+
		"\r\u00a9\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ae\b\r\n\r\f\r\u00b1\t"+
		"\r\u0003\r\u00b3\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00c6\b\u0010\n\u0010\f\u0010\u00c9\t\u0010\u0001\u0010"+
		"\u0003\u0010\u00cc\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00e7\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u00ec\b\u0015\n\u0015\f\u0015\u00ef"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00f4\b\u0016"+
		"\n\u0016\f\u0016\u00f7\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00fd\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0102\b\u0017\n\u0017\f\u0017\u0105\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u010b\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0110\b\u0018\n\u0018\f\u0018\u0113\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0119\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u011e\b\u0019\n\u0019\f\u0019"+
		"\u0121\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0127\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u012c\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0134\b\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0246\u0000\u0001\u0001\u0000\u0017\u0019\u0147\u0000=\u0001\u0000"+
		"\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000"+
		"\u0006M\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nY\u0001\u0000"+
		"\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000"+
		"\u0010v\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014"+
		"\u008f\u0001\u0000\u0000\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018"+
		"\u009e\u0001\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c"+
		"\u00b4\u0001\u0000\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000 \u00c0"+
		"\u0001\u0000\u0000\u0000\"\u00cf\u0001\u0000\u0000\u0000$\u00d4\u0001"+
		"\u0000\u0000\u0000&\u00d7\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000\u0000"+
		"\u0000*\u00e8\u0001\u0000\u0000\u0000,\u00fc\u0001\u0000\u0000\u0000."+
		"\u010a\u0001\u0000\u0000\u00000\u0118\u0001\u0000\u0000\u00002\u0126\u0001"+
		"\u0000\u0000\u00004\u012b\u0001\u0000\u0000\u00006\u0133\u0001\u0000\u0000"+
		"\u00008>\u0003\n\u0005\u00009>\u0003\u0018\f\u0000:>\u0003\u000e\u0007"+
		"\u0000;>\u0003 \u0010\u0000<>\u0003&\u0013\u0000=8\u0001\u0000\u0000\u0000"+
		"=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>\u0001\u0001\u0000\u0000\u0000?A\u0003"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0003\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0003\u0000\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000KL\u0005\u0000\u0000\u0001L\u0005\u0001\u0000\u0000\u0000MN\u0007"+
		"\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0005\u0001\u0000"+
		"\u0000P\t\u0001\u0000\u0000\u0000QZ\u0005\u0002\u0000\u0000RZ\u0003\b"+
		"\u0004\u0000SZ\u0003\u000e\u0007\u0000TZ\u0003\u0018\f\u0000UZ\u0003\u0012"+
		"\t\u0000VZ\u0003 \u0010\u0000WZ\u0003&\u0013\u0000XZ\u00036\u001b\u0000"+
		"YQ\u0001\u0000\u0000\u0000YR\u0001\u0000\u0000\u0000YS\u0001\u0000\u0000"+
		"\u0000YT\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000YV\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u000b"+
		"\u0001\u0000\u0000\u0000[]\u0003\n\u0005\u0000\\[\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_\r\u0001\u0000\u0000\u0000`a\u0005\u0003\u0000\u0000ae\u0005\u0016"+
		"\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0005\u0016\u0000\u0000df\u0005"+
		"\u0005\u0000\u0000eb\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gk\u0005\u0006\u0000\u0000hj\u0003\u0012\t\u0000"+
		"ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lq\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000np\u0003\u0018\f\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0013\u0000\u0000"+
		"u\u000f\u0001\u0000\u0000\u0000vw\u0005\u0016\u0000\u0000wx\u0005\u0007"+
		"\u0000\u0000xy\u0005\u0016\u0000\u0000y\u0011\u0001\u0000\u0000\u0000"+
		"z{\u0005\u0016\u0000\u0000{|\u0005\b\u0000\u0000|\u0083\u00036\u001b\u0000"+
		"}~\u0005\u0016\u0000\u0000~\u007f\u0005\u0007\u0000\u0000\u007f\u0080"+
		"\u0005\u0016\u0000\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0083\u0003"+
		"6\u001b\u0000\u0082z\u0001\u0000\u0000\u0000\u0082}\u0001\u0000\u0000"+
		"\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0086\u0005\u0016\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0090\u0001\u0000\u0000\u0000\u0087\u008c\u0005\u0016\u0000"+
		"\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008b\u0005\u0016\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0085\u0001\u0000\u0000\u0000\u008f\u0087\u0001\u0000\u0000\u0000"+
		"\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092"+
		"\u009d\u00036\u001b\u0000\u0093\u0095\u0003\n\u0005\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009a"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099\u009b\u0003"+
		"6\u001b\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0091\u0001\u0000"+
		"\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009d\u0017\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u000b\u0000\u0000\u009f\u00a0\u0005\u0016"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a2\u0003\u0014"+
		"\n\u0000\u00a2\u00a3\u0005\u0005\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0016\u000b\u0000\u00a5\u00a6\u0005\u0013\u0000"+
		"\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a9\u00036\u001b\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00b3\u0001\u0000\u0000\u0000\u00aa\u00af\u00036\u001b\u0000\u00ab"+
		"\u00ac\u0005\t\u0000\u0000\u00ac\u00ae\u00036\u001b\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b3\u001b"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0004\u0000\u0000\u00b6\u00b7\u0003\u001a\r\u0000\u00b7\u00b8\u0005"+
		"\u0005\u0000\u0000\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0016\u0000\u0000\u00ba\u00bb\u0005\u0007\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0016\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be\u0003"+
		"\u001a\r\u0000\u00be\u00bf\u0005\u0005\u0000\u0000\u00bf\u001f\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\f\u0000\u0000\u00c1\u00c2\u00036\u001b"+
		"\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c7\u0003\f\u0006\u0000"+
		"\u00c4\u00c6\u0003\"\u0011\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003$\u0012\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0013\u0000\u0000\u00ce!\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\r\u0000\u0000\u00d0\u00d1\u00036"+
		"\u001b\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000\u00d2\u00d3\u0003\f\u0006"+
		"\u0000\u00d3#\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u000e\u0000\u0000"+
		"\u00d5\u00d6\u0003\f\u0006\u0000\u00d6%\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u000f\u0000\u0000\u00d8\u00d9\u00036\u001b\u0000\u00d9\u00da"+
		"\u0005\u0006\u0000\u0000\u00da\u00db\u0003\f\u0006\u0000\u00db\u00dc\u0005"+
		"\u0013\u0000\u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00e7\u0003\u0006"+
		"\u0003\u0000\u00de\u00e7\u0005\u0016\u0000\u0000\u00df\u00e7\u0003\u001c"+
		"\u000e\u0000\u00e0\u00e7\u0003\u001e\u000f\u0000\u00e1\u00e7\u0003\u0010"+
		"\b\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000\u00e3\u00e4\u00036\u001b"+
		"\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000\u00e6\u00de\u0001\u0000\u0000"+
		"\u0000\u00e6\u00df\u0001\u0000\u0000\u0000\u00e6\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e7)\u0001\u0000\u0000\u0000\u00e8\u00ed\u0003(\u0014\u0000\u00e9"+
		"\u00ea\u0005\u001b\u0000\u0000\u00ea\u00ec\u0003(\u0014\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee+\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f5\u0003"+
		"*\u0015\u0000\u00f1\u00f2\u0005\u001a\u0000\u0000\u00f2\u00f4\u0003*\u0015"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00fd\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u0004\u0000\u0000\u00f9\u00fa\u00036\u001b\u0000"+
		"\u00fa\u00fb\u0005\u0005\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f0\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fd-\u0001\u0000\u0000\u0000\u00fe\u0103\u0003,\u0016\u0000\u00ff\u0100"+
		"\u0005 \u0000\u0000\u0100\u0102\u0003,\u0016\u0000\u0101\u00ff\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u010b\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0004"+
		"\u0000\u0000\u0107\u0108\u00036\u001b\u0000\u0108\u0109\u0005\u0005\u0000"+
		"\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00fe\u0001\u0000\u0000"+
		"\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010b/\u0001\u0000\u0000\u0000"+
		"\u010c\u0111\u0003.\u0017\u0000\u010d\u010e\u0005\u0010\u0000\u0000\u010e"+
		"\u0110\u0003.\u0017\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0113"+
		"\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u0112\u0119\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u0116"+
		"\u00036\u001b\u0000\u0116\u0117\u0005\u0005\u0000\u0000\u0117\u0119\u0001"+
		"\u0000\u0000\u0000\u0118\u010c\u0001\u0000\u0000\u0000\u0118\u0114\u0001"+
		"\u0000\u0000\u0000\u01191\u0001\u0000\u0000\u0000\u011a\u011f\u00030\u0018"+
		"\u0000\u011b\u011c\u0005\u0011\u0000\u0000\u011c\u011e\u00030\u0018\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0127\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005\u0004\u0000\u0000\u0123\u0124\u00036\u001b\u0000\u0124"+
		"\u0125\u0005\u0005\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126"+
		"\u011a\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0127"+
		"3\u0001\u0000\u0000\u0000\u0128\u012c\u00032\u0019\u0000\u0129\u012a\u0005"+
		"\u0012\u0000\u0000\u012a\u012c\u00034\u001a\u0000\u012b\u0128\u0001\u0000"+
		"\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c5\u0001\u0000\u0000"+
		"\u0000\u012d\u0134\u0003\u001c\u000e\u0000\u012e\u012f\u0005\u0004\u0000"+
		"\u0000\u012f\u0130\u00036\u001b\u0000\u0130\u0131\u0005\u0005\u0000\u0000"+
		"\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0134\u00034\u001a\u0000\u0133"+
		"\u012d\u0001\u0000\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u01347\u0001\u0000\u0000\u0000 =BHY^ek"+
		"q\u0082\u0085\u008c\u008f\u0096\u009a\u009c\u00a8\u00af\u00b2\u00c7\u00cb"+
		"\u00e6\u00ed\u00f5\u00fc\u0103\u010a\u0111\u0118\u011f\u0126\u012b\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}