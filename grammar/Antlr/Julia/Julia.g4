grammar Julia;

// Parser rules

stmts: (scope | path | empty)* end;

scope:  
   junk SCOPE junk identifier junk stmtTerminator 
   ;

path:  
   junk PATH junk identifier (junk DOT junk identifier)* junk stmtTerminator 
   ;

empty:
    stmtTerminator
    ;

end:
   junk EOF
   ;

stmtTerminator
    : SEMICOLON
    | NEWLINE 
    ;
junk:
    NEWLINE*
    ;

identifier:
    SCOPE | PATH | IDENTIFIER
    ;

expr: term (('+' | '-') term)*;
term: factor (('*' | '/') factor)*;
factor: NUMBER | '(' expr ')' | ('-' | '+') factor;

// Lexer rules
SCOPE: 'scope';
PATH: 'path';
DOT: '.';
SEMICOLON: ';'; //-> channel(HIDDEN);
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER: [a-z]+;
NEWLINE: ('\r' '\n'); //-> channel(HIDDEN);
WS: [ \t]+ -> skip;