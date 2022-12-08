public class IntLiteralASTNode extends LiteralASTNode {
	String content;

	public IntLiteralASTNode(String text) {
		this.content = text;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "Int: " + content);
	}

	@Override
	public String toString() {
    	return content + " (" + super.toString() + ")";
    }
}
