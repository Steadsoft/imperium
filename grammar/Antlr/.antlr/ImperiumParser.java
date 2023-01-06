// Generated from d:\Git\GitHub\Steadsoft\imperium\grammar\Antlr\ImperiumParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImperiumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ISNOTAKEYWORD=1, ALIGNED=2, ARGUMENT=3, AUTOMATIC=4, BASED=5, BINARY=6, 
		BIT=7, BOOLEAN=8, BUILTIN=9, BY=10, BYPASS=11, CALL=12, CHARACTER=13, 
		COFUNCTION=14, COROUTINE=15, DECIMAL=16, DECLARE=17, DEFINE=18, DEFINED=19, 
		ELIF=20, ELSE=21, END=22, ENDLOOP=23, ENTRY=24, ENUM=25, FIXED=26, FLOAT=27, 
		FUNCTION=28, GO=29, GOTO=30, IF=31, INC=32, INCLUDE=33, INTERNAL=34, INTERRUPT=35, 
		INTRINSIC=36, LANGUAGE=37, LOOP=38, NAMESPACE=39, OFFSET=40, OUT=41, PAD=42, 
		POINTER=43, PRIVATE=44, PROCEDURE=45, PUBLIC=46, READONLY=47, REF=48, 
		RELOOP=49, RETURN=50, RETURNS=51, RETURNON=52, SINGLET=53, STATIC=54, 
		STRING=55, STRUCTURE=56, THEN=57, TO=58, TYPE=59, UNALIGNED=60, UNTIL=61, 
		USING=62, WHILE=63, VARIABLE=64, VARYING=65, YIELD=66, ARG=67, BIN=68, 
		DCL=69, DEC=70, DEF=71, FUNC=72, PROC=73, PTR=74, STRUCT=75, COMMENT=76, 
		LINE_COMMENT=77, WS=78, NEWLINE=79, TAB=80, BYTE_ORDER_MARK=81, BASE_B=82, 
		BASE_O=83, BASE_D=84, BASE_H=85, FRAC_B=86, FRAC_D=87, FRAC_O=88, FRAC_H=89, 
		IDENTIFIER=90, BINARY_PATTERN=91, OCTAL_PATTERN=92, HEXADECIMAL_PATTERN=93, 
		DECIMAL_PATTERN=94, LSEP=95, OCT=96, HEX=97, SHORT_OR=98, OR=99, AND=100, 
		SHORT_AND=101, ARROW=102, DOT=103, COMMA=104, LPAR=105, RPAR=106, LBRACK=107, 
		RBRACK=108, LBRACE=109, RBRACE=110, EQUALS=111, TIMES=112, DIVIDE=113, 
		PLUS=114, MINUS=115, SEMICOLON=116, POWER=117, COLON=118, DQUOTE=119, 
		QUOTE=120, QMARK=121, PERCNT=122, TILDE=123, CONC=124, GT=125, LT=126, 
		GTE=127, LTE=128, TGT=129, TEQ=130, TLT=131, GTGT=132, LTLT=133, GTGTGT=134, 
		LTLTLT=135;
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'?|'", "'|'", "'&'", "'?&'", "'->'", "'.'", "','", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'='", "'*'", "'/'", "'+'", "'-'", 
			"';'", "'**'", "':'", "'\"'", "'''", "'?'", "'%'", "'~'", "'||'", "'>'", 
			"'<'", "'>='", "'<='", "'~>'", "'~='", "'<~'", "'>>'", "'<<'", "'>>>'", 
			"'<<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ISNOTAKEYWORD", "ALIGNED", "ARGUMENT", "AUTOMATIC", "BASED", "BINARY", 
			"BIT", "BOOLEAN", "BUILTIN", "BY", "BYPASS", "CALL", "CHARACTER", "COFUNCTION", 
			"COROUTINE", "DECIMAL", "DECLARE", "DEFINE", "DEFINED", "ELIF", "ELSE", 
			"END", "ENDLOOP", "ENTRY", "ENUM", "FIXED", "FLOAT", "FUNCTION", "GO", 
			"GOTO", "IF", "INC", "INCLUDE", "INTERNAL", "INTERRUPT", "INTRINSIC", 
			"LANGUAGE", "LOOP", "NAMESPACE", "OFFSET", "OUT", "PAD", "POINTER", "PRIVATE", 
			"PROCEDURE", "PUBLIC", "READONLY", "REF", "RELOOP", "RETURN", "RETURNS", 
			"RETURNON", "SINGLET", "STATIC", "STRING", "STRUCTURE", "THEN", "TO", 
			"TYPE", "UNALIGNED", "UNTIL", "USING", "WHILE", "VARIABLE", "VARYING", 
			"YIELD", "ARG", "BIN", "DCL", "DEC", "DEF", "FUNC", "PROC", "PTR", "STRUCT", 
			"COMMENT", "LINE_COMMENT", "WS", "NEWLINE", "TAB", "BYTE_ORDER_MARK", 
			"BASE_B", "BASE_O", "BASE_D", "BASE_H", "FRAC_B", "FRAC_D", "FRAC_O", 
			"FRAC_H", "IDENTIFIER", "BINARY_PATTERN", "OCTAL_PATTERN", "HEXADECIMAL_PATTERN", 
			"DECIMAL_PATTERN", "LSEP", "OCT", "HEX", "SHORT_OR", "OR", "AND", "SHORT_AND", 
			"ARROW", "DOT", "COMMA", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "EQUALS", "TIMES", "DIVIDE", "PLUS", "MINUS", "SEMICOLON", 
			"POWER", "COLON", "DQUOTE", "QUOTE", "QMARK", "PERCNT", "TILDE", "CONC", 
			"GT", "LT", "GTE", "LTE", "TGT", "TEQ", "TLT", "GTGT", "LTLT", "GTGTGT", 
			"LTLTLT"
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
	public String getGrammarFileName() { return "ImperiumParser.g4"; }

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
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt_block);
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
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
	public static class PREContext extends Nonexecutable_stmtContext {
		public Preprocessor_stmtContext preprocessor_stmt() {
			return getRuleContext(Preprocessor_stmtContext.class,0);
		}
		public PREContext(Nonexecutable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class DEFContext extends Nonexecutable_stmtContext {
		public Define_stmtContext define_stmt() {
			return getRuleContext(Define_stmtContext.class,0);
		}
		public DEFContext(Nonexecutable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class DCLContext extends Nonexecutable_stmtContext {
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public DCLContext(Nonexecutable_stmtContext ctx) { copyFrom(ctx); }
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
			case ARGUMENT:
			case DECLARE:
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
	public static class RETContext extends Executable_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public RETContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class CALLContext extends Executable_stmtContext {
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public CALLContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class GOTOContext extends Executable_stmtContext {
		public Goto_stmtContext goto_stmt() {
			return getRuleContext(Goto_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public GOTOContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class PROCContext extends Executable_stmtContext {
		public Procedure_stmtContext procedure_stmt() {
			return getRuleContext(Procedure_stmtContext.class,0);
		}
		public PROCContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class AGAINContext extends Executable_stmtContext {
		public Reloop_stmtContext reloop_stmt() {
			return getRuleContext(Reloop_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public AGAINContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class LOOPContext extends Executable_stmtContext {
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public LOOPContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class LEAVEContext extends Executable_stmtContext {
		public Endloop_stmtContext endloop_stmt() {
			return getRuleContext(Endloop_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public LEAVEContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class ASSIGNContext extends Executable_stmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public ASSIGNContext(Executable_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class IFContext extends Executable_stmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public IFContext(Executable_stmtContext ctx) { copyFrom(ctx); }
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
	public static class BASIC_REFContext extends ReferenceContext {
		public Basic_referenceContext basic_reference() {
			return getRuleContext(Basic_referenceContext.class,0);
		}
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public BASIC_REFContext(ReferenceContext ctx) { copyFrom(ctx); }
	}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << BIT) | (1L << BUILTIN) | (1L << CALL) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COROUTINE) | (1L << DECLARE) | (1L << DEFINE) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENDLOOP) | (1L << ENTRY) | (1L << FIXED) | (1L << FLOAT) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << INTRINSIC) | (1L << LOOP) | (1L << OFFSET) | (1L << POINTER) | (1L << PROCEDURE) | (1L << RELOOP) | (1L << RETURN) | (1L << RETURNS) | (1L << STRING) | (1L << THEN) | (1L << TO) | (1L << UNTIL) | (1L << WHILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (VARYING - 65)) | (1L << (PROC - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (BINARY_PATTERN - 65)) | (1L << (OCTAL_PATTERN - 65)) | (1L << (HEXADECIMAL_PATTERN - 65)) | (1L << (DECIMAL_PATTERN - 65)) | (1L << (LPAR - 65)) | (1L << (PLUS - 65)) | (1L << (MINUS - 65)) | (1L << (TILDE - 65)))) != 0) );
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

	public static class SubscriptContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
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
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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

	public static class Prefix_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(ImperiumParser.TILDE, 0); }
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
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
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (PLUS - 114)) | (1L << (MINUS - 114)) | (1L << (TILDE - 114)))) != 0)) ) {
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
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (EQUALS - 111)) | (1L << (GT - 111)) | (1L << (LT - 111)) | (1L << (GTE - 111)) | (1L << (LTE - 111)) | (1L << (TGT - 111)) | (1L << (TEQ - 111)) | (1L << (TLT - 111)))) != 0)) ) {
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

	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode GTGT() { return getToken(ImperiumParser.GTGT, 0); }
		public TerminalNode LTLT() { return getToken(ImperiumParser.LTLT, 0); }
		public TerminalNode GTGTGT() { return getToken(ImperiumParser.GTGTGT, 0); }
		public TerminalNode LTLTLT() { return getToken(ImperiumParser.LTLTLT, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
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
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GTGT - 132)) | (1L << (LTLT - 132)) | (1L << (GTGTGT - 132)) | (1L << (LTLTLT - 132)))) != 0)) ) {
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
	public static class Identifier_IDENTIFIERContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public Identifier_IDENTIFIERContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class KEYWDContext extends IdentifierContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public KEYWDContext(IdentifierContext ctx) { copyFrom(ctx); }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << BIT) | (1L << BUILTIN) | (1L << CALL) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COROUTINE) | (1L << DECLARE) | (1L << DEFINE) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENDLOOP) | (1L << ENTRY) | (1L << FIXED) | (1L << FLOAT) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << INTRINSIC) | (1L << LOOP) | (1L << OFFSET) | (1L << POINTER) | (1L << PROCEDURE) | (1L << RELOOP) | (1L << RETURN) | (1L << RETURNS) | (1L << STRING) | (1L << THEN) | (1L << TO) | (1L << UNTIL) | (1L << WHILE))) != 0) || _la==VARYING || _la==PROC) ) {
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

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
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

	public static class End_stmtContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public End_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_stmt; }
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

	public static class Endloop_stmtContext extends ParserRuleContext {
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public Endloop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endloop_stmt; }
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

	public static class Reloop_stmtContext extends ParserRuleContext {
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public Reloop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloop_stmt; }
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
			if ( !(_la==ARGUMENT || _la==DECLARE) ) {
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
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (AUTOMATIC - 4)) | (1L << (BASED - 4)) | (1L << (BINARY - 4)) | (1L << (BIT - 4)) | (1L << (BUILTIN - 4)) | (1L << (CHARACTER - 4)) | (1L << (COFUNCTION - 4)) | (1L << (COROUTINE - 4)) | (1L << (DECIMAL - 4)) | (1L << (DEFINED - 4)) | (1L << (ENTRY - 4)) | (1L << (FIXED - 4)) | (1L << (FLOAT - 4)) | (1L << (INTRINSIC - 4)) | (1L << (OFFSET - 4)) | (1L << (POINTER - 4)) | (1L << (STATIC - 4)) | (1L << (STRING - 4)) | (1L << (VARIABLE - 4)) | (1L << (VARYING - 4)))) != 0)) {
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
	}

	public final Bound_pairContext bound_pair() throws RecognitionException {
		Bound_pairContext _localctx = new Bound_pairContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bound_pair);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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

	public static class Lower_boundContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lower_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower_bound; }
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

	public static class Upper_boundContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Upper_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_bound; }
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
	public static class INTRContext extends Data_attributeContext {
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public INTRContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class DECContext extends Data_attributeContext {
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public DECContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class BINContext extends Data_attributeContext {
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public BINContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class CORContext extends Data_attributeContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public CORContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class CHARContext extends Data_attributeContext {
		public TerminalNode CHARACTER() { return getToken(ImperiumParser.CHARACTER, 0); }
		public CHARContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class ENTContext extends Data_attributeContext {
		public TerminalNode ENTRY() { return getToken(ImperiumParser.ENTRY, 0); }
		public ENTContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class BITContext extends Data_attributeContext {
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public Max_lengthContext max_length() {
			return getRuleContext(Max_lengthContext.class,0);
		}
		public BITContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class OFFContext extends Data_attributeContext {
		public TerminalNode OFFSET() { return getToken(ImperiumParser.OFFSET, 0); }
		public OFFContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class VNGContext extends Data_attributeContext {
		public TerminalNode VARYING() { return getToken(ImperiumParser.VARYING, 0); }
		public VNGContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class PTRContext extends Data_attributeContext {
		public TerminalNode POINTER() { return getToken(ImperiumParser.POINTER, 0); }
		public PTRContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class FLTContext extends Data_attributeContext {
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public FLTContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class STRContext extends Data_attributeContext {
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public Max_lengthContext max_length() {
			return getRuleContext(Max_lengthContext.class,0);
		}
		public STRContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class FIXContext extends Data_attributeContext {
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public FIXContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class COFContext extends Data_attributeContext {
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public COFContext(Data_attributeContext ctx) { copyFrom(ctx); }
	}
	public static class BLTNContext extends Data_attributeContext {
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public BLTNContext(Data_attributeContext ctx) { copyFrom(ctx); }
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
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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
			case ARGUMENT:
			case BIT:
			case BUILTIN:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COROUTINE:
			case DECLARE:
			case DEFINE:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case FIXED:
			case FLOAT:
			case GO:
			case GOTO:
			case IF:
			case INTRINSIC:
			case LOOP:
			case OFFSET:
			case POINTER:
			case PROCEDURE:
			case RELOOP:
			case RETURN:
			case RETURNS:
			case STRING:
			case THEN:
			case TO:
			case UNTIL:
			case WHILE:
			case VARYING:
			case PROC:
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

	public static class Coprocedure_specifierContext extends ParserRuleContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public Coprocedure_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coprocedure_specifier; }
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
			if ( !(_la==COFUNCTION || _la==COROUTINE) ) {
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

	public static class Returns_descriptorContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(ImperiumParser.RETURNS, 0); }
		public Data_attributeContext data_attribute() {
			return getRuleContext(Data_attributeContext.class,0);
		}
		public Returns_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_descriptor; }
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
	}
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
	}
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

	public static class Hexadecimal_literalContext extends ParserRuleContext {
		public TerminalNode HEXADECIMAL_PATTERN() { return getToken(ImperiumParser.HEXADECIMAL_PATTERN, 0); }
		public Hexadecimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimal_literal; }
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

	public static class Octal_literalContext extends ParserRuleContext {
		public TerminalNode OCTAL_PATTERN() { return getToken(ImperiumParser.OCTAL_PATTERN, 0); }
		public Octal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_literal; }
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

	public static class Decimal_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_PATTERN() { return getToken(ImperiumParser.DECIMAL_PATTERN, 0); }
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
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

	public static class Binary_literalContext extends ParserRuleContext {
		public TerminalNode BINARY_PATTERN() { return getToken(ImperiumParser.BINARY_PATTERN, 0); }
		public Binary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_literal; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0089\u02d7\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\5\2\u0096\n\2\3\2\5\2\u0099\n\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4\u00a6\n\4\f\4\16\4\u00a9\13\4\3\4\3\4\3\4\7\4"+
		"\u00ae\n\4\f\4\16\4\u00b1\13\4\3\4\5\4\u00b4\n\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\5\7\u00bf\n\7\3\b\5\b\u00c2\n\b\3\b\3\b\5\b\u00c6\n\b\3"+
		"\b\3\b\5\b\u00ca\n\b\3\b\3\b\3\b\5\b\u00cf\n\b\3\b\3\b\5\b\u00d3\n\b\3"+
		"\b\3\b\5\b\u00d7\n\b\3\b\3\b\5\b\u00db\n\b\3\b\3\b\5\b\u00df\n\b\3\b\5"+
		"\b\u00e2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u00f3\n\13\3\13\3\13\3\13\3\13\5\13\u00f9\n\13\7\13\u00fb\n"+
		"\13\f\13\16\13\u00fe\13\13\3\f\3\f\6\f\u0102\n\f\r\f\16\f\u0103\3\f\3"+
		"\f\3\r\6\r\u0109\n\r\r\r\16\r\u010a\3\16\5\16\u010e\n\16\3\16\3\16\3\17"+
		"\3\17\5\17\u0114\n\17\3\17\3\17\3\20\6\20\u0119\n\20\r\20\16\20\u011a"+
		"\3\21\3\21\3\22\3\22\3\22\7\22\u0122\n\22\f\22\16\22\u0125\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u012d\n\23\f\23\16\23\u0130\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0138\n\24\f\24\16\24\u013b\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0143\n\25\f\25\16\25\u0146\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u014e\n\26\f\26\16\26\u0151\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u015a\n\27\f\27\16\27\u015d\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0165\n\30\f\30\16\30\u0168\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0170\n\31\f\31\16\31\u0173\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u017b\n\32\f\32\16\32\u017e\13\32"+
		"\3\33\3\33\3\33\3\33\5\33\u0184\n\33\3\34\3\34\5\34\u0188\n\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u0196\n\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\5#\u01a0\n#\3$\3$\3%\3%\3%\3&\3&\3&\5&\u01aa"+
		"\n&\3&\3&\3\'\3\'\3(\3(\5(\u01b2\n(\3)\3)\5)\u01b6\n)\3*\3*\3*\3*\3+\5"+
		"+\u01bd\n+\3+\7+\u01c0\n+\f+\16+\u01c3\13+\3,\3,\3,\3,\3-\3-\3-\5-\u01cc"+
		"\n-\3-\3-\5-\u01d0\n-\3.\3.\3.\7.\u01d5\n.\f.\16.\u01d8\13.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01e5\n\61\3\62\3\62\5\62"+
		"\u01e9\n\62\3\62\3\62\5\62\u01ed\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01fe\n\62\3\63\3\63"+
		"\3\63\3\63\5\63\u0204\n\63\3\63\3\63\3\64\3\64\5\64\u020a\n\64\3\65\3"+
		"\65\5\65\u020e\n\65\3\66\3\66\3\66\5\66\u0213\n\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u021c\n\67\38\38\38\38\38\58\u0223\n8\39\59\u0226"+
		"\n9\39\59\u0229\n9\39\59\u022c\n9\39\59\u022f\n9\39\59\u0232\n9\59\u0234"+
		"\n9\3:\3:\3;\3;\3;\3;\7;\u023c\n;\f;\16;\u023f\13;\3;\3;\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\5=\u024b\n=\3>\3>\3>\3>\6>\u0251\n>\r>\16>\u0252\3>\5>\u0256"+
		"\n>\3>\3>\3>\3>\3>\3>\6>\u025e\n>\r>\16>\u025f\3>\6>\u0263\n>\r>\16>\u0264"+
		"\3>\3>\5>\u0269\n>\3?\3?\3?\3?\3@\3@\3@\3@\6@\u0273\n@\r@\16@\u0274\3"+
		"A\3A\3A\3A\3A\3A\6A\u027d\nA\rA\16A\u027e\3A\5A\u0282\nA\3B\3B\3B\3B\6"+
		"B\u0288\nB\rB\16B\u0289\3B\3B\3B\3B\3B\5B\u0291\nB\3B\3B\3B\6B\u0296\n"+
		"B\rB\16B\u0297\3B\3B\3B\3B\3B\5B\u029f\nB\3B\3B\3B\6B\u02a4\nB\rB\16B"+
		"\u02a5\3B\3B\5B\u02aa\nB\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\7E\u02bf\nE\fE\16E\u02c2\13E\3E\5E\u02c5\nE\3E\3E\3F\3F\3"+
		"F\3F\5F\u02cd\nF\3G\3G\3H\3H\3I\3I\3J\3J\3J\2\13\24$&(*,.\60\62K\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\2\13\4\2ee}}\3\2tu\3\2rs\4\2tu}}\4\2qq\177\u0085\3\2\u0086"+
		"\u0089\26\2\5\5\t\t\13\13\16\21\23\24\26\32\34\35\37!&&((**--//\63\65"+
		"99;<??AACCKK\4\2\5\5\23\23\3\2\20\21\2\u02fb\2\u0095\3\2\2\2\4\u009c\3"+
		"\2\2\2\6\u00b3\3\2\2\2\b\u00b5\3\2\2\2\n\u00b7\3\2\2\2\f\u00be\3\2\2\2"+
		"\16\u00e1\3\2\2\2\20\u00e3\3\2\2\2\22\u00eb\3\2\2\2\24\u00ef\3\2\2\2\26"+
		"\u00ff\3\2\2\2\30\u0108\3\2\2\2\32\u010d\3\2\2\2\34\u0111\3\2\2\2\36\u0118"+
		"\3\2\2\2 \u011c\3\2\2\2\"\u011e\3\2\2\2$\u0126\3\2\2\2&\u0131\3\2\2\2"+
		"(\u013c\3\2\2\2*\u0147\3\2\2\2,\u0152\3\2\2\2.\u015e\3\2\2\2\60\u0169"+
		"\3\2\2\2\62\u0174\3\2\2\2\64\u0183\3\2\2\2\66\u0187\3\2\2\28\u018c\3\2"+
		"\2\2:\u018f\3\2\2\2<\u0195\3\2\2\2>\u0197\3\2\2\2@\u0199\3\2\2\2B\u019b"+
		"\3\2\2\2D\u019f\3\2\2\2F\u01a1\3\2\2\2H\u01a3\3\2\2\2J\u01a9\3\2\2\2L"+
		"\u01ad\3\2\2\2N\u01af\3\2\2\2P\u01b3\3\2\2\2R\u01b7\3\2\2\2T\u01bc\3\2"+
		"\2\2V\u01c4\3\2\2\2X\u01cf\3\2\2\2Z\u01d1\3\2\2\2\\\u01d9\3\2\2\2^\u01db"+
		"\3\2\2\2`\u01e4\3\2\2\2b\u01fd\3\2\2\2d\u01ff\3\2\2\2f\u0209\3\2\2\2h"+
		"\u020d\3\2\2\2j\u020f\3\2\2\2l\u0216\3\2\2\2n\u021d\3\2\2\2p\u0225\3\2"+
		"\2\2r\u0235\3\2\2\2t\u0237\3\2\2\2v\u0242\3\2\2\2x\u0245\3\2\2\2z\u0268"+
		"\3\2\2\2|\u026a\3\2\2\2~\u026e\3\2\2\2\u0080\u0276\3\2\2\2\u0082\u02a9"+
		"\3\2\2\2\u0084\u02ab\3\2\2\2\u0086\u02b0\3\2\2\2\u0088\u02b5\3\2\2\2\u008a"+
		"\u02cc\3\2\2\2\u008c\u02ce\3\2\2\2\u008e\u02d0\3\2\2\2\u0090\u02d2\3\2"+
		"\2\2\u0092\u02d4\3\2\2\2\u0094\u0096\7S\2\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\20\t\2\u0098\u0097\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5\4\3\2\u009b"+
		"\3\3\2\2\2\u009c\u009d\7/\2\2\u009d\u009e\5D#\2\u009e\u009f\5p9\2\u009f"+
		"\u00a0\5\6\4\2\u00a0\u00a1\5L\'\2\u00a1\5\3\2\2\2\u00a2\u00a3\5\f\7\2"+
		"\u00a3\u00a4\5\b\5\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00af\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\5\b\5\2\u00ac\u00ae\3"+
		"\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5\b"+
		"\5\2\u00b3\u00a7\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\7\3\2\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\t\3\2\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\5D#\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\13\3\2\2\2\u00bb\u00bf\5\20\t\2\u00bc\u00bf\5R*\2\u00bd"+
		"\u00bf\5\u0088E\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\r\3\2\2\2\u00c0\u00c2\5\n\6\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00e2\5\22\n\2\u00c4\u00c6\5"+
		"\n\6\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00e2\5H%\2\u00c8\u00ca\5\n\6\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00e2\5J&\2\u00cc\u00e2\5\4\3\2\u00cd\u00cf"+
		"\5\n\6\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00e2\5x=\2\u00d1\u00d3\5\n\6\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2"+
		"\2\u00d3\u00d4\3\2\2\2\u00d4\u00e2\5z>\2\u00d5\u00d7\5\n\6\2\u00d6\u00d5"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e2\5\u0082B"+
		"\2\u00d9\u00db\5\n\6\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00e2\5N(\2\u00dd\u00df\5\n\6\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\5P)\2\u00e1\u00c1\3\2\2"+
		"\2\u00e1\u00c5\3\2\2\2\u00e1\u00c9\3\2\2\2\u00e1\u00cc\3\2\2\2\u00e1\u00ce"+
		"\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e2\17\3\2\2\2\u00e3\u00e4\7|\2\2\u00e4\u00e5\7#\2\2"+
		"\u00e5\u00e6\7z\2\2\u00e6\u00e7\5D#\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7"+
		"\"\2\2\u00e9\u00ea\7z\2\2\u00ea\21\3\2\2\2\u00eb\u00ec\5\24\13\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\5$\23\2\u00ee\23\3\2\2\2\u00ef\u00f0\b\13\1"+
		"\2\u00f0\u00f2\5\32\16\2\u00f1\u00f3\5\30\r\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00fc\3\2\2\2\u00f4\u00f5\f\4\2\2\u00f5\u00f6\7h"+
		"\2\2\u00f6\u00f8\5\32\16\2\u00f7\u00f9\5\30\r\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\25\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0101\7k\2\2\u0100\u0102\5\"\22\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\7l\2\2\u0106\27\3\2\2\2\u0107\u0109\5\26\f\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\31\3\2\2\2\u010c\u010e\5\36\20\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5D#\2\u0110\33\3\2\2\2\u0111\u0113"+
		"\5D#\2\u0112\u0114\5\26\f\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\7i\2\2\u0116\35\3\2\2\2\u0117\u0119\5\34\17"+
		"\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\37\3\2\2\2\u011c\u011d\5$\23\2\u011d!\3\2\2\2\u011e\u0123"+
		"\5 \21\2\u011f\u0120\7j\2\2\u0120\u0122\5 \21\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124#\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0126\u0127\b\23\1\2\u0127\u0128\5&\24\2\u0128\u012e"+
		"\3\2\2\2\u0129\u012a\f\3\2\2\u012a\u012b\7d\2\2\u012b\u012d\5&\24\2\u012c"+
		"\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f%\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\b\24\1\2\u0132\u0133"+
		"\5(\25\2\u0133\u0139\3\2\2\2\u0134\u0135\f\3\2\2\u0135\u0136\7g\2\2\u0136"+
		"\u0138\5(\25\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\'\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d"+
		"\b\25\1\2\u013d\u013e\5*\26\2\u013e\u0144\3\2\2\2\u013f\u0140\f\3\2\2"+
		"\u0140\u0141\t\2\2\2\u0141\u0143\5*\26\2\u0142\u013f\3\2\2\2\u0143\u0146"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145)\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u0148\b\26\1\2\u0148\u0149\5,\27\2\u0149\u014f\3"+
		"\2\2\2\u014a\u014b\f\3\2\2\u014b\u014c\7f\2\2\u014c\u014e\5,\27\2\u014d"+
		"\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150+\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b\27\1\2\u0153\u0154"+
		"\5.\30\2\u0154\u015b\3\2\2\2\u0155\u0156\f\3\2\2\u0156\u0157\5@!\2\u0157"+
		"\u0158\5.\30\2\u0158\u015a\3\2\2\2\u0159\u0155\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c-\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015e\u015f\b\30\1\2\u015f\u0160\5\60\31\2\u0160\u0166\3\2\2"+
		"\2\u0161\u0162\f\3\2\2\u0162\u0163\7~\2\2\u0163\u0165\5\60\31\2\u0164"+
		"\u0161\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167/\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\b\31\1\2\u016a\u016b"+
		"\5\62\32\2\u016b\u0171\3\2\2\2\u016c\u016d\f\3\2\2\u016d\u016e\t\3\2\2"+
		"\u016e\u0170\5\62\32\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\61\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0175\b\32\1\2\u0175\u0176\5\64\33\2\u0176\u017c\3\2\2\2\u0177\u0178"+
		"\f\3\2\2\u0178\u0179\t\4\2\2\u0179\u017b\5\64\33\2\u017a\u0177\3\2\2\2"+
		"\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\63"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0184\5<\37\2\u0180\u0184\58\35\2\u0181"+
		"\u0184\5:\36\2\u0182\u0184\5\66\34\2\u0183\u017f\3\2\2\2\u0183\u0180\3"+
		"\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\65\3\2\2\2\u0185"+
		"\u0188\5<\37\2\u0186\u0188\5:\36\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018a\7w\2\2\u018a\u018b\5\64\33\2\u018b"+
		"\67\3\2\2\2\u018c\u018d\5> \2\u018d\u018e\5\64\33\2\u018e9\3\2\2\2\u018f"+
		"\u0190\7k\2\2\u0190\u0191\5$\23\2\u0191\u0192\7l\2\2\u0192;\3\2\2\2\u0193"+
		"\u0196\5\u008aF\2\u0194\u0196\5\24\13\2\u0195\u0193\3\2\2\2\u0195\u0194"+
		"\3\2\2\2\u0196=\3\2\2\2\u0197\u0198\t\5\2\2\u0198?\3\2\2\2\u0199\u019a"+
		"\t\6\2\2\u019aA\3\2\2\2\u019b\u019c\t\7\2\2\u019cC\3\2\2\2\u019d\u01a0"+
		"\5F$\2\u019e\u01a0\7\\\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"E\3\2\2\2\u01a1\u01a2\t\b\2\2\u01a2G\3\2\2\2\u01a3\u01a4\7\16\2\2\u01a4"+
		"\u01a5\5\24\13\2\u01a5I\3\2\2\2\u01a6\u01aa\7 \2\2\u01a7\u01a8\7\37\2"+
		"\2\u01a8\u01aa\7<\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ac\5\24\13\2\u01acK\3\2\2\2\u01ad\u01ae\7\30\2\2\u01ae"+
		"M\3\2\2\2\u01af\u01b1\7\31\2\2\u01b0\u01b2\7\\\2\2\u01b1\u01b0\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b2O\3\2\2\2\u01b3\u01b5\7\63\2\2\u01b4\u01b6\7"+
		"\\\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6Q\3\2\2\2\u01b7\u01b8"+
		"\t\t\2\2\u01b8\u01b9\5D#\2\u01b9\u01ba\5T+\2\u01baS\3\2\2\2\u01bb\u01bd"+
		"\5V,\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\3\2\2\2\u01be"+
		"\u01c0\5`\61\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2U\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5"+
		"\7k\2\2\u01c5\u01c6\5Z.\2\u01c6\u01c7\7l\2\2\u01c7W\3\2\2\2\u01c8\u01c9"+
		"\5\\/\2\u01c9\u01ca\7x\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\5^\60\2\u01ce\u01d0\7r"+
		"\2\2\u01cf\u01cb\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0Y\3\2\2\2\u01d1\u01d6"+
		"\5X-\2\u01d2\u01d3\7j\2\2\u01d3\u01d5\5X-\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7[\3\2\2\2"+
		"\u01d8\u01d6\3\2\2\2\u01d9\u01da\5$\23\2\u01da]\3\2\2\2\u01db\u01dc\5"+
		"$\23\2\u01dc_\3\2\2\2\u01dd\u01e5\5b\62\2\u01de\u01e5\7\6\2\2\u01df\u01e5"+
		"\7\13\2\2\u01e0\u01e5\78\2\2\u01e1\u01e5\7B\2\2\u01e2\u01e5\5l\67\2\u01e3"+
		"\u01e5\5n8\2\u01e4\u01dd\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01df\3\2\2"+
		"\2\u01e4\u01e0\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3"+
		"\3\2\2\2\u01e5a\3\2\2\2\u01e6\u01e8\7\b\2\2\u01e7\u01e9\5d\63\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01fe\3\2\2\2\u01ea\u01ec\7\22"+
		"\2\2\u01eb\u01ed\5d\63\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01fe\3\2\2\2\u01ee\u01fe\7-\2\2\u01ef\u01f0\7\t\2\2\u01f0\u01fe\5j\66"+
		"\2\u01f1\u01fe\7\17\2\2\u01f2\u01f3\79\2\2\u01f3\u01fe\5j\66\2\u01f4\u01fe"+
		"\7\32\2\2\u01f5\u01fe\7\34\2\2\u01f6\u01fe\7\35\2\2\u01f7\u01fe\7*\2\2"+
		"\u01f8\u01fe\7C\2\2\u01f9\u01fe\7\21\2\2\u01fa\u01fe\7\20\2\2\u01fb\u01fe"+
		"\7\13\2\2\u01fc\u01fe\7&\2\2\u01fd\u01e6\3\2\2\2\u01fd\u01ea\3\2\2\2\u01fd"+
		"\u01ee\3\2\2\2\u01fd\u01ef\3\2\2\2\u01fd\u01f1\3\2\2\2\u01fd\u01f2\3\2"+
		"\2\2\u01fd\u01f4\3\2\2\2\u01fd\u01f5\3\2\2\2\u01fd\u01f6\3\2\2\2\u01fd"+
		"\u01f7\3\2\2\2\u01fd\u01f8\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fec\3\2\2\2\u01ff\u0200"+
		"\7k\2\2\u0200\u0203\5f\64\2\u0201\u0202\7j\2\2\u0202\u0204\5h\65\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7l"+
		"\2\2\u0206e\3\2\2\2\u0207\u020a\5\u0090I\2\u0208\u020a\5D#\2\u0209\u0207"+
		"\3\2\2\2\u0209\u0208\3\2\2\2\u020ag\3\2\2\2\u020b\u020e\5\u0090I\2\u020c"+
		"\u020e\5D#\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020ei\3\2\2\2\u020f"+
		"\u0212\7k\2\2\u0210\u0213\5\u0090I\2\u0211\u0213\5D#\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7l\2\2\u0215"+
		"k\3\2\2\2\u0216\u021b\7\7\2\2\u0217\u0218\7k\2\2\u0218\u0219\5\24\13\2"+
		"\u0219\u021a\7l\2\2\u021a\u021c\3\2\2\2\u021b\u0217\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021cm\3\2\2\2\u021d\u0222\7\25\2\2\u021e\u021f\7k\2\2\u021f"+
		"\u0220\5\24\13\2\u0220\u0221\7l\2\2\u0221\u0223\3\2\2\2\u0222\u021e\3"+
		"\2\2\2\u0222\u0223\3\2\2\2\u0223o\3\2\2\2\u0224\u0226\5t;\2\u0225\u0224"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0233\3\2\2\2\u0227\u0229\5v<\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u022c\5r"+
		":\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0234\3\2\2\2\u022d"+
		"\u022f\5r:\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2"+
		"\2\u0230\u0232\5v<\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234"+
		"\3\2\2\2\u0233\u0228\3\2\2\2\u0233\u022e\3\2\2\2\u0234q\3\2\2\2\u0235"+
		"\u0236\t\n\2\2\u0236s\3\2\2\2\u0237\u0238\7k\2\2\u0238\u023d\5D#\2\u0239"+
		"\u023a\7j\2\2\u023a\u023c\5D#\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2"+
		"\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0241\7l\2\2\u0241u\3\2\2\2\u0242\u0243\7\65\2\2\u0243"+
		"\u0244\5b\62\2\u0244w\3\2\2\2\u0245\u024a\7\64\2\2\u0246\u0247\7k\2\2"+
		"\u0247\u0248\5$\23\2\u0248\u0249\7l\2\2\u0249\u024b\3\2\2\2\u024a\u0246"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024by\3\2\2\2\u024c\u0250\5|?\2\u024d\u024e"+
		"\5\16\b\2\u024e\u024f\5\b\5\2\u024f\u0251\3\2\2\2\u0250\u024d\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255"+
		"\3\2\2\2\u0254\u0256\5~@\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0258\5L\'\2\u0258\u0269\3\2\2\2\u0259\u025d\5|?"+
		"\2\u025a\u025b\5\16\b\2\u025b\u025c\5\b\5\2\u025c\u025e\3\2\2\2\u025d"+
		"\u025a\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u0262\3\2\2\2\u0261\u0263\5\u0080A\2\u0262\u0261\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2"+
		"\2\2\u0266\u0267\5L\'\2\u0267\u0269\3\2\2\2\u0268\u024c\3\2\2\2\u0268"+
		"\u0259\3\2\2\2\u0269{\3\2\2\2\u026a\u026b\7!\2\2\u026b\u026c\5$\23\2\u026c"+
		"\u026d\7;\2\2\u026d}\3\2\2\2\u026e\u0272\7\27\2\2\u026f\u0270\5\16\b\2"+
		"\u0270\u0271\5\b\5\2\u0271\u0273\3\2\2\2\u0272\u026f\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\177\3\2\2\2\u0276"+
		"\u0277\7\26\2\2\u0277\u0278\5$\23\2\u0278\u027c\7;\2\2\u0279\u027a\5\16"+
		"\b\2\u027a\u027b\5\b\5\2\u027b\u027d\3\2\2\2\u027c\u0279\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2"+
		"\2\2\u0280\u0282\5~@\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0081"+
		"\3\2\2\2\u0283\u0287\7(\2\2\u0284\u0285\5\16\b\2\u0285\u0286\5\b\5\2\u0286"+
		"\u0288\3\2\2\2\u0287\u0284\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0287\3\2"+
		"\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\5L\'\2\u028c"+
		"\u02aa\3\2\2\2\u028d\u028e\7(\2\2\u028e\u0290\5\u0084C\2\u028f\u0291\5"+
		"\u0086D\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0295\3\2\2\2"+
		"\u0292\u0293\5\16\b\2\u0293\u0294\5\b\5\2\u0294\u0296\3\2\2\2\u0295\u0292"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\5L\'\2\u029a\u02aa\3\2\2\2\u029b\u029c\7(\2"+
		"\2\u029c\u029e\5\u0086D\2\u029d\u029f\5\u0084C\2\u029e\u029d\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a3\3\2\2\2\u02a0\u02a1\5\16\b\2\u02a1\u02a2\5"+
		"\b\5\2\u02a2\u02a4\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\5L"+
		"\'\2\u02a8\u02aa\3\2\2\2\u02a9\u0283\3\2\2\2\u02a9\u028d\3\2\2\2\u02a9"+
		"\u029b\3\2\2\2\u02aa\u0083\3\2\2\2\u02ab\u02ac\7A\2\2\u02ac\u02ad\7k\2"+
		"\2\u02ad\u02ae\5$\23\2\u02ae\u02af\7l\2\2\u02af\u0085\3\2\2\2\u02b0\u02b1"+
		"\7?\2\2\u02b1\u02b2\7k\2\2\u02b2\u02b3\5$\23\2\u02b3\u02b4\7l\2\2\u02b4"+
		"\u0087\3\2\2\2\u02b5\u02b6\7\24\2\2\u02b6\u02b7\5D#\2\u02b7\u02b8\5D#"+
		"\2\u02b8\u02b9\5T+\2\u02b9\u02c0\3\2\2\2\u02ba\u02bb\7j\2\2\u02bb\u02bc"+
		"\5D#\2\u02bc\u02bd\5T+\2\u02bd\u02bf\3\2\2\2\u02be\u02ba\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c4\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\7j\2\2\u02c4\u02c3\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\7\30\2\2\u02c7\u0089\3"+
		"\2\2\2\u02c8\u02cd\5\u0092J\2\u02c9\u02cd\5\u008eH\2\u02ca\u02cd\5\u008c"+
		"G\2\u02cb\u02cd\5\u0090I\2\u02cc\u02c8\3\2\2\2\u02cc\u02c9\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u008b\3\2\2\2\u02ce\u02cf\7_"+
		"\2\2\u02cf\u008d\3\2\2\2\u02d0\u02d1\7^\2\2\u02d1\u008f\3\2\2\2\u02d2"+
		"\u02d3\7`\2\2\u02d3\u0091\3\2\2\2\u02d4\u02d5\7]\2\2\u02d5\u0093\3\2\2"+
		"\2Q\u0095\u0098\u00a7\u00af\u00b3\u00be\u00c1\u00c5\u00c9\u00ce\u00d2"+
		"\u00d6\u00da\u00de\u00e1\u00f2\u00f8\u00fc\u0103\u010a\u010d\u0113\u011a"+
		"\u0123\u012e\u0139\u0144\u014f\u015b\u0166\u0171\u017c\u0183\u0187\u0195"+
		"\u019f\u01a9\u01b1\u01b5\u01bc\u01c1\u01cb\u01cf\u01d6\u01e4\u01e8\u01ec"+
		"\u01fd\u0203\u0209\u020d\u0212\u021b\u0222\u0225\u0228\u022b\u022e\u0231"+
		"\u0233\u023d\u024a\u0252\u0255\u025f\u0264\u0268\u0274\u027e\u0281\u0289"+
		"\u0290\u0297\u029e\u02a5\u02a9\u02c0\u02c4\u02cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}