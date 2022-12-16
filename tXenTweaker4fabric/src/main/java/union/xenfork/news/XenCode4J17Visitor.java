package union.xenfork.news;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XenCode4J17Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XenCode4J17Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(XenCode4J17Parser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(XenCode4J17Parser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#xenfork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXenfork(XenCode4J17Parser.XenforkContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#jh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJh(XenCode4J17Parser.JhContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#iv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIv(XenCode4J17Parser.IvContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#iiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIiv(XenCode4J17Parser.IivContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#iiiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIiiv(XenCode4J17Parser.IiivContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(XenCode4J17Parser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(XenCode4J17Parser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(XenCode4J17Parser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCode4J17Parser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(XenCode4J17Parser.BContext ctx);
}