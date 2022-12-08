import java.util.List;

public class BodyASTNode extends ASTNode {
	List<ASTNode> statements;
	
	public BodyASTNode(List<ASTNode> statements) {
		this.statements = statements;
	}

	public List<ASTNode> getContent() {
		return this.statements;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "BodyASTNode");
		for (ASTNode astNode : statements) {
			astNode.print(level+1);
		}
	}
}
