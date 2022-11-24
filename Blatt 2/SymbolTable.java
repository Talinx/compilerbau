import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;

public class SymbolTable {
	List<Symbol> symbols;

	private void addSymbolsFromScope(Scope scope) {
		var symbolsOfScope = scope.getSymbols();
		for (Entry<String, Symbol> entry : symbolsOfScope.entrySet()) {
			symbols.add(entry.getValue());
		}
		var innerScopes = scope.getInnerScopes();
		for (Entry<String, Scope> entry : innerScopes.entrySet()) {
			this.addSymbolsFromScope(entry.getValue());
		}
	}

	public SymbolTable(Scope scope) {
		this.symbols = new ArrayList<Symbol>();
		this.addSymbolsFromScope(scope);
	}

	public void print() {
		System.out.println("Symbol table:");
		for (int i = 0; i < symbols.size(); i++) {
			System.out.println(symbols.get(i).getId());
		}
	}
}
