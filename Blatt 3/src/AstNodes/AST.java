package src.AstNodes;
import java.util.List;

public class AST extends ASTNode {
	List<ASTNode> content;

	public AST(List<ASTNode> content) {
		this.content = content;
	}
}
