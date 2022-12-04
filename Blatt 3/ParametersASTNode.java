import java.util.List;

public class ParametersASTNode extends ASTNode {
	List<ParameterASTNode> parameters;
	
	public ParametersASTNode(List<ParameterASTNode> parameters) {
		this.parameters = parameters;
	}

	@Override
	public void print(int level) {
		for (var parameter : parameters) {
			parameter.print(level);
		}
	}
}
