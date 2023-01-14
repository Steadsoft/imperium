del *.java
del *.class
java org.antlr.v4.Tool striterals.g4 
REM java org.antlr.v4.Tool Imperium.g4 -visitor -Dlanguage=CSharp
javac *.java
java org.antlr.v4.gui.TestRig striterals statements striterals.ipl -gui -tokens