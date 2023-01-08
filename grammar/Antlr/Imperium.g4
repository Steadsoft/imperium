/* This is the grammar for the Imperium programming language */

/*---------------------------------------------------------------------------*/
/* Keyword translation info kindly contributed by:                           */
/* English (en) - Hugh Gleaves                                               */
/* Dutch (nl)   - Gabor de Mooij (https://github.com/gabordemooij/citrine)   */
/*---------------------------------------------------------------------------*/

grammar Imperium; // Latin for "control"

/*
 @lexer::header
 {
 import java.util.Map;
 }
 */

@lexer::members {
    public String KeywordLanguageCode = "de";

    /* private Map<String, Integer> words; */
}

translation_unit:
	BYTE_ORDER_MARK? preprocessor_stmt? procedure_stmt;

procedure_stmt:
	PROCEDURE identifier entry_information stmt_block end_stmt;

stmt_block
    : (nonexecutable_stmt terminator)* (executable_stmt terminator)*
	| terminator;

terminator: SEMICOLON;

label_stmt: LBRACE identifier RBRACE;

nonexecutable_stmt:
	preprocessor_stmt	# PRE
	| declare_stmt		# DCL
	| define_stmt		# DEF;
 
executable_stmt:
	  label_stmt? assign_stmt	# ASSIGN
	| label_stmt? call_stmt		# CALL
	| label_stmt? goto_stmt		# GOTO
	| procedure_stmt			# PROC
	| label_stmt? return_stmt	# RET
	| label_stmt? if_stmt		# IF
	| label_stmt? loop_stmt		# LOOP
	| label_stmt? endloop_stmt  # LEAVE
	| label_stmt? reloop_stmt   # AGAIN 
	;


preprocessor_stmt: '%' 'include' QUOTE identifier '.inc' QUOTE;

assign_stmt: reference EQUALS expression; //SEMICOLON

reference:
	reference ARROW basic_reference arguments_list?	# PTR_REF
	| basic_reference arguments_list?				# BASIC_REF;

arguments: LPAR subscript_commalist+ RPAR;

arguments_list: arguments+;

basic_reference: structure_qualification_list? identifier;

structure_qualification: identifier arguments? DOT;

structure_qualification_list: structure_qualification+;

subscript: expression;

subscript_commalist: subscript (COMMA subscript)*;

expression: expression_9 | expression '?|' expression_9;

expression_9: expression_8 | expression_9 '?&' expression_8;

expression_8:
	expression_7
	| expression_8 ('|' | '~') expression_7;

expression_7: expression_6 | expression_7 '&' expression_6;

expression_6:
	expression_5
	| expression_6 comparison_operator expression_5;

expression_5: expression_4 | expression_5 '||' expression_4;

expression_4:
	expression_3
	| expression_4 (PLUS | MINUS) expression_3;

expression_3:
	expression_2
	| expression_3 (TIMES | DIVIDE) expression_2;

expression_2:
	primitive_expression
	| prefix_expression
	| parenthesized_expression
	| expression_1;

expression_1: (primitive_expression | parenthesized_expression) POWER expression_2;

prefix_expression: prefix_operator expression_2;

parenthesized_expression: '(' expression ')';

primitive_expression: numeric_literal | reference;

prefix_operator: '+' | '-' | '~';

comparison_operator:
	'>'
	| '>='
	| '='
	| '<'
	| '<='
	| '~>'
	| '~='
	| '~<';

shift_operator: '>>' | '<<' | '>>>' | '<<<';

identifier:
	keyword			# KEYWD
	| IDENTIFIER	# identifier_IDENTIFIER;

/***********************************/
/* Add new keywords here as needed */
/***********************************/

keyword:
	CALL
	| GOTO
	| PROCEDURE
	| END
	| DECLARE
	| DEFINE
	| RETURN
	| IF
	| THEN
	| ELSE
	| ELIF
	| TO
	| RETURNS
	| ARGUMENT
	| POINTER
	| BIT
	| CHARACTER
	| ENTRY
	| FIXED
	| FLOAT
	| OFFSET
	| STRING
	| VARYING
	| COFUNCTION
	| COROUTINE
	| LOOP
	| WHILE
	| UNTIL
	| BUILTIN
	| INTRINSIC
	| ENDLOOP
	| RELOOP ;

