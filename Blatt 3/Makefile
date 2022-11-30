.Phony: all test testAST

all: MiniPython.g4
	antlr4 ./src/MiniPython.g4 -visitor
	./src/Scripts/compile.sh

test: all
	./src/Scripts/test.sh

testAST: all
	./src/Scripts/testAST.sh
