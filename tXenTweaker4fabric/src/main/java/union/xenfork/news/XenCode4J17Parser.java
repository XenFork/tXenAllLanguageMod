package union.xenfork.news;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XenCode4J17Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LINE_COMMENT=7, COMMENT=8, 
		WS=9, END=10, EVALUATION=11, MOVE=12, JUDGE=13, INT=14, FLOAT=15, DOUBLE=16, 
		LONG=17, BOOL=18, NAME=19, FILEDA=20, STRING=21;
	public static final int
		RULE_all = 0, RULE_union = 1, RULE_xenfork = 2, RULE_jh = 3, RULE_iv = 4, 
		RULE_iiv = 5, RULE_iiiv = 6, RULE_field = 7, RULE_move = 8, RULE_method = 9, 
		RULE_b = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"all", "union", "xenfork", "jh", "iv", "iiv", "iiiv", "field", "move", 
			"method", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'#'", "','", "'<<'", "'{'", "'}'", null, null, null, 
			"';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "LINE_COMMENT", "COMMENT", 
			"WS", "END", "EVALUATION", "MOVE", "JUDGE", "INT", "FLOAT", "DOUBLE", 
			"LONG", "BOOL", "NAME", "FILEDA", "STRING"
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

	public XenCode4J17Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllContext extends ParserRuleContext {
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				union();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 524326L) != 0 );
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
	public static class UnionContext extends ParserRuleContext {
		public XenforkContext xenfork() {
			return getRuleContext(XenforkContext.class,0);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			xenfork();
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
	public static class XenforkContext extends ParserRuleContext {
		public JhContext jh() {
			return getRuleContext(JhContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public XenforkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xenfork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterXenfork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitXenfork(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitXenfork(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XenforkContext xenfork() throws RecognitionException {
		XenforkContext _localctx = new XenforkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_xenfork);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				jh();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				method();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				field();
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
	public static class JhContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(XenCode4J17Parser.END, 0); }
		public List<IvContext> iv() {
			return getRuleContexts(IvContext.class);
		}
		public IvContext iv(int i) {
			return getRuleContext(IvContext.class,i);
		}
		public JhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterJh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitJh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitJh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JhContext jh() throws RecognitionException {
		JhContext _localctx = new JhContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jh);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					{
					setState(35);
					iv();
					setState(36);
					match(T__2);
					}
					}
					break;
				case 2:
					{
					setState(38);
					iv();
					}
					break;
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FILEDA );
			setState(43);
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
	public static class IvContext extends ParserRuleContext {
		public TerminalNode FILEDA() { return getToken(XenCode4J17Parser.FILEDA, 0); }
		public IivContext iiv() {
			return getRuleContext(IivContext.class,0);
		}
		public IvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterIv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitIv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitIv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IvContext iv() throws RecognitionException {
		IvContext _localctx = new IvContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iv);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(FILEDA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				iiv();
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
	public static class IivContext extends ParserRuleContext {
		public TerminalNode FILEDA() { return getToken(XenCode4J17Parser.FILEDA, 0); }
		public IiivContext iiiv() {
			return getRuleContext(IiivContext.class,0);
		}
		public IivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterIiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitIiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitIiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IivContext iiv() throws RecognitionException {
		IivContext _localctx = new IivContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FILEDA);
			setState(50);
			iiiv();
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
	public static class IiivContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XenCode4J17Parser.NAME, 0); }
		public IiivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iiiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterIiiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitIiiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitIiiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IiivContext iiiv() throws RecognitionException {
		IiivContext _localctx = new IiivContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iiiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(53);
			match(NAME);
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
		public Token pre;
		public Token sub;
		public TerminalNode END() { return getToken(XenCode4J17Parser.END, 0); }
		public List<TerminalNode> NAME() { return getTokens(XenCode4J17Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XenCode4J17Parser.NAME, i);
		}
		public TerminalNode EVALUATION() { return getToken(XenCode4J17Parser.EVALUATION, 0); }
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public TerminalNode INT() { return getToken(XenCode4J17Parser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(XenCode4J17Parser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(XenCode4J17Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(XenCode4J17Parser.STRING, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(XenCode4J17Parser.BOOL, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(55);
				((FieldContext)_localctx).pre = match(NAME);
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(59);
			((FieldContext)_localctx).sub = match(NAME);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVALUATION:
				{
				setState(60);
				match(EVALUATION);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(61);
					move();
					}
					break;
				case 2:
					{
					setState(62);
					match(NAME);
					}
					break;
				case 3:
					{
					setState(63);
					match(INT);
					}
					break;
				case 4:
					{
					setState(64);
					match(DOUBLE);
					}
					break;
				case 5:
					{
					setState(65);
					match(FLOAT);
					}
					break;
				case 6:
					{
					setState(66);
					match(STRING);
					}
					break;
				case 7:
					{
					setState(67);
					b();
					}
					break;
				case 8:
					{
					setState(68);
					match(BOOL);
					}
					break;
				case 9:
					{
					}
					break;
				}
				}
				break;
			case END:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
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
	public static class MoveContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(XenCode4J17Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCode4J17Parser.INT, i);
		}
		public TerminalNode MOVE() { return getToken(XenCode4J17Parser.MOVE, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(INT);
			setState(78);
			match(MOVE);
			setState(79);
			match(INT);
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
	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__4);
			setState(82);
			match(T__5);
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
	public static class BContext extends ParserRuleContext {
		public Token pre;
		public Token mid;
		public Token sub;
		public TerminalNode JUDGE() { return getToken(XenCode4J17Parser.JUDGE, 0); }
		public List<TerminalNode> STRING() { return getTokens(XenCode4J17Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XenCode4J17Parser.STRING, i);
		}
		public List<TerminalNode> NAME() { return getTokens(XenCode4J17Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XenCode4J17Parser.NAME, i);
		}
		public List<TerminalNode> INT() { return getTokens(XenCode4J17Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XenCode4J17Parser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(XenCode4J17Parser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(XenCode4J17Parser.DOUBLE, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(XenCode4J17Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(XenCode4J17Parser.FLOAT, i);
		}
		public List<TerminalNode> LONG() { return getTokens(XenCode4J17Parser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(XenCode4J17Parser.LONG, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(XenCode4J17Parser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(XenCode4J17Parser.BOOL, i);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XenCode4J17Listener ) ((XenCode4J17Listener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XenCode4J17Visitor) return ((XenCode4J17Visitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((BContext)_localctx).pre = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3129344L) != 0) ) {
				((BContext)_localctx).pre = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			((BContext)_localctx).mid = match(JUDGE);
			setState(86);
			((BContext)_localctx).sub = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3129344L) != 0) ) {
				((BContext)_localctx).sub = (Token)_errHandler.recoverInline(this);
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
		"\u0004\u0001\u0015Y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003(\b\u0003\u000b\u0003"+
		"\f\u0003)\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"0\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007:\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007G\b\u0007"+
		"\u0001\u0007\u0003\u0007J\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u000e\u0013"+
		"\u0015\u0015]\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000"+
		"\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000"+
		"\u0000\b/\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000\f4\u0001"+
		"\u0000\u0000\u0000\u000e9\u0001\u0000\u0000\u0000\u0010M\u0001\u0000\u0000"+
		"\u0000\u0012Q\u0001\u0000\u0000\u0000\u0014T\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0003\u0004\u0002\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"!\u0003\u0006\u0003\u0000\u001e!\u0003\u0012\t\u0000\u001f!\u0003\u000e"+
		"\u0007\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\"\'\u0007"+
		"\u0000\u0000\u0000#$\u0003\b\u0004\u0000$%\u0005\u0003\u0000\u0000%(\u0001"+
		"\u0000\u0000\u0000&(\u0003\b\u0004\u0000\'#\u0001\u0000\u0000\u0000\'"+
		"&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0005\n\u0000"+
		"\u0000,\u0007\u0001\u0000\u0000\u0000-0\u0005\u0014\u0000\u0000.0\u0003"+
		"\n\u0005\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\t"+
		"\u0001\u0000\u0000\u000012\u0005\u0014\u0000\u000023\u0003\f\u0006\u0000"+
		"3\u000b\u0001\u0000\u0000\u000045\u0005\u0004\u0000\u000056\u0005\u0013"+
		"\u0000\u00006\r\u0001\u0000\u0000\u00007:\u0005\u0013\u0000\u00008:\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;I\u0005\u0013\u0000\u0000<F\u0005\u000b\u0000"+
		"\u0000=G\u0003\u0010\b\u0000>G\u0005\u0013\u0000\u0000?G\u0005\u000e\u0000"+
		"\u0000@G\u0005\u0010\u0000\u0000AG\u0005\u000f\u0000\u0000BG\u0005\u0015"+
		"\u0000\u0000CG\u0003\u0014\n\u0000DG\u0005\u0012\u0000\u0000EG\u0001\u0000"+
		"\u0000\u0000F=\u0001\u0000\u0000\u0000F>\u0001\u0000\u0000\u0000F?\u0001"+
		"\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000"+
		"FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000I<\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0005\n\u0000\u0000L\u000f\u0001\u0000\u0000\u0000"+
		"MN\u0005\u000e\u0000\u0000NO\u0005\f\u0000\u0000OP\u0005\u000e\u0000\u0000"+
		"P\u0011\u0001\u0000\u0000\u0000QR\u0005\u0005\u0000\u0000RS\u0005\u0006"+
		"\u0000\u0000S\u0013\u0001\u0000\u0000\u0000TU\u0007\u0001\u0000\u0000"+
		"UV\u0005\r\u0000\u0000VW\u0007\u0001\u0000\u0000W\u0015\u0001\u0000\u0000"+
		"\u0000\b\u0019 \')/9FI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}