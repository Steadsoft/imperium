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
    public String langcode = "en";

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
	| GO
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

goto_stmt: (GOTO | GO TO) reference;

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


/* These Antlr4 keyword token definitions were generated by a utility on 1/6/2023 at 3:30 PM */

ALIGNED: {langcode=="en"}? ('aligned') | {langcode=="fr"}? ('aligned') | {langcode=="he"}? ('aligned') ;
ARGUMENT: {langcode=="en"}? ('argument' | 'arg') | {langcode=="fr"}? ('argument') | {langcode=="he"}? ('argument') | {langcode=="nl"}? ('argument') ;
AUTOMATIC: {langcode=="en"}? ('automatic' | 'auto') ;
BASED: {langcode=="en"}? ('based') ;
BINARY: {langcode=="en"}? ('binary' | 'bin') | {langcode=="fr"}? ('binaire') | {langcode=="he"}? ('binary') | {langcode=="nl"}? ('binair') ;
BIT: {langcode=="en"}? ('bit') ;
BOOLEAN: {langcode=="en"}? ('boolean' | 'bool') | {langcode=="fr"}? ('booléenne') | {langcode=="he"}? ('boolean') | {langcode=="nl"}? ('boolean') ;
BUILTIN: {langcode=="en"}? ('builtin') | {langcode=="fr"}? ('intégré') | {langcode=="he"}? ('builtin') | {langcode=="nl"}? ('ingebouwd') ;
BY: {langcode=="en"}? ('by') | {langcode=="fr"}? ('by') | {langcode=="he"}? ('by') | {langcode=="nl"}? ('door') ;
BYPASS: {langcode=="en"}? ('bypass') | {langcode=="fr"}? ('bypass') ;
CALL: {langcode=="en"}? ('call') | {langcode=="fr"}? ('appeler') | {langcode=="he"}? ('call') | {langcode=="nl"}? ('aanroepen') ;
CHARACTER: {langcode=="en"}? ('character' | 'char') ;
COFUNCTION: {langcode=="en"}? ('cofunction') ;
COROUTINE: {langcode=="en"}? ('coroutine') | {langcode=="fr"}? ('coroutine') | {langcode=="he"}? ('coroutine') | {langcode=="nl"}? ('co-routine') ;
DECIMAL: {langcode=="en"}? ('decimal' | 'dec') | {langcode=="fr"}? ('décimal') | {langcode=="he"}? ('decimal') | {langcode=="nl"}? ('decimaal') ;
DECLARE: {langcode=="en"}? ('declare' | 'dcl') | {langcode=="fr"}? ('doclarer') | {langcode=="he"}? ('declare') | {langcode=="nl"}? ('declareer') ;
DEFINE: {langcode=="en"}? ('define' | 'def') | {langcode=="fr"}? ('define') | {langcode=="he"}? ('define') ;
DEFINED: {langcode=="en"}? ('defined') ;
ELIF: {langcode=="en"}? ('elif') ;
ELSE: {langcode=="en"}? ('else') | {langcode=="fr"}? ('else') | {langcode=="he"}? ('אחרת') ;
END: {langcode=="en"}? ('end') | {langcode=="fr"}? ('fin') | {langcode=="he"}? ('end') | {langcode=="nl"}? ('einde') ;
ENDLOOP: {langcode=="en"}? ('endloop') ;
ENTRY: {langcode=="en"}? ('entry') ;
ENUM: {langcode=="en"}? ('enum') | {langcode=="fr"}? ('enum') | {langcode=="he"}? ('enum') | {langcode=="nl"}? ('opsomming') ;
FIXED: {langcode=="en"}? ('fixed') | {langcode=="fr"}? ('fixe') | {langcode=="he"}? ('fixed') | {langcode=="nl"}? ('fixed') ;
FLOAT: {langcode=="en"}? ('float') | {langcode=="fr"}? ('flottant') | {langcode=="he"}? ('float') | {langcode=="nl"}? ('float') ;
FUNCTION: {langcode=="en"}? ('function' | 'func') | {langcode=="fr"}? ('fonction') | {langcode=="he"}? ('function') | {langcode=="nl"}? ('functie') ;
GO: {langcode=="en"}? ('go') ;
GOTO: {langcode=="en"}? ('goto') | {langcode=="fr"}? ('goto') | {langcode=="he"}? ('goto') | {langcode=="nl"}? ('ga') ;
IF: {langcode=="en"}? ('if') | {langcode=="fr"}? ('si') | {langcode=="he"}? ('אם') | {langcode=="nl"}? ('als') ;
INC: {langcode=="en"}? ('inc') ;
INCLUDE: {langcode=="en"}? ('include' | 'inc') ;
INTERNAL: {langcode=="en"}? ('internal') | {langcode=="fr"}? ('interne') | {langcode=="he"}? ('internal') | {langcode=="nl"}? ('intern') ;
INTERRUPT: {langcode=="en"}? ('interrupt') | {langcode=="fr"}? ('interrompre') | {langcode=="he"}? ('interrupt') | {langcode=="nl"}? ('interrupt') ;
INTRINSIC: {langcode=="en"}? ('intrinsic') ;
LANGUAGE: {langcode=="en"}? ('lingua') | {langcode=="fr"}? ('lingua') | {langcode=="he"}? ('lingua') ;
LOOP: {langcode=="en"}? ('loop') | {langcode=="fr"}? ('boucle') | {langcode=="he"}? ('loop') | {langcode=="nl"}? ('lus') ;
NAMESPACE: {langcode=="en"}? ('namespace') | {langcode=="fr"}? ('namespace') | {langcode=="he"}? ('namespace') | {langcode=="nl"}? ('namespace') ;
OFFSET: {langcode=="en"}? ('offset') | {langcode=="fr"}? ('offset') | {langcode=="he"}? ('offset') ;
OUT: {langcode=="en"}? ('out') | {langcode=="fr"}? ('depuis') | {langcode=="he"}? ('out') | {langcode=="nl"}? ('out') ;
PAD: {langcode=="en"}? ('pad') | {langcode=="fr"}? ('pad') | {langcode=="he"}? ('pad') ;
POINTER: {langcode=="en"}? ('pointer' | 'ptr') | {langcode=="fr"}? ('pointer') | {langcode=="he"}? ('pointer') ;
PRIVATE: {langcode=="en"}? ('private') | {langcode=="fr"}? ('privé') | {langcode=="he"}? ('private') | {langcode=="nl"}? ('private') ;
PROCEDURE: {langcode=="en"}? ('procedure' | 'proc') | {langcode=="fr"}? ('procede') | {langcode=="he"}? ('procedure') | {langcode=="nl"}? ('procedure') ;
PUBLIC: {langcode=="en"}? ('public') | {langcode=="fr"}? ('public') | {langcode=="he"}? ('public') | {langcode=="nl"}? ('publiek') ;
READONLY: {langcode=="en"}? ('readonly') | {langcode=="fr"}? ('readonly') | {langcode=="he"}? ('readonly') | {langcode=="nl"}? ('alleen-lezen') ;
REF: {langcode=="en"}? ('ref') | {langcode=="fr"}? ('ref') | {langcode=="he"}? ('ref') | {langcode=="nl"}? ('referentie') ;
RELOOP: {langcode=="en"}? ('reloop') ;
RETURN: {langcode=="en"}? ('return') | {langcode=="fr"}? ('retour') | {langcode=="he"}? ('return') | {langcode=="nl"}? ('terug') ;
RETURNS: {langcode=="en"}? ('returns') ;
RETURNON: {langcode=="en"}? ('returnon') | {langcode=="fr"}? ('retour si') | {langcode=="he"}? ('returnon') | {langcode=="nl"}? ('terug-bij') ;
SINGLET: {langcode=="en"}? ('singlet') | {langcode=="fr"}? ('singlet') | {langcode=="he"}? ('singlet') | {langcode=="nl"}? ('singlet') ;
STATIC: {langcode=="en"}? ('static') | {langcode=="fr"}? ('static') | {langcode=="he"}? ('static') | {langcode=="nl"}? ('statisch') ;
STRING: {langcode=="en"}? ('string') | {langcode=="fr"}? ('chaîne') | {langcode=="he"}? ('string') | {langcode=="nl"}? ('string') ;
STRUCTURE: {langcode=="en"}? ('structure' | 'struct') | {langcode=="fr"}? ('structure') | {langcode=="he"}? ('structure') | {langcode=="nl"}? ('structuur') ;
THEN: {langcode=="en"}? ('then') | {langcode=="fr"}? ('then') ;
TO: {langcode=="en"}? ('to') | {langcode=="fr"}? ('to') | {langcode=="he"}? ('to') | {langcode=="nl"}? ('tot') ;
TYPE: {langcode=="en"}? ('type') | {langcode=="fr"}? ('type') | {langcode=="he"}? ('type') | {langcode=="nl"}? ('type') ;
UNALIGNED: {langcode=="en"}? ('unaligned') | {langcode=="fr"}? ('unaligned') | {langcode=="he"}? ('unaligned') ;
UNTIL: {langcode=="en"}? ('until') | {langcode=="fr"}? ('avant') | {langcode=="he"}? ('until') | {langcode=="nl"}? ('totdat') ;
USING: {langcode=="en"}? ('using') | {langcode=="fr"}? ('using') | {langcode=="he"}? ('using') | {langcode=="nl"}? ('gebruikende') ;
WHILE: {langcode=="en"}? ('while') | {langcode=="fr"}? ('tandis que') | {langcode=="he"}? ('כלעוד') | {langcode=="nl"}? ('zolang') ;
VARIABLE: {langcode=="en"}? ('variable') ;
VARYING: {langcode=="en"}? ('varying') | {langcode=="fr"}? ('varying') | {langcode=="he"}? ('varying') | {langcode=="nl"}? ('varierend') ;
YIELD: {langcode=="en"}? ('yield') | {langcode=="fr"}? ('donner') | {langcode=="he"}? ('yield') | {langcode=="nl"}? ('opbrengst') ;

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
