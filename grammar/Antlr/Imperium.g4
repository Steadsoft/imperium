/*------------------------------------------------------------------------------*/
/*        This is the grammar for the Imperium programming language 	 		      */
/*------------------------------------------------------------------------------*/
/* It's based primarily on the PL/I grammar because that has no reserved words. */
/* This grammar supports keywords for multiple cultures, this is done by having */
/* a JSON lexicon file that defines the literal text for each keyword for each  */
/* language.	 																                                  */
/*			 																	                                      */
/* No reserved words means an identifier can be the same as a keyword and the   */
/* text will still parse correctly. We do this to facilitate the addition of    */
/* new keywords in future releases of the language.                             */
/*										 										                                      */
/* This also means that if an identifier happens to also match a keyword in  	  */
/* one of the other supported keyword lexicon languages, then the text will     */
/* nevertheless compile without any issues.                                     */
/*------------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------*/
/* Keyword translation info kindly contributed by:                           	  */
/* English (en) - Hugh Gleaves                                               	  */
/* Dutch (nl)   - Gabor de Mooij (https://github.com/gabordemooij/citrine)   	  */
/*------------------------------------------------------------------------------*/

grammar Imperium; // Latin for "control"

@lexer::members 
{    
	// This code MUST compile for both Java and C#
  // Some constructs here require support code be
	// defined as C# partial and extension classes.
    
	private String KeywordLexiconCode = "en";

	public Boolean Lexicon(String Code)
	{
		return Code == KeywordLexiconCode;
	}

	public void SetLexicon(String Code)
	{
		KeywordLexiconCode = Code;
	}

	public void ReverseLexeme()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(getText());
		builder.reverse();
		setText(builder.toString());
	}
}

translation_unit
  :	BYTE_ORDER_MARK? namespace* | stmt_block? EOF;

namespace
  : namespace_stmt stmt_block? namespace_end
  | namespace_stmt namespace namespace_end
  ;

namespace_stmt
  : NAMESPACE identifier (DOT identifier)* SEMICOLON
  ;

namespace_end
  : END NAMESPACE? SEMICOLON;

procedure
  :	procedure_stmt stmt_block? procedure_end
  | function_stmt  stmt_block? function_end
  ;

procedure_stmt
  : PROCEDURE identifier proc_descriptor SEMICOLON 
  ;

function_stmt
  : FUNCTION identifier func_descriptor SEMICOLON 
  ;

procedure_end
  : END PROCEDURE? SEMICOLON
  ;

function_end
  : END FUNCTION? SEMICOLON
  ;

proc_descriptor
  :
	parameter_name_commalist? 
    ( 
      (coprocedure_specifier?)
		| ((coprocedure_specifier | handler_specifier)? RECURSIVE?)
    );

func_descriptor
  :
	parameter_name_commalist? 
    ( 
      (returns_descriptor coprocedure_specifier?)
		| ((coprocedure_specifier | handler_specifier)? RECURSIVE? returns_descriptor)
    );

returns_descriptor
  :	RETURNS data_attribute;
	// consider using keyword 'is' instead and forcing it to be right after the params...

stmt_block
  : nonexecutable_stmt+ 
  | executable_stmt+
  | nonexecutable_stmt+ executable_stmt+
  ;

terminator
  : SEMICOLON;

label_stmt
  : LABEL (LPAR decimal_literal RPAR)? 
  ;

nonexecutable_stmt
	: declare_stmt	  # DCL
	| type_stmt		    # DEF
  ;
 
executable_stmt
  : label_stmt      # LABEL
  | assign_stmt	    # ASSIGN
	| call_stmt		    # CALL
	| goto_stmt		    # GOTO
	| procedure       # PROC
	| return_stmt	    # RET
	| if_stmt		      # IF
	| loop_stmt		    # LOOP
  | select_stmt     # SELECT
	| endloop_stmt    # LEAVE
	| reloop_stmt     # AGAIN 
  | null_stmt       # NULL
	;

null_stmt
  : SEMICOLON
  ;

assign_stmt
  : reference EQUALS expression SEMICOLON
  ;

reference
  :	reference RARROW basic_reference arguments_list?	# PTR_REF
	| basic_reference arguments_list?					          # BASIC_REF;

arguments
  : LPAR subscript_commalist+ RPAR;

arguments_list
  : arguments+;

basic_reference
  : structure_qualification_list? identifier;

structure_qualification
  : identifier arguments? DOT;

structure_qualification_list
  : structure_qualification+;

subscript
  : expression;

subscript_commalist
  : subscript (COMMA subscript)*;

expression
  : expression_10 
  | expression SCOR expression_9;

expression_10
  : expression_9 
  | expression_10 SCAND expression_9
  ;

expression_9
  :	expression_8
	| expression_9 (OR | NOT) expression_8
  ;

expression_8
  : expression_7 
  | expression_8 AND expression_7
  ;

expression_7
  :	expression_6
	| expression_7 comparison_operator expression_6
  ;

expression_6
  : expression_5 
  | expression_6 CONC expression_5
  ;

expression_5
  : expression_4
  | expression_5 (L_ROTATE | R_ROTATE) expression_4
  ;

expression_4
  :	expression_3
	| expression_4 (PLUS | MINUS) expression_3
  ;

expression_3
  :	expression_2
	| expression_3 (TIMES | DIVIDE) expression_2
  ;

expression_2
  :	primitive_expression
	| prefix_expression
	| parenthesized_expression
	| expression_1
  ;

expression_1
  : (primitive_expression | parenthesized_expression) POWER expression_2;

prefix_expression
  : prefix_operator expression_2;

parenthesized_expression
  : LPAR expression RPAR;

primitive_expression
  : numeric_literal 
  | string_literal 
  | reference;

