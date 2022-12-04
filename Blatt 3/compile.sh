#!/bin/sh

CLASSPATH=/usr/share/java/antlr4.jar:/usr/share/java/antlr4-runtime.jar
exec javac -cp $CLASSPATH *.java
