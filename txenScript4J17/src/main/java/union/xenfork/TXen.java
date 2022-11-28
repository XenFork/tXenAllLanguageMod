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
    public Map<String, Map<String, Object>> gobal = new HashMap<>();//全局变量
    public static void main(String[] args) throws IOException {
        var files = loadFile(new File(System.getProperty("user.dir"), "test"));
        for (var file : files) {
            FileLoader fileLoader = new FileLoader(file);
            loadXenScript(fileLoader.toString());
        }
    }

    public static void loadXenScript(String str) {
        CharStream input = CharStreams.fromString(str);
        XenCodeLexer lexer = new XenCodeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XenCodeParser parser = new XenCodeParser(tokens);
        XenCodeParser.AllContext tree = parser.all();
        XenVisitor xv = new XenVisitor();
        xv.visitAll(tree);
    }
    static class XenVisitor extends XenCodeBaseVisitor<Void> {
        public Map<String, Map<String, Object>> val = new HashMap<>();//局部变量
        //第一个string表示name 第二个string表示int val之类的头， Object存各类参数

        @Override
        public Void visitAll(XenCodeParser.AllContext ctx) {
            if (!ctx.all().isEmpty()) {
                visitAll(ctx.all());
            } else if (!ctx.allField().isEmpty()) {
                visitAllField(ctx.allField());
            } else if (!ctx.allMethod().isEmpty()) {
                visitAllMethod(ctx.allMethod());
            }
            return super.visitAll(ctx);
        }

        @Override
        public Void visitAllField(XenCodeParser.AllFieldContext ctx) {
            if (!ctx.allField().isEmpty()) {
                visitAllField(ctx.allField());
            } else if (!ctx.tmp().isEmpty()) {
                visitTmp(ctx.tmp());
            }
            return super.visitAllField(ctx);
        }

        @Override
        public Void visitAllMethod(XenCodeParser.AllMethodContext ctx) {
            if (!ctx.allMethod().isEmpty()) {
                visitAllMethod(ctx.allMethod());
            } else if (!ctx.m().isEmpty()) {
                visitM(ctx.m());
            }
            return super.visitAllMethod(ctx);
        }

        public void isNotNull(StringBuilder sb, TerminalNode... nodes) {
            for (var node : nodes) {
                if (node != null) sb.append(node);
            }
        }
    }
}
