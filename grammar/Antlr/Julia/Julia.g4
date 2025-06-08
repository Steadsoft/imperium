grammar Julia;

// Parser rules

source: ((statement_separator? (statement)* ) end_of_file) | end_of_file;
statement:  ((scope_statement | path_statement | struct_statement | if_statement | proc_statement) statement_separator) | statement_separator;
statements: (statement)*;
scope_statement:  scope_keyword newlines? identifier;
path_statement: path_keyword newlines? identifier (newlines? DOT newlines? identifier)*;
struct_statement: struct_keyword newlines? identifier newlines? member_separator struct_member_list newlines? end;
if_statement: if_then_statement | if_then_else_statement | if_then_elif_statement | if_then_elif_else_statement;
if_then_statement: if_keyword newlines? expression newlines? then_keyword then_block end;
if_then_else_statement: if_keyword newlines? expression newlines? then_keyword then_block else_keyword else_block end;
if_then_elif_statement: if_keyword newlines? expression newlines? then_keyword then_block elif_group end;
if_then_elif_else_statement: if_keyword newlines? expression newlines? then_keyword then_block elif_group else_keyword else_block end;
then_block: statements;
else_block: statements;
elif_group: (elif_keyword newlines? expression newlines? then_keyword then_block)+;
// Proc

proc_statement: proc_keyword newlines? statements newlines? end;


// struct
struct_member_list: struct_member+ ;
struct_member:  newlines? identifier newlines? typename member_separator;

identifier: SCOPE | PATH | IDENTIFIER;
typename: BYTE | WORD | DWORD | QWORD | TEXT;
end: END;

path_keyword: PATH ;

// Expresions

expression: (identifier '=' identifier) | (identifier '<' identifier)  | (identifier '>' identifier);

// Keywords
struct_keyword: STRUCT;
scope_keyword: SCOPE;
if_keyword: IF;
then_keyword: THEN;
elif_keyword: ELIF;
else_keyword: ELSE;
proc_keyword: PROC;

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
WORD: 'word';
DWORD: 'dword';
QWORD: 'qword';
TEXT: 'text';

END: 'end';
DOT: '.';
SEMICOLON: ';'; 
COMMA: ',';
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER: [_a-z]+;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;