
/*
    GRAMMAR OVERVIEW
    This grammar has several important characteristics that reflect language design goals.
    1. There are no reserved words, identfiers can be keywords, new keywords can be added over time with backward compatibility.
    2. Statements are either block or single in nature. Block statements are terminated by 'end' and single by either Newline or Semicolon.
    3. Staments may be preceded by any number of Newlines and or Semicolons which are simply ignored.
    4. One or more newlines may appear inbetween the terms of a statement so that a statement can be split across lines.
    5. Semicolons must appear at the end of single statements or in front of statements (which are ignored like empty statements)
 */

grammar Syscode;

// Parser rules

preamble: (NEWLINE | SEMICOLON)+;
statementSeparator : (SEMICOLON | NEWLINE);
emptyLines: NEWLINE+;


source: (statement* endOfFile); 
statement:  preamble? realStatement ;
realStatement : (assignment | label | scope | enum | struct | if | declare | procedure );

//statements: (statement)*;
label: AT identifier statementSeparator;
scope: lineScope | blockScope;
lineScope:  (scopeKeyword emptyLines? Name=qualifiedName emptyLines? statementSeparator);
blockScope: (scopeKeyword emptyLines? Name=qualifiedName emptyLines? statement* emptyLines? endKeyword)  ;
procedure: procedureKeyword emptyLines? Spelling=identifier paramList? statement* emptyLines? endKeyword;
struct: structKeyword structDefinition ;
enum: enumKeyword emptyLines? Name=identifier emptyLines? typename? memberSeparator emptyLines? Members=enumMembers emptyLines? endKeyword;

declare: dclKeyword Spelling=identifier Bounds=constArrayList? typename statementSeparator ;

if:             ifKeyword emptyLines? exprThenBlock emptyLines? elifBlock? emptyLines? elseBlock? emptyLines? endKeyword;
exprThenBlock:  expression emptyLines? thenKeyword emptyLines? thenBlock;
thenBlock :     statement*;
elseBlock :     (elseKeyword emptyLines? thenBlock);
elifBlock :     (elifKeyword emptyLines? exprThenBlock)+;

assignment : Target=reference (EQUALS) Source=expression statementSeparator;


reference
  : reference RARROW basicReference argumentsList?    # PtrRef
  | basicReference argumentsList?                     # BasicRef
  ;

basicReference
  : structureQualificationList? identifier
  ;

argumentsList
  : arguments+;

structureQualificationList
  : structureQualification+
  ;

structureQualification
  : identifier arguments? DOT
  ;

arguments
  : LPAR subscriptCommalist? RPAR
  ;

subscriptCommalist
  : subscript (COMMA subscript)*
  ;

subscript
  : expression
  ;

expression
  : primitiveExpression                                     # ExprPrimitive
  | parenthesizedExpression                                 # ExprParenthesized
  | prefixExpression                                        # ExprPrefixed
  | <assoc=right> Left=expression POWER_U Rite=expression   # ExprRaise
  | Left=expression multiplyOperator Rite=expression        # ExprMulDiv
  | Left=expression additionOperator Rite=expression        # ExprAddSub
  | Left=expression bitAdjustOperator Rite=expression       # ExprBitAdjust
  | Left=expression CONC Rite=expression                    # ExprConcat
  | Left=expression comparisonOperator Rite=expression      # ExprCompare
  | Left=expression boolAndOperator Rite=expression         # ExprBoolAnd
  | Left=expression boolXorOperator Rite=expression         # ExprBoolXor
  | Left=expression boolOrOperator Rite=expression          # ExprBoolOr
  | Left=expression LOGAND Rite=expression                  # ExprLogAnd
  | Left=expression LOGOR Rite=expression                   # ExprLogOr
  ;

primitiveExpression
  : numericLiteral
  | stringLiteral
  | reference
  ;

stringLiteral
  : STRING_LITERAL_1
  ;


numericLiteral
  : binaryLiteral
  | octalLiteral
  | hexLiteral
  | decimalLiteral
  ;

hexLiteral
  : (HEXADECIMAL_PATTERN)
  ;

octalLiteral
  : (OCTAL_PATTERN)
  ;

decimalLiteral
  : (INTEGER)
  | (DECIMAL_PATTERN)
  ;

