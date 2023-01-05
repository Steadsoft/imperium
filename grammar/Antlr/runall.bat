java org.antlr.v4.Tool Imperium.g4 -visitor
java org.antlr.v4.Tool Imperium.g4 -visitor -Dlanguage=CSharp
javac *.java
java org.antlr.v4.gui.TestRig Imperium translation_unit test_3.ipl -gui 