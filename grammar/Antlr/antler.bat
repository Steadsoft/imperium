REM --------------------------------------------------------------------
REM Use this command to run antlr and gen C# and Java source code.
REM It expects a grammar and a lexer .g4 file named as shown
REM --------------------------------------------------------------------
@echo on
java -jar C:\Antlr\antlr-4.13.2-complete.jar -Dlanguage=Java    %1\%1Lexer.g4 %1\%1.g4 %2
java -jar C:\Antlr\antlr-4.13.2-complete.jar -Dlanguage=CSharp  %1\%1Lexer.g4 %1\%1.g4 %2
 