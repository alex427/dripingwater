// Generated from E:/undergithub/flowingwater/flowingwater/springboot/driping-water/common/src/main/java/alex/learn/antlr/demo/demo4\OracleQuery.g4 by ANTLR 4.7
package alex.learn.antlr.demo4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OracleQueryParser}.
 */
public interface OracleQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(OracleQueryParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(OracleQueryParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(OracleQueryParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(OracleQueryParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(OracleQueryParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(OracleQueryParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(OracleQueryParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(OracleQueryParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(OracleQueryParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(OracleQueryParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(OracleQueryParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(OracleQueryParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(OracleQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(OracleQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(OracleQueryParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(OracleQueryParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void enterGroupByCaluse(OracleQueryParser.GroupByCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void exitGroupByCaluse(OracleQueryParser.GroupByCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void enterHavingCaluse(OracleQueryParser.HavingCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void exitHavingCaluse(OracleQueryParser.HavingCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(OracleQueryParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(OracleQueryParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(OracleQueryParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(OracleQueryParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(OracleQueryParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(OracleQueryParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(OracleQueryParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(OracleQueryParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(OracleQueryParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(OracleQueryParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(OracleQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(OracleQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(OracleQueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(OracleQueryParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(OracleQueryParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(OracleQueryParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(OracleQueryParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(OracleQueryParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link OracleQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(OracleQueryParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link OracleQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(OracleQueryParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link OracleQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(OracleQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link OracleQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(OracleQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(OracleQueryParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(OracleQueryParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link OracleQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(OracleQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link OracleQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(OracleQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(OracleQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(OracleQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(OracleQueryParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(OracleQueryParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(OracleQueryParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(OracleQueryParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(OracleQueryParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(OracleQueryParser.UidContext ctx);
}