#!/bin/sh

CLASSPATH=/usr/share/java/stringtemplate4.jar:/usr/share/java/antlr4.jar:/usr/share/java/antlr4-runtime.jar:/usr/share/java/antlr3-runtime.jar/:/usr/share/java/treelayout.jar
exec javac -cp $CLASSPATH MiniPython*.java *AST*.java Scope.java BuiltinIdsScope.java ClassScope.java ScopeListener.java Symbol.java *Type*.java SymbolTable.java MiniPythonInterpreter.java
