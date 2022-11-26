// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XenCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INT=11, FLOAT=12, OBJ=13, DOUBLE=14, BOOL=15, NAME=16, STRING=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "INT", "FLOAT", "OBJ", "DOUBLE", "BOOL", "NAME", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", "';'", "'string'", "'='", "'int'", "'float'", "'double'", 
			"'bool'", "'var'", "'val'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "INT", 
			"FLOAT", "OBJ", "DOUBLE", "BOOL", "NAME", "STRING", "WS"
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


	public XenCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XenCode.g4"; }

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
		"\u0004\u0000\u0012\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nV\b\n\u000b\n\f\nW\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\fb\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000eq\b\u000e\u0001\u000f\u0004\u000ft\b\u000f\u000b"+
		"\u000f\f\u000fu\u0001\u0010\u0001\u0010\u0005\u0010z\b\u0010\n\u0010\f"+
		"\u0010}\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u0082"+
		"\b\u0011\u000b\u0011\f\u0011\u0083\u0001\u0011\u0001\u0011\u0001{\u0000"+
		"\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0003\u0001\u00000"+
		"9\u0001\u0000az\u0003\u0000\t\n\r\r  \u008d\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000"+
		"\u0000\u0005-\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t"+
		"6\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r@\u0001\u0000"+
		"\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000"+
		"\u0013P\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017Y"+
		"\u0001\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bc\u0001\u0000"+
		"\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001fs\u0001\u0000\u0000\u0000"+
		"!w\u0001\u0000\u0000\u0000#\u0081\u0001\u0000\u0000\u0000%&\u0005h\u0000"+
		"\u0000&\'\u0005e\u0000\u0000\'(\u0005l\u0000\u0000()\u0005l\u0000\u0000"+
		")*\u0005o\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005;\u0000\u0000"+
		",\u0004\u0001\u0000\u0000\u0000-.\u0005s\u0000\u0000./\u0005t\u0000\u0000"+
		"/0\u0005r\u0000\u000001\u0005i\u0000\u000012\u0005n\u0000\u000023\u0005"+
		"g\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005=\u0000\u00005\b\u0001"+
		"\u0000\u0000\u000067\u0005i\u0000\u000078\u0005n\u0000\u000089\u0005t"+
		"\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005f\u0000\u0000;<\u0005l"+
		"\u0000\u0000<=\u0005o\u0000\u0000=>\u0005a\u0000\u0000>?\u0005t\u0000"+
		"\u0000?\f\u0001\u0000\u0000\u0000@A\u0005d\u0000\u0000AB\u0005o\u0000"+
		"\u0000BC\u0005u\u0000\u0000CD\u0005b\u0000\u0000DE\u0005l\u0000\u0000"+
		"EF\u0005e\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005b\u0000\u0000"+
		"HI\u0005o\u0000\u0000IJ\u0005o\u0000\u0000JK\u0005l\u0000\u0000K\u0010"+
		"\u0001\u0000\u0000\u0000LM\u0005v\u0000\u0000MN\u0005a\u0000\u0000NO\u0005"+
		"r\u0000\u0000O\u0012\u0001\u0000\u0000\u0000PQ\u0005v\u0000\u0000QR\u0005"+
		"a\u0000\u0000RS\u0005l\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TV\u0007"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0016\u0001\u0000"+
		"\u0000\u0000YZ\u0003\u0015\n\u0000Z[\u0005.\u0000\u0000[\\\u0003\u0015"+
		"\n\u0000\\]\u0005f\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^b\u0003"+
		"!\u0010\u0000_b\u0003\u0015\n\u0000`b\u0003\u0017\u000b\u0000a^\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"b\u001a\u0001\u0000\u0000\u0000cd\u0003\u0015\n\u0000de\u0005.\u0000\u0000"+
		"ef\u0003\u0015\n\u0000f\u001c\u0001\u0000\u0000\u0000gh\u0005t\u0000\u0000"+
		"hi\u0005r\u0000\u0000ij\u0005u\u0000\u0000jq\u0005e\u0000\u0000kl\u0005"+
		"f\u0000\u0000lm\u0005a\u0000\u0000mn\u0005l\u0000\u0000no\u0005s\u0000"+
		"\u0000oq\u0005e\u0000\u0000pg\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000"+
		"\u0000q\u001e\u0001\u0000\u0000\u0000rt\u0007\u0001\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v \u0001\u0000\u0000\u0000w{\u0005\"\u0000\u0000"+
		"xz\t\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f\"\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0007\u0002\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0006\u0011\u0000\u0000\u0086$\u0001\u0000"+
		"\u0000\u0000\u0007\u0000Wapu{\u0083\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}