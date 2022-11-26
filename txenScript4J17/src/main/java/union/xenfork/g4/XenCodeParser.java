package union.xenfork.g4;// Generated from java-escape by ANTLR 4.11.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INT=11, FLOAT=12, OBJ=13, DOUBLE=14, BOOL=15, NAME=16, STRING=17, 
		WS=18;
	public static final int
		RULE_r = 0, RULE_field = 1, RULE_fSTR = 2, RULE_fINT = 3, RULE_fFLOAT = 4, 
		RULE_fDOUBLE = 5, RULE_fBOOLEAN = 6, RULE_fVAR = 7, RULE_fVAL = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "field", "fSTR", "fINT", "fFLOAT", "fDOUBLE", "fBOOLEAN", "fVAR", 
			"fVAL"
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
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(NAME);
			setState(20);
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
	public static class FieldContext extends ParserRuleContext {
		public FSTRContext fSTR() {
			return getRuleContext(FSTRContext.class,0);
		}
		public FINTContext fINT() {
			return getRuleContext(FINTContext.class,0);
		}
		public FFLOATContext fFLOAT() {
			return getRuleContext(FFLOATContext.class,0);
		}
		public FDOUBLEContext fDOUBLE() {
			return getRuleContext(FDOUBLEContext.class,0);
		}
		public FBOOLEANContext fBOOLEAN() {
			return getRuleContext(FBOOLEANContext.class,0);
		}
		public FVALContext fVAL() {
			return getRuleContext(FVALContext.class,0);
		}
		public FVARContext fVAR() {
			return getRuleContext(FVARContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				fSTR();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				fINT();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				fFLOAT();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				fDOUBLE();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				fBOOLEAN();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				fVAL();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				fVAR();
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
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitFSTR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FSTRContext fSTR() throws RecognitionException {
		FSTRContext _localctx = new FSTRContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fSTR);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__2);
				setState(32);
				match(NAME);
				setState(33);
				match(T__3);
				setState(34);
				match(STRING);
				setState(35);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__2);
				setState(37);
				match(NAME);
				setState(38);
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
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitFINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FINTContext fINT() throws RecognitionException {
		FINTContext _localctx = new FINTContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fINT);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__4);
				setState(42);
				match(NAME);
				setState(43);
				match(T__3);
				setState(44);
				match(INT);
				setState(45);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__4);
				setState(47);
				match(NAME);
				setState(48);
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
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitFFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FFLOATContext fFLOAT() throws RecognitionException {
		FFLOATContext _localctx = new FFLOATContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fFLOAT);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__5);
				setState(52);
				match(NAME);
				setState(53);
				match(T__3);
				setState(54);
				match(FLOAT);
				setState(55);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__5);
				setState(57);
				match(NAME);
				setState(58);
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
	public static class FDOUBLEContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode DOUBLE() { return getToken(XenCodeParser.DOUBLE, 0); }
		public FDOUBLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fDOUBLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFDOUBLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFDOUBLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitFDOUBLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FDOUBLEContext fDOUBLE() throws RecognitionException {
		FDOUBLEContext _localctx = new FDOUBLEContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fDOUBLE);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__6);
				setState(62);
				match(NAME);
				setState(63);
				match(T__3);
				setState(64);
				match(DOUBLE);
				setState(65);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__6);
				setState(67);
				match(NAME);
				setState(68);
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
	public static class FBOOLEANContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode BOOL() { return getToken(XenCodeParser.BOOL, 0); }
		public FBOOLEANContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fBOOLEAN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFBOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitFBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FBOOLEANContext fBOOLEAN() throws RecognitionException {
		FBOOLEANContext _localctx = new FBOOLEANContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fBOOLEAN);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__7);
				setState(72);
				match(NAME);
				setState(73);
				match(T__3);
				setState(74);
				match(BOOL);
				setState(75);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__7);
				setState(77);
				match(NAME);
				setState(78);
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
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitFVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FVARContext fVAR() throws RecognitionException {
		FVARContext _localctx = new FVARContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__8);
			setState(82);
			match(NAME);
			setState(83);
			match(T__3);
			setState(84);
			match(OBJ);
			setState(85);
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
			if ( visitor instanceof XenCodeVisitor) return ((XenCodeVisitor<? extends T>)visitor).visitFVAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FVALContext fVAL() throws RecognitionException {
		FVALContext _localctx = new FVALContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fVAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__9);
			setState(88);
			match(NAME);
			setState(89);
			match(T__3);
			setState(90);
			match(OBJ);
			setState(91);
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
		"\u0004\u0001\u0012^\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004<\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005F\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006P\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0000_\u0000\u0012\u0001\u0000\u0000\u0000\u0002"+
		"\u001d\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u00061"+
		"\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010"+
		"W\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014"+
		"\u0005\u0010\u0000\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015\u0001"+
		"\u0001\u0000\u0000\u0000\u0016\u001e\u0003\u0004\u0002\u0000\u0017\u001e"+
		"\u0003\u0006\u0003\u0000\u0018\u001e\u0003\b\u0004\u0000\u0019\u001e\u0003"+
		"\n\u0005\u0000\u001a\u001e\u0003\f\u0006\u0000\u001b\u001e\u0003\u0010"+
		"\b\u0000\u001c\u001e\u0003\u000e\u0007\u0000\u001d\u0016\u0001\u0000\u0000"+
		"\u0000\u001d\u0017\u0001\u0000\u0000\u0000\u001d\u0018\u0001\u0000\u0000"+
		"\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0003\u0000\u0000"+
		" !\u0005\u0010\u0000\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u0011\u0000"+
		"\u0000#(\u0005\u0002\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005\u0010"+
		"\u0000\u0000&(\u0005\u0002\u0000\u0000\'\u001f\u0001\u0000\u0000\u0000"+
		"\'$\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0005"+
		"\u0000\u0000*+\u0005\u0010\u0000\u0000+,\u0005\u0004\u0000\u0000,-\u0005"+
		"\u000b\u0000\u0000-2\u0005\u0002\u0000\u0000./\u0005\u0005\u0000\u0000"+
		"/0\u0005\u0010\u0000\u000002\u0005\u0002\u0000\u00001)\u0001\u0000\u0000"+
		"\u00001.\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0005"+
		"\u0006\u0000\u000045\u0005\u0010\u0000\u000056\u0005\u0004\u0000\u0000"+
		"67\u0005\f\u0000\u00007<\u0005\u0002\u0000\u000089\u0005\u0006\u0000\u0000"+
		"9:\u0005\u0010\u0000\u0000:<\u0005\u0002\u0000\u0000;3\u0001\u0000\u0000"+
		"\u0000;8\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0005\u0007"+
		"\u0000\u0000>?\u0005\u0010\u0000\u0000?@\u0005\u0004\u0000\u0000@A\u0005"+
		"\u000e\u0000\u0000AF\u0005\u0002\u0000\u0000BC\u0005\u0007\u0000\u0000"+
		"CD\u0005\u0010\u0000\u0000DF\u0005\u0002\u0000\u0000E=\u0001\u0000\u0000"+
		"\u0000EB\u0001\u0000\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0005\u0010\u0000\u0000IJ\u0005\u0004\u0000\u0000JK\u0005"+
		"\u000f\u0000\u0000KP\u0005\u0002\u0000\u0000LM\u0005\b\u0000\u0000MN\u0005"+
		"\u0010\u0000\u0000NP\u0005\u0002\u0000\u0000OG\u0001\u0000\u0000\u0000"+
		"OL\u0001\u0000\u0000\u0000P\r\u0001\u0000\u0000\u0000QR\u0005\t\u0000"+
		"\u0000RS\u0005\u0010\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005\r\u0000"+
		"\u0000UV\u0005\u0002\u0000\u0000V\u000f\u0001\u0000\u0000\u0000WX\u0005"+
		"\n\u0000\u0000XY\u0005\u0010\u0000\u0000YZ\u0005\u0004\u0000\u0000Z[\u0005"+
		"\r\u0000\u0000[\\\u0005\u0002\u0000\u0000\\\u0011\u0001\u0000\u0000\u0000"+
		"\u0006\u001d\'1;EO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}