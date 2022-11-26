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
        CharStream input = CharStreams.fromString("hello world");
        XenCodeLexer lexer = new XenCodeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XenCodeParser parser = new XenCodeParser(tokens);
        XenCodeParser.RContext tree = parser.r();
        XenVisitor xv = new XenVisitor();
        xv.visitR(tree);

    }

    static class XenVisitor extends XenCodeBaseVisitor<Void> {
        @Override
        public Void visitR(XenCodeParser.RContext ctx) {
            System.out.println("hello" + " " + ctx.ID());
            return super.visitR(ctx);
        }
    }
    public static void init() throws IOException {
        //注入添加后缀名
//        extension.add(".xs");
//        File file = new File(System.getProperty("user.dir"), "test");
//        var a = loadFile(file);
//        for (var b : a) {
//            if (b.getName().contains(".xs")) {
////                extension = readXenCode(b);
//                var fileLoader = new FileLoader(b);
//            }
//        }
    }


}
