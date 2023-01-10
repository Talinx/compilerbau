package compilerbau;

import java.util.function.Consumer;
import java.util.function.Function;

import compilerbau.ASTNodes.BooleanLiteralASTNode;
import compilerbau.ASTNodes.ClassASTNode;
import compilerbau.ASTNodes.FunctionDefinitionASTNode;
import compilerbau.ASTNodes.IntLiteralASTNode;
import compilerbau.ASTNodes.StringLiteralASTNode;
import compilerbau.ASTNodes.ASTNode;

class InterpreterContext {
	ExprEvalType evalType;
	int intV;
	String strV;
	boolean booleanV;
    FunctionDefinitionASTNode AstRefV;
    Environment ClassEnv;
    ClassASTNode classAstRef;
    Function<Object, Object> JavaFuncRefV;
    Consumer<String> JavaConsRefV;

	public InterpreterContext(ExprEvalType evalType) {
		this.evalType = evalType;
	}

	public InterpreterContext(int value) {
		this.evalType = ExprEvalType.INTEGER;
		this.intV = value;
	}

	public InterpreterContext(String value) {
		this.evalType = ExprEvalType.STRING;
		this.strV = value;
	}

	public InterpreterContext(boolean value) {
		this.evalType = ExprEvalType.BOOLEAN;
		this.booleanV = value;
	}

    public InterpreterContext(FunctionDefinitionASTNode astNodeRef) {
		this.evalType = ExprEvalType.FUNCASTNODE;
		this.AstRefV = astNodeRef;
	}

    public InterpreterContext(Environment classEnv) {
		this.evalType = ExprEvalType.CLASSENV;
		this.ClassEnv = classEnv;
	}

    public InterpreterContext(Function<Object, Object> javaFuncRefV) {
		this.evalType = ExprEvalType.BUILTINFUNC;
		this.JavaFuncRefV = javaFuncRefV;
	}

    public InterpreterContext(Consumer<String> javaFuncRefV) {
		this.evalType = ExprEvalType.BUILTINFUNC;
		this.JavaConsRefV = javaFuncRefV;
	}

    public InterpreterContext(ClassASTNode classAstRef) {
		this.evalType = ExprEvalType.CLASS;
		this.classAstRef = classAstRef;
	}

	public int getIntValue() {
		return this.intV;
	}

	public String getStringValue() {
		return this.strV;
	}

	public boolean getBooleanValue() {
		return this.booleanV;
	}

	public ExprEvalType getEvalType() {
		return this.evalType;
	}

	public boolean isTruthy() {
		switch(this.evalType) {
		case INTEGER:
			return this.intV != 0;
		case STRING:
			return this.strV.length() > 0;
		case BOOLEAN:
			return this.booleanV;
		default:
			return false;
		}
	}

	public static InterpreterContext from(IntLiteralASTNode node) {
		InterpreterContext context = new InterpreterContext(ExprEvalType.INTEGER);
		var content = node.getContent();
		context.intV = Integer.parseInt(content);
		return context;
	}

	public static InterpreterContext from(StringLiteralASTNode node) {
		InterpreterContext context = new InterpreterContext(ExprEvalType.STRING);
		context.strV = node.getContent();
		return context;
	}

	public static InterpreterContext from(BooleanLiteralASTNode node) {
		InterpreterContext context = new InterpreterContext(ExprEvalType.BOOLEAN);
		context.booleanV = node.getContent();
		return context;
	}
}
