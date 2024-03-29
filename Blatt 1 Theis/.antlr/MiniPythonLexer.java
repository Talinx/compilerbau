// Generated from l:\Clouds\Onedrive\Mein_Konto\OneDrive\FH Bielefeld\Master\CompilerBau\Blatt01\MiniPython.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPythonLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "STRING", "DIGIT", "BOOLTRUE", 
			"BOOLFALSE", "NEWLINE", "END", "COMMENT", "WHITESPACE", "DIVISION", "MULTIPLICATION", 
			"ADDITION", "SUBTRACTION", "ASSERTEQUAL", "ASSERTNOTEQUAL", "ASSERTLESS", 
			"ASSERTMORE", "ASSERTLESSEQUAL", "ASSERTMOREEQUAL", "LOGICOR", "LOGICAND", 
			"LOGICNOT"
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


	public MiniPythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniPython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\7\17|\n\17\f\17\16\17\177\13\17\3\20\3\20\7\20"+
		"\u0083\n\20\f\20\16\20\u0086\13\20\3\20\3\20\3\20\7\20\u008b\n\20\f\20"+
		"\16\20\u008e\13\20\3\20\5\20\u0091\n\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\5\24\u00a1\n\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00ab\n\25\3\25\3\25\3\26\3\26\7\26\u00b1"+
		"\n\26\f\26\16\26\u00b4\13\26\3\26\5\26\u00b7\n\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3$\3$\3$\3$\5\u0084\u008c\u00b2\2%\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\5"+
		"\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\13\13\"\"\2\u00ea\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5M"+
		"\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21^"+
		"\3\2\2\2\23d\3\2\2\2\25g\3\2\2\2\27l\3\2\2\2\31q\3\2\2\2\33w\3\2\2\2\35"+
		"y\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0099\3\2\2"+
		"\2\'\u00a0\3\2\2\2)\u00a4\3\2\2\2+\u00ae\3\2\2\2-\u00bc\3\2\2\2/\u00c0"+
		"\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3"+
		"\2\2\29\u00cb\3\2\2\2;\u00ce\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00d5"+
		"\3\2\2\2C\u00d8\3\2\2\2E\u00db\3\2\2\2G\u00df\3\2\2\2IJ\7f\2\2JK\7g\2"+
		"\2KL\7h\2\2L\4\3\2\2\2MN\7*\2\2N\6\3\2\2\2OP\7.\2\2P\b\3\2\2\2QR\7+\2"+
		"\2R\n\3\2\2\2ST\7<\2\2T\f\3\2\2\2UV\7?\2\2V\16\3\2\2\2WX\7t\2\2XY\7g\2"+
		"\2YZ\7v\2\2Z[\7w\2\2[\\\7t\2\2\\]\7p\2\2]\20\3\2\2\2^_\7y\2\2_`\7j\2\2"+
		"`a\7k\2\2ab\7n\2\2bc\7g\2\2c\22\3\2\2\2de\7k\2\2ef\7h\2\2f\24\3\2\2\2"+
		"gh\7g\2\2hi\7n\2\2ij\7k\2\2jk\7h\2\2k\26\3\2\2\2lm\7g\2\2mn\7n\2\2no\7"+
		"u\2\2op\7g\2\2p\30\3\2\2\2qr\7e\2\2rs\7n\2\2st\7c\2\2tu\7u\2\2uv\7u\2"+
		"\2v\32\3\2\2\2wx\7\60\2\2x\34\3\2\2\2y}\t\2\2\2z|\t\3\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\36\3\2\2\2\177}\3\2\2\2\u0080\u0084\7$\2"+
		"\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0091\7$\2\2\u0088\u008c\7)\2\2\u0089\u008b\13\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\7)\2\2\u0090"+
		"\u0080\3\2\2\2\u0090\u0088\3\2\2\2\u0091 \3\2\2\2\u0092\u0093\t\4\2\2"+
		"\u0093\"\3\2\2\2\u0094\u0095\7V\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w"+
		"\2\2\u0097\u0098\7g\2\2\u0098$\3\2\2\2\u0099\u009a\7H\2\2\u009a\u009b"+
		"\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e"+
		"&\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7"+
		"%\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7f\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00ab\7\17\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\f\2\2\u00ad*\3\2\2\2\u00ae\u00b2\7"+
		"%\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b7\7\17\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\26"+
		"\2\2\u00bb,\3\2\2\2\u00bc\u00bd\t\5\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\b\27\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1\60\3\2\2\2\u00c2\u00c3"+
		"\7,\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\64\3\2\2\2\u00c6\u00c7"+
		"\7/\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\u00ca\7?\2\2\u00ca8"+
		"\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc\u00cd\7?\2\2\u00cd:\3\2\2\2\u00ce\u00cf"+
		"\7>\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7"+
		">\2\2\u00d3\u00d4\7?\2\2\u00d4@\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00daD\3"+
		"\2\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7f\2\2\u00de"+
		"F\3\2\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7v\2\2\u00e2"+
		"H\3\2\2\2\13\2}\u0084\u008c\u0090\u00a0\u00aa\u00b2\u00b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}