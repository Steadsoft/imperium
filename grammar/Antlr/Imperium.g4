/* This is the grammar for the Imperium programming language */

/*---------------------------------------------------------------------------*/
/* Keyword translation info kindly contributed by:                           */
/* English (en) - Hugh Gleaves                                               */
/* Dutch (nl)   - Gabor de Mooij (https://github.com/gabordemooij/citrine)   */
/*---------------------------------------------------------------------------*/

grammar Imperium; // Latin for "control"

@lexer::members {
    
	// This code MUST compile fine as Java and C#

	public String KeywordLexiconCode = "ru";

	public Boolean Lexicon(String Code)
	{
		return Code == KeywordLexiconCode;
	}
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

// See page 208 PL/I Subset G standard. Lower bound must be <= upper (but this is not a grammar issue,
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

/* These Antlr4 keyword token definitions were generated by a utility on 1/10/2023 at 9:04 AM */

ALIGNED: 
           {Lexicon("bg")}? ('выровнены') | 
           {Lexicon("de")}? ('ausgerichtet') | 
           {Lexicon("en")}? ('aligned') | 
           {Lexicon("fr")}? ('aligné') | 
           {Lexicon("he")}? ('aligned') | 
           {Lexicon("ru")}? ('выровнены') ;
ARGUMENT: 
           {Lexicon("bg")}? ('argument' | 'arg') | 
           {Lexicon("de")}? ('argument') | 
           {Lexicon("en")}? ('argument' | 'arg') | 
           {Lexicon("fr")}? ('argument') | 
           {Lexicon("he")}? ('argument') | 
           {Lexicon("nl")}? ('argument') | 
           {Lexicon("ru")}? ('argument' | 'arg') ;
AUTOMATIC: 
           {Lexicon("bg")}? ('автоматический' | 'auto') | 
           {Lexicon("de")}? ('automatisch' | 'auto') | 
           {Lexicon("en")}? ('automatic' | 'auto') | 
           {Lexicon("fr")}? ('automatique' | 'auto') | 
           {Lexicon("ru")}? ('автоматический' | 'auto') ;
BASED: 
           {Lexicon("bg")}? ('based') | 
           {Lexicon("de")}? ('based') | 
           {Lexicon("en")}? ('based') | 
           {Lexicon("fr")}? ('based') | 
           {Lexicon("ru")}? ('based') ;
BINARY: 
           {Lexicon("bg")}? ('двоичен') | 
           {Lexicon("de")}? ('binär') | 
           {Lexicon("en")}? ('binary' | 'bin') | 
           {Lexicon("fr")}? ('binaire') | 
           {Lexicon("he")}? ('binary') | 
           {Lexicon("nl")}? ('binair') | 
           {Lexicon("ru")}? ('бинарный' | 'bin') ;
BIT: 
           {Lexicon("bg")}? ('бит') | 
           {Lexicon("de")}? ('bit') | 
           {Lexicon("en")}? ('bit') | 
           {Lexicon("fr")}? ('bit') | 
           {Lexicon("ru")}? ('бит') ;
BOOLEAN: 
           {Lexicon("bg")}? ('boolean' | 'bool') | 
           {Lexicon("de")}? ('boolesch') | 
           {Lexicon("en")}? ('boolean' | 'bool') | 
           {Lexicon("fr")}? ('booléenne') | 
           {Lexicon("he")}? ('boolean') | 
           {Lexicon("nl")}? ('boolean') | 
           {Lexicon("ru")}? ('boolean' | 'bool') ;
BUILTIN: 
           {Lexicon("bg")}? ('builtin') | 
           {Lexicon("de")}? ('eingebaut') | 
           {Lexicon("en")}? ('builtin') | 
           {Lexicon("fr")}? ('intégré') | 
           {Lexicon("he")}? ('builtin') | 
           {Lexicon("nl")}? ('ingebouwd') | 
           {Lexicon("ru")}? ('builtin') ;
BY: 
           {Lexicon("bg")}? ('by') | 
           {Lexicon("de")}? ('by') | 
           {Lexicon("en")}? ('by') | 
           {Lexicon("fr")}? ('by') | 
           {Lexicon("he")}? ('by') | 
           {Lexicon("nl")}? ('door') | 
           {Lexicon("ru")}? ('by') ;
BYPASS: 
           {Lexicon("bg")}? ('bypass') | 
           {Lexicon("de")}? ('bypass') | 
           {Lexicon("en")}? ('bypass') | 
           {Lexicon("fr")}? ('bypass') | 
           {Lexicon("ru")}? ('bypass') ;
CALL: 
           {Lexicon("bg")}? ('вызов') | 
           {Lexicon("de")}? ('aufrufen') | 
           {Lexicon("en")}? ('call') | 
           {Lexicon("fr")}? ('appeler') | 
           {Lexicon("he")}? ('call') | 
           {Lexicon("nl")}? ('aanroepen') | 
           {Lexicon("ru")}? ('вызов') ;
CHARACTER: 
           {Lexicon("bg")}? ('character' | 'char') | 
           {Lexicon("de")}? ('character') | 
           {Lexicon("en")}? ('character' | 'char') | 
           {Lexicon("fr")}? ('character') | 
           {Lexicon("ru")}? ('character' | 'char') ;
COFUNCTION: 
           {Lexicon("bg")}? ('cofunction') | 
           {Lexicon("de")}? ('cofunction') | 
           {Lexicon("en")}? ('cofunction') | 
           {Lexicon("fr")}? ('cofunction') | 
           {Lexicon("ru")}? ('cofunction') ;
COROUTINE: 
           {Lexicon("bg")}? ('coroutine') | 
           {Lexicon("de")}? ('coroutine') | 
           {Lexicon("en")}? ('coroutine') | 
           {Lexicon("fr")}? ('coroutine') | 
           {Lexicon("he")}? ('coroutine') | 
           {Lexicon("nl")}? ('co routine') | 
           {Lexicon("ru")}? ('coroutine') ;
DECIMAL: 
           {Lexicon("bg")}? ('decimal' | 'dec') | 
           {Lexicon("de")}? ('dezimal') | 
           {Lexicon("en")}? ('decimal' | 'dec') | 
           {Lexicon("fr")}? ('décimal') | 
           {Lexicon("he")}? ('decimal') | 
           {Lexicon("nl")}? ('decimaal') | 
           {Lexicon("ru")}? ('decimal' | 'dec') ;
DECLARE: 
           {Lexicon("bg")}? ('обявявам') | 
           {Lexicon("de")}? ('deklarieren') | 
           {Lexicon("en")}? ('declare' | 'dcl') | 
           {Lexicon("fr")}? ('déclarer') | 
           {Lexicon("he")}? ('declare') | 
           {Lexicon("nl")}? ('declareer') | 
           {Lexicon("ru")}? ('объявлять' | 'dcl') ;
DEFINE: 
           {Lexicon("bg")}? ('define' | 'def') | 
           {Lexicon("de")}? ('define') | 
           {Lexicon("en")}? ('define' | 'def') | 
           {Lexicon("fr")}? ('define') | 
           {Lexicon("he")}? ('define') | 
           {Lexicon("ru")}? ('define' | 'def') ;
DEFINED: 
           {Lexicon("bg")}? ('defined') | 
           {Lexicon("de")}? ('defined') | 
           {Lexicon("en")}? ('defined') | 
           {Lexicon("fr")}? ('defined') | 
           {Lexicon("ru")}? ('defined') ;
ELIF: 
           {Lexicon("bg")}? ('elif') | 
           {Lexicon("de")}? ('elif') | 
           {Lexicon("en")}? ('elif') | 
           {Lexicon("fr")}? ('elif') | 
           {Lexicon("ru")}? ('elif') ;
ELSE: 
           {Lexicon("bg")}? ('друго') | 
           {Lexicon("de")}? ('anders') | 
           {Lexicon("en")}? ('else') | 
           {Lexicon("fr")}? ('autre') | 
           {Lexicon("he")}? ('אחרת') | 
           {Lexicon("ru")}? ('еще') ;
END: 
           {Lexicon("bg")}? ('конец') | 
           {Lexicon("de")}? ('ende') | 
           {Lexicon("en")}? ('end') | 
           {Lexicon("fr")}? ('fin') | 
           {Lexicon("he")}? ('end') | 
           {Lexicon("nl")}? ('einde') | 
           {Lexicon("ru")}? ('конец') ;
ENDLOOP: 
           {Lexicon("bg")}? ('endloop') | 
           {Lexicon("de")}? ('ende wiederholen') | 
           {Lexicon("en")}? ('endloop') | 
           {Lexicon("fr")}? ('endloop') | 
           {Lexicon("ru")}? ('endloop') ;
ENTRY: 
           {Lexicon("bg")}? ('entry') | 
           {Lexicon("de")}? ('entry') | 
           {Lexicon("en")}? ('entry') | 
           {Lexicon("fr")}? ('entry') | 
           {Lexicon("ru")}? ('entry') ;
ENUM: 
           {Lexicon("bg")}? ('enum') | 
           {Lexicon("de")}? ('enum') | 
           {Lexicon("en")}? ('enum') | 
           {Lexicon("fr")}? ('enum') | 
           {Lexicon("he")}? ('enum') | 
           {Lexicon("nl")}? ('opsomming') | 
           {Lexicon("ru")}? ('enum') ;
FIXED: 
           {Lexicon("bg")}? ('fixed') | 
           {Lexicon("de")}? ('stationär') | 
           {Lexicon("en")}? ('fixed') | 
           {Lexicon("fr")}? ('fixe') | 
           {Lexicon("he")}? ('fixed') | 
           {Lexicon("nl")}? ('fixed') | 
           {Lexicon("ru")}? ('fixed') ;
FLOAT: 
           {Lexicon("bg")}? ('float') | 
           {Lexicon("de")}? ('flottant') | 
           {Lexicon("en")}? ('float') | 
           {Lexicon("fr")}? ('flottant') | 
           {Lexicon("he")}? ('float') | 
           {Lexicon("nl")}? ('float') | 
           {Lexicon("ru")}? ('float') ;
FUNCTION: 
           {Lexicon("bg")}? ('function' | 'func') | 
           {Lexicon("de")}? ('fonction') | 
           {Lexicon("en")}? ('function' | 'func') | 
           {Lexicon("fr")}? ('fonction') | 
           {Lexicon("he")}? ('function') | 
           {Lexicon("nl")}? ('functie') | 
           {Lexicon("ru")}? ('function' | 'func') ;
GOTO: 
           {Lexicon("bg")}? ('перейти к') | 
           {Lexicon("de")}? ('gehen') | 
           {Lexicon("en")}? ('goto' | 'go to') | 
           {Lexicon("fr")}? ('aller à') | 
           {Lexicon("he")}? ('goto') | 
           {Lexicon("nl")}? ('ga') | 
           {Lexicon("ru")}? ('перейти к') ;
IF: 
           {Lexicon("bg")}? ('ако') | 
           {Lexicon("de")}? ('wenn') | 
           {Lexicon("en")}? ('if') | 
           {Lexicon("fr")}? ('si') | 
           {Lexicon("he")}? ('אם') | 
           {Lexicon("nl")}? ('als') | 
           {Lexicon("ru")}? ('если') ;
INC: 
           {Lexicon("bg")}? ('inc') | 
           {Lexicon("de")}? ('inc') | 
           {Lexicon("en")}? ('inc') | 
           {Lexicon("fr")}? ('inc') | 
           {Lexicon("ru")}? ('inc') ;
INCLUDE: 
           {Lexicon("bg")}? ('include') | 
           {Lexicon("de")}? ('enthalten') | 
           {Lexicon("en")}? ('include') | 
           {Lexicon("fr")}? ('comprendre') | 
           {Lexicon("ru")}? ('include') ;
INTERNAL: 
           {Lexicon("bg")}? ('internal') | 
           {Lexicon("de")}? ('intern') | 
           {Lexicon("en")}? ('internal') | 
           {Lexicon("fr")}? ('interne') | 
           {Lexicon("he")}? ('internal') | 
           {Lexicon("nl")}? ('intern') | 
           {Lexicon("ru")}? ('internal') ;
INTERRUPT: 
           {Lexicon("bg")}? ('interrupt') | 
           {Lexicon("de")}? ('unterbrechen') | 
           {Lexicon("en")}? ('interrupt') | 
           {Lexicon("fr")}? ('interrompre') | 
           {Lexicon("he")}? ('interrupt') | 
           {Lexicon("nl")}? ('interrupt') | 
           {Lexicon("ru")}? ('interrupt') ;
INTRINSIC: 
           {Lexicon("bg")}? ('intrinsic') | 
           {Lexicon("de")}? ('intrinsisch') | 
           {Lexicon("en")}? ('intrinsic') | 
           {Lexicon("fr")}? ('intrinsic') | 
           {Lexicon("ru")}? ('intrinsic') ;
LANGUAGE: 
           {Lexicon("bg")}? ('lingua') | 
           {Lexicon("de")}? ('lingua') | 
           {Lexicon("en")}? ('lingua') | 
           {Lexicon("fr")}? ('lingua') | 
           {Lexicon("he")}? ('lingua') | 
           {Lexicon("ru")}? ('lingua') ;
LOOP: 
           {Lexicon("bg")}? ('повторете') | 
           {Lexicon("de")}? ('wiederholen') | 
           {Lexicon("en")}? ('loop') | 
           {Lexicon("fr")}? ('boucle') | 
           {Lexicon("he")}? ('loop') | 
           {Lexicon("nl")}? ('lus') | 
           {Lexicon("ru")}? ('повторять') ;
NAMESPACE: 
           {Lexicon("bg")}? ('namespace') | 
           {Lexicon("de")}? ('namespace') | 
           {Lexicon("en")}? ('namespace') | 
           {Lexicon("fr")}? ('namespace') | 
           {Lexicon("he")}? ('namespace') | 
           {Lexicon("nl")}? ('namespace') | 
           {Lexicon("ru")}? ('namespace') ;
OFFSET: 
           {Lexicon("bg")}? ('offset') | 
           {Lexicon("de")}? ('offset') | 
           {Lexicon("en")}? ('offset') | 
           {Lexicon("fr")}? ('offset') | 
           {Lexicon("he")}? ('offset') | 
           {Lexicon("ru")}? ('offset') ;
OUT: 
           {Lexicon("bg")}? ('out') | 
           {Lexicon("de")}? ('depuis') | 
           {Lexicon("en")}? ('out') | 
           {Lexicon("fr")}? ('depuis') | 
           {Lexicon("he")}? ('out') | 
           {Lexicon("nl")}? ('out') | 
           {Lexicon("ru")}? ('out') ;
PAD: 
           {Lexicon("bg")}? ('pad') | 
           {Lexicon("de")}? ('pad') | 
           {Lexicon("en")}? ('pad') | 
           {Lexicon("fr")}? ('pad') | 
           {Lexicon("he")}? ('pad') | 
           {Lexicon("ru")}? ('pad') ;
POINTER: 
           {Lexicon("bg")}? ('pointer' | 'ptr') | 
           {Lexicon("de")}? ('pointer') | 
           {Lexicon("en")}? ('pointer' | 'ptr') | 
           {Lexicon("fr")}? ('pointer') | 
           {Lexicon("he")}? ('pointer') | 
           {Lexicon("ru")}? ('pointer' | 'ptr') ;
PRIVATE: 
           {Lexicon("bg")}? ('private') | 
           {Lexicon("de")}? ('privé') | 
           {Lexicon("en")}? ('private') | 
           {Lexicon("fr")}? ('privé') | 
           {Lexicon("he")}? ('private') | 
           {Lexicon("nl")}? ('private') | 
           {Lexicon("ru")}? ('private') ;
PROCEDURE: 
           {Lexicon("bg")}? ('процедура') | 
           {Lexicon("de")}? ('routine') | 
           {Lexicon("en")}? ('procedure' | 'proc') | 
           {Lexicon("fr")}? ('procédé') | 
           {Lexicon("he")}? ('procedure') | 
           {Lexicon("nl")}? ('procedure') | 
           {Lexicon("ru")}? ('процедура') ;
PUBLIC: 
           {Lexicon("bg")}? ('public') | 
           {Lexicon("de")}? ('öffentlich') | 
           {Lexicon("en")}? ('public') | 
           {Lexicon("fr")}? ('public') | 
           {Lexicon("he")}? ('public') | 
           {Lexicon("nl")}? ('publiek') | 
           {Lexicon("ru")}? ('public') ;
READONLY: 
           {Lexicon("bg")}? ('readonly') | 
           {Lexicon("de")}? ('readonly') | 
           {Lexicon("en")}? ('readonly') | 
           {Lexicon("fr")}? ('readonly') | 
           {Lexicon("he")}? ('readonly') | 
           {Lexicon("nl")}? ('alleen lezen') | 
           {Lexicon("ru")}? ('readonly') ;
REF: 
           {Lexicon("bg")}? ('ref') | 
           {Lexicon("de")}? ('ref') | 
           {Lexicon("en")}? ('ref') | 
           {Lexicon("fr")}? ('ref') | 
           {Lexicon("he")}? ('ref') | 
           {Lexicon("nl")}? ('referentie') | 
           {Lexicon("ru")}? ('ref') ;
RELOOP: 
           {Lexicon("bg")}? ('reloop') | 
           {Lexicon("de")}? ('reloop') | 
           {Lexicon("en")}? ('reloop') | 
           {Lexicon("fr")}? ('reloop') | 
           {Lexicon("ru")}? ('reloop') ;
RETURN: 
           {Lexicon("bg")}? ('возврат') | 
           {Lexicon("de")}? ('rückkehr') | 
           {Lexicon("en")}? ('return') | 
           {Lexicon("fr")}? ('retour') | 
           {Lexicon("he")}? ('return') | 
           {Lexicon("nl")}? ('terug') | 
           {Lexicon("ru")}? ('возврат') ;
RETURNS: 
           {Lexicon("bg")}? ('returns') | 
           {Lexicon("de")}? ('rückkehrs') | 
           {Lexicon("en")}? ('returns') | 
           {Lexicon("fr")}? ('retours') | 
           {Lexicon("ru")}? ('returns') ;
RETURNON: 
           {Lexicon("bg")}? ('returnon') | 
           {Lexicon("de")}? ('retour_si') | 
           {Lexicon("en")}? ('returnon') | 
           {Lexicon("fr")}? ('retour_si') | 
           {Lexicon("he")}? ('returnon') | 
           {Lexicon("nl")}? ('terug bij') | 
           {Lexicon("ru")}? ('returnon') ;
SINGLET: 
           {Lexicon("bg")}? ('singlet') | 
           {Lexicon("de")}? ('singlet') | 
           {Lexicon("en")}? ('singlet') | 
           {Lexicon("fr")}? ('singlet') | 
           {Lexicon("he")}? ('singlet') | 
           {Lexicon("nl")}? ('singlet') | 
           {Lexicon("ru")}? ('singlet') ;
STATIC: 
           {Lexicon("bg")}? ('static') | 
           {Lexicon("de")}? ('static') | 
           {Lexicon("en")}? ('static') | 
           {Lexicon("fr")}? ('static') | 
           {Lexicon("he")}? ('static') | 
           {Lexicon("nl")}? ('statisch') | 
           {Lexicon("ru")}? ('static') ;
STRING: 
           {Lexicon("bg")}? ('string') | 
           {Lexicon("de")}? ('text') | 
           {Lexicon("en")}? ('string') | 
           {Lexicon("fr")}? ('chaîne') | 
           {Lexicon("he")}? ('string') | 
           {Lexicon("nl")}? ('string') | 
           {Lexicon("ru")}? ('string') ;
STRUCTURE: 
           {Lexicon("bg")}? ('structure' | 'struct') | 
           {Lexicon("de")}? ('structure') | 
           {Lexicon("en")}? ('structure' | 'struct') | 
           {Lexicon("fr")}? ('structure') | 
           {Lexicon("he")}? ('structure') | 
           {Lexicon("nl")}? ('structuur') | 
           {Lexicon("ru")}? ('structure' | 'struct') ;
THEN: 
           {Lexicon("bg")}? ('тогава') | 
           {Lexicon("de")}? ('dann') | 
           {Lexicon("en")}? ('then') | 
           {Lexicon("fr")}? ('ensuite') | 
           {Lexicon("ru")}? ('то') ;
TO: 
           {Lexicon("bg")}? ('to') | 
           {Lexicon("de")}? ('to') | 
           {Lexicon("en")}? ('to') | 
           {Lexicon("fr")}? ('to') | 
           {Lexicon("he")}? ('to') | 
           {Lexicon("nl")}? ('tot') | 
           {Lexicon("ru")}? ('to') ;
TYPE: 
           {Lexicon("bg")}? ('type') | 
           {Lexicon("de")}? ('art') | 
           {Lexicon("en")}? ('type') | 
           {Lexicon("fr")}? ('type') | 
           {Lexicon("he")}? ('type') | 
           {Lexicon("nl")}? ('type') | 
           {Lexicon("ru")}? ('type') ;
UNALIGNED: 
           {Lexicon("bg")}? ('unaligned') | 
           {Lexicon("de")}? ('unaligned') | 
           {Lexicon("en")}? ('unaligned') | 
           {Lexicon("fr")}? ('unaligned') | 
           {Lexicon("he")}? ('unaligned') | 
           {Lexicon("ru")}? ('unaligned') ;
UNTIL: 
           {Lexicon("bg")}? ('пока') | 
           {Lexicon("de")}? ('bis') | 
           {Lexicon("en")}? ('until') | 
           {Lexicon("fr")}? ('avant') | 
           {Lexicon("he")}? ('until') | 
           {Lexicon("nl")}? ('totdat') | 
           {Lexicon("ru")}? ('пока') ;
USING: 
           {Lexicon("bg")}? ('using') | 
           {Lexicon("de")}? ('using') | 
           {Lexicon("en")}? ('using') | 
           {Lexicon("fr")}? ('using') | 
           {Lexicon("he")}? ('using') | 
           {Lexicon("nl")}? ('gebruikende') | 
           {Lexicon("ru")}? ('using') ;
WHILE: 
           {Lexicon("bg")}? ('докато') | 
           {Lexicon("de")}? ('solang') | 
           {Lexicon("en")}? ('while') | 
           {Lexicon("fr")}? ('tandis que') | 
           {Lexicon("he")}? ('כלעוד') | 
           {Lexicon("nl")}? ('zolang') | 
           {Lexicon("ru")}? ('в то время как') ;
VARIABLE: 
           {Lexicon("bg")}? ('variable') | 
           {Lexicon("de")}? ('variable') | 
           {Lexicon("en")}? ('variable') | 
           {Lexicon("fr")}? ('variable') | 
           {Lexicon("ru")}? ('variable') ;
VARYING: 
           {Lexicon("bg")}? ('varying') | 
           {Lexicon("de")}? ('varying') | 
           {Lexicon("en")}? ('varying') | 
           {Lexicon("fr")}? ('varying') | 
           {Lexicon("he")}? ('varying') | 
           {Lexicon("nl")}? ('varierend') | 
           {Lexicon("ru")}? ('varying') ;
YIELD: 
           {Lexicon("bg")}? ('yield') | 
           {Lexicon("de")}? ('abtreten') | 
           {Lexicon("en")}? ('yield') | 
           {Lexicon("fr")}? ('donner') | 
           {Lexicon("he")}? ('yield') | 
           {Lexicon("nl")}? ('opbrengst') | 
           {Lexicon("ru")}? ('yield') ;

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