prefix_operator
  : PLUS 
  | MINUS 
  | NOT;

comparison_operator
  : GT
	| GTE
	| EQUALS
	| LT
	| LTE
	| NGT
	| NE
	| NLT;

shift_operator
  : R_LOG_SHIFT 
  | L_LOG_SHIFT 
  | R_ART_SHIFT ;

identifier
  :	keyword			# KEYWD
	| IDENTIFIER	# identifier_IDENTIFIER;

call_stmt
  : CALL reference SEMICOLON;

goto_stmt
	:	(GOTO IDENTIFIER LPAR expression RPAR) SEMICOLON
	| (GOTO reference) SEMICOLON
  ;

endloop_stmt
  : ENDLOOP IDENTIFIER? ;

reloop_stmt
  : RELOOP IDENTIFIER? ;

declare_stmt
  : (DECLARE | ARGUMENT) identifier AS identifier SEMICOLON
  | (DECLARE | ARGUMENT) identifier type_info SEMICOLON
  ;

type_info
  : dimension_suffix? attribute*;

dimension_suffix
  : LPAR bound_pair_commalist RPAR;

bound_pair
  : (lower_bound COLON)? upper_bound 
  | TIMES;

bound_pair_commalist
  : bound_pair (COMMA bound_pair)*;

// See page 208 PL/I Subset G standard. Lower bound must be <= upper (but this is not a grammar issue,
// just a note for us)

lower_bound
  : expression;

upper_bound
  : expression;

attribute
    : (
		  data_attribute
		    | AUTOMATIC
		    | BUILTIN
		    | STATIC
		    | VARIABLE
		    | based
		    | defined
	    );

data_attribute
  : (BINARY (precision)?)				# BIN
	| (DECIMAL (precision)?)			# DEC
	| POINTER							        # PTR
	| (BIT max_length)					  # BIT
	| CHARACTER							      # CHAR
	| (STRING max_length)				  # STR
	| ENTRY								        # ENT
	| FIXED								        # FIX
	| FLOAT								        # FLT
	| OFFSET							        # OFF
	| VARYING							        # VNG
	| COROUTINE							      # COR
	| COFUNCTION						      # COF
	| BUILTIN							        # BLTN
	| INTRINSIC							      # INTR
	| identifier						      # IDENT; // a user defined type would match here. 

precision
  : LPAR number_of_digits (COMMA scale_factor)? RPAR;

number_of_digits
  : (decimal_literal | identifier);

scale_factor
  : (decimal_literal | identifier);

max_length
  : LPAR (decimal_literal | identifier) RPAR;

based
  : BASED (LPAR reference RPAR)?;

defined
  : DEFINED (LPAR reference RPAR)?;


coprocedure_specifier
  : (COROUTINE | COFUNCTION);

handler_specifier
  : INTERRUPT ;

parameter_name_commalist
: LPAR identifier (COMMA identifier)* RPAR;

return_stmt
  : RETURN (LPAR expression RPAR)? SEMICOLON;

if_stmt
  :	then_clause stmt_block else_clause? if_end
	| then_clause stmt_block elif_clause+ if_end
  ;

if_end
  : END IF? SEMICOLON
  ;  

then_clause
  : IF expression THEN;

else_clause
  : ELSE stmt_block;

elif_clause
  :	ELIF expression THEN stmt_block else_clause?;

loop_stmt
  :	LOOP  stmt_block loop_end                            # BASIC_LOOP
	| LOOP  while_option until_option? stmt_block loop_end # WHILE_UNTIL
	| LOOP  until_option while_option? stmt_block loop_end # UNTIL_WHILE;

loop_end
  : END LOOP? SEMICOLON
  ;

while_option
  : WHILE LPAR expression RPAR;

until_option
  : UNTIL LPAR expression RPAR;

select_stmt
  : select_clause when_clause* otherwise_clause? select_end
  ;

select_end
  : END SELECT? SEMICOLON
  ;

select_clause
  : SELECT (LPAR expression RPAR)? // PL/I has a SEMICOLON specfied here after the (expression), but there's no grammatical need so I'm dispensing with it
  ;

when_clause
  : WHEN (ANY | ALL)? LPAR (expression (COMMA expression)*) RPAR stmt_block
  ;

otherwise_clause
  : ELSE stmt_block
  ;

type_stmt // defines a type, like a structure
  : TYPE identifier (enum_type | struct_type)
  ;

enum_type
  : ENUM (binary_enum | decimal_enum | string_enum | bit_enum)? COMMA enum_body END ENUM? SEMICOLON
  ;

binary_enum
  : (BINARY LPAR decimal_literal RPAR)
  ;

decimal_enum
  : (DECIMAL LPAR decimal_literal RPAR)
  ;

string_enum
  : (STRING LPAR decimal_literal RPAR)
  ;

bit_enum
  : (BIT LPAR decimal_literal RPAR)
  ;

enum_body
  : identifier (EQUALS enum_literal)? (COMMA identifier (EQUALS enum_literal)?)*
  ;

enum_literal
  : (decimal_literal | string_literal | binary_literal)
  ;

struct_type
  : STRUCTURE SEMICOLON
  ;

string_literal
  : STRING_LITERAL_3 
  | STRING_LITERAL_2 
  | STRING_LITERAL_1;

numeric_literal
  :	binary_literal
	| octal_literal
	| hexadecimal_literal
	| decimal_literal;

hexadecimal_literal
  : (HEXADECIMAL_PATTERN);

octal_literal
  : (OCTAL_PATTERN);

decimal_literal
  : (DECIMAL_PATTERN);

binary_literal
  : (BINARY_PATTERN);

// LEXER TOKEN DEFINITIONS

