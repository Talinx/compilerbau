package compilerbau;

// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPythonParser}.
 */
public interface MiniPythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#startbuildingblock}.
	 * @param ctx the parse tree
	 */
	void enterStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#startbuildingblock}.
	 * @param ctx the parse tree
	 */
	void exitStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MiniPythonParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MiniPythonParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#startfile}.
	 * @param ctx the parse tree
	 */
	void enterStartfile(MiniPythonParser.StartfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#startfile}.
	 * @param ctx the parse tree
	 */
	void exitStartfile(MiniPythonParser.StartfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiniPythonParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiniPythonParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void enterEllipsis(MiniPythonParser.EllipsisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void exitEllipsis(MiniPythonParser.EllipsisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniPythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniPythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MiniPythonParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MiniPythonParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MiniPythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MiniPythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#classid}.
	 * @param ctx the parse tree
	 */
	void enterClassid(MiniPythonParser.ClassidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#classid}.
	 * @param ctx the parse tree
	 */
	void exitClassid(MiniPythonParser.ClassidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#parameterdecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterdecl(MiniPythonParser.ParameterdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#parameterdecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterdecl(MiniPythonParser.ParameterdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#deffunccontent}.
	 * @param ctx the parse tree
	 */
	void enterDeffunccontent(MiniPythonParser.DeffunccontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#deffunccontent}.
	 * @param ctx the parse tree
	 */
	void exitDeffunccontent(MiniPythonParser.DeffunccontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#deffunc}.
	 * @param ctx the parse tree
	 */
	void enterDeffunc(MiniPythonParser.DeffuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#deffunc}.
	 * @param ctx the parse tree
	 */
	void exitDeffunc(MiniPythonParser.DeffuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#parametercall}.
	 * @param ctx the parse tree
	 */
	void enterParametercall(MiniPythonParser.ParametercallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#parametercall}.
	 * @param ctx the parse tree
	 */
	void exitParametercall(MiniPythonParser.ParametercallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(MiniPythonParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(MiniPythonParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#classfunccall}.
	 * @param ctx the parse tree
	 */
	void enterClassfunccall(MiniPythonParser.ClassfunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#classfunccall}.
	 * @param ctx the parse tree
	 */
	void exitClassfunccall(MiniPythonParser.ClassfunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#ifElifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElifElse(MiniPythonParser.IfElifElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#ifElifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElifElse(MiniPythonParser.IfElifElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(MiniPythonParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(MiniPythonParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#elses}.
	 * @param ctx the parse tree
	 */
	void enterElses(MiniPythonParser.ElsesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#elses}.
	 * @param ctx the parse tree
	 */
	void exitElses(MiniPythonParser.ElsesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#whileCall}.
	 * @param ctx the parse tree
	 */
	void enterWhileCall(MiniPythonParser.WhileCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#whileCall}.
	 * @param ctx the parse tree
	 */
	void exitWhileCall(MiniPythonParser.WhileCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#baseexpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseexpr(MiniPythonParser.BaseexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#baseexpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseexpr(MiniPythonParser.BaseexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#opadd}.
	 * @param ctx the parse tree
	 */
	void enterOpadd(MiniPythonParser.OpaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#opadd}.
	 * @param ctx the parse tree
	 */
	void exitOpadd(MiniPythonParser.OpaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#opmul}.
	 * @param ctx the parse tree
	 */
	void enterOpmul(MiniPythonParser.OpmulContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#opmul}.
	 * @param ctx the parse tree
	 */
	void exitOpmul(MiniPythonParser.OpmulContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#opcompare}.
	 * @param ctx the parse tree
	 */
	void enterOpcompare(MiniPythonParser.OpcompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#opcompare}.
	 * @param ctx the parse tree
	 */
	void exitOpcompare(MiniPythonParser.OpcompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#opand}.
	 * @param ctx the parse tree
	 */
	void enterOpand(MiniPythonParser.OpandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#opand}.
	 * @param ctx the parse tree
	 */
	void exitOpand(MiniPythonParser.OpandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#opdisjunction}.
	 * @param ctx the parse tree
	 */
	void enterOpdisjunction(MiniPythonParser.OpdisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#opdisjunction}.
	 * @param ctx the parse tree
	 */
	void exitOpdisjunction(MiniPythonParser.OpdisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#opnot}.
	 * @param ctx the parse tree
	 */
	void enterOpnot(MiniPythonParser.OpnotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#opnot}.
	 * @param ctx the parse tree
	 */
	void exitOpnot(MiniPythonParser.OpnotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniPythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniPythonParser.ExprContext ctx);
}