package src.AstNodes;
public class PlusASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public PlusASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