COMMENT:          '/*' (COMMENT | .)*? '*/' -> channel(2);
LINE_COMMENT:     '//' .*? '\n' -> channel(HIDDEN);
WS:               (' ')+ -> skip;
NEWLINE:          [\r\n]+ -> skip;
TAB:              ('\t')+ -> skip;
STRING_LITERAL_3: TRIQUOTE (.)*? TRIQUOTE;
STRING_LITERAL_2: DIQUOTE  (.)*? DIQUOTE;
STRING_LITERAL_1: QUOTE    (.)*? QUOTE;
BYTE_ORDER_MARK: '\u00EF' '\u00BB' '\u00BF';

/* ---------------------------------------------------------------------------------------------------- */
/* These Antlr4 keyword token definitions were generated by a utility on 1/21/2023 at 11:42 AM          */
/* Input:  D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\imperium.keywords.json                        */
/* Output: D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\ImperiumKeywords.txt                          */
/*                                                                                                      */
/* Number of languages 8.                                                                               */
/* Expected number of keywords per language 71.                                                         */
/* ---------------------------------------------------------------------------------------------------- */

keyword:
    ALIAS
  | ALIGNED
  | ALL
  | ANY
  | ARGUMENT
  | AS
  | AUTOMATIC
  | BASED
  | BINARY
  | BIT
  | BOOLEAN
  | BUILTIN
  | BY
  | BYPASS
  | CALL
  | CHARACTER
  | COFUNCTION
  | COROUTINE
  | DECIMAL
  | DECLARE
  | DEFINED
  | ELIF
  | ELSE
  | END
  | ENDLOOP
  | ENTRY
  | ENUM
  | FIXED
  | FLOAT
  | FUNCTION
  | GOTO
  | IF
  | INC
  | INCLUDE
  | INTERNAL
  | INTERRUPT
  | INTRINSIC
  | LANGUAGE
  | LOOP
  | NAMESPACE
  | OFFSET
  | OTHERWISE
  | OUT
  | PAD
  | POINTER
  | PRIVATE
  | PROCEDURE
  | PUBLIC
  | READONLY
  | RECURSIVE
  | REF
  | RELOOP
  | RETURN
  | RETURNON
  | RETURNS
  | SELECT
  | SINGLET
  | STATIC
  | STRING
  | STRUCTURE
  | THEN
  | TO
  | TYPE
  | UNALIGNED
  | UNTIL
  | USING
  | VARIABLE
  | VARYING
  | WHEN
  | WHILE
  | YIELD
  ;

ALIAS: 
           {Lexicon("en")}? ('alias')             ;
ALIGNED: 
           {Lexicon("bg")}? ('выровнены')         | 
           {Lexicon("da")}? ('justeret')          | 
           {Lexicon("de")}? ('ausgerichtet')      | 
           {Lexicon("en")}? ('aligned')           | 
           {Lexicon("fr")}? ('aligné')            | 
           {Lexicon("he")}? ('aligned')           | 
           {Lexicon("ru")}? ('выровнены')         ;
ALL: 
           {Lexicon("en")}? ('all')               ;
ANY: 
           {Lexicon("en")}? ('any')               ;
ARGUMENT: 
           {Lexicon("bg")}? ('argument'           | 'arg') | 
           {Lexicon("da")}? ('argument'           | 'arg') | 
           {Lexicon("de")}? ('argument')          | 
           {Lexicon("en")}? ('argument'           | 'arg') | 
           {Lexicon("fr")}? ('argument')          | 
           {Lexicon("he")}? ('argument')          | 
           {Lexicon("nl")}? ('argument')          | 
           {Lexicon("ru")}? ('argument'           | 'arg') ;
AS: 
           {Lexicon("en")}? ('as')                ;
AUTOMATIC: 
           {Lexicon("bg")}? ('автоматический'     | 'auto') | 
           {Lexicon("da")}? ('automatisk'         | 'auto') | 
           {Lexicon("de")}? ('automatisch'        | 'auto') | 
           {Lexicon("en")}? ('automatic'          | 'auto') | 
           {Lexicon("fr")}? ('automatique'        | 'auto') | 
           {Lexicon("ru")}? ('автоматический'     | 'auto') ;
BASED: 
           {Lexicon("bg")}? ('based')             | 
           {Lexicon("da")}? ('based')             | 
           {Lexicon("de")}? ('based')             | 
           {Lexicon("en")}? ('based')             | 
           {Lexicon("fr")}? ('based')             | 
           {Lexicon("ru")}? ('based')             ;
BINARY: 
           {Lexicon("bg")}? ('двоичен')           | 
           {Lexicon("da")}? ('binær'              | 'bin') | 
           {Lexicon("de")}? ('binär')             | 
           {Lexicon("en")}? ('binary'             | 'bin') | 
           {Lexicon("fr")}? ('binaire')           | 
           {Lexicon("he")}? ('binary')            | 
           {Lexicon("nl")}? ('binair')            | 
           {Lexicon("ru")}? ('бинарный'           | 'bin') ;
BIT: 
           {Lexicon("bg")}? ('бит')               | 
           {Lexicon("da")}? ('bit')               | 
           {Lexicon("de")}? ('bit')               | 
           {Lexicon("en")}? ('bit')               | 
           {Lexicon("fr")}? ('bit')               | 
           {Lexicon("ru")}? ('бит')               ;
BOOLEAN: 
           {Lexicon("bg")}? ('boolean'            | 'bool') | 
           {Lexicon("da")}? ('boolesk'            | 'bool') | 
           {Lexicon("de")}? ('boolesch')          | 
           {Lexicon("en")}? ('boolean'            | 'bool') | 
           {Lexicon("fr")}? ('booléenne')         | 
           {Lexicon("he")}? ('boolean')           | 
           {Lexicon("nl")}? ('boolean')           | 
           {Lexicon("ru")}? ('boolean'            | 'bool') ;
