package alex.learn.antlr.demo3;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link HelloParser#helloWork}.
     *
     * @param ctx the parse tree
     */
    void enterHelloWork(HelloParser.HelloWorkContext ctx);

    /**
     * Exit a parse tree produced by {@link HelloParser#helloWork}.
     *
     * @param ctx the parse tree
     */
    void exitHelloWork(HelloParser.HelloWorkContext ctx);
}