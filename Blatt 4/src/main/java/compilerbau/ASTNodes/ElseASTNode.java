package compilerbau.ASTNodes;
public class ElseASTNode extends ASTNode {
	BodyASTNode body;
	
	public ElseASTNode(BodyASTNode body) {
		this.body = body;
	}

	public BodyASTNode getBody() {
		return this.body;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "ElseASTNode");
		System.out.println(baseIndentation(level+1) + "Body:");
		body.print(level+1);
	}
}
