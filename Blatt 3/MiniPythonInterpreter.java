import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

class MiniPythonInterpreter {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		if (args.length < 1) {
			System.out.println("No input file specified.");
			System.exit(1);
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
		} catch (RecognitionException e) {
			System.out.println("Something went wrong.");
			System.exit(1);
		}
	}
}
