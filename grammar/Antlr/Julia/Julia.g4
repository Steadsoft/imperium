grammar Julia;

// Parser rules

source: ((statement_separator? statements ) end_of_file) | end_of_file; 
statement:  ((scopeStatement | structStatement | ifStatement | proc_statement) statement_separator) | statement_separator;
statements: (statement)*;
scopeStatement:  scope_keyword newlines? Name=scope_name ;
structStatement: struct_keyword newlines? Name=identifier newlines? member_separator Members=structMemberList newlines? end_keyword;
ifStatement: ifThenStatement | ifThenElseStatement | ifThenElifStatement | ifThenElifElseStatement;
ifThenStatement: if_keyword newlines? Expr=expression newlines? then_keyword Then=thenBlock end_keyword;
ifThenElseStatement: if_keyword newlines? Expr=expression newlines? then_keyword Then=thenBlock else_keyword Else=elseBlock end_keyword;
ifThenElifStatement: if_keyword newlines? Expr=expression newlines? then_keyword Then=thenBlock Elif=elifGroup end_keyword;
ifThenElifElseStatement: if_keyword newlines? Expr=expression newlines? then_keyword Then=thenBlock Elif=elifGroup else_keyword Else=elseBlock end_keyword;
thenBlock: statements;
elseBlock: statements;
elifGroup: (elif_keyword newlines? expression newlines? then_keyword thenBlock)+;
// Proc

proc_statement: proc_keyword newlines? Name=identifier Params=param_list? Statements=statements newlines? end_keyword;
scope_name: identifier (DOT identifier)*;
param_list: LPAR identifier (COMMA identifier)* RPAR;
// struct
structMemberList: structMember+ ;
structMember:  newlines? Name=identifier newlines? Type=typename member_separator;


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

keyword: (struct_keyword | scope_keyword | if_keyword | then_keyword | elif_keyword | else_keyword | proc_keyword | end_keyword) ;

struct_keyword: STRUCT;
scope_keyword: SCOPE;
if_keyword: IF;
then_keyword: THEN;
elif_keyword: ELIF;
else_keyword: ELSE;
proc_keyword: PROC;
end_keyword: END;
// Punctuation rules
statement_separator : (SEMICOLON | NEWLINE)+;
member_separator : NEWLINE* COMMA NEWLINE*;

// Utility rules
end_of_file: newlines? EOF;
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