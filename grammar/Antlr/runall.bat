java org.antlr.v4.Tool Post.g4 -visitor
java org.antlr.v4.Tool Post.g4 -visitor -Dlanguage=CSharp
javac *.java
java org.antlr.v4.gui.TestRig Post translation_unit test_3.post -gui 