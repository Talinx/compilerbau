public class ParameterASTNode extends ASTNode {
	IDASTNode id;
	
	public ParameterASTNode(IDASTNode id) {
		this.id = id;
	}

	public IDASTNode getId() {
		return this.id;
	}

	@Override
	public void print(int level) {
		System.out.print(baseIndentation(level));
		id.print(level);
		System.out.print("\n");
	}
}
