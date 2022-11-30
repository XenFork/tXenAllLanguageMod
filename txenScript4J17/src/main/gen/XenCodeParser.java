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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, LINE_COMMENT=36, COMMENT=37, INT=38, 
		WHILE_BOOL=39, FLOAT=40, LONG=41, DOUBLE=42, BOOL=43, NAME=44, SECONDNAME=45, 
		STRING=46, WS=47;
	public static final int
		RULE_all = 0, RULE_allField = 1, RULE_tmp = 2, RULE_str = 3, RULE_int = 4, 
		RULE_float = 5, RULE_double = 6, RULE_long = 7, RULE_boolean = 8, RULE_strings = 9, 
		RULE_ints = 10, RULE_floats = 11, RULE_doubles = 12, RULE_longs = 13, 
		RULE_booleans = 14, RULE_val = 15, RULE_var = 16, RULE_imports = 17, RULE_add = 18, 
		RULE_addAll = 19, RULE_allMethod = 20, RULE_m = 21, RULE_while = 22, RULE_for = 23, 
		RULE_foreach = 24, RULE_print = 25, RULE_r = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"all", "allField", "tmp", "str", "int", "float", "double", "long", "boolean", 
			"strings", "ints", "floats", "doubles", "longs", "booleans", "val", "var", 
			"imports", "add", "addAll", "allMethod", "m", "while", "for", "foreach", 
			"print", "r"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'string'", "'='", "';'", "'int'", "'float'", "'double'", "'long'", 
			"'bool'", "'boolean'", "'strings'", "'{'", "','", "'}'", "'ints'", "'floats'", 
			"'doubles'", "'longs'", "'booleans'", "'bools'", "'val'", "'as'", "'var'", 
			"'#'", "'>'", "'.'", "'add'", "'('", "')'", "'addAll'", "'while'", "'for'", 
			"'<<'", "'foreach'", "'print'", "'hello'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"LINE_COMMENT", "COMMENT", "INT", "WHILE_BOOL", "FLOAT", "LONG", "DOUBLE", 
			"BOOL", "NAME", "SECONDNAME", "STRING", "WS"
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
	public static class AllContext extends ParserRuleContext {
		public AllMethodContext allMethod() {
			return getRuleContext(AllMethodContext.class,0);
		}
		public AllFieldContext allField() {
			return getRuleContext(AllFieldContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		return all(0);
	}

	private AllContext all(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AllContext _localctx = new AllContext(_ctx, _parentState);
		AllContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_all, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__32:
			case T__33:
				{
				setState(55);
				allMethod(0);
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case NAME:
				{
				setState(56);
				allField(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AllContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_all);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						allMethod(0);
						}
						break;
					case 2:
						{
						_localctx = new AllContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_all);
						setState(61);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(62);
						allField(0);
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class AllFieldContext extends ParserRuleContext {
		public TmpContext tmp() {
			return getRuleContext(TmpContext.class,0);
		}
		public AllFieldContext allField() {
			return getRuleContext(AllFieldContext.class,0);
		}
		public AllFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterAllField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitAllField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitAllField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllFieldContext allField() throws RecognitionException {
		return allField(0);
	}

	private AllFieldContext allField(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AllFieldContext _localctx = new AllFieldContext(_ctx, _parentState);
		AllFieldContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_allField, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			tmp();
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AllFieldContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_allField);
					setState(71);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(72);
					tmp();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class TmpContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public DoubleContext double_() {
			return getRuleContext(DoubleContext.class,0);
		}
		public LongContext long_() {
			return getRuleContext(LongContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public IntsContext ints() {
			return getRuleContext(IntsContext.class,0);
		}
		public FloatsContext floats() {
			return getRuleContext(FloatsContext.class,0);
		}
		public DoublesContext doubles() {
			return getRuleContext(DoublesContext.class,0);
		}
		public LongsContext longs() {
			return getRuleContext(LongsContext.class,0);
		}
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public AddAllContext addAll() {
			return getRuleContext(AddAllContext.class,0);
		}
		public TmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterTmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitTmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitTmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmpContext tmp() throws RecognitionException {
		TmpContext _localctx = new TmpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tmp);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				imports();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				str();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				int_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				float_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				double_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				long_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				boolean_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				strings();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				ints();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				floats();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(88);
				doubles();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(89);
				longs();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				booleans();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(91);
				val();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(92);
				var();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(93);
				add();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(94);
				addAll();
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
	public static class StrContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(XenCodeParser.STRING, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			match(NAME);
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(99);
				match(T__1);
				setState(100);
				match(STRING);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			match(T__2);
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
	public static class IntContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__3);
			setState(107);
			match(NAME);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(108);
				match(T__1);
				setState(109);
				match(INT);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			match(T__2);
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
	public static class FloatContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode FLOAT() { return getToken(XenCodeParser.FLOAT, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__4);
			setState(116);
			match(NAME);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(117);
				match(T__1);
				setState(118);
				match(FLOAT);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			match(T__2);
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
	public static class DoubleContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode DOUBLE() { return getToken(XenCodeParser.DOUBLE, 0); }
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__5);
			setState(125);
			match(NAME);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(126);
				match(T__1);
				setState(127);
				match(DOUBLE);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			match(T__2);
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
	public static class LongContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode LONG() { return getToken(XenCodeParser.LONG, 0); }
		public LongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitLong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongContext long_() throws RecognitionException {
		LongContext _localctx = new LongContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__6);
			setState(134);
			match(NAME);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(135);
				match(T__1);
				setState(136);
				match(LONG);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			match(T__2);
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
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode BOOL() { return getToken(XenCodeParser.BOOL, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolean);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__7);
				setState(143);
				match(NAME);
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(144);
					match(T__1);
					setState(145);
					match(BOOL);
					}
					break;
				case T__2:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__8);
				setState(151);
				match(NAME);
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(152);
					match(T__1);
					setState(153);
					match(BOOL);
					}
					break;
				case T__2:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157);
				match(T__2);
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
	public static class StringsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> STRING() { return getTokens(XenCodeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XenCodeParser.STRING, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_strings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__9);
			setState(161);
			match(NAME);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(162);
				match(T__1);
				setState(163);
				match(T__10);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(166); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(164);
							match(STRING);
							setState(165);
							match(T__11);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(168); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(170);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(171);
					match(STRING);
					}
					break;
				case 3:
					{
					}
					break;
				}
				setState(175);
				match(T__12);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			match(T__2);
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
	public static class IntsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> INT() { return getTokens(XenCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCodeParser.INT, i);
		}
		public IntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitInts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntsContext ints() throws RecognitionException {
		IntsContext _localctx = new IntsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__13);
			setState(182);
			match(NAME);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(183);
				match(T__1);
				setState(184);
				match(T__10);
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(187); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(185);
							match(INT);
							setState(186);
							match(T__11);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(189); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(191);
					match(INT);
					}
					break;
				case 2:
					{
					setState(192);
					match(INT);
					}
					break;
				case 3:
					{
					}
					break;
				}
				setState(196);
				match(T__12);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
			match(T__2);
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
	public static class FloatsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(XenCodeParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(XenCodeParser.FLOAT, i);
		}
		public FloatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFloats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFloats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFloats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatsContext floats() throws RecognitionException {
		FloatsContext _localctx = new FloatsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_floats);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__14);
			setState(203);
			match(NAME);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(204);
				match(T__1);
				setState(205);
				match(T__10);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(208); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(206);
							match(FLOAT);
							setState(207);
							match(T__11);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(210); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(212);
					match(FLOAT);
					}
					break;
				case 2:
					{
					setState(213);
					match(FLOAT);
					}
					break;
				case 3:
					{
					}
					break;
				}
				setState(217);
				match(T__12);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			match(T__2);
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
	public static class DoublesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> DOUBLE() { return getTokens(XenCodeParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(XenCodeParser.DOUBLE, i);
		}
		public DoublesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterDoubles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitDoubles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitDoubles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoublesContext doubles() throws RecognitionException {
		DoublesContext _localctx = new DoublesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_doubles);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__15);
			setState(224);
			match(NAME);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(225);
				match(T__1);
				setState(226);
				match(T__10);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(229); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(227);
							match(DOUBLE);
							setState(228);
							match(T__11);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(231); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(233);
					match(DOUBLE);
					}
					break;
				case 2:
					{
					setState(234);
					match(DOUBLE);
					}
					break;
				case 3:
					{
					}
					break;
				}
				setState(238);
				match(T__12);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			match(T__2);
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
	public static class LongsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> LONG() { return getTokens(XenCodeParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(XenCodeParser.LONG, i);
		}
		public LongsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterLongs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitLongs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitLongs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongsContext longs() throws RecognitionException {
		LongsContext _localctx = new LongsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_longs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__16);
			setState(245);
			match(NAME);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(246);
				match(T__1);
				setState(247);
				match(T__10);
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(250); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(248);
							match(LONG);
							setState(249);
							match(T__11);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(252); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(254);
					match(LONG);
					}
					break;
				case 2:
					{
					setState(255);
					match(LONG);
					}
					break;
				case 3:
					{
					}
					break;
				}
				setState(259);
				match(T__12);
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			match(T__2);
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
	public static class BooleansContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> BOOL() { return getTokens(XenCodeParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(XenCodeParser.BOOL, i);
		}
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleans);
		try {
			int _alt;
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__17);
				setState(266);
				match(NAME);
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(267);
					match(T__1);
					setState(268);
					match(T__10);
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(271); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(269);
								match(BOOL);
								setState(270);
								match(T__11);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(273); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(275);
						match(BOOL);
						}
						break;
					case 2:
						{
						setState(276);
						match(BOOL);
						}
						break;
					case 3:
						{
						}
						break;
					}
					setState(280);
					match(T__12);
					}
					break;
				case T__2:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284);
				match(T__2);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T__18);
				setState(286);
				match(NAME);
				setState(302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(287);
					match(T__1);
					setState(288);
					match(T__10);
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(291); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(289);
								match(BOOL);
								setState(290);
								match(T__11);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(293); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(295);
						match(BOOL);
						}
						break;
					case 2:
						{
						setState(296);
						match(BOOL);
						}
						break;
					case 3:
						{
						}
						break;
					}
					setState(300);
					match(T__12);
					}
					break;
				case T__2:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304);
				match(T__2);
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
	public static class ValContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> INT() { return getTokens(XenCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCodeParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(XenCodeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XenCodeParser.STRING, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(XenCodeParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(XenCodeParser.FLOAT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(XenCodeParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(XenCodeParser.DOUBLE, i);
		}
		public List<TerminalNode> LONG() { return getTokens(XenCodeParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(XenCodeParser.LONG, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(XenCodeParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(XenCodeParser.BOOL, i);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_val);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__19);
			setState(308);
			match(NAME);
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(309);
				match(T__1);
				setState(310);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 87136296501248L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__20:
				{
				setState(311);
				match(T__20);
				setState(438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(312);
					match(T__9);
					setState(328);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(313);
						match(T__1);
						setState(314);
						match(T__10);
						setState(324);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(317); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(315);
									match(STRING);
									setState(316);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(319); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(321);
							match(STRING);
							}
							break;
						case 2:
							{
							setState(322);
							match(STRING);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(326);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__13:
					{
					setState(330);
					match(T__13);
					setState(346);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(331);
						match(T__1);
						setState(332);
						match(T__10);
						setState(342);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(335); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(333);
									match(INT);
									setState(334);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(337); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(339);
							match(INT);
							}
							break;
						case 2:
							{
							setState(340);
							match(INT);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(344);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__14:
					{
					setState(348);
					match(T__14);
					setState(364);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(349);
						match(T__1);
						setState(350);
						match(T__10);
						setState(360);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(353); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(351);
									match(FLOAT);
									setState(352);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(355); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(357);
							match(FLOAT);
							}
							break;
						case 2:
							{
							setState(358);
							match(FLOAT);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(362);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__15:
					{
					setState(366);
					match(T__15);
					setState(382);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(367);
						match(T__1);
						setState(368);
						match(T__10);
						setState(378);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(371); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(369);
									match(DOUBLE);
									setState(370);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(373); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(375);
							match(DOUBLE);
							}
							break;
						case 2:
							{
							setState(376);
							match(DOUBLE);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(380);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__16:
					{
					setState(384);
					match(T__16);
					setState(400);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(385);
						match(T__1);
						setState(386);
						match(T__10);
						setState(396);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(389); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(387);
									match(LONG);
									setState(388);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(391); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(393);
							match(LONG);
							}
							break;
						case 2:
							{
							setState(394);
							match(LONG);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(398);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__17:
					{
					setState(402);
					match(T__17);
					setState(418);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(403);
						match(T__1);
						setState(404);
						match(T__10);
						setState(414);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(407); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(405);
									match(BOOL);
									setState(406);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(409); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(411);
							match(BOOL);
							}
							break;
						case 2:
							{
							setState(412);
							match(BOOL);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(416);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__18:
					{
					setState(420);
					match(T__18);
					setState(436);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(421);
						match(T__1);
						setState(422);
						match(T__10);
						setState(432);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(425); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(423);
									match(BOOL);
									setState(424);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(427); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(429);
							match(BOOL);
							}
							break;
						case 2:
							{
							setState(430);
							match(BOOL);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(434);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(442);
			match(T__2);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public List<TerminalNode> INT() { return getTokens(XenCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCodeParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(XenCodeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XenCodeParser.STRING, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(XenCodeParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(XenCodeParser.FLOAT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(XenCodeParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(XenCodeParser.DOUBLE, i);
		}
		public List<TerminalNode> LONG() { return getTokens(XenCodeParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(XenCodeParser.LONG, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(XenCodeParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(XenCodeParser.BOOL, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__21);
			setState(445);
			match(NAME);
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(446);
				match(T__1);
				setState(447);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 87136296501248L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__20:
				{
				setState(448);
				match(T__20);
				setState(575);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(449);
					match(T__9);
					setState(465);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(450);
						match(T__1);
						setState(451);
						match(T__10);
						setState(461);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(454); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(452);
									match(STRING);
									setState(453);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(456); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(458);
							match(STRING);
							}
							break;
						case 2:
							{
							setState(459);
							match(STRING);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(463);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__13:
					{
					setState(467);
					match(T__13);
					setState(483);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(468);
						match(T__1);
						setState(469);
						match(T__10);
						setState(479);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
						case 1:
							{
							setState(472); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(470);
									match(INT);
									setState(471);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(474); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(476);
							match(INT);
							}
							break;
						case 2:
							{
							setState(477);
							match(INT);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(481);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__14:
					{
					setState(485);
					match(T__14);
					setState(501);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(486);
						match(T__1);
						setState(487);
						match(T__10);
						setState(497);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
						case 1:
							{
							setState(490); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(488);
									match(FLOAT);
									setState(489);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(492); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(494);
							match(FLOAT);
							}
							break;
						case 2:
							{
							setState(495);
							match(FLOAT);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(499);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__15:
					{
					setState(503);
					match(T__15);
					setState(519);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(504);
						match(T__1);
						setState(505);
						match(T__10);
						setState(515);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
							{
							setState(508); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(506);
									match(DOUBLE);
									setState(507);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(510); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(512);
							match(DOUBLE);
							}
							break;
						case 2:
							{
							setState(513);
							match(DOUBLE);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(517);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__16:
					{
					setState(521);
					match(T__16);
					setState(537);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(522);
						match(T__1);
						setState(523);
						match(T__10);
						setState(533);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
						case 1:
							{
							setState(526); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(524);
									match(LONG);
									setState(525);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(528); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(530);
							match(LONG);
							}
							break;
						case 2:
							{
							setState(531);
							match(LONG);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(535);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__17:
					{
					setState(539);
					match(T__17);
					setState(555);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(540);
						match(T__1);
						setState(541);
						match(T__10);
						setState(551);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(544); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(542);
									match(BOOL);
									setState(543);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(546); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(548);
							match(BOOL);
							}
							break;
						case 2:
							{
							setState(549);
							match(BOOL);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(553);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__18:
					{
					setState(557);
					match(T__18);
					setState(573);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(558);
						match(T__1);
						setState(559);
						match(T__10);
						setState(569);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(562); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(560);
									match(BOOL);
									setState(561);
									match(T__11);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(564); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(566);
							match(BOOL);
							}
							break;
						case 2:
							{
							setState(567);
							match(BOOL);
							}
							break;
						case 3:
							{
							}
							break;
						}
						setState(571);
						match(T__12);
						}
						break;
					case T__2:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(579);
			match(T__2);
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
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public List<TerminalNode> NAME() { return getTokens(XenCodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XenCodeParser.NAME, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__22);
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(582);
				match(INT);
				}
				break;
			case NAME:
				{
				setState(583);
				match(NAME);
				setState(587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(584);
					match(T__23);
					setState(585);
					match(NAME);
					}
					break;
				case T__2:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(591);
			match(T__2);
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
	public static class AddContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(XenCodeParser.STRING, 0); }
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(XenCodeParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(XenCodeParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(XenCodeParser.LONG, 0); }
		public TerminalNode BOOL() { return getToken(XenCodeParser.BOOL, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(NAME);
			setState(594);
			match(T__24);
			setState(595);
			match(T__25);
			setState(596);
			match(T__26);
			setState(597);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 87136296501248L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(598);
			match(T__27);
			setState(599);
			match(T__2);
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
	public static class AddAllContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XenCodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XenCodeParser.NAME, i);
		}
		public List<TerminalNode> STRING() { return getTokens(XenCodeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XenCodeParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(XenCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCodeParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(XenCodeParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(XenCodeParser.FLOAT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(XenCodeParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(XenCodeParser.DOUBLE, i);
		}
		public List<TerminalNode> LONG() { return getTokens(XenCodeParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(XenCodeParser.LONG, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(XenCodeParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(XenCodeParser.BOOL, i);
		}
		public AddAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterAddAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitAddAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitAddAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddAllContext addAll() throws RecognitionException {
		AddAllContext _localctx = new AddAllContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_addAll);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(NAME);
			setState(602);
			match(T__24);
			setState(603);
			match(T__28);
			setState(604);
			match(T__26);
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(605);
				match(NAME);
				}
				break;
			case STRING:
				{
				setState(608); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(606);
						match(STRING);
						setState(607);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(610); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(612);
				match(STRING);
				}
				break;
			case INT:
				{
				setState(615); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(613);
						match(INT);
						setState(614);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(617); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(619);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(622); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(620);
						match(FLOAT);
						setState(621);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(624); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(626);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				{
				setState(629); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(627);
						match(DOUBLE);
						setState(628);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(631); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(633);
				match(DOUBLE);
				}
				break;
			case LONG:
				{
				setState(636); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(634);
						match(LONG);
						setState(635);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(638); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(640);
				match(LONG);
				}
				break;
			case BOOL:
				{
				setState(643); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(641);
						match(BOOL);
						setState(642);
						match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(645); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(647);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(650);
			match(T__27);
			setState(651);
			match(T__2);
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
	public static class AllMethodContext extends ParserRuleContext {
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public AllMethodContext allMethod() {
			return getRuleContext(AllMethodContext.class,0);
		}
		public AllMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterAllMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitAllMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitAllMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllMethodContext allMethod() throws RecognitionException {
		return allMethod(0);
	}

	private AllMethodContext allMethod(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AllMethodContext _localctx = new AllMethodContext(_ctx, _parentState);
		AllMethodContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_allMethod, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(654);
			m();
			}
			_ctx.stop = _input.LT(-1);
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AllMethodContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_allMethod);
					setState(656);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(657);
					m();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
	public static class MContext extends ParserRuleContext {
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public MContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MContext m() throws RecognitionException {
		MContext _localctx = new MContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_m);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				while_();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				for_();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				foreach();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
				print();
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCodeParser.NAME, 0); }
		public TerminalNode WHILE_BOOL() { return getToken(XenCodeParser.WHILE_BOOL, 0); }
		public TerminalNode INT() { return getToken(XenCodeParser.INT, 0); }
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(T__29);
			setState(670);
			match(NAME);
			setState(671);
			match(WHILE_BOOL);
			setState(672);
			match(INT);
			setState(673);
			match(T__10);
			setState(674);
			all(0);
			setState(675);
			match(T__12);
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
	public static class ForContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(XenCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCodeParser.INT, i);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(T__30);
			setState(678);
			match(INT);
			setState(679);
			match(T__31);
			setState(680);
			match(INT);
			setState(681);
			match(T__10);
			setState(682);
			all(0);
			setState(683);
			match(T__12);
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
	public static class ForeachContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XenCodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XenCodeParser.NAME, i);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(T__32);
			setState(686);
			match(NAME);
			setState(687);
			match(T__31);
			setState(688);
			match(NAME);
			setState(689);
			match(T__10);
			setState(690);
			all(0);
			setState(691);
			match(T__12);
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
	public static class PrintContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XenCodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XenCodeParser.NAME, i);
		}
		public List<TerminalNode> STRING() { return getTokens(XenCodeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XenCodeParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(XenCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCodeParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(XenCodeParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(XenCodeParser.FLOAT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(XenCodeParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(XenCodeParser.DOUBLE, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(XenCodeParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(XenCodeParser.BOOL, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCodeListener ) ((XenCodeListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCodeVisitor ) return ((XenCodeVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		int _la;
		try {
			int _alt;
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(T__33);
				setState(696); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(694);
					match(T__31);
					setState(695);
					match(NAME);
					}
					}
					setState(698); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__31 );
				setState(700);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(T__33);
				setState(702);
				match(T__31);
				setState(707); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(707);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NAME:
							{
							setState(703);
							match(NAME);
							setState(704);
							match(T__11);
							}
							break;
						case INT:
						case FLOAT:
						case DOUBLE:
						case BOOL:
						case STRING:
							{
							setState(705);
							_la = _input.LA(1);
							if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 84937273245696L) != 0) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(706);
							match(T__11);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(709); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(713);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(711);
					match(NAME);
					}
					break;
				case INT:
				case FLOAT:
				case DOUBLE:
				case BOOL:
				case STRING:
					{
					setState(712);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 84937273245696L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(715);
				match(T__2);
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
		enterRule(_localctx, 52, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T__34);
			setState(719);
			match(NAME);
			setState(720);
			match(T__2);
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
		case 0:
			return all_sempred((AllContext)_localctx, predIndex);
		case 1:
			return allField_sempred((AllFieldContext)_localctx, predIndex);
		case 20:
			return allMethod_sempred((AllMethodContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean all_sempred(AllContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean allField_sempred(AllFieldContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean allMethod_sempred(AllMethodContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u02d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000:\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001J\b\u0001"+
		"\n\u0001\f\u0001M\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002`\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003g\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"p\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005y\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0082\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0094\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\b\u0003\b\u009f"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00a7\b\t"+
		"\u000b\t\f\t\u00a8\u0001\t\u0001\t\u0001\t\u0003\t\u00ae\b\t\u0001\t\u0001"+
		"\t\u0003\t\u00b2\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u00bc\b\n\u000b\n\f\n\u00bd\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00c3\b\n\u0001\n\u0001\n\u0003\n\u00c7\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u00d1\b\u000b\u000b\u000b\f\u000b\u00d2\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00d8\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00dc\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0004\f\u00e6\b\f\u000b\f\f\f\u00e7\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00ed\b\f\u0001\f\u0001\f\u0003\f\u00f1\b\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00fb\b\r\u000b"+
		"\r\f\r\u00fc\u0001\r\u0001\r\u0001\r\u0003\r\u0102\b\r\u0001\r\u0001\r"+
		"\u0003\r\u0106\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0110\b\u000e\u000b\u000e"+
		"\f\u000e\u0111\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0117\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011b\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0124\b\u000e\u000b\u000e\f\u000e\u0125\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u012b\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u012f\b\u000e\u0001\u000e\u0003\u000e\u0132\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u013e\b\u000f\u000b\u000f\f"+
		"\u000f\u013f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0145\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0149\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0150\b\u000f\u000b\u000f"+
		"\f\u000f\u0151\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0157\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u015b\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0162\b\u000f\u000b"+
		"\u000f\f\u000f\u0163\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0169"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u016d\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0174\b\u000f"+
		"\u000b\u000f\f\u000f\u0175\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u017b\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u017f\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0186"+
		"\b\u000f\u000b\u000f\f\u000f\u0187\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u018d\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0191\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0198\b\u000f\u000b\u000f\f\u000f\u0199\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u019f\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01a3\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u01aa\b\u000f\u000b\u000f\f\u000f\u01ab\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u01b1\b\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u01b5\b\u000f\u0003\u000f\u01b7\b\u000f\u0003\u000f\u01b9\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u01c7\b\u0010\u000b\u0010\f\u0010\u01c8\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u01ce\b\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u01d2\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u01d9\b\u0010\u000b\u0010\f\u0010\u01da\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u01e0\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01e4\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u01eb\b\u0010\u000b\u0010\f\u0010\u01ec\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01f2\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01f6\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u01fd\b\u0010\u000b\u0010\f\u0010\u01fe"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0204\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0208\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u020f\b\u0010\u000b\u0010\f\u0010"+
		"\u0210\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0216\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u021a\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0221\b\u0010\u000b\u0010\f"+
		"\u0010\u0222\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0228\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u022c\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0233\b\u0010\u000b\u0010"+
		"\f\u0010\u0234\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u023a\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u023e\b\u0010\u0003\u0010\u0240"+
		"\b\u0010\u0003\u0010\u0242\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u024c\b\u0011\u0003\u0011\u024e\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0261\b\u0013\u000b\u0013\f"+
		"\u0013\u0262\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0268\b\u0013"+
		"\u000b\u0013\f\u0013\u0269\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013"+
		"\u026f\b\u0013\u000b\u0013\f\u0013\u0270\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0004\u0013\u0276\b\u0013\u000b\u0013\f\u0013\u0277\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u027d\b\u0013\u000b\u0013\f\u0013"+
		"\u027e\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0284\b\u0013\u000b"+
		"\u0013\f\u0013\u0285\u0001\u0013\u0003\u0013\u0289\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0293\b\u0014\n\u0014\f\u0014\u0296\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u029c\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u02b9\b\u0019\u000b\u0019\f"+
		"\u0019\u02ba\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0004\u0019\u02c4\b\u0019\u000b\u0019\f\u0019"+
		"\u02c5\u0001\u0019\u0001\u0019\u0003\u0019\u02ca\b\u0019\u0001\u0019\u0003"+
		"\u0019\u02cd\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0000\u0003\u0000\u0002(\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0002"+
		"\u0003\u0000&&(+..\u0004\u0000&&((*+..\u034d\u00009\u0001\u0000\u0000"+
		"\u0000\u0002D\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000\u0006"+
		"a\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000"+
		"\u0000\f|\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000\u0000"+
		"\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000"+
		"\u0014\u00b5\u0001\u0000\u0000\u0000\u0016\u00ca\u0001\u0000\u0000\u0000"+
		"\u0018\u00df\u0001\u0000\u0000\u0000\u001a\u00f4\u0001\u0000\u0000\u0000"+
		"\u001c\u0131\u0001\u0000\u0000\u0000\u001e\u0133\u0001\u0000\u0000\u0000"+
		" \u01bc\u0001\u0000\u0000\u0000\"\u0245\u0001\u0000\u0000\u0000$\u0251"+
		"\u0001\u0000\u0000\u0000&\u0259\u0001\u0000\u0000\u0000(\u028d\u0001\u0000"+
		"\u0000\u0000*\u029b\u0001\u0000\u0000\u0000,\u029d\u0001\u0000\u0000\u0000"+
		".\u02a5\u0001\u0000\u0000\u00000\u02ad\u0001\u0000\u0000\u00002\u02cc"+
		"\u0001\u0000\u0000\u00004\u02ce\u0001\u0000\u0000\u000067\u0006\u0000"+
		"\uffff\uffff\u00007:\u0003(\u0014\u00008:\u0003\u0002\u0001\u000096\u0001"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:A\u0001\u0000\u0000\u0000"+
		";<\n\u0004\u0000\u0000<@\u0003(\u0014\u0000=>\n\u0003\u0000\u0000>@\u0003"+
		"\u0002\u0001\u0000?;\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\u0001\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0006"+
		"\u0001\uffff\uffff\u0000EF\u0003\u0004\u0002\u0000FK\u0001\u0000\u0000"+
		"\u0000GH\n\u0002\u0000\u0000HJ\u0003\u0004\u0002\u0000IG\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"N`\u0003\"\u0011\u0000O`\u0003\u0006\u0003\u0000P`\u0003\b\u0004\u0000"+
		"Q`\u0003\n\u0005\u0000R`\u0003\f\u0006\u0000S`\u0003\u000e\u0007\u0000"+
		"T`\u0003\u0010\b\u0000U`\u0003\u0012\t\u0000V`\u0003\u0014\n\u0000W`\u0003"+
		"\u0016\u000b\u0000X`\u0003\u0018\f\u0000Y`\u0003\u001a\r\u0000Z`\u0003"+
		"\u001c\u000e\u0000[`\u0003\u001e\u000f\u0000\\`\u0003 \u0010\u0000]`\u0003"+
		"$\u0012\u0000^`\u0003&\u0013\u0000_N\u0001\u0000\u0000\u0000_O\u0001\u0000"+
		"\u0000\u0000_P\u0001\u0000\u0000\u0000_Q\u0001\u0000\u0000\u0000_R\u0001"+
		"\u0000\u0000\u0000_S\u0001\u0000\u0000\u0000_T\u0001\u0000\u0000\u0000"+
		"_U\u0001\u0000\u0000\u0000_V\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000"+
		"\u0000_X\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000"+
		"\u0000\u0000_[\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`\u0005\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0001\u0000\u0000bf\u0005,\u0000\u0000cd\u0005\u0002\u0000"+
		"\u0000dg\u0005.\u0000\u0000eg\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0003"+
		"\u0000\u0000i\u0007\u0001\u0000\u0000\u0000jk\u0005\u0004\u0000\u0000"+
		"ko\u0005,\u0000\u0000lm\u0005\u0002\u0000\u0000mp\u0005&\u0000\u0000n"+
		"p\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0005\u0003\u0000\u0000r\t\u0001\u0000"+
		"\u0000\u0000st\u0005\u0005\u0000\u0000tx\u0005,\u0000\u0000uv\u0005\u0002"+
		"\u0000\u0000vy\u0005(\u0000\u0000wy\u0001\u0000\u0000\u0000xu\u0001\u0000"+
		"\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0003\u0000\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0005\u0006\u0000"+
		"\u0000}\u0081\u0005,\u0000\u0000~\u007f\u0005\u0002\u0000\u0000\u007f"+
		"\u0082\u0005*\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081~\u0001"+
		"\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084\r\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u008a\u0005,\u0000"+
		"\u0000\u0087\u0088\u0005\u0002\u0000\u0000\u0088\u008b\u0005)\u0000\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\b\u0000\u0000\u008f\u0093\u0005,\u0000\u0000\u0090"+
		"\u0091\u0005\u0002\u0000\u0000\u0091\u0094\u0005+\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u009f"+
		"\u0005\u0003\u0000\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u009b\u0005"+
		",\u0000\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099\u009c\u0005+\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0005\u0003\u0000\u0000\u009e\u008e\u0001\u0000\u0000"+
		"\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009f\u0011\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\n\u0000\u0000\u00a1\u00b1\u0005,\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0002\u0000\u0000\u00a3\u00ad\u0005\u000b\u0000\u0000"+
		"\u00a4\u00a5\u0005.\u0000\u0000\u00a5\u00a7\u0005\f\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005.\u0000\u0000\u00ab\u00ae"+
		"\u0005.\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b2\u0005"+
		"\r\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u0013\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u000e\u0000\u0000\u00b6\u00c6\u0005,\u0000"+
		"\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00c2\u0005\u000b\u0000"+
		"\u0000\u00b9\u00ba\u0005&\u0000\u0000\u00ba\u00bc\u0005\f\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c3\u0005&\u0000\u0000\u00c0"+
		"\u00c3\u0005&\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7"+
		"\u0005\r\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u0015\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u000f\u0000\u0000\u00cb\u00db\u0005"+
		",\u0000\u0000\u00cc\u00cd\u0005\u0002\u0000\u0000\u00cd\u00d7\u0005\u000b"+
		"\u0000\u0000\u00ce\u00cf\u0005(\u0000\u0000\u00cf\u00d1\u0005\f\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d8\u0005(\u0000\u0000"+
		"\u00d5\u00d8\u0005(\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0005\r\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00cc"+
		"\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de\u0017"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0010\u0000\u0000\u00e0\u00f0"+
		"\u0005,\u0000\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e2\u00ec\u0005"+
		"\u000b\u0000\u0000\u00e3\u00e4\u0005*\u0000\u0000\u00e4\u00e6\u0005\f"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ed\u0005*\u0000"+
		"\u0000\u00ea\u00ed\u0005*\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00e5\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f1\u0005\r\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0003\u0000\u0000\u00f3"+
		"\u0019\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0011\u0000\u0000\u00f5"+
		"\u0105\u0005,\u0000\u0000\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7\u0101"+
		"\u0005\u000b\u0000\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f9\u00fb\u0005"+
		"\f\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0102\u0005)\u0000"+
		"\u0000\u00ff\u0102\u0005)\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00fa\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0005\r\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105"+
		"\u00f6\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108"+
		"\u001b\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0012\u0000\u0000\u010a"+
		"\u011a\u0005,\u0000\u0000\u010b\u010c\u0005\u0002\u0000\u0000\u010c\u0116"+
		"\u0005\u000b\u0000\u0000\u010d\u010e\u0005+\u0000\u0000\u010e\u0110\u0005"+
		"\f\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0117\u0005+\u0000"+
		"\u0000\u0114\u0117\u0005+\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000"+
		"\u0116\u010f\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u011b\u0005\r\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a"+
		"\u010b\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c\u0132\u0005\u0003\u0000\u0000\u011d"+
		"\u011e\u0005\u0013\u0000\u0000\u011e\u012e\u0005,\u0000\u0000\u011f\u0120"+
		"\u0005\u0002\u0000\u0000\u0120\u012a\u0005\u000b\u0000\u0000\u0121\u0122"+
		"\u0005+\u0000\u0000\u0122\u0124\u0005\f\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u012b\u0005+\u0000\u0000\u0128\u012b\u0005+\u0000"+
		"\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0123\u0001\u0000\u0000"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012f\u0005\r\u0000\u0000"+
		"\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u011f\u0001\u0000\u0000\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u0132\u0005\u0003\u0000\u0000\u0131\u0109\u0001\u0000\u0000\u0000"+
		"\u0131\u011d\u0001\u0000\u0000\u0000\u0132\u001d\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0005\u0014\u0000\u0000\u0134\u01b8\u0005,\u0000\u0000\u0135"+
		"\u0136\u0005\u0002\u0000\u0000\u0136\u01b9\u0007\u0000\u0000\u0000\u0137"+
		"\u01b6\u0005\u0015\u0000\u0000\u0138\u0148\u0005\n\u0000\u0000\u0139\u013a"+
		"\u0005\u0002\u0000\u0000\u013a\u0144\u0005\u000b\u0000\u0000\u013b\u013c"+
		"\u0005.\u0000\u0000\u013c\u013e\u0005\f\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0145\u0005.\u0000\u0000\u0142\u0145\u0005.\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u013d\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0149\u0005\r\u0000\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0139\u0001\u0000\u0000\u0000"+
		"\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u01b7\u0001\u0000\u0000\u0000"+
		"\u014a\u015a\u0005\u000e\u0000\u0000\u014b\u014c\u0005\u0002\u0000\u0000"+
		"\u014c\u0156\u0005\u000b\u0000\u0000\u014d\u014e\u0005&\u0000\u0000\u014e"+
		"\u0150\u0005\f\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0157"+
		"\u0005&\u0000\u0000\u0154\u0157\u0005&\u0000\u0000\u0155\u0157\u0001\u0000"+
		"\u0000\u0000\u0156\u014f\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u015b\u0005\r\u0000\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u014b\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000"+
		"\u0000\u015b\u01b7\u0001\u0000\u0000\u0000\u015c\u016c\u0005\u000f\u0000"+
		"\u0000\u015d\u015e\u0005\u0002\u0000\u0000\u015e\u0168\u0005\u000b\u0000"+
		"\u0000\u015f\u0160\u0005(\u0000\u0000\u0160\u0162\u0005\f\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0169\u0005(\u0000\u0000\u0166"+
		"\u0169\u0005(\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0161"+
		"\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016d"+
		"\u0005\r\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u015d\u0001"+
		"\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d\u01b7\u0001"+
		"\u0000\u0000\u0000\u016e\u017e\u0005\u0010\u0000\u0000\u016f\u0170\u0005"+
		"\u0002\u0000\u0000\u0170\u017a\u0005\u000b\u0000\u0000\u0171\u0172\u0005"+
		"*\u0000\u0000\u0172\u0174\u0005\f\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u017b\u0005*\u0000\u0000\u0178\u017b\u0005*\u0000\u0000"+
		"\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0173\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017f\u0005\r\u0000\u0000\u017d"+
		"\u017f\u0001\u0000\u0000\u0000\u017e\u016f\u0001\u0000\u0000\u0000\u017e"+
		"\u017d\u0001\u0000\u0000\u0000\u017f\u01b7\u0001\u0000\u0000\u0000\u0180"+
		"\u0190\u0005\u0011\u0000\u0000\u0181\u0182\u0005\u0002\u0000\u0000\u0182"+
		"\u018c\u0005\u000b\u0000\u0000\u0183\u0184\u0005)\u0000\u0000\u0184\u0186"+
		"\u0005\f\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018d\u0005"+
		")\u0000\u0000\u018a\u018d\u0005)\u0000\u0000\u018b\u018d\u0001\u0000\u0000"+
		"\u0000\u018c\u0185\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u0191\u0005\r\u0000\u0000\u018f\u0191\u0001\u0000\u0000\u0000"+
		"\u0190\u0181\u0001\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000"+
		"\u0191\u01b7\u0001\u0000\u0000\u0000\u0192\u01a2\u0005\u0012\u0000\u0000"+
		"\u0193\u0194\u0005\u0002\u0000\u0000\u0194\u019e\u0005\u000b\u0000\u0000"+
		"\u0195\u0196\u0005+\u0000\u0000\u0196\u0198\u0005\f\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u019f\u0005+\u0000\u0000\u019c\u019f"+
		"\u0005+\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0197\u0001"+
		"\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019d\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u0005"+
		"\r\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u0193\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01b7\u0001\u0000"+
		"\u0000\u0000\u01a4\u01b4\u0005\u0013\u0000\u0000\u01a5\u01a6\u0005\u0002"+
		"\u0000\u0000\u01a6\u01b0\u0005\u000b\u0000\u0000\u01a7\u01a8\u0005+\u0000"+
		"\u0000\u01a8\u01aa\u0005\f\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ad\u01b1\u0005+\u0000\u0000\u01ae\u01b1\u0005+\u0000\u0000\u01af\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b0\u01a9\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b5\u0005\r\u0000\u0000\u01b3\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b4\u01a5\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u0138\u0001"+
		"\u0000\u0000\u0000\u01b6\u014a\u0001\u0000\u0000\u0000\u01b6\u015c\u0001"+
		"\u0000\u0000\u0000\u01b6\u016e\u0001\u0000\u0000\u0000\u01b6\u0180\u0001"+
		"\u0000\u0000\u0000\u01b6\u0192\u0001\u0000\u0000\u0000\u01b6\u01a4\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u0135\u0001"+
		"\u0000\u0000\u0000\u01b8\u0137\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000\u01bb\u001f\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0005\u0016\u0000\u0000\u01bd\u0241\u0005"+
		",\u0000\u0000\u01be\u01bf\u0005\u0002\u0000\u0000\u01bf\u0242\u0007\u0000"+
		"\u0000\u0000\u01c0\u023f\u0005\u0015\u0000\u0000\u01c1\u01d1\u0005\n\u0000"+
		"\u0000\u01c2\u01c3\u0005\u0002\u0000\u0000\u01c3\u01cd\u0005\u000b\u0000"+
		"\u0000\u01c4\u01c5\u0005.\u0000\u0000\u01c5\u01c7\u0005\f\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01ce\u0005.\u0000\u0000\u01cb"+
		"\u01ce\u0005.\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01c6"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d2"+
		"\u0005\r\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u0240\u0001"+
		"\u0000\u0000\u0000\u01d3\u01e3\u0005\u000e\u0000\u0000\u01d4\u01d5\u0005"+
		"\u0002\u0000\u0000\u01d5\u01df\u0005\u000b\u0000\u0000\u01d6\u01d7\u0005"+
		"&\u0000\u0000\u01d7\u01d9\u0005\f\u0000\u0000\u01d8\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01e0\u0005&\u0000\u0000\u01dd\u01e0\u0005&\u0000\u0000"+
		"\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01d8\u0001\u0000\u0000\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e4\u0005\r\u0000\u0000\u01e2"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e3\u01d4\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4\u0240\u0001\u0000\u0000\u0000\u01e5"+
		"\u01f5\u0005\u000f\u0000\u0000\u01e6\u01e7\u0005\u0002\u0000\u0000\u01e7"+
		"\u01f1\u0005\u000b\u0000\u0000\u01e8\u01e9\u0005(\u0000\u0000\u01e9\u01eb"+
		"\u0005\f\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f2\u0005"+
		"(\u0000\u0000\u01ef\u01f2\u0005(\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f1\u01ea\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f6\u0005\r\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f5\u01e6\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6\u0240\u0001\u0000\u0000\u0000\u01f7\u0207\u0005\u0010\u0000\u0000"+
		"\u01f8\u01f9\u0005\u0002\u0000\u0000\u01f9\u0203\u0005\u000b\u0000\u0000"+
		"\u01fa\u01fb\u0005*\u0000\u0000\u01fb\u01fd\u0005\f\u0000\u0000\u01fc"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200\u0204\u0005*\u0000\u0000\u0201\u0204"+
		"\u0005*\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u01fc\u0001"+
		"\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0202\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0208\u0005"+
		"\r\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u01f8\u0001\u0000"+
		"\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u0240\u0001\u0000"+
		"\u0000\u0000\u0209\u0219\u0005\u0011\u0000\u0000\u020a\u020b\u0005\u0002"+
		"\u0000\u0000\u020b\u0215\u0005\u000b\u0000\u0000\u020c\u020d\u0005)\u0000"+
		"\u0000\u020d\u020f\u0005\f\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212\u0216\u0005)\u0000\u0000\u0213\u0216\u0005)\u0000\u0000\u0214\u0216"+
		"\u0001\u0000\u0000\u0000\u0215\u020e\u0001\u0000\u0000\u0000\u0215\u0213"+
		"\u0001\u0000\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0001\u0000\u0000\u0000\u0217\u021a\u0005\r\u0000\u0000\u0218\u021a\u0001"+
		"\u0000\u0000\u0000\u0219\u020a\u0001\u0000\u0000\u0000\u0219\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u0240\u0001\u0000\u0000\u0000\u021b\u022b\u0005"+
		"\u0012\u0000\u0000\u021c\u021d\u0005\u0002\u0000\u0000\u021d\u0227\u0005"+
		"\u000b\u0000\u0000\u021e\u021f\u0005+\u0000\u0000\u021f\u0221\u0005\f"+
		"\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0228\u0005+\u0000"+
		"\u0000\u0225\u0228\u0005+\u0000\u0000\u0226\u0228\u0001\u0000\u0000\u0000"+
		"\u0227\u0220\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000"+
		"\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000"+
		"\u0229\u022c\u0005\r\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b"+
		"\u021c\u0001\u0000\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c"+
		"\u0240\u0001\u0000\u0000\u0000\u022d\u023d\u0005\u0013\u0000\u0000\u022e"+
		"\u022f\u0005\u0002\u0000\u0000\u022f\u0239\u0005\u000b\u0000\u0000\u0230"+
		"\u0231\u0005+\u0000\u0000\u0231\u0233\u0005\f\u0000\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0232"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u023a\u0005+\u0000\u0000\u0237\u023a\u0005"+
		"+\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239\u0232\u0001\u0000"+
		"\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u0238\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023e\u0005\r\u0000"+
		"\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u022e\u0001\u0000\u0000"+
		"\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000\u0000"+
		"\u0000\u023f\u01c1\u0001\u0000\u0000\u0000\u023f\u01d3\u0001\u0000\u0000"+
		"\u0000\u023f\u01e5\u0001\u0000\u0000\u0000\u023f\u01f7\u0001\u0000\u0000"+
		"\u0000\u023f\u0209\u0001\u0000\u0000\u0000\u023f\u021b\u0001\u0000\u0000"+
		"\u0000\u023f\u022d\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000"+
		"\u0000\u0241\u01be\u0001\u0000\u0000\u0000\u0241\u01c0\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0005\u0003\u0000"+
		"\u0000\u0244!\u0001\u0000\u0000\u0000\u0245\u024d\u0005\u0017\u0000\u0000"+
		"\u0246\u024e\u0005&\u0000\u0000\u0247\u024b\u0005,\u0000\u0000\u0248\u0249"+
		"\u0005\u0018\u0000\u0000\u0249\u024c\u0005,\u0000\u0000\u024a\u024c\u0001"+
		"\u0000\u0000\u0000\u024b\u0248\u0001\u0000\u0000\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024c\u024e\u0001\u0000\u0000\u0000\u024d\u0246\u0001"+
		"\u0000\u0000\u0000\u024d\u0247\u0001\u0000\u0000\u0000\u024e\u024f\u0001"+
		"\u0000\u0000\u0000\u024f\u0250\u0005\u0003\u0000\u0000\u0250#\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0005,\u0000\u0000\u0252\u0253\u0005\u0019\u0000"+
		"\u0000\u0253\u0254\u0005\u001a\u0000\u0000\u0254\u0255\u0005\u001b\u0000"+
		"\u0000\u0255\u0256\u0007\u0000\u0000\u0000\u0256\u0257\u0005\u001c\u0000"+
		"\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258%\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0005,\u0000\u0000\u025a\u025b\u0005\u0019\u0000\u0000\u025b"+
		"\u025c\u0005\u001d\u0000\u0000\u025c\u0288\u0005\u001b\u0000\u0000\u025d"+
		"\u0289\u0005,\u0000\u0000\u025e\u025f\u0005.\u0000\u0000\u025f\u0261\u0005"+
		"\f\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000"+
		"\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0289\u0005.\u0000"+
		"\u0000\u0265\u0266\u0005&\u0000\u0000\u0266\u0268\u0005\f\u0000\u0000"+
		"\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000"+
		"\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u0289\u0005&\u0000\u0000\u026c"+
		"\u026d\u0005(\u0000\u0000\u026d\u026f\u0005\f\u0000\u0000\u026e\u026c"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u026e"+
		"\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0001\u0000\u0000\u0000\u0272\u0289\u0005(\u0000\u0000\u0273\u0274\u0005"+
		"*\u0000\u0000\u0274\u0276\u0005\f\u0000\u0000\u0275\u0273\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000"+
		"\u0000\u0000\u0279\u0289\u0005*\u0000\u0000\u027a\u027b\u0005)\u0000\u0000"+
		"\u027b\u027d\u0005\f\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280"+
		"\u0289\u0005)\u0000\u0000\u0281\u0282\u0005+\u0000\u0000\u0282\u0284\u0005"+
		"\f\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0005+\u0000"+
		"\u0000\u0288\u025d\u0001\u0000\u0000\u0000\u0288\u0260\u0001\u0000\u0000"+
		"\u0000\u0288\u0267\u0001\u0000\u0000\u0000\u0288\u026e\u0001\u0000\u0000"+
		"\u0000\u0288\u0275\u0001\u0000\u0000\u0000\u0288\u027c\u0001\u0000\u0000"+
		"\u0000\u0288\u0283\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0005\u001c\u0000\u0000\u028b\u028c\u0005\u0003\u0000"+
		"\u0000\u028c\'\u0001\u0000\u0000\u0000\u028d\u028e\u0006\u0014\uffff\uffff"+
		"\u0000\u028e\u028f\u0003*\u0015\u0000\u028f\u0294\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\n\u0002\u0000\u0000\u0291\u0293\u0003*\u0015\u0000\u0292"+
		"\u0290\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294"+
		"\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295"+
		")\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u029c"+
		"\u0003,\u0016\u0000\u0298\u029c\u0003.\u0017\u0000\u0299\u029c\u00030"+
		"\u0018\u0000\u029a\u029c\u00032\u0019\u0000\u029b\u0297\u0001\u0000\u0000"+
		"\u0000\u029b\u0298\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c+\u0001\u0000\u0000\u0000"+
		"\u029d\u029e\u0005\u001e\u0000\u0000\u029e\u029f\u0005,\u0000\u0000\u029f"+
		"\u02a0\u0005\'\u0000\u0000\u02a0\u02a1\u0005&\u0000\u0000\u02a1\u02a2"+
		"\u0005\u000b\u0000\u0000\u02a2\u02a3\u0003\u0000\u0000\u0000\u02a3\u02a4"+
		"\u0005\r\u0000\u0000\u02a4-\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005"+
		"\u001f\u0000\u0000\u02a6\u02a7\u0005&\u0000\u0000\u02a7\u02a8\u0005 \u0000"+
		"\u0000\u02a8\u02a9\u0005&\u0000\u0000\u02a9\u02aa\u0005\u000b\u0000\u0000"+
		"\u02aa\u02ab\u0003\u0000\u0000\u0000\u02ab\u02ac\u0005\r\u0000\u0000\u02ac"+
		"/\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005!\u0000\u0000\u02ae\u02af\u0005"+
		",\u0000\u0000\u02af\u02b0\u0005 \u0000\u0000\u02b0\u02b1\u0005,\u0000"+
		"\u0000\u02b1\u02b2\u0005\u000b\u0000\u0000\u02b2\u02b3\u0003\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0005\r\u0000\u0000\u02b41\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b8\u0005\"\u0000\u0000\u02b6\u02b7\u0005 \u0000\u0000\u02b7"+
		"\u02b9\u0005,\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02cd"+
		"\u0005\u0003\u0000\u0000\u02bd\u02be\u0005\"\u0000\u0000\u02be\u02c3\u0005"+
		" \u0000\u0000\u02bf\u02c0\u0005,\u0000\u0000\u02c0\u02c4\u0005\f\u0000"+
		"\u0000\u02c1\u02c2\u0007\u0001\u0000\u0000\u02c2\u02c4\u0005\f\u0000\u0000"+
		"\u02c3\u02bf\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000"+
		"\u02c7\u02ca\u0005,\u0000\u0000\u02c8\u02ca\u0007\u0001\u0000\u0000\u02c9"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0005\u0003\u0000\u0000\u02cc"+
		"\u02b5\u0001\u0000\u0000\u0000\u02cc\u02bd\u0001\u0000\u0000\u0000\u02cd"+
		"3\u0001\u0000\u0000\u0000\u02ce\u02cf\u0005#\u0000\u0000\u02cf\u02d0\u0005"+
		",\u0000\u0000\u02d0\u02d1\u0005\u0003\u0000\u0000\u02d15\u0001\u0000\u0000"+
		"\u0000a9?AK_fox\u0081\u008a\u0093\u009b\u009e\u00a8\u00ad\u00b1\u00bd"+
		"\u00c2\u00c6\u00d2\u00d7\u00db\u00e7\u00ec\u00f0\u00fc\u0101\u0105\u0111"+
		"\u0116\u011a\u0125\u012a\u012e\u0131\u013f\u0144\u0148\u0151\u0156\u015a"+
		"\u0163\u0168\u016c\u0175\u017a\u017e\u0187\u018c\u0190\u0199\u019e\u01a2"+
		"\u01ab\u01b0\u01b4\u01b6\u01b8\u01c8\u01cd\u01d1\u01da\u01df\u01e3\u01ec"+
		"\u01f1\u01f5\u01fe\u0203\u0207\u0210\u0215\u0219\u0222\u0227\u022b\u0234"+
		"\u0239\u023d\u023f\u0241\u024b\u024d\u0262\u0269\u0270\u0277\u027e\u0285"+
		"\u0288\u0294\u029b\u02ba\u02c3\u02c5\u02c9\u02cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}