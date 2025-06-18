
/*
    GRAMMAR OVERVIEW
    This grammar has several important characteristics that reflect language design goals.
    1. There are no reserved words, identfiers can be keywords, new keywords can be added over time with backward compatibility.
    2. Statements are either block or single in nature. Block statements are terminated by 'end' and single by either Newline or Semicolon.
    3. Staments may be preceded by any number of Newlines and or Semicolons which are simply ignored.
    4. One or more newlines may appear inbetween the terms of a statement so that a statement can be split across lines.
    5. Semicolons can nonly appear at the end of single statemenrs or in fron of statements (which are ignored like empty statements)
 */

grammar Syscode;

// Parser rules

preamble: (NEWLINE | SEMICOLON)+;
statementSeparator : (SEMICOLON | NEWLINE);
emptyLines: NEWLINE+;


source: (statement* endOfFile); 
statement:  preamble? realStatement ;
realStatement : (assignment | label | scope | enum | struct | if | procedure );

//statements: (statement)*;
label: AT identifier statementSeparator;
scope: lineScope | blockScope;
lineScope:  (scopeKeyword emptyLines? Name=qualifiedName emptyLines? statementSeparator);
blockScope: (scopeKeyword emptyLines? Name=qualifiedName emptyLines? statement* emptyLines? endKeyword)  ;
procedure: procedureKeyword emptyLines? Spelling=identifier paramList? statement* emptyLines? endKeyword;
struct: structKeyword structDefinition ;
enum: enumKeyword emptyLines? Name=identifier emptyLines? typename? memberSeparator emptyLines? Members=enumMembers emptyLines? endKeyword;


if:             ifKeyword emptyLines? exprThenBlock emptyLines? elifBlock? emptyLines? elseBlock? emptyLines? endKeyword;
exprThenBlock:  expression emptyLines? thenKeyword emptyLines? thenBlock;
thenBlock :     statement*;
elseBlock :     (elseKeyword emptyLines? thenBlock);
elifBlock :     (elifKeyword emptyLines? exprThenBlock)+;

assignment : identifier (EQUALS | ASSIGN | COMPASSIGN) identifier statementSeparator;

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
identifier: ENUM | IF | ELSE | ELIF | THEN | STRUCT | PATH | SCOPE | IDENTIFIER;
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

expression: (identifier EQUALS identifier) | (identifier '<' identifier)  | (identifier '>' identifier);

// Keywords

keyword: (structKeyword | scopeKeyword | ifKeyword | thenKeyword | elifKeyword | elseKeyword | procedureKeyword | enumKeyword | endKeyword) ;

structKeyword: STRUCT;
scopeKeyword: SCOPE;
ifKeyword: IF;
thenKeyword: THEN;
elifKeyword: ELIF;
elseKeyword: ELSE;
procedureKeyword: PROC;
enumKeyword: ENUM;
endKeyword: END;


// Punctuation rules
memberSeparator : COMMA;

// Utility rules
endOfFile: emptyLines? EOF;


// Allow comment blocks slash/star TEXT star/slash to be nested 
COMMENT: (BCOM (COMMENT | .)*? ECOM) -> skip; //channel(HIDDEN);

fragment BCOM:    ('/*');
fragment ECOM:    ('*/');

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

STRING: 'string';
ENUM: 'enum';
DCL: 'dcl';
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
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER:  [a-zA-Z_] [a-zA-Z0-9_]*;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;
//COMMENT: '/*' .*? '*/' -> channel(HIDDEN);