.Phony: all test testAST

all: MiniPython.g4
	antlr4 MiniPython.g4 -visitor
	./compile.sh

test: all
	./test.sh

testAST: all
	./testAST.sh
