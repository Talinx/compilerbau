package src.AstNodes;
public class GreaterASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public GreaterASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
