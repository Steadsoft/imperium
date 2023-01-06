/*
 Named for convenince as a simple term, the grammar is named after Emil Leon Post.
 This grammar is
 based on the PL/I grammar (in particular the grammar defined in ANSI X3.74-1987)
 It has no
 reserved words, any keyword may be used as an identifier without any ambiguit arising.
 It suppors
 multiple keyword languages.
 We can add more keywords over time and never break backward
 compatibility with existing code
 which migt contain identifiers that are the same as these new
 keywords.
 */

/* Multiple languages: https://stackoverflow.com/questions/40325774/antlr4-dynamic-token-type */

lexer grammar ImperiumKeywords;

import ImperiumLexer;

// BEGIN - Culture dependent keywords

CALL: ('call');
GOTO: ('goto'); //{langcode=="en"}? ('goto') | {langcode=="fr"}? ('goto'); 
GO: ('go');
TO: ('to');
PROCEDURE: ('procedure' | 'proc');
PROC: ('proc');
END: ('end');
DECLARE: ('declare' | 'dcl');
ARGUMENT: ('argument' | 'arg');
DEFINE: ('define' | 'def');
BINARY: ('binary' | 'bin'); //{langcode=="en"}? ('binary' | 'bin') | {langcode=="fr"}? ('binaire' | 'bin');
DECIMAL: ('decimal' | 'dec');
AUTOMATIC: ('automatic' | 'auto');
BUILTIN: ('builtin');
INTRINSIC: ('intrinsic');
STATIC: ('static');
VARIABLE: ('variable');
BASED: ('based');
DEFINED: ('defined');
INTERNAL: ('internal');
EXTERNAL: ('external');
RETURN: ('return');
IF: ('if');
THEN: ('then');
ELSE: ('else');
ELIF: ('elif');
RETURNS: ('returns');
POINTER: ('pointer' | 'ptr');
BIT: ('bit');
CHARACTER: ('character' | 'char');
ENTRY: ('entry');
FIXED: ('fixed');
FLOAT: ('float');
OFFSET: ('offset' | 'ofx');
STRING: ('string');
VARYING: ('varying' | 'var');
COROUTINE: ('coroutine' | 'cor');
COFUNCTION: ('cofunction' | 'cof');
LOOP: ('loop');
WHILE: ('while');
UNTIL: ('until');
ENDLOOP: ('endloop');
RELOOP: ('reloop');
INCLUDE: ('include');
INC: ('inc');

// END - Culture dependent keywords