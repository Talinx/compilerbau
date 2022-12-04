import java.util.List;

public class ArgumentsASTNode extends ASTNode {
	List<ASTNode> arguments;
	
	public ArgumentsASTNode(List<ASTNode> arguments) {
		this.arguments = arguments;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "ArgumentsASTNode");
		for (ASTNode astNode : arguments) {
			astNode.print(level+1);
		}
		
	}
}
