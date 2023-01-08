package compilerbau.ASTNodes;
public class MulASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public MulASTNode(ASTNode left, ASTNode right) {
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
		System.out.println(baseIndentation(level) + "MulASTNode");
		System.out.println(baseIndentation(level) + "  left:");
		left.print(level+1);
		System.out.println(baseIndentation(level) + "  right:");
		right.print(level+1);
	}
}
