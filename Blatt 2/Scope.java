import java.util.Map;
import java.util.HashMap;

public class Scope {
	Scope enclosingScope;
	Map<String, Symbol> symbols;

	public Scope() {
		this.enclosingScope = null;
		this.symbols = new HashMap<String, Symbol>();
	}

	public Scope(Scope enclosingScope) {
		this.enclosingScope = enclosingScope;
		this.symbols = new HashMap<String, Symbol>();
	}
	
	public Symbol resolve(String id) {
		var symbolFromThisScope = symbols.get(id);
		if (symbolFromThisScope != null) {
			return symbolFromThisScope;
		}
		if (enclosingScope != null) {
			return enclosingScope.resolve(id);
		}
		return null;
	}

	public void bind(Symbol symbol) {
		symbols.put(symbol.getId(), symbol);
		symbol.setScope(this);
	}
}
