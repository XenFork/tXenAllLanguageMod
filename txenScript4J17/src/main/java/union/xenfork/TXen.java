package union.xenfork;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeLexer;
import union.xenfork.g4.XenCodeParser;
import union.xenfork.g4.XenCodeVisitor;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static union.xenfork.FileLoader.loadFile;

public class TXen {
    public static List<String> extension = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //test
//        init();
        CharStream input = CharStreams.fromString("hello world;");
        XenCodeLexer lexer = new XenCodeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XenCodeParser parser = new XenCodeParser(tokens);
        XenCodeParser.RContext tree = parser.r();
        XenVisitor xv = new XenVisitor();
        xv.visitR(tree);
        input = CharStreams.fromString("int a = 1;");
        lexer = new XenCodeLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new XenCodeParser(tokens);
        XenCodeParser.FINTContext iTree = parser.fINT();
        xv.visitFINT(iTree);
        input = CharStreams.fromString("float a = 0.0f;");
        lexer = new XenCodeLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new XenCodeParser(tokens);
        XenCodeParser.FFLOATContext fTree = parser.fFLOAT();
        xv.visitFFLOAT(fTree);
        input = CharStreams.fromString("string a = \"abc\";");
        lexer = new XenCodeLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new XenCodeParser(tokens);
        XenCodeParser.FSTRContext sTree = parser.fSTR();
        xv.visitFSTR(sTree);
        input = CharStreams.fromString("# 1;");
        lexer = new XenCodeLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new XenCodeParser(tokens);
        XenCodeParser.FIMPORTContext imTree = parser.fIMPORT();
        xv.visitFIMPORT(imTree);
        input = CharStreams.fromString("val a = true;");
        lexer = new XenCodeLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new XenCodeParser(tokens);
        XenCodeParser.FVALContext vTree = parser.fVAL();
        xv.visitFVAL(vTree);
    }
    static class XenVisitor extends XenCodeBaseVisitor<Void> {
        @SuppressWarnings("InfiniteRecursion")
        @Override
        public Void visitField(XenCodeParser.FieldContext ctx) {
            visitField(ctx.field());
            visitF(ctx.f());
            return super.visitField(ctx);
        }

        @Override
        public Void visitF(XenCodeParser.FContext ctx) {
            if (!ctx.fBOOLEAN().isEmpty()) {
                visitFBOOLEAN(ctx.fBOOLEAN());
            } else if (!ctx.fSTR().isEmpty()) {
                visitFSTR(ctx.fSTR());
            } else if (!ctx.fINT().isEmpty()) {
                visitFINT(ctx.fINT());
            } else if (!ctx.fIMPORT().isEmpty()) {
                visitFIMPORT(ctx.fIMPORT());
            } else if (!ctx.fFLOAT().isEmpty()) {
                visitFFLOAT(ctx.fFLOAT());
            } else if (!ctx.fVAL().isEmpty()) {
                visitFVAL(ctx.fVAL());
            } else if (!ctx.fVAR().isEmpty()) {
                visitFVAR(ctx.fVAR());
            } else if (!ctx.fDOUBLE().isEmpty()) {
                visitFDOUBLE(ctx.fDOUBLE());
            }

            return super.visitF(ctx);
        }

        @Override
        public Void visitFBOOLEAN(XenCodeParser.FBOOLEANContext ctx) {
            System.out.println(ctx.NAME() + "=" + ctx.BOOL());
            return super.visitFBOOLEAN(ctx);
        }

        @Override
        public Void visitFSTR(XenCodeParser.FSTRContext ctx) {
            System.out.println(ctx.NAME() + "=" + ctx.STRING().toString());
            return super.visitFSTR(ctx);
        }

        @Override
        public Void visitFINT(XenCodeParser.FINTContext ctx) {
            System.out.println(ctx.NAME() + "=" + ctx.INT());
            return super.visitFINT(ctx);
        }

        @Override
        public Void visitFIMPORT(XenCodeParser.FIMPORTContext ctx) {
            if (!ctx.NAME().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                ctx.NAME().forEach(terminalNode -> {
                    sb.append(terminalNode.toString()).append("   ");
                });
                System.out.println(sb);
            } else {
                System.out.println(ctx.INT());
            }
            return super.visitFIMPORT(ctx);
        }

        @Override
        public Void visitFFLOAT(XenCodeParser.FFLOATContext ctx) {
            System.out.println(ctx.NAME() + "=" + ctx.FLOAT());
            return super.visitFFLOAT(ctx);
        }

        @Override
        public Void visitFVAL(XenCodeParser.FVALContext ctx) {
            StringBuilder sb = new StringBuilder(ctx.NAME().toString() + "=");
            isNotNull(sb,
                    ctx.BOOL(), ctx.STRING(),
                    ctx.DOUBLE(), ctx.FLOAT(),
                    ctx.INT(), ctx.STRING());
            System.out.println(sb);
            return super.visitFVAL(ctx);
        }

        @Override
        public Void visitFVAR(XenCodeParser.FVARContext ctx) {
            StringBuilder sb = new StringBuilder(ctx.NAME().toString() + "=");
            isNotNull(sb,
                    ctx.BOOL(), ctx.STRING(),
                    ctx.DOUBLE(), ctx.FLOAT(),
                    ctx.INT(), ctx.STRING());
            System.out.println(sb);
            return super.visitFVAR(ctx);
        }

        public void isNotNull(StringBuilder sb, TerminalNode... nodes) {
            for (var node : nodes) {
                if (node != null) sb.append(node);
            }
        }
    }
}
