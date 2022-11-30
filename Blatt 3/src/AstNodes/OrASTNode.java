package src.AstNodes;
public class OrASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public OrASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
