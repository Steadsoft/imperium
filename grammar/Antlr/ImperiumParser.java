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
		E_INTEGER=163, ASSCODE=164;
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
			"A_TAB", "BAR", "EMITPUNCTUATOR", "E_IDENTIFIER", "E_INTEGER", "ASSCODE"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014432919552256L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 36028797018966017L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitUses(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014432919552256L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 36028797018966017L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScopeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScopeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitScopeStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public ScopeEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScopeEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScopeEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitScopeEnd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTraits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTraits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitTraits(this);
			else return visitor.visitChildren(this);
		}
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014432919552256L) != 0 || _la==SEMICOLON) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TraitsEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TraitsEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitsEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTraitsEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTraitsEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitTraitsEnd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTraitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTraitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitTraitStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclarationTraits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclarationTraits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDeclarationTraits(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclarationTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclarationTrait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDeclarationTrait(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureTraits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureTraits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitProcedureTraits(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureTraitsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureTraitsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitProcedureTraitsList(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureTrait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitProcedureTrait(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitProcedureStmt(this);
			else return visitor.visitChildren(this);
		}
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
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 288272157597761536L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunctionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunctionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitFunctionStmt(this);
			else return visitor.visitChildren(this);
		}
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
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 288234774199271424L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTargetSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTargetSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitTargetSpec(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitProcedureAttributes(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunctionAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunctionAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitFunctionAttributes(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public ProcedureEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitProcedureEnd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public FunctionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunctionEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunctionEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitFunctionEnd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterReturnsDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitReturnsDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitReturnsDescriptor(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminatorContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEmitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEmitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitEmitStmt(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 15L) != 0) {
				{
				{
				setState(462);
				_la = _input.LA(1);
				if ( !((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 15L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLabelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLabelStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitLabelStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPassiveStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPassiveStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitPassiveStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterActiveStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitActiveStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitActiveStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NullStmtContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public NullStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNullStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNullStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitNullStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class BasicRefContext extends ReferenceContext {
		public BasicReferenceContext basicReference() {
			return getRuleContext(BasicReferenceContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public BasicRefContext(ReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBasicRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBasicRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBasicRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPtrRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPtrRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitPtrRef(this);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
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
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -6L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9169310706347016193L) != 0 || (((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 63L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitArgumentsList(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBasicReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBasicReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBasicReference(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructureQualification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructureQualification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStructureQualification(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructureQualificationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructureQualificationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStructureQualificationList(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSubscriptCommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSubscriptCommalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitSubscriptCommalist(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrimitiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrimitiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitPrimitiveExpression(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBitAdjustOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBitAdjustOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBitAdjustOperator(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & 31L) != 0) ) {
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
	public static class AdditionOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public AdditionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAdditionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAdditionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitAdditionOperator(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyOperatorContext extends VisitorContext {
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public TerminalNode DIVIDE_U() { return getToken(ImperiumParser.DIVIDE_U, 0); }
		public TerminalNode PCNT() { return getToken(ImperiumParser.PCNT, 0); }
		public MultiplyOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMultiplyOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMultiplyOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitMultiplyOperator(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 524291L) != 0) ) {
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
	public static class BoolAndOperatorContext extends VisitorContext {
		public TerminalNode AND() { return getToken(ImperiumParser.AND, 0); }
		public TerminalNode NAND() { return getToken(ImperiumParser.NAND, 0); }
		public BoolAndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAndOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoolAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoolAndOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBoolAndOperator(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolXorOperatorContext extends VisitorContext {
		public TerminalNode XOR_U() { return getToken(ImperiumParser.XOR_U, 0); }
		public TerminalNode XNOR_U() { return getToken(ImperiumParser.XNOR_U, 0); }
		public BoolXorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolXorOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoolXorOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoolXorOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBoolXorOperator(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolOrOperatorContext extends VisitorContext {
		public TerminalNode OR() { return getToken(ImperiumParser.OR, 0); }
		public TerminalNode NOR() { return getToken(ImperiumParser.NOR, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public BoolOrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOrOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoolOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoolOrOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBoolOrOperator(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & 5121L) != 0) ) {
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
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConcatContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONC() { return getToken(ImperiumParser.CONC, 0); }
		public ExprConcatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRaiseContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER_U() { return getToken(ImperiumParser.POWER_U, 0); }
		public ExprRaiseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprRaise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprRaise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprRaise(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBoolXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBoolXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprBoolXor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGAND() { return getToken(ImperiumParser.LOGAND, 0); }
		public ExprLogAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprLogAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprLogAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprLogAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBitAdjust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBitAdjust(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprBitAdjust(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExpreMap1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExpreMap1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExpreMap1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenthesizedContext extends ExpressionContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public ExprParenthesizedContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprParenthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExpreMap2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExpreMap2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExpreMap2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGOR() { return getToken(ImperiumParser.LOGOR, 0); }
		public ExprLogOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprLogOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprLogOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprLogOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrefixedContext extends ExpressionContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public ExprPrefixedContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprPrefixed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprPrefixed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprPrefixed(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrimitiveContext extends ExpressionContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ExprPrimitiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitExprPrimitive(this);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMap_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMap_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitMap_set(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBool_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBool_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBool_set(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrefixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitPrefixOperator(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 515L) != 0) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 2080769L) != 0) ) {
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
	public static class ShiftOperatorContext extends VisitorContext {
		public TerminalNode R_LOG_SHIFT() { return getToken(ImperiumParser.R_LOG_SHIFT, 0); }
		public TerminalNode L_LOG_SHIFT() { return getToken(ImperiumParser.L_LOG_SHIFT, 0); }
		public TerminalNode R_ART_SHIFT() { return getToken(ImperiumParser.R_ART_SHIFT, 0); }
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & 7L) != 0) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitGotoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitGotoStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndloopStmtContext extends VisitorContext {
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EndloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endloopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEndloopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEndloopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitEndloopStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReloopStmtContext extends VisitorContext {
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterReloopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitReloopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitReloopStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDeclareStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclareAsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclareAsBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDeclareAsBody(this);
			else return visitor.visitChildren(this);
		}
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
			if ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 1729382256910336001L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclarationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDeclarationBody(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTypeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTypeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitTypeInfo(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2310667694234967040L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 393273L) != 0 );
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDimensionSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDimensionSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDimensionSuffix(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoundPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoundPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBoundPair(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoundPairCommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoundPairCommalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBoundPairCommalist(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LowerBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLowerBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLowerBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitLowerBound(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpperBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUpperBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUpperBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitUpperBound(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMemoryAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMemoryAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitMemoryAttribute(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDataAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDataAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDataAttribute(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLinkage_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLinkage_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitLinkage_attribute(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUtfSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUtfSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitUtfSpec(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterRawSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitRawSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitRawSpec(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberOfDigitsContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberOfDigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberOfDigits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNumberOfDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNumberOfDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitNumberOfDigits(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scale_factorContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Scale_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScale_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScale_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitScale_factor(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMaxStringLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMaxStringLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitMaxStringLength(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMaxLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMaxLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitMaxLength(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBased(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBased(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBased(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDefined(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDefined(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CoprocedureSpecifierContext extends VisitorContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public CoprocedureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coprocedureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterCoprocedureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitCoprocedureSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitCoprocedureSpecifier(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class HandlerSpecifierContext extends VisitorContext {
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public HandlerSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterHandlerSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitHandlerSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitHandlerSpecifier(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterParameterNameCommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitParameterNameCommalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitParameterNameCommalist(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public IfEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterIfEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitIfEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitIfEnd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterThenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitThenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitThenClause(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterElifClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitElifClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitElifClause(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public LoopEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLoopEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLoopEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitLoopEnd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterWhileOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitWhileOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitWhileOption(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUntilOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUntilOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitUntilOption(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public SelectEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSelectEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSelectEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitSelectEnd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterOtherwiseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitOtherwiseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitOtherwiseClause(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDefineStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDefineStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDefineStmt(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAliasType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAliasType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitAliasType(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2310667694234967040L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 393273L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBinaryEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBinaryEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBinaryEnum(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDecimalEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDecimalEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDecimalEnum(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStringEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStringEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStringEnum(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBitEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBitEnum(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEnumLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitEnumLiteral(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructBodyContext extends VisitorContext {
		public StructMemberListContext structMemberList() {
			return getRuleContext(StructMemberListContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructMemberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStructMemberList(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructSubstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructSubstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStructSubstruct(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStructMember(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends VisitorContext {
		public TerminalNode STRING_LITERAL_3() { return getToken(ImperiumParser.STRING_LITERAL_3, 0); }
		public TerminalNode STRING_LITERAL_2() { return getToken(ImperiumParser.STRING_LITERAL_2, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class HexLiteralContext extends VisitorContext {
		public TerminalNode HEXADECIMAL_PATTERN() { return getToken(ImperiumParser.HEXADECIMAL_PATTERN, 0); }
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterHexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitHexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitHexLiteral(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OctalLiteralContext extends VisitorContext {
		public TerminalNode OCTAL_PATTERN() { return getToken(ImperiumParser.OCTAL_PATTERN, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterOctalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitOctalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitOctalLiteral(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public TerminalNode DECIMAL_PATTERN() { return getToken(ImperiumParser.DECIMAL_PATTERN, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryLiteralContext extends VisitorContext {
		public TerminalNode BINARY_PATTERN() { return getToken(ImperiumParser.BINARY_PATTERN, 0); }
		public BinaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperiumVisitor ) return ((ImperiumVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
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
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -8L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16777215L) != 0) ) {
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
		"\u0004\u0001\u00a4\u04d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0001\u0000\u0003\u0000\u00ee"+
		"\b\u0000\u0001\u0000\u0005\u0000\u00f1\b\u0000\n\u0000\f\u0000\u00f4\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00f9\b\u0000\n"+
		"\u0000\f\u0000\u00fc\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0104\b\u0001\n\u0001\f\u0001"+
		"\u0107\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u010f\b\u0002\n\u0002\f\u0002\u0112\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u011a\b\u0003\n\u0003\f\u0003\u011d\t\u0003\u0001\u0003\u0003\u0003"+
		"\u0120\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0126\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u012c\b\u0005\n\u0005\f\u0005\u012f\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0135\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u013c\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0145\b\b\n\b\f"+
		"\b\u0148\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0154\b\t\u0001\t\u0003\t\u0157\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0161\b\u000b\n\u000b\f\u000b\u0164\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u016d\b\f\u0001\r\u0001\r\u0005"+
		"\r\u0171\b\r\n\r\f\r\u0174\t\r\u0001\r\u0005\r\u0177\b\r\n\r\f\r\u017a"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u0180\b\u000e"+
		"\n\u000e\f\u000e\u0183\t\u000e\u0001\u000e\u0005\u000e\u0186\b\u000e\n"+
		"\u000e\f\u000e\u0189\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0190\b\u000f\u0001\u000f\u0003\u000f\u0193"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u019a\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01a1\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01a5"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u01b3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01b9\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u01bd"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01c3"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u01d0\b\u0018\n\u0018\f\u0018\u01d3\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01dd\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01e4\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01f2\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01fe\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0204\b\u001e\u0005\u001e"+
		"\u0206\b\u001e\n\u001e\f\u001e\u0209\t\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u020d\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0004 \u0212\b \u000b"+
		" \f \u0213\u0001!\u0003!\u0217\b!\u0001!\u0001!\u0001\"\u0001\"\u0003"+
		"\"\u021d\b\"\u0001\"\u0001\"\u0001#\u0004#\u0222\b#\u000b#\f#\u0223\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0005%\u022b\b%\n%\f%\u022e\t%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u024c\b&\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0251\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u026a\b/\u0003"+
		"/\u026c\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u029a\b/\u0005/\u029c\b/\n"+
		"/\f/\u029f\t/\u00010\u00010\u00010\u00030\u02a4\b0\u00010\u00010\u0001"+
		"0\u00030\u02a9\b0\u00050\u02ab\b0\n0\f0\u02ae\t0\u00010\u00010\u00010"+
		"\u00010\u00040\u02b4\b0\u000b0\f0\u02b5\u00010\u00010\u00010\u00010\u0003"+
		"0\u02bc\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00013\u00013\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u02dd\b6\u00017\u00017\u00037\u02e1\b7\u00018\u0001"+
		"8\u00038\u02e5\b8\u00019\u00019\u00019\u00039\u02ea\b9\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u02f3\b9\u0001:\u0001:\u0001:\u0003"+
		":\u02f8\b:\u0001;\u0001;\u0001;\u0001<\u0003<\u02fe\b<\u0001<\u0004<\u0301"+
		"\b<\u000b<\f<\u0302\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0003"+
		">\u030c\b>\u0001>\u0001>\u0003>\u0310\b>\u0001?\u0001?\u0001?\u0005?\u0315"+
		"\b?\n?\f?\u0318\t?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0003B\u0323\bB\u0001C\u0001C\u0001C\u0001C\u0003C\u0329\bC\u0001"+
		"D\u0001D\u0003D\u032d\bD\u0001D\u0001D\u0003D\u0331\bD\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u033b\bD\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0346\bD\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0003E\u034e\bE\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001"+
		"H\u0003H\u035e\bH\u0001H\u0001H\u0001I\u0001I\u0003I\u0364\bI\u0001J\u0001"+
		"J\u0003J\u0368\bJ\u0001K\u0001K\u0001K\u0001K\u0003K\u036e\bK\u0003K\u0370"+
		"\bK\u0001K\u0001K\u0001L\u0001L\u0001L\u0003L\u0377\bL\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0003M\u0380\bM\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0003N\u0387\bN\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0005Q\u0391\bQ\nQ\fQ\u0394\tQ\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0003R\u039d\bR\u0001R\u0001R\u0001S\u0001S\u0005S\u03a3"+
		"\bS\nS\fS\u03a6\tS\u0001S\u0003S\u03a9\bS\u0001S\u0001S\u0001S\u0001S"+
		"\u0005S\u03af\bS\nS\fS\u03b2\tS\u0001S\u0004S\u03b5\bS\u000bS\fS\u03b6"+
		"\u0001S\u0001S\u0003S\u03bb\bS\u0001T\u0001T\u0003T\u03bf\bT\u0001T\u0001"+
		"T\u0001U\u0001U\u0001U\u0001U\u0001V\u0001V\u0005V\u03c9\bV\nV\fV\u03cc"+
		"\tV\u0001W\u0001W\u0001W\u0001W\u0005W\u03d2\bW\nW\fW\u03d5\tW\u0001W"+
		"\u0003W\u03d8\bW\u0001X\u0001X\u0001X\u0005X\u03dd\bX\nX\fX\u03e0\tX\u0001"+
		"X\u0001X\u0001X\u0001X\u0003X\u03e6\bX\u0001X\u0001X\u0005X\u03ea\bX\n"+
		"X\fX\u03ed\tX\u0001X\u0001X\u0001X\u0001X\u0003X\u03f3\bX\u0001X\u0001"+
		"X\u0005X\u03f7\bX\nX\fX\u03fa\tX\u0001X\u0001X\u0003X\u03fe\bX\u0003X"+
		"\u0400\bX\u0001Y\u0001Y\u0003Y\u0404\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0005"+
		"\\\u0414\b\\\n\\\f\\\u0417\t\\\u0001\\\u0003\\\u041a\b\\\u0001\\\u0001"+
		"\\\u0001]\u0001]\u0003]\u0420\b]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0003^\u0429\b^\u0001^\u0001^\u0001_\u0001_\u0003_\u042f\b_\u0001"+
		"_\u0001_\u0001_\u0001_\u0005_\u0435\b_\n_\f_\u0438\t_\u0001_\u0001_\u0005"+
		"_\u043c\b_\n_\f_\u043f\t_\u0001`\u0001`\u0005`\u0443\b`\n`\f`\u0446\t"+
		"`\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0003a\u0454\ba\u0001b\u0001b\u0001b\u0001b\u0001b\u0003"+
		"b\u045b\bb\u0001b\u0001b\u0001b\u0001b\u0003b\u0461\bb\u0001b\u0001b\u0001"+
		"c\u0001c\u0004c\u0467\bc\u000bc\fc\u0468\u0001c\u0001c\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001e\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0001g\u0001g\u0001g\u0001g\u0001g\u0001h\u0001h\u0001"+
		"h\u0003h\u0484\bh\u0001h\u0001h\u0001h\u0001h\u0003h\u048a\bh\u0001h\u0001"+
		"h\u0005h\u048e\bh\nh\fh\u0491\th\u0001i\u0001i\u0001i\u0003i\u0496\bi"+
		"\u0001j\u0001j\u0001j\u0001j\u0001j\u0003j\u049d\bj\u0001j\u0001j\u0001"+
		"k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0005l\u04a8\bl\nl\fl\u04ab"+
		"\tl\u0001m\u0001m\u0003m\u04af\bm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"n\u0001n\u0001n\u0003n\u04b9\bn\u0001n\u0001n\u0001n\u0001n\u0003n\u04bf"+
		"\bn\u0001o\u0001o\u0001p\u0001p\u0001p\u0001p\u0003p\u04c7\bp\u0001q\u0001"+
		"q\u0001r\u0001r\u0001s\u0001s\u0003s\u04cf\bs\u0001t\u0001t\u0001u\u0001"+
		"u\u0003u\u04d5\bu\u0001u\u0000\u0002<^v\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u0000\u0010\u0001\u0000\u00a1\u00a4\u0001\u0000rs\u0001\u0000\u0097\u009b"+
		"\u0001\u0000vw\u0002\u0000tu\u0087\u0087\u0002\u0000\u0088\u0088\u008a"+
		"\u008a\u0001\u0000\u008c\u008d\u0003\u0000\u007f\u007f\u0089\u0089\u008b"+
		"\u008b\u0002\u0000vw\u007f\u007f\u0002\u0000rr\u0080\u0086\u0001\u0000"+
		"\u0097\u0099\u0002\u0000\b\b\u0018\u0018\u0002\u0000\u0014\u0014\u0016"+
		"\u0016\u0001\u0000\u0006\u0007\u0002\u0000\u0001\u0001]^\u0001\u0000\u0003"+
		"W\u0521\u0000\u00ed\u0001\u0000\u0000\u0000\u0002\u00ff\u0001\u0000\u0000"+
		"\u0000\u0004\u010a\u0001\u0000\u0000\u0000\u0006\u0115\u0001\u0000\u0000"+
		"\u0000\b\u0123\u0001\u0000\u0000\u0000\n\u0129\u0001\u0000\u0000\u0000"+
		"\f\u0132\u0001\u0000\u0000\u0000\u000e\u0138\u0001\u0000\u0000\u0000\u0010"+
		"\u013f\u0001\u0000\u0000\u0000\u0012\u0156\u0001\u0000\u0000\u0000\u0014"+
		"\u0158\u0001\u0000\u0000\u0000\u0016\u015d\u0001\u0000\u0000\u0000\u0018"+
		"\u016c\u0001\u0000\u0000\u0000\u001a\u016e\u0001\u0000\u0000\u0000\u001c"+
		"\u017d\u0001\u0000\u0000\u0000\u001e\u018c\u0001\u0000\u0000\u0000 \u019d"+
		"\u0001\u0000\u0000\u0000\"\u01a8\u0001\u0000\u0000\u0000$\u01b2\u0001"+
		"\u0000\u0000\u0000&\u01b8\u0001\u0000\u0000\u0000(\u01ba\u0001\u0000\u0000"+
		"\u0000*\u01c0\u0001\u0000\u0000\u0000,\u01c6\u0001\u0000\u0000\u0000."+
		"\u01cb\u0001\u0000\u0000\u00000\u01cd\u0001\u0000\u0000\u00002\u01d7\u0001"+
		"\u0000\u0000\u00004\u01e3\u0001\u0000\u0000\u00006\u01f1\u0001\u0000\u0000"+
		"\u00008\u01f3\u0001\u0000\u0000\u0000:\u01f5\u0001\u0000\u0000\u0000<"+
		"\u01fa\u0001\u0000\u0000\u0000>\u020a\u0001\u0000\u0000\u0000@\u0211\u0001"+
		"\u0000\u0000\u0000B\u0216\u0001\u0000\u0000\u0000D\u021a\u0001\u0000\u0000"+
		"\u0000F\u0221\u0001\u0000\u0000\u0000H\u0225\u0001\u0000\u0000\u0000J"+
		"\u0227\u0001\u0000\u0000\u0000L\u024b\u0001\u0000\u0000\u0000N\u0250\u0001"+
		"\u0000\u0000\u0000P\u0252\u0001\u0000\u0000\u0000R\u0255\u0001\u0000\u0000"+
		"\u0000T\u0257\u0001\u0000\u0000\u0000V\u0259\u0001\u0000\u0000\u0000X"+
		"\u025b\u0001\u0000\u0000\u0000Z\u025d\u0001\u0000\u0000\u0000\\\u025f"+
		"\u0001\u0000\u0000\u0000^\u026b\u0001\u0000\u0000\u0000`\u02b3\u0001\u0000"+
		"\u0000\u0000b\u02bd\u0001\u0000\u0000\u0000d\u02c5\u0001\u0000\u0000\u0000"+
		"f\u02c7\u0001\u0000\u0000\u0000h\u02c9\u0001\u0000\u0000\u0000j\u02cb"+
		"\u0001\u0000\u0000\u0000l\u02dc\u0001\u0000\u0000\u0000n\u02de\u0001\u0000"+
		"\u0000\u0000p\u02e2\u0001\u0000\u0000\u0000r\u02f2\u0001\u0000\u0000\u0000"+
		"t\u02f4\u0001\u0000\u0000\u0000v\u02f9\u0001\u0000\u0000\u0000x\u02fd"+
		"\u0001\u0000\u0000\u0000z\u0304\u0001\u0000\u0000\u0000|\u030f\u0001\u0000"+
		"\u0000\u0000~\u0311\u0001\u0000\u0000\u0000\u0080\u0319\u0001\u0000\u0000"+
		"\u0000\u0082\u031b\u0001\u0000\u0000\u0000\u0084\u0322\u0001\u0000\u0000"+
		"\u0000\u0086\u0328\u0001\u0000\u0000\u0000\u0088\u0345\u0001\u0000\u0000"+
		"\u0000\u008a\u034d\u0001\u0000\u0000\u0000\u008c\u034f\u0001\u0000\u0000"+
		"\u0000\u008e\u0354\u0001\u0000\u0000\u0000\u0090\u0359\u0001\u0000\u0000"+
		"\u0000\u0092\u0363\u0001\u0000\u0000\u0000\u0094\u0367\u0001\u0000\u0000"+
		"\u0000\u0096\u0369\u0001\u0000\u0000\u0000\u0098\u0373\u0001\u0000\u0000"+
		"\u0000\u009a\u037a\u0001\u0000\u0000\u0000\u009c\u0381\u0001\u0000\u0000"+
		"\u0000\u009e\u0388\u0001\u0000\u0000\u0000\u00a0\u038a\u0001\u0000\u0000"+
		"\u0000\u00a2\u038c\u0001\u0000\u0000\u0000\u00a4\u0397\u0001\u0000\u0000"+
		"\u0000\u00a6\u03ba\u0001\u0000\u0000\u0000\u00a8\u03bc\u0001\u0000\u0000"+
		"\u0000\u00aa\u03c2\u0001\u0000\u0000\u0000\u00ac\u03c6\u0001\u0000\u0000"+
		"\u0000\u00ae\u03cd\u0001\u0000\u0000\u0000\u00b0\u03ff\u0001\u0000\u0000"+
		"\u0000\u00b2\u0401\u0001\u0000\u0000\u0000\u00b4\u0407\u0001\u0000\u0000"+
		"\u0000\u00b6\u040c\u0001\u0000\u0000\u0000\u00b8\u0411\u0001\u0000\u0000"+
		"\u0000\u00ba\u041d\u0001\u0000\u0000\u0000\u00bc\u0423\u0001\u0000\u0000"+
		"\u0000\u00be\u042c\u0001\u0000\u0000\u0000\u00c0\u0440\u0001\u0000\u0000"+
		"\u0000\u00c2\u0453\u0001\u0000\u0000\u0000\u00c4\u0455\u0001\u0000\u0000"+
		"\u0000\u00c6\u0464\u0001\u0000\u0000\u0000\u00c8\u046c\u0001\u0000\u0000"+
		"\u0000\u00ca\u0471\u0001\u0000\u0000\u0000\u00cc\u0476\u0001\u0000\u0000"+
		"\u0000\u00ce\u047b\u0001\u0000\u0000\u0000\u00d0\u0480\u0001\u0000\u0000"+
		"\u0000\u00d2\u0495\u0001\u0000\u0000\u0000\u00d4\u0497\u0001\u0000\u0000"+
		"\u0000\u00d6\u04a0\u0001\u0000\u0000\u0000\u00d8\u04a2\u0001\u0000\u0000"+
		"\u0000\u00da\u04ac\u0001\u0000\u0000\u0000\u00dc\u04be\u0001\u0000\u0000"+
		"\u0000\u00de\u04c0\u0001\u0000\u0000\u0000\u00e0\u04c6\u0001\u0000\u0000"+
		"\u0000\u00e2\u04c8\u0001\u0000\u0000\u0000\u00e4\u04ca\u0001\u0000\u0000"+
		"\u0000\u00e6\u04ce\u0001\u0000\u0000\u0000\u00e8\u04d0\u0001\u0000\u0000"+
		"\u0000\u00ea\u04d4\u0001\u0000\u0000\u0000\u00ec\u00ee\u0005_\u0000\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f2\u0001\u0000\u0000\u0000\u00ef\u00f1\u0003\u0002\u0001\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00fa\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f9\u0003\u0004\u0002\u0000\u00f6\u00f9\u0003\n\u0005\u0000\u00f7"+
		"\u00f9\u00034\u001a\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0000\u0000\u0001\u00fe\u0001"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005P\u0000\u0000\u0100\u0105\u0003"+
		"\u00eau\u0000\u0101\u0102\u0005j\u0000\u0000\u0102\u0104\u0003\u00eau"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005x\u0000\u0000\u0109\u0003\u0001\u0000\u0000\u0000"+
		"\u010a\u0110\u0003\u0006\u0003\u0000\u010b\u010f\u0003\u0004\u0002\u0000"+
		"\u010c\u010f\u0003\n\u0005\u0000\u010d\u010f\u00034\u001a\u0000\u010e"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0113\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0003\b\u0004\u0000\u0114\u0005\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005A\u0000\u0000\u0116\u011b\u0003\u00eau\u0000\u0117\u0118\u0005j"+
		"\u0000\u0000\u0118\u011a\u0003\u00eau\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0120\u00055\u0000\u0000"+
		"\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005x\u0000\u0000\u0122"+
		"\u0007\u0001\u0000\u0000\u0000\u0123\u0125\u0005\u001d\u0000\u0000\u0124"+
		"\u0126\u0005A\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0005x\u0000\u0000\u0128\t\u0001\u0000\u0000\u0000\u0129\u012d\u0003"+
		"\u000e\u0007\u0000\u012a\u012c\u00034\u001a\u0000\u012b\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0003\f\u0006"+
		"\u0000\u0131\u000b\u0001\u0000\u0000\u0000\u0132\u0134\u0005\u001d\u0000"+
		"\u0000\u0133\u0135\u0005L\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005x\u0000\u0000\u0137\r\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0005L\u0000\u0000\u0139\u013c\u0003\u0010\b\u0000\u013a\u013c"+
		"\u0003\u0014\n\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		"x\u0000\u0000\u013e\u000f\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0018"+
		"\u0000\u0000\u0140\u0141\u0005l\u0000\u0000\u0141\u0146\u0003\u0012\t"+
		"\u0000\u0142\u0143\u0005k\u0000\u0000\u0143\u0145\u0003\u0012\t\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0005m\u0000\u0000\u014a\u0011\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0005B\u0000\u0000\u014c\u014d\u0005l\u0000\u0000\u014d\u014e\u0005"+
		"\u0001\u0000\u0000\u014e\u0157\u0005m\u0000\u0000\u014f\u0153\u0005\u0005"+
		"\u0000\u0000\u0150\u0151\u0005l\u0000\u0000\u0151\u0152\u0005d\u0000\u0000"+
		"\u0152\u0154\u0005m\u0000\u0000\u0153\u0150\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155"+
		"\u0157\u0005=\u0000\u0000\u0156\u014b\u0001\u0000\u0000\u0000\u0156\u014f"+
		"\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u0013"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u00056\u0000\u0000\u0159\u015a\u0005"+
		"l\u0000\u0000\u015a\u015b\u0003\u0016\u000b\u0000\u015b\u015c\u0005m\u0000"+
		"\u0000\u015c\u0015\u0001\u0000\u0000\u0000\u015d\u0162\u0003\u0018\f\u0000"+
		"\u015e\u015f\u0005k\u0000\u0000\u015f\u0161\u0003\u0018\f\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0017\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165"+
		"\u016d\u0005\u0015\u0000\u0000\u0166\u016d\u0005.\u0000\u0000\u0167\u0168"+
		"\u0005B\u0000\u0000\u0168\u0169\u0005l\u0000\u0000\u0169\u016a\u0005\u0001"+
		"\u0000\u0000\u016a\u016d\u0005m\u0000\u0000\u016b\u016d\u0005=\u0000\u0000"+
		"\u016c\u0165\u0001\u0000\u0000\u0000\u016c\u0166\u0001\u0000\u0000\u0000"+
		"\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u0019\u0001\u0000\u0000\u0000\u016e\u0172\u0003\u001e\u000f\u0000"+
		"\u016f\u0171\u00034\u001a\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0178\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175\u0177\u00036\u001b\u0000\u0176\u0175"+
		"\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b"+
		"\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0003(\u0014\u0000\u017c\u001b\u0001\u0000\u0000\u0000\u017d\u0181\u0003"+
		" \u0010\u0000\u017e\u0180\u00034\u001a\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0187\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0186\u00036\u001b\u0000"+
		"\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0003*\u0015\u0000\u018b\u001d\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u00056\u0000\u0000\u018d\u018f\u0003\u00eau\u0000\u018e\u0190\u0003"+
		"\u00a2Q\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000"+
		"\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u0193\u0003$\u0012"+
		"\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0199\u0001\u0000\u0000\u0000\u0194\u0195\u0005L\u0000\u0000"+
		"\u0195\u0196\u0005l\u0000\u0000\u0196\u0197\u0003\u0016\u000b\u0000\u0197"+
		"\u0198\u0005m\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0194"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0005x\u0000\u0000\u019c\u001f\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0005#\u0000\u0000\u019e\u01a0\u0003\u00ea"+
		"u\u0000\u019f\u01a1\u0003\u00a2Q\u0000\u01a0\u019f\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a4\u0003,\u0016\u0000\u01a3\u01a5\u0003&\u0013\u0000\u01a4\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005x\u0000\u0000\u01a7!\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0005l\u0000\u0000\u01a9\u01aa\u0003\u00eau\u0000"+
		"\u01aa\u01ab\u0005m\u0000\u0000\u01ab#\u0001\u0000\u0000\u0000\u01ac\u01b3"+
		"\u0005-\u0000\u0000\u01ad\u01ae\u0005*\u0000\u0000\u01ae\u01b3\u0003\""+
		"\u0011\u0000\u01af\u01b3\u0005:\u0000\u0000\u01b0\u01b3\u0005)\u0000\u0000"+
		"\u01b1\u01b3\u0005\u0016\u0000\u0000\u01b2\u01ac\u0001\u0000\u0000\u0000"+
		"\u01b2\u01ad\u0001\u0000\u0000\u0000\u01b2\u01af\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b3%\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005*\u0000\u0000\u01b5\u01b9"+
		"\u0003\"\u0011\u0000\u01b6\u01b9\u0005:\u0000\u0000\u01b7\u01b9\u0005"+
		"\u0014\u0000\u0000\u01b8\u01b4\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\'\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bc\u0005\u001d\u0000\u0000\u01bb\u01bd\u00056\u0000"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0005x\u0000\u0000"+
		"\u01bf)\u0001\u0000\u0000\u0000\u01c0\u01c2\u0005\u001d\u0000\u0000\u01c1"+
		"\u01c3\u0005#\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005x\u0000\u0000\u01c5+\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005@"+
		"\u0000\u0000\u01c7\u01c8\u0005l\u0000\u0000\u01c8\u01c9\u0003\u0088D\u0000"+
		"\u01c9\u01ca\u0005m\u0000\u0000\u01ca-\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0005x\u0000\u0000\u01cc/\u0001\u0000\u0000\u0000\u01cd\u01d1\u0005\u0002"+
		"\u0000\u0000\u01ce\u01d0\u0007\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\u00a0"+
		"\u0000\u0000\u01d5\u01d6\u0005x\u0000\u0000\u01d61\u0001\u0000\u0000\u0000"+
		"\u01d7\u01dc\u0005`\u0000\u0000\u01d8\u01d9\u0005l\u0000\u0000\u01d9\u01da"+
		"\u0003\u00e6s\u0000\u01da\u01db\u0005m\u0000\u0000\u01db\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dc\u01d8\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dd3\u0001\u0000\u0000\u0000\u01de\u01e4\u0003r9\u0000"+
		"\u01df\u01e4\u0003\u00c2a\u0000\u01e0\u01e4\u0003\u001a\r\u0000\u01e1"+
		"\u01e4\u0003\u001c\u000e\u0000\u01e2\u01e4\u00038\u001c\u0000\u01e3\u01de"+
		"\u0001\u0000\u0000\u0000\u01e3\u01df\u0001\u0000\u0000\u0000\u01e3\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e45\u0001\u0000\u0000\u0000\u01e5\u01f2\u0003"+
		"2\u0019\u0000\u01e6\u01f2\u0003:\u001d\u0000\u01e7\u01f2\u0003j5\u0000"+
		"\u01e8\u01f2\u0003l6\u0000\u01e9\u01f2\u0003\u00a4R\u0000\u01ea\u01f2"+
		"\u0003\u00a6S\u0000\u01eb\u01f2\u0003\u00b0X\u0000\u01ec\u01f2\u0003\u00b8"+
		"\\\u0000\u01ed\u01f2\u0003n7\u0000\u01ee\u01f2\u0003p8\u0000\u01ef\u01f2"+
		"\u00030\u0018\u0000\u01f0\u01f2\u00038\u001c\u0000\u01f1\u01e5\u0001\u0000"+
		"\u0000\u0000\u01f1\u01e6\u0001\u0000\u0000\u0000\u01f1\u01e7\u0001\u0000"+
		"\u0000\u0000\u01f1\u01e8\u0001\u0000\u0000\u0000\u01f1\u01e9\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ea\u0001\u0000\u0000\u0000\u01f1\u01eb\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ec\u0001\u0000\u0000\u0000\u01f1\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f27\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0005x\u0000\u0000\u01f49\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0003<\u001e\u0000\u01f6\u01f7\u0007\u0001\u0000\u0000\u01f7\u01f8"+
		"\u0003^/\u0000\u01f8\u01f9\u0005x\u0000\u0000\u01f9;\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0006\u001e\uffff\uffff\u0000\u01fb\u01fd\u0003B!\u0000"+
		"\u01fc\u01fe\u0003@ \u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u0207\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\n\u0002\u0000\u0000\u0200\u0201\u0005h\u0000\u0000\u0201\u0203\u0003"+
		"B!\u0000\u0202\u0204\u0003@ \u0000\u0203\u0202\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0206\u0001\u0000\u0000\u0000"+
		"\u0205\u01ff\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000"+
		"\u0208=\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a"+
		"\u020c\u0005l\u0000\u0000\u020b\u020d\u0003J%\u0000\u020c\u020b\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0005m\u0000\u0000\u020f?\u0001\u0000\u0000"+
		"\u0000\u0210\u0212\u0003>\u001f\u0000\u0211\u0210\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214A\u0001\u0000\u0000\u0000\u0215"+
		"\u0217\u0003F#\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0003"+
		"\u00eau\u0000\u0219C\u0001\u0000\u0000\u0000\u021a\u021c\u0003\u00eau"+
		"\u0000\u021b\u021d\u0003>\u001f\u0000\u021c\u021b\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0005j\u0000\u0000\u021fE\u0001\u0000\u0000\u0000\u0220\u0222"+
		"\u0003D\"\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001"+
		"\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001"+
		"\u0000\u0000\u0000\u0224G\u0001\u0000\u0000\u0000\u0225\u0226\u0003^/"+
		"\u0000\u0226I\u0001\u0000\u0000\u0000\u0227\u022c\u0003H$\u0000\u0228"+
		"\u0229\u0005k\u0000\u0000\u0229\u022b\u0003H$\u0000\u022a\u0228\u0001"+
		"\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000\u022c\u022a\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022dK\u0001\u0000"+
		"\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0230\u0005l\u0000"+
		"\u0000\u0230\u0231\u0003^/\u0000\u0231\u0232\u0005m\u0000\u0000\u0232"+
		"\u024c\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u008e\u0000\u0000\u0234"+
		"\u0235\u0003^/\u0000\u0235\u0236\u0005m\u0000\u0000\u0236\u024c\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0005\u008f\u0000\u0000\u0238\u0239\u0003"+
		"^/\u0000\u0239\u023a\u0005m\u0000\u0000\u023a\u024c\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0005\u0092\u0000\u0000\u023c\u023d\u0003^/\u0000\u023d"+
		"\u023e\u0005m\u0000\u0000\u023e\u024c\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0005\u0090\u0000\u0000\u0240\u0241\u0003^/\u0000\u0241\u0242\u0005m"+
		"\u0000\u0000\u0242\u024c\u0001\u0000\u0000\u0000\u0243\u0244\u0005\u0091"+
		"\u0000\u0000\u0244\u0245\u0003^/\u0000\u0245\u0246\u0005m\u0000\u0000"+
		"\u0246\u024c\u0001\u0000\u0000\u0000\u0247\u0248\u0005\u0093\u0000\u0000"+
		"\u0248\u0249\u0003^/\u0000\u0249\u024a\u0005m\u0000\u0000\u024a\u024c"+
		"\u0001\u0000\u0000\u0000\u024b\u022f\u0001\u0000\u0000\u0000\u024b\u0233"+
		"\u0001\u0000\u0000\u0000\u024b\u0237\u0001\u0000\u0000\u0000\u024b\u023b"+
		"\u0001\u0000\u0000\u0000\u024b\u023f\u0001\u0000\u0000\u0000\u024b\u0243"+
		"\u0001\u0000\u0000\u0000\u024b\u0247\u0001\u0000\u0000\u0000\u024cM\u0001"+
		"\u0000\u0000\u0000\u024d\u0251\u0003\u00e0p\u0000\u024e\u0251\u0003\u00de"+
		"o\u0000\u024f\u0251\u0003<\u001e\u0000\u0250\u024d\u0001\u0000\u0000\u0000"+
		"\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u024f\u0001\u0000\u0000\u0000"+
		"\u0251O\u0001\u0000\u0000\u0000\u0252\u0253\u0003d2\u0000\u0253\u0254"+
		"\u0003^/\u0000\u0254Q\u0001\u0000\u0000\u0000\u0255\u0256\u0007\u0002"+
		"\u0000\u0000\u0256S\u0001\u0000\u0000\u0000\u0257\u0258\u0007\u0003\u0000"+
		"\u0000\u0258U\u0001\u0000\u0000\u0000\u0259\u025a\u0007\u0004\u0000\u0000"+
		"\u025aW\u0001\u0000\u0000\u0000\u025b\u025c\u0007\u0005\u0000\u0000\u025c"+
		"Y\u0001\u0000\u0000\u0000\u025d\u025e\u0007\u0006\u0000\u0000\u025e[\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0007\u0007\u0000\u0000\u0260]\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0006/\uffff\uffff\u0000\u0262\u026c\u0003N\'"+
		"\u0000\u0263\u026c\u0003L&\u0000\u0264\u026c\u0003P(\u0000\u0265\u0266"+
		"\u0003>\u001f\u0000\u0266\u0269\u0005i\u0000\u0000\u0267\u026a\u0003`"+
		"0\u0000\u0268\u026a\u0003b1\u0000\u0269\u0267\u0001\u0000\u0000\u0000"+
		"\u0269\u0268\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000"+
		"\u026b\u0261\u0001\u0000\u0000\u0000\u026b\u0263\u0001\u0000\u0000\u0000"+
		"\u026b\u0264\u0001\u0000\u0000\u0000\u026b\u0265\u0001\u0000\u0000\u0000"+
		"\u026c\u029d\u0001\u0000\u0000\u0000\u026d\u026e\n\r\u0000\u0000\u026e"+
		"\u026f\u0005y\u0000\u0000\u026f\u029c\u0003^/\r\u0270\u0271\n\f\u0000"+
		"\u0000\u0271\u0272\u0003V+\u0000\u0272\u0273\u0003^/\r\u0273\u029c\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\n\u000b\u0000\u0000\u0275\u0276\u0003T"+
		"*\u0000\u0276\u0277\u0003^/\f\u0277\u029c\u0001\u0000\u0000\u0000\u0278"+
		"\u0279\n\n\u0000\u0000\u0279\u027a\u0003R)\u0000\u027a\u027b\u0003^/\u000b"+
		"\u027b\u029c\u0001\u0000\u0000\u0000\u027c\u027d\n\t\u0000\u0000\u027d"+
		"\u027e\u0005\u0096\u0000\u0000\u027e\u029c\u0003^/\n\u027f\u0280\n\b\u0000"+
		"\u0000\u0280\u0281\u0003f3\u0000\u0281\u0282\u0003^/\t\u0282\u029c\u0001"+
		"\u0000\u0000\u0000\u0283\u0284\n\u0007\u0000\u0000\u0284\u0285\u0003X"+
		",\u0000\u0285\u0286\u0003^/\b\u0286\u029c\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\n\u0006\u0000\u0000\u0288\u0289\u0003Z-\u0000\u0289\u028a\u0003"+
		"^/\u0007\u028a\u029c\u0001\u0000\u0000\u0000\u028b\u028c\n\u0005\u0000"+
		"\u0000\u028c\u028d\u0003\\.\u0000\u028d\u028e\u0003^/\u0006\u028e\u029c"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\n\u0004\u0000\u0000\u0290\u0291\u0005"+
		"\u0094\u0000\u0000\u0291\u029c\u0003^/\u0005\u0292\u0293\n\u0003\u0000"+
		"\u0000\u0293\u0294\u0005\u0095\u0000\u0000\u0294\u029c\u0003^/\u0004\u0295"+
		"\u0296\n\u0002\u0000\u0000\u0296\u0299\u0005i\u0000\u0000\u0297\u029a"+
		"\u0003`0\u0000\u0298\u029a\u0003b1\u0000\u0299\u0297\u0001\u0000\u0000"+
		"\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u029a\u029c\u0001\u0000\u0000"+
		"\u0000\u029b\u026d\u0001\u0000\u0000\u0000\u029b\u0270\u0001\u0000\u0000"+
		"\u0000\u029b\u0274\u0001\u0000\u0000\u0000\u029b\u0278\u0001\u0000\u0000"+
		"\u0000\u029b\u027c\u0001\u0000\u0000\u0000\u029b\u027f\u0001\u0000\u0000"+
		"\u0000\u029b\u0283\u0001\u0000\u0000\u0000\u029b\u0287\u0001\u0000\u0000"+
		"\u0000\u029b\u028b\u0001\u0000\u0000\u0000\u029b\u028f\u0001\u0000\u0000"+
		"\u0000\u029b\u0292\u0001\u0000\u0000\u0000\u029b\u0295\u0001\u0000\u0000"+
		"\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e_\u0001\u0000\u0000\u0000"+
		"\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u02a3\u0005l\u0000\u0000\u02a1"+
		"\u02a4\u0003^/\u0000\u02a2\u02a4\u0003>\u001f\u0000\u02a3\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a4\u02ac\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a8\u0005k\u0000\u0000\u02a6\u02a9\u0003^/"+
		"\u0000\u02a7\u02a9\u0003>\u001f\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000"+
		"\u02aa\u02a5\u0001\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000"+
		"\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000"+
		"\u02af\u02b0\u0005z\u0000\u0000\u02b0\u02b1\u0003^/\u0000\u02b1\u02b2"+
		"\u0005m\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02a0\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02bb\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0005l\u0000\u0000\u02b8\u02b9\u0003^/"+
		"\u0000\u02b9\u02ba\u0005m\u0000\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b7\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000"+
		"\u02bca\u0001\u0000\u0000\u0000\u02bd\u02be\u0005l\u0000\u0000\u02be\u02bf"+
		"\u0003^/\u0000\u02bf\u02c0\u0005m\u0000\u0000\u02c0\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0005l\u0000\u0000\u02c2\u02c3\u0003^/\u0000"+
		"\u02c3\u02c4\u0005m\u0000\u0000\u02c4c\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0007\b\u0000\u0000\u02c6e\u0001\u0000\u0000\u0000\u02c7\u02c8\u0007"+
		"\t\u0000\u0000\u02c8g\u0001\u0000\u0000\u0000\u02c9\u02ca\u0007\n\u0000"+
		"\u0000\u02cai\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005\u0012\u0000\u0000"+
		"\u02cc\u02cd\u0003<\u001e\u0000\u02cd\u02ce\u0005x\u0000\u0000\u02cek"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005$\u0000\u0000\u02d0\u02d1\u0003"+
		"\u00eau\u0000\u02d1\u02d2\u0005l\u0000\u0000\u02d2\u02d3\u0003^/\u0000"+
		"\u02d3\u02d4\u0005m\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d6\u0005x\u0000\u0000\u02d6\u02dd\u0001\u0000\u0000\u0000\u02d7\u02d8"+
		"\u0005$\u0000\u0000\u02d8\u02d9\u0003<\u001e\u0000\u02d9\u02da\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0005x\u0000\u0000\u02db\u02dd\u0001\u0000\u0000"+
		"\u0000\u02dc\u02cf\u0001\u0000\u0000\u0000\u02dc\u02d7\u0001\u0000\u0000"+
		"\u0000\u02ddm\u0001\u0000\u0000\u0000\u02de\u02e0\u0005\u001e\u0000\u0000"+
		"\u02df\u02e1\u0003\u00eau\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e1o\u0001\u0000\u0000\u0000\u02e2\u02e4"+
		"\u0005<\u0000\u0000\u02e3\u02e5\u0003\u00eau\u0000\u02e4\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5q\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e7\u0007\u000b\u0000\u0000\u02e7\u02e9\u0003\u00eau\u0000"+
		"\u02e8\u02ea\u0003z=\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec"+
		"\u0003t:\u0000\u02ec\u02ed\u0005x\u0000\u0000\u02ed\u02f3\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0007\u000b\u0000\u0000\u02ef\u02f0\u0003v;\u0000"+
		"\u02f0\u02f1\u0005x\u0000\u0000\u02f1\u02f3\u0001\u0000\u0000\u0000\u02f2"+
		"\u02e6\u0001\u0000\u0000\u0000\u02f2\u02ee\u0001\u0000\u0000\u0000\u02f3"+
		"s\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005\t\u0000\u0000\u02f5\u02f7"+
		"\u0003\u00eau\u0000\u02f6\u02f8\u0003\u0086C\u0000\u02f7\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8u\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fa\u0003\u00eau\u0000\u02fa\u02fb\u0003x<\u0000\u02fb"+
		"w\u0001\u0000\u0000\u0000\u02fc\u02fe\u0003z=\u0000\u02fd\u02fc\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u0300\u0001"+
		"\u0000\u0000\u0000\u02ff\u0301\u0003\u0084B\u0000\u0300\u02ff\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000"+
		"\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303y\u0001\u0000\u0000"+
		"\u0000\u0304\u0305\u0005l\u0000\u0000\u0305\u0306\u0003~?\u0000\u0306"+
		"\u0307\u0005m\u0000\u0000\u0307{\u0001\u0000\u0000\u0000\u0308\u0309\u0003"+
		"\u0080@\u0000\u0309\u030a\u0005z\u0000\u0000\u030a\u030c\u0001\u0000\u0000"+
		"\u0000\u030b\u0308\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u0310\u0003\u0082A\u0000"+
		"\u030e\u0310\u0005t\u0000\u0000\u030f\u030b\u0001\u0000\u0000\u0000\u030f"+
		"\u030e\u0001\u0000\u0000\u0000\u0310}\u0001\u0000\u0000\u0000\u0311\u0316"+
		"\u0003|>\u0000\u0312\u0313\u0005k\u0000\u0000\u0313\u0315\u0003|>\u0000"+
		"\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000\u0000\u0000"+
		"\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u007f\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000"+
		"\u0319\u031a\u0003^/\u0000\u031a\u0081\u0001\u0000\u0000\u0000\u031b\u031c"+
		"\u0003^/\u0000\u031c\u0083\u0001\u0000\u0000\u0000\u031d\u0323\u0003\u0088"+
		"D\u0000\u031e\u0323\u0005\u000f\u0000\u0000\u031f\u0323\u0005S\u0000\u0000"+
		"\u0320\u0323\u0003\u0086C\u0000\u0321\u0323\u0003\u008aE\u0000\u0322\u031d"+
		"\u0001\u0000\u0000\u0000\u0322\u031e\u0001\u0000\u0000\u0000\u0322\u031f"+
		"\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0321"+
		"\u0001\u0000\u0000\u0000\u0323\u0085\u0001\u0000\u0000\u0000\u0324\u0329"+
		"\u0005E\u0000\u0000\u0325\u0329\u0005F\u0000\u0000\u0326\u0329\u0003\u009a"+
		"M\u0000\u0327\u0329\u0003\u009cN\u0000\u0328\u0324\u0001\u0000\u0000\u0000"+
		"\u0328\u0325\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000"+
		"\u0328\u0327\u0001\u0000\u0000\u0000\u0329\u0087\u0001\u0000\u0000\u0000"+
		"\u032a\u032c\u0005\u000b\u0000\u0000\u032b\u032d\u0003\u0090H\u0000\u032c"+
		"\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d"+
		"\u0346\u0001\u0000\u0000\u0000\u032e\u0330\u0005\u0017\u0000\u0000\u032f"+
		"\u0331\u0003\u0090H\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0001\u0000\u0000\u0000\u0331\u0346\u0001\u0000\u0000\u0000\u0332\u0346"+
		"\u00054\u0000\u0000\u0333\u0334\u0005\f\u0000\u0000\u0334\u0346\u0003"+
		"\u0098L\u0000\u0335\u0346\u0005\u0013\u0000\u0000\u0336\u0337\u0005G\u0000"+
		"\u0000\u0337\u033a\u0003\u0096K\u0000\u0338\u033b\u0003\u008cF\u0000\u0339"+
		"\u033b\u0003\u008eG\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u0339"+
		"\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u0346"+
		"\u0001\u0000\u0000\u0000\u033c\u0346\u0005\u001f\u0000\u0000\u033d\u0346"+
		"\u0005!\u0000\u0000\u033e\u0346\u0005\"\u0000\u0000\u033f\u0346\u0005"+
		"0\u0000\u0000\u0340\u0346\u0005T\u0000\u0000\u0341\u0346\u0005\u0016\u0000"+
		"\u0000\u0342\u0346\u0005\u0014\u0000\u0000\u0343\u0346\u0005\u000f\u0000"+
		"\u0000\u0344\u0346\u0005*\u0000\u0000\u0345\u032a\u0001\u0000\u0000\u0000"+
		"\u0345\u032e\u0001\u0000\u0000\u0000\u0345\u0332\u0001\u0000\u0000\u0000"+
		"\u0345\u0333\u0001\u0000\u0000\u0000\u0345\u0335\u0001\u0000\u0000\u0000"+
		"\u0345\u0336\u0001\u0000\u0000\u0000\u0345\u033c\u0001\u0000\u0000\u0000"+
		"\u0345\u033d\u0001\u0000\u0000\u0000\u0345\u033e\u0001\u0000\u0000\u0000"+
		"\u0345\u033f\u0001\u0000\u0000\u0000\u0345\u0340\u0001\u0000\u0000\u0000"+
		"\u0345\u0341\u0001\u0000\u0000\u0000\u0345\u0342\u0001\u0000\u0000\u0000"+
		"\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0344\u0001\u0000\u0000\u0000"+
		"\u0346\u0089\u0001\u0000\u0000\u0000\u0347\u034e\u0005=\u0000\u0000\u0348"+
		"\u0349\u0005B\u0000\u0000\u0349\u034a\u0005l\u0000\u0000\u034a\u034b\u0005"+
		"\u0001\u0000\u0000\u034b\u034e\u0005m\u0000\u0000\u034c\u034e\u0005-\u0000"+
		"\u0000\u034d\u0347\u0001\u0000\u0000\u0000\u034d\u0348\u0001\u0000\u0000"+
		"\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034e\u008b\u0001\u0000\u0000"+
		"\u0000\u034f\u0350\u0005R\u0000\u0000\u0350\u0351\u0005l\u0000\u0000\u0351"+
		"\u0352\u0003\u00e6s\u0000\u0352\u0353\u0005m\u0000\u0000\u0353\u008d\u0001"+
		"\u0000\u0000\u0000\u0354\u0355\u00058\u0000\u0000\u0355\u0356\u0005l\u0000"+
		"\u0000\u0356\u0357\u0003\u00e6s\u0000\u0357\u0358\u0005m\u0000\u0000\u0358"+
		"\u008f\u0001\u0000\u0000\u0000\u0359\u035a\u0005l\u0000\u0000\u035a\u035d"+
		"\u0003\u0092I\u0000\u035b\u035c\u0005k\u0000\u0000\u035c\u035e\u0003\u0094"+
		"J\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0005m\u0000\u0000"+
		"\u0360\u0091\u0001\u0000\u0000\u0000\u0361\u0364\u0005d\u0000\u0000\u0362"+
		"\u0364\u0003\u00eau\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0362"+
		"\u0001\u0000\u0000\u0000\u0364\u0093\u0001\u0000\u0000\u0000\u0365\u0368"+
		"\u0005d\u0000\u0000\u0366\u0368\u0003\u00eau\u0000\u0367\u0365\u0001\u0000"+
		"\u0000\u0000\u0367\u0366\u0001\u0000\u0000\u0000\u0368\u0095\u0001\u0000"+
		"\u0000\u0000\u0369\u036f\u0005l\u0000\u0000\u036a\u0370\u0005t\u0000\u0000"+
		"\u036b\u036e\u0005d\u0000\u0000\u036c\u036e\u0003\u00eau\u0000\u036d\u036b"+
		"\u0001\u0000\u0000\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u0370"+
		"\u0001\u0000\u0000\u0000\u036f\u036a\u0001\u0000\u0000\u0000\u036f\u036d"+
		"\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0005m\u0000\u0000\u0372\u0097\u0001\u0000\u0000\u0000\u0373\u0376\u0005"+
		"l\u0000\u0000\u0374\u0377\u0005d\u0000\u0000\u0375\u0377\u0003\u00eau"+
		"\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0376\u0375\u0001\u0000\u0000"+
		"\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0005m\u0000\u0000"+
		"\u0379\u0099\u0001\u0000\u0000\u0000\u037a\u037f\u0005\n\u0000\u0000\u037b"+
		"\u037c\u0005l\u0000\u0000\u037c\u037d\u0003<\u001e\u0000\u037d\u037e\u0005"+
		"m\u0000\u0000\u037e\u0380\u0001\u0000\u0000\u0000\u037f\u037b\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u009b\u0001\u0000"+
		"\u0000\u0000\u0381\u0386\u0005\u001a\u0000\u0000\u0382\u0383\u0005l\u0000"+
		"\u0000\u0383\u0384\u0003<\u001e\u0000\u0384\u0385\u0005m\u0000\u0000\u0385"+
		"\u0387\u0001\u0000\u0000\u0000\u0386\u0382\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0001\u0000\u0000\u0000\u0387\u009d\u0001\u0000\u0000\u0000\u0388"+
		"\u0389\u0007\f\u0000\u0000\u0389\u009f\u0001\u0000\u0000\u0000\u038a\u038b"+
		"\u0005)\u0000\u0000\u038b\u00a1\u0001\u0000\u0000\u0000\u038c\u038d\u0005"+
		"l\u0000\u0000\u038d\u0392\u0003\u00eau\u0000\u038e\u038f\u0005k\u0000"+
		"\u0000\u038f\u0391\u0003\u00eau\u0000\u0390\u038e\u0001\u0000\u0000\u0000"+
		"\u0391\u0394\u0001\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000"+
		"\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0395\u0001\u0000\u0000\u0000"+
		"\u0394\u0392\u0001\u0000\u0000\u0000\u0395\u0396\u0005m\u0000\u0000\u0396"+
		"\u00a3\u0001\u0000\u0000\u0000\u0397\u039c\u0005>\u0000\u0000\u0398\u0399"+
		"\u0005l\u0000\u0000\u0399\u039a\u0003^/\u0000\u039a\u039b\u0005m\u0000"+
		"\u0000\u039b\u039d\u0001\u0000\u0000\u0000\u039c\u0398\u0001\u0000\u0000"+
		"\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000"+
		"\u0000\u039e\u039f\u0005x\u0000\u0000\u039f\u00a5\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a4\u0003\u00aaU\u0000\u03a1\u03a3\u00036\u001b\u0000\u03a2\u03a1"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a6\u0001\u0000\u0000\u0000\u03a4\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a7\u03a9"+
		"\u0003\u00acV\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0003"+
		"\u00a8T\u0000\u03ab\u03bb\u0001\u0000\u0000\u0000\u03ac\u03b0\u0003\u00aa"+
		"U\u0000\u03ad\u03af\u00036\u001b\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000"+
		"\u03af\u03b2\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b5\u0003\u00aeW\u0000\u03b4"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0003\u00a8T\u0000\u03b9\u03bb"+
		"\u0001\u0000\u0000\u0000\u03ba\u03a0\u0001\u0000\u0000\u0000\u03ba\u03ac"+
		"\u0001\u0000\u0000\u0000\u03bb\u00a7\u0001\u0000\u0000\u0000\u03bc\u03be"+
		"\u0005\u001d\u0000\u0000\u03bd\u03bf\u0005%\u0000\u0000\u03be\u03bd\u0001"+
		"\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c0\u03c1\u0005x\u0000\u0000\u03c1\u00a9\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c3\u0005%\u0000\u0000\u03c3\u03c4\u0003^/\u0000"+
		"\u03c4\u03c5\u0005J\u0000\u0000\u03c5\u00ab\u0001\u0000\u0000\u0000\u03c6"+
		"\u03ca\u0005\u001c\u0000\u0000\u03c7\u03c9\u00036\u001b\u0000\u03c8\u03c7"+
		"\u0001\u0000\u0000\u0000\u03c9\u03cc\u0001\u0000\u0000\u0000\u03ca\u03c8"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb\u00ad"+
		"\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cd\u03ce"+
		"\u0005\u001b\u0000\u0000\u03ce\u03cf\u0003^/\u0000\u03cf\u03d3\u0005J"+
		"\u0000\u0000\u03d0\u03d2\u00036\u001b\u0000\u03d1\u03d0\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d5\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d6\u03d8\u0003\u00acV\u0000"+
		"\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000"+
		"\u03d8\u00af\u0001\u0000\u0000\u0000\u03d9\u03da\u0005,\u0000\u0000\u03da"+
		"\u03de\u0005x\u0000\u0000\u03db\u03dd\u00036\u001b\u0000\u03dc\u03db\u0001"+
		"\u0000\u0000\u0000\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001"+
		"\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e1\u0001"+
		"\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u0400\u0003"+
		"\u00b2Y\u0000\u03e2\u03fd\u0005,\u0000\u0000\u03e3\u03e5\u0003\u00b4Z"+
		"\u0000\u03e4\u03e6\u0003\u00b6[\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e7\u03eb\u0005x\u0000\u0000\u03e8\u03ea\u00036\u001b\u0000\u03e9\u03e8"+
		"\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001\u0000\u0000\u0000\u03eb\u03e9"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ee"+
		"\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0003\u00b2Y\u0000\u03ef\u03fe\u0001\u0000\u0000\u0000\u03f0\u03f2\u0003"+
		"\u00b6[\u0000\u03f1\u03f3\u0003\u00b4Z\u0000\u03f2\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f8\u0005x\u0000\u0000\u03f5\u03f7\u00036\u001b\u0000\u03f6"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f7\u03fa\u0001\u0000\u0000\u0000\u03f8"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9"+
		"\u03fb\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fb"+
		"\u03fc\u0003\u00b2Y\u0000\u03fc\u03fe\u0001\u0000\u0000\u0000\u03fd\u03e3"+
		"\u0001\u0000\u0000\u0000\u03fd\u03f0\u0001\u0000\u0000\u0000\u03fe\u0400"+
		"\u0001\u0000\u0000\u0000\u03ff\u03d9\u0001\u0000\u0000\u0000\u03ff\u03e2"+
		"\u0001\u0000\u0000\u0000\u0400\u00b1\u0001\u0000\u0000\u0000\u0401\u0403"+
		"\u0005\u001d\u0000\u0000\u0402\u0404\u0005,\u0000\u0000\u0403\u0402\u0001"+
		"\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0405\u0001"+
		"\u0000\u0000\u0000\u0405\u0406\u0005x\u0000\u0000\u0406\u00b3\u0001\u0000"+
		"\u0000\u0000\u0407\u0408\u0005V\u0000\u0000\u0408\u0409\u0005l\u0000\u0000"+
		"\u0409\u040a\u0003^/\u0000\u040a\u040b\u0005m\u0000\u0000\u040b\u00b5"+
		"\u0001\u0000\u0000\u0000\u040c\u040d\u0005O\u0000\u0000\u040d\u040e\u0005"+
		"l\u0000\u0000\u040e\u040f\u0003^/\u0000\u040f\u0410\u0005m\u0000\u0000"+
		"\u0410\u00b7\u0001\u0000\u0000\u0000\u0411\u0415\u0003\u00bc^\u0000\u0412"+
		"\u0414\u0003\u00be_\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0414\u0417"+
		"\u0001\u0000\u0000\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0415\u0416"+
		"\u0001\u0000\u0000\u0000\u0416\u0419\u0001\u0000\u0000\u0000\u0417\u0415"+
		"\u0001\u0000\u0000\u0000\u0418\u041a\u0003\u00c0`\u0000\u0419\u0418\u0001"+
		"\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u041b\u0001"+
		"\u0000\u0000\u0000\u041b\u041c\u0003\u00ba]\u0000\u041c\u00b9\u0001\u0000"+
		"\u0000\u0000\u041d\u041f\u0005\u001d\u0000\u0000\u041e\u0420\u0005C\u0000"+
		"\u0000\u041f\u041e\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000"+
		"\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421\u0422\u0005x\u0000\u0000"+
		"\u0422\u00bb\u0001\u0000\u0000\u0000\u0423\u0428\u0005C\u0000\u0000\u0424"+
		"\u0425\u0005l\u0000\u0000\u0425\u0426\u0003^/\u0000\u0426\u0427\u0005"+
		"m\u0000\u0000\u0427\u0429\u0001\u0000\u0000\u0000\u0428\u0424\u0001\u0000"+
		"\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042a\u0001\u0000"+
		"\u0000\u0000\u042a\u042b\u0005x\u0000\u0000\u042b\u00bd\u0001\u0000\u0000"+
		"\u0000\u042c\u042e\u0005U\u0000\u0000\u042d\u042f\u0007\r\u0000\u0000"+
		"\u042e\u042d\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000"+
		"\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u0431\u0005l\u0000\u0000\u0431"+
		"\u0436\u0003^/\u0000\u0432\u0433\u0005k\u0000\u0000\u0433\u0435\u0003"+
		"^/\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0435\u0438\u0001\u0000\u0000"+
		"\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000"+
		"\u0000\u0437\u0439\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000"+
		"\u0000\u0439\u043d\u0005m\u0000\u0000\u043a\u043c\u00036\u001b\u0000\u043b"+
		"\u043a\u0001\u0000\u0000\u0000\u043c\u043f\u0001\u0000\u0000\u0000\u043d"+
		"\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e"+
		"\u00bf\u0001\u0000\u0000\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u0440"+
		"\u0444\u0005\u001c\u0000\u0000\u0441\u0443\u00036\u001b\u0000\u0442\u0441"+
		"\u0001\u0000\u0000\u0000\u0443\u0446\u0001\u0000\u0000\u0000\u0444\u0442"+
		"\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u00c1"+
		"\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000\u0000\u0000\u0447\u0448"+
		"\u0005\u0019\u0000\u0000\u0448\u0449\u0003\u00eau\u0000\u0449\u044a\u0003"+
		"\u00c4b\u0000\u044a\u0454\u0001\u0000\u0000\u0000\u044b\u044c\u0005\u0019"+
		"\u0000\u0000\u044c\u044d\u0003\u00eau\u0000\u044d\u044e\u0003\u00d4j\u0000"+
		"\u044e\u0454\u0001\u0000\u0000\u0000\u044f\u0450\u0005\u0019\u0000\u0000"+
		"\u0450\u0451\u0003\u00eau\u0000\u0451\u0452\u0003\u00c6c\u0000\u0452\u0454"+
		"\u0001\u0000\u0000\u0000\u0453\u0447\u0001\u0000\u0000\u0000\u0453\u044b"+
		"\u0001\u0000\u0000\u0000\u0453\u044f\u0001\u0000\u0000\u0000\u0454\u00c3"+
		"\u0001\u0000\u0000\u0000\u0455\u045a\u0005 \u0000\u0000\u0456\u045b\u0003"+
		"\u00c8d\u0000\u0457\u045b\u0003\u00cae\u0000\u0458\u045b\u0003\u00ccf"+
		"\u0000\u0459\u045b\u0003\u00ceg\u0000\u045a\u0456\u0001\u0000\u0000\u0000"+
		"\u045a\u0457\u0001\u0000\u0000\u0000\u045a\u0458\u0001\u0000\u0000\u0000"+
		"\u045a\u0459\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045d\u0005x\u0000\u0000\u045d"+
		"\u045e\u0003\u00d0h\u0000\u045e\u0460\u0005\u001d\u0000\u0000\u045f\u0461"+
		"\u0005 \u0000\u0000\u0460\u045f\u0001\u0000\u0000\u0000\u0460\u0461\u0001"+
		"\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0005"+
		"x\u0000\u0000\u0463\u00c5\u0001\u0000\u0000\u0000\u0464\u0466\u0005\u0004"+
		"\u0000\u0000\u0465\u0467\u0003\u0084B\u0000\u0466\u0465\u0001\u0000\u0000"+
		"\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000"+
		"\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000"+
		"\u0000\u046a\u046b\u0005x\u0000\u0000\u046b\u00c7\u0001\u0000\u0000\u0000"+
		"\u046c\u046d\u0005\u000b\u0000\u0000\u046d\u046e\u0005l\u0000\u0000\u046e"+
		"\u046f\u0003\u00e6s\u0000\u046f\u0470\u0005m\u0000\u0000\u0470\u00c9\u0001"+
		"\u0000\u0000\u0000\u0471\u0472\u0005\u0017\u0000\u0000\u0472\u0473\u0005"+
		"l\u0000\u0000\u0473\u0474\u0003\u00e6s\u0000\u0474\u0475\u0005m\u0000"+
		"\u0000\u0475\u00cb\u0001\u0000\u0000\u0000\u0476\u0477\u0005G\u0000\u0000"+
		"\u0477\u0478\u0005l\u0000\u0000\u0478\u0479\u0003\u00e6s\u0000\u0479\u047a"+
		"\u0005m\u0000\u0000\u047a\u00cd\u0001\u0000\u0000\u0000\u047b\u047c\u0005"+
		"\f\u0000\u0000\u047c\u047d\u0005l\u0000\u0000\u047d\u047e\u0003\u00e6"+
		"s\u0000\u047e\u047f\u0005m\u0000\u0000\u047f\u00cf\u0001\u0000\u0000\u0000"+
		"\u0480\u0483\u0003\u00eau\u0000\u0481\u0482\u0005r\u0000\u0000\u0482\u0484"+
		"\u0003\u00d2i\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0483\u0484\u0001"+
		"\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u048f\u0005"+
		"x\u0000\u0000\u0486\u0489\u0003\u00eau\u0000\u0487\u0488\u0005r\u0000"+
		"\u0000\u0488\u048a\u0003\u00d2i\u0000\u0489\u0487\u0001\u0000\u0000\u0000"+
		"\u0489\u048a\u0001\u0000\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000"+
		"\u048b\u048c\u0005x\u0000\u0000\u048c\u048e\u0001\u0000\u0000\u0000\u048d"+
		"\u0486\u0001\u0000\u0000\u0000\u048e\u0491\u0001\u0000\u0000\u0000\u048f"+
		"\u048d\u0001\u0000\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000\u0490"+
		"\u00d1\u0001\u0000\u0000\u0000\u0491\u048f\u0001\u0000\u0000\u0000\u0492"+
		"\u0496\u0003\u00e6s\u0000\u0493\u0496\u0003\u00deo\u0000\u0494\u0496\u0003"+
		"\u00e8t\u0000\u0495\u0492\u0001\u0000\u0000\u0000\u0495\u0493\u0001\u0000"+
		"\u0000\u0000\u0495\u0494\u0001\u0000\u0000\u0000\u0496\u00d3\u0001\u0000"+
		"\u0000\u0000\u0497\u0498\u0005H\u0000\u0000\u0498\u0499\u0005x\u0000\u0000"+
		"\u0499\u049a\u0003\u00d6k\u0000\u049a\u049c\u0005\u001d\u0000\u0000\u049b"+
		"\u049d\u0005H\u0000\u0000\u049c\u049b\u0001\u0000\u0000\u0000\u049c\u049d"+
		"\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000\u0000\u0000\u049e\u049f"+
		"\u0005x\u0000\u0000\u049f\u00d5\u0001\u0000\u0000\u0000\u04a0\u04a1\u0003"+
		"\u00d8l\u0000\u04a1\u00d7\u0001\u0000\u0000\u0000\u04a2\u04a3\u0003\u00dc"+
		"n\u0000\u04a3\u04a9\u0005x\u0000\u0000\u04a4\u04a5\u0003\u00dcn\u0000"+
		"\u04a5\u04a6\u0005x\u0000\u0000\u04a6\u04a8\u0001\u0000\u0000\u0000\u04a7"+
		"\u04a4\u0001\u0000\u0000\u0000\u04a8\u04ab\u0001\u0000\u0000\u0000\u04a9"+
		"\u04a7\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa"+
		"\u00d9\u0001\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ac"+
		"\u04ae\u0003\u00eau\u0000\u04ad\u04af\u0003z=\u0000\u04ae\u04ad\u0001"+
		"\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b0\u0001"+
		"\u0000\u0000\u0000\u04b0\u04b1\u0005H\u0000\u0000\u04b1\u04b2\u0005x\u0000"+
		"\u0000\u04b2\u04b3\u0003\u00d6k\u0000\u04b3\u04b4\u0005\u001d\u0000\u0000"+
		"\u04b4\u00db\u0001\u0000\u0000\u0000\u04b5\u04bf\u0003\u00dam\u0000\u04b6"+
		"\u04b8\u0003\u00eau\u0000\u04b7\u04b9\u0003z=\u0000\u04b8\u04b7\u0001"+
		"\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001"+
		"\u0000\u0000\u0000\u04ba\u04bb\u0005\t\u0000\u0000\u04bb\u04bc\u0003\u00ea"+
		"u\u0000\u04bc\u04bf\u0001\u0000\u0000\u0000\u04bd\u04bf\u0003v;\u0000"+
		"\u04be\u04b5\u0001\u0000\u0000\u0000\u04be\u04b6\u0001\u0000\u0000\u0000"+
		"\u04be\u04bd\u0001\u0000\u0000\u0000\u04bf\u00dd\u0001\u0000\u0000\u0000"+
		"\u04c0\u04c1\u0007\u000e\u0000\u0000\u04c1\u00df\u0001\u0000\u0000\u0000"+
		"\u04c2\u04c7\u0003\u00e8t\u0000\u04c3\u04c7\u0003\u00e4r\u0000\u04c4\u04c7"+
		"\u0003\u00e2q\u0000\u04c5\u04c7\u0003\u00e6s\u0000\u04c6\u04c2\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c3\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c5\u0001\u0000\u0000\u0000\u04c7\u00e1\u0001\u0000"+
		"\u0000\u0000\u04c8\u04c9\u0005c\u0000\u0000\u04c9\u00e3\u0001\u0000\u0000"+
		"\u0000\u04ca\u04cb\u0005b\u0000\u0000\u04cb\u00e5\u0001\u0000\u0000\u0000"+
		"\u04cc\u04cf\u0005d\u0000\u0000\u04cd\u04cf\u0005e\u0000\u0000\u04ce\u04cc"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cd\u0001\u0000\u0000\u0000\u04cf\u00e7"+
		"\u0001\u0000\u0000\u0000\u04d0\u04d1\u0005a\u0000\u0000\u04d1\u00e9\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d5\u0007\u000f\u0000\u0000\u04d3\u04d5\u0005"+
		"f\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d4\u04d3\u0001\u0000"+
		"\u0000\u0000\u04d5\u00eb\u0001\u0000\u0000\u0000}\u00ed\u00f2\u00f8\u00fa"+
		"\u0105\u010e\u0110\u011b\u011f\u0125\u012d\u0134\u013b\u0146\u0153\u0156"+
		"\u0162\u016c\u0172\u0178\u0181\u0187\u018f\u0192\u0199\u01a0\u01a4\u01b2"+
		"\u01b8\u01bc\u01c2\u01d1\u01dc\u01e3\u01f1\u01fd\u0203\u0207\u020c\u0213"+
		"\u0216\u021c\u0223\u022c\u024b\u0250\u0269\u026b\u0299\u029b\u029d\u02a3"+
		"\u02a8\u02ac\u02b5\u02bb\u02dc\u02e0\u02e4\u02e9\u02f2\u02f7\u02fd\u0302"+
		"\u030b\u030f\u0316\u0322\u0328\u032c\u0330\u033a\u0345\u034d\u035d\u0363"+
		"\u0367\u036d\u036f\u0376\u037f\u0386\u0392\u039c\u03a4\u03a8\u03b0\u03b6"+
		"\u03ba\u03be\u03ca\u03d3\u03d7\u03de\u03e5\u03eb\u03f2\u03f8\u03fd\u03ff"+
		"\u0403\u0415\u0419\u041f\u0428\u042e\u0436\u043d\u0444\u0453\u045a\u0460"+
		"\u0468\u0483\u0489\u048f\u0495\u049c\u04a9\u04ae\u04b8\u04be\u04c6\u04ce"+
		"\u04d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}