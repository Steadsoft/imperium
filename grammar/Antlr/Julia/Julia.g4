grammar Julia;

// Parser rules

source: ((statement_separator? (statement)* ) end_of_file) | end_of_file;
statement:  ((scope_statement | path_statement | struct_statement | if_statement | proc_statement) statement_separator) | statement_separator;
statements: (statement)*;
scope_statement:  scope_keyword newlines? identifier;
path_statement: path_keyword newlines? identifier (newlines? DOT newlines? identifier)*;
struct_statement: struct_keyword newlines? identifier newlines? member_separator struct_member_list newlines? end_keyword;
if_statement: if_then_statement | if_then_else_statement | if_then_elif_statement | if_then_elif_else_statement;
if_then_statement: if_keyword newlines? expression newlines? then_keyword then_block end_keyword;
if_then_else_statement: if_keyword newlines? expression newlines? then_keyword then_block else_keyword else_block end_keyword;
if_then_elif_statement: if_keyword newlines? expression newlines? then_keyword then_block elif_group end_keyword;
if_then_elif_else_statement: if_keyword newlines? expression newlines? then_keyword then_block elif_group else_keyword else_block end_keyword;
then_block: statements;
else_block: statements;
elif_group: (elif_keyword newlines? expression newlines? then_keyword then_block)+;
// Proc

proc_statement: proc_keyword newlines? statements newlines? end_keyword;


// struct
struct_member_list: struct_member+ ;
struct_member:  newlines? identifier newlines? typename member_separator;

identifier: THEN | STRUCT | PATH | SCOPE | IDENTIFIER;
typename: integer_type | string_type | bitstring_type;

integer_type: BYTE | WORD | DWORD | QWORD;
string_type: STRING '(' NUMBER ')';
bitstring_type: BIT '(' NUMBER ')';





// Expresions

expression: (identifier '=' identifier) | (identifier '<' identifier)  | (identifier '>' identifier);

// Keywords

keyword: (struct_keyword | scope_keyword | if_keyword | then_keyword | elif_keyword | else_keyword | proc_keyword | path_keyword | end_keyword) ;

struct_keyword: STRUCT;
scope_keyword: SCOPE;
if_keyword: IF;
then_keyword: THEN;
elif_keyword: ELIF;
else_keyword: ELSE;
proc_keyword: PROC;
path_keyword: PATH ;
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
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER: [_a-z]+;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;