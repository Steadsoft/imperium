// Generated from d:\Git\GitHub\Steadsoft\imperium\grammar\Antlr\chev.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chevParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, NUMBER=2, COMMA=3, SPACE=4, NL=5;
	public static final int
		RULE_print_text = 0, RULE_print_set = 1, RULE_print_group = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"print_text", "print_set", "print_group"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "NUMBER", "COMMA", "SPACE", "NL"
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
	public String getGrammarFileName() { return "chev.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public chevParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Print_textContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(chevParser.EOF, 0); }
		public List<Print_groupContext> print_group() {
			return getRuleContexts(Print_groupContext.class);
		}
		public Print_groupContext print_group(int i) {
			return getRuleContext(Print_groupContext.class,i);
		}
		public Print_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_text; }
	}

	public final Print_textContext print_text() throws RecognitionException {
		Print_textContext _localctx = new Print_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_print_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				print_group();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT );
			setState(11);
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

	public static class Print_setContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(chevParser.PRINT, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(chevParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(chevParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(chevParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(chevParser.COMMA, i);
		}
		public Print_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_set; }
	}

	public final Print_setContext print_set() throws RecognitionException {
		Print_setContext _localctx = new Print_setContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_print_set);
		try {
			int _alt;
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(PRINT);
				setState(14);
				match(NUMBER);
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(15);
						match(COMMA);
						setState(16);
						match(NUMBER);
						}
						} 
					}
					setState(21);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(PRINT);
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

	public static class Print_groupContext extends ParserRuleContext {
		public List<Print_setContext> print_set() {
			return getRuleContexts(Print_setContext.class);
		}
		public Print_setContext print_set(int i) {
			return getRuleContext(Print_setContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(chevParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(chevParser.COMMA, i);
		}
		public Print_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_group; }
	}

	public final Print_groupContext print_group() throws RecognitionException {
		Print_groupContext _localctx = new Print_groupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			print_set();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(26);
				match(COMMA);
				setState(27);
				print_set();
				}
				}
				setState(32);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\3\3\3\3\3\3\3\7\3\24\n"+
		"\3\f\3\16\3\27\13\3\3\3\5\3\32\n\3\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13"+
		"\4\3\4\2\2\5\2\4\6\2\2\2$\2\t\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b\n\5"+
		"\6\4\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\r\3\2\2\2"+
		"\r\16\7\2\2\3\16\3\3\2\2\2\17\20\7\3\2\2\20\25\7\4\2\2\21\22\7\5\2\2\22"+
		"\24\7\4\2\2\23\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\32\3\2\2\2\27\25\3\2\2\2\30\32\7\3\2\2\31\17\3\2\2\2\31\30\3\2\2\2\32"+
		"\5\3\2\2\2\33 \5\4\3\2\34\35\7\5\2\2\35\37\5\4\3\2\36\34\3\2\2\2\37\""+
		"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\" \3\2\2\2\6\13\25\31 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}