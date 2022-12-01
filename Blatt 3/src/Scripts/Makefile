.Phony: all test testAST

all:
	antlr4 ../MiniPython.g4 -o ../Antlr/ -visitor
	sh ./compile.sh

test: all
	./test.sh

testAST: all
	./testAST.sh