call_stmt: CALL reference;

goto_stmt: GOTO reference;

end_stmt: END;

endloop_stmt: ENDLOOP IDENTIFIER? ;

reloop_stmt: RELOOP IDENTIFIER? ;

declare_stmt: (DECLARE | ARGUMENT) identifier type_info;

type_info: dimension_suffix? attribute*;

dimension_suffix: LPAR bound_pair_commalist RPAR;

bound_pair: (lower_bound COLON)? upper_bound | TIMES;

bound_pair_commalist: bound_pair (COMMA bound_pair)*;

// See page 208 Subset G standard. Lower bound must be <= upper (but this is not a grammar issue,
// just a note for us)

lower_bound: expression;

upper_bound: expression;

attribute: (
		data_attribute
		| AUTOMATIC
		| BUILTIN
		| STATIC
		| VARIABLE
		| based
		| defined
	);

data_attribute: (BINARY (precision)?)	# BIN
	| (DECIMAL (precision)?)			# DEC
	| POINTER							# PTR
	| (BIT max_length)					# BIT
	| CHARACTER							# CHAR
	| (STRING max_length)				# STR
	| ENTRY								# ENT
	| FIXED								# FIX
	| FLOAT								# FLT
	| OFFSET							# OFF
	| VARYING							# VNG
	| COROUTINE							# COR
	| COFUNCTION						# COF
	| BUILTIN							# BLTN
	| INTRINSIC							# INTR
	| identifier						# IDENT; // a user defined type would match here. 

precision: LPAR number_of_digits (COMMA scale_factor)? RPAR;

number_of_digits: (decimal_literal | identifier);

scale_factor: (decimal_literal | identifier);

max_length: LPAR (decimal_literal | identifier) RPAR;

based: BASED ('(' reference ')')?;

defined: DEFINED ('(' reference ')')?;

entry_information:
	parameter_name_commalist? (
		(returns_descriptor? coprocedure_specifier?)
		| (coprocedure_specifier? returns_descriptor?)
	);

coprocedure_specifier: (COROUTINE | COFUNCTION);

parameter_name_commalist: '(' identifier (',' identifier)* ')';

returns_descriptor:
	RETURNS data_attribute;
	// consider using keyword 'is' instead and forcing it to be right after the params...

return_stmt: RETURN ('(' expression ')')?;

if_stmt:
	then_clause (executable_stmt terminator)+ else_clause? end_stmt
	| then_clause (executable_stmt terminator)+ elif_clause+ end_stmt;

then_clause: IF expression THEN;

else_clause: ELSE (executable_stmt terminator)+;

elif_clause:
	ELIF expression THEN (executable_stmt terminator)+ else_clause?;

loop_stmt:
	LOOP  (executable_stmt terminator)+ end_stmt # BASIC_LOOP
	| LOOP  while_option until_option? (
		executable_stmt terminator
	)+ end_stmt # WHILE_UNTIL
	| LOOP  until_option while_option? (
		executable_stmt terminator
	)+ end_stmt # UNTIL_WHILE;

while_option: WHILE LPAR expression RPAR;

until_option: UNTIL LPAR expression RPAR;

define_stmt: // defines a type, like a structure
	DEFINE identifier (identifier type_info) (
		COMMA identifier type_info
	)* (COMMA)? END;

COMMENT: '/*' (COMMENT | .)*? '*/' -> channel(2);
LINE_COMMENT: '//' .*? '\n' -> channel(HIDDEN);
WS: (' ')+ -> skip;
NEWLINE: [\r\n]+ -> skip;
TAB: ('\t')+ -> skip;

/*
 GOTO: 
 {langcode=="en"}? 'goto' |
 {langcode=="fr"}? 'aller' 
 ;
 GO: 
 {langcode=="en"}? 'go' |
 {langcode=="fr"}? 'aller' 
 ;
 TO: 
 {langcode=="en"}? 'to' |
 {langcode=="fr"}? '�' 
 ;
 */

numeric_literal:
	binary_literal
	| octal_literal
	| hexadecimal_literal
	| decimal_literal;

hexadecimal_literal: (HEXADECIMAL_PATTERN);

octal_literal: (OCTAL_PATTERN);

