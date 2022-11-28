import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashSet;

public class SymbolTable {
	Scope scope;
	int indentation = 1; // number of spaces for indentation

	private int getMaxIdSize() {
		return getMaxIdSize(this.scope, 0);
	}

	private int getMaxIdSize(Scope scope, int level) {
		int output = 0;
		var symbolsOfScope = scope.getSymbols();
		for (Entry<String, Symbol> entry : symbolsOfScope.entrySet()) {
			var currentLength = entry.getValue().getId().length() + level * indentation;
			if (currentLength > output) {
				output = currentLength;
			}
		}
		var innerScopes = scope.getInnerScopes();
		for (Entry<String, Scope> entry : innerScopes.entrySet()) {
			var innerOutput = getMaxIdSize(entry.getValue(), level + 1);
			if (innerOutput > output) {
				output = innerOutput;
			}
		}
		if (output < 4) {
			return 4;
		}
		return output;
	}

	public SymbolTable(Scope scope) {
		this.scope = scope;
	}

	private void printScope(Scope scope, int level, int maxIdSize) {
		var bar = "---------------";
		for (int i = 0; i < maxIdSize; i++) {
			bar += "-";
		}
		System.out.println(bar);
		var skipSet = new HashSet<Scope>();
		var innerScopes = scope.getInnerScopes();
		var symbols = new ArrayList<Symbol>();
		var symbolsOfScope = scope.getSymbols();
		for (Entry<String, Symbol> entry : symbolsOfScope.entrySet()) {
			symbols.add(entry.getValue());
		}
		for (int i = 0; i < symbols.size(); i++) {
			var currentSymbolId = symbols.get(i).getId();
			var currentRow = "| ";
			var currentLength = 0;
			for (int j = 0; j < level * indentation; j++) {
				currentRow += " ";
			}
			currentLength += level * indentation;
			var currentId = currentSymbolId;
			currentRow += currentId;
			currentLength += currentId.length();
			for (int j = currentLength; j < maxIdSize; j++) {
				currentRow += " ";
			}
			currentRow += " | ";
			var currentType = symbols.get(i).getType();
			if (currentType == null) {
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
			if (currentType != null) {
				if (currentType.getName().equals("class")) {
					for (Entry<String, Scope> entry : innerScopes.entrySet()) {
						var scopeOfClass = entry.getValue().resolveClass(currentSymbolId);
						if (scopeOfClass != null) {
							skipSet.add(entry.getValue());
							printScope(scopeOfClass, level + 1, maxIdSize);
						}
					}
				}
			}
		}
		for (Entry<String, Scope> entry : innerScopes.entrySet()) {
			if (!skipSet.contains(entry.getValue())) {
				printScope(entry.getValue(), level + 1, maxIdSize);
			}
		}
	}

	public void print() {
		System.out.println("Symbol table:");
		int maxIdSize = getMaxIdSize();
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
		printScope(scope, 0, maxIdSize);
		System.out.println(bar);
	}
}
