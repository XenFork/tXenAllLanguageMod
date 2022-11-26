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
public class XenCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		FLOAT=10, OBJ=11, NAME=12, STRING=13, WS=14;
	public static final int
		RULE_r = 0, RULE_fSTR = 1, RULE_fINT = 2, RULE_fFLOAT = 3, RULE_fVAR = 4, 
		RULE_fVAL = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "fSTR", "fINT", "fFLOAT", "fVAR", "fVAL"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XenCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(NAME);
			setState(14);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
	public static class FSTRContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(XenCodeParser.STRING, 0); }
		public FSTRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fSTR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFSTR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FSTRContext fSTR() throws RecognitionException {
		FSTRContext _localctx = new FSTRContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fSTR);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(T__2);
				setState(17);
				match(NAME);
				setState(18);
				match(T__3);
				setState(19);
				match(STRING);
				setState(20);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__2);
				setState(22);
				match(NAME);
				setState(23);
				match(T__1);
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
	public static class FINTContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public FINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FINTContext fINT() throws RecognitionException {
		FINTContext _localctx = new FINTContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fINT);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__4);
				setState(27);
				match(NAME);
				setState(28);
				match(T__3);
				setState(29);
				match(INT);
				setState(30);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__4);
				setState(32);
				match(NAME);
				setState(33);
				match(T__1);
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
	public static class FFLOATContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode FLOAT() { return getToken(XenCodeParser.FLOAT, 0); }
		public FFLOATContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fFLOAT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFFLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFFLOAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FFLOATContext fFLOAT() throws RecognitionException {
		FFLOATContext _localctx = new FFLOATContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fFLOAT);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__5);
				setState(37);
				match(NAME);
				setState(38);
				match(T__3);
				setState(39);
				match(FLOAT);
				setState(40);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__5);
				setState(42);
				match(NAME);
				setState(43);
				match(T__1);
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
	public static class FVARContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode OBJ() { return getToken(XenCodeParser.OBJ, 0); }
		public FVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fVAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FVARContext fVAR() throws RecognitionException {
		FVARContext _localctx = new FVARContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__6);
			setState(47);
			match(NAME);
			setState(48);
			match(T__3);
			setState(49);
			match(OBJ);
			setState(50);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
	public static class FVALContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode OBJ() { return getToken(XenCodeParser.OBJ, 0); }
		public FVALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fVAL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFVAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFVAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFVAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FVALContext fVAL() throws RecognitionException {
		FVALContext _localctx = new FVALContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fVAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__7);
			setState(53);
			match(NAME);
			setState(54);
			match(T__3);
			setState(55);
			match(OBJ);
			setState(56);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u000e;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002#\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u00007\u0000"+
		"\f\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\""+
		"\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b.\u0001\u0000"+
		"\u0000\u0000\n4\u0001\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r"+
		"\u000e\u0005\f\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0001"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0003\u0000\u0000\u0011\u0012"+
		"\u0005\f\u0000\u0000\u0012\u0013\u0005\u0004\u0000\u0000\u0013\u0014\u0005"+
		"\r\u0000\u0000\u0014\u0019\u0005\u0002\u0000\u0000\u0015\u0016\u0005\u0003"+
		"\u0000\u0000\u0016\u0017\u0005\f\u0000\u0000\u0017\u0019\u0005\u0002\u0000"+
		"\u0000\u0018\u0010\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000"+
		"\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0005\u0000"+
		"\u0000\u001b\u001c\u0005\f\u0000\u0000\u001c\u001d\u0005\u0004\u0000\u0000"+
		"\u001d\u001e\u0005\t\u0000\u0000\u001e#\u0005\u0002\u0000\u0000\u001f"+
		" \u0005\u0005\u0000\u0000 !\u0005\f\u0000\u0000!#\u0005\u0002\u0000\u0000"+
		"\"\u001a\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000#\u0005"+
		"\u0001\u0000\u0000\u0000$%\u0005\u0006\u0000\u0000%&\u0005\f\u0000\u0000"+
		"&\'\u0005\u0004\u0000\u0000\'(\u0005\n\u0000\u0000(-\u0005\u0002\u0000"+
		"\u0000)*\u0005\u0006\u0000\u0000*+\u0005\f\u0000\u0000+-\u0005\u0002\u0000"+
		"\u0000,$\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000-\u0007\u0001"+
		"\u0000\u0000\u0000./\u0005\u0007\u0000\u0000/0\u0005\f\u0000\u000001\u0005"+
		"\u0004\u0000\u000012\u0005\u000b\u0000\u000023\u0005\u0002\u0000\u0000"+
		"3\t\u0001\u0000\u0000\u000045\u0005\b\u0000\u000056\u0005\f\u0000\u0000"+
		"67\u0005\u0004\u0000\u000078\u0005\u000b\u0000\u000089\u0005\u0002\u0000"+
		"\u00009\u000b\u0001\u0000\u0000\u0000\u0003\u0018\",";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}