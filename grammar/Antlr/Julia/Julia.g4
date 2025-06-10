grammar Julia;

// Parser rules

source: ((statementSeparator? statements? ) endOfFile) | endOfFile; 
statement:  ((scope | struct | conditional | procedure | assignment) statementSeparator) | statementSeparator;
statements: (statement)+;
scope:  scopeKeyword newlines? Name=scope_name newlines? statements? newlines? endKeyword;
procedure: procedureKeyword newlines? Name=identifier Params=param_list? Statements=statements? newlines? endKeyword;

struct: structKeyword newlines? Name=identifier newlines? memberSeparator Members=structMembers newlines? endKeyword;

conditional: ifKeyword newlines? expression newlines? thenKeyword newlines? statements? (elifKeyword newlines expression newlines? thenKeyword newlines? statements?)* (elseKeyword newlines? statements?)? newlines? endKeyword;
assignment : identifier '=' identifier ;


// Proc

scope_name: identifier (DOT identifier)*;
param_list: LPAR identifier (COMMA identifier)* RPAR;
// struct
//structMemberList: structMember+ ;
structMembers:  newlines? structMember (memberSeparator structMember)* memberSeparator?;
structMember: (Name=identifier newlines? Type=typename);

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

expression: (identifier '=' identifier) | (identifier '<' identifier)  | (identifier '>' identifier);

// Keywords

keyword: (structKeyword | scopeKeyword | ifKeyword | thenKeyword | elifKeyword | elseKeyword | procedureKeyword | endKeyword) ;

structKeyword: STRUCT;
scopeKeyword: SCOPE;
ifKeyword: IF;
thenKeyword: THEN;
elifKeyword: ELIF;
elseKeyword: ELSE;
procedureKeyword: PROC;
endKeyword: END;
// Punctuation rules
statementSeparator : (SEMICOLON | NEWLINE)+;
memberSeparator : NEWLINE* COMMA NEWLINE*;

// Utility rules
endOfFile: newlines? EOF;
newlines: NEWLINE+;

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

END: 'end';
DOT: '.';
SEMICOLON: ';'; 
COMMA: ',';
LPAR: '(';
RPAR: ')';
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER:  [a-zA-Z_] [a-zA-Z0-9_]*;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;