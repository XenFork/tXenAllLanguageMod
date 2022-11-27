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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, LINE_COMMENT=14, COMMENT=15, INT=16, 
		FLOAT=17, DOUBLE=18, BOOL=19, NAME=20, SECONDNAME=21, STRING=22, WS=23;
	public static final int
		RULE_r = 0, RULE_field = 1, RULE_f = 2, RULE_fIMPORT = 3, RULE_fSTR = 4, 
		RULE_fINT = 5, RULE_fFLOAT = 6, RULE_fDOUBLE = 7, RULE_fBOOLEAN = 8, RULE_fVAR = 9, 
		RULE_fVAL = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "field", "f", "fIMPORT", "fSTR", "fINT", "fFLOAT", "fDOUBLE", "fBOOLEAN", 
			"fVAR", "fVAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", "';'", "'#'", "'>'", "'string'", "'='", "'int'", "'float'", 
			"'double'", "'bool'", "'var'", "'object'", "'val'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "LINE_COMMENT", "COMMENT", "INT", "FLOAT", "DOUBLE", "BOOL", 
			"NAME", "SECONDNAME", "STRING", "WS"
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
			setState(22);
			match(T__0);
			setState(23);
			match(NAME);
			setState(24);
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
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
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
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		return field(0);
	}

	private FieldContext field(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldContext _localctx = new FieldContext(_ctx, _parentState);
		FieldContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_field, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			f();
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field);
					setState(29);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(30);
					f();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
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
		public FIMPORTContext fIMPORT() {
			return getRuleContext(FIMPORTContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_f);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				fSTR();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				fINT();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				fFLOAT();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				fDOUBLE();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				fBOOLEAN();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				fVAL();
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				fVAR();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				fIMPORT();
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
	public static class FIMPORTContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public List<TerminalNode> NAME() { return getTokens(XenCodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XenCodeParser.NAME, i);
		}
		public FIMPORTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fIMPORT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFIMPORT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFIMPORT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFIMPORT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FIMPORTContext fIMPORT() throws RecognitionException {
		FIMPORTContext _localctx = new FIMPORTContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fIMPORT);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__2);
				setState(47);
				match(INT);
				setState(48);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__2);
				setState(50);
				match(NAME);
				setState(51);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__2);
				setState(53);
				match(NAME);
				setState(54);
				match(T__3);
				setState(55);
				match(NAME);
				setState(56);
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
		enterRule(_localctx, 8, RULE_fSTR);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__4);
				setState(60);
				match(NAME);
				setState(61);
				match(T__5);
				setState(62);
				match(STRING);
				setState(63);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__4);
				setState(65);
				match(NAME);
				setState(66);
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
		enterRule(_localctx, 10, RULE_fINT);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__6);
				setState(70);
				match(NAME);
				setState(71);
				match(T__5);
				setState(72);
				match(INT);
				setState(73);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__6);
				setState(75);
				match(NAME);
				setState(76);
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
		enterRule(_localctx, 12, RULE_fFLOAT);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__7);
				setState(80);
				match(NAME);
				setState(81);
				match(T__5);
				setState(82);
				match(FLOAT);
				setState(83);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__7);
				setState(85);
				match(NAME);
				setState(86);
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
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFDOUBLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FDOUBLEContext fDOUBLE() throws RecognitionException {
		FDOUBLEContext _localctx = new FDOUBLEContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fDOUBLE);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__8);
				setState(90);
				match(NAME);
				setState(91);
				match(T__5);
				setState(92);
				match(DOUBLE);
				setState(93);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__8);
				setState(95);
				match(NAME);
				setState(96);
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
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FBOOLEANContext fBOOLEAN() throws RecognitionException {
		FBOOLEANContext _localctx = new FBOOLEANContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fBOOLEAN);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__9);
				setState(100);
				match(NAME);
				setState(101);
				match(T__5);
				setState(102);
				match(BOOL);
				setState(103);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__9);
				setState(105);
				match(NAME);
				setState(106);
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
		public TerminalNode STRING() { return getToken(XenCodeParser.STRING, 0); }
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(XenCodeParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(XenCodeParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(XenCodeParser.BOOL, 0); }
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
		enterRule(_localctx, 18, RULE_fVAR);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__10);
				setState(110);
				match(NAME);
				setState(111);
				match(T__5);
				setState(112);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 5177344L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__10);
				setState(115);
				match(NAME);
				setState(116);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__11);
				setState(118);
				match(NAME);
				setState(119);
				match(T__5);
				setState(120);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 5177344L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(T__11);
				setState(123);
				match(NAME);
				setState(124);
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
	public static class FVALContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(XenCodeParser.STRING, 0); }
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(XenCodeParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(XenCodeParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(XenCodeParser.BOOL, 0); }
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
		enterRule(_localctx, 20, RULE_fVAL);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__12);
				setState(128);
				match(NAME);
				setState(129);
				match(T__5);
				setState(130);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 5177344L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__12);
				setState(133);
				match(NAME);
				setState(134);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return field_sempred((FieldContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean field_sempred(FieldContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u008a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004D\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006X\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bl\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t~\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0088\b\n\u0001\n\u0000\u0001\u0002"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001"+
		"\u0002\u0000\u0010\u0013\u0016\u0016\u0091\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000"+
		"\u00069\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nM\u0001\u0000"+
		"\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000"+
		"\u0010k\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u0087"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018"+
		"\u0005\u0014\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u0001"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0006\u0001\uffff\uffff\u0000\u001b"+
		"\u001c\u0003\u0004\u0002\u0000\u001c!\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\n\u0002\u0000\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$-\u0003\b\u0004\u0000%-\u0003\n\u0005\u0000&-\u0003"+
		"\f\u0006\u0000\'-\u0003\u000e\u0007\u0000(-\u0003\u0010\b\u0000)-\u0003"+
		"\u0014\n\u0000*-\u0003\u0012\t\u0000+-\u0003\u0006\u0003\u0000,$\u0001"+
		"\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000"+
		",\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0005\u0001"+
		"\u0000\u0000\u0000./\u0005\u0003\u0000\u0000/0\u0005\u0010\u0000\u0000"+
		"0:\u0005\u0002\u0000\u000012\u0005\u0003\u0000\u000023\u0005\u0014\u0000"+
		"\u00003:\u0005\u0002\u0000\u000045\u0005\u0003\u0000\u000056\u0005\u0014"+
		"\u0000\u000067\u0005\u0004\u0000\u000078\u0005\u0014\u0000\u00008:\u0005"+
		"\u0002\u0000\u00009.\u0001\u0000\u0000\u000091\u0001\u0000\u0000\u0000"+
		"94\u0001\u0000\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005\u0005"+
		"\u0000\u0000<=\u0005\u0014\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0005"+
		"\u0016\u0000\u0000?D\u0005\u0002\u0000\u0000@A\u0005\u0005\u0000\u0000"+
		"AB\u0005\u0014\u0000\u0000BD\u0005\u0002\u0000\u0000C;\u0001\u0000\u0000"+
		"\u0000C@\u0001\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0005\u0007"+
		"\u0000\u0000FG\u0005\u0014\u0000\u0000GH\u0005\u0006\u0000\u0000HI\u0005"+
		"\u0010\u0000\u0000IN\u0005\u0002\u0000\u0000JK\u0005\u0007\u0000\u0000"+
		"KL\u0005\u0014\u0000\u0000LN\u0005\u0002\u0000\u0000ME\u0001\u0000\u0000"+
		"\u0000MJ\u0001\u0000\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005"+
		"\b\u0000\u0000PQ\u0005\u0014\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0005"+
		"\u0011\u0000\u0000SX\u0005\u0002\u0000\u0000TU\u0005\b\u0000\u0000UV\u0005"+
		"\u0014\u0000\u0000VX\u0005\u0002\u0000\u0000WO\u0001\u0000\u0000\u0000"+
		"WT\u0001\u0000\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0005\t\u0000"+
		"\u0000Z[\u0005\u0014\u0000\u0000[\\\u0005\u0006\u0000\u0000\\]\u0005\u0012"+
		"\u0000\u0000]b\u0005\u0002\u0000\u0000^_\u0005\t\u0000\u0000_`\u0005\u0014"+
		"\u0000\u0000`b\u0005\u0002\u0000\u0000aY\u0001\u0000\u0000\u0000a^\u0001"+
		"\u0000\u0000\u0000b\u000f\u0001\u0000\u0000\u0000cd\u0005\n\u0000\u0000"+
		"de\u0005\u0014\u0000\u0000ef\u0005\u0006\u0000\u0000fg\u0005\u0013\u0000"+
		"\u0000gl\u0005\u0002\u0000\u0000hi\u0005\n\u0000\u0000ij\u0005\u0014\u0000"+
		"\u0000jl\u0005\u0002\u0000\u0000kc\u0001\u0000\u0000\u0000kh\u0001\u0000"+
		"\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005\u000b\u0000\u0000"+
		"no\u0005\u0014\u0000\u0000op\u0005\u0006\u0000\u0000pq\u0007\u0000\u0000"+
		"\u0000q~\u0005\u0002\u0000\u0000rs\u0005\u000b\u0000\u0000st\u0005\u0014"+
		"\u0000\u0000t~\u0005\u0002\u0000\u0000uv\u0005\f\u0000\u0000vw\u0005\u0014"+
		"\u0000\u0000wx\u0005\u0006\u0000\u0000xy\u0007\u0000\u0000\u0000y~\u0005"+
		"\u0002\u0000\u0000z{\u0005\f\u0000\u0000{|\u0005\u0014\u0000\u0000|~\u0005"+
		"\u0002\u0000\u0000}m\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000"+
		"}u\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000~\u0013\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080\u0081\u0005\u0014\u0000"+
		"\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0007\u0000\u0000"+
		"\u0000\u0083\u0088\u0005\u0002\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000"+
		"\u0085\u0086\u0005\u0014\u0000\u0000\u0086\u0088\u0005\u0002\u0000\u0000"+
		"\u0087\u007f\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000"+
		"\u0088\u0015\u0001\u0000\u0000\u0000\n!,9CMWak}\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}