import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.RuleNode;

public class ASTVisitor implements MiniPythonVisitor<ASTNode> {
	@Override
	public ASTNode visit(ParseTree tree) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx) {
		var statementCtx = ctx.statement();
		if (statementCtx != null) {
			return this.visitStatement(statementCtx);
		}
		var funcDefCtx = ctx.funcDef();
		if (funcDefCtx != null) {
			return this.visitFuncDef(funcDefCtx);
		}
		var classDefCtx = ctx.classDef();
		if (classDefCtx != null) {
			return this.visitClassDef(classDefCtx);
		}
		var ifElifElseCtx = ctx.ifElifElse();
		if (ifElifElseCtx != null) {
			return this.visitIfElifElse(ifElifElseCtx);
		}
		var whileCallCtx = ctx.whileCall();
		return this.visitWhileCall(whileCallCtx);
	}

	@Override
	public ASTNode visitStart(MiniPythonParser.StartContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitStartfile(MiniPythonParser.StartfileContext ctx) {
		// TODO: implement
		for (int i = 0; i < ctx.children.size(); i++) {
			var subCtx = ctx.startbuildingblock(0);
			this.visitStartbuildingblock(subCtx);
		}
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitLiteral(MiniPythonParser.LiteralContext ctx) {
		// super.visitLiteral(ctx); // TODO: is this necessary?
		// TODO: get literal type, add value to node
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitEllipsis(MiniPythonParser.EllipsisContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitStatement(MiniPythonParser.StatementContext ctx) {
		var ellipsisCtx = ctx.ellipsis();
		if (ellipsisCtx != null) {
			return this.visitEllipsis(ellipsisCtx);
		}
		var classDefCtx = ctx.classDef();
		if (classDefCtx != null) {
			return this.visitClassDef(classDefCtx);
		}
		var deffuncCtx = ctx.deffunc();
		if (deffuncCtx != null) {
			return this.visitDeffunc(deffuncCtx);
		}
		var variableAssignmentCtx = ctx.variableAssignment();
		if (variableAssignmentCtx != null) {
			return this.visitVariableAssignment(variableAssignmentCtx);
		}
		var ifElifElseCtx = ctx.ifElifElse();
		if (ifElifElseCtx != null) {
			return this.visitIfElifElse(ifElifElseCtx);
		}
		var whileCallCtx = ctx.whileCall();
		if (whileCallCtx != null) {
			return this.visitWhileCall(whileCallCtx);
		}
		var exprCtx = ctx.expr();
		return this.visitExpr(exprCtx);
	}

	@Override
	public ASTNode visitBody(MiniPythonParser.BodyContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitClassDef(MiniPythonParser.ClassDefContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitClassid(MiniPythonParser.ClassidContext ctx) {
		var classId = ctx.ID(0);
		var id = ctx.ID(1);
		return new IDASTNode(classId.getSymbol(), id.getSymbol());
	}

	@Override
	public ASTNode visitVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx) {
		var id = ctx.ID();
		IDASTNode idNode = null;
		var classId = ctx.classid();
		if (classId != null) {
			idNode = (IDASTNode) this.visitClassid(classId);
		} else {
			idNode = new IDASTNode(id.getSymbol());
		}
		var exprCtx = ctx.expr();
		var exprNode = this.visitExpr(exprCtx);
		return new VariableAssignmentASTNode(idNode, exprNode);
	}

	@Override
	public ASTNode visitParameterdecl(MiniPythonParser.ParameterdeclContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitDeffunccontent(MiniPythonParser.DeffunccontentContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitDeffunc(MiniPythonParser.DeffuncContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitFuncDef(MiniPythonParser.FuncDefContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitParametercall(MiniPythonParser.ParametercallContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitFunccall(MiniPythonParser.FunccallContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitClassfunccall(MiniPythonParser.ClassfunccallContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitIfElifElse(MiniPythonParser.IfElifElseContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitElif(MiniPythonParser.ElifContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitElses(MiniPythonParser.ElsesContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitWhileCall(MiniPythonParser.WhileCallContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitMathMulDiv(MiniPythonParser.MathMulDivContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitMathAddSub(MiniPythonParser.MathAddSubContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitAssertOperator(MiniPythonParser.AssertOperatorContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitBaseexpr(MiniPythonParser.BaseexprContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitOpadd(MiniPythonParser.OpaddContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitOpmul(MiniPythonParser.OpmulContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitOpcompare(MiniPythonParser.OpcompareContext ctx) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitOpand(MiniPythonParser.OpandContext ctx) {
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var count = ctx.opcompare().size();
		if (count == 1) {
			return this.visitOpcompare(ctx.opcompare(0));
		}
		/*
		visit A CMP B CMP C in such a way:
				CMP
			/		\
			A		CMP
				/		\
				B		C
		*/
		AndASTNode output = null;
		var lastCtx = ctx.opcompare(count - 1);
		var secondToLastCtx = ctx.opcompare(count - 2);
		var lastNode = this.visitOpcompare(lastCtx);
		var secondToLastNode = this.visitOpcompare(secondToLastCtx);
		output = new AndASTNode(secondToLastNode, lastNode);
		for (int i = (count - 3); i >= 0; i--) {
			var currentCtx = ctx.opcompare(i);
			var currentNode = this.visitOpcompare(currentCtx);
			output = new AndASTNode(currentNode, output);
		}
		return output;
	}

	@Override
	public ASTNode visitOpdisjunction(MiniPythonParser.OpdisjunctionContext ctx) {
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var count = ctx.opand().size();
		if (count == 1) {
			return this.visitOpand(ctx.opand(0));
		}
		/*
		visit A OR B OR C in such a way:
				OR
			/		\
			A		OR
				/		\
				B		C
		*/
		OrASTNode output = null;
		var lastCtx = ctx.opand(count - 1);
		var secondToLastCtx = ctx.opand(count - 2);
		var lastNode = this.visitOpand(lastCtx);
		var secondToLastNode = this.visitOpand(secondToLastCtx);
		output = new OrASTNode(secondToLastNode, lastNode);
		for (int i = (count - 3); i >= 0; i--) {
			var currentCtx = ctx.opand(i);
			var currentNode = this.visitOpand(currentCtx);
			output = new OrASTNode(currentNode, output);
		}
		return output;
	}

	@Override
	public ASTNode visitOpnot(MiniPythonParser.OpnotContext ctx) {
		var opdisjunctionCtx = ctx.opdisjunction();
		if (opdisjunctionCtx != null) {
			return this.visitOpdisjunction(opdisjunctionCtx);
		}
		var opnotCtx = ctx.opnot();
		var opnotNode = this.visitOpnot(opnotCtx);
		return new NotASTNode(opnotNode);
	}

	@Override
	public ASTNode visitExpr(MiniPythonParser.ExprContext ctx) {
		var funccallCtx = ctx.funccall();
		if (funccallCtx != null) {
			return this.visitFunccall(funccallCtx);
		}
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var opnotCtx = ctx.opnot();
		return this.visitOpnot(opnotCtx);
	}

	@Override
	public ASTNode visitErrorNode(ErrorNode node) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitTerminal(TerminalNode node) {
		// TODO: implement
		return new LiteralASTNode();
	}

	@Override
	public ASTNode visitChildren(RuleNode node) {
		// TODO: implement
		return new LiteralASTNode();
	}
}