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
public class ImperiumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, NEWLINE=4, TAB=5, BYTE_ORDER_MARK=6, 
		CALL=7, GOTO=8, GO=9, TO=10, PROCEDURE=11, PROC=12, END=13, DECLARE=14, 
		ARGUMENT=15, DEFINE=16, BINARY=17, DECIMAL=18, AUTOMATIC=19, BUILTIN=20, 
		INTRINSIC=21, STATIC=22, VARIABLE=23, BASED=24, DEFINED=25, INTERNAL=26, 
		EXTERNAL=27, RETURN=28, IF=29, THEN=30, ELSE=31, ELIF=32, RETURNS=33, 
		POINTER=34, BIT=35, CHARACTER=36, ENTRY=37, FIXED=38, FLOAT=39, OFFSET=40, 
		STRING=41, VARYING=42, COROUTINE=43, COFUNCTION=44, LOOP=45, WHILE=46, 
		UNTIL=47, ENDLOOP=48, RELOOP=49, INCLUDE=50, INC=51, BASE_B=52, BASE_O=53, 
		BASE_D=54, BASE_H=55, FRAC_B=56, FRAC_D=57, FRAC_O=58, FRAC_H=59, IDENTIFIER=60, 
		BINARY_PATTERN=61, OCTAL_PATTERN=62, HEXADECIMAL_PATTERN=63, DECIMAL_PATTERN=64, 
		LSEP=65, BIN=66, OCT=67, DEC=68, HEX=69, SHORT_OR=70, OR=71, AND=72, SHORT_AND=73, 
		ARROW=74, DOT=75, COMMA=76, LPAR=77, RPAR=78, LBRACK=79, RBRACK=80, LBRACE=81, 
		RBRACE=82, EQUALS=83, TIMES=84, DIVIDE=85, PLUS=86, MINUS=87, SEMICOLON=88, 
		POWER=89, COLON=90, DQUOTE=91, QUOTE=92, QMARK=93, PERCNT=94, TILDE=95, 
		CONC=96, GT=97, LT=98, GTE=99, LTE=100, TGT=101, TEQ=102, TLT=103, GTGT=104, 
		LTLT=105, GTGTGT=106, LTLTLT=107;
	public static final int
		RULE_translation_unit = 0, RULE_procedure_stmt = 1, RULE_stmt_block = 2, 
		RULE_terminator = 3, RULE_label_stmt = 4, RULE_nonexecutable_stmt = 5, 
		RULE_executable_stmt = 6, RULE_preprocessor_stmt = 7, RULE_assign_stmt = 8, 
		RULE_reference = 9, RULE_arguments = 10, RULE_arguments_list = 11, RULE_basic_reference = 12, 
		RULE_structure_qualification = 13, RULE_structure_qualification_list = 14, 
		RULE_subscript = 15, RULE_subscript_commalist = 16, RULE_expression = 17, 
		RULE_expression_9 = 18, RULE_expression_8 = 19, RULE_expression_7 = 20, 
		RULE_expression_6 = 21, RULE_expression_5 = 22, RULE_expression_4 = 23, 
		RULE_expression_3 = 24, RULE_expression_2 = 25, RULE_expression_1 = 26, 
		RULE_prefix_expression = 27, RULE_parenthesized_expression = 28, RULE_primitive_expression = 29, 
		RULE_prefix_operator = 30, RULE_comparison_operator = 31, RULE_shift_operator = 32, 
		RULE_identifier = 33, RULE_keyword = 34, RULE_call_stmt = 35, RULE_goto_stmt = 36, 
		RULE_end_stmt = 37, RULE_endloop_stmt = 38, RULE_reloop_stmt = 39, RULE_declare_stmt = 40, 
		RULE_type_info = 41, RULE_dimension_suffix = 42, RULE_bound_pair = 43, 
		RULE_bound_pair_commalist = 44, RULE_lower_bound = 45, RULE_upper_bound = 46, 
		RULE_attribute = 47, RULE_data_attribute = 48, RULE_precision = 49, RULE_number_of_digits = 50, 
		RULE_scale_factor = 51, RULE_max_length = 52, RULE_based = 53, RULE_defined = 54, 
		RULE_entry_information = 55, RULE_coprocedure_specifier = 56, RULE_parameter_name_commalist = 57, 
		RULE_returns_descriptor = 58, RULE_return_stmt = 59, RULE_if_stmt = 60, 
		RULE_then_clause = 61, RULE_else_clause = 62, RULE_elif_clause = 63, RULE_loop_stmt = 64, 
		RULE_while_option = 65, RULE_until_option = 66, RULE_define_stmt = 67, 
		RULE_numeric_literal = 68, RULE_hexadecimal_literal = 69, RULE_octal_literal = 70, 
		RULE_decimal_literal = 71, RULE_binary_literal = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"translation_unit", "procedure_stmt", "stmt_block", "terminator", "label_stmt", 
			"nonexecutable_stmt", "executable_stmt", "preprocessor_stmt", "assign_stmt", 
			"reference", "arguments", "arguments_list", "basic_reference", "structure_qualification", 
			"structure_qualification_list", "subscript", "subscript_commalist", "expression", 
			"expression_9", "expression_8", "expression_7", "expression_6", "expression_5", 
			"expression_4", "expression_3", "expression_2", "expression_1", "prefix_expression", 
			"parenthesized_expression", "primitive_expression", "prefix_operator", 
			"comparison_operator", "shift_operator", "identifier", "keyword", "call_stmt", 
			"goto_stmt", "end_stmt", "endloop_stmt", "reloop_stmt", "declare_stmt", 
			"type_info", "dimension_suffix", "bound_pair", "bound_pair_commalist", 
			"lower_bound", "upper_bound", "attribute", "data_attribute", "precision", 
			"number_of_digits", "scale_factor", "max_length", "based", "defined", 
			"entry_information", "coprocedure_specifier", "parameter_name_commalist", 
			"returns_descriptor", "return_stmt", "if_stmt", "then_clause", "else_clause", 
			"elif_clause", "loop_stmt", "while_option", "until_option", "define_stmt", 
			"numeric_literal", "hexadecimal_literal", "octal_literal", "decimal_literal", 
			"binary_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'?|'", "'|'", 
			"'&'", "'?&'", "'->'", "'.'", "','", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'='", "'*'", "'/'", "'+'", "'-'", "';'", "'**'", "':'", "'\"'", 
			"'''", "'?'", "'%'", "'~'", "'||'", "'>'", "'<'", "'>='", "'<='", "'~>'", 
			"'~='", "'<~'", "'>>'", "'<<'", "'>>>'", "'<<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "NEWLINE", "TAB", "BYTE_ORDER_MARK", 
			"CALL", "GOTO", "GO", "TO", "PROCEDURE", "PROC", "END", "DECLARE", "ARGUMENT", 
			"DEFINE", "BINARY", "DECIMAL", "AUTOMATIC", "BUILTIN", "INTRINSIC", "STATIC", 
			"VARIABLE", "BASED", "DEFINED", "INTERNAL", "EXTERNAL", "RETURN", "IF", 
			"THEN", "ELSE", "ELIF", "RETURNS", "POINTER", "BIT", "CHARACTER", "ENTRY", 
			"FIXED", "FLOAT", "OFFSET", "STRING", "VARYING", "COROUTINE", "COFUNCTION", 
			"LOOP", "WHILE", "UNTIL", "ENDLOOP", "RELOOP", "INCLUDE", "INC", "BASE_B", 
			"BASE_O", "BASE_D", "BASE_H", "FRAC_B", "FRAC_D", "FRAC_O", "FRAC_H", 
			"IDENTIFIER", "BINARY_PATTERN", "OCTAL_PATTERN", "HEXADECIMAL_PATTERN", 
			"DECIMAL_PATTERN", "LSEP", "BIN", "OCT", "DEC", "HEX", "SHORT_OR", "OR", 
			"AND", "SHORT_AND", "ARROW", "DOT", "COMMA", "LPAR", "RPAR", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "EQUALS", "TIMES", "DIVIDE", "PLUS", "MINUS", 
			"SEMICOLON", "POWER", "COLON", "DQUOTE", "QUOTE", "QMARK", "PERCNT", 
			"TILDE", "CONC", "GT", "LT", "GTE", "LTE", "TGT", "TEQ", "TLT", "GTGT", 
			"LTLT", "GTGTGT", "LTLTLT"
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

	public ImperiumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Translation_unitContext extends ParserRuleContext {
		public Procedure_stmtContext procedure_stmt() {
			return getRuleContext(Procedure_stmtContext.class,0);
		}
		public TerminalNode BYTE_ORDER_MARK() { return getToken(ImperiumParser.BYTE_ORDER_MARK, 0); }
		public Preprocessor_stmtContext preprocessor_stmt() {
			return getRuleContext(Preprocessor_stmtContext.class,0);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitTranslation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitTranslation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(146);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERCNT) {
				{
				setState(149);
				preprocessor_stmt();
				}
			}

			setState(152);
			procedure_stmt();
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
	public static class Procedure_stmtContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Entry_informationContext entry_information() {
			return getRuleContext(Entry_informationContext.class,0);
		}
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public End_stmtContext end_stmt() {
			return getRuleContext(End_stmtContext.class,0);
		}
		public Procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterProcedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitProcedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitProcedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_stmtContext procedure_stmt() throws RecognitionException {
		Procedure_stmtContext _localctx = new Procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PROCEDURE);
			setState(155);
			identifier();
			setState(156);
			entry_information();
			setState(157);
			stmt_block();
			setState(158);
			end_stmt();
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
	public static class Stmt_blockContext extends ParserRuleContext {
		public List<Nonexecutable_stmtContext> nonexecutable_stmt() {
			return getRuleContexts(Nonexecutable_stmtContext.class);
		}
		public Nonexecutable_stmtContext nonexecutable_stmt(int i) {
			return getRuleContext(Nonexecutable_stmtContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public List<Executable_stmtContext> executable_stmt() {
			return getRuleContexts(Executable_stmtContext.class);
		}
		public Executable_stmtContext executable_stmt(int i) {
			return getRuleContext(Executable_stmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt_block);
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
			case IDENTIFIER:
			case LBRACE:
			case PERCNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						nonexecutable_stmt();
						setState(161);
						terminator();
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(168);
						executable_stmt();
						setState(169);
						terminator();
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				terminator();
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
	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(SEMICOLON);
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
	public static class Label_stmtContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ImperiumParser.LBRACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImperiumParser.RBRACE, 0); }
		public Label_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterLabel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitLabel_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitLabel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_stmtContext label_stmt() throws RecognitionException {
		Label_stmtContext _localctx = new Label_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LBRACE);
			setState(182);
			identifier();
			setState(183);
			match(RBRACE);
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
	public static class Nonexecutable_stmtContext extends ParserRuleContext {
		public Nonexecutable_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonexecutable_stmt; }
	 
		public Nonexecutable_stmtContext() { }
		public void copyFrom(Nonexecutable_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PREContext extends Nonexecutable_stmtContext {
		public Preprocessor_stmtContext preprocessor_stmt() {
			return getRuleContext(Preprocessor_stmtContext.class,0);
		}
		public PREContext(Nonexecutable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPRE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPRE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPRE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DEFContext extends Nonexecutable_stmtContext {
		public Define_stmtContext define_stmt() {
			return getRuleContext(Define_stmtContext.class,0);
		}
		public DEFContext(Nonexecutable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDEF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDEF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDEF(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DCLContext extends Nonexecutable_stmtContext {
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public DCLContext(Nonexecutable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDCL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDCL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDCL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonexecutable_stmtContext nonexecutable_stmt() throws RecognitionException {
		Nonexecutable_stmtContext _localctx = new Nonexecutable_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonexecutable_stmt);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERCNT:
				_localctx = new PREContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				preprocessor_stmt();
				}
				break;
			case DECLARE:
			case ARGUMENT:
				_localctx = new DCLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				declare_stmt();
				}
				break;
			case DEFINE:
				_localctx = new DEFContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				define_stmt();
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
	public static class Executable_stmtContext extends ParserRuleContext {
		public Executable_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executable_stmt; }
	 
		public Executable_stmtContext() { }
		public void copyFrom(Executable_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RETContext extends Executable_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public RETContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterRET(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitRET(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitRET(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CALLContext extends Executable_stmtContext {
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public CALLContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterCALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitCALL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitCALL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GOTOContext extends Executable_stmtContext {
		public Goto_stmtContext goto_stmt() {
			return getRuleContext(Goto_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public GOTOContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterGOTO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitGOTO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitGOTO(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PROCContext extends Executable_stmtContext {
		public Procedure_stmtContext procedure_stmt() {
			return getRuleContext(Procedure_stmtContext.class,0);
		}
		public PROCContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPROC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPROC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPROC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AGAINContext extends Executable_stmtContext {
		public Reloop_stmtContext reloop_stmt() {
			return getRuleContext(Reloop_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public AGAINContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterAGAIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitAGAIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitAGAIN(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LOOPContext extends Executable_stmtContext {
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public LOOPContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitLOOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitLOOP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LEAVEContext extends Executable_stmtContext {
		public Endloop_stmtContext endloop_stmt() {
			return getRuleContext(Endloop_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public LEAVEContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterLEAVE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitLEAVE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitLEAVE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ASSIGNContext extends Executable_stmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public ASSIGNContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterASSIGN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitASSIGN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitASSIGN(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IFContext extends Executable_stmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public IFContext(Executable_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Executable_stmtContext executable_stmt() throws RecognitionException {
		Executable_stmtContext _localctx = new Executable_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_executable_stmt);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ASSIGNContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(190);
					label_stmt();
					}
				}

				setState(193);
				assign_stmt();
				}
				break;
			case 2:
				_localctx = new CALLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(194);
					label_stmt();
					}
				}

				setState(197);
				call_stmt();
				}
				break;
			case 3:
				_localctx = new GOTOContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(198);
					label_stmt();
					}
				}

				setState(201);
				goto_stmt();
				}
				break;
			case 4:
				_localctx = new PROCContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				procedure_stmt();
				}
				break;
			case 5:
				_localctx = new RETContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(203);
					label_stmt();
					}
				}

				setState(206);
				return_stmt();
				}
				break;
			case 6:
				_localctx = new IFContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(207);
					label_stmt();
					}
				}

				setState(210);
				if_stmt();
				}
				break;
			case 7:
				_localctx = new LOOPContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(211);
					label_stmt();
					}
				}

				setState(214);
				loop_stmt();
				}
				break;
			case 8:
				_localctx = new LEAVEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(215);
					label_stmt();
					}
				}

				setState(218);
				endloop_stmt();
				}
				break;
			case 9:
				_localctx = new AGAINContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(219);
					label_stmt();
					}
				}

				setState(222);
				reloop_stmt();
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
	public static class Preprocessor_stmtContext extends ParserRuleContext {
		public TerminalNode PERCNT() { return getToken(ImperiumParser.PERCNT, 0); }
		public TerminalNode INCLUDE() { return getToken(ImperiumParser.INCLUDE, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(ImperiumParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(ImperiumParser.QUOTE, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ImperiumParser.DOT, 0); }
		public TerminalNode INC() { return getToken(ImperiumParser.INC, 0); }
		public Preprocessor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPreprocessor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPreprocessor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPreprocessor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Preprocessor_stmtContext preprocessor_stmt() throws RecognitionException {
		Preprocessor_stmtContext _localctx = new Preprocessor_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_preprocessor_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(PERCNT);
			setState(226);
			match(INCLUDE);
			setState(227);
			match(QUOTE);
			setState(228);
			identifier();
			setState(229);
			match(DOT);
			setState(230);
			match(INC);
			setState(231);
			match(QUOTE);
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
	public static class Assign_stmtContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(ImperiumParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			reference(0);
			setState(234);
			match(EQUALS);
			setState(235);
			expression(0);
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
	public static class ReferenceContext extends ParserRuleContext {
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	 
		public ReferenceContext() { }
		public void copyFrom(ReferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BASIC_REFContext extends ReferenceContext {
		public Basic_referenceContext basic_reference() {
			return getRuleContext(Basic_referenceContext.class,0);
		}
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public BASIC_REFContext(ReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBASIC_REF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBASIC_REF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBASIC_REF(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PTR_REFContext extends ReferenceContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ImperiumParser.ARROW, 0); }
		public Basic_referenceContext basic_reference() {
			return getRuleContext(Basic_referenceContext.class,0);
		}
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public PTR_REFContext(ReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPTR_REF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPTR_REF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPTR_REF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		return reference(0);
	}

	private ReferenceContext reference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReferenceContext _localctx = new ReferenceContext(_ctx, _parentState);
		ReferenceContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_reference, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BASIC_REFContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(238);
			basic_reference();
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(239);
				arguments_list();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PTR_REFContext(new ReferenceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_reference);
					setState(242);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(243);
					match(ARROW);
					setState(244);
					basic_reference();
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(245);
						arguments_list();
						}
						break;
					}
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public List<Subscript_commalistContext> subscript_commalist() {
			return getRuleContexts(Subscript_commalistContext.class);
		}
		public Subscript_commalistContext subscript_commalist(int i) {
			return getRuleContext(Subscript_commalistContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LPAR);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				subscript_commalist();
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & -1151795604965163136L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2160074753L) != 0 );
			setState(259);
			match(RPAR);
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
	public static class Arguments_listContext extends ParserRuleContext {
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public Arguments_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterArguments_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitArguments_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitArguments_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_listContext arguments_list() throws RecognitionException {
		Arguments_listContext _localctx = new Arguments_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(261);
					arguments();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Basic_referenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Structure_qualification_listContext structure_qualification_list() {
			return getRuleContext(Structure_qualification_listContext.class,0);
		}
		public Basic_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBasic_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBasic_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBasic_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_referenceContext basic_reference() throws RecognitionException {
		Basic_referenceContext _localctx = new Basic_referenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basic_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(266);
				structure_qualification_list();
				}
				break;
			}
			setState(269);
			identifier();
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
	public static class Structure_qualificationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ImperiumParser.DOT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Structure_qualificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_qualification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterStructure_qualification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitStructure_qualification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitStructure_qualification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_qualificationContext structure_qualification() throws RecognitionException {
		Structure_qualificationContext _localctx = new Structure_qualificationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_structure_qualification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			identifier();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(272);
				arguments();
				}
			}

			setState(275);
			match(DOT);
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
	public static class Structure_qualification_listContext extends ParserRuleContext {
		public List<Structure_qualificationContext> structure_qualification() {
			return getRuleContexts(Structure_qualificationContext.class);
		}
		public Structure_qualificationContext structure_qualification(int i) {
			return getRuleContext(Structure_qualificationContext.class,i);
		}
		public Structure_qualification_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_qualification_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterStructure_qualification_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitStructure_qualification_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitStructure_qualification_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_qualification_listContext structure_qualification_list() throws RecognitionException {
		Structure_qualification_listContext _localctx = new Structure_qualification_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structure_qualification_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(277);
					structure_qualification();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(280); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SubscriptContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression(0);
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
	public static class Subscript_commalistContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public Subscript_commalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_commalist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterSubscript_commalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitSubscript_commalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitSubscript_commalist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_commalistContext subscript_commalist() throws RecognitionException {
		Subscript_commalistContext _localctx = new Subscript_commalistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subscript_commalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			subscript();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285);
				match(COMMA);
				setState(286);
				subscript();
				}
				}
				setState(291);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression_9Context expression_9() {
			return getRuleContext(Expression_9Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SHORT_OR() { return getToken(ImperiumParser.SHORT_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			expression_9(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(295);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(296);
					match(SHORT_OR);
					setState(297);
					expression_9(0);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class Expression_9Context extends ParserRuleContext {
		public Expression_8Context expression_8() {
			return getRuleContext(Expression_8Context.class,0);
		}
		public Expression_9Context expression_9() {
			return getRuleContext(Expression_9Context.class,0);
		}
		public TerminalNode SHORT_AND() { return getToken(ImperiumParser.SHORT_AND, 0); }
		public Expression_9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_9Context expression_9() throws RecognitionException {
		return expression_9(0);
	}

	private Expression_9Context expression_9(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_9Context _localctx = new Expression_9Context(_ctx, _parentState);
		Expression_9Context _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression_9, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			expression_8(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_9Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_9);
					setState(306);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(307);
					match(SHORT_AND);
					setState(308);
					expression_8(0);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class Expression_8Context extends ParserRuleContext {
		public Expression_7Context expression_7() {
			return getRuleContext(Expression_7Context.class,0);
		}
		public Expression_8Context expression_8() {
			return getRuleContext(Expression_8Context.class,0);
		}
		public TerminalNode OR() { return getToken(ImperiumParser.OR, 0); }
		public TerminalNode TILDE() { return getToken(ImperiumParser.TILDE, 0); }
		public Expression_8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_8Context expression_8() throws RecognitionException {
		return expression_8(0);
	}

	private Expression_8Context expression_8(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_8Context _localctx = new Expression_8Context(_ctx, _parentState);
		Expression_8Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression_8, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(315);
			expression_7(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_8Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_8);
					setState(317);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(318);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==TILDE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(319);
					expression_7(0);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class Expression_7Context extends ParserRuleContext {
		public Expression_6Context expression_6() {
			return getRuleContext(Expression_6Context.class,0);
		}
		public Expression_7Context expression_7() {
			return getRuleContext(Expression_7Context.class,0);
		}
		public TerminalNode AND() { return getToken(ImperiumParser.AND, 0); }
		public Expression_7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_7Context expression_7() throws RecognitionException {
		return expression_7(0);
	}

	private Expression_7Context expression_7(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_7Context _localctx = new Expression_7Context(_ctx, _parentState);
		Expression_7Context _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression_7, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			expression_6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_7Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_7);
					setState(328);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(329);
					match(AND);
					setState(330);
					expression_6(0);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class Expression_6Context extends ParserRuleContext {
		public Expression_5Context expression_5() {
			return getRuleContext(Expression_5Context.class,0);
		}
		public Expression_6Context expression_6() {
			return getRuleContext(Expression_6Context.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Expression_6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_6Context expression_6() throws RecognitionException {
		return expression_6(0);
	}

	private Expression_6Context expression_6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_6Context _localctx = new Expression_6Context(_ctx, _parentState);
		Expression_6Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression_6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(337);
			expression_5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_6Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_6);
					setState(339);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(340);
					comparison_operator();
					setState(341);
					expression_5(0);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class Expression_5Context extends ParserRuleContext {
		public Expression_4Context expression_4() {
			return getRuleContext(Expression_4Context.class,0);
		}
		public Expression_5Context expression_5() {
			return getRuleContext(Expression_5Context.class,0);
		}
		public TerminalNode CONC() { return getToken(ImperiumParser.CONC, 0); }
		public Expression_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_5Context expression_5() throws RecognitionException {
		return expression_5(0);
	}

	private Expression_5Context expression_5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_5Context _localctx = new Expression_5Context(_ctx, _parentState);
		Expression_5Context _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression_5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			expression_4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_5);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					match(CONC);
					setState(353);
					expression_4(0);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class Expression_4Context extends ParserRuleContext {
		public Expression_3Context expression_3() {
			return getRuleContext(Expression_3Context.class,0);
		}
		public Expression_4Context expression_4() {
			return getRuleContext(Expression_4Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public Expression_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_4Context expression_4() throws RecognitionException {
		return expression_4(0);
	}

	private Expression_4Context expression_4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_4Context _localctx = new Expression_4Context(_ctx, _parentState);
		Expression_4Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression_4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(360);
			expression_3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_4);
					setState(362);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(363);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(364);
					expression_3(0);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class Expression_3Context extends ParserRuleContext {
		public Expression_2Context expression_2() {
			return getRuleContext(Expression_2Context.class,0);
		}
		public Expression_3Context expression_3() {
			return getRuleContext(Expression_3Context.class,0);
		}
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(ImperiumParser.DIVIDE, 0); }
		public Expression_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_3Context expression_3() throws RecognitionException {
		return expression_3(0);
	}

	private Expression_3Context expression_3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_3Context _localctx = new Expression_3Context(_ctx, _parentState);
		Expression_3Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression_3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371);
			expression_2();
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_3);
					setState(373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(374);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVIDE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(375);
					expression_2();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class Expression_2Context extends ParserRuleContext {
		public Primitive_expressionContext primitive_expression() {
			return getRuleContext(Primitive_expressionContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Expression_1Context expression_1() {
			return getRuleContext(Expression_1Context.class,0);
		}
		public Expression_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_2Context expression_2() throws RecognitionException {
		Expression_2Context _localctx = new Expression_2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression_2);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				primitive_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				parenthesized_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				expression_1();
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
	public static class Expression_1Context extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(ImperiumParser.POWER, 0); }
		public Expression_2Context expression_2() {
			return getRuleContext(Expression_2Context.class,0);
		}
		public Primitive_expressionContext primitive_expression() {
			return getRuleContext(Primitive_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Expression_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterExpression_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitExpression_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitExpression_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_1Context expression_1() throws RecognitionException {
		Expression_1Context _localctx = new Expression_1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
			case IDENTIFIER:
			case BINARY_PATTERN:
			case OCTAL_PATTERN:
			case HEXADECIMAL_PATTERN:
			case DECIMAL_PATTERN:
				{
				setState(387);
				primitive_expression();
				}
				break;
			case LPAR:
				{
				setState(388);
				parenthesized_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(391);
			match(POWER);
			setState(392);
			expression_2();
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
	public static class Prefix_expressionContext extends ParserRuleContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Expression_2Context expression_2() {
			return getRuleContext(Expression_2Context.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPrefix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPrefix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_prefix_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			prefix_operator();
			setState(395);
			expression_2();
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
	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(LPAR);
			setState(398);
			expression(0);
			setState(399);
			match(RPAR);
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
	public static class Primitive_expressionContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Primitive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPrimitive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPrimitive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPrimitive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_expressionContext primitive_expression() throws RecognitionException {
		Primitive_expressionContext _localctx = new Primitive_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primitive_expression);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_PATTERN:
			case OCTAL_PATTERN:
			case HEXADECIMAL_PATTERN:
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				numeric_literal();
				}
				break;
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				reference(0);
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
	public static class Prefix_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(ImperiumParser.TILDE, 0); }
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPrefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_prefix_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 515L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ImperiumParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ImperiumParser.GTE, 0); }
		public TerminalNode EQUALS() { return getToken(ImperiumParser.EQUALS, 0); }
		public TerminalNode LT() { return getToken(ImperiumParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ImperiumParser.LTE, 0); }
		public TerminalNode TGT() { return getToken(ImperiumParser.TGT, 0); }
		public TerminalNode TEQ() { return getToken(ImperiumParser.TEQ, 0); }
		public TerminalNode TLT() { return getToken(ImperiumParser.TLT, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 2080769L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode GTGT() { return getToken(ImperiumParser.GTGT, 0); }
		public TerminalNode LTLT() { return getToken(ImperiumParser.LTLT, 0); }
		public TerminalNode GTGTGT() { return getToken(ImperiumParser.GTGTGT, 0); }
		public TerminalNode LTLTLT() { return getToken(ImperiumParser.LTLTLT, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterShift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitShift_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitShift_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if ( !((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 15L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_IDENTIFIERContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public Identifier_IDENTIFIERContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterIdentifier_IDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitIdentifier_IDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitIdentifier_IDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KEYWDContext extends IdentifierContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public KEYWDContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterKEYWD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitKEYWD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitKEYWD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
				_localctx = new KEYWDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				keyword();
				}
				break;
			case IDENTIFIER:
				_localctx = new Identifier_IDENTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(IDENTIFIER);
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
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public TerminalNode GOTO() { return getToken(ImperiumParser.GOTO, 0); }
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public TerminalNode PROC() { return getToken(ImperiumParser.PROC, 0); }
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode DEFINE() { return getToken(ImperiumParser.DEFINE, 0); }
		public TerminalNode RETURN() { return getToken(ImperiumParser.RETURN, 0); }
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public TerminalNode ELIF() { return getToken(ImperiumParser.ELIF, 0); }
		public TerminalNode GO() { return getToken(ImperiumParser.GO, 0); }
		public TerminalNode TO() { return getToken(ImperiumParser.TO, 0); }
		public TerminalNode RETURNS() { return getToken(ImperiumParser.RETURNS, 0); }
		public TerminalNode ARGUMENT() { return getToken(ImperiumParser.ARGUMENT, 0); }
		public TerminalNode POINTER() { return getToken(ImperiumParser.POINTER, 0); }
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public TerminalNode CHARACTER() { return getToken(ImperiumParser.CHARACTER, 0); }
		public TerminalNode ENTRY() { return getToken(ImperiumParser.ENTRY, 0); }
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public TerminalNode OFFSET() { return getToken(ImperiumParser.OFFSET, 0); }
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public TerminalNode VARYING() { return getToken(ImperiumParser.VARYING, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(ImperiumParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(ImperiumParser.UNTIL, 0); }
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899641683840L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitCall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(CALL);
			setState(418);
			reference(0);
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
	public static class Goto_stmtContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(ImperiumParser.GOTO, 0); }
		public TerminalNode GO() { return getToken(ImperiumParser.GO, 0); }
		public TerminalNode TO() { return getToken(ImperiumParser.TO, 0); }
		public Goto_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterGoto_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitGoto_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitGoto_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_stmtContext goto_stmt() throws RecognitionException {
		Goto_stmtContext _localctx = new Goto_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_goto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(420);
				match(GOTO);
				}
				break;
			case GO:
				{
				setState(421);
				match(GO);
				setState(422);
				match(TO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(425);
			reference(0);
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
	public static class End_stmtContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public End_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterEnd_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitEnd_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitEnd_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_stmtContext end_stmt() throws RecognitionException {
		End_stmtContext _localctx = new End_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_end_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
	public static class Endloop_stmtContext extends ParserRuleContext {
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public Endloop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endloop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterEndloop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitEndloop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitEndloop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endloop_stmtContext endloop_stmt() throws RecognitionException {
		Endloop_stmtContext _localctx = new Endloop_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_endloop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(ENDLOOP);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(430);
				match(IDENTIFIER);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Reloop_stmtContext extends ParserRuleContext {
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public Reloop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterReloop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitReloop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitReloop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reloop_stmtContext reloop_stmt() throws RecognitionException {
		Reloop_stmtContext _localctx = new Reloop_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_reloop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(RELOOP);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(434);
				match(IDENTIFIER);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_infoContext type_info() {
			return getRuleContext(Type_infoContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode ARGUMENT() { return getToken(ImperiumParser.ARGUMENT, 0); }
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDeclare_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declare_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==DECLARE || _la==ARGUMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(438);
			identifier();
			setState(439);
			type_info();
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
	public static class Type_infoContext extends ParserRuleContext {
		public Dimension_suffixContext dimension_suffix() {
			return getRuleContext(Dimension_suffixContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Type_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterType_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitType_info(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitType_info(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_infoContext type_info() throws RecognitionException {
		Type_infoContext _localctx = new Type_infoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(441);
				dimension_suffix();
				}
			}

			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 35167259197440L) != 0) {
				{
				{
				setState(444);
				attribute();
				}
				}
				setState(449);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dimension_suffixContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public Bound_pair_commalistContext bound_pair_commalist() {
			return getRuleContext(Bound_pair_commalistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public Dimension_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDimension_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDimension_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDimension_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimension_suffixContext dimension_suffix() throws RecognitionException {
		Dimension_suffixContext _localctx = new Dimension_suffixContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dimension_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(LPAR);
			setState(451);
			bound_pair_commalist();
			setState(452);
			match(RPAR);
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
	public static class Bound_pairContext extends ParserRuleContext {
		public Upper_boundContext upper_bound() {
			return getRuleContext(Upper_boundContext.class,0);
		}
		public Lower_boundContext lower_bound() {
			return getRuleContext(Lower_boundContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ImperiumParser.COLON, 0); }
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public Bound_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBound_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBound_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBound_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bound_pairContext bound_pair() throws RecognitionException {
		Bound_pairContext _localctx = new Bound_pairContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bound_pair);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
			case IDENTIFIER:
			case BINARY_PATTERN:
			case OCTAL_PATTERN:
			case HEXADECIMAL_PATTERN:
			case DECIMAL_PATTERN:
			case LPAR:
			case PLUS:
			case MINUS:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(454);
					lower_bound();
					setState(455);
					match(COLON);
					}
					break;
				}
				setState(459);
				upper_bound();
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(TIMES);
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
	public static class Bound_pair_commalistContext extends ParserRuleContext {
		public List<Bound_pairContext> bound_pair() {
			return getRuleContexts(Bound_pairContext.class);
		}
		public Bound_pairContext bound_pair(int i) {
			return getRuleContext(Bound_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public Bound_pair_commalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound_pair_commalist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBound_pair_commalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBound_pair_commalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBound_pair_commalist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bound_pair_commalistContext bound_pair_commalist() throws RecognitionException {
		Bound_pair_commalistContext _localctx = new Bound_pair_commalistContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bound_pair_commalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			bound_pair();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464);
				match(COMMA);
				setState(465);
				bound_pair();
				}
				}
				setState(470);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lower_boundContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lower_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterLower_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitLower_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitLower_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lower_boundContext lower_bound() throws RecognitionException {
		Lower_boundContext _localctx = new Lower_boundContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lower_bound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			expression(0);
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
	public static class Upper_boundContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Upper_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterUpper_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitUpper_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitUpper_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Upper_boundContext upper_bound() throws RecognitionException {
		Upper_boundContext _localctx = new Upper_boundContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_upper_bound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			expression(0);
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
	public static class AttributeContext extends ParserRuleContext {
		public Data_attributeContext data_attribute() {
			return getRuleContext(Data_attributeContext.class,0);
		}
		public TerminalNode AUTOMATIC() { return getToken(ImperiumParser.AUTOMATIC, 0); }
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public TerminalNode STATIC() { return getToken(ImperiumParser.STATIC, 0); }
		public TerminalNode VARIABLE() { return getToken(ImperiumParser.VARIABLE, 0); }
		public BasedContext based() {
			return getRuleContext(BasedContext.class,0);
		}
		public DefinedContext defined() {
			return getRuleContext(DefinedContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(475);
				data_attribute();
				}
				break;
			case 2:
				{
				setState(476);
				match(AUTOMATIC);
				}
				break;
			case 3:
				{
				setState(477);
				match(BUILTIN);
				}
				break;
			case 4:
				{
				setState(478);
				match(STATIC);
				}
				break;
			case 5:
				{
				setState(479);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				setState(480);
				based();
				}
				break;
			case 7:
				{
				setState(481);
				defined();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_attributeContext extends ParserRuleContext {
		public Data_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_attribute; }
	 
		public Data_attributeContext() { }
		public void copyFrom(Data_attributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INTRContext extends Data_attributeContext {
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public INTRContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterINTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitINTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitINTR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DECContext extends Data_attributeContext {
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public DECContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDEC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDEC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BINContext extends Data_attributeContext {
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public BINContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBIN(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CORContext extends Data_attributeContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public CORContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterCOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitCOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitCOR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CHARContext extends Data_attributeContext {
		public TerminalNode CHARACTER() { return getToken(ImperiumParser.CHARACTER, 0); }
		public CHARContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterCHAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitCHAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitCHAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ENTContext extends Data_attributeContext {
		public TerminalNode ENTRY() { return getToken(ImperiumParser.ENTRY, 0); }
		public ENTContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitENT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BITContext extends Data_attributeContext {
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public Max_lengthContext max_length() {
			return getRuleContext(Max_lengthContext.class,0);
		}
		public BITContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBIT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBIT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBIT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OFFContext extends Data_attributeContext {
		public TerminalNode OFFSET() { return getToken(ImperiumParser.OFFSET, 0); }
		public OFFContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterOFF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitOFF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitOFF(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VNGContext extends Data_attributeContext {
		public TerminalNode VARYING() { return getToken(ImperiumParser.VARYING, 0); }
		public VNGContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterVNG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitVNG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitVNG(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PTRContext extends Data_attributeContext {
		public TerminalNode POINTER() { return getToken(ImperiumParser.POINTER, 0); }
		public PTRContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPTR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FLTContext extends Data_attributeContext {
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public FLTContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterFLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitFLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitFLT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STRContext extends Data_attributeContext {
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public Max_lengthContext max_length() {
			return getRuleContext(Max_lengthContext.class,0);
		}
		public STRContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitSTR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FIXContext extends Data_attributeContext {
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public FIXContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterFIX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitFIX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitFIX(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class COFContext extends Data_attributeContext {
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public COFContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterCOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitCOF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitCOF(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BLTNContext extends Data_attributeContext {
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public BLTNContext(Data_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBLTN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBLTN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBLTN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_attributeContext data_attribute() throws RecognitionException {
		Data_attributeContext _localctx = new Data_attributeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_data_attribute);
		int _la;
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				_localctx = new BINContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(484);
				match(BINARY);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(485);
					precision();
					}
				}

				}
				}
				break;
			case DECIMAL:
				_localctx = new DECContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(488);
				match(DECIMAL);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(489);
					precision();
					}
				}

				}
				}
				break;
			case POINTER:
				_localctx = new PTRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(POINTER);
				}
				break;
			case BIT:
				_localctx = new BITContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(493);
				match(BIT);
				setState(494);
				max_length();
				}
				}
				break;
			case CHARACTER:
				_localctx = new CHARContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				match(CHARACTER);
				}
				break;
			case STRING:
				_localctx = new STRContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(496);
				match(STRING);
				setState(497);
				max_length();
				}
				}
				break;
			case ENTRY:
				_localctx = new ENTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(498);
				match(ENTRY);
				}
				break;
			case FIXED:
				_localctx = new FIXContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(499);
				match(FIXED);
				}
				break;
			case FLOAT:
				_localctx = new FLTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(500);
				match(FLOAT);
				}
				break;
			case OFFSET:
				_localctx = new OFFContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(501);
				match(OFFSET);
				}
				break;
			case VARYING:
				_localctx = new VNGContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(502);
				match(VARYING);
				}
				break;
			case COROUTINE:
				_localctx = new CORContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(503);
				match(COROUTINE);
				}
				break;
			case COFUNCTION:
				_localctx = new COFContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(504);
				match(COFUNCTION);
				}
				break;
			case BUILTIN:
				_localctx = new BLTNContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(505);
				match(BUILTIN);
				}
				break;
			case INTRINSIC:
				_localctx = new INTRContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(506);
				match(INTRINSIC);
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
	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public Number_of_digitsContext number_of_digits() {
			return getRuleContext(Number_of_digitsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode COMMA() { return getToken(ImperiumParser.COMMA, 0); }
		public Scale_factorContext scale_factor() {
			return getRuleContext(Scale_factorContext.class,0);
		}
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_precision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(LPAR);
			setState(510);
			number_of_digits();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(511);
				match(COMMA);
				setState(512);
				scale_factor();
				}
			}

			setState(515);
			match(RPAR);
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
	public static class Number_of_digitsContext extends ParserRuleContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Number_of_digitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_of_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterNumber_of_digits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitNumber_of_digits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitNumber_of_digits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_of_digitsContext number_of_digits() throws RecognitionException {
		Number_of_digitsContext _localctx = new Number_of_digitsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_number_of_digits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_PATTERN:
				{
				setState(517);
				decimal_literal();
				}
				break;
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
			case IDENTIFIER:
				{
				setState(518);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scale_factorContext extends ParserRuleContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Scale_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterScale_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitScale_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitScale_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scale_factorContext scale_factor() throws RecognitionException {
		Scale_factorContext _localctx = new Scale_factorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_scale_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_PATTERN:
				{
				setState(521);
				decimal_literal();
				}
				break;
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
			case IDENTIFIER:
				{
				setState(522);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Max_lengthContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Max_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterMax_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitMax_length(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitMax_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_lengthContext max_length() throws RecognitionException {
		Max_lengthContext _localctx = new Max_lengthContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_max_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(LPAR);
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_PATTERN:
				{
				setState(526);
				decimal_literal();
				}
				break;
			case CALL:
			case GOTO:
			case GO:
			case TO:
			case PROCEDURE:
			case PROC:
			case END:
			case DECLARE:
			case ARGUMENT:
			case DEFINE:
			case BUILTIN:
			case INTRINSIC:
			case RETURN:
			case IF:
			case THEN:
			case ELSE:
			case ELIF:
			case RETURNS:
			case POINTER:
			case BIT:
			case CHARACTER:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case OFFSET:
			case STRING:
			case VARYING:
			case COROUTINE:
			case COFUNCTION:
			case LOOP:
			case WHILE:
			case UNTIL:
			case ENDLOOP:
			case RELOOP:
			case IDENTIFIER:
				{
				setState(527);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530);
			match(RPAR);
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
	public static class BasedContext extends ParserRuleContext {
		public TerminalNode BASED() { return getToken(ImperiumParser.BASED, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public BasedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_based; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBased(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBased(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBased(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasedContext based() throws RecognitionException {
		BasedContext _localctx = new BasedContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_based);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(BASED);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(533);
				match(LPAR);
				setState(534);
				reference(0);
				setState(535);
				match(RPAR);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinedContext extends ParserRuleContext {
		public TerminalNode DEFINED() { return getToken(ImperiumParser.DEFINED, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public DefinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDefined(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDefined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedContext defined() throws RecognitionException {
		DefinedContext _localctx = new DefinedContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_defined);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(DEFINED);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(540);
				match(LPAR);
				setState(541);
				reference(0);
				setState(542);
				match(RPAR);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Entry_informationContext extends ParserRuleContext {
		public Parameter_name_commalistContext parameter_name_commalist() {
			return getRuleContext(Parameter_name_commalistContext.class,0);
		}
		public Returns_descriptorContext returns_descriptor() {
			return getRuleContext(Returns_descriptorContext.class,0);
		}
		public Coprocedure_specifierContext coprocedure_specifier() {
			return getRuleContext(Coprocedure_specifierContext.class,0);
		}
		public Entry_informationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry_information; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterEntry_information(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitEntry_information(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitEntry_information(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entry_informationContext entry_information() throws RecognitionException {
		Entry_informationContext _localctx = new Entry_informationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_entry_information);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(546);
				parameter_name_commalist();
				}
			}

			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				{
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(549);
					returns_descriptor();
					}
					break;
				}
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(552);
					coprocedure_specifier();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(555);
					coprocedure_specifier();
					}
					break;
				}
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(558);
					returns_descriptor();
					}
					break;
				}
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Coprocedure_specifierContext extends ParserRuleContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public Coprocedure_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coprocedure_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterCoprocedure_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitCoprocedure_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitCoprocedure_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Coprocedure_specifierContext coprocedure_specifier() throws RecognitionException {
		Coprocedure_specifierContext _localctx = new Coprocedure_specifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_coprocedure_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_la = _input.LA(1);
			if ( !(_la==COROUTINE || _la==COFUNCTION) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_name_commalistContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public Parameter_name_commalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name_commalist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterParameter_name_commalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitParameter_name_commalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitParameter_name_commalist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_name_commalistContext parameter_name_commalist() throws RecognitionException {
		Parameter_name_commalistContext _localctx = new Parameter_name_commalistContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameter_name_commalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(LPAR);
			setState(566);
			identifier();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(567);
				match(COMMA);
				setState(568);
				identifier();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(RPAR);
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
	public static class Returns_descriptorContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(ImperiumParser.RETURNS, 0); }
		public Data_attributeContext data_attribute() {
			return getRuleContext(Data_attributeContext.class,0);
		}
		public Returns_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterReturns_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitReturns_descriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitReturns_descriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_descriptorContext returns_descriptor() throws RecognitionException {
		Returns_descriptorContext _localctx = new Returns_descriptorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_returns_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(RETURNS);
			setState(577);
			data_attribute();
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
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ImperiumParser.RETURN, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(RETURN);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(580);
				match(LPAR);
				setState(581);
				expression(0);
				setState(582);
				match(RPAR);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public Then_clauseContext then_clause() {
			return getRuleContext(Then_clauseContext.class,0);
		}
		public End_stmtContext end_stmt() {
			return getRuleContext(End_stmtContext.class,0);
		}
		public List<Executable_stmtContext> executable_stmt() {
			return getRuleContexts(Executable_stmtContext.class);
		}
		public Executable_stmtContext executable_stmt(int i) {
			return getRuleContext(Executable_stmtContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public List<Elif_clauseContext> elif_clause() {
			return getRuleContexts(Elif_clauseContext.class);
		}
		public Elif_clauseContext elif_clause(int i) {
			return getRuleContext(Elif_clauseContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				then_clause();
				setState(590); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(587);
						executable_stmt();
						setState(588);
						terminator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(592); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(594);
					else_clause();
					}
				}

				setState(597);
				end_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				then_clause();
				setState(603); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(600);
						executable_stmt();
						setState(601);
						terminator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(605); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(607);
					elif_clause();
					}
					}
					setState(610); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELIF );
				setState(612);
				end_stmt();
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
	public static class Then_clauseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public Then_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterThen_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitThen_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitThen_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_clauseContext then_clause() throws RecognitionException {
		Then_clauseContext _localctx = new Then_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_then_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(IF);
			setState(617);
			expression(0);
			setState(618);
			match(THEN);
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
	public static class Else_clauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public List<Executable_stmtContext> executable_stmt() {
			return getRuleContexts(Executable_stmtContext.class);
		}
		public Executable_stmtContext executable_stmt(int i) {
			return getRuleContext(Executable_stmtContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_else_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(ELSE);
			setState(624); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(621);
					executable_stmt();
					setState(622);
					terminator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(626); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Elif_clauseContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(ImperiumParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public List<Executable_stmtContext> executable_stmt() {
			return getRuleContexts(Executable_stmtContext.class);
		}
		public Executable_stmtContext executable_stmt(int i) {
			return getRuleContext(Executable_stmtContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public Elif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterElif_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitElif_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitElif_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_clauseContext elif_clause() throws RecognitionException {
		Elif_clauseContext _localctx = new Elif_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elif_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(ELIF);
			setState(629);
			expression(0);
			setState(630);
			match(THEN);
			setState(634); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(631);
					executable_stmt();
					setState(632);
					terminator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(636); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(638);
				else_clause();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_stmtContext extends ParserRuleContext {
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
	 
		public Loop_stmtContext() { }
		public void copyFrom(Loop_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WHILE_UNTILContext extends Loop_stmtContext {
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public While_optionContext while_option() {
			return getRuleContext(While_optionContext.class,0);
		}
		public End_stmtContext end_stmt() {
			return getRuleContext(End_stmtContext.class,0);
		}
		public Until_optionContext until_option() {
			return getRuleContext(Until_optionContext.class,0);
		}
		public List<Executable_stmtContext> executable_stmt() {
			return getRuleContexts(Executable_stmtContext.class);
		}
		public Executable_stmtContext executable_stmt(int i) {
			return getRuleContext(Executable_stmtContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public WHILE_UNTILContext(Loop_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterWHILE_UNTIL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitWHILE_UNTIL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitWHILE_UNTIL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UNTIL_WHILEContext extends Loop_stmtContext {
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public Until_optionContext until_option() {
			return getRuleContext(Until_optionContext.class,0);
		}
		public End_stmtContext end_stmt() {
			return getRuleContext(End_stmtContext.class,0);
		}
		public While_optionContext while_option() {
			return getRuleContext(While_optionContext.class,0);
		}
		public List<Executable_stmtContext> executable_stmt() {
			return getRuleContexts(Executable_stmtContext.class);
		}
		public Executable_stmtContext executable_stmt(int i) {
			return getRuleContext(Executable_stmtContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public UNTIL_WHILEContext(Loop_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterUNTIL_WHILE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitUNTIL_WHILE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitUNTIL_WHILE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BASIC_LOOPContext extends Loop_stmtContext {
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public End_stmtContext end_stmt() {
			return getRuleContext(End_stmtContext.class,0);
		}
		public List<Executable_stmtContext> executable_stmt() {
			return getRuleContexts(Executable_stmtContext.class);
		}
		public Executable_stmtContext executable_stmt(int i) {
			return getRuleContext(Executable_stmtContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public BASIC_LOOPContext(Loop_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBASIC_LOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBASIC_LOOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBASIC_LOOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_loop_stmt);
		try {
			int _alt;
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new BASIC_LOOPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(LOOP);
				setState(645); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(642);
						executable_stmt();
						setState(643);
						terminator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(647); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(649);
				end_stmt();
				}
				break;
			case 2:
				_localctx = new WHILE_UNTILContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(LOOP);
				setState(652);
				while_option();
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(653);
					until_option();
					}
					break;
				}
				setState(659); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(656);
						executable_stmt();
						setState(657);
						terminator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(661); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(663);
				end_stmt();
				}
				break;
			case 3:
				_localctx = new UNTIL_WHILEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				match(LOOP);
				setState(666);
				until_option();
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(667);
					while_option();
					}
					break;
				}
				setState(673); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(670);
						executable_stmt();
						setState(671);
						terminator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(675); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(677);
				end_stmt();
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
	public static class While_optionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ImperiumParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public While_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterWhile_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitWhile_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitWhile_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_optionContext while_option() throws RecognitionException {
		While_optionContext _localctx = new While_optionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_while_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(WHILE);
			setState(682);
			match(LPAR);
			setState(683);
			expression(0);
			setState(684);
			match(RPAR);
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
	public static class Until_optionContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(ImperiumParser.UNTIL, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public Until_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterUntil_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitUntil_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitUntil_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Until_optionContext until_option() throws RecognitionException {
		Until_optionContext _localctx = new Until_optionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_until_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(UNTIL);
			setState(687);
			match(LPAR);
			setState(688);
			expression(0);
			setState(689);
			match(RPAR);
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
	public static class Define_stmtContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(ImperiumParser.DEFINE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public List<Type_infoContext> type_info() {
			return getRuleContexts(Type_infoContext.class);
		}
		public Type_infoContext type_info(int i) {
			return getRuleContext(Type_infoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public Define_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDefine_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDefine_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDefine_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_stmtContext define_stmt() throws RecognitionException {
		Define_stmtContext _localctx = new Define_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_define_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(DEFINE);
			setState(692);
			identifier();
			{
			setState(693);
			identifier();
			setState(694);
			type_info();
			}
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(696);
					match(COMMA);
					setState(697);
					identifier();
					setState(698);
					type_info();
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(705);
				match(COMMA);
				}
			}

			setState(708);
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
	public static class Numeric_literalContext extends ParserRuleContext {
		public Binary_literalContext binary_literal() {
			return getRuleContext(Binary_literalContext.class,0);
		}
		public Octal_literalContext octal_literal() {
			return getRuleContext(Octal_literalContext.class,0);
		}
		public Hexadecimal_literalContext hexadecimal_literal() {
			return getRuleContext(Hexadecimal_literalContext.class,0);
		}
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_numeric_literal);
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_PATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				binary_literal();
				}
				break;
			case OCTAL_PATTERN:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				octal_literal();
				}
				break;
			case HEXADECIMAL_PATTERN:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				hexadecimal_literal();
				}
				break;
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				decimal_literal();
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
	public static class Hexadecimal_literalContext extends ParserRuleContext {
		public TerminalNode HEXADECIMAL_PATTERN() { return getToken(ImperiumParser.HEXADECIMAL_PATTERN, 0); }
		public Hexadecimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterHexadecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitHexadecimal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitHexadecimal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hexadecimal_literalContext hexadecimal_literal() throws RecognitionException {
		Hexadecimal_literalContext _localctx = new Hexadecimal_literalContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_hexadecimal_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(716);
			match(HEXADECIMAL_PATTERN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Octal_literalContext extends ParserRuleContext {
		public TerminalNode OCTAL_PATTERN() { return getToken(ImperiumParser.OCTAL_PATTERN, 0); }
		public Octal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterOctal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitOctal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitOctal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_literalContext octal_literal() throws RecognitionException {
		Octal_literalContext _localctx = new Octal_literalContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_octal_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(718);
			match(OCTAL_PATTERN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decimal_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_PATTERN() { return getToken(ImperiumParser.DECIMAL_PATTERN, 0); }
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterDecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitDecimal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitDecimal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_decimal_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(720);
			match(DECIMAL_PATTERN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_literalContext extends ParserRuleContext {
		public TerminalNode BINARY_PATTERN() { return getToken(ImperiumParser.BINARY_PATTERN, 0); }
		public Binary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).enterBinary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumParserListener ) ((ImperiumParserListener)listener).exitBinary_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumParserVisitor ) return ((ImperiumParserVisitor<? extends T>)visitor).visitBinary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_literalContext binary_literal() throws RecognitionException {
		Binary_literalContext _localctx = new Binary_literalContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_binary_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(722);
			match(BINARY_PATTERN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return reference_sempred((ReferenceContext)_localctx, predIndex);
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return expression_9_sempred((Expression_9Context)_localctx, predIndex);
		case 19:
			return expression_8_sempred((Expression_8Context)_localctx, predIndex);
		case 20:
			return expression_7_sempred((Expression_7Context)_localctx, predIndex);
		case 21:
			return expression_6_sempred((Expression_6Context)_localctx, predIndex);
		case 22:
			return expression_5_sempred((Expression_5Context)_localctx, predIndex);
		case 23:
			return expression_4_sempred((Expression_4Context)_localctx, predIndex);
		case 24:
			return expression_3_sempred((Expression_3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean reference_sempred(ReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_9_sempred(Expression_9Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_8_sempred(Expression_8Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_7_sempred(Expression_7Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_6_sempred(Expression_6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_5_sempred(Expression_5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_4_sempred(Expression_4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_3_sempred(Expression_3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001k\u02d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0003\u0000\u0094\b\u0000"+
		"\u0001\u0000\u0003\u0000\u0097\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00a4\b\u0002\n\u0002\f\u0002\u00a7"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ac\b\u0002"+
		"\n\u0002\f\u0002\u00af\t\u0002\u0001\u0002\u0003\u0002\u00b2\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00bd\b\u0005\u0001\u0006\u0003"+
		"\u0006\u00c0\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c4\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00c8\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00cd\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00d1\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d5\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00d9\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00dd\b\u0006\u0001\u0006\u0003\u0006\u00e0\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00f1\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f7\b\t\u0005\t"+
		"\u00f9\b\t\n\t\f\t\u00fc\t\t\u0001\n\u0001\n\u0004\n\u0100\b\n\u000b\n"+
		"\f\n\u0101\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u0107\b\u000b\u000b"+
		"\u000b\f\u000b\u0108\u0001\f\u0003\f\u010c\b\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0003\r\u0112\b\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u0117"+
		"\b\u000e\u000b\u000e\f\u000e\u0118\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0120\b\u0010\n\u0010\f\u0010\u0123"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u012b\b\u0011\n\u0011\f\u0011\u012e\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0136\b\u0012\n\u0012\f\u0012\u0139\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0141\b\u0013\n"+
		"\u0013\f\u0013\u0144\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u014c\b\u0014\n\u0014\f\u0014"+
		"\u014f\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0158\b\u0015\n\u0015\f\u0015\u015b"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0163\b\u0016\n\u0016\f\u0016\u0166\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u016e\b\u0017\n\u0017\f\u0017\u0171\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0179\b\u0018\n"+
		"\u0018\f\u0018\u017c\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0182\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0186"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0194\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0003!\u019e\b!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u01a8\b$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u01b0\b&\u0001\'\u0001\'\u0003\'\u01b4\b"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0003)\u01bb\b)\u0001)\u0005)\u01be"+
		"\b)\n)\f)\u01c1\t)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003"+
		"+\u01ca\b+\u0001+\u0001+\u0003+\u01ce\b+\u0001,\u0001,\u0001,\u0005,\u01d3"+
		"\b,\n,\f,\u01d6\t,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u01e3\b/\u00010\u00010\u00030\u01e7\b0\u0001"+
		"0\u00010\u00030\u01eb\b0\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u01fc"+
		"\b0\u00011\u00011\u00011\u00011\u00031\u0202\b1\u00011\u00011\u00012\u0001"+
		"2\u00032\u0208\b2\u00013\u00013\u00033\u020c\b3\u00014\u00014\u00014\u0003"+
		"4\u0211\b4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00035\u021a"+
		"\b5\u00016\u00016\u00016\u00016\u00016\u00036\u0221\b6\u00017\u00037\u0224"+
		"\b7\u00017\u00037\u0227\b7\u00017\u00037\u022a\b7\u00017\u00037\u022d"+
		"\b7\u00017\u00037\u0230\b7\u00037\u0232\b7\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00059\u023a\b9\n9\f9\u023d\t9\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0249\b;\u0001<\u0001"+
		"<\u0001<\u0001<\u0004<\u024f\b<\u000b<\f<\u0250\u0001<\u0003<\u0254\b"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0004<\u025c\b<\u000b<\f<"+
		"\u025d\u0001<\u0004<\u0261\b<\u000b<\f<\u0262\u0001<\u0001<\u0003<\u0267"+
		"\b<\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0004>\u0271"+
		"\b>\u000b>\f>\u0272\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0004?\u027b"+
		"\b?\u000b?\f?\u027c\u0001?\u0003?\u0280\b?\u0001@\u0001@\u0001@\u0001"+
		"@\u0004@\u0286\b@\u000b@\f@\u0287\u0001@\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u028f\b@\u0001@\u0001@\u0001@\u0004@\u0294\b@\u000b@\f@\u0295\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0003@\u029d\b@\u0001@\u0001@\u0001@\u0004"+
		"@\u02a2\b@\u000b@\f@\u02a3\u0001@\u0001@\u0003@\u02a8\b@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0005C\u02bd\bC\nC"+
		"\fC\u02c0\tC\u0001C\u0003C\u02c3\bC\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u02cb\bD\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001"+
		"H\u0001H\u0001H\u0000\t\u0012\"$&(*,.0I\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0000\t\u0002\u0000GG__\u0001\u0000VW\u0001\u0000T"+
		"U\u0002\u0000VW__\u0002\u0000SSag\u0001\u0000hk\u0003\u0000\u0007\u0010"+
		"\u0014\u0015\u001c1\u0001\u0000\u000e\u000f\u0001\u0000+,\u02f9\u0000"+
		"\u0093\u0001\u0000\u0000\u0000\u0002\u009a\u0001\u0000\u0000\u0000\u0004"+
		"\u00b1\u0001\u0000\u0000\u0000\u0006\u00b3\u0001\u0000\u0000\u0000\b\u00b5"+
		"\u0001\u0000\u0000\u0000\n\u00bc\u0001\u0000\u0000\u0000\f\u00df\u0001"+
		"\u0000\u0000\u0000\u000e\u00e1\u0001\u0000\u0000\u0000\u0010\u00e9\u0001"+
		"\u0000\u0000\u0000\u0012\u00ed\u0001\u0000\u0000\u0000\u0014\u00fd\u0001"+
		"\u0000\u0000\u0000\u0016\u0106\u0001\u0000\u0000\u0000\u0018\u010b\u0001"+
		"\u0000\u0000\u0000\u001a\u010f\u0001\u0000\u0000\u0000\u001c\u0116\u0001"+
		"\u0000\u0000\u0000\u001e\u011a\u0001\u0000\u0000\u0000 \u011c\u0001\u0000"+
		"\u0000\u0000\"\u0124\u0001\u0000\u0000\u0000$\u012f\u0001\u0000\u0000"+
		"\u0000&\u013a\u0001\u0000\u0000\u0000(\u0145\u0001\u0000\u0000\u0000*"+
		"\u0150\u0001\u0000\u0000\u0000,\u015c\u0001\u0000\u0000\u0000.\u0167\u0001"+
		"\u0000\u0000\u00000\u0172\u0001\u0000\u0000\u00002\u0181\u0001\u0000\u0000"+
		"\u00004\u0185\u0001\u0000\u0000\u00006\u018a\u0001\u0000\u0000\u00008"+
		"\u018d\u0001\u0000\u0000\u0000:\u0193\u0001\u0000\u0000\u0000<\u0195\u0001"+
		"\u0000\u0000\u0000>\u0197\u0001\u0000\u0000\u0000@\u0199\u0001\u0000\u0000"+
		"\u0000B\u019d\u0001\u0000\u0000\u0000D\u019f\u0001\u0000\u0000\u0000F"+
		"\u01a1\u0001\u0000\u0000\u0000H\u01a7\u0001\u0000\u0000\u0000J\u01ab\u0001"+
		"\u0000\u0000\u0000L\u01ad\u0001\u0000\u0000\u0000N\u01b1\u0001\u0000\u0000"+
		"\u0000P\u01b5\u0001\u0000\u0000\u0000R\u01ba\u0001\u0000\u0000\u0000T"+
		"\u01c2\u0001\u0000\u0000\u0000V\u01cd\u0001\u0000\u0000\u0000X\u01cf\u0001"+
		"\u0000\u0000\u0000Z\u01d7\u0001\u0000\u0000\u0000\\\u01d9\u0001\u0000"+
		"\u0000\u0000^\u01e2\u0001\u0000\u0000\u0000`\u01fb\u0001\u0000\u0000\u0000"+
		"b\u01fd\u0001\u0000\u0000\u0000d\u0207\u0001\u0000\u0000\u0000f\u020b"+
		"\u0001\u0000\u0000\u0000h\u020d\u0001\u0000\u0000\u0000j\u0214\u0001\u0000"+
		"\u0000\u0000l\u021b\u0001\u0000\u0000\u0000n\u0223\u0001\u0000\u0000\u0000"+
		"p\u0233\u0001\u0000\u0000\u0000r\u0235\u0001\u0000\u0000\u0000t\u0240"+
		"\u0001\u0000\u0000\u0000v\u0243\u0001\u0000\u0000\u0000x\u0266\u0001\u0000"+
		"\u0000\u0000z\u0268\u0001\u0000\u0000\u0000|\u026c\u0001\u0000\u0000\u0000"+
		"~\u0274\u0001\u0000\u0000\u0000\u0080\u02a7\u0001\u0000\u0000\u0000\u0082"+
		"\u02a9\u0001\u0000\u0000\u0000\u0084\u02ae\u0001\u0000\u0000\u0000\u0086"+
		"\u02b3\u0001\u0000\u0000\u0000\u0088\u02ca\u0001\u0000\u0000\u0000\u008a"+
		"\u02cc\u0001\u0000\u0000\u0000\u008c\u02ce\u0001\u0000\u0000\u0000\u008e"+
		"\u02d0\u0001\u0000\u0000\u0000\u0090\u02d2\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0005\u0006\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0003\u000e\u0007\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0003\u0002\u0001\u0000\u0099\u0001\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u000b\u0000\u0000\u009b\u009c\u0003B!\u0000\u009c\u009d\u0003"+
		"n7\u0000\u009d\u009e\u0003\u0004\u0002\u0000\u009e\u009f\u0003J%\u0000"+
		"\u009f\u0003\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\n\u0005\u0000\u00a1"+
		"\u00a2\u0003\u0006\u0003\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00ad\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0003\f\u0006\u0000\u00a9\u00aa\u0003\u0006\u0003\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b2\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\u0006\u0003\u0000\u00b1\u00a5"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u0005"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005X\u0000\u0000\u00b4\u0007\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005Q\u0000\u0000\u00b6\u00b7\u0003B!"+
		"\u0000\u00b7\u00b8\u0005R\u0000\u0000\u00b8\t\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bd\u0003\u000e\u0007\u0000\u00ba\u00bd\u0003P(\u0000\u00bb\u00bd"+
		"\u0003\u0086C\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u000b\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0003\b\u0004\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00e0\u0003\u0010\b\u0000\u00c2\u00c4\u0003\b\u0004"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00e0\u0003F#\u0000\u00c6"+
		"\u00c8\u0003\b\u0004\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00e0"+
		"\u0003H$\u0000\u00ca\u00e0\u0003\u0002\u0001\u0000\u00cb\u00cd\u0003\b"+
		"\u0004\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00e0\u0003v;\u0000"+
		"\u00cf\u00d1\u0003\b\u0004\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00e0\u0003x<\u0000\u00d3\u00d5\u0003\b\u0004\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00e0\u0003\u0080@\u0000\u00d7\u00d9\u0003\b"+
		"\u0004\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00e0\u0003L&\u0000"+
		"\u00db\u00dd\u0003\b\u0004\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0003N\'\u0000\u00df\u00bf\u0001\u0000\u0000\u0000\u00df\u00c3"+
		"\u0001\u0000\u0000\u0000\u00df\u00c7\u0001\u0000\u0000\u0000\u00df\u00ca"+
		"\u0001\u0000\u0000\u0000\u00df\u00cc\u0001\u0000\u0000\u0000\u00df\u00d0"+
		"\u0001\u0000\u0000\u0000\u00df\u00d4\u0001\u0000\u0000\u0000\u00df\u00d8"+
		"\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00e0\r\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005^\u0000\u0000\u00e2\u00e3\u00052\u0000"+
		"\u0000\u00e3\u00e4\u0005\\\u0000\u0000\u00e4\u00e5\u0003B!\u0000\u00e5"+
		"\u00e6\u0005K\u0000\u0000\u00e6\u00e7\u00053\u0000\u0000\u00e7\u00e8\u0005"+
		"\\\u0000\u0000\u00e8\u000f\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003\u0012"+
		"\t\u0000\u00ea\u00eb\u0005S\u0000\u0000\u00eb\u00ec\u0003\"\u0011\u0000"+
		"\u00ec\u0011\u0001\u0000\u0000\u0000\u00ed\u00ee\u0006\t\uffff\uffff\u0000"+
		"\u00ee\u00f0\u0003\u0018\f\u0000\u00ef\u00f1\u0003\u0016\u000b\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f2\u00f3\n\u0002\u0000\u0000\u00f3\u00f4"+
		"\u0005J\u0000\u0000\u00f4\u00f6\u0003\u0018\f\u0000\u00f5\u00f7\u0003"+
		"\u0016\u000b\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0013\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005"+
		"M\u0000\u0000\u00fe\u0100\u0003 \u0010\u0000\u00ff\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005N\u0000\u0000\u0104\u0015\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0003\u0014\n\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u0017\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0003\u001c\u000e\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0003B!\u0000\u010e\u0019\u0001\u0000\u0000\u0000\u010f\u0111\u0003"+
		"B!\u0000\u0110\u0112\u0003\u0014\n\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005K\u0000\u0000\u0114\u001b\u0001\u0000\u0000\u0000"+
		"\u0115\u0117\u0003\u001a\r\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u001d\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0003\"\u0011\u0000\u011b\u001f\u0001\u0000\u0000\u0000\u011c\u0121"+
		"\u0003\u001e\u000f\u0000\u011d\u011e\u0005L\u0000\u0000\u011e\u0120\u0003"+
		"\u001e\u000f\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122!\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0006\u0011\uffff\uffff\u0000\u0125\u0126\u0003"+
		"$\u0012\u0000\u0126\u012c\u0001\u0000\u0000\u0000\u0127\u0128\n\u0001"+
		"\u0000\u0000\u0128\u0129\u0005F\u0000\u0000\u0129\u012b\u0003$\u0012\u0000"+
		"\u012a\u0127\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d#\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0006\u0012\uffff\uffff\u0000\u0130\u0131\u0003&\u0013\u0000\u0131"+
		"\u0137\u0001\u0000\u0000\u0000\u0132\u0133\n\u0001\u0000\u0000\u0133\u0134"+
		"\u0005I\u0000\u0000\u0134\u0136\u0003&\u0013\u0000\u0135\u0132\u0001\u0000"+
		"\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138%\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0006\u0013\uffff"+
		"\uffff\u0000\u013b\u013c\u0003(\u0014\u0000\u013c\u0142\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\n\u0001\u0000\u0000\u013e\u013f\u0007\u0000\u0000\u0000"+
		"\u013f\u0141\u0003(\u0014\u0000\u0140\u013d\u0001\u0000\u0000\u0000\u0141"+
		"\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\'\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0006\u0014\uffff\uffff\u0000\u0146"+
		"\u0147\u0003*\u0015\u0000\u0147\u014d\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\n\u0001\u0000\u0000\u0149\u014a\u0005H\u0000\u0000\u014a\u014c\u0003"+
		"*\u0015\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e)\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0006\u0015\uffff\uffff\u0000\u0151\u0152\u0003,\u0016"+
		"\u0000\u0152\u0159\u0001\u0000\u0000\u0000\u0153\u0154\n\u0001\u0000\u0000"+
		"\u0154\u0155\u0003>\u001f\u0000\u0155\u0156\u0003,\u0016\u0000\u0156\u0158"+
		"\u0001\u0000\u0000\u0000\u0157\u0153\u0001\u0000\u0000\u0000\u0158\u015b"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a+\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0006\u0016\uffff\uffff\u0000\u015d\u015e"+
		"\u0003.\u0017\u0000\u015e\u0164\u0001\u0000\u0000\u0000\u015f\u0160\n"+
		"\u0001\u0000\u0000\u0160\u0161\u0005`\u0000\u0000\u0161\u0163\u0003.\u0017"+
		"\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165-\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0006\u0017\uffff\uffff\u0000\u0168\u0169\u00030\u0018\u0000"+
		"\u0169\u016f\u0001\u0000\u0000\u0000\u016a\u016b\n\u0001\u0000\u0000\u016b"+
		"\u016c\u0007\u0001\u0000\u0000\u016c\u016e\u00030\u0018\u0000\u016d\u016a"+
		"\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170/\u0001"+
		"\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0006"+
		"\u0018\uffff\uffff\u0000\u0173\u0174\u00032\u0019\u0000\u0174\u017a\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\n\u0001\u0000\u0000\u0176\u0177\u0007\u0002"+
		"\u0000\u0000\u0177\u0179\u00032\u0019\u0000\u0178\u0175\u0001\u0000\u0000"+
		"\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b1\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0182\u0003:\u001d\u0000\u017e"+
		"\u0182\u00036\u001b\u0000\u017f\u0182\u00038\u001c\u0000\u0180\u0182\u0003"+
		"4\u001a\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0181\u017e\u0001\u0000"+
		"\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000"+
		"\u0000\u0000\u01823\u0001\u0000\u0000\u0000\u0183\u0186\u0003:\u001d\u0000"+
		"\u0184\u0186\u00038\u001c\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0005Y\u0000\u0000\u0188\u0189\u00032\u0019\u0000\u01895\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0003<\u001e\u0000\u018b\u018c\u00032\u0019"+
		"\u0000\u018c7\u0001\u0000\u0000\u0000\u018d\u018e\u0005M\u0000\u0000\u018e"+
		"\u018f\u0003\"\u0011\u0000\u018f\u0190\u0005N\u0000\u0000\u01909\u0001"+
		"\u0000\u0000\u0000\u0191\u0194\u0003\u0088D\u0000\u0192\u0194\u0003\u0012"+
		"\t\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u0194;\u0001\u0000\u0000\u0000\u0195\u0196\u0007\u0003\u0000\u0000"+
		"\u0196=\u0001\u0000\u0000\u0000\u0197\u0198\u0007\u0004\u0000\u0000\u0198"+
		"?\u0001\u0000\u0000\u0000\u0199\u019a\u0007\u0005\u0000\u0000\u019aA\u0001"+
		"\u0000\u0000\u0000\u019b\u019e\u0003D\"\u0000\u019c\u019e\u0005<\u0000"+
		"\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000"+
		"\u0000\u019eC\u0001\u0000\u0000\u0000\u019f\u01a0\u0007\u0006\u0000\u0000"+
		"\u01a0E\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0007\u0000\u0000\u01a2"+
		"\u01a3\u0003\u0012\t\u0000\u01a3G\u0001\u0000\u0000\u0000\u01a4\u01a8"+
		"\u0005\b\u0000\u0000\u01a5\u01a6\u0005\t\u0000\u0000\u01a6\u01a8\u0005"+
		"\n\u0000\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0003\u0012"+
		"\t\u0000\u01aaI\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\r\u0000\u0000"+
		"\u01acK\u0001\u0000\u0000\u0000\u01ad\u01af\u00050\u0000\u0000\u01ae\u01b0"+
		"\u0005<\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b0M\u0001\u0000\u0000\u0000\u01b1\u01b3\u00051\u0000"+
		"\u0000\u01b2\u01b4\u0005<\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4O\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0007\u0007\u0000\u0000\u01b6\u01b7\u0003B!\u0000\u01b7\u01b8\u0003"+
		"R)\u0000\u01b8Q\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003T*\u0000\u01ba"+
		"\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bc\u01be\u0003^/\u0000\u01bd\u01bc\u0001"+
		"\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0S\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005M\u0000"+
		"\u0000\u01c3\u01c4\u0003X,\u0000\u01c4\u01c5\u0005N\u0000\u0000\u01c5"+
		"U\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003Z-\u0000\u01c7\u01c8\u0005"+
		"Z\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cb\u01ce\u0003\\.\u0000\u01cc\u01ce\u0005T\u0000\u0000"+
		"\u01cd\u01c9\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000"+
		"\u01ceW\u0001\u0000\u0000\u0000\u01cf\u01d4\u0003V+\u0000\u01d0\u01d1"+
		"\u0005L\u0000\u0000\u01d1\u01d3\u0003V+\u0000\u01d2\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5Y\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003\"\u0011\u0000"+
		"\u01d8[\u0001\u0000\u0000\u0000\u01d9\u01da\u0003\"\u0011\u0000\u01da"+
		"]\u0001\u0000\u0000\u0000\u01db\u01e3\u0003`0\u0000\u01dc\u01e3\u0005"+
		"\u0013\u0000\u0000\u01dd\u01e3\u0005\u0014\u0000\u0000\u01de\u01e3\u0005"+
		"\u0016\u0000\u0000\u01df\u01e3\u0005\u0017\u0000\u0000\u01e0\u01e3\u0003"+
		"j5\u0000\u01e1\u01e3\u0003l6\u0000\u01e2\u01db\u0001\u0000\u0000\u0000"+
		"\u01e2\u01dc\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e2\u01de\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e3_\u0001\u0000\u0000\u0000\u01e4\u01e6\u0005\u0011\u0000\u0000\u01e5"+
		"\u01e7\u0003b1\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7\u01fc\u0001\u0000\u0000\u0000\u01e8\u01ea\u0005"+
		"\u0012\u0000\u0000\u01e9\u01eb\u0003b1\u0000\u01ea\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01fc\u0001\u0000\u0000"+
		"\u0000\u01ec\u01fc\u0005\"\u0000\u0000\u01ed\u01ee\u0005#\u0000\u0000"+
		"\u01ee\u01fc\u0003h4\u0000\u01ef\u01fc\u0005$\u0000\u0000\u01f0\u01f1"+
		"\u0005)\u0000\u0000\u01f1\u01fc\u0003h4\u0000\u01f2\u01fc\u0005%\u0000"+
		"\u0000\u01f3\u01fc\u0005&\u0000\u0000\u01f4\u01fc\u0005\'\u0000\u0000"+
		"\u01f5\u01fc\u0005(\u0000\u0000\u01f6\u01fc\u0005*\u0000\u0000\u01f7\u01fc"+
		"\u0005+\u0000\u0000\u01f8\u01fc\u0005,\u0000\u0000\u01f9\u01fc\u0005\u0014"+
		"\u0000\u0000\u01fa\u01fc\u0005\u0015\u0000\u0000\u01fb\u01e4\u0001\u0000"+
		"\u0000\u0000\u01fb\u01e8\u0001\u0000\u0000\u0000\u01fb\u01ec\u0001\u0000"+
		"\u0000\u0000\u01fb\u01ed\u0001\u0000\u0000\u0000\u01fb\u01ef\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f0\u0001\u0000\u0000\u0000\u01fb\u01f2\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000\u01fb\u01f4\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f5\u0001\u0000\u0000\u0000\u01fb\u01f6\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f7\u0001\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fca\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005M\u0000\u0000"+
		"\u01fe\u0201\u0003d2\u0000\u01ff\u0200\u0005L\u0000\u0000\u0200\u0202"+
		"\u0003f3\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0005N\u0000"+
		"\u0000\u0204c\u0001\u0000\u0000\u0000\u0205\u0208\u0003\u008eG\u0000\u0206"+
		"\u0208\u0003B!\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0206\u0001"+
		"\u0000\u0000\u0000\u0208e\u0001\u0000\u0000\u0000\u0209\u020c\u0003\u008e"+
		"G\u0000\u020a\u020c\u0003B!\u0000\u020b\u0209\u0001\u0000\u0000\u0000"+
		"\u020b\u020a\u0001\u0000\u0000\u0000\u020cg\u0001\u0000\u0000\u0000\u020d"+
		"\u0210\u0005M\u0000\u0000\u020e\u0211\u0003\u008eG\u0000\u020f\u0211\u0003"+
		"B!\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0005N\u0000\u0000"+
		"\u0213i\u0001\u0000\u0000\u0000\u0214\u0219\u0005\u0018\u0000\u0000\u0215"+
		"\u0216\u0005M\u0000\u0000\u0216\u0217\u0003\u0012\t\u0000\u0217\u0218"+
		"\u0005N\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u0215\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021ak\u0001\u0000"+
		"\u0000\u0000\u021b\u0220\u0005\u0019\u0000\u0000\u021c\u021d\u0005M\u0000"+
		"\u0000\u021d\u021e\u0003\u0012\t\u0000\u021e\u021f\u0005N\u0000\u0000"+
		"\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u021c\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0001\u0000\u0000\u0000\u0221m\u0001\u0000\u0000\u0000\u0222"+
		"\u0224\u0003r9\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224\u0001"+
		"\u0000\u0000\u0000\u0224\u0231\u0001\u0000\u0000\u0000\u0225\u0227\u0003"+
		"t:\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
		"\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u022a\u0003p8\u0000\u0229"+
		"\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"\u0232\u0001\u0000\u0000\u0000\u022b\u022d\u0003p8\u0000\u022c\u022b\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022f\u0001"+
		"\u0000\u0000\u0000\u022e\u0230\u0003t:\u0000\u022f\u022e\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232\u0001\u0000\u0000"+
		"\u0000\u0231\u0226\u0001\u0000\u0000\u0000\u0231\u022c\u0001\u0000\u0000"+
		"\u0000\u0232o\u0001\u0000\u0000\u0000\u0233\u0234\u0007\b\u0000\u0000"+
		"\u0234q\u0001\u0000\u0000\u0000\u0235\u0236\u0005M\u0000\u0000\u0236\u023b"+
		"\u0003B!\u0000\u0237\u0238\u0005L\u0000\u0000\u0238\u023a\u0003B!\u0000"+
		"\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000"+
		"\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0005N\u0000\u0000\u023fs\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0005!\u0000\u0000\u0241\u0242\u0003`0\u0000\u0242u\u0001\u0000\u0000"+
		"\u0000\u0243\u0248\u0005\u001c\u0000\u0000\u0244\u0245\u0005M\u0000\u0000"+
		"\u0245\u0246\u0003\"\u0011\u0000\u0246\u0247\u0005N\u0000\u0000\u0247"+
		"\u0249\u0001\u0000\u0000\u0000\u0248\u0244\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0001\u0000\u0000\u0000\u0249w\u0001\u0000\u0000\u0000\u024a\u024e"+
		"\u0003z=\u0000\u024b\u024c\u0003\f\u0006\u0000\u024c\u024d\u0003\u0006"+
		"\u0003\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u024b\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0001\u0000"+
		"\u0000\u0000\u0252\u0254\u0003|>\u0000\u0253\u0252\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0003J%\u0000\u0256\u0267\u0001\u0000\u0000\u0000\u0257\u025b"+
		"\u0003z=\u0000\u0258\u0259\u0003\f\u0006\u0000\u0259\u025a\u0003\u0006"+
		"\u0003\u0000\u025a\u025c\u0001\u0000\u0000\u0000\u025b\u0258\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000"+
		"\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0001\u0000"+
		"\u0000\u0000\u025f\u0261\u0003~?\u0000\u0260\u025f\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000"+
		"\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000"+
		"\u0264\u0265\u0003J%\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u024a"+
		"\u0001\u0000\u0000\u0000\u0266\u0257\u0001\u0000\u0000\u0000\u0267y\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0005\u001d\u0000\u0000\u0269\u026a\u0003"+
		"\"\u0011\u0000\u026a\u026b\u0005\u001e\u0000\u0000\u026b{\u0001\u0000"+
		"\u0000\u0000\u026c\u0270\u0005\u001f\u0000\u0000\u026d\u026e\u0003\f\u0006"+
		"\u0000\u026e\u026f\u0003\u0006\u0003\u0000\u026f\u0271\u0001\u0000\u0000"+
		"\u0000\u0270\u026d\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000"+
		"\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000"+
		"\u0000\u0273}\u0001\u0000\u0000\u0000\u0274\u0275\u0005 \u0000\u0000\u0275"+
		"\u0276\u0003\"\u0011\u0000\u0276\u027a\u0005\u001e\u0000\u0000\u0277\u0278"+
		"\u0003\f\u0006\u0000\u0278\u0279\u0003\u0006\u0003\u0000\u0279\u027b\u0001"+
		"\u0000\u0000\u0000\u027a\u0277\u0001\u0000\u0000\u0000\u027b\u027c\u0001"+
		"\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001"+
		"\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000\u0000\u027e\u0280\u0003"+
		"|>\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000"+
		"\u0000\u0280\u007f\u0001\u0000\u0000\u0000\u0281\u0285\u0005-\u0000\u0000"+
		"\u0282\u0283\u0003\f\u0006\u0000\u0283\u0284\u0003\u0006\u0003\u0000\u0284"+
		"\u0286\u0001\u0000\u0000\u0000\u0285\u0282\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u0003J%\u0000\u028a\u02a8\u0001\u0000\u0000\u0000\u028b\u028c\u0005"+
		"-\u0000\u0000\u028c\u028e\u0003\u0082A\u0000\u028d\u028f\u0003\u0084B"+
		"\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000"+
		"\u0000\u028f\u0293\u0001\u0000\u0000\u0000\u0290\u0291\u0003\f\u0006\u0000"+
		"\u0291\u0292\u0003\u0006\u0003\u0000\u0292\u0294\u0001\u0000\u0000\u0000"+
		"\u0293\u0290\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000"+
		"\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000"+
		"\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0003J%\u0000\u0298\u02a8"+
		"\u0001\u0000\u0000\u0000\u0299\u029a\u0005-\u0000\u0000\u029a\u029c\u0003"+
		"\u0084B\u0000\u029b\u029d\u0003\u0082A\u0000\u029c\u029b\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u02a1\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0003\f\u0006\u0000\u029f\u02a0\u0003\u0006\u0003\u0000"+
		"\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u029e\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a6\u0003J%\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7\u0281"+
		"\u0001\u0000\u0000\u0000\u02a7\u028b\u0001\u0000\u0000\u0000\u02a7\u0299"+
		"\u0001\u0000\u0000\u0000\u02a8\u0081\u0001\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0005.\u0000\u0000\u02aa\u02ab\u0005M\u0000\u0000\u02ab\u02ac\u0003\""+
		"\u0011\u0000\u02ac\u02ad\u0005N\u0000\u0000\u02ad\u0083\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0005/\u0000\u0000\u02af\u02b0\u0005M\u0000\u0000\u02b0"+
		"\u02b1\u0003\"\u0011\u0000\u02b1\u02b2\u0005N\u0000\u0000\u02b2\u0085"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005\u0010\u0000\u0000\u02b4\u02b5"+
		"\u0003B!\u0000\u02b5\u02b6\u0003B!\u0000\u02b6\u02b7\u0003R)\u0000\u02b7"+
		"\u02be\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005L\u0000\u0000\u02b9\u02ba"+
		"\u0003B!\u0000\u02ba\u02bb\u0003R)\u0000\u02bb\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bc\u02b8\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000"+
		"\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000"+
		"\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c3\u0005L\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0005\r\u0000\u0000\u02c5\u0087\u0001\u0000\u0000\u0000\u02c6"+
		"\u02cb\u0003\u0090H\u0000\u02c7\u02cb\u0003\u008cF\u0000\u02c8\u02cb\u0003"+
		"\u008aE\u0000\u02c9\u02cb\u0003\u008eG\u0000\u02ca\u02c6\u0001\u0000\u0000"+
		"\u0000\u02ca\u02c7\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02cb\u0089\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0005?\u0000\u0000\u02cd\u008b\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u0005>\u0000\u0000\u02cf\u008d\u0001\u0000\u0000\u0000\u02d0"+
		"\u02d1\u0005@\u0000\u0000\u02d1\u008f\u0001\u0000\u0000\u0000\u02d2\u02d3"+
		"\u0005=\u0000\u0000\u02d3\u0091\u0001\u0000\u0000\u0000O\u0093\u0096\u00a5"+
		"\u00ad\u00b1\u00bc\u00bf\u00c3\u00c7\u00cc\u00d0\u00d4\u00d8\u00dc\u00df"+
		"\u00f0\u00f6\u00fa\u0101\u0108\u010b\u0111\u0118\u0121\u012c\u0137\u0142"+
		"\u014d\u0159\u0164\u016f\u017a\u0181\u0185\u0193\u019d\u01a7\u01af\u01b3"+
		"\u01ba\u01bf\u01c9\u01cd\u01d4\u01e2\u01e6\u01ea\u01fb\u0201\u0207\u020b"+
		"\u0210\u0219\u0220\u0223\u0226\u0229\u022c\u022f\u0231\u023b\u0248\u0250"+
		"\u0253\u025d\u0262\u0266\u0272\u027c\u027f\u0287\u028e\u0295\u029c\u02a3"+
		"\u02a7\u02be\u02c2\u02ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}