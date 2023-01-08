#!/bin/bash
cd src/main/java/compilerbau/
mkdir -p tempantlr
cp MiniPython.g4 tempantlr/
cd tempantlr
antlr4 MiniPython.g4 -visitor
cd ..
cp tempantlr/*.interp .
cp tempantlr/*.tokens .
for f in tempantlr/*.java
do
	fb=$(basename $f)
	echo -e "package compilerbau;\n\n" > $fb
	cat $f >> $fb
done
rm -r tempantlr
cd ../../../..
