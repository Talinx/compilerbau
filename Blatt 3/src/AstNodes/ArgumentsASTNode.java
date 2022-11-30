package src.AstNodes;
import java.util.List;

public class ArgumentsASTNode extends ASTNode {
	List<ASTNode> arguments;
	
	public ArgumentsASTNode(List<ASTNode> arguments) {
		this.arguments = arguments;
	}
}