BUILTIN: 
           {Lexicon("bg")}? ('builtin')           | 
           {Lexicon("da")}? ('builtin')           | 
           {Lexicon("de")}? ('eingebaut')         | 
           {Lexicon("en")}? ('builtin')           | 
           {Lexicon("fr")}? ('intégré')           | 
           {Lexicon("he")}? ('builtin')           | 
           {Lexicon("nl")}? ('ingebouwd')         | 
           {Lexicon("ru")}? ('builtin')           ;
BY: 
           {Lexicon("bg")}? ('by')                | 
           {Lexicon("da")}? ('by')                | 
           {Lexicon("de")}? ('by')                | 
           {Lexicon("en")}? ('by')                | 
           {Lexicon("fr")}? ('by')                | 
           {Lexicon("he")}? ('by')                | 
           {Lexicon("nl")}? ('door')              | 
           {Lexicon("ru")}? ('by')                ;
BYPASS: 
           {Lexicon("bg")}? ('bypass')            | 
           {Lexicon("da")}? ('bypass')            | 
           {Lexicon("de")}? ('bypass')            | 
           {Lexicon("en")}? ('bypass')            | 
           {Lexicon("fr")}? ('bypass')            | 
           {Lexicon("ru")}? ('bypass')            ;
CALL: 
           {Lexicon("bg")}? ('вызов')             | 
           {Lexicon("da")}? ('påberåbe sig')      | 
           {Lexicon("de")}? ('aufrufen')          | 
           {Lexicon("en")}? ('call')              | 
           {Lexicon("fr")}? ('appeler')           | 
           {Lexicon("he")}? ('call')              | 
           {Lexicon("nl")}? ('aanroepen')         | 
           {Lexicon("ru")}? ('вызов')             ;
CHARACTER: 
           {Lexicon("bg")}? ('character'          | 'char') | 
           {Lexicon("da")}? ('character'          | 'char') | 
           {Lexicon("de")}? ('character')         | 
           {Lexicon("en")}? ('character'          | 'char') | 
           {Lexicon("fr")}? ('character')         | 
           {Lexicon("ru")}? ('character'          | 'char') ;
COFUNCTION: 
           {Lexicon("bg")}? ('cofunction')        | 
           {Lexicon("da")}? ('cofunction')        | 
           {Lexicon("de")}? ('cofunction')        | 
           {Lexicon("en")}? ('cofunction')        | 
           {Lexicon("fr")}? ('cofunction')        | 
           {Lexicon("ru")}? ('cofunction')        ;
COROUTINE: 
           {Lexicon("bg")}? ('coroutine')         | 
           {Lexicon("da")}? ('coroutine')         | 
           {Lexicon("de")}? ('coroutine')         | 
           {Lexicon("en")}? ('coroutine')         | 
           {Lexicon("fr")}? ('coroutine')         | 
           {Lexicon("he")}? ('coroutine')         | 
           {Lexicon("nl")}? ('co routine')        | 
           {Lexicon("ru")}? ('coroutine')         ;
DECIMAL: 
           {Lexicon("bg")}? ('decimal'            | 'dec') | 
           {Lexicon("da")}? ('decimal'            | 'dec') | 
           {Lexicon("de")}? ('dezimal')           | 
           {Lexicon("en")}? ('decimal'            | 'dec') | 
           {Lexicon("fr")}? ('décimal')           | 
           {Lexicon("he")}? ('decimal')           | 
           {Lexicon("nl")}? ('decimaal')          | 
           {Lexicon("ru")}? ('decimal'            | 'dec') ;
DECLARE: 
           {Lexicon("bg")}? ('обявявам')          | 
           {Lexicon("da")}? ('erklære'            | 'dcl') | 
           {Lexicon("de")}? ('deklarieren')       | 
           {Lexicon("en")}? ('declare'            | 'dcl') | 
           {Lexicon("fr")}? ('déclarer')          | 
           {Lexicon("he")}? ('declare')           | 
           {Lexicon("nl")}? ('declareer')         | 
           {Lexicon("ru")}? ('объявлять'          | 'dcl') ;
DEFINE: 
           {Lexicon("bg")}? ('define'             | 'def') | 
           {Lexicon("da")}? ('define'             | 'def') | 
           {Lexicon("de")}? ('define')            | 
           {Lexicon("fr")}? ('define')            | 
           {Lexicon("he")}? ('define')            | 
           {Lexicon("ru")}? ('define'             | 'def') ;
DEFINED: 
           {Lexicon("bg")}? ('defined')           | 
           {Lexicon("da")}? ('defined')           | 
           {Lexicon("de")}? ('defined')           | 
           {Lexicon("en")}? ('defined')           | 
           {Lexicon("fr")}? ('defined')           | 
           {Lexicon("ru")}? ('defined')           ;
ELIF: 
           {Lexicon("bg")}? ('elif')              | 
           {Lexicon("da")}? ('elif')              | 
           {Lexicon("de")}? ('elif')              | 
           {Lexicon("en")}? ('elif')              | 
           {Lexicon("fr")}? ('elif')              | 
           {Lexicon("ru")}? ('elif')              ;
ELSE: 
           {Lexicon("bg")}? ('друго')             | 
           {Lexicon("da")}? ('andet')             | 
           {Lexicon("de")}? ('anders')            | 
           {Lexicon("en")}? ('else')              | 
           {Lexicon("fr")}? ('autre')             | 
           {Lexicon("he")}? ('אחרת')              | 
           {Lexicon("ru")}? ('еще')               ;