decimal_literal: (DECIMAL_PATTERN);

binary_literal: (BINARY_PATTERN);

BYTE_ORDER_MARK: '\u00EF' '\u00BB' '\u00BF';

/* These Antlr4 keyword token definitions were generated by a utility on 1/8/2023 at 10:31 AM */

ALIGNED: {KeywordLanguageCode == "de"}? ('ausgerichtet') | {KeywordLanguageCode == "en"}? ('aligned') | {KeywordLanguageCode == "fr"}? ('aligné') | {KeywordLanguageCode == "he"}? ('aligned') ;
ARGUMENT: {KeywordLanguageCode == "de"}? ('argument') | {KeywordLanguageCode == "en"}? ('argument' | 'arg') | {KeywordLanguageCode == "fr"}? ('argument') | {KeywordLanguageCode == "he"}? ('argument') | {KeywordLanguageCode == "nl"}? ('argument') ;
AUTOMATIC: {KeywordLanguageCode == "de"}? ('automatisch' | 'auto') | {KeywordLanguageCode == "en"}? ('automatic' | 'auto') | {KeywordLanguageCode == "fr"}? ('automatique' | 'auto') ;
BASED: {KeywordLanguageCode == "de"}? ('based') | {KeywordLanguageCode == "en"}? ('based') | {KeywordLanguageCode == "fr"}? ('based') ;
BINARY: {KeywordLanguageCode == "de"}? ('binär') | {KeywordLanguageCode == "en"}? ('binary' | 'bin') | {KeywordLanguageCode == "fr"}? ('binaire') | {KeywordLanguageCode == "he"}? ('binary') | {KeywordLanguageCode == "nl"}? ('binair') ;
BIT: {KeywordLanguageCode == "de"}? ('bit') | {KeywordLanguageCode == "en"}? ('bit') | {KeywordLanguageCode == "fr"}? ('bit') ;
BOOLEAN: {KeywordLanguageCode == "de"}? ('boolesch') | {KeywordLanguageCode == "en"}? ('boolean' | 'bool') | {KeywordLanguageCode == "fr"}? ('booléenne') | {KeywordLanguageCode == "he"}? ('boolean') | {KeywordLanguageCode == "nl"}? ('boolean') ;
BUILTIN: {KeywordLanguageCode == "de"}? ('eingebaut') | {KeywordLanguageCode == "en"}? ('builtin') | {KeywordLanguageCode == "fr"}? ('intégré') | {KeywordLanguageCode == "he"}? ('builtin') | {KeywordLanguageCode == "nl"}? ('ingebouwd') ;
BY: {KeywordLanguageCode == "de"}? ('by') | {KeywordLanguageCode == "en"}? ('by') | {KeywordLanguageCode == "fr"}? ('by') | {KeywordLanguageCode == "he"}? ('by') | {KeywordLanguageCode == "nl"}? ('door') ;
BYPASS: {KeywordLanguageCode == "de"}? ('bypass') | {KeywordLanguageCode == "en"}? ('bypass') | {KeywordLanguageCode == "fr"}? ('bypass') ;
CALL: {KeywordLanguageCode == "de"}? ('aufrufen') | {KeywordLanguageCode == "en"}? ('call') | {KeywordLanguageCode == "fr"}? ('appeler') | {KeywordLanguageCode == "he"}? ('call') | {KeywordLanguageCode == "nl"}? ('aanroepen') ;
CHARACTER: {KeywordLanguageCode == "de"}? ('character') | {KeywordLanguageCode == "en"}? ('character' | 'char') | {KeywordLanguageCode == "fr"}? ('character') ;
COFUNCTION: {KeywordLanguageCode == "de"}? ('cofunction') | {KeywordLanguageCode == "en"}? ('cofunction') | {KeywordLanguageCode == "fr"}? ('cofunction') ;
COROUTINE: {KeywordLanguageCode == "de"}? ('coroutine') | {KeywordLanguageCode == "en"}? ('coroutine') | {KeywordLanguageCode == "fr"}? ('coroutine') | {KeywordLanguageCode == "he"}? ('coroutine') | {KeywordLanguageCode == "nl"}? ('co_routine') ;
DECIMAL: {KeywordLanguageCode == "de"}? ('dezimal') | {KeywordLanguageCode == "en"}? ('decimal' | 'dec') | {KeywordLanguageCode == "fr"}? ('décimal') | {KeywordLanguageCode == "he"}? ('decimal') | {KeywordLanguageCode == "nl"}? ('decimaal') ;
DECLARE: {KeywordLanguageCode == "de"}? ('deklarieren') | {KeywordLanguageCode == "en"}? ('declare' | 'dcl') | {KeywordLanguageCode == "fr"}? ('déclarer') | {KeywordLanguageCode == "he"}? ('declare') | {KeywordLanguageCode == "nl"}? ('declareer') ;
DEFINE: {KeywordLanguageCode == "de"}? ('define') | {KeywordLanguageCode == "en"}? ('define' | 'def') | {KeywordLanguageCode == "fr"}? ('define') | {KeywordLanguageCode == "he"}? ('define') ;
DEFINED: {KeywordLanguageCode == "de"}? ('defined') | {KeywordLanguageCode == "en"}? ('defined') | {KeywordLanguageCode == "fr"}? ('defined') ;
ELIF: {KeywordLanguageCode == "de"}? ('elif') | {KeywordLanguageCode == "en"}? ('elif') | {KeywordLanguageCode == "fr"}? ('elif') ;
ELSE: {KeywordLanguageCode == "de"}? ('anders') | {KeywordLanguageCode == "en"}? ('else') | {KeywordLanguageCode == "fr"}? ('autre') | {KeywordLanguageCode == "he"}? ('אחרת') ;
END: {KeywordLanguageCode == "de"}? ('ende') | {KeywordLanguageCode == "en"}? ('end') | {KeywordLanguageCode == "fr"}? ('fin') | {KeywordLanguageCode == "he"}? ('end') | {KeywordLanguageCode == "nl"}? ('einde') ;
ENDLOOP: {KeywordLanguageCode == "de"}? ('ende wiederholen') | {KeywordLanguageCode == "en"}? ('endloop') | {KeywordLanguageCode == "fr"}? ('endloop') ;
ENTRY: {KeywordLanguageCode == "de"}? ('entry') | {KeywordLanguageCode == "en"}? ('entry') | {KeywordLanguageCode == "fr"}? ('entry') ;
ENUM: {KeywordLanguageCode == "de"}? ('enum') | {KeywordLanguageCode == "en"}? ('enum') | {KeywordLanguageCode == "fr"}? ('enum') | {KeywordLanguageCode == "he"}? ('enum') | {KeywordLanguageCode == "nl"}? ('opsomming') ;
FIXED: {KeywordLanguageCode == "de"}? ('stationär') | {KeywordLanguageCode == "en"}? ('fixed') | {KeywordLanguageCode == "fr"}? ('fixe') | {KeywordLanguageCode == "he"}? ('fixed') | {KeywordLanguageCode == "nl"}? ('fixed') ;
FLOAT: {KeywordLanguageCode == "de"}? ('flottant') | {KeywordLanguageCode == "en"}? ('float') | {KeywordLanguageCode == "fr"}? ('flottant') | {KeywordLanguageCode == "he"}? ('float') | {KeywordLanguageCode == "nl"}? ('float') ;
FUNCTION: {KeywordLanguageCode == "de"}? ('fonction') | {KeywordLanguageCode == "en"}? ('function' | 'func') | {KeywordLanguageCode == "fr"}? ('fonction') | {KeywordLanguageCode == "he"}? ('function') | {KeywordLanguageCode == "nl"}? ('functie') ;
GOTO: {KeywordLanguageCode == "de"}? ('gehen') | {KeywordLanguageCode == "en"}? ('goto' | 'go to') | {KeywordLanguageCode == "fr"}? ('aller à') | {KeywordLanguageCode == "he"}? ('goto') | {KeywordLanguageCode == "nl"}? ('ga') ;
IF: {KeywordLanguageCode == "de"}? ('wenn') | {KeywordLanguageCode == "en"}? ('if') | {KeywordLanguageCode == "fr"}? ('si') | {KeywordLanguageCode == "he"}? ('אם') | {KeywordLanguageCode == "nl"}? ('als') ;
INC: {KeywordLanguageCode == "de"}? ('inc') | {KeywordLanguageCode == "en"}? ('inc') | {KeywordLanguageCode == "fr"}? ('inc') ;
INCLUDE: {KeywordLanguageCode == "de"}? ('enthalten') | {KeywordLanguageCode == "en"}? ('include' | 'inc') | {KeywordLanguageCode == "fr"}? ('comprendre') ;
INTERNAL: {KeywordLanguageCode == "de"}? ('intern') | {KeywordLanguageCode == "en"}? ('internal') | {KeywordLanguageCode == "fr"}? ('interne') | {KeywordLanguageCode == "he"}? ('internal') | {KeywordLanguageCode == "nl"}? ('intern') ;
INTERRUPT: {KeywordLanguageCode == "de"}? ('unterbrechen') | {KeywordLanguageCode == "en"}? ('interrupt') | {KeywordLanguageCode == "fr"}? ('interrompre') | {KeywordLanguageCode == "he"}? ('interrupt') | {KeywordLanguageCode == "nl"}? ('interrupt') ;
INTRINSIC: {KeywordLanguageCode == "de"}? ('intrinsisch') | {KeywordLanguageCode == "en"}? ('intrinsic') | {KeywordLanguageCode == "fr"}? ('intrinsic') ;
LANGUAGE: {KeywordLanguageCode == "de"}? ('lingua') | {KeywordLanguageCode == "en"}? ('lingua') | {KeywordLanguageCode == "fr"}? ('lingua') | {KeywordLanguageCode == "he"}? ('lingua') ;
LOOP: {KeywordLanguageCode == "de"}? ('wiederholen') | {KeywordLanguageCode == "en"}? ('loop') | {KeywordLanguageCode == "fr"}? ('boucle') | {KeywordLanguageCode == "he"}? ('loop') | {KeywordLanguageCode == "nl"}? ('lus') ;
NAMESPACE: {KeywordLanguageCode == "de"}? ('namespace') | {KeywordLanguageCode == "en"}? ('namespace') | {KeywordLanguageCode == "fr"}? ('namespace') | {KeywordLanguageCode == "he"}? ('namespace') | {KeywordLanguageCode == "nl"}? ('namespace') ;
OFFSET: {KeywordLanguageCode == "de"}? ('offset') | {KeywordLanguageCode == "en"}? ('offset') | {KeywordLanguageCode == "fr"}? ('offset') | {KeywordLanguageCode == "he"}? ('offset') ;
OUT: {KeywordLanguageCode == "de"}? ('depuis') | {KeywordLanguageCode == "en"}? ('out') | {KeywordLanguageCode == "fr"}? ('depuis') | {KeywordLanguageCode == "he"}? ('out') | {KeywordLanguageCode == "nl"}? ('out') ;
PAD: {KeywordLanguageCode == "de"}? ('pad') | {KeywordLanguageCode == "en"}? ('pad') | {KeywordLanguageCode == "fr"}? ('pad') | {KeywordLanguageCode == "he"}? ('pad') ;
POINTER: {KeywordLanguageCode == "de"}? ('pointer') | {KeywordLanguageCode == "en"}? ('pointer' | 'ptr') | {KeywordLanguageCode == "fr"}? ('pointer') | {KeywordLanguageCode == "he"}? ('pointer') ;
PRIVATE: {KeywordLanguageCode == "de"}? ('privé') | {KeywordLanguageCode == "en"}? ('private') | {KeywordLanguageCode == "fr"}? ('privé') | {KeywordLanguageCode == "he"}? ('private') | {KeywordLanguageCode == "nl"}? ('private') ;
PROCEDURE: {KeywordLanguageCode == "de"}? ('routine') | {KeywordLanguageCode == "en"}? ('procedure' | 'proc') | {KeywordLanguageCode == "fr"}? ('procédé') | {KeywordLanguageCode == "he"}? ('procedure') | {KeywordLanguageCode == "nl"}? ('procedure') ;
PUBLIC: {KeywordLanguageCode == "de"}? ('öffentlich') | {KeywordLanguageCode == "en"}? ('public') | {KeywordLanguageCode == "fr"}? ('public') | {KeywordLanguageCode == "he"}? ('public') | {KeywordLanguageCode == "nl"}? ('publiek') ;
READONLY: {KeywordLanguageCode == "de"}? ('readonly') | {KeywordLanguageCode == "en"}? ('readonly') | {KeywordLanguageCode == "fr"}? ('readonly') | {KeywordLanguageCode == "he"}? ('readonly') | {KeywordLanguageCode == "nl"}? ('alleen_lezen') ;
REF: {KeywordLanguageCode == "de"}? ('ref') | {KeywordLanguageCode == "en"}? ('ref') | {KeywordLanguageCode == "fr"}? ('ref') | {KeywordLanguageCode == "he"}? ('ref') | {KeywordLanguageCode == "nl"}? ('referentie') ;
RELOOP: {KeywordLanguageCode == "de"}? ('reloop') | {KeywordLanguageCode == "en"}? ('reloop') | {KeywordLanguageCode == "fr"}? ('reloop') ;
RETURN: {KeywordLanguageCode == "de"}? ('rückkehr') | {KeywordLanguageCode == "en"}? ('return') | {KeywordLanguageCode == "fr"}? ('retour') | {KeywordLanguageCode == "he"}? ('return') | {KeywordLanguageCode == "nl"}? ('terug') ;
RETURNS: {KeywordLanguageCode == "de"}? ('rückkehrs') | {KeywordLanguageCode == "en"}? ('returns') | {KeywordLanguageCode == "fr"}? ('retours') ;
RETURNON: {KeywordLanguageCode == "de"}? ('retour_si') | {KeywordLanguageCode == "en"}? ('returnon') | {KeywordLanguageCode == "fr"}? ('retour_si') | {KeywordLanguageCode == "he"}? ('returnon') | {KeywordLanguageCode == "nl"}? ('terug_bij') ;
SINGLET: {KeywordLanguageCode == "de"}? ('singlet') | {KeywordLanguageCode == "en"}? ('singlet') | {KeywordLanguageCode == "fr"}? ('singlet') | {KeywordLanguageCode == "he"}? ('singlet') | {KeywordLanguageCode == "nl"}? ('singlet') ;
STATIC: {KeywordLanguageCode == "de"}? ('static') | {KeywordLanguageCode == "en"}? ('static') | {KeywordLanguageCode == "fr"}? ('static') | {KeywordLanguageCode == "he"}? ('static') | {KeywordLanguageCode == "nl"}? ('statisch') ;
STRING: {KeywordLanguageCode == "de"}? ('text') | {KeywordLanguageCode == "en"}? ('string') | {KeywordLanguageCode == "fr"}? ('chaîne') | {KeywordLanguageCode == "he"}? ('string') | {KeywordLanguageCode == "nl"}? ('string') ;
STRUCTURE: {KeywordLanguageCode == "de"}? ('structure') | {KeywordLanguageCode == "en"}? ('structure' | 'struct') | {KeywordLanguageCode == "fr"}? ('structure') | {KeywordLanguageCode == "he"}? ('structure') | {KeywordLanguageCode == "nl"}? ('structuur') ;
THEN: {KeywordLanguageCode == "de"}? ('dann') | {KeywordLanguageCode == "en"}? ('then') | {KeywordLanguageCode == "fr"}? ('ensuite') ;
TO: {KeywordLanguageCode == "de"}? ('to') | {KeywordLanguageCode == "en"}? ('to') | {KeywordLanguageCode == "fr"}? ('to') | {KeywordLanguageCode == "he"}? ('to') | {KeywordLanguageCode == "nl"}? ('tot') ;
TYPE: {KeywordLanguageCode == "de"}? ('art') | {KeywordLanguageCode == "en"}? ('type') | {KeywordLanguageCode == "fr"}? ('type') | {KeywordLanguageCode == "he"}? ('type') | {KeywordLanguageCode == "nl"}? ('type') ;
UNALIGNED: {KeywordLanguageCode == "de"}? ('unaligned') | {KeywordLanguageCode == "en"}? ('unaligned') | {KeywordLanguageCode == "fr"}? ('unaligned') | {KeywordLanguageCode == "he"}? ('unaligned') ;
UNTIL: {KeywordLanguageCode == "de"}? ('bis') | {KeywordLanguageCode == "en"}? ('until') | {KeywordLanguageCode == "fr"}? ('avant') | {KeywordLanguageCode == "he"}? ('until') | {KeywordLanguageCode == "nl"}? ('totdat') ;
USING: {KeywordLanguageCode == "de"}? ('using') | {KeywordLanguageCode == "en"}? ('using') | {KeywordLanguageCode == "fr"}? ('using') | {KeywordLanguageCode == "he"}? ('using') | {KeywordLanguageCode == "nl"}? ('gebruikende') ;
WHILE: {KeywordLanguageCode == "de"}? ('solang') | {KeywordLanguageCode == "en"}? ('while') | {KeywordLanguageCode == "fr"}? ('tandis que') | {KeywordLanguageCode == "he"}? ('כלעוד') | {KeywordLanguageCode == "nl"}? ('zolang') ;
VARIABLE: {KeywordLanguageCode == "de"}? ('variable') | {KeywordLanguageCode == "en"}? ('variable') | {KeywordLanguageCode == "fr"}? ('variable') ;
VARYING: {KeywordLanguageCode == "de"}? ('varying') | {KeywordLanguageCode == "en"}? ('varying') | {KeywordLanguageCode == "fr"}? ('varying') | {KeywordLanguageCode == "he"}? ('varying') | {KeywordLanguageCode == "nl"}? ('varierend') ;
YIELD: {KeywordLanguageCode == "de"}? ('abtreten') | {KeywordLanguageCode == "en"}? ('yield') | {KeywordLanguageCode == "fr"}? ('donner') | {KeywordLanguageCode == "he"}? ('yield') | {KeywordLanguageCode == "nl"}? ('opbrengst') ;

