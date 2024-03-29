package compilerbau;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import compilerbau.ASTNodes.ASTNode;

class MiniPythonInterpreter {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		if (args.length < 1) {
			runInteractiveInterperter();
		}
		CharStream inputStream = null;
		try {
			inputStream = CharStreams.fromFileName(args[0]);
		} catch (IOException e) {
			System.out.println("Something went wrong.");
			System.exit(1);
		}
		var lexer = new MiniPythonLexer(inputStream);
		var tokenStream = new CommonTokenStream(lexer);
		var parser = new MiniPythonParser(tokenStream);
		try {
			var cst = parser.startfile();
			var astVisitor = new ASTVisitor();
			var ast = (AST) astVisitor.visitStartfile(cst);
			ast.print(0);
			var scopeListener = new ScopeListener();
			ParseTreeWalker.DEFAULT.walk(scopeListener, cst);
			var symbolTable = new SymbolTable(scopeListener.getScope());
			symbolTable.print();
			ControlFlowGraph<List<ASTNode>> cfg = ControlFlowGraph.constructWithASTNodes(ast);
			cfg.print();
			var interpreter = new ASTInterpreter(ast, scopeListener.getScope());
			System.out.println("Program output:");
			interpreter.interpret();
		} catch (RecognitionException e) {
			System.out.println("Something went wrong.");
			System.exit(1);
		}
	}

    private static void runInteractiveInterperter() {
        var interpreterBuilder = new ASTInterpreterBuilder();
        var scanner = new Scanner(System.in);
        boolean isInMultiLine = false;
        String tempStorage = null;
        while(true) {
            if (!isInMultiLine) {
                System.out.print(">>> ");
                var input = scanner.nextLine();
                if (input.startsWith("def") || 
                    input.startsWith("class") ||
                    input.startsWith("if") || 
                    input.startsWith("while")) {
                    isInMultiLine = true;
                    tempStorage = input;
                }
                else {
                    interpreterBuilder.getInstance().interpretInteractive(input);
                }
            }
            else {
                System.out.print("... ");
                var input = scanner.nextLine();
                if (input.isBlank()){
                    interpreterBuilder.getInstance().interpretInteractive(tempStorage + "\n");
                    isInMultiLine = false;
                    tempStorage = null;
                }
                else {
                    tempStorage = tempStorage + "\n" + input;
                }
            }
        }
    }
}
