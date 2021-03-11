package alex.learn.antlr.demo3;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link HelloParser#helloWork}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHelloWork(HelloParser.HelloWorkContext ctx);
}