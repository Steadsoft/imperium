cls
java org.antlr.v4.Tool csharp.g4 -visitor
java org.antlr.v4.Tool csharp.g4 -visitor -Dlanguage=CSharp
javac *.java
java org.antlr.v4.gui.TestRig csharp translationUnit grammar_test.cs -gui -tokens -encoding utf8