END: 
           {Lexicon("bg")}? ('конец')             | 
           {Lexicon("da")}? ('ende')              | 
           {Lexicon("de")}? ('ende')              | 
           {Lexicon("en")}? ('end')               | 
           {Lexicon("fr")}? ('fin')               | 
           {Lexicon("he")}? ('end')               | 
           {Lexicon("nl")}? ('einde')             | 
           {Lexicon("ru")}? ('конец')             ;
ENDLOOP: 
           {Lexicon("bg")}? ('endloop')           | 
           {Lexicon("da")}? ('endloop')           | 
           {Lexicon("de")}? ('ende wiederholen')  | 
           {Lexicon("en")}? ('endloop')           | 
           {Lexicon("fr")}? ('endloop')           | 
           {Lexicon("ru")}? ('endloop')           ;
ENTRY: 
           {Lexicon("bg")}? ('entry')             | 
           {Lexicon("da")}? ('entry')             | 
           {Lexicon("de")}? ('entry')             | 
           {Lexicon("en")}? ('entry')             | 
           {Lexicon("fr")}? ('entry')             | 
           {Lexicon("ru")}? ('entry')             ;
ENUM: 
           {Lexicon("bg")}? ('enum')              | 
           {Lexicon("da")}? ('enum')              | 
           {Lexicon("de")}? ('enum')              | 
           {Lexicon("en")}? ('enum')              | 
           {Lexicon("fr")}? ('enum')              | 
           {Lexicon("he")}? ('enum')              | 
           {Lexicon("nl")}? ('opsomming')         | 
           {Lexicon("ru")}? ('enum')              ;
FIXED: 
           {Lexicon("bg")}? ('fixed')             | 
           {Lexicon("da")}? ('fixed')             | 
           {Lexicon("de")}? ('stationär')         | 
           {Lexicon("en")}? ('fixed')             | 
           {Lexicon("fr")}? ('fixe')              | 
           {Lexicon("he")}? ('fixed')             | 
           {Lexicon("nl")}? ('fixed')             | 
           {Lexicon("ru")}? ('fixed')             ;
FLOAT: 
           {Lexicon("bg")}? ('float')             | 
           {Lexicon("da")}? ('float')             | 
           {Lexicon("de")}? ('flottant')          | 
           {Lexicon("en")}? ('float')             | 
           {Lexicon("fr")}? ('flottant')          | 
           {Lexicon("he")}? ('float')             | 
           {Lexicon("nl")}? ('float')             | 
           {Lexicon("ru")}? ('float')             ;
FUNCTION: 
           {Lexicon("bg")}? ('function'           | 'func') | 
           {Lexicon("da")}? ('function'           | 'func') | 
           {Lexicon("de")}? ('fonction')          | 
           {Lexicon("en")}? ('function'           | 'func') | 
           {Lexicon("fr")}? ('fonction')          | 
           {Lexicon("he")}? ('function')          | 
           {Lexicon("nl")}? ('functie')           | 
           {Lexicon("ru")}? ('function'           | 'func') ;
GOTO: 
           {Lexicon("bg")}? ('перейти к')         | 
           {Lexicon("da")}? ('goto'               | 'go to') | 
           {Lexicon("de")}? ('gehen')             | 
           {Lexicon("en")}? ('goto'               | 'go to') | 
           {Lexicon("fr")}? ('aller à')           | 
           {Lexicon("he")}? ('goto')              | 
           {Lexicon("nl")}? ('ga')                | 
           {Lexicon("ru")}? ('перейти к')         ;
IF: 
           {Lexicon("bg")}? ('ако')               | 
           {Lexicon("da")}? ('hvis')              | 
           {Lexicon("de")}? ('wenn')              | 
           {Lexicon("en")}? ('if')                | 
           {Lexicon("fr")}? ('si')                | 
           {Lexicon("he")}? ('אם')                | 
           {Lexicon("nl")}? ('als')               | 
           {Lexicon("ru")}? ('если')              ;
INC: 
           {Lexicon("bg")}? ('inc')               | 
           {Lexicon("da")}? ('inc')               | 
           {Lexicon("de")}? ('inc')               | 
           {Lexicon("en")}? ('inc')               | 
           {Lexicon("fr")}? ('inc')               | 
           {Lexicon("ru")}? ('inc')               ;
INCLUDE: 
           {Lexicon("bg")}? ('include')           | 
           {Lexicon("da")}? ('include')           | 
           {Lexicon("de")}? ('enthalten')         | 
           {Lexicon("en")}? ('include')           | 
           {Lexicon("fr")}? ('comprendre')        | 
           {Lexicon("ru")}? ('include')           ;
INTERNAL: 
           {Lexicon("bg")}? ('internal')          | 
           {Lexicon("da")}? ('internal')          | 
           {Lexicon("de")}? ('intern')            | 
           {Lexicon("en")}? ('internal')          | 
           {Lexicon("fr")}? ('interne')           | 
           {Lexicon("he")}? ('internal')          | 
           {Lexicon("nl")}? ('intern')            | 
           {Lexicon("ru")}? ('internal')          ;
INTERRUPT: 
           {Lexicon("bg")}? ('interrupt')         | 
           {Lexicon("da")}? ('interrupt')         | 
           {Lexicon("de")}? ('unterbrechen')      | 
           {Lexicon("en")}? ('interrupt')         | 
           {Lexicon("fr")}? ('interrompre')       | 
           {Lexicon("he")}? ('interrupt')         | 
           {Lexicon("nl")}? ('interrupt')         | 
           {Lexicon("ru")}? ('interrupt')         ;
INTRINSIC: 
           {Lexicon("bg")}? ('intrinsic')         | 
           {Lexicon("da")}? ('intrinsic')         | 
           {Lexicon("de")}? ('intrinsisch')       | 
           {Lexicon("en")}? ('intrinsic')         | 
           {Lexicon("fr")}? ('intrinsic')         | 
           {Lexicon("ru")}? ('intrinsic')         ;
