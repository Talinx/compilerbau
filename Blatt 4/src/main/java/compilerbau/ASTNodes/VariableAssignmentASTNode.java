package compilerbau.ASTNodes;

public class VariableAssignmentASTNode extends ASTNode {
	IDASTNode id;
	ASTNode expr;

	public VariableAssignmentASTNode(IDASTNode id, ASTNode expr) {
		this.id = id;
		this.expr = expr;
	}

	public IDASTNode getId() {
		return this.id;
	}

	public ASTNode getExpr() {
		return this.expr;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "VariableAssignmentASTNode");
		System.out.print(baseIndentation(level+1) + "ID: ");
		id.print(0);
		System.out.print("\n");
		System.out.println(baseIndentation(level+1) + "Value: ");
		expr.print(level+2);
	}

	@Override
	public String toString() {
    	return id.toString() + " = " + expr.toString() + " (" + super.toString() + ")";
    }
}
