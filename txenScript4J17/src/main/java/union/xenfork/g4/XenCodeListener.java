package union.xenfork.g4;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XenCodeParser}.
 */
public interface XenCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(XenCodeParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(XenCodeParser.RContext ctx);
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
	 * Enter a parse tree produced by {@link XenCodeParser#fIMPORT}.
	 * @param ctx the parse tree
	 */
	void enterFIMPORT(XenCodeParser.FIMPORTContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fIMPORT}.
	 * @param ctx the parse tree
	 */
	void exitFIMPORT(XenCodeParser.FIMPORTContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fSTR}.
	 * @param ctx the parse tree
	 */
	void enterFSTR(XenCodeParser.FSTRContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fSTR}.
	 * @param ctx the parse tree
	 */
	void exitFSTR(XenCodeParser.FSTRContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fINT}.
	 * @param ctx the parse tree
	 */
	void enterFINT(XenCodeParser.FINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fINT}.
	 * @param ctx the parse tree
	 */
	void exitFINT(XenCodeParser.FINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fFLOAT}.
	 * @param ctx the parse tree
	 */
	void enterFFLOAT(XenCodeParser.FFLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fFLOAT}.
	 * @param ctx the parse tree
	 */
	void exitFFLOAT(XenCodeParser.FFLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fDOUBLE}.
	 * @param ctx the parse tree
	 */
	void enterFDOUBLE(XenCodeParser.FDOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fDOUBLE}.
	 * @param ctx the parse tree
	 */
	void exitFDOUBLE(XenCodeParser.FDOUBLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fBOOLEAN}.
	 * @param ctx the parse tree
	 */
	void enterFBOOLEAN(XenCodeParser.FBOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fBOOLEAN}.
	 * @param ctx the parse tree
	 */
	void exitFBOOLEAN(XenCodeParser.FBOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fVAR}.
	 * @param ctx the parse tree
	 */
	void enterFVAR(XenCodeParser.FVARContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fVAR}.
	 * @param ctx the parse tree
	 */
	void exitFVAR(XenCodeParser.FVARContext ctx);
	/**
	 * Enter a parse tree produced by {@link XenCodeParser#fVAL}.
	 * @param ctx the parse tree
	 */
	void enterFVAL(XenCodeParser.FVALContext ctx);
	/**
	 * Exit a parse tree produced by {@link XenCodeParser#fVAL}.
	 * @param ctx the parse tree
	 */
	void exitFVAL(XenCodeParser.FVALContext ctx);
}