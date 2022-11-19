// Generated from MiniPython.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, WS=30, ID=31, INTLITERAL=32, 
		STRINGLITERAL=33, BOOLEANLITERAL=34;
	public static final int
		RULE_eval = 0, RULE_evalfile = 1, RULE_literal = 2, RULE_ellipsis = 3, 
		RULE_statement = 4, RULE_classs = 5, RULE_classid = 6, RULE_vars = 7, 
		RULE_parameterdecl = 8, RULE_deffunccontent = 9, RULE_deffunc = 10, RULE_parametercall = 11, 
		RULE_funccall = 12, RULE_classfunccall = 13, RULE_ifs = 14, RULE_elif = 15, 
		RULE_elses = 16, RULE_whiles = 17, RULE_baseexpr = 18, RULE_opadd = 19, 
		RULE_opmul = 20, RULE_compareoperator = 21, RULE_opcompare = 22, RULE_opand = 23, 
		RULE_opdisjunction = 24, RULE_opnot = 25, RULE_expr = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"eval", "evalfile", "literal", "ellipsis", "statement", "classs", "classid", 
			"vars", "parameterdecl", "deffunccontent", "deffunc", "parametercall", 
			"funccall", "classfunccall", "ifs", "elif", "elses", "whiles", "baseexpr", 
			"opadd", "opmul", "compareoperator", "opcompare", "opand", "opdisjunction", 
			"opnot", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'pass'", "'class'", "'('", "')'", "':'", "'#end'", "'.'", 
			"'='", "','", "'return'", "'def'", "'if'", "'elif'", "'else:'", "'while'", 
			"'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", 
			"'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "ID", "INTLITERAL", "STRINGLITERAL", 
			"BOOLEANLITERAL"
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
	public static class EvalContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0)) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
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

	public static class EvalfileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniPythonParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public EvalfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterEvalfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitEvalfile(this);
		}
	}

	public final EvalfileContext evalfile() throws RecognitionException {
		EvalfileContext _localctx = new EvalfileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_evalfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0)) ) {
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
	}

	public final EllipsisContext ellipsis() throws RecognitionException {
		EllipsisContext _localctx = new EllipsisContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ellipsis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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

	public static class StatementContext extends ParserRuleContext {
		public EllipsisContext ellipsis() {
			return getRuleContext(EllipsisContext.class,0);
		}
		public ClasssContext classs() {
			return getRuleContext(ClasssContext.class,0);
		}
		public DeffuncContext deffunc() {
			return getRuleContext(DeffuncContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public IfsContext ifs() {
			return getRuleContext(IfsContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				ellipsis();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				classs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				deffunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				vars();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				ifs();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				whiles();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
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

	public static class ClasssContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPythonParser.ID, i);
		}
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public List<DeffuncContext> deffunc() {
			return getRuleContexts(DeffuncContext.class);
		}
		public DeffuncContext deffunc(int i) {
			return getRuleContext(DeffuncContext.class,i);
		}
		public ClasssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterClasss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitClasss(this);
		}
	}

	public final ClasssContext classs() throws RecognitionException {
		ClasssContext _localctx = new ClasssContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__2);
			setState(83);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(84);
				match(T__3);
				setState(85);
				match(ID);
				setState(86);
				match(T__4);
				}
			}

			setState(89);
			match(T__5);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(90);
				vars();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(96);
				deffunc();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
	}

	public final ClassidContext classid() throws RecognitionException {
		ClassidContext _localctx = new ClassidContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			match(T__7);
			setState(106);
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

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClassidContext classid() {
			return getRuleContext(ClassidContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vars);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID);
				setState(109);
				match(T__8);
				setState(110);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				classid();
				setState(112);
				match(T__8);
				setState(113);
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
	}

	public final ParameterdeclContext parameterdecl() throws RecognitionException {
		ParameterdeclContext _localctx = new ParameterdeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterdecl);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(117);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(ID);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(121);
					match(T__9);
					setState(122);
					match(ID);
					}
					}
					setState(127);
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
	}

	public final DeffunccontentContext deffunccontent() throws RecognitionException {
		DeffunccontentContext _localctx = new DeffunccontentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deffunccontent);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__10);
				setState(131);
				expr();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__11:
			case T__12:
			case T__15:
			case T__28:
			case ID:
			case INTLITERAL:
			case STRINGLITERAL:
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					statement();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0) );
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(137);
					match(T__10);
					setState(138);
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

	public static class DeffuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPythonParser.ID, 0); }
		public ParameterdeclContext parameterdecl() {
			return getRuleContext(ParameterdeclContext.class,0);
		}
		public DeffunccontentContext deffunccontent() {
			return getRuleContext(DeffunccontentContext.class,0);
		}
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
	}

	public final DeffuncContext deffunc() throws RecognitionException {
		DeffuncContext _localctx = new DeffuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_deffunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__11);
			setState(144);
			match(ID);
			setState(145);
			match(T__3);
			setState(146);
			parameterdecl();
			setState(147);
			match(T__4);
			setState(148);
			match(T__5);
			setState(149);
			deffunccontent();
			setState(150);
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
	}

	public final ParametercallContext parametercall() throws RecognitionException {
		ParametercallContext _localctx = new ParametercallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametercall);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0)) {
					{
					setState(152);
					expr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				expr();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(156);
					match(T__9);
					setState(157);
					expr();
					}
					}
					setState(162);
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
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(166);
			match(T__3);
			setState(167);
			parametercall();
			setState(168);
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
	}

	public final ClassfunccallContext classfunccall() throws RecognitionException {
		ClassfunccallContext _localctx = new ClassfunccallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classfunccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
			setState(171);
			match(T__7);
			setState(172);
			match(ID);
			setState(173);
			match(T__3);
			setState(174);
			parametercall();
			setState(175);
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

	public static class IfsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElifContext> elif() {
			return getRuleContexts(ElifContext.class);
		}
		public ElifContext elif(int i) {
			return getRuleContext(ElifContext.class,i);
		}
		public ElsesContext elses() {
			return getRuleContext(ElsesContext.class,0);
		}
		public IfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterIfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitIfs(this);
		}
	}

	public final IfsContext ifs() throws RecognitionException {
		IfsContext _localctx = new IfsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__12);
			setState(178);
			expr();
			setState(179);
			match(T__5);
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				statement();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0) );
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(185);
				elif();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(191);
				elses();
				}
			}

			setState(194);
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

	public static class ElifContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__13);
			setState(197);
			expr();
			setState(198);
			match(T__5);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsesContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
	}

	public final ElsesContext elses() throws RecognitionException {
		ElsesContext _localctx = new ElsesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__14);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterWhiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitWhiles(this);
		}
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__15);
			setState(211);
			expr();
			setState(212);
			match(T__5);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				statement();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__28) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL))) != 0) );
			setState(218);
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
	}

	public final BaseexprContext baseexpr() throws RecognitionException {
		BaseexprContext _localctx = new BaseexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_baseexpr);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				funccall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				classfunccall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				classid();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(T__3);
				setState(226);
				expr();
				setState(227);
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

	public static class OpaddContext extends ParserRuleContext {
		public List<BaseexprContext> baseexpr() {
			return getRuleContexts(BaseexprContext.class);
		}
		public BaseexprContext baseexpr(int i) {
			return getRuleContext(BaseexprContext.class,i);
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
	}

	public final OpaddContext opadd() throws RecognitionException {
		OpaddContext _localctx = new OpaddContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opadd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			baseexpr();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				baseexpr();
				}
				}
				setState(238);
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

	public static class OpmulContext extends ParserRuleContext {
		public List<OpaddContext> opadd() {
			return getRuleContexts(OpaddContext.class);
		}
		public OpaddContext opadd(int i) {
			return getRuleContext(OpaddContext.class,i);
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
	}

	public final OpmulContext opmul() throws RecognitionException {
		OpmulContext _localctx = new OpmulContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_opmul);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				opadd();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18 || _la==T__19) {
					{
					{
					setState(240);
					_la = _input.LA(1);
					if ( !(_la==T__18 || _la==T__19) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(241);
					opadd();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__3);
				setState(248);
				expr();
				setState(249);
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

	public static class CompareoperatorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CompareoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterCompareoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitCompareoperator(this);
		}
	}

	public final CompareoperatorContext compareoperator() throws RecognitionException {
		CompareoperatorContext _localctx = new CompareoperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compareoperator);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				match(T__25);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				match(T__3);
				setState(260);
				expr();
				setState(261);
				match(T__4);
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

	public static class OpcompareContext extends ParserRuleContext {
		public List<OpmulContext> opmul() {
			return getRuleContexts(OpmulContext.class);
		}
		public OpmulContext opmul(int i) {
			return getRuleContext(OpmulContext.class,i);
		}
		public List<CompareoperatorContext> compareoperator() {
			return getRuleContexts(CompareoperatorContext.class);
		}
		public CompareoperatorContext compareoperator(int i) {
			return getRuleContext(CompareoperatorContext.class,i);
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
	}

	public final OpcompareContext opcompare() throws RecognitionException {
		OpcompareContext _localctx = new OpcompareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opcompare);
		try {
			int _alt;
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				opmul();
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(266);
						compareoperator();
						setState(267);
						opmul();
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__3);
				setState(275);
				expr();
				setState(276);
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
	}

	public final OpandContext opand() throws RecognitionException {
		OpandContext _localctx = new OpandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opand);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				opcompare();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(281);
					match(T__26);
					setState(282);
					opcompare();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T__3);
				setState(289);
				expr();
				setState(290);
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
	}

	public final OpdisjunctionContext opdisjunction() throws RecognitionException {
		OpdisjunctionContext _localctx = new OpdisjunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opdisjunction);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				opand();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(295);
					match(T__27);
					setState(296);
					opand();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
	}

	public final OpnotContext opnot() throws RecognitionException {
		OpnotContext _localctx = new OpnotContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opnot);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case ID:
			case INTLITERAL:
			case STRINGLITERAL:
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				opdisjunction();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__28);
				setState(310);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				funccall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__3);
				setState(315);
				expr();
				setState(316);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\7\3@\n"+
		"\3\f\3\16\3C\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6S\n\6\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\7\3\7\7\7^\n\7\f\7\16\7a"+
		"\13\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\tv\n\t\3\n\5\ny\n\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081"+
		"\13\n\5\n\u0083\n\n\3\13\3\13\3\13\6\13\u0088\n\13\r\13\16\13\u0089\3"+
		"\13\3\13\5\13\u008e\n\13\5\13\u0090\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\5\r\u009c\n\r\3\r\3\r\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r"+
		"\5\r\u00a6\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\6\20\u00b8\n\20\r\20\16\20\u00b9\3\20\7\20\u00bd"+
		"\n\20\f\20\16\20\u00c0\13\20\3\20\5\20\u00c3\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\6\21\u00cb\n\21\r\21\16\21\u00cc\3\22\3\22\6\22\u00d1\n\22"+
		"\r\22\16\22\u00d2\3\23\3\23\3\23\3\23\6\23\u00d9\n\23\r\23\16\23\u00da"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e8\n\24"+
		"\3\25\3\25\3\25\7\25\u00ed\n\25\f\25\16\25\u00f0\13\25\3\26\3\26\3\26"+
		"\7\26\u00f5\n\26\f\26\16\26\u00f8\13\26\3\26\3\26\3\26\3\26\5\26\u00fe"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010a\n\27"+
		"\3\30\3\30\3\30\3\30\7\30\u0110\n\30\f\30\16\30\u0113\13\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0119\n\30\3\31\3\31\3\31\7\31\u011e\n\31\f\31\16\31\u0121"+
		"\13\31\3\31\3\31\3\31\3\31\5\31\u0127\n\31\3\32\3\32\3\32\7\32\u012c\n"+
		"\32\f\32\16\32\u012f\13\32\3\32\3\32\3\32\3\32\5\32\u0135\n\32\3\33\3"+
		"\33\3\33\5\33\u013a\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0142\n\34"+
		"\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\66\2\5\3\2\"$\3\2\23\24\3\2\25\26\2\u015b\2;\3\2\2\2\4A\3\2\2\2\6F\3"+
		"\2\2\2\bH\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16j\3\2\2\2\20u\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\u008f\3\2\2\2\26\u0091\3\2\2\2\30\u00a5\3\2\2\2\32\u00a7\3"+
		"\2\2\2\34\u00ac\3\2\2\2\36\u00b3\3\2\2\2 \u00c6\3\2\2\2\"\u00ce\3\2\2"+
		"\2$\u00d4\3\2\2\2&\u00e7\3\2\2\2(\u00e9\3\2\2\2*\u00fd\3\2\2\2,\u0109"+
		"\3\2\2\2.\u0118\3\2\2\2\60\u0126\3\2\2\2\62\u0134\3\2\2\2\64\u0139\3\2"+
		"\2\2\66\u0141\3\2\2\28:\5\n\6\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<\3\3\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BD\3\2\2\2CA\3\2\2\2DE\7\2\2\3E\5\3\2\2\2FG\t\2\2\2G\7\3\2\2\2HI\7"+
		"\3\2\2I\t\3\2\2\2JS\7\4\2\2KS\5\b\5\2LS\5\f\7\2MS\5\26\f\2NS\5\20\t\2"+
		"OS\5\36\20\2PS\5$\23\2QS\5\66\34\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2"+
		"\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2\2\2TU\7\5\2\2UY\7"+
		"!\2\2VW\7\6\2\2WX\7!\2\2XZ\7\7\2\2YV\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[_\7\b"+
		"\2\2\\^\5\20\t\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`e\3\2\2\2a_"+
		"\3\2\2\2bd\5\26\f\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2"+
		"ge\3\2\2\2hi\7\t\2\2i\r\3\2\2\2jk\7!\2\2kl\7\n\2\2lm\7!\2\2m\17\3\2\2"+
		"\2no\7!\2\2op\7\13\2\2pv\5\66\34\2qr\5\16\b\2rs\7\13\2\2st\5\66\34\2t"+
		"v\3\2\2\2un\3\2\2\2uq\3\2\2\2v\21\3\2\2\2wy\7!\2\2xw\3\2\2\2xy\3\2\2\2"+
		"y\u0083\3\2\2\2z\177\7!\2\2{|\7\f\2\2|~\7!\2\2}{\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082x\3\2\2\2\u0082z\3\2\2\2\u0083\23\3\2\2\2\u0084\u0085\7\r\2\2"+
		"\u0085\u0090\5\66\34\2\u0086\u0088\5\n\6\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u008c\7\r\2\2\u008c\u008e\5\66\34\2\u008d\u008b\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u0090\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u0087\3\2\2\2\u0090"+
		"\25\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u0093\7!\2\2\u0093\u0094\7\6\2"+
		"\2\u0094\u0095\5\22\n\2\u0095\u0096\7\7\2\2\u0096\u0097\7\b\2\2\u0097"+
		"\u0098\5\24\13\2\u0098\u0099\7\t\2\2\u0099\27\3\2\2\2\u009a\u009c\5\66"+
		"\34\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a6\3\2\2\2\u009d"+
		"\u00a2\5\66\34\2\u009e\u009f\7\f\2\2\u009f\u00a1\5\66\34\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u009d\3\2"+
		"\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa"+
		"\5\30\r\2\u00aa\u00ab\7\7\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7!\2\2\u00ad"+
		"\u00ae\7\n\2\2\u00ae\u00af\7!\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\5\30"+
		"\r\2\u00b1\u00b2\7\7\2\2\u00b2\35\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5"+
		"\5\66\34\2\u00b5\u00b7\7\b\2\2\u00b6\u00b8\5\n\6\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be"+
		"\3\2\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c3\5\"\22\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\7\t\2\2\u00c5\37\3\2\2\2\u00c6\u00c7\7\20\2"+
		"\2\u00c7\u00c8\5\66\34\2\u00c8\u00ca\7\b\2\2\u00c9\u00cb\5\n\6\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd!\3\2\2\2\u00ce\u00d0\7\21\2\2\u00cf\u00d1\5\n\6\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"#\3\2\2\2\u00d4\u00d5\7\22\2\2\u00d5\u00d6\5\66\34\2\u00d6\u00d8\7\b\2"+
		"\2\u00d7\u00d9\5\n\6\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\t\2\2\u00dd"+
		"%\3\2\2\2\u00de\u00e8\5\6\4\2\u00df\u00e8\7!\2\2\u00e0\u00e8\5\32\16\2"+
		"\u00e1\u00e8\5\34\17\2\u00e2\u00e8\5\16\b\2\u00e3\u00e4\7\6\2\2\u00e4"+
		"\u00e5\5\66\34\2\u00e5\u00e6\7\7\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00de\3"+
		"\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7"+
		"\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\'\3\2\2\2\u00e9\u00ee\5&\24\2"+
		"\u00ea\u00eb\t\3\2\2\u00eb\u00ed\5&\24\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef)\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f6\5(\25\2\u00f2\u00f3\t\4\2\2\u00f3\u00f5\5("+
		"\25\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fe\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\6"+
		"\2\2\u00fa\u00fb\5\66\34\2\u00fb\u00fc\7\7\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00f1\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe+\3\2\2\2\u00ff\u010a\7\27\2\2"+
		"\u0100\u010a\7\30\2\2\u0101\u010a\7\31\2\2\u0102\u010a\7\32\2\2\u0103"+
		"\u010a\7\33\2\2\u0104\u010a\7\34\2\2\u0105\u0106\7\6\2\2\u0106\u0107\5"+
		"\66\34\2\u0107\u0108\7\7\2\2\u0108\u010a\3\2\2\2\u0109\u00ff\3\2\2\2\u0109"+
		"\u0100\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0103\3\2"+
		"\2\2\u0109\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u010a-\3\2\2\2\u010b\u0111"+
		"\5*\26\2\u010c\u010d\5,\27\2\u010d\u010e\5*\26\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0119\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\6\2\2\u0115"+
		"\u0116\5\66\34\2\u0116\u0117\7\7\2\2\u0117\u0119\3\2\2\2\u0118\u010b\3"+
		"\2\2\2\u0118\u0114\3\2\2\2\u0119/\3\2\2\2\u011a\u011f\5.\30\2\u011b\u011c"+
		"\7\35\2\2\u011c\u011e\5.\30\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\7\6\2\2\u0123\u0124\5\66\34\2\u0124\u0125\7\7\2\2"+
		"\u0125\u0127\3\2\2\2\u0126\u011a\3\2\2\2\u0126\u0122\3\2\2\2\u0127\61"+
		"\3\2\2\2\u0128\u012d\5\60\31\2\u0129\u012a\7\36\2\2\u012a\u012c\5\60\31"+
		"\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0135\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\6\2\2\u0131"+
		"\u0132\5\66\34\2\u0132\u0133\7\7\2\2\u0133\u0135\3\2\2\2\u0134\u0128\3"+
		"\2\2\2\u0134\u0130\3\2\2\2\u0135\63\3\2\2\2\u0136\u013a\5\62\32\2\u0137"+
		"\u0138\7\37\2\2\u0138\u013a\5\64\33\2\u0139\u0136\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\65\3\2\2\2\u013b\u0142\5\32\16\2\u013c\u013d\7\6\2\2\u013d"+
		"\u013e\5\66\34\2\u013e\u013f\7\7\2\2\u013f\u0142\3\2\2\2\u0140\u0142\5"+
		"\64\33\2\u0141\u013b\3\2\2\2\u0141\u013c\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\67\3\2\2\2%;ARY_eux\177\u0082\u0089\u008d\u008f\u009b\u00a2\u00a5\u00b9"+
		"\u00be\u00c2\u00cc\u00d2\u00da\u00e7\u00ee\u00f6\u00fd\u0109\u0111\u0118"+
		"\u011f\u0126\u012d\u0134\u0139\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}