// Generated from d:\Git\GitHub\Steadsoft\imperium\grammar\Antlr\Imperium.g4 by ANTLR 4.9.2
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
		STRING_LITERAL_1=1, EMITSTART=2, EMIT=3, ALIAS=4, ALIGNED=5, ALL=6, ANY=7, 
		ARGUMENT=8, AS=9, BASED=10, BINARY=11, BIT=12, BOOLEAN=13, BOOTSTRAP=14, 
		BUILTIN=15, BY=16, BYPASS=17, CALL=18, CHARACTER=19, COFUNCTION=20, COLD=21, 
		COROUTINE=22, DECIMAL=23, DECLARE=24, DEFINE=25, DEFINED=26, ELIF=27, 
		ELSE=28, END=29, ENDLOOP=30, ENTRY=31, ENUM=32, FIXED=33, FLOAT=34, FUNCTION=35, 
		GOTO=36, IF=37, INC=38, INCLUDE=39, INTERNAL=40, INTERRUPT=41, INTRINSIC=42, 
		LANGUAGE=43, LOOP=44, MAIN=45, NAKED=46, NORETURN=47, OFFSET=48, OTHERWISE=49, 
		OUT=50, PAD=51, POINTER=52, PRIVATE=53, PROCEDURE=54, PUBLIC=55, RAW=56, 
		READONLY=57, RECURSIVE=58, REF=59, RELOOP=60, RETAIN=61, RETURN=62, RETURNON=63, 
		RETURNS=64, SCOPE=65, SECTION=66, SELECT=67, SINGLET=68, STACK=69, STATIC=70, 
		STRING=71, STRUCTURE=72, TARGET=73, THEN=74, TO=75, TRAITS=76, TYPE=77, 
		UNALIGNED=78, UNTIL=79, USES=80, USING=81, UTF=82, VARIABLE=83, VARYING=84, 
		WHEN=85, WHILE=86, YIELD=87, COMMENT=88, LINE_COMMENT=89, WS=90, NEWLINE=91, 
		TAB=92, STRING_LITERAL_3=93, STRING_LITERAL_2=94, BYTE_ORDER_MARK=95, 
		LABEL=96, BINARY_PATTERN=97, OCTAL_PATTERN=98, HEXADECIMAL_PATTERN=99, 
		INTEGER=100, DECIMAL_PATTERN=101, IDENTIFIER=102, AT=103, RARROW_U=104, 
		MAPSTO_U=105, DOT=106, COMMA=107, LPAR=108, RPAR=109, LBRACK=110, RBRACK=111, 
		LBRACE=112, RBRACE=113, EQUALS=114, ASSIGN_U=115, TIMES=116, DIVIDE_U=117, 
		PLUS=118, MINUS=119, SEMICOLON=120, POWER_U=121, COLON=122, TRIQUOTE=123, 
		DIQUOTE=124, QUOTE=125, SQUOTE=126, NOT=127, GT=128, LT=129, GTE_U=130, 
		LTE_U=131, NGT=132, NLT=133, NE_U=134, PCNT=135, AND=136, OR=137, NAND=138, 
		NOR=139, XOR_U=140, XNOR_U=141, REDAND=142, REDOR=143, REDNAND=144, REDNOR=145, 
		REDXOR_U=146, REDXNOR_U=147, LOGAND=148, LOGOR=149, CONC=150, L_LOG_SHIFT=151, 
		R_LOG_SHIFT=152, R_ART_SHIFT=153, L_ROTATE_U=154, R_ROTATE_U=155, RANGE=156, 
		A_WS=157, A_NEWLINE=158, A_TAB=159, BAR=160, EMITPUNCTUATOR=161, E_IDENTIFIER=162, 
		ASSCODE=163, E_INTEGER=164;
	public static final int
		RULE_translationUnit = 0, RULE_uses = 1, RULE_scope = 2, RULE_scopeStmt = 3, 
		RULE_scopeEnd = 4, RULE_traits = 5, RULE_traitsEnd = 6, RULE_traitStmt = 7, 
		RULE_declarationTraits = 8, RULE_declarationTrait = 9, RULE_procedureTraits = 10, 
		RULE_procedureTraitsList = 11, RULE_procedureTrait = 12, RULE_procedure = 13, 
		RULE_function = 14, RULE_procedureStmt = 15, RULE_functionStmt = 16, RULE_targetSpec = 17, 
		RULE_procedureAttributes = 18, RULE_functionAttributes = 19, RULE_procedureEnd = 20, 
		RULE_functionEnd = 21, RULE_returnsDescriptor = 22, RULE_terminator = 23, 
		RULE_emitStmt = 24, RULE_labelStmt = 25, RULE_passiveStmt = 26, RULE_activeStmt = 27, 
		RULE_nullStmt = 28, RULE_assignmentStmt = 29, RULE_reference = 30, RULE_arguments = 31, 
		RULE_argumentsList = 32, RULE_basicReference = 33, RULE_structureQualification = 34, 
		RULE_structureQualificationList = 35, RULE_subscript = 36, RULE_subscriptCommalist = 37, 
		RULE_parenthesizedExpression = 38, RULE_primitiveExpression = 39, RULE_prefixExpression = 40, 
		RULE_bitAdjustOperator = 41, RULE_additionOperator = 42, RULE_multiplyOperator = 43, 
		RULE_boolAndOperator = 44, RULE_boolXorOperator = 45, RULE_boolOrOperator = 46, 
		RULE_expression = 47, RULE_map_set = 48, RULE_bool_set = 49, RULE_prefixOperator = 50, 
		RULE_comparisonOperator = 51, RULE_shiftOperator = 52, RULE_callStmt = 53, 
		RULE_gotoStmt = 54, RULE_endloopStmt = 55, RULE_reloopStmt = 56, RULE_declareStmt = 57, 
		RULE_declareAsBody = 58, RULE_declarationBody = 59, RULE_typeInfo = 60, 
		RULE_dimensionSuffix = 61, RULE_boundPair = 62, RULE_boundPairCommalist = 63, 
		RULE_lowerBound = 64, RULE_upperBound = 65, RULE_attribute = 66, RULE_memoryAttribute = 67, 
		RULE_dataAttribute = 68, RULE_linkage_attribute = 69, RULE_utfSpec = 70, 
		RULE_rawSpec = 71, RULE_precision = 72, RULE_numberOfDigits = 73, RULE_scale_factor = 74, 
		RULE_maxStringLength = 75, RULE_maxLength = 76, RULE_based = 77, RULE_defined = 78, 
		RULE_coprocedureSpecifier = 79, RULE_handlerSpecifier = 80, RULE_parameterNameCommalist = 81, 
		RULE_returnStmt = 82, RULE_ifStmt = 83, RULE_ifEnd = 84, RULE_thenClause = 85, 
		RULE_elseClause = 86, RULE_elifClause = 87, RULE_loopStmt = 88, RULE_loopEnd = 89, 
		RULE_whileOption = 90, RULE_untilOption = 91, RULE_selectStmt = 92, RULE_selectEnd = 93, 
		RULE_selectClause = 94, RULE_whenClause = 95, RULE_otherwiseClause = 96, 
		RULE_defineStmt = 97, RULE_enumType = 98, RULE_aliasType = 99, RULE_binaryEnum = 100, 
		RULE_decimalEnum = 101, RULE_stringEnum = 102, RULE_bitEnum = 103, RULE_enumBody = 104, 
		RULE_enumLiteral = 105, RULE_structType = 106, RULE_structBody = 107, 
		RULE_structMemberList = 108, RULE_structSubstruct = 109, RULE_structMember = 110, 
		RULE_stringLiteral = 111, RULE_numericLiteral = 112, RULE_hexLiteral = 113, 
		RULE_octalLiteral = 114, RULE_decimalLiteral = 115, RULE_binaryLiteral = 116, 
		RULE_identifier = 117;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "uses", "scope", "scopeStmt", "scopeEnd", "traits", 
			"traitsEnd", "traitStmt", "declarationTraits", "declarationTrait", "procedureTraits", 
			"procedureTraitsList", "procedureTrait", "procedure", "function", "procedureStmt", 
			"functionStmt", "targetSpec", "procedureAttributes", "functionAttributes", 
			"procedureEnd", "functionEnd", "returnsDescriptor", "terminator", "emitStmt", 
			"labelStmt", "passiveStmt", "activeStmt", "nullStmt", "assignmentStmt", 
			"reference", "arguments", "argumentsList", "basicReference", "structureQualification", 
			"structureQualificationList", "subscript", "subscriptCommalist", "parenthesizedExpression", 
			"primitiveExpression", "prefixExpression", "bitAdjustOperator", "additionOperator", 
			"multiplyOperator", "boolAndOperator", "boolXorOperator", "boolOrOperator", 
			"expression", "map_set", "bool_set", "prefixOperator", "comparisonOperator", 
			"shiftOperator", "callStmt", "gotoStmt", "endloopStmt", "reloopStmt", 
			"declareStmt", "declareAsBody", "declarationBody", "typeInfo", "dimensionSuffix", 
			"boundPair", "boundPairCommalist", "lowerBound", "upperBound", "attribute", 
			"memoryAttribute", "dataAttribute", "linkage_attribute", "utfSpec", "rawSpec", 
			"precision", "numberOfDigits", "scale_factor", "maxStringLength", "maxLength", 
			"based", "defined", "coprocedureSpecifier", "handlerSpecifier", "parameterNameCommalist", 
			"returnStmt", "ifStmt", "ifEnd", "thenClause", "elseClause", "elifClause", 
			"loopStmt", "loopEnd", "whileOption", "untilOption", "selectStmt", "selectEnd", 
			"selectClause", "whenClause", "otherwiseClause", "defineStmt", "enumType", 
			"aliasType", "binaryEnum", "decimalEnum", "stringEnum", "bitEnum", "enumBody", 
			"enumLiteral", "structType", "structBody", "structMemberList", "structSubstruct", 
			"structMember", "stringLiteral", "numericLiteral", "hexLiteral", "octalLiteral", 
			"decimalLiteral", "binaryLiteral", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING_LITERAL_1", "EMITSTART", "EMIT", "ALIAS", "ALIGNED", "ALL", 
			"ANY", "ARGUMENT", "AS", "BASED", "BINARY", "BIT", "BOOLEAN", "BOOTSTRAP", 
			"BUILTIN", "BY", "BYPASS", "CALL", "CHARACTER", "COFUNCTION", "COLD", 
			"COROUTINE", "DECIMAL", "DECLARE", "DEFINE", "DEFINED", "ELIF", "ELSE", 
			"END", "ENDLOOP", "ENTRY", "ENUM", "FIXED", "FLOAT", "FUNCTION", "GOTO", 
			"IF", "INC", "INCLUDE", "INTERNAL", "INTERRUPT", "INTRINSIC", "LANGUAGE", 
			"LOOP", "MAIN", "NAKED", "NORETURN", "OFFSET", "OTHERWISE", "OUT", "PAD", 
			"POINTER", "PRIVATE", "PROCEDURE", "PUBLIC", "RAW", "READONLY", "RECURSIVE", 
			"REF", "RELOOP", "RETAIN", "RETURN", "RETURNON", "RETURNS", "SCOPE", 
			"SECTION", "SELECT", "SINGLET", "STACK", "STATIC", "STRING", "STRUCTURE", 
			"TARGET", "THEN", "TO", "TRAITS", "TYPE", "UNALIGNED", "UNTIL", "USES", 
			"USING", "UTF", "VARIABLE", "VARYING", "WHEN", "WHILE", "YIELD", "COMMENT", 
			"LINE_COMMENT", "WS", "NEWLINE", "TAB", "STRING_LITERAL_3", "STRING_LITERAL_2", 
			"BYTE_ORDER_MARK", "LABEL", "BINARY_PATTERN", "OCTAL_PATTERN", "HEXADECIMAL_PATTERN", 
			"INTEGER", "DECIMAL_PATTERN", "IDENTIFIER", "AT", "RARROW_U", "MAPSTO_U", 
			"DOT", "COMMA", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"EQUALS", "ASSIGN_U", "TIMES", "DIVIDE_U", "PLUS", "MINUS", "SEMICOLON", 
			"POWER_U", "COLON", "TRIQUOTE", "DIQUOTE", "QUOTE", "SQUOTE", "NOT", 
			"GT", "LT", "GTE_U", "LTE_U", "NGT", "NLT", "NE_U", "PCNT", "AND", "OR", 
			"NAND", "NOR", "XOR_U", "XNOR_U", "REDAND", "REDOR", "REDNAND", "REDNOR", 
			"REDXOR_U", "REDXNOR_U", "LOGAND", "LOGOR", "CONC", "L_LOG_SHIFT", "R_LOG_SHIFT", 
			"R_ART_SHIFT", "L_ROTATE_U", "R_ROTATE_U", "RANGE", "A_WS", "A_NEWLINE", 
			"A_TAB", "BAR", "EMITPUNCTUATOR", "E_IDENTIFIER", "ASSCODE", "E_INTEGER"
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
	public String getGrammarFileName() { return "Imperium.g4"; }

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

	public static class TranslationUnitContext extends VisitorContext {
		public TerminalNode EOF() { return getToken(ImperiumParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(ImperiumParser.BYTE_ORDER_MARK, 0); }
		public List<UsesContext> uses() {
			return getRuleContexts(UsesContext.class);
		}
		public UsesContext uses(int i) {
			return getRuleContext(UsesContext.class,i);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TraitsContext> traits() {
			return getRuleContexts(TraitsContext.class);
		}
		public TraitsContext traits(int i) {
			return getRuleContext(TraitsContext.class,i);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(236);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USES) {
				{
				{
				setState(239);
				uses();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << DECLARE) | (1L << DEFINE) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SCOPE - 65)) | (1L << (TRAITS - 65)) | (1L << (SEMICOLON - 65)))) != 0)) {
				{
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOPE:
					{
					setState(245);
					scope();
					}
					break;
				case TRAITS:
					{
					setState(246);
					traits();
					}
					break;
				case ARGUMENT:
				case DECLARE:
				case DEFINE:
				case FUNCTION:
				case PROCEDURE:
				case SEMICOLON:
					{
					setState(247);
					passiveStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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

	public static class UsesContext extends VisitorContext {
		public TerminalNode USES() { return getToken(ImperiumParser.USES, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(ImperiumParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ImperiumParser.DOT, i);
		}
		public UsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uses; }
	}

	public final UsesContext uses() throws RecognitionException {
		UsesContext _localctx = new UsesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_uses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(USES);
			setState(256);
			identifier();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(257);
				match(DOT);
				setState(258);
				identifier();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
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

	public static class ScopeContext extends VisitorContext {
		public ScopeStmtContext scopeStmt() {
			return getRuleContext(ScopeStmtContext.class,0);
		}
		public ScopeEndContext scopeEnd() {
			return getRuleContext(ScopeEndContext.class,0);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TraitsContext> traits() {
			return getRuleContexts(TraitsContext.class);
		}
		public TraitsContext traits(int i) {
			return getRuleContext(TraitsContext.class,i);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			scopeStmt();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << DECLARE) | (1L << DEFINE) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SCOPE - 65)) | (1L << (TRAITS - 65)) | (1L << (SEMICOLON - 65)))) != 0)) {
				{
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOPE:
					{
					setState(267);
					scope();
					}
					break;
				case TRAITS:
					{
					setState(268);
					traits();
					}
					break;
				case ARGUMENT:
				case DECLARE:
				case DEFINE:
				case FUNCTION:
				case PROCEDURE:
				case SEMICOLON:
					{
					setState(269);
					passiveStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			scopeEnd();
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

	public static class ScopeStmtContext extends VisitorContext {
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(ImperiumParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ImperiumParser.DOT, i);
		}
		public TerminalNode PRIVATE() { return getToken(ImperiumParser.PRIVATE, 0); }
		public ScopeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeStmt; }
	}

	public final ScopeStmtContext scopeStmt() throws RecognitionException {
		ScopeStmtContext _localctx = new ScopeStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scopeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SCOPE);
			setState(278);
			identifier();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(279);
				match(DOT);
				setState(280);
				identifier();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(286);
				match(PRIVATE);
				}
			}

			setState(289);
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

	public static class ScopeEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public ScopeEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeEnd; }
	}

	public final ScopeEndContext scopeEnd() throws RecognitionException {
		ScopeEndContext _localctx = new ScopeEndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scopeEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(END);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOPE) {
				{
				setState(292);
				match(SCOPE);
				}
			}

			setState(295);
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

	public static class TraitsContext extends VisitorContext {
		public TraitStmtContext traitStmt() {
			return getRuleContext(TraitStmtContext.class,0);
		}
		public TraitsEndContext traitsEnd() {
			return getRuleContext(TraitsEndContext.class,0);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public TraitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traits; }
	}

	public final TraitsContext traits() throws RecognitionException {
		TraitsContext _localctx = new TraitsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_traits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			traitStmt();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << DECLARE) | (1L << DEFINE) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0) || _la==SEMICOLON) {
				{
				{
				setState(298);
				passiveStmt();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			traitsEnd();
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

	public static class TraitsEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TraitsEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitsEnd; }
	}

	public final TraitsEndContext traitsEnd() throws RecognitionException {
		TraitsEndContext _localctx = new TraitsEndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_traitsEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(END);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRAITS) {
				{
				setState(307);
				match(TRAITS);
				}
			}

			setState(310);
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

	public static class TraitStmtContext extends VisitorContext {
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public DeclarationTraitsContext declarationTraits() {
			return getRuleContext(DeclarationTraitsContext.class,0);
		}
		public ProcedureTraitsContext procedureTraits() {
			return getRuleContext(ProcedureTraitsContext.class,0);
		}
		public TraitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitStmt; }
	}

	public final TraitStmtContext traitStmt() throws RecognitionException {
		TraitStmtContext _localctx = new TraitStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_traitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(TRAITS);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				{
				setState(313);
				declarationTraits();
				}
				break;
			case PROCEDURE:
				{
				setState(314);
				procedureTraits();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
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

	public static class DeclarationTraitsContext extends VisitorContext {
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public List<DeclarationTraitContext> declarationTrait() {
			return getRuleContexts(DeclarationTraitContext.class);
		}
		public DeclarationTraitContext declarationTrait(int i) {
			return getRuleContext(DeclarationTraitContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public DeclarationTraitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTraits; }
	}

	public final DeclarationTraitsContext declarationTraits() throws RecognitionException {
		DeclarationTraitsContext _localctx = new DeclarationTraitsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarationTraits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(DECLARE);
			setState(320);
			match(LPAR);
			setState(321);
			declarationTrait();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(322);
				match(COMMA);
				setState(323);
				declarationTrait();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
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

	public static class DeclarationTraitContext extends VisitorContext {
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode ALIGNED() { return getToken(ImperiumParser.ALIGNED, 0); }
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public DeclarationTraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTrait; }
	}

	public final DeclarationTraitContext declarationTrait() throws RecognitionException {
		DeclarationTraitContext _localctx = new DeclarationTraitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationTrait);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(SECTION);
				setState(332);
				match(LPAR);
				setState(333);
				match(STRING_LITERAL_1);
				setState(334);
				match(RPAR);
				}
				break;
			case ALIGNED:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(ALIGNED);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(336);
					match(LPAR);
					setState(337);
					match(INTEGER);
					setState(338);
					match(RPAR);
					}
				}

				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(RETAIN);
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

	public static class ProcedureTraitsContext extends VisitorContext {
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ProcedureTraitsListContext procedureTraitsList() {
			return getRuleContext(ProcedureTraitsListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ProcedureTraitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureTraits; }
	}

	public final ProcedureTraitsContext procedureTraits() throws RecognitionException {
		ProcedureTraitsContext _localctx = new ProcedureTraitsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedureTraits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(PROCEDURE);
			setState(345);
			match(LPAR);
			setState(346);
			procedureTraitsList();
			setState(347);
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

	public static class ProcedureTraitsListContext extends VisitorContext {
		public List<ProcedureTraitContext> procedureTrait() {
			return getRuleContexts(ProcedureTraitContext.class);
		}
		public ProcedureTraitContext procedureTrait(int i) {
			return getRuleContext(ProcedureTraitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public ProcedureTraitsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureTraitsList; }
	}

	public final ProcedureTraitsListContext procedureTraitsList() throws RecognitionException {
		ProcedureTraitsListContext _localctx = new ProcedureTraitsListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedureTraitsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			procedureTrait();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				procedureTrait();
				}
				}
				setState(356);
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

	public static class ProcedureTraitContext extends VisitorContext {
		public TerminalNode COLD() { return getToken(ImperiumParser.COLD, 0); }
		public TerminalNode NAKED() { return getToken(ImperiumParser.NAKED, 0); }
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public ProcedureTraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureTrait; }
	}

	public final ProcedureTraitContext procedureTrait() throws RecognitionException {
		ProcedureTraitContext _localctx = new ProcedureTraitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedureTrait);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(COLD);
				}
				break;
			case NAKED:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(NAKED);
				}
				break;
			case SECTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(SECTION);
				setState(360);
				match(LPAR);
				setState(361);
				match(STRING_LITERAL_1);
				setState(362);
				match(RPAR);
				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(RETAIN);
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

	public static class ProcedureContext extends VisitorContext {
		public ProcedureStmtContext procedureStmt() {
			return getRuleContext(ProcedureStmtContext.class,0);
		}
		public ProcedureEndContext procedureEnd() {
			return getRuleContext(ProcedureEndContext.class,0);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procedure);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			procedureStmt();
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					passiveStmt();
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					activeStmt();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(379);
			procedureEnd();
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

	public static class FunctionContext extends VisitorContext {
		public FunctionStmtContext functionStmt() {
			return getRuleContext(FunctionStmtContext.class,0);
		}
		public FunctionEndContext functionEnd() {
			return getRuleContext(FunctionEndContext.class,0);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			functionStmt();
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					passiveStmt();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					activeStmt();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(394);
			functionEnd();
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

	public static class ProcedureStmtContext extends VisitorContext {
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public ParameterNameCommalistContext parameterNameCommalist() {
			return getRuleContext(ParameterNameCommalistContext.class,0);
		}
		public ProcedureAttributesContext procedureAttributes() {
			return getRuleContext(ProcedureAttributesContext.class,0);
		}
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ProcedureTraitsListContext procedureTraitsList() {
			return getRuleContext(ProcedureTraitsListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ProcedureStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStmt; }
	}

	public final ProcedureStmtContext procedureStmt() throws RecognitionException {
		ProcedureStmtContext _localctx = new ProcedureStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procedureStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(PROCEDURE);
			setState(397);
			identifier();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(398);
				parameterNameCommalist();
				}
			}

			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COROUTINE) | (1L << INTERRUPT) | (1L << INTRINSIC) | (1L << MAIN) | (1L << RECURSIVE))) != 0)) {
				{
				setState(401);
				procedureAttributes();
				}
			}

			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRAITS) {
				{
				setState(404);
				match(TRAITS);
				setState(405);
				match(LPAR);
				setState(406);
				procedureTraitsList();
				setState(407);
				match(RPAR);
				}
			}

			setState(411);
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

	public static class FunctionStmtContext extends VisitorContext {
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnsDescriptorContext returnsDescriptor() {
			return getRuleContext(ReturnsDescriptorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public ParameterNameCommalistContext parameterNameCommalist() {
			return getRuleContext(ParameterNameCommalistContext.class,0);
		}
		public FunctionAttributesContext functionAttributes() {
			return getRuleContext(FunctionAttributesContext.class,0);
		}
		public FunctionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStmt; }
	}

	public final FunctionStmtContext functionStmt() throws RecognitionException {
		FunctionStmtContext _localctx = new FunctionStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(FUNCTION);
			setState(414);
			identifier();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(415);
				parameterNameCommalist();
				}
			}

			setState(418);
			returnsDescriptor();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COFUNCTION) | (1L << INTRINSIC) | (1L << RECURSIVE))) != 0)) {
				{
				setState(419);
				functionAttributes();
				}
			}

			setState(422);
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

	public static class TargetSpecContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TargetSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetSpec; }
	}

	public final TargetSpecContext targetSpec() throws RecognitionException {
		TargetSpecContext _localctx = new TargetSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_targetSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(LPAR);
			setState(425);
			identifier();
			setState(426);
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

	public static class ProcedureAttributesContext extends VisitorContext {
		public TerminalNode MAIN() { return getToken(ImperiumParser.MAIN, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TargetSpecContext targetSpec() {
			return getRuleContext(TargetSpecContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(ImperiumParser.RECURSIVE, 0); }
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public ProcedureAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAttributes; }
	}

	public final ProcedureAttributesContext procedureAttributes() throws RecognitionException {
		ProcedureAttributesContext _localctx = new ProcedureAttributesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_procedureAttributes);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(MAIN);
				}
				break;
			case INTRINSIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(INTRINSIC);
				setState(430);
				targetSpec();
				}
				break;
			case RECURSIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(RECURSIVE);
				}
				break;
			case INTERRUPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(INTERRUPT);
				}
				break;
			case COROUTINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				match(COROUTINE);
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

	public static class FunctionAttributesContext extends VisitorContext {
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TargetSpecContext targetSpec() {
			return getRuleContext(TargetSpecContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(ImperiumParser.RECURSIVE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public FunctionAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAttributes; }
	}

	public final FunctionAttributesContext functionAttributes() throws RecognitionException {
		FunctionAttributesContext _localctx = new FunctionAttributesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionAttributes);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTRINSIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(INTRINSIC);
				setState(437);
				targetSpec();
				}
				break;
			case RECURSIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(RECURSIVE);
				}
				break;
			case COFUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(COFUNCTION);
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

	public static class ProcedureEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public ProcedureEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureEnd; }
	}

	public final ProcedureEndContext procedureEnd() throws RecognitionException {
		ProcedureEndContext _localctx = new ProcedureEndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_procedureEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(END);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDURE) {
				{
				setState(443);
				match(PROCEDURE);
				}
			}

			setState(446);
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

	public static class FunctionEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public FunctionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionEnd; }
	}

	public final FunctionEndContext functionEnd() throws RecognitionException {
		FunctionEndContext _localctx = new FunctionEndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(END);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(449);
				match(FUNCTION);
				}
			}

			setState(452);
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

	public static class ReturnsDescriptorContext extends VisitorContext {
		public TerminalNode RETURNS() { return getToken(ImperiumParser.RETURNS, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DataAttributeContext dataAttribute() {
			return getRuleContext(DataAttributeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ReturnsDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsDescriptor; }
	}

	public final ReturnsDescriptorContext returnsDescriptor() throws RecognitionException {
		ReturnsDescriptorContext _localctx = new ReturnsDescriptorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnsDescriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(RETURNS);
			setState(455);
			match(LPAR);
			setState(456);
			dataAttribute();
			setState(457);
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

	public static class TerminatorContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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

	public static class EmitStmtContext extends VisitorContext {
		public TerminalNode EMITSTART() { return getToken(ImperiumParser.EMITSTART, 0); }
		public TerminalNode BAR() { return getToken(ImperiumParser.BAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public List<TerminalNode> E_IDENTIFIER() { return getTokens(ImperiumParser.E_IDENTIFIER); }
		public TerminalNode E_IDENTIFIER(int i) {
			return getToken(ImperiumParser.E_IDENTIFIER, i);
		}
		public List<TerminalNode> EMITPUNCTUATOR() { return getTokens(ImperiumParser.EMITPUNCTUATOR); }
		public TerminalNode EMITPUNCTUATOR(int i) {
			return getToken(ImperiumParser.EMITPUNCTUATOR, i);
		}
		public List<TerminalNode> E_INTEGER() { return getTokens(ImperiumParser.E_INTEGER); }
		public TerminalNode E_INTEGER(int i) {
			return getToken(ImperiumParser.E_INTEGER, i);
		}
		public List<TerminalNode> ASSCODE() { return getTokens(ImperiumParser.ASSCODE); }
		public TerminalNode ASSCODE(int i) {
			return getToken(ImperiumParser.ASSCODE, i);
		}
		public EmitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStmt; }
	}

	public final EmitStmtContext emitStmt() throws RecognitionException {
		EmitStmtContext _localctx = new EmitStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_emitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(EMITSTART);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (EMITPUNCTUATOR - 161)) | (1L << (E_IDENTIFIER - 161)) | (1L << (ASSCODE - 161)) | (1L << (E_INTEGER - 161)))) != 0)) {
				{
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (EMITPUNCTUATOR - 161)) | (1L << (E_IDENTIFIER - 161)) | (1L << (ASSCODE - 161)) | (1L << (E_INTEGER - 161)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(BAR);
			setState(469);
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

	public static class LabelStmtContext extends VisitorContext {
		public TerminalNode LABEL() { return getToken(ImperiumParser.LABEL, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public LabelStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelStmt; }
	}

	public final LabelStmtContext labelStmt() throws RecognitionException {
		LabelStmtContext _localctx = new LabelStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_labelStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(LABEL);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(472);
				match(LPAR);
				setState(473);
				decimalLiteral();
				setState(474);
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

	public static class PassiveStmtContext extends VisitorContext {
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public DefineStmtContext defineStmt() {
			return getRuleContext(DefineStmtContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public NullStmtContext nullStmt() {
			return getRuleContext(NullStmtContext.class,0);
		}
		public PassiveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passiveStmt; }
	}

	public final PassiveStmtContext passiveStmt() throws RecognitionException {
		PassiveStmtContext _localctx = new PassiveStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_passiveStmt);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENT:
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				declareStmt();
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				defineStmt();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				procedure();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				function();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				nullStmt();
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

	public static class ActiveStmtContext extends VisitorContext {
		public LabelStmtContext labelStmt() {
			return getRuleContext(LabelStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public EndloopStmtContext endloopStmt() {
			return getRuleContext(EndloopStmtContext.class,0);
		}
		public ReloopStmtContext reloopStmt() {
			return getRuleContext(ReloopStmtContext.class,0);
		}
		public EmitStmtContext emitStmt() {
			return getRuleContext(EmitStmtContext.class,0);
		}
		public NullStmtContext nullStmt() {
			return getRuleContext(NullStmtContext.class,0);
		}
		public ActiveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeStmt; }
	}

	public final ActiveStmtContext activeStmt() throws RecognitionException {
		ActiveStmtContext _localctx = new ActiveStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_activeStmt);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				labelStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				assignmentStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				callStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				gotoStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(490);
				ifStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(491);
				loopStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(492);
				selectStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(493);
				endloopStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(494);
				reloopStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(495);
				emitStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(496);
				nullStmt();
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

	public static class NullStmtContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public NullStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullStmt; }
	}

	public final NullStmtContext nullStmt() throws RecognitionException {
		NullStmtContext _localctx = new NullStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nullStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
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

	public static class AssignmentStmtContext extends VisitorContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN_U() { return getToken(ImperiumParser.ASSIGN_U, 0); }
		public TerminalNode EQUALS() { return getToken(ImperiumParser.EQUALS, 0); }
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			reference(0);
			setState(502);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==ASSIGN_U) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(503);
			expression(0);
			setState(504);
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

	public static class ReferenceContext extends VisitorContext {
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	 
		public ReferenceContext() { }
		public void copyFrom(ReferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicRefContext extends ReferenceContext {
		public BasicReferenceContext basicReference() {
			return getRuleContext(BasicReferenceContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public BasicRefContext(ReferenceContext ctx) { copyFrom(ctx); }
	}
	public static class PtrRefContext extends ReferenceContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode RARROW_U() { return getToken(ImperiumParser.RARROW_U, 0); }
		public BasicReferenceContext basicReference() {
			return getRuleContext(BasicReferenceContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public PtrRefContext(ReferenceContext ctx) { copyFrom(ctx); }
	}

	public final ReferenceContext reference() throws RecognitionException {
		return reference(0);
	}

	private ReferenceContext reference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReferenceContext _localctx = new ReferenceContext(_ctx, _parentState);
		ReferenceContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_reference, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BasicRefContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(507);
			basicReference();
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(508);
				argumentsList();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PtrRefContext(new ReferenceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_reference);
					setState(511);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(512);
					match(RARROW_U);
					setState(513);
					basicReference();
					setState(515);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(514);
						argumentsList();
						}
						break;
					}
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class ArgumentsContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public SubscriptCommalistContext subscriptCommalist() {
			return getRuleContext(SubscriptCommalistContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LPAR);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL_1) | (1L << EMIT) | (1L << ALIAS) | (1L << ALIGNED) | (1L << ALL) | (1L << ANY) | (1L << ARGUMENT) | (1L << AS) | (1L << BASED) | (1L << BINARY) | (1L << BIT) | (1L << BOOLEAN) | (1L << BOOTSTRAP) | (1L << BUILTIN) | (1L << BY) | (1L << BYPASS) | (1L << CALL) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COLD) | (1L << COROUTINE) | (1L << DECIMAL) | (1L << DECLARE) | (1L << DEFINE) | (1L << DEFINED) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENDLOOP) | (1L << ENTRY) | (1L << ENUM) | (1L << FIXED) | (1L << FLOAT) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << INC) | (1L << INCLUDE) | (1L << INTERNAL) | (1L << INTERRUPT) | (1L << INTRINSIC) | (1L << LANGUAGE) | (1L << LOOP) | (1L << MAIN) | (1L << NAKED) | (1L << NORETURN) | (1L << OFFSET) | (1L << OTHERWISE) | (1L << OUT) | (1L << PAD) | (1L << POINTER) | (1L << PRIVATE) | (1L << PROCEDURE) | (1L << PUBLIC) | (1L << RAW) | (1L << READONLY) | (1L << RECURSIVE) | (1L << REF) | (1L << RELOOP) | (1L << RETAIN) | (1L << RETURN) | (1L << RETURNON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURNS - 64)) | (1L << (SCOPE - 64)) | (1L << (SECTION - 64)) | (1L << (SELECT - 64)) | (1L << (SINGLET - 64)) | (1L << (STACK - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCTURE - 64)) | (1L << (TARGET - 64)) | (1L << (THEN - 64)) | (1L << (TO - 64)) | (1L << (TRAITS - 64)) | (1L << (TYPE - 64)) | (1L << (UNALIGNED - 64)) | (1L << (UNTIL - 64)) | (1L << (USES - 64)) | (1L << (USING - 64)) | (1L << (UTF - 64)) | (1L << (VARIABLE - 64)) | (1L << (VARYING - 64)) | (1L << (WHEN - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)) | (1L << (STRING_LITERAL_3 - 64)) | (1L << (STRING_LITERAL_2 - 64)) | (1L << (BINARY_PATTERN - 64)) | (1L << (OCTAL_PATTERN - 64)) | (1L << (HEXADECIMAL_PATTERN - 64)) | (1L << (INTEGER - 64)) | (1L << (DECIMAL_PATTERN - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LPAR - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (REDAND - 142)) | (1L << (REDOR - 142)) | (1L << (REDNAND - 142)) | (1L << (REDNOR - 142)) | (1L << (REDXOR_U - 142)) | (1L << (REDXNOR_U - 142)))) != 0)) {
				{
				setState(523);
				subscriptCommalist();
				}
			}

			setState(526);
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

	public static class ArgumentsListContext extends VisitorContext {
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public ArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsList; }
	}

	public final ArgumentsListContext argumentsList() throws RecognitionException {
		ArgumentsListContext _localctx = new ArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argumentsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(528);
					arguments();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(531); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class BasicReferenceContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructureQualificationListContext structureQualificationList() {
			return getRuleContext(StructureQualificationListContext.class,0);
		}
		public BasicReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicReference; }
	}

	public final BasicReferenceContext basicReference() throws RecognitionException {
		BasicReferenceContext _localctx = new BasicReferenceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_basicReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(533);
				structureQualificationList();
				}
				break;
			}
			setState(536);
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

	public static class StructureQualificationContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ImperiumParser.DOT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StructureQualificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureQualification; }
	}

	public final StructureQualificationContext structureQualification() throws RecognitionException {
		StructureQualificationContext _localctx = new StructureQualificationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structureQualification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			identifier();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(539);
				arguments();
				}
			}

			setState(542);
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

	public static class StructureQualificationListContext extends VisitorContext {
		public List<StructureQualificationContext> structureQualification() {
			return getRuleContexts(StructureQualificationContext.class);
		}
		public StructureQualificationContext structureQualification(int i) {
			return getRuleContext(StructureQualificationContext.class,i);
		}
		public StructureQualificationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureQualificationList; }
	}

	public final StructureQualificationListContext structureQualificationList() throws RecognitionException {
		StructureQualificationListContext _localctx = new StructureQualificationListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structureQualificationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(544);
					structureQualification();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(547); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class SubscriptContext extends VisitorContext {
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
		enterRule(_localctx, 72, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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

	public static class SubscriptCommalistContext extends VisitorContext {
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
		public SubscriptCommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptCommalist; }
	}

	public final SubscriptCommalistContext subscriptCommalist() throws RecognitionException {
		SubscriptCommalistContext _localctx = new SubscriptCommalistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_subscriptCommalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			subscript();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(552);
				match(COMMA);
				setState(553);
				subscript();
				}
				}
				setState(558);
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

	public static class ParenthesizedExpressionContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode REDAND() { return getToken(ImperiumParser.REDAND, 0); }
		public TerminalNode REDOR() { return getToken(ImperiumParser.REDOR, 0); }
		public TerminalNode REDXOR_U() { return getToken(ImperiumParser.REDXOR_U, 0); }
		public TerminalNode REDNAND() { return getToken(ImperiumParser.REDNAND, 0); }
		public TerminalNode REDNOR() { return getToken(ImperiumParser.REDNOR, 0); }
		public TerminalNode REDXNOR_U() { return getToken(ImperiumParser.REDXNOR_U, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parenthesizedExpression);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(LPAR);
				setState(560);
				expression(0);
				setState(561);
				match(RPAR);
				}
				break;
			case REDAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(REDAND);
				setState(564);
				expression(0);
				setState(565);
				match(RPAR);
				}
				break;
			case REDOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				match(REDOR);
				setState(568);
				expression(0);
				setState(569);
				match(RPAR);
				}
				break;
			case REDXOR_U:
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				match(REDXOR_U);
				setState(572);
				expression(0);
				setState(573);
				match(RPAR);
				}
				break;
			case REDNAND:
				enterOuterAlt(_localctx, 5);
				{
				setState(575);
				match(REDNAND);
				setState(576);
				expression(0);
				setState(577);
				match(RPAR);
				}
				break;
			case REDNOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(579);
				match(REDNOR);
				setState(580);
				expression(0);
				setState(581);
				match(RPAR);
				}
				break;
			case REDXNOR_U:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				match(REDXNOR_U);
				setState(584);
				expression(0);
				setState(585);
				match(RPAR);
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

	public static class PrimitiveExpressionContext extends VisitorContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primitiveExpression);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_PATTERN:
			case OCTAL_PATTERN:
			case HEXADECIMAL_PATTERN:
			case INTEGER:
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				numericLiteral();
				}
				break;
			case STRING_LITERAL_1:
			case STRING_LITERAL_3:
			case STRING_LITERAL_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				stringLiteral();
				}
				break;
			case EMIT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case TARGET:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
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

	public static class PrefixExpressionContext extends VisitorContext {
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_prefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			prefixOperator();
			setState(595);
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

	public static class BitAdjustOperatorContext extends VisitorContext {
		public TerminalNode L_ROTATE_U() { return getToken(ImperiumParser.L_ROTATE_U, 0); }
		public TerminalNode R_ROTATE_U() { return getToken(ImperiumParser.R_ROTATE_U, 0); }
		public TerminalNode L_LOG_SHIFT() { return getToken(ImperiumParser.L_LOG_SHIFT, 0); }
		public TerminalNode R_LOG_SHIFT() { return getToken(ImperiumParser.R_LOG_SHIFT, 0); }
		public TerminalNode R_ART_SHIFT() { return getToken(ImperiumParser.R_ART_SHIFT, 0); }
		public BitAdjustOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitAdjustOperator; }
	}

	public final BitAdjustOperatorContext bitAdjustOperator() throws RecognitionException {
		BitAdjustOperatorContext _localctx = new BitAdjustOperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bitAdjustOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (L_LOG_SHIFT - 151)) | (1L << (R_LOG_SHIFT - 151)) | (1L << (R_ART_SHIFT - 151)) | (1L << (L_ROTATE_U - 151)) | (1L << (R_ROTATE_U - 151)))) != 0)) ) {
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

	public static class AdditionOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public AdditionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionOperator; }
	}

	public final AdditionOperatorContext additionOperator() throws RecognitionException {
		AdditionOperatorContext _localctx = new AdditionOperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_additionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class MultiplyOperatorContext extends VisitorContext {
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public TerminalNode DIVIDE_U() { return getToken(ImperiumParser.DIVIDE_U, 0); }
		public TerminalNode PCNT() { return getToken(ImperiumParser.PCNT, 0); }
		public MultiplyOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyOperator; }
	}

	public final MultiplyOperatorContext multiplyOperator() throws RecognitionException {
		MultiplyOperatorContext _localctx = new MultiplyOperatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiplyOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (TIMES - 116)) | (1L << (DIVIDE_U - 116)) | (1L << (PCNT - 116)))) != 0)) ) {
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

	public static class BoolAndOperatorContext extends VisitorContext {
		public TerminalNode AND() { return getToken(ImperiumParser.AND, 0); }
		public TerminalNode NAND() { return getToken(ImperiumParser.NAND, 0); }
		public BoolAndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAndOperator; }
	}

	public final BoolAndOperatorContext boolAndOperator() throws RecognitionException {
		BoolAndOperatorContext _localctx = new BoolAndOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_boolAndOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==NAND) ) {
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

	public static class BoolXorOperatorContext extends VisitorContext {
		public TerminalNode XOR_U() { return getToken(ImperiumParser.XOR_U, 0); }
		public TerminalNode XNOR_U() { return getToken(ImperiumParser.XNOR_U, 0); }
		public BoolXorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolXorOperator; }
	}

	public final BoolXorOperatorContext boolXorOperator() throws RecognitionException {
		BoolXorOperatorContext _localctx = new BoolXorOperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_boolXorOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_la = _input.LA(1);
			if ( !(_la==XOR_U || _la==XNOR_U) ) {
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

	public static class BoolOrOperatorContext extends VisitorContext {
		public TerminalNode OR() { return getToken(ImperiumParser.OR, 0); }
		public TerminalNode NOR() { return getToken(ImperiumParser.NOR, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public BoolOrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOrOperator; }
	}

	public final BoolOrOperatorContext boolOrOperator() throws RecognitionException {
		BoolOrOperatorContext _localctx = new BoolOrOperatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_boolOrOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (NOT - 127)) | (1L << (OR - 127)) | (1L << (NOR - 127)))) != 0)) ) {
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

	public static class ExpressionContext extends VisitorContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBoolAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolAndOperatorContext boolAndOperator() {
			return getRuleContext(BoolAndOperatorContext.class,0);
		}
		public ExprBoolAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprConcatContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONC() { return getToken(ImperiumParser.CONC, 0); }
		public ExprConcatContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprRaiseContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER_U() { return getToken(ImperiumParser.POWER_U, 0); }
		public ExprRaiseContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolXorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolXorOperatorContext boolXorOperator() {
			return getRuleContext(BoolXorOperatorContext.class,0);
		}
		public ExprBoolXorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGAND() { return getToken(ImperiumParser.LOGAND, 0); }
		public ExprLogAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitAdjustContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitAdjustOperatorContext bitAdjustOperator() {
			return getRuleContext(BitAdjustOperatorContext.class,0);
		}
		public ExprBitAdjustContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddSubContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionOperatorContext additionOperator() {
			return getRuleContext(AdditionOperatorContext.class,0);
		}
		public ExprAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpreMap1Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MAPSTO_U() { return getToken(ImperiumParser.MAPSTO_U, 0); }
		public Map_setContext map_set() {
			return getRuleContext(Map_setContext.class,0);
		}
		public Bool_setContext bool_set() {
			return getRuleContext(Bool_setContext.class,0);
		}
		public ExpreMap1Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenthesizedContext extends ExpressionContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public ExprParenthesizedContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpreMap2Context extends ExpressionContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode MAPSTO_U() { return getToken(ImperiumParser.MAPSTO_U, 0); }
		public Map_setContext map_set() {
			return getRuleContext(Map_setContext.class,0);
		}
		public Bool_setContext bool_set() {
			return getRuleContext(Bool_setContext.class,0);
		}
		public ExpreMap2Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMulDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyOperatorContext multiplyOperator() {
			return getRuleContext(MultiplyOperatorContext.class,0);
		}
		public ExprMulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGOR() { return getToken(ImperiumParser.LOGOR, 0); }
		public ExprLogOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCompareContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ExprCompareContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrefixedContext extends ExpressionContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public ExprPrefixedContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolOrOperatorContext boolOrOperator() {
			return getRuleContext(BoolOrOperatorContext.class,0);
		}
		public ExprBoolOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrimitiveContext extends ExpressionContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ExprPrimitiveContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(610);
				primitiveExpression();
				}
				break;
			case 2:
				{
				_localctx = new ExprParenthesizedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(611);
				parenthesizedExpression();
				}
				break;
			case 3:
				{
				_localctx = new ExprPrefixedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(612);
				prefixExpression();
				}
				break;
			case 4:
				{
				_localctx = new ExpreMap2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				arguments();
				setState(614);
				match(MAPSTO_U);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(615);
					map_set();
					}
					break;
				case 2:
					{
					setState(616);
					bool_set();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(667);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new ExprRaiseContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(621);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(622);
						match(POWER_U);
						setState(623);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprMulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(624);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(625);
						multiplyOperator();
						setState(626);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprAddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(628);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(629);
						additionOperator();
						setState(630);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprBitAdjustContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(633);
						bitAdjustOperator();
						setState(634);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprConcatContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(636);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(637);
						match(CONC);
						setState(638);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprCompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(639);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(640);
						comparisonOperator();
						setState(641);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprBoolAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(643);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(644);
						boolAndOperator();
						setState(645);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprBoolXorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(647);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(648);
						boolXorOperator();
						setState(649);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprBoolOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(651);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(652);
						boolOrOperator();
						setState(653);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprLogAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(655);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(656);
						match(LOGAND);
						setState(657);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExprLogOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(658);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(659);
						match(LOGOR);
						setState(660);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpreMap1Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(661);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(662);
						match(MAPSTO_U);
						setState(665);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(663);
							map_set();
							}
							break;
						case 2:
							{
							setState(664);
							bool_set();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class Map_setContext extends VisitorContext {
		public List<TerminalNode> LPAR() { return getTokens(ImperiumParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ImperiumParser.LPAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ImperiumParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ImperiumParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ImperiumParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ImperiumParser.RPAR, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public Map_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_set; }
	}

	public final Map_setContext map_set() throws RecognitionException {
		Map_setContext _localctx = new Map_setContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_map_set);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(672);
					match(LPAR);
					setState(675);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(673);
						expression(0);
						}
						break;
					case 2:
						{
						setState(674);
						arguments();
						}
						break;
					}
					setState(684);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(677);
						match(COMMA);
						setState(680);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(678);
							expression(0);
							}
							break;
						case 2:
							{
							setState(679);
							arguments();
							}
							break;
						}
						}
						}
						setState(686);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(687);
					match(COLON);
					setState(688);
					expression(0);
					setState(689);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(693); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(695);
				match(LPAR);
				setState(696);
				expression(0);
				setState(697);
				match(RPAR);
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

	public static class Bool_setContext extends VisitorContext {
		public List<TerminalNode> LPAR() { return getTokens(ImperiumParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ImperiumParser.LPAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ImperiumParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ImperiumParser.RPAR, i);
		}
		public Bool_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_set; }
	}

	public final Bool_setContext bool_set() throws RecognitionException {
		Bool_setContext _localctx = new Bool_setContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bool_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(701);
			match(LPAR);
			setState(702);
			expression(0);
			setState(703);
			match(RPAR);
			}
			{
			setState(705);
			match(LPAR);
			setState(706);
			expression(0);
			setState(707);
			match(RPAR);
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

	public static class PrefixOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (PLUS - 118)) | (1L << (MINUS - 118)) | (1L << (NOT - 118)))) != 0)) ) {
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

	public static class ComparisonOperatorContext extends VisitorContext {
		public TerminalNode GT() { return getToken(ImperiumParser.GT, 0); }
		public TerminalNode GTE_U() { return getToken(ImperiumParser.GTE_U, 0); }
		public TerminalNode EQUALS() { return getToken(ImperiumParser.EQUALS, 0); }
		public TerminalNode LT() { return getToken(ImperiumParser.LT, 0); }
		public TerminalNode LTE_U() { return getToken(ImperiumParser.LTE_U, 0); }
		public TerminalNode NGT() { return getToken(ImperiumParser.NGT, 0); }
		public TerminalNode NE_U() { return getToken(ImperiumParser.NE_U, 0); }
		public TerminalNode NLT() { return getToken(ImperiumParser.NLT, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (EQUALS - 114)) | (1L << (GT - 114)) | (1L << (LT - 114)) | (1L << (GTE_U - 114)) | (1L << (LTE_U - 114)) | (1L << (NGT - 114)) | (1L << (NLT - 114)) | (1L << (NE_U - 114)))) != 0)) ) {
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

	public static class ShiftOperatorContext extends VisitorContext {
		public TerminalNode R_LOG_SHIFT() { return getToken(ImperiumParser.R_LOG_SHIFT, 0); }
		public TerminalNode L_LOG_SHIFT() { return getToken(ImperiumParser.L_LOG_SHIFT, 0); }
		public TerminalNode R_ART_SHIFT() { return getToken(ImperiumParser.R_ART_SHIFT, 0); }
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_la = _input.LA(1);
			if ( !(((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (L_LOG_SHIFT - 151)) | (1L << (R_LOG_SHIFT - 151)) | (1L << (R_ART_SHIFT - 151)))) != 0)) ) {
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

	public static class CallStmtContext extends VisitorContext {
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(CALL);
			setState(716);
			reference(0);
			setState(717);
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

	public static class GotoStmtContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode GOTO() { return getToken(ImperiumParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_gotoStmt);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(719);
				match(GOTO);
				setState(720);
				identifier();
				setState(721);
				match(LPAR);
				setState(722);
				expression(0);
				setState(723);
				match(RPAR);
				}
				setState(725);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(727);
				match(GOTO);
				setState(728);
				reference(0);
				}
				setState(730);
				match(SEMICOLON);
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

	public static class EndloopStmtContext extends VisitorContext {
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EndloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endloopStmt; }
	}

	public final EndloopStmtContext endloopStmt() throws RecognitionException {
		EndloopStmtContext _localctx = new EndloopStmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_endloopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(ENDLOOP);
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(735);
				identifier();
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

	public static class ReloopStmtContext extends VisitorContext {
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloopStmt; }
	}

	public final ReloopStmtContext reloopStmt() throws RecognitionException {
		ReloopStmtContext _localctx = new ReloopStmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_reloopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(RELOOP);
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(739);
				identifier();
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

	public static class DeclareStmtContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclareAsBodyContext declareAsBody() {
			return getRuleContext(DeclareAsBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode ARGUMENT() { return getToken(ImperiumParser.ARGUMENT, 0); }
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public DeclarationBodyContext declarationBody() {
			return getRuleContext(DeclarationBodyContext.class,0);
		}
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declareStmt);
		int _la;
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				_la = _input.LA(1);
				if ( !(_la==ARGUMENT || _la==DECLARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(743);
				identifier();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(744);
					dimensionSuffix();
					}
				}

				setState(747);
				declareAsBody();
				setState(748);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				_la = _input.LA(1);
				if ( !(_la==ARGUMENT || _la==DECLARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(751);
				declarationBody();
				setState(752);
				match(SEMICOLON);
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

	public static class DeclareAsBodyContext extends VisitorContext {
		public TerminalNode AS() { return getToken(ImperiumParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemoryAttributeContext memoryAttribute() {
			return getRuleContext(MemoryAttributeContext.class,0);
		}
		public DeclareAsBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAsBody; }
	}

	public final DeclareAsBodyContext declareAsBody() throws RecognitionException {
		DeclareAsBodyContext _localctx = new DeclareAsBodyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declareAsBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(AS);
			setState(757);
			identifier();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (BASED - 10)) | (1L << (DEFINED - 10)) | (1L << (STACK - 10)) | (1L << (STATIC - 10)))) != 0)) {
				{
				setState(758);
				memoryAttribute();
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

	public static class DeclarationBodyContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeInfoContext typeInfo() {
			return getRuleContext(TypeInfoContext.class,0);
		}
		public DeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationBody; }
	}

	public final DeclarationBodyContext declarationBody() throws RecognitionException {
		DeclarationBodyContext _localctx = new DeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarationBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			identifier();
			setState(762);
			typeInfo();
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

	public static class TypeInfoContext extends VisitorContext {
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TypeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInfo; }
	}

	public final TypeInfoContext typeInfo() throws RecognitionException {
		TypeInfoContext _localctx = new TypeInfoContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_typeInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(764);
				dimensionSuffix();
				}
			}

			setState(768); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(767);
				attribute();
				}
				}
				setState(770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASED) | (1L << BINARY) | (1L << BIT) | (1L << BUILTIN) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COROUTINE) | (1L << DECIMAL) | (1L << DEFINED) | (1L << ENTRY) | (1L << FIXED) | (1L << FLOAT) | (1L << INTRINSIC) | (1L << MAIN) | (1L << OFFSET) | (1L << POINTER) | (1L << RETAIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SECTION - 66)) | (1L << (STACK - 66)) | (1L << (STATIC - 66)) | (1L << (STRING - 66)) | (1L << (VARIABLE - 66)) | (1L << (VARYING - 66)))) != 0) );
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

	public static class DimensionSuffixContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public BoundPairCommalistContext boundPairCommalist() {
			return getRuleContext(BoundPairCommalistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public DimensionSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionSuffix; }
	}

	public final DimensionSuffixContext dimensionSuffix() throws RecognitionException {
		DimensionSuffixContext _localctx = new DimensionSuffixContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dimensionSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(LPAR);
			setState(773);
			boundPairCommalist();
			setState(774);
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

	public static class BoundPairContext extends VisitorContext {
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ImperiumParser.COLON, 0); }
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public BoundPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundPair; }
	}

	public final BoundPairContext boundPair() throws RecognitionException {
		BoundPairContext _localctx = new BoundPairContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_boundPair);
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL_1:
			case EMIT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case TARGET:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case STRING_LITERAL_3:
			case STRING_LITERAL_2:
			case BINARY_PATTERN:
			case OCTAL_PATTERN:
			case HEXADECIMAL_PATTERN:
			case INTEGER:
			case DECIMAL_PATTERN:
			case IDENTIFIER:
			case LPAR:
			case PLUS:
			case MINUS:
			case NOT:
			case REDAND:
			case REDOR:
			case REDNAND:
			case REDNOR:
			case REDXOR_U:
			case REDXNOR_U:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(776);
					lowerBound();
					setState(777);
					match(COLON);
					}
					break;
				}
				setState(781);
				upperBound();
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
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

	public static class BoundPairCommalistContext extends VisitorContext {
		public List<BoundPairContext> boundPair() {
			return getRuleContexts(BoundPairContext.class);
		}
		public BoundPairContext boundPair(int i) {
			return getRuleContext(BoundPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public BoundPairCommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundPairCommalist; }
	}

	public final BoundPairCommalistContext boundPairCommalist() throws RecognitionException {
		BoundPairCommalistContext _localctx = new BoundPairCommalistContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_boundPairCommalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			boundPair();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(786);
				match(COMMA);
				setState(787);
				boundPair();
				}
				}
				setState(792);
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

	public static class LowerBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
	}

	public final LowerBoundContext lowerBound() throws RecognitionException {
		LowerBoundContext _localctx = new LowerBoundContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_lowerBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
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

	public static class UpperBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
	}

	public final UpperBoundContext upperBound() throws RecognitionException {
		UpperBoundContext _localctx = new UpperBoundContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_upperBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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

	public static class AttributeContext extends VisitorContext {
		public DataAttributeContext dataAttribute() {
			return getRuleContext(DataAttributeContext.class,0);
		}
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public TerminalNode VARIABLE() { return getToken(ImperiumParser.VARIABLE, 0); }
		public MemoryAttributeContext memoryAttribute() {
			return getRuleContext(MemoryAttributeContext.class,0);
		}
		public Linkage_attributeContext linkage_attribute() {
			return getRuleContext(Linkage_attributeContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(797);
				dataAttribute();
				}
				break;
			case 2:
				{
				setState(798);
				match(BUILTIN);
				}
				break;
			case 3:
				{
				setState(799);
				match(VARIABLE);
				}
				break;
			case 4:
				{
				setState(800);
				memoryAttribute();
				}
				break;
			case 5:
				{
				setState(801);
				linkage_attribute();
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

	public static class MemoryAttributeContext extends VisitorContext {
		public TerminalNode STACK() { return getToken(ImperiumParser.STACK, 0); }
		public TerminalNode STATIC() { return getToken(ImperiumParser.STATIC, 0); }
		public BasedContext based() {
			return getRuleContext(BasedContext.class,0);
		}
		public DefinedContext defined() {
			return getRuleContext(DefinedContext.class,0);
		}
		public MemoryAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryAttribute; }
	}

	public final MemoryAttributeContext memoryAttribute() throws RecognitionException {
		MemoryAttributeContext _localctx = new MemoryAttributeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_memoryAttribute);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(STACK);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(STATIC);
				}
				break;
			case BASED:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				based();
				}
				break;
			case DEFINED:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				defined();
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

	public static class DataAttributeContext extends VisitorContext {
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public TerminalNode POINTER() { return getToken(ImperiumParser.POINTER, 0); }
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public MaxLengthContext maxLength() {
			return getRuleContext(MaxLengthContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(ImperiumParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public MaxStringLengthContext maxStringLength() {
			return getRuleContext(MaxStringLengthContext.class,0);
		}
		public UtfSpecContext utfSpec() {
			return getRuleContext(UtfSpecContext.class,0);
		}
		public RawSpecContext rawSpec() {
			return getRuleContext(RawSpecContext.class,0);
		}
		public TerminalNode ENTRY() { return getToken(ImperiumParser.ENTRY, 0); }
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public TerminalNode OFFSET() { return getToken(ImperiumParser.OFFSET, 0); }
		public TerminalNode VARYING() { return getToken(ImperiumParser.VARYING, 0); }
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public DataAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataAttribute; }
	}

	public final DataAttributeContext dataAttribute() throws RecognitionException {
		DataAttributeContext _localctx = new DataAttributeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_dataAttribute);
		int _la;
		try {
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				match(BINARY);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(811);
					precision();
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				match(DECIMAL);
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(815);
					precision();
					}
				}

				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				match(POINTER);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				match(BIT);
				setState(820);
				maxLength();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(821);
				match(CHARACTER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(822);
				match(STRING);
				setState(823);
				maxStringLength();
				setState(826);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UTF:
					{
					setState(824);
					utfSpec();
					}
					break;
				case RAW:
					{
					setState(825);
					rawSpec();
					}
					break;
				case BASED:
				case BINARY:
				case BIT:
				case BUILTIN:
				case CHARACTER:
				case COFUNCTION:
				case COROUTINE:
				case DECIMAL:
				case DEFINED:
				case ENTRY:
				case FIXED:
				case FLOAT:
				case INTRINSIC:
				case MAIN:
				case OFFSET:
				case POINTER:
				case RETAIN:
				case SECTION:
				case STACK:
				case STATIC:
				case STRING:
				case VARIABLE:
				case VARYING:
				case RPAR:
				case SEMICOLON:
					break;
				default:
					break;
				}
				}
				break;
			case ENTRY:
				enterOuterAlt(_localctx, 7);
				{
				setState(828);
				match(ENTRY);
				}
				break;
			case FIXED:
				enterOuterAlt(_localctx, 8);
				{
				setState(829);
				match(FIXED);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 9);
				{
				setState(830);
				match(FLOAT);
				}
				break;
			case OFFSET:
				enterOuterAlt(_localctx, 10);
				{
				setState(831);
				match(OFFSET);
				}
				break;
			case VARYING:
				enterOuterAlt(_localctx, 11);
				{
				setState(832);
				match(VARYING);
				}
				break;
			case COROUTINE:
				enterOuterAlt(_localctx, 12);
				{
				setState(833);
				match(COROUTINE);
				}
				break;
			case COFUNCTION:
				enterOuterAlt(_localctx, 13);
				{
				setState(834);
				match(COFUNCTION);
				}
				break;
			case BUILTIN:
				enterOuterAlt(_localctx, 14);
				{
				setState(835);
				match(BUILTIN);
				}
				break;
			case INTRINSIC:
				enterOuterAlt(_localctx, 15);
				{
				setState(836);
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

	public static class Linkage_attributeContext extends VisitorContext {
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode MAIN() { return getToken(ImperiumParser.MAIN, 0); }
		public Linkage_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkage_attribute; }
	}

	public final Linkage_attributeContext linkage_attribute() throws RecognitionException {
		Linkage_attributeContext _localctx = new Linkage_attributeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_linkage_attribute);
		try {
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(RETAIN);
				}
				break;
			case SECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(SECTION);
				setState(841);
				match(LPAR);
				setState(842);
				match(STRING_LITERAL_1);
				setState(843);
				match(RPAR);
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				match(MAIN);
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

	public static class UtfSpecContext extends VisitorContext {
		public TerminalNode UTF() { return getToken(ImperiumParser.UTF, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public UtfSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utfSpec; }
	}

	public final UtfSpecContext utfSpec() throws RecognitionException {
		UtfSpecContext _localctx = new UtfSpecContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_utfSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(847);
			match(UTF);
			setState(848);
			match(LPAR);
			setState(849);
			decimalLiteral();
			setState(850);
			match(RPAR);
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

	public static class RawSpecContext extends VisitorContext {
		public TerminalNode RAW() { return getToken(ImperiumParser.RAW, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public RawSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawSpec; }
	}

	public final RawSpecContext rawSpec() throws RecognitionException {
		RawSpecContext _localctx = new RawSpecContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_rawSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(852);
			match(RAW);
			setState(853);
			match(LPAR);
			setState(854);
			decimalLiteral();
			setState(855);
			match(RPAR);
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

	public static class PrecisionContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public NumberOfDigitsContext numberOfDigits() {
			return getRuleContext(NumberOfDigitsContext.class,0);
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
		enterRule(_localctx, 144, RULE_precision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(LPAR);
			setState(858);
			numberOfDigits();
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(859);
				match(COMMA);
				setState(860);
				scale_factor();
				}
			}

			setState(863);
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

	public static class NumberOfDigitsContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberOfDigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberOfDigits; }
	}

	public final NumberOfDigitsContext numberOfDigits() throws RecognitionException {
		NumberOfDigitsContext _localctx = new NumberOfDigitsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_numberOfDigits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(865);
				match(INTEGER);
				}
				break;
			case EMIT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case TARGET:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(866);
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

	public static class Scale_factorContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
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
		enterRule(_localctx, 148, RULE_scale_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(869);
				match(INTEGER);
				}
				break;
			case EMIT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case TARGET:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(870);
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

	public static class MaxStringLengthContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MaxStringLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxStringLength; }
	}

	public final MaxStringLengthContext maxStringLength() throws RecognitionException {
		MaxStringLengthContext _localctx = new MaxStringLengthContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_maxStringLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(LPAR);
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
				{
				setState(874);
				match(TIMES);
				}
				break;
			case EMIT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case TARGET:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case INTEGER:
			case IDENTIFIER:
				{
				setState(877);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(875);
					match(INTEGER);
					}
					break;
				case EMIT:
				case ALIAS:
				case ALIGNED:
				case ALL:
				case ANY:
				case ARGUMENT:
				case AS:
				case BASED:
				case BINARY:
				case BIT:
				case BOOLEAN:
				case BOOTSTRAP:
				case BUILTIN:
				case BY:
				case BYPASS:
				case CALL:
				case CHARACTER:
				case COFUNCTION:
				case COLD:
				case COROUTINE:
				case DECIMAL:
				case DECLARE:
				case DEFINE:
				case DEFINED:
				case ELIF:
				case ELSE:
				case END:
				case ENDLOOP:
				case ENTRY:
				case ENUM:
				case FIXED:
				case FLOAT:
				case FUNCTION:
				case GOTO:
				case IF:
				case INC:
				case INCLUDE:
				case INTERNAL:
				case INTERRUPT:
				case INTRINSIC:
				case LANGUAGE:
				case LOOP:
				case MAIN:
				case NAKED:
				case NORETURN:
				case OFFSET:
				case OTHERWISE:
				case OUT:
				case PAD:
				case POINTER:
				case PRIVATE:
				case PROCEDURE:
				case PUBLIC:
				case RAW:
				case READONLY:
				case RECURSIVE:
				case REF:
				case RELOOP:
				case RETAIN:
				case RETURN:
				case RETURNON:
				case RETURNS:
				case SCOPE:
				case SECTION:
				case SELECT:
				case SINGLET:
				case STACK:
				case STATIC:
				case STRING:
				case STRUCTURE:
				case TARGET:
				case THEN:
				case TO:
				case TRAITS:
				case TYPE:
				case UNALIGNED:
				case UNTIL:
				case USES:
				case USING:
				case UTF:
				case VARIABLE:
				case VARYING:
				case WHEN:
				case WHILE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(876);
					identifier();
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
			setState(881);
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

	public static class MaxLengthContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MaxLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxLength; }
	}

	public final MaxLengthContext maxLength() throws RecognitionException {
		MaxLengthContext _localctx = new MaxLengthContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_maxLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(LPAR);
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(884);
				match(INTEGER);
				}
				break;
			case EMIT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case TARGET:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(885);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(888);
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

	public static class BasedContext extends VisitorContext {
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
		enterRule(_localctx, 154, RULE_based);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(BASED);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(891);
				match(LPAR);
				setState(892);
				reference(0);
				setState(893);
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

	public static class DefinedContext extends VisitorContext {
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
		enterRule(_localctx, 156, RULE_defined);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(DEFINED);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(898);
				match(LPAR);
				setState(899);
				reference(0);
				setState(900);
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

	public static class CoprocedureSpecifierContext extends VisitorContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public CoprocedureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coprocedureSpecifier; }
	}

	public final CoprocedureSpecifierContext coprocedureSpecifier() throws RecognitionException {
		CoprocedureSpecifierContext _localctx = new CoprocedureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_coprocedureSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
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

	public static class HandlerSpecifierContext extends VisitorContext {
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public HandlerSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSpecifier; }
	}

	public final HandlerSpecifierContext handlerSpecifier() throws RecognitionException {
		HandlerSpecifierContext _localctx = new HandlerSpecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_handlerSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(INTERRUPT);
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

	public static class ParameterNameCommalistContext extends VisitorContext {
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
		public ParameterNameCommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterNameCommalist; }
	}

	public final ParameterNameCommalistContext parameterNameCommalist() throws RecognitionException {
		ParameterNameCommalistContext _localctx = new ParameterNameCommalistContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_parameterNameCommalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(LPAR);
			setState(909);
			identifier();
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(910);
				match(COMMA);
				setState(911);
				identifier();
				}
				}
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(917);
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

	public static class ReturnStmtContext extends VisitorContext {
		public TerminalNode RETURN() { return getToken(ImperiumParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(RETURN);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(920);
				match(LPAR);
				setState(921);
				expression(0);
				setState(922);
				match(RPAR);
				}
			}

			setState(926);
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

	public static class IfStmtContext extends VisitorContext {
		public ThenClauseContext thenClause() {
			return getRuleContext(ThenClauseContext.class,0);
		}
		public IfEndContext ifEnd() {
			return getRuleContext(IfEndContext.class,0);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public List<ElifClauseContext> elifClause() {
			return getRuleContexts(ElifClauseContext.class);
		}
		public ElifClauseContext elifClause(int i) {
			return getRuleContext(ElifClauseContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				thenClause();
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(929);
						activeStmt();
						}
						} 
					}
					setState(934);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(935);
					elseClause();
					}
				}

				setState(938);
				ifEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				thenClause();
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(941);
						activeStmt();
						}
						} 
					}
					setState(946);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(948); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(947);
					elifClause();
					}
					}
					setState(950); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELIF );
				setState(952);
				ifEnd();
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

	public static class IfEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public IfEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifEnd; }
	}

	public final IfEndContext ifEnd() throws RecognitionException {
		IfEndContext _localctx = new IfEndContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_ifEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(END);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(957);
				match(IF);
				}
			}

			setState(960);
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

	public static class ThenClauseContext extends VisitorContext {
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public ThenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenClause; }
	}

	public final ThenClauseContext thenClause() throws RecognitionException {
		ThenClauseContext _localctx = new ThenClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_thenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(IF);
			setState(963);
			expression(0);
			setState(964);
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

	public static class ElseClauseContext extends VisitorContext {
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_elseClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(ELSE);
			setState(970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(967);
					activeStmt();
					}
					} 
				}
				setState(972);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ElifClauseContext extends VisitorContext {
		public TerminalNode ELIF() { return getToken(ImperiumParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public ElifClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifClause; }
	}

	public final ElifClauseContext elifClause() throws RecognitionException {
		ElifClauseContext _localctx = new ElifClauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_elifClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(ELIF);
			setState(974);
			expression(0);
			setState(975);
			match(THEN);
			setState(979);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(976);
					activeStmt();
					}
					} 
				}
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(982);
				elseClause();
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

	public static class LoopStmtContext extends VisitorContext {
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public LoopEndContext loopEnd() {
			return getRuleContext(LoopEndContext.class,0);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public WhileOptionContext whileOption() {
			return getRuleContext(WhileOptionContext.class,0);
		}
		public UntilOptionContext untilOption() {
			return getRuleContext(UntilOptionContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_loopStmt);
		int _la;
		try {
			int _alt;
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				match(LOOP);
				setState(986);
				match(SEMICOLON);
				setState(990);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(987);
						activeStmt();
						}
						} 
					}
					setState(992);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(993);
				loopEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(LOOP);
				setState(1021);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHILE:
					{
					{
					setState(995);
					whileOption();
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNTIL) {
						{
						setState(996);
						untilOption();
						}
					}

					setState(999);
					match(SEMICOLON);
					setState(1003);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1000);
							activeStmt();
							}
							} 
						}
						setState(1005);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					}
					setState(1006);
					loopEnd();
					}
					}
					break;
				case UNTIL:
					{
					{
					setState(1008);
					untilOption();
					setState(1010);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHILE) {
						{
						setState(1009);
						whileOption();
						}
					}

					setState(1012);
					match(SEMICOLON);
					setState(1016);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1013);
							activeStmt();
							}
							} 
						}
						setState(1018);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
					}
					setState(1019);
					loopEnd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class LoopEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public LoopEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEnd; }
	}

	public final LoopEndContext loopEnd() throws RecognitionException {
		LoopEndContext _localctx = new LoopEndContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_loopEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(END);
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOOP) {
				{
				setState(1026);
				match(LOOP);
				}
			}

			setState(1029);
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

	public static class WhileOptionContext extends VisitorContext {
		public TerminalNode WHILE() { return getToken(ImperiumParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public WhileOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileOption; }
	}

	public final WhileOptionContext whileOption() throws RecognitionException {
		WhileOptionContext _localctx = new WhileOptionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_whileOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(WHILE);
			setState(1032);
			match(LPAR);
			setState(1033);
			expression(0);
			setState(1034);
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

	public static class UntilOptionContext extends VisitorContext {
		public TerminalNode UNTIL() { return getToken(ImperiumParser.UNTIL, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public UntilOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilOption; }
	}

	public final UntilOptionContext untilOption() throws RecognitionException {
		UntilOptionContext _localctx = new UntilOptionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_untilOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(UNTIL);
			setState(1037);
			match(LPAR);
			setState(1038);
			expression(0);
			setState(1039);
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

	public static class SelectStmtContext extends VisitorContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public SelectEndContext selectEnd() {
			return getRuleContext(SelectEndContext.class,0);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public OtherwiseClauseContext otherwiseClause() {
			return getRuleContext(OtherwiseClauseContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			selectClause();
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(1042);
				whenClause();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1048);
				otherwiseClause();
				}
			}

			setState(1051);
			selectEnd();
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

	public static class SelectEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public SelectEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEnd; }
	}

	public final SelectEndContext selectEnd() throws RecognitionException {
		SelectEndContext _localctx = new SelectEndContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_selectEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(END);
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(1054);
				match(SELECT);
				}
			}

			setState(1057);
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

	public static class SelectClauseContext extends VisitorContext {
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(SELECT);
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1060);
				match(LPAR);
				setState(1061);
				expression(0);
				setState(1062);
				match(RPAR);
				}
			}

			setState(1066);
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

	public static class WhenClauseContext extends VisitorContext {
		public TerminalNode WHEN() { return getToken(ImperiumParser.WHEN, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public TerminalNode ANY() { return getToken(ImperiumParser.ANY, 0); }
		public TerminalNode ALL() { return getToken(ImperiumParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_whenClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(WHEN);
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==ANY) {
				{
				setState(1069);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1072);
			match(LPAR);
			{
			setState(1073);
			expression(0);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1074);
				match(COMMA);
				setState(1075);
				expression(0);
				}
				}
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1081);
			match(RPAR);
			setState(1085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1082);
					activeStmt();
					}
					} 
				}
				setState(1087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class OtherwiseClauseContext extends VisitorContext {
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public OtherwiseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwiseClause; }
	}

	public final OtherwiseClauseContext otherwiseClause() throws RecognitionException {
		OtherwiseClauseContext _localctx = new OtherwiseClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_otherwiseClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(ELSE);
			setState(1092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1089);
					activeStmt();
					}
					} 
				}
				setState(1094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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

	public static class DefineStmtContext extends VisitorContext {
		public TerminalNode DEFINE() { return getToken(ImperiumParser.DEFINE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public AliasTypeContext aliasType() {
			return getRuleContext(AliasTypeContext.class,0);
		}
		public DefineStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineStmt; }
	}

	public final DefineStmtContext defineStmt() throws RecognitionException {
		DefineStmtContext _localctx = new DefineStmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_defineStmt);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				match(DEFINE);
				setState(1096);
				identifier();
				setState(1097);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				match(DEFINE);
				setState(1100);
				identifier();
				setState(1101);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(DEFINE);
				setState(1104);
				identifier();
				setState(1105);
				aliasType();
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

	public static class EnumTypeContext extends VisitorContext {
		public List<TerminalNode> ENUM() { return getTokens(ImperiumParser.ENUM); }
		public TerminalNode ENUM(int i) {
			return getToken(ImperiumParser.ENUM, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ImperiumParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ImperiumParser.SEMICOLON, i);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public BinaryEnumContext binaryEnum() {
			return getRuleContext(BinaryEnumContext.class,0);
		}
		public DecimalEnumContext decimalEnum() {
			return getRuleContext(DecimalEnumContext.class,0);
		}
		public StringEnumContext stringEnum() {
			return getRuleContext(StringEnumContext.class,0);
		}
		public BitEnumContext bitEnum() {
			return getRuleContext(BitEnumContext.class,0);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(ENUM);
			setState(1114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				{
				setState(1110);
				binaryEnum();
				}
				break;
			case DECIMAL:
				{
				setState(1111);
				decimalEnum();
				}
				break;
			case STRING:
				{
				setState(1112);
				stringEnum();
				}
				break;
			case BIT:
				{
				setState(1113);
				bitEnum();
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(1116);
			match(SEMICOLON);
			setState(1117);
			enumBody();
			setState(1118);
			match(END);
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENUM) {
				{
				setState(1119);
				match(ENUM);
				}
			}

			setState(1122);
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

	public static class AliasTypeContext extends VisitorContext {
		public TerminalNode ALIAS() { return getToken(ImperiumParser.ALIAS, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AliasTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasType; }
	}

	public final AliasTypeContext aliasType() throws RecognitionException {
		AliasTypeContext _localctx = new AliasTypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_aliasType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(ALIAS);
			setState(1126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1125);
				attribute();
				}
				}
				setState(1128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASED) | (1L << BINARY) | (1L << BIT) | (1L << BUILTIN) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COROUTINE) | (1L << DECIMAL) | (1L << DEFINED) | (1L << ENTRY) | (1L << FIXED) | (1L << FLOAT) | (1L << INTRINSIC) | (1L << MAIN) | (1L << OFFSET) | (1L << POINTER) | (1L << RETAIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SECTION - 66)) | (1L << (STACK - 66)) | (1L << (STATIC - 66)) | (1L << (STRING - 66)) | (1L << (VARIABLE - 66)) | (1L << (VARYING - 66)))) != 0) );
			setState(1130);
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

	public static class BinaryEnumContext extends VisitorContext {
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public BinaryEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryEnum; }
	}

	public final BinaryEnumContext binaryEnum() throws RecognitionException {
		BinaryEnumContext _localctx = new BinaryEnumContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_binaryEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1132);
			match(BINARY);
			setState(1133);
			match(LPAR);
			setState(1134);
			decimalLiteral();
			setState(1135);
			match(RPAR);
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

	public static class DecimalEnumContext extends VisitorContext {
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public DecimalEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalEnum; }
	}

	public final DecimalEnumContext decimalEnum() throws RecognitionException {
		DecimalEnumContext _localctx = new DecimalEnumContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_decimalEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1137);
			match(DECIMAL);
			setState(1138);
			match(LPAR);
			setState(1139);
			decimalLiteral();
			setState(1140);
			match(RPAR);
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

	public static class StringEnumContext extends VisitorContext {
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public StringEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringEnum; }
	}

	public final StringEnumContext stringEnum() throws RecognitionException {
		StringEnumContext _localctx = new StringEnumContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_stringEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1142);
			match(STRING);
			setState(1143);
			match(LPAR);
			setState(1144);
			decimalLiteral();
			setState(1145);
			match(RPAR);
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

	public static class BitEnumContext extends VisitorContext {
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public BitEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitEnum; }
	}

	public final BitEnumContext bitEnum() throws RecognitionException {
		BitEnumContext _localctx = new BitEnumContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_bitEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1147);
			match(BIT);
			setState(1148);
			match(LPAR);
			setState(1149);
			decimalLiteral();
			setState(1150);
			match(RPAR);
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

	public static class EnumBodyContext extends VisitorContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ImperiumParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ImperiumParser.SEMICOLON, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ImperiumParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(ImperiumParser.EQUALS, i);
		}
		public List<EnumLiteralContext> enumLiteral() {
			return getRuleContexts(EnumLiteralContext.class);
		}
		public EnumLiteralContext enumLiteral(int i) {
			return getRuleContext(EnumLiteralContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			identifier();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(1153);
				match(EQUALS);
				setState(1154);
				enumLiteral();
				}
			}

			setState(1157);
			match(SEMICOLON);
			setState(1167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1158);
					identifier();
					setState(1161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUALS) {
						{
						setState(1159);
						match(EQUALS);
						setState(1160);
						enumLiteral();
						}
					}

					setState(1163);
					match(SEMICOLON);
					}
					} 
				}
				setState(1169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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

	public static class EnumLiteralContext extends VisitorContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BinaryLiteralContext binaryLiteral() {
			return getRuleContext(BinaryLiteralContext.class,0);
		}
		public EnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiteral; }
	}

	public final EnumLiteralContext enumLiteral() throws RecognitionException {
		EnumLiteralContext _localctx = new EnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL_PATTERN:
				{
				setState(1170);
				decimalLiteral();
				}
				break;
			case STRING_LITERAL_1:
			case STRING_LITERAL_3:
			case STRING_LITERAL_2:
				{
				setState(1171);
				stringLiteral();
				}
				break;
			case BINARY_PATTERN:
				{
				setState(1172);
				binaryLiteral();
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

	public static class StructTypeContext extends VisitorContext {
		public List<TerminalNode> STRUCTURE() { return getTokens(ImperiumParser.STRUCTURE); }
		public TerminalNode STRUCTURE(int i) {
			return getToken(ImperiumParser.STRUCTURE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ImperiumParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ImperiumParser.SEMICOLON, i);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(STRUCTURE);
			setState(1176);
			match(SEMICOLON);
			setState(1177);
			structBody();
			setState(1178);
			match(END);
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRUCTURE) {
				{
				setState(1179);
				match(STRUCTURE);
				}
			}

			setState(1182);
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

	public static class StructBodyContext extends VisitorContext {
		public StructMemberListContext structMemberList() {
			return getRuleContext(StructMemberListContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_structBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			structMemberList();
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

	public static class StructMemberListContext extends VisitorContext {
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ImperiumParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ImperiumParser.SEMICOLON, i);
		}
		public StructMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMemberList; }
	}

	public final StructMemberListContext structMemberList() throws RecognitionException {
		StructMemberListContext _localctx = new StructMemberListContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_structMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			structMember();
			setState(1187);
			match(SEMICOLON);
			setState(1193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1188);
					structMember();
					setState(1189);
					match(SEMICOLON);
					}
					} 
				}
				setState(1195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class StructSubstructContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRUCTURE() { return getToken(ImperiumParser.STRUCTURE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public StructSubstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structSubstruct; }
	}

	public final StructSubstructContext structSubstruct() throws RecognitionException {
		StructSubstructContext _localctx = new StructSubstructContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_structSubstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			identifier();
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1197);
				dimensionSuffix();
				}
			}

			setState(1200);
			match(STRUCTURE);
			setState(1201);
			match(SEMICOLON);
			setState(1202);
			structBody();
			setState(1203);
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

	public static class StructMemberContext extends VisitorContext {
		public StructSubstructContext structSubstruct() {
			return getRuleContext(StructSubstructContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(ImperiumParser.AS, 0); }
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public DeclarationBodyContext declarationBody() {
			return getRuleContext(DeclarationBodyContext.class,0);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_structMember);
		int _la;
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				structSubstruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				identifier();
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(1207);
					dimensionSuffix();
					}
				}

				setState(1210);
				match(AS);
				setState(1211);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1213);
				declarationBody();
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

	public static class StringLiteralContext extends VisitorContext {
		public TerminalNode STRING_LITERAL_3() { return getToken(ImperiumParser.STRING_LITERAL_3, 0); }
		public TerminalNode STRING_LITERAL_2() { return getToken(ImperiumParser.STRING_LITERAL_2, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL_1 || _la==STRING_LITERAL_3 || _la==STRING_LITERAL_2) ) {
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

	public static class NumericLiteralContext extends VisitorContext {
		public BinaryLiteralContext binaryLiteral() {
			return getRuleContext(BinaryLiteralContext.class,0);
		}
		public OctalLiteralContext octalLiteral() {
			return getRuleContext(OctalLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_numericLiteral);
		try {
			setState(1222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_PATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				binaryLiteral();
				}
				break;
			case OCTAL_PATTERN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				octalLiteral();
				}
				break;
			case HEXADECIMAL_PATTERN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220);
				hexLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1221);
				decimalLiteral();
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

	public static class HexLiteralContext extends VisitorContext {
		public TerminalNode HEXADECIMAL_PATTERN() { return getToken(ImperiumParser.HEXADECIMAL_PATTERN, 0); }
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_hexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1224);
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

	public static class OctalLiteralContext extends VisitorContext {
		public TerminalNode OCTAL_PATTERN() { return getToken(ImperiumParser.OCTAL_PATTERN, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
	}

	public final OctalLiteralContext octalLiteral() throws RecognitionException {
		OctalLiteralContext _localctx = new OctalLiteralContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_octalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1226);
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

	public static class DecimalLiteralContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public TerminalNode DECIMAL_PATTERN() { return getToken(ImperiumParser.DECIMAL_PATTERN, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_decimalLiteral);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1228);
				match(INTEGER);
				}
				}
				break;
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1229);
				match(DECIMAL_PATTERN);
				}
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

	public static class BinaryLiteralContext extends VisitorContext {
		public TerminalNode BINARY_PATTERN() { return getToken(ImperiumParser.BINARY_PATTERN, 0); }
		public BinaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLiteral; }
	}

	public final BinaryLiteralContext binaryLiteral() throws RecognitionException {
		BinaryLiteralContext _localctx = new BinaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_binaryLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1232);
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

	public static class IdentifierContext extends VisitorContext {
		public TerminalNode ALIAS() { return getToken(ImperiumParser.ALIAS, 0); }
		public TerminalNode ALIGNED() { return getToken(ImperiumParser.ALIGNED, 0); }
		public TerminalNode ALL() { return getToken(ImperiumParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ImperiumParser.ANY, 0); }
		public TerminalNode ARGUMENT() { return getToken(ImperiumParser.ARGUMENT, 0); }
		public TerminalNode AS() { return getToken(ImperiumParser.AS, 0); }
		public TerminalNode BASED() { return getToken(ImperiumParser.BASED, 0); }
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ImperiumParser.BOOLEAN, 0); }
		public TerminalNode BOOTSTRAP() { return getToken(ImperiumParser.BOOTSTRAP, 0); }
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public TerminalNode BY() { return getToken(ImperiumParser.BY, 0); }
		public TerminalNode BYPASS() { return getToken(ImperiumParser.BYPASS, 0); }
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public TerminalNode CHARACTER() { return getToken(ImperiumParser.CHARACTER, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public TerminalNode COLD() { return getToken(ImperiumParser.COLD, 0); }
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode DEFINE() { return getToken(ImperiumParser.DEFINE, 0); }
		public TerminalNode DEFINED() { return getToken(ImperiumParser.DEFINED, 0); }
		public TerminalNode ELIF() { return getToken(ImperiumParser.ELIF, 0); }
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public TerminalNode EMIT() { return getToken(ImperiumParser.EMIT, 0); }
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public TerminalNode ENTRY() { return getToken(ImperiumParser.ENTRY, 0); }
		public TerminalNode ENUM() { return getToken(ImperiumParser.ENUM, 0); }
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public TerminalNode GOTO() { return getToken(ImperiumParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public TerminalNode INC() { return getToken(ImperiumParser.INC, 0); }
		public TerminalNode INCLUDE() { return getToken(ImperiumParser.INCLUDE, 0); }
		public TerminalNode INTERNAL() { return getToken(ImperiumParser.INTERNAL, 0); }
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TerminalNode LANGUAGE() { return getToken(ImperiumParser.LANGUAGE, 0); }
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public TerminalNode MAIN() { return getToken(ImperiumParser.MAIN, 0); }
		public TerminalNode NAKED() { return getToken(ImperiumParser.NAKED, 0); }
		public TerminalNode NORETURN() { return getToken(ImperiumParser.NORETURN, 0); }
		public TerminalNode OFFSET() { return getToken(ImperiumParser.OFFSET, 0); }
		public TerminalNode OTHERWISE() { return getToken(ImperiumParser.OTHERWISE, 0); }
		public TerminalNode OUT() { return getToken(ImperiumParser.OUT, 0); }
		public TerminalNode PAD() { return getToken(ImperiumParser.PAD, 0); }
		public TerminalNode POINTER() { return getToken(ImperiumParser.POINTER, 0); }
		public TerminalNode PRIVATE() { return getToken(ImperiumParser.PRIVATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public TerminalNode PUBLIC() { return getToken(ImperiumParser.PUBLIC, 0); }
		public TerminalNode RAW() { return getToken(ImperiumParser.RAW, 0); }
		public TerminalNode READONLY() { return getToken(ImperiumParser.READONLY, 0); }
		public TerminalNode RECURSIVE() { return getToken(ImperiumParser.RECURSIVE, 0); }
		public TerminalNode REF() { return getToken(ImperiumParser.REF, 0); }
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public TerminalNode RETURN() { return getToken(ImperiumParser.RETURN, 0); }
		public TerminalNode RETURNON() { return getToken(ImperiumParser.RETURNON, 0); }
		public TerminalNode RETURNS() { return getToken(ImperiumParser.RETURNS, 0); }
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public TerminalNode SINGLET() { return getToken(ImperiumParser.SINGLET, 0); }
		public TerminalNode STACK() { return getToken(ImperiumParser.STACK, 0); }
		public TerminalNode STATIC() { return getToken(ImperiumParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public TerminalNode STRUCTURE() { return getToken(ImperiumParser.STRUCTURE, 0); }
		public TerminalNode TARGET() { return getToken(ImperiumParser.TARGET, 0); }
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public TerminalNode TO() { return getToken(ImperiumParser.TO, 0); }
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TerminalNode TYPE() { return getToken(ImperiumParser.TYPE, 0); }
		public TerminalNode UNALIGNED() { return getToken(ImperiumParser.UNALIGNED, 0); }
		public TerminalNode UNTIL() { return getToken(ImperiumParser.UNTIL, 0); }
		public TerminalNode USES() { return getToken(ImperiumParser.USES, 0); }
		public TerminalNode USING() { return getToken(ImperiumParser.USING, 0); }
		public TerminalNode UTF() { return getToken(ImperiumParser.UTF, 0); }
		public TerminalNode VARIABLE() { return getToken(ImperiumParser.VARIABLE, 0); }
		public TerminalNode VARYING() { return getToken(ImperiumParser.VARYING, 0); }
		public TerminalNode WHEN() { return getToken(ImperiumParser.WHEN, 0); }
		public TerminalNode WHILE() { return getToken(ImperiumParser.WHILE, 0); }
		public TerminalNode YIELD() { return getToken(ImperiumParser.YIELD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_identifier);
		int _la;
		try {
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMIT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case TARGET:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMIT) | (1L << ALIAS) | (1L << ALIGNED) | (1L << ALL) | (1L << ANY) | (1L << ARGUMENT) | (1L << AS) | (1L << BASED) | (1L << BINARY) | (1L << BIT) | (1L << BOOLEAN) | (1L << BOOTSTRAP) | (1L << BUILTIN) | (1L << BY) | (1L << BYPASS) | (1L << CALL) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COLD) | (1L << COROUTINE) | (1L << DECIMAL) | (1L << DECLARE) | (1L << DEFINE) | (1L << DEFINED) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENDLOOP) | (1L << ENTRY) | (1L << ENUM) | (1L << FIXED) | (1L << FLOAT) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << INC) | (1L << INCLUDE) | (1L << INTERNAL) | (1L << INTERRUPT) | (1L << INTRINSIC) | (1L << LANGUAGE) | (1L << LOOP) | (1L << MAIN) | (1L << NAKED) | (1L << NORETURN) | (1L << OFFSET) | (1L << OTHERWISE) | (1L << OUT) | (1L << PAD) | (1L << POINTER) | (1L << PRIVATE) | (1L << PROCEDURE) | (1L << PUBLIC) | (1L << RAW) | (1L << READONLY) | (1L << RECURSIVE) | (1L << REF) | (1L << RELOOP) | (1L << RETAIN) | (1L << RETURN) | (1L << RETURNON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURNS - 64)) | (1L << (SCOPE - 64)) | (1L << (SECTION - 64)) | (1L << (SELECT - 64)) | (1L << (SINGLET - 64)) | (1L << (STACK - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCTURE - 64)) | (1L << (TARGET - 64)) | (1L << (THEN - 64)) | (1L << (TO - 64)) | (1L << (TRAITS - 64)) | (1L << (TYPE - 64)) | (1L << (UNALIGNED - 64)) | (1L << (UNTIL - 64)) | (1L << (USES - 64)) | (1L << (USING - 64)) | (1L << (UTF - 64)) | (1L << (VARIABLE - 64)) | (1L << (VARYING - 64)) | (1L << (WHEN - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return reference_sempred((ReferenceContext)_localctx, predIndex);
		case 47:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a6\u04d9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\3\2\5\2\u00f0\n\2\3\2\7\2\u00f3\n\2\f\2\16\2\u00f6\13\2\3\2\3\2\3"+
		"\2\7\2\u00fb\n\2\f\2\16\2\u00fe\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0106"+
		"\n\3\f\3\16\3\u0109\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0111\n\4\f\4\16"+
		"\4\u0114\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u011c\n\5\f\5\16\5\u011f\13"+
		"\5\3\5\5\5\u0122\n\5\3\5\3\5\3\6\3\6\5\6\u0128\n\6\3\6\3\6\3\7\3\7\7\7"+
		"\u012e\n\7\f\7\16\7\u0131\13\7\3\7\3\7\3\b\3\b\5\b\u0137\n\b\3\b\3\b\3"+
		"\t\3\t\3\t\5\t\u013e\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u0147\n\n\f\n"+
		"\16\n\u014a\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0156\n\13\3\13\5\13\u0159\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u0163"+
		"\n\r\f\r\16\r\u0166\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u016f"+
		"\n\16\3\17\3\17\7\17\u0173\n\17\f\17\16\17\u0176\13\17\3\17\7\17\u0179"+
		"\n\17\f\17\16\17\u017c\13\17\3\17\3\17\3\20\3\20\7\20\u0182\n\20\f\20"+
		"\16\20\u0185\13\20\3\20\7\20\u0188\n\20\f\20\16\20\u018b\13\20\3\20\3"+
		"\20\3\21\3\21\3\21\5\21\u0192\n\21\3\21\5\21\u0195\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u019c\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u01a3\n\22\3"+
		"\22\3\22\5\22\u01a7\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u01b5\n\24\3\25\3\25\3\25\3\25\5\25\u01bb\n\25\3"+
		"\26\3\26\5\26\u01bf\n\26\3\26\3\26\3\27\3\27\5\27\u01c5\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u01d2\n\32\f\32\16"+
		"\32\u01d5\13\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u01df\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u01e6\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01f4\n\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \5 \u0200\n \3 \3 \3 \3 \5 \u0206\n \7 \u0208\n \f"+
		" \16 \u020b\13 \3!\3!\5!\u020f\n!\3!\3!\3\"\6\"\u0214\n\"\r\"\16\"\u0215"+
		"\3#\5#\u0219\n#\3#\3#\3$\3$\5$\u021f\n$\3$\3$\3%\6%\u0224\n%\r%\16%\u0225"+
		"\3&\3&\3\'\3\'\3\'\7\'\u022d\n\'\f\'\16\'\u0230\13\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5"+
		"(\u024e\n(\3)\3)\3)\5)\u0253\n)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u026c\n\61\5"+
		"\61\u026e\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u029c\n\61\7\61\u029e\n\61\f\61\16\61\u02a1"+
		"\13\61\3\62\3\62\3\62\5\62\u02a6\n\62\3\62\3\62\3\62\5\62\u02ab\n\62\7"+
		"\62\u02ad\n\62\f\62\16\62\u02b0\13\62\3\62\3\62\3\62\3\62\6\62\u02b6\n"+
		"\62\r\62\16\62\u02b7\3\62\3\62\3\62\3\62\5\62\u02be\n\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02df\n8\39\39\59\u02e3"+
		"\n9\3:\3:\5:\u02e7\n:\3;\3;\3;\5;\u02ec\n;\3;\3;\3;\3;\3;\3;\3;\5;\u02f5"+
		"\n;\3<\3<\3<\5<\u02fa\n<\3=\3=\3=\3>\5>\u0300\n>\3>\6>\u0303\n>\r>\16"+
		">\u0304\3?\3?\3?\3?\3@\3@\3@\5@\u030e\n@\3@\3@\5@\u0312\n@\3A\3A\3A\7"+
		"A\u0317\nA\fA\16A\u031a\13A\3B\3B\3C\3C\3D\3D\3D\3D\3D\5D\u0325\nD\3E"+
		"\3E\3E\3E\5E\u032b\nE\3F\3F\5F\u032f\nF\3F\3F\5F\u0333\nF\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\5F\u033d\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0348\nF\3G\3G"+
		"\3G\3G\3G\3G\5G\u0350\nG\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\5J"+
		"\u0360\nJ\3J\3J\3K\3K\5K\u0366\nK\3L\3L\5L\u036a\nL\3M\3M\3M\3M\5M\u0370"+
		"\nM\5M\u0372\nM\3M\3M\3N\3N\3N\5N\u0379\nN\3N\3N\3O\3O\3O\3O\3O\5O\u0382"+
		"\nO\3P\3P\3P\3P\3P\5P\u0389\nP\3Q\3Q\3R\3R\3S\3S\3S\3S\7S\u0393\nS\fS"+
		"\16S\u0396\13S\3S\3S\3T\3T\3T\3T\3T\5T\u039f\nT\3T\3T\3U\3U\7U\u03a5\n"+
		"U\fU\16U\u03a8\13U\3U\5U\u03ab\nU\3U\3U\3U\3U\7U\u03b1\nU\fU\16U\u03b4"+
		"\13U\3U\6U\u03b7\nU\rU\16U\u03b8\3U\3U\5U\u03bd\nU\3V\3V\5V\u03c1\nV\3"+
		"V\3V\3W\3W\3W\3W\3X\3X\7X\u03cb\nX\fX\16X\u03ce\13X\3Y\3Y\3Y\3Y\7Y\u03d4"+
		"\nY\fY\16Y\u03d7\13Y\3Y\5Y\u03da\nY\3Z\3Z\3Z\7Z\u03df\nZ\fZ\16Z\u03e2"+
		"\13Z\3Z\3Z\3Z\3Z\5Z\u03e8\nZ\3Z\3Z\7Z\u03ec\nZ\fZ\16Z\u03ef\13Z\3Z\3Z"+
		"\3Z\3Z\5Z\u03f5\nZ\3Z\3Z\7Z\u03f9\nZ\fZ\16Z\u03fc\13Z\3Z\3Z\5Z\u0400\n"+
		"Z\5Z\u0402\nZ\3[\3[\5[\u0406\n[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]"+
		"\3]\3^\3^\7^\u0416\n^\f^\16^\u0419\13^\3^\5^\u041c\n^\3^\3^\3_\3_\5_\u0422"+
		"\n_\3_\3_\3`\3`\3`\3`\3`\5`\u042b\n`\3`\3`\3a\3a\5a\u0431\na\3a\3a\3a"+
		"\3a\7a\u0437\na\fa\16a\u043a\13a\3a\3a\7a\u043e\na\fa\16a\u0441\13a\3"+
		"b\3b\7b\u0445\nb\fb\16b\u0448\13b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\5c\u0456\nc\3d\3d\3d\3d\3d\5d\u045d\nd\3d\3d\3d\3d\5d\u0463\nd\3d\3d"+
		"\3e\3e\6e\u0469\ne\re\16e\u046a\3e\3e\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3"+
		"h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3j\3j\3j\5j\u0486\nj\3j\3j\3j\3j\5j\u048c"+
		"\nj\3j\3j\7j\u0490\nj\fj\16j\u0493\13j\3k\3k\3k\5k\u0498\nk\3l\3l\3l\3"+
		"l\3l\5l\u049f\nl\3l\3l\3m\3m\3n\3n\3n\3n\3n\7n\u04aa\nn\fn\16n\u04ad\13"+
		"n\3o\3o\5o\u04b1\no\3o\3o\3o\3o\3o\3p\3p\3p\5p\u04bb\np\3p\3p\3p\3p\5"+
		"p\u04c1\np\3q\3q\3r\3r\3r\3r\5r\u04c9\nr\3s\3s\3t\3t\3u\3u\5u\u04d1\n"+
		"u\3v\3v\3w\3w\5w\u04d7\nw\3w\2\4>`x\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\2\22\3\2\u00a3\u00a6\3\2tu\3\2\u0099\u009d"+
		"\3\2xy\4\2vw\u0089\u0089\4\2\u008a\u008a\u008c\u008c\3\2\u008e\u008f\5"+
		"\2\u0081\u0081\u008b\u008b\u008d\u008d\4\2xy\u0081\u0081\4\2tt\u0082\u0088"+
		"\3\2\u0099\u009b\4\2\n\n\32\32\4\2\26\26\30\30\3\2\b\t\4\2\3\3_`\3\2\5"+
		"Y\2\u0523\2\u00ef\3\2\2\2\4\u0101\3\2\2\2\6\u010c\3\2\2\2\b\u0117\3\2"+
		"\2\2\n\u0125\3\2\2\2\f\u012b\3\2\2\2\16\u0134\3\2\2\2\20\u013a\3\2\2\2"+
		"\22\u0141\3\2\2\2\24\u0158\3\2\2\2\26\u015a\3\2\2\2\30\u015f\3\2\2\2\32"+
		"\u016e\3\2\2\2\34\u0170\3\2\2\2\36\u017f\3\2\2\2 \u018e\3\2\2\2\"\u019f"+
		"\3\2\2\2$\u01aa\3\2\2\2&\u01b4\3\2\2\2(\u01ba\3\2\2\2*\u01bc\3\2\2\2,"+
		"\u01c2\3\2\2\2.\u01c8\3\2\2\2\60\u01cd\3\2\2\2\62\u01cf\3\2\2\2\64\u01d9"+
		"\3\2\2\2\66\u01e5\3\2\2\28\u01f3\3\2\2\2:\u01f5\3\2\2\2<\u01f7\3\2\2\2"+
		">\u01fc\3\2\2\2@\u020c\3\2\2\2B\u0213\3\2\2\2D\u0218\3\2\2\2F\u021c\3"+
		"\2\2\2H\u0223\3\2\2\2J\u0227\3\2\2\2L\u0229\3\2\2\2N\u024d\3\2\2\2P\u0252"+
		"\3\2\2\2R\u0254\3\2\2\2T\u0257\3\2\2\2V\u0259\3\2\2\2X\u025b\3\2\2\2Z"+
		"\u025d\3\2\2\2\\\u025f\3\2\2\2^\u0261\3\2\2\2`\u026d\3\2\2\2b\u02b5\3"+
		"\2\2\2d\u02bf\3\2\2\2f\u02c7\3\2\2\2h\u02c9\3\2\2\2j\u02cb\3\2\2\2l\u02cd"+
		"\3\2\2\2n\u02de\3\2\2\2p\u02e0\3\2\2\2r\u02e4\3\2\2\2t\u02f4\3\2\2\2v"+
		"\u02f6\3\2\2\2x\u02fb\3\2\2\2z\u02ff\3\2\2\2|\u0306\3\2\2\2~\u0311\3\2"+
		"\2\2\u0080\u0313\3\2\2\2\u0082\u031b\3\2\2\2\u0084\u031d\3\2\2\2\u0086"+
		"\u0324\3\2\2\2\u0088\u032a\3\2\2\2\u008a\u0347\3\2\2\2\u008c\u034f\3\2"+
		"\2\2\u008e\u0351\3\2\2\2\u0090\u0356\3\2\2\2\u0092\u035b\3\2\2\2\u0094"+
		"\u0365\3\2\2\2\u0096\u0369\3\2\2\2\u0098\u036b\3\2\2\2\u009a\u0375\3\2"+
		"\2\2\u009c\u037c\3\2\2\2\u009e\u0383\3\2\2\2\u00a0\u038a\3\2\2\2\u00a2"+
		"\u038c\3\2\2\2\u00a4\u038e\3\2\2\2\u00a6\u0399\3\2\2\2\u00a8\u03bc\3\2"+
		"\2\2\u00aa\u03be\3\2\2\2\u00ac\u03c4\3\2\2\2\u00ae\u03c8\3\2\2\2\u00b0"+
		"\u03cf\3\2\2\2\u00b2\u0401\3\2\2\2\u00b4\u0403\3\2\2\2\u00b6\u0409\3\2"+
		"\2\2\u00b8\u040e\3\2\2\2\u00ba\u0413\3\2\2\2\u00bc\u041f\3\2\2\2\u00be"+
		"\u0425\3\2\2\2\u00c0\u042e\3\2\2\2\u00c2\u0442\3\2\2\2\u00c4\u0455\3\2"+
		"\2\2\u00c6\u0457\3\2\2\2\u00c8\u0466\3\2\2\2\u00ca\u046e\3\2\2\2\u00cc"+
		"\u0473\3\2\2\2\u00ce\u0478\3\2\2\2\u00d0\u047d\3\2\2\2\u00d2\u0482\3\2"+
		"\2\2\u00d4\u0497\3\2\2\2\u00d6\u0499\3\2\2\2\u00d8\u04a2\3\2\2\2\u00da"+
		"\u04a4\3\2\2\2\u00dc\u04ae\3\2\2\2\u00de\u04c0\3\2\2\2\u00e0\u04c2\3\2"+
		"\2\2\u00e2\u04c8\3\2\2\2\u00e4\u04ca\3\2\2\2\u00e6\u04cc\3\2\2\2\u00e8"+
		"\u04d0\3\2\2\2\u00ea\u04d2\3\2\2\2\u00ec\u04d6\3\2\2\2\u00ee\u00f0\7a"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1"+
		"\u00f3\5\4\3\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00fc\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00fb\5\6\4\2\u00f8\u00fb\5\f\7\2\u00f9\u00fb\5\66\34\2\u00fa\u00f7\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0100\7\2\2\3\u0100\3\3\2\2\2\u0101\u0102\7R\2\2\u0102\u0107"+
		"\5\u00ecw\2\u0103\u0104\7l\2\2\u0104\u0106\5\u00ecw\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7z\2\2\u010b\5\3\2\2\2"+
		"\u010c\u0112\5\b\5\2\u010d\u0111\5\6\4\2\u010e\u0111\5\f\7\2\u010f\u0111"+
		"\5\66\34\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\5\n\6\2\u0116\7\3\2\2\2\u0117"+
		"\u0118\7C\2\2\u0118\u011d\5\u00ecw\2\u0119\u011a\7l\2\2\u011a\u011c\5"+
		"\u00ecw\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122"+
		"\7\67\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0124\7z\2\2\u0124\t\3\2\2\2\u0125\u0127\7\37\2\2\u0126\u0128\7"+
		"C\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\7z\2\2\u012a\13\3\2\2\2\u012b\u012f\5\20\t\2\u012c\u012e\5\66\34"+
		"\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5\16\b\2"+
		"\u0133\r\3\2\2\2\u0134\u0136\7\37\2\2\u0135\u0137\7N\2\2\u0136\u0135\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7z\2\2\u0139"+
		"\17\3\2\2\2\u013a\u013d\7N\2\2\u013b\u013e\5\22\n\2\u013c\u013e\5\26\f"+
		"\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140"+
		"\7z\2\2\u0140\21\3\2\2\2\u0141\u0142\7\32\2\2\u0142\u0143\7n\2\2\u0143"+
		"\u0148\5\24\13\2\u0144\u0145\7m\2\2\u0145\u0147\5\24\13\2\u0146\u0144"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7o\2\2\u014c\23\3\2\2\2"+
		"\u014d\u014e\7D\2\2\u014e\u014f\7n\2\2\u014f\u0150\7\3\2\2\u0150\u0159"+
		"\7o\2\2\u0151\u0155\7\7\2\2\u0152\u0153\7n\2\2\u0153\u0154\7f\2\2\u0154"+
		"\u0156\7o\2\2\u0155\u0152\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0159\7?\2\2\u0158\u014d\3\2\2\2\u0158\u0151\3\2\2\2\u0158"+
		"\u0157\3\2\2\2\u0159\25\3\2\2\2\u015a\u015b\78\2\2\u015b\u015c\7n\2\2"+
		"\u015c\u015d\5\30\r\2\u015d\u015e\7o\2\2\u015e\27\3\2\2\2\u015f\u0164"+
		"\5\32\16\2\u0160\u0161\7m\2\2\u0161\u0163\5\32\16\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\31"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016f\7\27\2\2\u0168\u016f\7\60\2\2"+
		"\u0169\u016a\7D\2\2\u016a\u016b\7n\2\2\u016b\u016c\7\3\2\2\u016c\u016f"+
		"\7o\2\2\u016d\u016f\7?\2\2\u016e\u0167\3\2\2\2\u016e\u0168\3\2\2\2\u016e"+
		"\u0169\3\2\2\2\u016e\u016d\3\2\2\2\u016f\33\3\2\2\2\u0170\u0174\5 \21"+
		"\2\u0171\u0173\5\66\34\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u017a\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0179\58\35\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u017e\5*\26\2\u017e\35\3\2\2\2\u017f\u0183\5\"\22\2\u0180\u0182"+
		"\5\66\34\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\u0189\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188"+
		"\58\35\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\5,"+
		"\27\2\u018d\37\3\2\2\2\u018e\u018f\78\2\2\u018f\u0191\5\u00ecw\2\u0190"+
		"\u0192\5\u00a4S\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194"+
		"\3\2\2\2\u0193\u0195\5&\24\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u019b\3\2\2\2\u0196\u0197\7N\2\2\u0197\u0198\7n\2\2\u0198\u0199\5\30"+
		"\r\2\u0199\u019a\7o\2\2\u019a\u019c\3\2\2\2\u019b\u0196\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7z\2\2\u019e!\3\2\2\2\u019f"+
		"\u01a0\7%\2\2\u01a0\u01a2\5\u00ecw\2\u01a1\u01a3\5\u00a4S\2\u01a2\u01a1"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\5.\30\2\u01a5"+
		"\u01a7\5(\25\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01a9\7z\2\2\u01a9#\3\2\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac"+
		"\5\u00ecw\2\u01ac\u01ad\7o\2\2\u01ad%\3\2\2\2\u01ae\u01b5\7/\2\2\u01af"+
		"\u01b0\7,\2\2\u01b0\u01b5\5$\23\2\u01b1\u01b5\7<\2\2\u01b2\u01b5\7+\2"+
		"\2\u01b3\u01b5\7\30\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4"+
		"\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\'\3\2\2\2"+
		"\u01b6\u01b7\7,\2\2\u01b7\u01bb\5$\23\2\u01b8\u01bb\7<\2\2\u01b9\u01bb"+
		"\7\26\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2"+
		"\u01bb)\3\2\2\2\u01bc\u01be\7\37\2\2\u01bd\u01bf\78\2\2\u01be\u01bd\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7z\2\2\u01c1"+
		"+\3\2\2\2\u01c2\u01c4\7\37\2\2\u01c3\u01c5\7%\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7z\2\2\u01c7-\3\2"+
		"\2\2\u01c8\u01c9\7B\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\5\u008aF\2\u01cb"+
		"\u01cc\7o\2\2\u01cc/\3\2\2\2\u01cd\u01ce\7z\2\2\u01ce\61\3\2\2\2\u01cf"+
		"\u01d3\7\4\2\2\u01d0\u01d2\t\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2"+
		"\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01d7\7\u00a2\2\2\u01d7\u01d8\7z\2\2\u01d8\63\3\2"+
		"\2\2\u01d9\u01de\7b\2\2\u01da\u01db\7n\2\2\u01db\u01dc\5\u00e8u\2\u01dc"+
		"\u01dd\7o\2\2\u01dd\u01df\3\2\2\2\u01de\u01da\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\65\3\2\2\2\u01e0\u01e6\5t;\2\u01e1\u01e6\5\u00c4c\2\u01e2\u01e6"+
		"\5\34\17\2\u01e3\u01e6\5\36\20\2\u01e4\u01e6\5:\36\2\u01e5\u01e0\3\2\2"+
		"\2\u01e5\u01e1\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e6\67\3\2\2\2\u01e7\u01f4\5\64\33\2\u01e8\u01f4\5<\37\2\u01e9"+
		"\u01f4\5l\67\2\u01ea\u01f4\5n8\2\u01eb\u01f4\5\u00a6T\2\u01ec\u01f4\5"+
		"\u00a8U\2\u01ed\u01f4\5\u00b2Z\2\u01ee\u01f4\5\u00ba^\2\u01ef\u01f4\5"+
		"p9\2\u01f0\u01f4\5r:\2\u01f1\u01f4\5\62\32\2\u01f2\u01f4\5:\36\2\u01f3"+
		"\u01e7\3\2\2\2\u01f3\u01e8\3\2\2\2\u01f3\u01e9\3\2\2\2\u01f3\u01ea\3\2"+
		"\2\2\u01f3\u01eb\3\2\2\2\u01f3\u01ec\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3"+
		"\u01ee\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f2\3\2\2\2\u01f49\3\2\2\2\u01f5\u01f6\7z\2\2\u01f6;\3\2"+
		"\2\2\u01f7\u01f8\5> \2\u01f8\u01f9\t\3\2\2\u01f9\u01fa\5`\61\2\u01fa\u01fb"+
		"\7z\2\2\u01fb=\3\2\2\2\u01fc\u01fd\b \1\2\u01fd\u01ff\5D#\2\u01fe\u0200"+
		"\5B\"\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0209\3\2\2\2\u0201"+
		"\u0202\f\4\2\2\u0202\u0203\7j\2\2\u0203\u0205\5D#\2\u0204\u0206\5B\"\2"+
		"\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0201"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"?\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020e\7n\2\2\u020d\u020f\5L\'\2\u020e"+
		"\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7o"+
		"\2\2\u0211A\3\2\2\2\u0212\u0214\5@!\2\u0213\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216C\3\2\2\2\u0217"+
		"\u0219\5H%\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021a\u021b\5\u00ecw\2\u021bE\3\2\2\2\u021c\u021e\5\u00ecw\2\u021d"+
		"\u021f\5@!\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2"+
		"\2\u0220\u0221\7l\2\2\u0221G\3\2\2\2\u0222\u0224\5F$\2\u0223\u0222\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"I\3\2\2\2\u0227\u0228\5`\61\2\u0228K\3\2\2\2\u0229\u022e\5J&\2\u022a\u022b"+
		"\7m\2\2\u022b\u022d\5J&\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022fM\3\2\2\2\u0230\u022e\3\2\2\2"+
		"\u0231\u0232\7n\2\2\u0232\u0233\5`\61\2\u0233\u0234\7o\2\2\u0234\u024e"+
		"\3\2\2\2\u0235\u0236\7\u0090\2\2\u0236\u0237\5`\61\2\u0237\u0238\7o\2"+
		"\2\u0238\u024e\3\2\2\2\u0239\u023a\7\u0091\2\2\u023a\u023b\5`\61\2\u023b"+
		"\u023c\7o\2\2\u023c\u024e\3\2\2\2\u023d\u023e\7\u0094\2\2\u023e\u023f"+
		"\5`\61\2\u023f\u0240\7o\2\2\u0240\u024e\3\2\2\2\u0241\u0242\7\u0092\2"+
		"\2\u0242\u0243\5`\61\2\u0243\u0244\7o\2\2\u0244\u024e\3\2\2\2\u0245\u0246"+
		"\7\u0093\2\2\u0246\u0247\5`\61\2\u0247\u0248\7o\2\2\u0248\u024e\3\2\2"+
		"\2\u0249\u024a\7\u0095\2\2\u024a\u024b\5`\61\2\u024b\u024c\7o\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u0231\3\2\2\2\u024d\u0235\3\2\2\2\u024d\u0239\3\2"+
		"\2\2\u024d\u023d\3\2\2\2\u024d\u0241\3\2\2\2\u024d\u0245\3\2\2\2\u024d"+
		"\u0249\3\2\2\2\u024eO\3\2\2\2\u024f\u0253\5\u00e2r\2\u0250\u0253\5\u00e0"+
		"q\2\u0251\u0253\5> \2\u0252\u024f\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0251"+
		"\3\2\2\2\u0253Q\3\2\2\2\u0254\u0255\5f\64\2\u0255\u0256\5`\61\2\u0256"+
		"S\3\2\2\2\u0257\u0258\t\4\2\2\u0258U\3\2\2\2\u0259\u025a\t\5\2\2\u025a"+
		"W\3\2\2\2\u025b\u025c\t\6\2\2\u025cY\3\2\2\2\u025d\u025e\t\7\2\2\u025e"+
		"[\3\2\2\2\u025f\u0260\t\b\2\2\u0260]\3\2\2\2\u0261\u0262\t\t\2\2\u0262"+
		"_\3\2\2\2\u0263\u0264\b\61\1\2\u0264\u026e\5P)\2\u0265\u026e\5N(\2\u0266"+
		"\u026e\5R*\2\u0267\u0268\5@!\2\u0268\u026b\7k\2\2\u0269\u026c\5b\62\2"+
		"\u026a\u026c\5d\63\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c\u026e"+
		"\3\2\2\2\u026d\u0263\3\2\2\2\u026d\u0265\3\2\2\2\u026d\u0266\3\2\2\2\u026d"+
		"\u0267\3\2\2\2\u026e\u029f\3\2\2\2\u026f\u0270\f\17\2\2\u0270\u0271\7"+
		"{\2\2\u0271\u029e\5`\61\17\u0272\u0273\f\16\2\2\u0273\u0274\5X-\2\u0274"+
		"\u0275\5`\61\17\u0275\u029e\3\2\2\2\u0276\u0277\f\r\2\2\u0277\u0278\5"+
		"V,\2\u0278\u0279\5`\61\16\u0279\u029e\3\2\2\2\u027a\u027b\f\f\2\2\u027b"+
		"\u027c\5T+\2\u027c\u027d\5`\61\r\u027d\u029e\3\2\2\2\u027e\u027f\f\13"+
		"\2\2\u027f\u0280\7\u0098\2\2\u0280\u029e\5`\61\f\u0281\u0282\f\n\2\2\u0282"+
		"\u0283\5h\65\2\u0283\u0284\5`\61\13\u0284\u029e\3\2\2\2\u0285\u0286\f"+
		"\t\2\2\u0286\u0287\5Z.\2\u0287\u0288\5`\61\n\u0288\u029e\3\2\2\2\u0289"+
		"\u028a\f\b\2\2\u028a\u028b\5\\/\2\u028b\u028c\5`\61\t\u028c\u029e\3\2"+
		"\2\2\u028d\u028e\f\7\2\2\u028e\u028f\5^\60\2\u028f\u0290\5`\61\b\u0290"+
		"\u029e\3\2\2\2\u0291\u0292\f\6\2\2\u0292\u0293\7\u0096\2\2\u0293\u029e"+
		"\5`\61\7\u0294\u0295\f\5\2\2\u0295\u0296\7\u0097\2\2\u0296\u029e\5`\61"+
		"\6\u0297\u0298\f\4\2\2\u0298\u029b\7k\2\2\u0299\u029c\5b\62\2\u029a\u029c"+
		"\5d\63\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u029e\3\2\2\2\u029d"+
		"\u026f\3\2\2\2\u029d\u0272\3\2\2\2\u029d\u0276\3\2\2\2\u029d\u027a\3\2"+
		"\2\2\u029d\u027e\3\2\2\2\u029d\u0281\3\2\2\2\u029d\u0285\3\2\2\2\u029d"+
		"\u0289\3\2\2\2\u029d\u028d\3\2\2\2\u029d\u0291\3\2\2\2\u029d\u0294\3\2"+
		"\2\2\u029d\u0297\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0a\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\7n\2\2\u02a3"+
		"\u02a6\5`\61\2\u02a4\u02a6\5@!\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2"+
		"\2\u02a6\u02ae\3\2\2\2\u02a7\u02aa\7m\2\2\u02a8\u02ab\5`\61\2\u02a9\u02ab"+
		"\5@!\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac"+
		"\u02a7\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\7|\2\2\u02b2"+
		"\u02b3\5`\61\2\u02b3\u02b4\7o\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02a2\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02bd\3\2\2\2\u02b9\u02ba\7n\2\2\u02ba\u02bb\5`\61\2\u02bb\u02bc\7o\2"+
		"\2\u02bc\u02be\3\2\2\2\u02bd\u02b9\3\2\2\2\u02bd\u02be\3\2\2\2\u02bec"+
		"\3\2\2\2\u02bf\u02c0\7n\2\2\u02c0\u02c1\5`\61\2\u02c1\u02c2\7o\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c4\7n\2\2\u02c4\u02c5\5`\61\2\u02c5\u02c6\7o\2"+
		"\2\u02c6e\3\2\2\2\u02c7\u02c8\t\n\2\2\u02c8g\3\2\2\2\u02c9\u02ca\t\13"+
		"\2\2\u02cai\3\2\2\2\u02cb\u02cc\t\f\2\2\u02cck\3\2\2\2\u02cd\u02ce\7\24"+
		"\2\2\u02ce\u02cf\5> \2\u02cf\u02d0\7z\2\2\u02d0m\3\2\2\2\u02d1\u02d2\7"+
		"&\2\2\u02d2\u02d3\5\u00ecw\2\u02d3\u02d4\7n\2\2\u02d4\u02d5\5`\61\2\u02d5"+
		"\u02d6\7o\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\7z\2\2\u02d8\u02df\3\2\2"+
		"\2\u02d9\u02da\7&\2\2\u02da\u02db\5> \2\u02db\u02dc\3\2\2\2\u02dc\u02dd"+
		"\7z\2\2\u02dd\u02df\3\2\2\2\u02de\u02d1\3\2\2\2\u02de\u02d9\3\2\2\2\u02df"+
		"o\3\2\2\2\u02e0\u02e2\7 \2\2\u02e1\u02e3\5\u00ecw\2\u02e2\u02e1\3\2\2"+
		"\2\u02e2\u02e3\3\2\2\2\u02e3q\3\2\2\2\u02e4\u02e6\7>\2\2\u02e5\u02e7\5"+
		"\u00ecw\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7s\3\2\2\2\u02e8"+
		"\u02e9\t\r\2\2\u02e9\u02eb\5\u00ecw\2\u02ea\u02ec\5|?\2\u02eb\u02ea\3"+
		"\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\5v<\2\u02ee"+
		"\u02ef\7z\2\2\u02ef\u02f5\3\2\2\2\u02f0\u02f1\t\r\2\2\u02f1\u02f2\5x="+
		"\2\u02f2\u02f3\7z\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02e8\3\2\2\2\u02f4\u02f0"+
		"\3\2\2\2\u02f5u\3\2\2\2\u02f6\u02f7\7\13\2\2\u02f7\u02f9\5\u00ecw\2\u02f8"+
		"\u02fa\5\u0088E\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02faw\3\2\2"+
		"\2\u02fb\u02fc\5\u00ecw\2\u02fc\u02fd\5z>\2\u02fdy\3\2\2\2\u02fe\u0300"+
		"\5|?\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301"+
		"\u0303\5\u0086D\2\u0302\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0302"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305{\3\2\2\2\u0306\u0307\7n\2\2\u0307\u0308"+
		"\5\u0080A\2\u0308\u0309\7o\2\2\u0309}\3\2\2\2\u030a\u030b\5\u0082B\2\u030b"+
		"\u030c\7|\2\2\u030c\u030e\3\2\2\2\u030d\u030a\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u0312\5\u0084C\2\u0310\u0312\7v\2\2\u0311"+
		"\u030d\3\2\2\2\u0311\u0310\3\2\2\2\u0312\177\3\2\2\2\u0313\u0318\5~@\2"+
		"\u0314\u0315\7m\2\2\u0315\u0317\5~@\2\u0316\u0314\3\2\2\2\u0317\u031a"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0081\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031b\u031c\5`\61\2\u031c\u0083\3\2\2\2\u031d\u031e\5`"+
		"\61\2\u031e\u0085\3\2\2\2\u031f\u0325\5\u008aF\2\u0320\u0325\7\21\2\2"+
		"\u0321\u0325\7U\2\2\u0322\u0325\5\u0088E\2\u0323\u0325\5\u008cG\2\u0324"+
		"\u031f\3\2\2\2\u0324\u0320\3\2\2\2\u0324\u0321\3\2\2\2\u0324\u0322\3\2"+
		"\2\2\u0324\u0323\3\2\2\2\u0325\u0087\3\2\2\2\u0326\u032b\7G\2\2\u0327"+
		"\u032b\7H\2\2\u0328\u032b\5\u009cO\2\u0329\u032b\5\u009eP\2\u032a\u0326"+
		"\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032b"+
		"\u0089\3\2\2\2\u032c\u032e\7\r\2\2\u032d\u032f\5\u0092J\2\u032e\u032d"+
		"\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0348\3\2\2\2\u0330\u0332\7\31\2\2"+
		"\u0331\u0333\5\u0092J\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0348\3\2\2\2\u0334\u0348\7\66\2\2\u0335\u0336\7\16\2\2\u0336\u0348\5"+
		"\u009aN\2\u0337\u0348\7\25\2\2\u0338\u0339\7I\2\2\u0339\u033c\5\u0098"+
		"M\2\u033a\u033d\5\u008eH\2\u033b\u033d\5\u0090I\2\u033c\u033a\3\2\2\2"+
		"\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0348\3\2\2\2\u033e\u0348"+
		"\7!\2\2\u033f\u0348\7#\2\2\u0340\u0348\7$\2\2\u0341\u0348\7\62\2\2\u0342"+
		"\u0348\7V\2\2\u0343\u0348\7\30\2\2\u0344\u0348\7\26\2\2\u0345\u0348\7"+
		"\21\2\2\u0346\u0348\7,\2\2\u0347\u032c\3\2\2\2\u0347\u0330\3\2\2\2\u0347"+
		"\u0334\3\2\2\2\u0347\u0335\3\2\2\2\u0347\u0337\3\2\2\2\u0347\u0338\3\2"+
		"\2\2\u0347\u033e\3\2\2\2\u0347\u033f\3\2\2\2\u0347\u0340\3\2\2\2\u0347"+
		"\u0341\3\2\2\2\u0347\u0342\3\2\2\2\u0347\u0343\3\2\2\2\u0347\u0344\3\2"+
		"\2\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u008b\3\2\2\2\u0349"+
		"\u0350\7?\2\2\u034a\u034b\7D\2\2\u034b\u034c\7n\2\2\u034c\u034d\7\3\2"+
		"\2\u034d\u0350\7o\2\2\u034e\u0350\7/\2\2\u034f\u0349\3\2\2\2\u034f\u034a"+
		"\3\2\2\2\u034f\u034e\3\2\2\2\u0350\u008d\3\2\2\2\u0351\u0352\7T\2\2\u0352"+
		"\u0353\7n\2\2\u0353\u0354\5\u00e8u\2\u0354\u0355\7o\2\2\u0355\u008f\3"+
		"\2\2\2\u0356\u0357\7:\2\2\u0357\u0358\7n\2\2\u0358\u0359\5\u00e8u\2\u0359"+
		"\u035a\7o\2\2\u035a\u0091\3\2\2\2\u035b\u035c\7n\2\2\u035c\u035f\5\u0094"+
		"K\2\u035d\u035e\7m\2\2\u035e\u0360\5\u0096L\2\u035f\u035d\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\7o\2\2\u0362\u0093\3\2"+
		"\2\2\u0363\u0366\7f\2\2\u0364\u0366\5\u00ecw\2\u0365\u0363\3\2\2\2\u0365"+
		"\u0364\3\2\2\2\u0366\u0095\3\2\2\2\u0367\u036a\7f\2\2\u0368\u036a\5\u00ec"+
		"w\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036a\u0097\3\2\2\2\u036b"+
		"\u0371\7n\2\2\u036c\u0372\7v\2\2\u036d\u0370\7f\2\2\u036e\u0370\5\u00ec"+
		"w\2\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u0372\3\2\2\2\u0371"+
		"\u036c\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\7o"+
		"\2\2\u0374\u0099\3\2\2\2\u0375\u0378\7n\2\2\u0376\u0379\7f\2\2\u0377\u0379"+
		"\5\u00ecw\2\u0378\u0376\3\2\2\2\u0378\u0377\3\2\2\2\u0379\u037a\3\2\2"+
		"\2\u037a\u037b\7o\2\2\u037b\u009b\3\2\2\2\u037c\u0381\7\f\2\2\u037d\u037e"+
		"\7n\2\2\u037e\u037f\5> \2\u037f\u0380\7o\2\2\u0380\u0382\3\2\2\2\u0381"+
		"\u037d\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u009d\3\2\2\2\u0383\u0388\7\34"+
		"\2\2\u0384\u0385\7n\2\2\u0385\u0386\5> \2\u0386\u0387\7o\2\2\u0387\u0389"+
		"\3\2\2\2\u0388\u0384\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u009f\3\2\2\2\u038a"+
		"\u038b\t\16\2\2\u038b\u00a1\3\2\2\2\u038c\u038d\7+\2\2\u038d\u00a3\3\2"+
		"\2\2\u038e\u038f\7n\2\2\u038f\u0394\5\u00ecw\2\u0390\u0391\7m\2\2\u0391"+
		"\u0393\5\u00ecw\2\u0392\u0390\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397"+
		"\u0398\7o\2\2\u0398\u00a5\3\2\2\2\u0399\u039e\7@\2\2\u039a\u039b\7n\2"+
		"\2\u039b\u039c\5`\61\2\u039c\u039d\7o\2\2\u039d\u039f\3\2\2\2\u039e\u039a"+
		"\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7z\2\2\u03a1"+
		"\u00a7\3\2\2\2\u03a2\u03a6\5\u00acW\2\u03a3\u03a5\58\35\2\u03a4\u03a3"+
		"\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03ab\5\u00aeX\2\u03aa\u03a9"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\5\u00aaV"+
		"\2\u03ad\u03bd\3\2\2\2\u03ae\u03b2\5\u00acW\2\u03af\u03b1\58\35\2\u03b0"+
		"\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b7\5\u00b0Y\2\u03b6"+
		"\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\5\u00aaV\2\u03bb\u03bd\3\2\2\2\u03bc"+
		"\u03a2\3\2\2\2\u03bc\u03ae\3\2\2\2\u03bd\u00a9\3\2\2\2\u03be\u03c0\7\37"+
		"\2\2\u03bf\u03c1\7\'\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c3\7z\2\2\u03c3\u00ab\3\2\2\2\u03c4\u03c5\7\'"+
		"\2\2\u03c5\u03c6\5`\61\2\u03c6\u03c7\7L\2\2\u03c7\u00ad\3\2\2\2\u03c8"+
		"\u03cc\7\36\2\2\u03c9\u03cb\58\35\2\u03ca\u03c9\3\2\2\2\u03cb\u03ce\3"+
		"\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u00af\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03cf\u03d0\7\35\2\2\u03d0\u03d1\5`\61\2\u03d1\u03d5\7"+
		"L\2\2\u03d2\u03d4\58\35\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5"+
		"\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d8\u03da\5\u00aeX\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u00b1\3\2\2\2\u03db\u03dc\7.\2\2\u03dc\u03e0\7z\2\2\u03dd\u03df\58\35"+
		"\2\u03de\u03dd\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1"+
		"\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u0402\5\u00b4["+
		"\2\u03e4\u03ff\7.\2\2\u03e5\u03e7\5\u00b6\\\2\u03e6\u03e8\5\u00b8]\2\u03e7"+
		"\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ed\7z"+
		"\2\2\u03ea\u03ec\58\35\2\u03eb\u03ea\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed"+
		"\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03ed\3\2"+
		"\2\2\u03f0\u03f1\5\u00b4[\2\u03f1\u0400\3\2\2\2\u03f2\u03f4\5\u00b8]\2"+
		"\u03f3\u03f5\5\u00b6\\\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u03fa\7z\2\2\u03f7\u03f9\58\35\2\u03f8\u03f7\3\2"+
		"\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03fe\5\u00b4[\2\u03fe\u0400"+
		"\3\2\2\2\u03ff\u03e5\3\2\2\2\u03ff\u03f2\3\2\2\2\u0400\u0402\3\2\2\2\u0401"+
		"\u03db\3\2\2\2\u0401\u03e4\3\2\2\2\u0402\u00b3\3\2\2\2\u0403\u0405\7\37"+
		"\2\2\u0404\u0406\7.\2\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0408\7z\2\2\u0408\u00b5\3\2\2\2\u0409\u040a\7X\2"+
		"\2\u040a\u040b\7n\2\2\u040b\u040c\5`\61\2\u040c\u040d\7o\2\2\u040d\u00b7"+
		"\3\2\2\2\u040e\u040f\7Q\2\2\u040f\u0410\7n\2\2\u0410\u0411\5`\61\2\u0411"+
		"\u0412\7o\2\2\u0412\u00b9\3\2\2\2\u0413\u0417\5\u00be`\2\u0414\u0416\5"+
		"\u00c0a\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2"+
		"\u0417\u0418\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041c"+
		"\5\u00c2b\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2"+
		"\2\u041d\u041e\5\u00bc_\2\u041e\u00bb\3\2\2\2\u041f\u0421\7\37\2\2\u0420"+
		"\u0422\7E\2\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2"+
		"\2\2\u0423\u0424\7z\2\2\u0424\u00bd\3\2\2\2\u0425\u042a\7E\2\2\u0426\u0427"+
		"\7n\2\2\u0427\u0428\5`\61\2\u0428\u0429\7o\2\2\u0429\u042b\3\2\2\2\u042a"+
		"\u0426\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7z"+
		"\2\2\u042d\u00bf\3\2\2\2\u042e\u0430\7W\2\2\u042f\u0431\t\17\2\2\u0430"+
		"\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\7n"+
		"\2\2\u0433\u0438\5`\61\2\u0434\u0435\7m\2\2\u0435\u0437\5`\61\2\u0436"+
		"\u0434\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2"+
		"\2\2\u0439\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043f\7o\2\2\u043c"+
		"\u043e\58\35\2\u043d\u043c\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u00c1\3\2\2\2\u0441\u043f\3\2\2\2\u0442"+
		"\u0446\7\36\2\2\u0443\u0445\58\35\2\u0444\u0443\3\2\2\2\u0445\u0448\3"+
		"\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u00c3\3\2\2\2\u0448"+
		"\u0446\3\2\2\2\u0449\u044a\7\33\2\2\u044a\u044b\5\u00ecw\2\u044b\u044c"+
		"\5\u00c6d\2\u044c\u0456\3\2\2\2\u044d\u044e\7\33\2\2\u044e\u044f\5\u00ec"+
		"w\2\u044f\u0450\5\u00d6l\2\u0450\u0456\3\2\2\2\u0451\u0452\7\33\2\2\u0452"+
		"\u0453\5\u00ecw\2\u0453\u0454\5\u00c8e\2\u0454\u0456\3\2\2\2\u0455\u0449"+
		"\3\2\2\2\u0455\u044d\3\2\2\2\u0455\u0451\3\2\2\2\u0456\u00c5\3\2\2\2\u0457"+
		"\u045c\7\"\2\2\u0458\u045d\5\u00caf\2\u0459\u045d\5\u00ccg\2\u045a\u045d"+
		"\5\u00ceh\2\u045b\u045d\5\u00d0i\2\u045c\u0458\3\2\2\2\u045c\u0459\3\2"+
		"\2\2\u045c\u045a\3\2\2\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d"+
		"\u045e\3\2\2\2\u045e\u045f\7z\2\2\u045f\u0460\5\u00d2j\2\u0460\u0462\7"+
		"\37\2\2\u0461\u0463\7\"\2\2\u0462\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0465\7z\2\2\u0465\u00c7\3\2\2\2\u0466\u0468\7\6"+
		"\2\2\u0467\u0469\5\u0086D\2\u0468\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\7z"+
		"\2\2\u046d\u00c9\3\2\2\2\u046e\u046f\7\r\2\2\u046f\u0470\7n\2\2\u0470"+
		"\u0471\5\u00e8u\2\u0471\u0472\7o\2\2\u0472\u00cb\3\2\2\2\u0473\u0474\7"+
		"\31\2\2\u0474\u0475\7n\2\2\u0475\u0476\5\u00e8u\2\u0476\u0477\7o\2\2\u0477"+
		"\u00cd\3\2\2\2\u0478\u0479\7I\2\2\u0479\u047a\7n\2\2\u047a\u047b\5\u00e8"+
		"u\2\u047b\u047c\7o\2\2\u047c\u00cf\3\2\2\2\u047d\u047e\7\16\2\2\u047e"+
		"\u047f\7n\2\2\u047f\u0480\5\u00e8u\2\u0480\u0481\7o\2\2\u0481\u00d1\3"+
		"\2\2\2\u0482\u0485\5\u00ecw\2\u0483\u0484\7t\2\2\u0484\u0486\5\u00d4k"+
		"\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0491"+
		"\7z\2\2\u0488\u048b\5\u00ecw\2\u0489\u048a\7t\2\2\u048a\u048c\5\u00d4"+
		"k\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048e\7z\2\2\u048e\u0490\3\2\2\2\u048f\u0488\3\2\2\2\u0490\u0493\3\2"+
		"\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u00d3\3\2\2\2\u0493"+
		"\u0491\3\2\2\2\u0494\u0498\5\u00e8u\2\u0495\u0498\5\u00e0q\2\u0496\u0498"+
		"\5\u00eav\2\u0497\u0494\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0496\3\2\2"+
		"\2\u0498\u00d5\3\2\2\2\u0499\u049a\7J\2\2\u049a\u049b\7z\2\2\u049b\u049c"+
		"\5\u00d8m\2\u049c\u049e\7\37\2\2\u049d\u049f\7J\2\2\u049e\u049d\3\2\2"+
		"\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\7z\2\2\u04a1\u00d7"+
		"\3\2\2\2\u04a2\u04a3\5\u00dan\2\u04a3\u00d9\3\2\2\2\u04a4\u04a5\5\u00de"+
		"p\2\u04a5\u04ab\7z\2\2\u04a6\u04a7\5\u00dep\2\u04a7\u04a8\7z\2\2\u04a8"+
		"\u04aa\3\2\2\2\u04a9\u04a6\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2"+
		"\2\2\u04ab\u04ac\3\2\2\2\u04ac\u00db\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae"+
		"\u04b0\5\u00ecw\2\u04af\u04b1\5|?\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3"+
		"\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\7J\2\2\u04b3\u04b4\7z\2\2\u04b4"+
		"\u04b5\5\u00d8m\2\u04b5\u04b6\7\37\2\2\u04b6\u00dd\3\2\2\2\u04b7\u04c1"+
		"\5\u00dco\2\u04b8\u04ba\5\u00ecw\2\u04b9\u04bb\5|?\2\u04ba\u04b9\3\2\2"+
		"\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7\13\2\2\u04bd"+
		"\u04be\5\u00ecw\2\u04be\u04c1\3\2\2\2\u04bf\u04c1\5x=\2\u04c0\u04b7\3"+
		"\2\2\2\u04c0\u04b8\3\2\2\2\u04c0\u04bf\3\2\2\2\u04c1\u00df\3\2\2\2\u04c2"+
		"\u04c3\t\20\2\2\u04c3\u00e1\3\2\2\2\u04c4\u04c9\5\u00eav\2\u04c5\u04c9"+
		"\5\u00e6t\2\u04c6\u04c9\5\u00e4s\2\u04c7\u04c9\5\u00e8u\2\u04c8\u04c4"+
		"\3\2\2\2\u04c8\u04c5\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8\u04c7\3\2\2\2\u04c9"+
		"\u00e3\3\2\2\2\u04ca\u04cb\7e\2\2\u04cb\u00e5\3\2\2\2\u04cc\u04cd\7d\2"+
		"\2\u04cd\u00e7\3\2\2\2\u04ce\u04d1\7f\2\2\u04cf\u04d1\7g\2\2\u04d0\u04ce"+
		"\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1\u00e9\3\2\2\2\u04d2\u04d3\7c\2\2\u04d3"+
		"\u00eb\3\2\2\2\u04d4\u04d7\t\21\2\2\u04d5\u04d7\7h\2\2\u04d6\u04d4\3\2"+
		"\2\2\u04d6\u04d5\3\2\2\2\u04d7\u00ed\3\2\2\2\177\u00ef\u00f4\u00fa\u00fc"+
		"\u0107\u0110\u0112\u011d\u0121\u0127\u012f\u0136\u013d\u0148\u0155\u0158"+
		"\u0164\u016e\u0174\u017a\u0183\u0189\u0191\u0194\u019b\u01a2\u01a6\u01b4"+
		"\u01ba\u01be\u01c4\u01d3\u01de\u01e5\u01f3\u01ff\u0205\u0209\u020e\u0215"+
		"\u0218\u021e\u0225\u022e\u024d\u0252\u026b\u026d\u029b\u029d\u029f\u02a5"+
		"\u02aa\u02ae\u02b7\u02bd\u02de\u02e2\u02e6\u02eb\u02f4\u02f9\u02ff\u0304"+
		"\u030d\u0311\u0318\u0324\u032a\u032e\u0332\u033c\u0347\u034f\u035f\u0365"+
		"\u0369\u036f\u0371\u0378\u0381\u0388\u0394\u039e\u03a6\u03aa\u03b2\u03b8"+
		"\u03bc\u03c0\u03cc\u03d5\u03d9\u03e0\u03e7\u03ed\u03f4\u03fa\u03ff\u0401"+
		"\u0405\u0417\u041b\u0421\u042a\u0430\u0438\u043f\u0446\u0455\u045c\u0462"+
		"\u046a\u0485\u048b\u0491\u0497\u049e\u04ab\u04b0\u04ba\u04c0\u04c8\u04d0"+
		"\u04d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}