LANGUAGE: 
           {Lexicon("bg")}? ('lingua')            | 
           {Lexicon("da")}? ('lingua')            | 
           {Lexicon("de")}? ('lingua')            | 
           {Lexicon("en")}? ('lingua')            | 
           {Lexicon("fr")}? ('lingua')            | 
           {Lexicon("he")}? ('lingua')            | 
           {Lexicon("ru")}? ('lingua')            ;
LOOP: 
           {Lexicon("bg")}? ('повторете')         | 
           {Lexicon("da")}? ('gentage')           | 
           {Lexicon("de")}? ('wiederholen')       | 
           {Lexicon("en")}? ('loop')              | 
           {Lexicon("fr")}? ('boucle')            | 
           {Lexicon("he")}? ('loop')              | 
           {Lexicon("nl")}? ('lus')               | 
           {Lexicon("ru")}? ('повторять')         ;
NAMESPACE: 
           {Lexicon("bg")}? ('namespace')         | 
           {Lexicon("da")}? ('namespace')         | 
           {Lexicon("de")}? ('namespace')         | 
           {Lexicon("en")}? ('namespace')         | 
           {Lexicon("fr")}? ('namespace')         | 
           {Lexicon("he")}? ('namespace')         | 
           {Lexicon("nl")}? ('namespace')         | 
           {Lexicon("ru")}? ('namespace')         ;
OFFSET: 
           {Lexicon("bg")}? ('offset'             | 'ofx') | 
           {Lexicon("da")}? ('offset'             | 'ofx') | 
           {Lexicon("de")}? ('offset'             | 'ofx') | 
           {Lexicon("en")}? ('offset'             | 'ofx') | 
           {Lexicon("fr")}? ('offset'             | 'ofx') | 
           {Lexicon("he")}? ('offset'             | 'ofx') | 
           {Lexicon("ru")}? ('offset'             | 'ofx') ;
OTHERWISE: 
           {Lexicon("en")}? ('otherwise')         ;
OUT: 
           {Lexicon("bg")}? ('out')               | 
           {Lexicon("da")}? ('out')               | 
           {Lexicon("de")}? ('depuis')            | 
           {Lexicon("en")}? ('out')               | 
           {Lexicon("fr")}? ('depuis')            | 
           {Lexicon("he")}? ('out')               | 
           {Lexicon("nl")}? ('out')               | 
           {Lexicon("ru")}? ('out')               ;
PAD: 
           {Lexicon("bg")}? ('pad')               | 
           {Lexicon("da")}? ('pad')               | 
           {Lexicon("de")}? ('pad')               | 
           {Lexicon("en")}? ('pad')               | 
           {Lexicon("fr")}? ('pad')               | 
           {Lexicon("he")}? ('pad')               | 
           {Lexicon("ru")}? ('pad')               ;
POINTER: 
           {Lexicon("bg")}? ('pointer'            | 'ptr') | 
           {Lexicon("da")}? ('pointer'            | 'ptr') | 
           {Lexicon("de")}? ('pointer')           | 
           {Lexicon("en")}? ('pointer'            | 'ptr') | 
           {Lexicon("fr")}? ('pointer')           | 
           {Lexicon("he")}? ('pointer')           | 
           {Lexicon("ru")}? ('pointer'            | 'ptr') ;
PRIVATE: 
           {Lexicon("bg")}? ('private')           | 
           {Lexicon("da")}? ('private')           | 
           {Lexicon("de")}? ('privé')             | 
           {Lexicon("en")}? ('private')           | 
           {Lexicon("fr")}? ('privé')             | 
           {Lexicon("he")}? ('private')           | 
           {Lexicon("nl")}? ('private')           | 
           {Lexicon("ru")}? ('private')           ;
PROCEDURE: 
           {Lexicon("bg")}? ('процедура')         | 
           {Lexicon("da")}? ('procedure'          | 'proc') | 
           {Lexicon("de")}? ('routine')           | 
           {Lexicon("en")}? ('procedure'          | 'proc') | 
           {Lexicon("fr")}? ('procédé')           | 
           {Lexicon("he")}? ('procedure')         | 
           {Lexicon("nl")}? ('procedure')         | 
           {Lexicon("ru")}? ('процедура')         ;
PUBLIC: 
           {Lexicon("bg")}? ('public')            | 
           {Lexicon("da")}? ('public')            | 
           {Lexicon("de")}? ('öffentlich')        | 
           {Lexicon("en")}? ('public')            | 
           {Lexicon("fr")}? ('public')            | 
           {Lexicon("he")}? ('public')            | 
           {Lexicon("nl")}? ('publiek')           | 
           {Lexicon("ru")}? ('public')            ;
READONLY: 
           {Lexicon("bg")}? ('readonly')          | 
           {Lexicon("da")}? ('readonly')          | 
           {Lexicon("de")}? ('readonly')          | 
           {Lexicon("en")}? ('readonly')          | 
           {Lexicon("fr")}? ('readonly')          | 
           {Lexicon("he")}? ('readonly')          | 
           {Lexicon("nl")}? ('alleen lezen')      | 
           {Lexicon("ru")}? ('readonly')          ;
RECURSIVE: 
           {Lexicon("en")}? ('recursive'          | 'rec') ;
REF: 
           {Lexicon("bg")}? ('ref')               | 
           {Lexicon("da")}? ('ref')               | 
           {Lexicon("de")}? ('ref')               | 
           {Lexicon("en")}? ('ref')               | 
           {Lexicon("fr")}? ('ref')               | 
           {Lexicon("he")}? ('ref')               | 
           {Lexicon("nl")}? ('referentie')        | 
           {Lexicon("ru")}? ('ref')               ;
