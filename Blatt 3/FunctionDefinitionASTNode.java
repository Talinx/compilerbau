import java.util.List;

public class FunctionDefinitionASTNode extends ASTNode {
	IDASTNode id;
	ParametersASTNode parameters;
	FunctionContentASTNode content;

	public FunctionDefinitionASTNode(IDASTNode id, ParametersASTNode parameters, FunctionContentASTNode content) {
		this.id = id;
		this.parameters = parameters;
		this.content = content;
	}

	public IDASTNode getId() {
		return this.id;
	}

	public List<ASTNode> getBody() {
		return this.content.getBody();
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "FunctionDef: " + id.id.getText());
		System.out.println(baseIndentation(level+1) + "Parameters: ");
		parameters.print(level+1);
		System.out.println(baseIndentation(level+1) + "Content: ");
		content.print(level+1);
	}

}
