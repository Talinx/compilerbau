package src.AstNodes;
import java.util.List;

public class BodyASTNode extends ASTNode {
	List<ASTNode> statements;
	
	public BodyASTNode(List<ASTNode> statements) {
		this.statements = statements;
	}
}
