package compilerbau;

// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#startbuildingblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MiniPythonParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#startfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartfile(MiniPythonParser.StartfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiniPythonParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#ellipsis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsis(MiniPythonParser.EllipsisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MiniPythonParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(MiniPythonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#classid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassid(MiniPythonParser.ClassidContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#parameterdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdecl(MiniPythonParser.ParameterdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#deffunccontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffunccontent(MiniPythonParser.DeffunccontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#deffunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffunc(MiniPythonParser.DeffuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#parametercall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametercall(MiniPythonParser.ParametercallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(MiniPythonParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#classfunccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassfunccall(MiniPythonParser.ClassfunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#ifElifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElifElse(MiniPythonParser.IfElifElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(MiniPythonParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#elses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElses(MiniPythonParser.ElsesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#whileCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCall(MiniPythonParser.WhileCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#baseexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseexpr(MiniPythonParser.BaseexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#opadd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpadd(MiniPythonParser.OpaddContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#opmul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpmul(MiniPythonParser.OpmulContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#opcompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcompare(MiniPythonParser.OpcompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#opand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpand(MiniPythonParser.OpandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#opdisjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpdisjunction(MiniPythonParser.OpdisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#opnot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpnot(MiniPythonParser.OpnotContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiniPythonParser.ExprContext ctx);
}