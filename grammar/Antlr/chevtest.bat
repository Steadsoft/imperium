cls
java org.antlr.v4.Tool print.g4 -visitor
javac *.java
java org.antlr.v4.gui.TestRig print print_text chevtest.ipl -gui -tokens -encoding utf8