/* End of generated Antlr4 keyword token definitions. */

BASE_B: (':b' | ':B');
BASE_O: (':o' | ':O');
BASE_D: (':d' | ':D');
BASE_H: (':h' | ':H');
FRAC_B: ('.' [0-1]+);
FRAC_D: ('.' [0-9]+);
FRAC_O: ('.' [0-7]+);
FRAC_H: ('.' [0-9a-fA-F]+);

IDENTIFIER: [a-zA-Z_]+;
BINARY_PATTERN: (BIN (LSEP BIN)*)+ FRAC_B? BASE_B;
OCTAL_PATTERN: (OCT (LSEP OCT)*)+ FRAC_O? BASE_O;
HEXADECIMAL_PATTERN: (HEX (LSEP HEX)*)+ FRAC_H? BASE_H;
DECIMAL_PATTERN: (DEC (LSEP DEC)*)+ FRAC_D? BASE_D?;
LSEP: (' ' | '_');

BIN: [0-1];
OCT: [0-7];
DEC: [0-9];
HEX: [0-9a-fA-F];

ARROW: '->';
DOT: '.';
COMMA: ',';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
EQUALS: '=';
TIMES: '*';
DIVIDE: '/';
PLUS: '+';
MINUS: '-';
SEMICOLON: ';';
POWER: '**';
COLON: ':';
DQUOTE: '"';
QUOTE: '\'';
QMARK: '?';

