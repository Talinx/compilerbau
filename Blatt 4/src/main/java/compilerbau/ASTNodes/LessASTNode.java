package compilerbau.ASTNodes;
public class LessASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public LessASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}

	public ASTNode getLeft() {
		return this.left;
	}

	public ASTNode getRight() {
		return this.right;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "LessASTNode");
		System.out.println(baseIndentation(level) + "  left:");
		left.print(level+1);
		System.out.println(baseIndentation(level) + "  right:");
		right.print(level+1);
	}
}