binaryLiteral
  : (BINARY_PATTERN)
  ;

parenthesizedExpression
  : LPAR expression RPAR
  | REDAND expression RPAR
  | REDOR expression RPAR
  | REDXOR_U expression RPAR
  | REDNAND expression RPAR
  | REDNOR expression RPAR
  | REDXNOR_U expression RPAR
  ;

prefixExpression
  : prefixOperator expression
  ;

bitAdjustOperator
  : (L_ROTATE_U | R_ROTATE_U | L_LOG_SHIFT | R_LOG_SHIFT | R_ART_SHIFT)
  ;

additionOperator
  : (PLUS | MINUS)
  ;

multiplyOperator
  : (TIMES | DIVIDE_U | PCNT)
  ;

boolAndOperator
  : (AND | NAND)
  ;

boolXorOperator
  : (XOR_U | XNOR_U)
  ;

boolOrOperator
  : (OR | NOR | NOT)
  ;

comparisonOperator
  : GT
  | GTE_U
  | EQUALS
  | LT
  | LTE_U
  | NGT
  | NE_U 
  | NLT
  ;

prefixOperator
  : PLUS
  | MINUS
  | NOT
  ;



structDefinition: structName emptyLines? memberSeparator emptyLines? Members=structMembers emptyLines? endKeyword;

 
//elif_block : (elifKeyword expr_then_block);


// Proc

qualifiedName: identifier (DOT identifier)*;
paramList: LPAR identifier (COMMA identifier)* RPAR;
constArrayList: (LPAR numericConstant (COMMA numericConstant)* RPAR);
numericConstant: NUMBER;
// struct
//structMemberList: structMember+ ;
structName: Spelling=identifier Bounds=constArrayList?;
structMembers
    :  emptyLines? structMember emptyLines? (memberSeparator emptyLines? structMember emptyLines?)*  memberSeparator? emptyLines?;
enumMembers: emptyLines? enumMember emptyLines? (memberSeparator emptyLines? enumMember emptyLines?)* memberSeparator? emptyLines?;
structMember
    : structField
    | structDefinition;

structField:   (Spelling=identifier emptyLines? Bounds=constArrayList? Type=typename );
structStruct:  structDefinition; 

enumMember: (Name=identifier);
identifier: DCL | ENUM | IF | ELSE | ELIF | THEN | STRUCT | PATH | SCOPE | IDENTIFIER;
typename 
    : binaryType
    | decimalType
    | stringType 
    | bitstringType 
    ;

binaryType: BIN8 | BIN16 | BIN32 | BIN64 | UBIN8 | UBIN16 | UBIN32 | UBIN64 | ((BIN | UBIN) LPAR NUMBER (COMMA NUMBER)? RPAR) ;
decimalType:  ((DEC | UDEC) LPAR NUMBER (COMMA NUMBER)? RPAR) ;

stringType: STRING '(' NUMBER ')';
bitstringType: BIT '(' NUMBER ')';

// Expresions

//expression: (identifier EQUALS identifier) | (identifier '<' identifier)  | (identifier '>' identifier);

// Keywords

keyword: (dclKeyword | structKeyword | scopeKeyword | ifKeyword | thenKeyword | elifKeyword | elseKeyword | procedureKeyword | enumKeyword | endKeyword) ;

structKeyword: STRUCT;
scopeKeyword: SCOPE;
ifKeyword: IF;
thenKeyword: THEN;
elifKeyword: ELIF;
elseKeyword: ELSE;
procedureKeyword: PROC;
enumKeyword: ENUM;
endKeyword: END;
dclKeyword: DCL;


// Punctuation rules
memberSeparator : COMMA;

// Utility rules
endOfFile: emptyLines? EOF;


// Allow comment blocks slash/star TEXT star/slash to be nested 
COMMENT: (BCOM (COMMENT | .)*? ECOM) -> skip; //channel(HIDDEN);

