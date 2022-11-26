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
        CharStream input = CharStreams.fromString("hello world\n");
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
    }
    static class XenVisitor extends XenCodeBaseVisitor<Void> {
        @Override
        public Void visitField(XenCodeParser.FieldContext ctx) {
            if (ctx.fSTR().STRING() != null) {
                System.out.println("string " + ctx.fSTR().NAME() + "="+ ctx.fSTR().STRING());
            }
            return super.visitField(ctx);
        }

        @Override
        public Void visit(ParseTree tree_) {
            return super.visit(tree_);
        }

        @Override
        public Void visitR(XenCodeParser.RContext ctx) {
            System.out.println("hello" + " " + ctx.NAME());
            return super.visitR(ctx);
        }

        @Override
        public Void visitFSTR(XenCodeParser.FSTRContext ctx) {
            System.out.println("string " + ctx.NAME() + "="+ ctx.STRING());
            return super.visitFSTR(ctx);
        }

        @Override
        public Void visitFINT(XenCodeParser.FINTContext ctx) {
            System.out.println("int " + ctx.NAME() + "=" + ctx.INT());
            return super.visitFINT(ctx);
        }

        @Override
        public Void visitFFLOAT(XenCodeParser.FFLOATContext ctx) {
            System.out.println("float " + ctx.NAME() + "=" + ctx.FLOAT());
            return super.visitFFLOAT(ctx);
        }

        @Override
        public Void visitFDOUBLE(XenCodeParser.FDOUBLEContext ctx) {
            System.out.println("double " + ctx.NAME() + "=" + ctx.DOUBLE());
            return super.visitFDOUBLE(ctx);
        }

        @Override
        public Void visitFBOOLEAN(XenCodeParser.FBOOLEANContext ctx) {
            System.out.println("bool " + ctx.NAME() + "=" + ctx.BOOL());
            return super.visitFBOOLEAN(ctx);
        }
    }
}
