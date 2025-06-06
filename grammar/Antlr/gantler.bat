REM --------------------------------------------------------------------
REM Use this command to run antlr and gen C# and Java source code.
REM It expects a grammar and a lexer .g4 file named as shown
REM --------------------------------------------------------------------
@echo on

cd %1

java org.antlr.v4.Tool %1.g4 -visitor
java org.antlr.v4.Tool %1.g4 -visitor -Dlanguage=CSharp
REM ----------------------------------------------------------------------------------------------------
REM This next step compiles the java code and creates a large number of .class files with $ in the name
REM -----------------------------------------------------------------------------------------------------

javac *.java

start java org.antlr.v4.gui.TestRig %1 translationUnit %2 -gui -tokens -encoding utf8

cd ..


REM java -jar C:\Antlr\antlr-4.13.2-complete.jar -Dlanguage=Java    %1\%1Lexer.g4 %1\%1.g4 %2
REM java -jar C:\Antlr\antlr-4.13.2-complete.jar -Dlanguage=CSharp  %1\%1Lexer.g4 %1\%1.g4 %2
 