RELOOP: 
           {Lexicon("bg")}? ('reloop')            | 
           {Lexicon("da")}? ('reloop')            | 
           {Lexicon("de")}? ('reloop')            | 
           {Lexicon("en")}? ('reloop')            | 
           {Lexicon("fr")}? ('reloop')            | 
           {Lexicon("ru")}? ('reloop')            ;
RETURN: 
           {Lexicon("bg")}? ('возврат')           | 
           {Lexicon("da")}? ('vende tilbage')     | 
           {Lexicon("de")}? ('rückkehr')          | 
           {Lexicon("en")}? ('return')            | 
           {Lexicon("fr")}? ('retour')            | 
           {Lexicon("he")}? ('return')            | 
           {Lexicon("nl")}? ('terug')             | 
           {Lexicon("ru")}? ('возврат')           ;
RETURNON: 
           {Lexicon("bg")}? ('returnon')          | 
           {Lexicon("da")}? ('returnon')          | 
           {Lexicon("de")}? ('retour_si')         | 
           {Lexicon("en")}? ('returnon')          | 
           {Lexicon("fr")}? ('retour_si')         | 
           {Lexicon("he")}? ('returnon')          | 
           {Lexicon("nl")}? ('terug bij')         | 
           {Lexicon("ru")}? ('returnon')          ;
RETURNS: 
           {Lexicon("bg")}? ('returns')           | 
           {Lexicon("da")}? ('returns')           | 
           {Lexicon("de")}? ('rückkehrs')         | 
           {Lexicon("en")}? ('returns')           | 
           {Lexicon("fr")}? ('retours')           | 
           {Lexicon("ru")}? ('returns')           ;
SELECT: 
           {Lexicon("en")}? ('select')            ;
SINGLET: 
           {Lexicon("bg")}? ('singlet')           | 
           {Lexicon("da")}? ('singlet')           | 
           {Lexicon("de")}? ('singlet')           | 
           {Lexicon("en")}? ('singlet')           | 
           {Lexicon("fr")}? ('singlet')           | 
           {Lexicon("he")}? ('singlet')           | 
           {Lexicon("nl")}? ('singlet')           | 
           {Lexicon("ru")}? ('singlet')           ;
STATIC: 
           {Lexicon("bg")}? ('static')            | 
           {Lexicon("da")}? ('static')            | 
           {Lexicon("de")}? ('static')            | 
           {Lexicon("en")}? ('static')            | 
           {Lexicon("fr")}? ('static')            | 
           {Lexicon("he")}? ('static')            | 
           {Lexicon("nl")}? ('statisch')          | 
           {Lexicon("ru")}? ('static')            ;
STRING: 
           {Lexicon("bg")}? ('string')            | 
           {Lexicon("da")}? ('string')            | 
           {Lexicon("de")}? ('text')              | 
           {Lexicon("en")}? ('string')            | 
           {Lexicon("fr")}? ('chaîne')            | 
           {Lexicon("he")}? ('string')            | 
           {Lexicon("nl")}? ('string')            | 
           {Lexicon("ru")}? ('string')            ;
STRUCTURE: 
           {Lexicon("bg")}? ('structure'          | 'struct') | 
           {Lexicon("da")}? ('structure'          | 'struct') | 
           {Lexicon("de")}? ('structure')         | 
           {Lexicon("en")}? ('structure'          | 'struct') | 
           {Lexicon("fr")}? ('structure')         | 
           {Lexicon("he")}? ('structure')         | 
           {Lexicon("nl")}? ('structuur')         | 
           {Lexicon("ru")}? ('structure'          | 'struct') ;
THEN: 
           {Lexicon("bg")}? ('тогава')            | 
           {Lexicon("da")}? ('derefter')          | 
           {Lexicon("de")}? ('dann')              | 
           {Lexicon("en")}? ('then')              | 
           {Lexicon("fr")}? ('ensuite')           | 
           {Lexicon("ru")}? ('то')                ;
TO: 
           {Lexicon("bg")}? ('to')                | 
           {Lexicon("da")}? ('to')                | 
           {Lexicon("de")}? ('to')                | 
           {Lexicon("en")}? ('to')                | 
           {Lexicon("fr")}? ('to')                | 
           {Lexicon("he")}? ('to')                | 
           {Lexicon("nl")}? ('tot')               | 
           {Lexicon("ru")}? ('to')                ;
TYPE: 
           {Lexicon("bg")}? ('type')              | 
           {Lexicon("da")}? ('type')              | 
           {Lexicon("de")}? ('art')               | 
           {Lexicon("en")}? ('type')              | 
           {Lexicon("fr")}? ('type')              | 
           {Lexicon("he")}? ('type')              | 
           {Lexicon("nl")}? ('type')              | 
           {Lexicon("ru")}? ('type')              ;
UNALIGNED: 
           {Lexicon("bg")}? ('unaligned')         | 
           {Lexicon("da")}? ('unaligned')         | 
           {Lexicon("de")}? ('unaligned')         | 
           {Lexicon("en")}? ('unaligned')         | 
           {Lexicon("fr")}? ('unaligned')         | 
           {Lexicon("he")}? ('unaligned')         | 
           {Lexicon("ru")}? ('unaligned')         ;
UNTIL: 
           {Lexicon("bg")}? ('пока')              | 
           {Lexicon("da")}? ('indtil'             | 'til') | 
           {Lexicon("de")}? ('bis')               | 
           {Lexicon("en")}? ('until')             | 
           {Lexicon("fr")}? ('avant')             | 
           {Lexicon("he")}? ('until')             | 
           {Lexicon("nl")}? ('totdat')            | 
           {Lexicon("ru")}? ('пока')              ;
