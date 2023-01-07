.Phony: all test testAST

all: MiniPython.g4
	antlr4 MiniPython.g4 -visitor
	sh ./compile.sh

test: all
	sh ./test.sh

testAST: all
	sh ./testAST.sh
