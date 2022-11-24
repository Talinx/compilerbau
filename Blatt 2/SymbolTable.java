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
		int maxIdSize = 0;
		for (int i = 0; i < symbols.size(); i++) {
			var currentId = symbols.get(i).getId();
			if (currentId.length() > maxIdSize) {
				maxIdSize = currentId.length();
			}
		}
		if (maxIdSize < 4) {
			maxIdSize = 4;
		}
		var bar = "---------------";
		for (int i = 0; i < maxIdSize; i++) {
			bar += "-";
		}
		var header = "| Name";
		for (int i = 4; i < maxIdSize; i++) {
			header += " ";
		}
		header += " | Type     |";
		System.out.println(bar);
		System.out.println(header);
		System.out.println(bar);
		for (int i = 0; i < symbols.size(); i++) {
			var currentRow = "| ";
			var currentId = symbols.get(i).getId();
			currentRow += currentId;
			for (int j = currentId.length(); j < maxIdSize; j++) {
				currentRow += " ";
			}
			currentRow += " | ";
			if (symbols.get(i).getType() == null) {
				currentRow += "?       ";
			} else {
				var typeName = symbols.get(i).getType().getName();
				currentRow += typeName;
				for (int j = typeName.length(); j < 8; j++) {
					currentRow += " ";
				}
			}
			currentRow += " |";
			System.out.println(currentRow);
		}
		System.out.println(bar);
	}
}
