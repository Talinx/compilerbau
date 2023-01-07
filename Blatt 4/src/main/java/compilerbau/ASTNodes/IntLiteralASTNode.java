package compilerbau.ASTNodes;
public class IntLiteralASTNode extends LiteralASTNode {
	String content;

	public IntLiteralASTNode(String text) {
		this.content = text;
	}

	public String getContent() {
		return this.content;
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
