grammar Julia;

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
constArrayList: LPAR numericConstant (COMMA numericConstant)* RPAR;
numericConstant: NUMBER;
// struct
//structMemberList: structMember+ ;
structName: Spelling=identifier Bounds=constArrayList?;
structMembers:  emptyLines? structMember emptyLines? (memberSeparator emptyLines? structMember emptyLines?)*  memberSeparator? emptyLines?;
enumMembers: emptyLines? enumMember emptyLines? (memberSeparator emptyLines? enumMember emptyLines?)* memberSeparator? emptyLines?;
structMember
    : structField
    | structStruct;

structField:   (Name=identifier emptyLines? Type=typename);
structStruct:  structDefinition; 

enumMember: (Name=identifier);
identifier: THEN | STRUCT | PATH | SCOPE | IDENTIFIER;
typename 
    : integerType 
    | stringType 
    | bitstringType 
    ;

integerType: BYTE | WORD | DWORD | QWORD;
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
COMMENT: (BCOM (COMMENT | .)*? ECOM) -> channel(HIDDEN);

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
BYTE: 'byte';
BIT: 'bit';
WORD: 'word';
DWORD: 'dword';
QWORD: 'qword';
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