USING: 
           {Lexicon("bg")}? ('using')             | 
           {Lexicon("da")}? ('using')             | 
           {Lexicon("de")}? ('using')             | 
           {Lexicon("en")}? ('using')             | 
           {Lexicon("fr")}? ('using')             | 
           {Lexicon("he")}? ('using')             | 
           {Lexicon("nl")}? ('gebruikende')       | 
           {Lexicon("ru")}? ('using')             ;
VARIABLE: 
           {Lexicon("bg")}? ('variable')          | 
           {Lexicon("da")}? ('variable')          | 
           {Lexicon("de")}? ('variable')          | 
           {Lexicon("en")}? ('variable')          | 
           {Lexicon("fr")}? ('variable')          | 
           {Lexicon("ru")}? ('variable')          ;
VARYING: 
           {Lexicon("bg")}? ('varying')           | 
           {Lexicon("da")}? ('varying')           | 
           {Lexicon("de")}? ('varying')           | 
           {Lexicon("en")}? ('varying')           | 
           {Lexicon("fr")}? ('varying')           | 
           {Lexicon("he")}? ('varying')           | 
           {Lexicon("nl")}? ('varierend')         | 
           {Lexicon("ru")}? ('varying')           ;
WHEN: 
           {Lexicon("en")}? ('when')              ;
WHILE: 
           {Lexicon("bg")}? ('докато')            | 
           {Lexicon("da")}? ('mens')              | 
           {Lexicon("de")}? ('solang')            | 
           {Lexicon("en")}? ('while')             | 
           {Lexicon("fr")}? ('tandis que')        | 
           {Lexicon("he")}? ('כלעוד')             | 
           {Lexicon("nl")}? ('zolang')            | 
           {Lexicon("ru")}? ('в то время как')    ;
YIELD: 
           {Lexicon("bg")}? ('yield')             | 
           {Lexicon("da")}? ('overdrage')         | 
           {Lexicon("de")}? ('abtreten')          | 
           {Lexicon("en")}? ('yield')             | 
           {Lexicon("fr")}? ('donner')            | 
           {Lexicon("he")}? ('yield')             | 
           {Lexicon("nl")}? ('opbrengst')         | 
           {Lexicon("ru")}? ('yield')             ;

/* End of generated Antlr4 keyword token definitions. */

LABEL:                (AT IDENTIFIER) ;
IDENTIFIER:           (IDENTIFIER_START IDENTIFIER_REST*) ; 
BINARY_PATTERN:       (BIN (LSEP BIN)*)+ FRAC_B? BASE_B;
OCTAL_PATTERN:        (OCT (LSEP OCT)*)+ FRAC_O? BASE_O;
HEXADECIMAL_PATTERN:  (HEX (LSEP HEX)*)+ FRAC_H? BASE_H;
DECIMAL_PATTERN:      (DEC (LSEP DEC)*)+ FRAC_D? BASE_D?;

// SYMBOLS AND OPERATORS

AT:           ('@');
RARROW: 	    ('->');
DOT:          ('.');
COMMA:        (',');
LPAR: 		    ('(');
RPAR: 		    (')');
LBRACK: 	    ('[');
RBRACK: 	    (']');
LBRACE: 	    ('{');
RBRACE: 	    ('}');
EQUALS: 	    ('=');
TIMES: 		    ('*');
DIVIDE: 	    ('/');
PLUS: 		    ('+');
MINUS: 		    ('-');
SEMICOLON:	  (';');
POWER: 		    ('^');  // PL/I traditionally used ** but it never had/used ^ so we can leverage that instead.
COLON: 		    (':');
TRIQUOTE:     ('"""');
DIQUOTE:      ('""'); 
QUOTE: 	      ('"');
SQUOTE: 	    ('\'');
NOT:   		    ('~');
GT:    		    ('>');
LT:    		    ('<');
GTE:   		    ('>=');
LTE:   		    ('<=');
NGT:   		    ('~>');
NLT:   		    ('~<');
NE:    		    ('~=');
PCNT:  		    ('%');
AND:    	    ('&');
OR:     	    ('|');
XOR:          ('<|>');  // excluisve OR
SCAND:  	    ('?&'); 	// short-circuit AND
SCOR:   	    ('?|');  	// short-circuit OR
CONC:   	    ('||');   // concatenate
L_LOG_SHIFT:  ('<<');   // logical: left bit lost rite bit becomes zero
R_LOG_SHIFT:  ('>>');   // logical: rite bit lost left bit becomes zero
R_ART_SHIFT:  ('>>>');  // arithmetic: rite bit lost left bit is copy of sign bit
L_ROTATE:     ('<<@');  // rotate: left bit rotated out rite bit becomes that rotated left bit
R_ROTATE:     ('@>>');  // rotate: rite bit rotated out left bit becomes that rotated rite bit
RANGE:        ('..');   // used to represent a range from some start to some end

// LEXER FRAGMENTS

fragment LSEP: (' ' | '_');
fragment BIN: [0-1];
fragment OCT: [0-7];
fragment DEC: [0-9];
fragment HEX: [0-9a-fA-F];
fragment BASE_B: (':b' | ':B');
fragment BASE_O: (':o' | ':O');
fragment BASE_D: (':d' | ':D');
fragment BASE_H: (':h' | ':H');
fragment FRAC_B: ('.' [0-1]+);
fragment FRAC_D: ('.' [0-9]+);
fragment FRAC_O: ('.' [0-7]+);
fragment FRAC_H: ('.' [0-9a-fA-F]+);
fragment IDENTIFIER_START: [$a-zA-Z_\u0370-\u03ff];
fragment IDENTIFIER_REST:  [$a-zA-Z_0-9\u0370-\u03ff];
