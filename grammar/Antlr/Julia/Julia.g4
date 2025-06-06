grammar Julia;

// Parser rules

stmts: (scope | path | empty)* end;

scope:  
   junk SCOPE junk IDENTIFIER junk stmtTerminator 
   ;

path:  
   junk PATH junk IDENTIFIER (junk DOT junk IDENTIFIER)* junk stmtTerminator 
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