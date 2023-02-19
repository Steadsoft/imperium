grammar genesis;

// PARSER

source
    : BYTE_ORDER_MARK statement* EOF
    ;

statement
    : real_statement
    | statement_terminator
    ;

statement_terminator
    : TERMINATOR
    ;  

real_statement
    : (IDENTIFIER | GOTO)* statement_terminator
    ;      

// LEXER


GOTO:                 ('goto');
IDENTIFIER:           (IDENTIFIER_START IDENTIFIER_REST*);
TERMINATORS:          ((SEMICOLON WHITE*) | (NEWLINE WHITE*))+  {setType(TERMINATOR); /*setText(";");*/};
TERMINATOR:           (SEMICOLON | NEWLINE);
CONT:                 ('`' WHITE* NEWLINE) -> skip;
WHITE:                (TAB | SPACE) -> skip;
BYTE_ORDER_MARK:      ('\uFEFF');

fragment SPACE:                 (' ');
fragment TAB:                   ('\t');
fragment NEWLINE:               ('\r'? '\n');
fragment SEMICOLON:             (';');
fragment IDENTIFIER_START:      [$a-zA-Z_];
fragment IDENTIFIER_REST:       [$a-zA-Z_0-9];