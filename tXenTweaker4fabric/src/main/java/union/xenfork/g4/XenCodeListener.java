package union.xenfork.g4;// Generated from java-escape by ANTLR 4.11.1

import java.util.*;
import java.lang.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XenCodeParser}.
 */
public interface XenCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(XenCodeParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(XenCodeParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#sy}.
	 * @param ctx the parse tree
	 */
	void enterSy(XenCodeParser.SyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#sy}.
	 * @param ctx the parse tree
	 */
	void exitSy(XenCodeParser.SyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#jh}.
	 * @param ctx the parse tree
	 */
	void enterJh(XenCodeParser.JhContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#jh}.
	 * @param ctx the parse tree
	 */
	void exitJh(XenCodeParser.JhContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(XenCodeParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(XenCodeParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(XenCodeParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(XenCodeParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(XenCodeParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(XenCodeParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(XenCodeParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(XenCodeParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(XenCodeParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(XenCodeParser.DContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(XenCodeParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(XenCodeParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(XenCodeParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(XenCodeParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(XenCodeParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(XenCodeParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(XenCodeParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(XenCodeParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(XenCodeParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(XenCodeParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(XenCodeParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(XenCodeParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#long}.
	 * @param ctx the parse tree
	 */
	void enterLong(XenCodeParser.LongContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#long}.
	 * @param ctx the parse tree
	 */
	void exitLong(XenCodeParser.LongContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(XenCodeParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(XenCodeParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(XenCodeParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(XenCodeParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#ints}.
	 * @param ctx the parse tree
	 */
	void enterInts(XenCodeParser.IntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#ints}.
	 * @param ctx the parse tree
	 */
	void exitInts(XenCodeParser.IntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#floats}.
	 * @param ctx the parse tree
	 */
	void enterFloats(XenCodeParser.FloatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#floats}.
	 * @param ctx the parse tree
	 */
	void exitFloats(XenCodeParser.FloatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#doubles}.
	 * @param ctx the parse tree
	 */
	void enterDoubles(XenCodeParser.DoublesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#doubles}.
	 * @param ctx the parse tree
	 */
	void exitDoubles(XenCodeParser.DoublesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#longs}.
	 * @param ctx the parse tree
	 */
	void enterLongs(XenCodeParser.LongsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#longs}.
	 * @param ctx the parse tree
	 */
	void exitLongs(XenCodeParser.LongsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#booleans}.
	 * @param ctx the parse tree
	 */
	void enterBooleans(XenCodeParser.BooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#booleans}.
	 * @param ctx the parse tree
	 */
	void exitBooleans(XenCodeParser.BooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(XenCodeParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(XenCodeParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#priority}.
	 * @param ctx the parse tree
	 */
	void enterPriority(XenCodeParser.PriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#priority}.
	 * @param ctx the parse tree
	 */
	void exitPriority(XenCodeParser.PriorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#m}.
	 * @param ctx the parse tree
	 */
	void enterM(XenCodeParser.MContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#m}.
	 * @param ctx the parse tree
	 */
	void exitM(XenCodeParser.MContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(XenCodeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(XenCodeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(XenCodeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(XenCodeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(XenCodeParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(XenCodeParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(XenCodeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(XenCodeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fieldA}.
	 * @param ctx the parse tree
	 */
	void enterFieldA(XenCodeParser.FieldAContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fieldA}.
	 * @param ctx the parse tree
	 */
	void exitFieldA(XenCodeParser.FieldAContext ctx);
}