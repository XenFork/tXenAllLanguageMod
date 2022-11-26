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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		FLOAT=10, OBJ=11, NAME=12, STRING=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "INT", 
			"FLOAT", "OBJ", "NAME", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", "';'", "'string'", "'='", "'int'", "'float'", "'var'", 
			"'val'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "INT", "FLOAT", 
			"OBJ", "NAME", "STRING", "WS"
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
		"\u0004\u0000\u000ec\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bB\b\b\u000b\b\f\bC\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\nM\b\n\u0001"+
		"\u000b\u0004\u000bP\b\u000b\u000b\u000b\f\u000bQ\u0001\f\u0001\f\u0005"+
		"\fV\b\f\n\f\f\fY\t\f\u0001\f\u0001\f\u0001\r\u0004\r^\b\r\u000b\r\f\r"+
		"_\u0001\r\u0001\r\u0001W\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0003\u0001\u000009\u0001"+
		"\u0000az\u0003\u0000\t\n\r\r  g\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003#\u0001\u0000"+
		"\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000"+
		"\t.\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r8\u0001\u0000"+
		"\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000"+
		"\u0013E\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017O"+
		"\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001b]\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005h\u0000\u0000\u001e\u001f\u0005e\u0000\u0000"+
		"\u001f \u0005l\u0000\u0000 !\u0005l\u0000\u0000!\"\u0005o\u0000\u0000"+
		"\"\u0002\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0004\u0001\u0000"+
		"\u0000\u0000%&\u0005s\u0000\u0000&\'\u0005t\u0000\u0000\'(\u0005r\u0000"+
		"\u0000()\u0005i\u0000\u0000)*\u0005n\u0000\u0000*+\u0005g\u0000\u0000"+
		"+\u0006\u0001\u0000\u0000\u0000,-\u0005=\u0000\u0000-\b\u0001\u0000\u0000"+
		"\u0000./\u0005i\u0000\u0000/0\u0005n\u0000\u000001\u0005t\u0000\u0000"+
		"1\n\u0001\u0000\u0000\u000023\u0005f\u0000\u000034\u0005l\u0000\u0000"+
		"45\u0005o\u0000\u000056\u0005a\u0000\u000067\u0005t\u0000\u00007\f\u0001"+
		"\u0000\u0000\u000089\u0005v\u0000\u00009:\u0005a\u0000\u0000:;\u0005r"+
		"\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005v\u0000\u0000=>\u0005"+
		"a\u0000\u0000>?\u0005l\u0000\u0000?\u0010\u0001\u0000\u0000\u0000@B\u0007"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0012\u0001\u0000"+
		"\u0000\u0000EF\u0003\u0011\b\u0000FG\u0005.\u0000\u0000GH\u0003\u0011"+
		"\b\u0000HI\u0005f\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JM\u0003\u0019"+
		"\f\u0000KM\u0003\u0011\b\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000M\u0016\u0001\u0000\u0000\u0000NP\u0007\u0001\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000R\u0018\u0001\u0000\u0000\u0000SW\u0005"+
		"\"\u0000\u0000TV\t\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\"\u0000\u0000"+
		"[\u001a\u0001\u0000\u0000\u0000\\^\u0007\u0002\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0006\r\u0000\u0000b\u001c"+
		"\u0001\u0000\u0000\u0000\u0006\u0000CLQW_\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}