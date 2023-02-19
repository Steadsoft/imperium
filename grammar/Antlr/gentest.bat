java org.antlr.v4.Tool genesis.g4 -visitor
java org.antlr.v4.Tool genesis.g4 -visitor -Dlanguage=CSharp
rem java org.antlr.v4.Tool Imperium.g4 -visitor
rem java org.antlr.v4.Tool Imperium.g4 -visitor -Dlanguage=CSharp
javac *.java
java org.antlr.v4.gui.TestRig genesis source gentest.ipl -gui -tokens -encoding utf8