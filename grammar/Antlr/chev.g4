grammar print;

print_text
    : print_group+ EOF
    ;

print_group
    : print_set (COMMA print_set)* 
    ;
print_set
    : PRINT NUMBER (COMMA NUMBER)* 
    | PRINT
    ;

PRINT: 'print';
NUMBER: [0-9]+;
COMMA:  ',';
SPACE:  (' ')+ -> skip;
NL:     [\r\n]+ -> skip;