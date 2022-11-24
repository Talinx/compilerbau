import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ScopeListener implements MiniPythonListener {
	Scope scope;

	public void enterStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx){

	}

	public void exitStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx){

	}

	public void enterStart(MiniPythonParser.StartContext ctx){
		scope = BuiltinIdsScope.getInstance();
	}

	public void exitStart(MiniPythonParser.StartContext ctx){

	}

	public void enterStartfile(MiniPythonParser.StartfileContext ctx){
		scope = BuiltinIdsScope.getInstance();
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

	}


	public void exitClassDef(MiniPythonParser.ClassDefContext ctx){

	}

	public void enterClassid(MiniPythonParser.ClassidContext ctx){

	}

	public void exitClassid(MiniPythonParser.ClassidContext ctx){

	}

	public void enterVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx){

	}

	public void exitVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx){
		var id = ctx.ID().getSymbol().getText();
		var symbol = new Symbol(id);
		scope.bind(symbol);
	}

	public void enterParameterdecl(MiniPythonParser.ParameterdeclContext ctx){

	}

	public void exitParameterdecl(MiniPythonParser.ParameterdeclContext ctx){

	}
	
	public void enterDeffunccontent(MiniPythonParser.DeffunccontentContext ctx){

	}

	public void exitDeffunccontent(MiniPythonParser.DeffunccontentContext ctx){

	}

	public void enterDeffunc(MiniPythonParser.DeffuncContext ctx){

	}

	public void exitDeffunc(MiniPythonParser.DeffuncContext ctx){

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