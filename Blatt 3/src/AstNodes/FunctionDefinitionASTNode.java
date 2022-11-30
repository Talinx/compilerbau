package src.AstNodes;
public class FunctionDefinitionASTNode extends ASTNode {
	IDASTNode id;
	ParametersASTNode parameters;
	FunctionContentASTNode content;

	public FunctionDefinitionASTNode(IDASTNode id, ParametersASTNode parameters, FunctionContentASTNode content) {
		this.id = id;
		this.parameters = parameters;
		this.content = content;
	}

}
