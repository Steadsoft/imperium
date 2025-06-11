grammar Julia;

// Parser rules

source: ((statementSeparator? statements? ) endOfFile) | endOfFile; 
statement:  ((label | scope | enum | struct | conditional | procedure | assignment) statementSeparator emptyLines? ) | statementSeparator emptyLines? ;
statements: (statement)+;
label: AT IDENTIFIER;
scope:  scopeKeyword emptyLines? Name=scope_name emptyLines? statements? emptyLines? endKeyword;
procedure: procedureKeyword emptyLines? Name=identifier Params=param_list? Statements=statements? emptyLines? endKeyword;
struct: structKeyword struct_definition emptyLines? ;

struct_definition: struct_name emptyLines? memberSeparator emptyLines? Members=structMembers emptyLines? endKeyword;

enum: enumKeyword emptyLines? Name=identifier emptyLines? typename? memberSeparator emptyLines? Members=enumMembers emptyLines? endKeyword;
conditional: ifKeyword emptyLines? expression emptyLines? thenKeyword emptyLines? Then=statement* (elifKeyword emptyLines expression emptyLines? thenKeyword emptyLines? statements?)* (elseKeyword emptyLines? Else=statement*)? emptyLines? endKeyword;
assignment : identifier (EQUALS | ASSIGN | COMPASSIGN) identifier ;


// Proc

scope_name: identifier (DOT identifier)*;
param_list: LPAR identifier (COMMA identifier)* RPAR;
const_array_list: LPAR NUMBER (COMMA NUMBER)* RPAR;
// struct
//structMemberList: structMember+ ;
struct_name: Name=identifier Bounds=const_array_list?;
structMembers:  emptyLines? structMember emptyLines? (memberSeparator emptyLines? structMember emptyLines?)*  memberSeparator? emptyLines?;
enumMembers: emptyLines? enumMember emptyLines? (memberSeparator emptyLines? enumMember emptyLines?)* memberSeparator? emptyLines?;
structMember
    : structField
    | structStruct;

structField:   (Name=identifier emptyLines? Type=typename);
structStruct:  struct_definition; 

enumMember: (Name=identifier);
identifier: THEN | STRUCT | PATH | SCOPE | IDENTIFIER;
typename 
    : integer_type 
    | string_type 
    | bitstring_type 
    ;

integer_type: BYTE | WORD | DWORD | QWORD;
string_type: STRING '(' NUMBER ')';
bitstring_type: BIT '(' NUMBER ')';

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