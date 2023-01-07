package compilerbau.ASTNodes;
public class BooleanLiteralASTNode extends LiteralASTNode {
	boolean content;

	public BooleanLiteralASTNode(boolean value) {
		this.content = value;
	}

	public boolean getContent() {
		return this.content;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "Boolean: " + this.content);
	}

	@Override
	public String toString() {
    	return content + " (" + super.toString() + ")";
    }
}
