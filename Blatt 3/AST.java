import java.util.List;

public class AST extends ASTNode {
	List<ASTNode> content;

	public AST(List<ASTNode> content) {
		this.content = content;
	}

	@Override
	public void print(int level) {
		for (ASTNode astNode : content) {
			astNode.print(0);
		}
	}

	
}
