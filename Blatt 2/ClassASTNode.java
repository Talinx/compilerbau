import java.util.List;

public class ClassASTNode extends ASTNode {
	IDASTNode name;
	IDASTNode superName;
	List<VariableAssignmentASTNode> variables;
	List<FunctionDefinitionASTNode> functions;

	public ClassASTNode(IDASTNode name, IDASTNode superName, List<VariableAssignmentASTNode> variables, List<FunctionDefinitionASTNode> functions) {
		this.name = name;
		this.superName = superName;
		this.variables = variables;
		this.functions = functions;
	}
}
