package src.AstNodes;

public class VariableAssignmentASTNode extends ASTNode {
	IDASTNode id;
	ASTNode expr;

	public VariableAssignmentASTNode(IDASTNode id, ASTNode expr) {
		this.id = id;
		this.expr = expr;
	}
}
