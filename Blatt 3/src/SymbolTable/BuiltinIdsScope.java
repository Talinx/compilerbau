package src.SymbolTable;

public class BuiltinIdsScope extends Scope {

	public BuiltinIdsScope() {
		this.bind(new Symbol("print", new FunctionType()));
	}
}
