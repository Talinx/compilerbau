package src.SymbolTable;

public class FunctionScope extends Scope {
	Symbol id;

	public FunctionScope(Scope enclosingScope, Symbol id) {
		super(enclosingScope, id.getId());
		this.id = id;
	}

	public String getFunctionId() {
		return this.id.getId();
	}
}
