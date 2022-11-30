package src.AstNodes;
public class EqualsASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public EqualsASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
