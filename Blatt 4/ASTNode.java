public abstract class ASTNode {
	ASTNode children;

	public abstract void print(int level);

	protected String baseIndentation(int level) {
		String temp = "";
		for (int i = 0; i < level; i++) {
			temp += "  ";
		}
		return temp;
	}
}