/* Fixed the numeric literals:
 
 // DELETE THIS CONTENT IF YOU PUT COMBINED GRAMMAR IN Parser TAB
 lexer grammar ExprLexer;
 
 BIN: ([0-1]|' ')+ BASE_B;
 OCT: ([0-7]|' ')+ BASE_O;
 HEX: ([0-9a-f]|'
 ')+ BASE_H ; 
 DEC: ([0-9]|' ')+ BASE_D?; 
 
 DOT: '.';
 NL: '\n' ;
 DOT: '.';
 NL: '\n' ;
 
 BASE_B: (':b' | ':B') ;
 BASE_O: (':o' | ':O') ;
 BASE_D: (':d' | ':D') ;
 BASE_H: (':h' | ':H') ;
 
 
 parser grammar ExprParser;
 options { tokenVocab=ExprLexer; }
 
 program
 : (literal NL)* EOF
 ;
 
 literal
 : bin 
 | oct 
 | dec 
 | hex 
 ;
 
 bin : (BIN) ;
 
 oct : (OCT) ;
 
 dec : (DEC) ;
 
 hex : (HEX) ;
 
 With tests:
 
 123 665
 1123 5543:o
 f56:h
 1101:b
 239 445 333 44344 85:d
 1011
 1100 1010 0001:b
 
 tested in: http://lab.antlr.org/
 
 
 */
