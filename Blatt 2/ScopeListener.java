import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ScopeListener implements MiniPythonListener {
	Scope scope;

	public Scope getScope() {
		return scope;
	}

	public void enterStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx){

	}

	public void exitStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx){

	}

	public void enterStart(MiniPythonParser.StartContext ctx){
		scope = new BuiltinIdsScope();
	}

	public void exitStart(MiniPythonParser.StartContext ctx){

	}

	public void enterStartfile(MiniPythonParser.StartfileContext ctx){
		scope = new BuiltinIdsScope();
	}

	public void exitStartfile(MiniPythonParser.StartfileContext ctx){

	}

	public void enterLiteral(MiniPythonParser.LiteralContext ctx){

	}

	public void exitLiteral(MiniPythonParser.LiteralContext ctx){

	}

	public void enterEllipsis(MiniPythonParser.EllipsisContext ctx){

	}

	public void exitEllipsis(MiniPythonParser.EllipsisContext ctx){

	}

	public void enterStatement(MiniPythonParser.StatementContext ctx){

	}

	public void exitStatement(MiniPythonParser.StatementContext ctx){

	}

	public void enterBody(MiniPythonParser.BodyContext ctx){
		scope = new Scope(scope);
	}

	public void exitBody(MiniPythonParser.BodyContext ctx){
		scope = scope.getEnclosingScope();
	}

	public void enterClassDef(MiniPythonParser.ClassDefContext ctx){
		var parentId = ctx.ID(1);
		ArrayList<ClassScope> parentScopes = null;
		if (parentId == null) {
			parentScopes = new ArrayList<ClassScope>(0);
		} else {
			var parentScopeSymbol = scope.resolve(ctx.ID(1).getSymbol().getText());
			var parentScope = scope.resolveClass(parentScopeSymbol.getId());
			parentScopes = new ArrayList<ClassScope>(1);
			parentScopes.add(0, parentScope);
		}
		var id = ctx.ID(0).getSymbol().getText();
		var type = new ClassType();
		var symbol = new Symbol(id, type);
		scope.bind(symbol);
		var oldScope = scope;
		scope = new ClassScope(scope, new Symbol(id), parentScopes);
		oldScope.bindScope(id, scope);
	}


	public void exitClassDef(MiniPythonParser.ClassDefContext ctx){
		scope = scope.getEnclosingScope();
	}

	public void enterClassid(MiniPythonParser.ClassidContext ctx){

	}

	public void exitClassid(MiniPythonParser.ClassidContext ctx){

	}

	public void enterVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx){

	}

	public void exitVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx){
		if (ctx.ID().size() == 1) {
			var id = ctx.ID(0).getSymbol().getText();
			var symbol = new Symbol(id);
			scope.bind(symbol);
		} else {
			var classId = ctx.ID(0).getSymbol().getText();
			var id = ctx.ID(1).getSymbol().getText();
			var classScope = scope.resolveClass(classId);
			var symbol = new Symbol(id);
			classScope.bind(symbol);
		}
	}

	public void enterParameterdecl(MiniPythonParser.ParameterdeclContext ctx){

	}

	public void exitParameterdecl(MiniPythonParser.ParameterdeclContext ctx){
		for (int i = 0; i < ctx.ID().size(); i++) {
			var id = ctx.ID(i).getSymbol().getText();
			var symbol = new Symbol(id);
			scope.bind(symbol);
		}
	}
	
	public void enterDeffunccontent(MiniPythonParser.DeffunccontentContext ctx){

	}

	public void exitDeffunccontent(MiniPythonParser.DeffunccontentContext ctx){

	}

	public void enterDeffunc(MiniPythonParser.DeffuncContext ctx){
		var id = ctx.ID().getSymbol().getText();
		var type = new FunctionType();
		var symbol = new Symbol(id, type);
		scope.bind(symbol);
		scope = new Scope(scope);
	}

	public void exitDeffunc(MiniPythonParser.DeffuncContext ctx){
		scope = scope.getEnclosingScope();
	}

	public void enterParametercall(MiniPythonParser.ParametercallContext ctx){

	}

	public void exitParametercall(MiniPythonParser.ParametercallContext ctx){

	}

	public void enterFunccall(MiniPythonParser.FunccallContext ctx){

	}

	public void exitFunccall(MiniPythonParser.FunccallContext ctx){

	}

	public void enterClassfunccall(MiniPythonParser.ClassfunccallContext ctx){

	}

	public void exitClassfunccall(MiniPythonParser.ClassfunccallContext ctx){

	}

	public void enterIfElifElse(MiniPythonParser.IfElifElseContext ctx){

	}

	public void exitIfElifElse(MiniPythonParser.IfElifElseContext ctx){

	}

	public void enterElif(MiniPythonParser.ElifContext ctx){

	}

	public void exitElif(MiniPythonParser.ElifContext ctx){

	}

	public void enterElses(MiniPythonParser.ElsesContext ctx){

	}

	public void exitElses(MiniPythonParser.ElsesContext ctx){

	}

	public void enterWhileCall(MiniPythonParser.WhileCallContext ctx){

	}

	public void exitWhileCall(MiniPythonParser.WhileCallContext ctx){

	}

	public void enterBaseexpr(MiniPythonParser.BaseexprContext ctx){

	}

	public void exitBaseexpr(MiniPythonParser.BaseexprContext ctx){

	}

	public void enterOpadd(MiniPythonParser.OpaddContext ctx){

	}

	public void exitOpadd(MiniPythonParser.OpaddContext ctx){

	}

	public void enterOpmul(MiniPythonParser.OpmulContext ctx){

	}

	public void exitOpmul(MiniPythonParser.OpmulContext ctx){

	}

	public void enterOpcompare(MiniPythonParser.OpcompareContext ctx){

	}

	public void exitOpcompare(MiniPythonParser.OpcompareContext ctx){

	}

	public void enterOpand(MiniPythonParser.OpandContext ctx){

	}

	public void exitOpand(MiniPythonParser.OpandContext ctx){

	}

	public void enterOpdisjunction(MiniPythonParser.OpdisjunctionContext ctx){

	}

	public void exitOpdisjunction(MiniPythonParser.OpdisjunctionContext ctx){

	}

	public void enterOpnot(MiniPythonParser.OpnotContext ctx){

	}

	public void exitOpnot(MiniPythonParser.OpnotContext ctx){

	}

	public void enterExpr(MiniPythonParser.ExprContext ctx){

	}

	public void exitExpr(MiniPythonParser.ExprContext ctx){

	}

	public void enterEveryRule(ParserRuleContext ctx) {

	}

	public void exitEveryRule(ParserRuleContext ctx) {

	}

	public void visitErrorNode(ErrorNode node) {

	}

	public void visitTerminal(TerminalNode node) {

	}
}
