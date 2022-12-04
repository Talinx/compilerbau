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

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "Class " + this.name.id.getText());
		if (superName != null)
			System.out.println(baseIndentation(level+1) + "Superclass " + this.superName.id.getText());
		System.out.println(baseIndentation(level+1) + "Variables:");
		for (VariableAssignmentASTNode variableAssignmentASTNode : variables) {
			variableAssignmentASTNode.print(level+1);
		}
		System.out.println(baseIndentation(level+1) + "Methods:");
		for (FunctionDefinitionASTNode functionDefinitionASTNode : functions) {
			functionDefinitionASTNode.print(level+1);
		}
	}
}