fragment BCOM:    ('/*');
fragment ECOM:    ('*/');
fragment HEX:     [0-9a-fA-F];
fragment FRAC_H:  ('.' [0-9a-fA-F]+);
fragment BASE_H:  (':h' | ':H');
fragment OCT:     [0-7];
fragment FRAC_D:  ('.' [0-9]+);
fragment BASE_D:  (':d' | ':D');
fragment FRAC_O:  ('.' [0-7]+);
fragment BASE_O:  (':o' | ':O');
fragment FRAC_B:  ('.' [0-1]+);
fragment BASE_B:  (':b' | ':B');

HEXADECIMAL_PATTERN:  ((HEX (' ' HEX)*)+ | (HEX ('_' HEX)*)+) FRAC_H? BASE_H;
OCTAL_PATTERN:        ((OCT (' ' OCT)*)+ | (OCT ('_' OCT)*)+) FRAC_O? BASE_O;
DECIMAL_PATTERN:      (DEC (' ' DEC)*)+ FRAC_D? BASE_D?;
BINARY_PATTERN:       ((BIN (' ' BIN)*)+ | (BIN ('_' BIN)*)+) FRAC_B? BASE_B;

INTEGER:              ([1-9] [0-9]*);

// Lexer rules
PROC: 'proc' | 'procedure';
FUNC: 'func' | 'function';
SCOPE: 'scope';
PATH: 'path';
STRUCT: 'struct';
IF: 'if';
THEN: 'then';
ELIF: 'elif';
ELSE: 'else';
BIT: 'bit';
FOR: 'for';
WHILE: 'while';
UNTIL:  'until';
FOREVER: 'forever';

// Ints
BIN: 'bin';
BIN8: 'bin8';
BIN16: 'bin16';
BIN32: 'bin32';
BIN64: 'bin64';

UBIN: 'ubin';
UBIN8: 'ubin8';
UBIN16: 'ubin16';
UBIN32: 'ubin32';
UBIN64: 'ubin64';

DEC: 'dec';

UDEC: 'udec';
CONC:           ('++');   // concatenate character strings or bit strings

LOGAND:         ('&&');     // short-circuit, logical AND
LOGOR:          ('||');     // short-circuit, logical OR
AND:            ('&');
OR:             ('|');
NAND:           ('~&');
NOR:            ('~|');
XOR_U:          ('^'|'⊕');    // U+2295 excluisve bitwise OR
XNOR_U:         ('~^'|'~⊕');   // U+2295
NOT:            ('~');
GT:             ('>');
LT:             ('<');
GTE_U:          ('>='|'≥');
LTE_U:          ('<='|'≤');
NGT:            ('~>');
NLT:            ('~<');
NE_U:           ('~='|'≠');

POWER_U:        ('**' | '🠕');  // U+1F815
STRING_LITERAL_1:     (QUOTE    (.)*? QUOTE);
PLUS:           ('+');
MINUS:          ('-');
TIMES:          ('*');
DIVIDE_U:       ('/' | '÷'); // U+00F7
PCNT:           ('%');

QUOTE:          ('"');
REDAND:         ('&(');
REDOR:          ('|(');
REDNOR:         ('~|(');
REDXOR_U:       ('^('|'⊕(');   // U+2295
REDXNOR_U:      ('~^('|'~⊕('); // U+2295
REDNAND:        ('~&(');
L_LOG_SHIFT:    ('<<');   // logical: left bit lost rite bit becomes zero
R_LOG_SHIFT:    ('>>');   // logical: rite bit lost left bit becomes zero
R_ART_SHIFT:    ('>>>');  // arithmetic: rite bit lost left bit is copy of sign bit
L_ROTATE_U:     ('<@'|'⧀');  // U+29C0 rotate: left bit rotated out rite bit becomes that rotated left bit
R_ROTATE_U:     ('@>'|'⧁');  // U+29C1 rotate: rite bit rotated out left bit becomes that rotated rite bit

STRING: 'string';
ENUM: 'enum';
DCL: 'dcl' ;
EQUALS: '=' ;
ASSIGN: '<-';
COMPASSIGN: ('+=' | '-=' | '*=' | '/=');
END: 'end';
DOT: '.';
AT: '@';
SEMICOLON: ';'; 
COMMA: ',';
LPAR: '(';
RPAR: ')';
RARROW: '->';
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER:  [a-zA-Z_] [a-zA-Z0-9_]*;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;
//COMMENT: '/*' .*? '*/' -> channel(HIDDEN);