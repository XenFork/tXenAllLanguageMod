package union.xenfork.g4;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XenCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XenCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(XenCodeParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#fSTR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFSTR(XenCodeParser.FSTRContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#fINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFINT(XenCodeParser.FINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#fFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFFLOAT(XenCodeParser.FFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#fVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFVAR(XenCodeParser.FVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#fVAL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFVAL(XenCodeParser.FVALContext ctx);
}