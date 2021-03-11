// Generated from E:/undergithub/flowingwater/flowingwater/springboot/driping-water/common/src/main/java/alex/learn/antlr/demo/demo4\OracleQuery.g4 by ANTLR 4.7
package alex.learn.antlr.demo4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OracleQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OracleQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(OracleQueryParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(OracleQueryParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(OracleQueryParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(OracleQueryParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(OracleQueryParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(OracleQueryParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(OracleQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(OracleQueryParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByCaluse(OracleQueryParser.GroupByCaluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingCaluse(OracleQueryParser.HavingCaluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(OracleQueryParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(OracleQueryParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(OracleQueryParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(OracleQueryParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(OracleQueryParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(OracleQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(OracleQueryParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(OracleQueryParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLiteral(OracleQueryParser.TextLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link OracleQueryParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnElement(OracleQueryParser.SelectColumnElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link OracleQueryParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionElement(OracleQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(OracleQueryParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link OracleQueryParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionCall(OracleQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(OracleQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(OracleQueryParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(OracleQueryParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleQueryParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(OracleQueryParser.UidContext ctx);
}