package alex.learn.antlr.demo6;

/**
 * author  : zhiguang
 * date    : 2018/7/12
 */
public class MyVisitor extends SqlBaseVisitor<String>{

    @Override
    public String visitCompound_select_stmt(SqlParser.Compound_select_stmtContext ctx) {
        String value=visitCompound_select_stmt(ctx);
        return value;
    }

}
