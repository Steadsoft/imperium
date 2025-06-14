grammar Syscode;

// Parser rules

source: ((statementSeparator? statements? ) endOfFile) | endOfFile; 
statement:  ((label | scope | enum | struct | conditional | procedure | assignment) statementSeparator emptyLines? ) | statementSeparator emptyLines? ;
statements: (statement)+;
label: AT IDENTIFIER;
scope:  scopeKeyword emptyLines? Name=scopeName emptyLines? statements? emptyLines? endKeyword;
procedure: procedureKeyword emptyLines? Name=identifier Params=paramList? Statements=statements? emptyLines? endKeyword;
struct: structKeyword structDefinition emptyLines? ;

structDefinition: structName emptyLines? memberSeparator emptyLines? Members=structMembers emptyLines? endKeyword;

enum: enumKeyword emptyLines? Name=identifier emptyLines? typename? memberSeparator emptyLines? Members=enumMembers emptyLines? endKeyword;
conditional: ifKeyword emptyLines? expression emptyLines? thenKeyword emptyLines? Then=statement* (elifKeyword emptyLines expression emptyLines? thenKeyword emptyLines? statements?)* (elseKeyword emptyLines? Else=statement*)? emptyLines? endKeyword;
assignment : identifier (EQUALS | ASSIGN | COMPASSIGN) identifier ;


// Proc

scopeName: identifier (DOT identifier)*;
paramList: LPAR identifier (COMMA identifier)* RPAR;
constArrayList: (LPAR numericConstant (COMMA numericConstant)* RPAR)?;
numericConstant: NUMBER;
// struct
//structMemberList: structMember+ ;
structName: Spelling=identifier Bounds=constArrayList;
structMembers
    :  emptyLines? structMember emptyLines? (memberSeparator emptyLines? structMember emptyLines?)*  memberSeparator? emptyLines?;
enumMembers: emptyLines? enumMember emptyLines? (memberSeparator emptyLines? enumMember emptyLines?)* memberSeparator? emptyLines?;
structMember
    : structField
    | structDefinition;

structField:   (Name=identifier emptyLines? Type=typename);
structStruct:  structDefinition; 

enumMember: (Name=identifier);
identifier: THEN | STRUCT | PATH | SCOPE | IDENTIFIER;
typename 
    : integerType
    | stringType 
    | bitstringType 
    ;

integerType: BIN8 | BIN16 | BIN32 | BIN64 | UBIN8 | UBIN16 | UBIN32 | UBIN64 | ((BIN | UBIN) LPAR NUMBER RPAR) ;

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
statementSeparator : (SEMICOLON | NEWLINE);
memberSeparator : COMMA;

// Utility rules
endOfFile: emptyLines? EOF;
emptyLines: NEWLINE+;


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

// Ints
BIN: 'int';
BIN8: 'int8';
BIN16: 'int16';
BIN32: 'int32';
BIN64: 'int64';

UBIN: 'uint';
UBIN8: 'uint8';
UBIN16: 'uint16';
UBIN32: 'uint32';
UBIN64: 'uint64';


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