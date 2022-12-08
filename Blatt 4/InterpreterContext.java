class InterpreterContext {
	ExprEvalType evalType;
	int intV;
	String strV;
	boolean booleanV;

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
