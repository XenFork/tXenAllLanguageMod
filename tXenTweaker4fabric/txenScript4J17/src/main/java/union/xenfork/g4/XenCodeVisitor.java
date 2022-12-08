// Generated from java-escape by ANTLR 4.11.1

import java.util.*;
import java.lang.*;

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
	 * Visit a parse tree produced by {@link XenCodeParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(XenCodeParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#sy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSy(XenCodeParser.SyContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#jh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJh(XenCodeParser.JhContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(XenCodeParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(XenCodeParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(XenCodeParser.IContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(XenCodeParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(XenCodeParser.DContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL(XenCodeParser.LContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(XenCodeParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(XenCodeParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(XenCodeParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(XenCodeParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(XenCodeParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong(XenCodeParser.LongContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(XenCodeParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(XenCodeParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#ints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInts(XenCodeParser.IntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#floats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloats(XenCodeParser.FloatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#doubles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubles(XenCodeParser.DoublesContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#longs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongs(XenCodeParser.LongsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#booleans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleans(XenCodeParser.BooleansContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(XenCodeParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriority(XenCodeParser.PriorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(XenCodeParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#addAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddAll(XenCodeParser.AddAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM(XenCodeParser.MContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(XenCodeParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(XenCodeParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(XenCodeParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(XenCodeParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link XenCodeParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(XenCodeParser.RContext ctx);
}