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
import java.util.function.Function;

import static union.xenfork.FileLoader.loadFile;

public class TXen {
    public record Record(String className, Object value) {}
    public static List<String> extension = new ArrayList<>();
    public Map<String, Record> gobal = new HashMap<>();//全局变量
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
        public Map<String, Record> val = new HashMap<>();//局部变量
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
        public Void visitTmp(XenCodeParser.TmpContext ctx) {
            if (!ctx.boolean_().isEmpty()) {
                val.put(ctx.boolean_().NAME().toString(), new Record("bool", ctx.boolean_().BOOL()));
            } else if (!ctx.booleans().isEmpty()) {
                val.put(ctx.booleans().NAME().toString(), new Record("bools", ctx.booleans().BOOL()));
            } else if (!ctx.double_().isEmpty()) {
                val.put(ctx.double_().NAME().toString(), new Record("double", ctx.double_().DOUBLE()));
            } else if (!ctx.doubles().isEmpty()) {
                val.put(ctx.doubles().NAME().toString(), new Record("doubles", ctx.doubles().DOUBLE()));
            } else if (!ctx.float_().isEmpty()) {
                val.put(ctx.float_().NAME().toString(), new Record("float", ctx.float_().FLOAT()));
            } else if (!ctx.floats().isEmpty()) {
                val.put(ctx.floats().NAME().toString(), new Record("floats", ctx.floats().FLOAT()));
            } else if (!ctx.int_().isEmpty()) {
                val.put(ctx.int_().NAME().toString(), new Record("int", ctx.int_().INT()));
            } else if (!ctx.ints().isEmpty()) {
                val.put(ctx.ints().NAME().toString(), new Record("ints", ctx.ints().INT()));
            } else if (!ctx.long_().isEmpty()) {
                val.put(ctx.long_().NAME().toString(), new Record("long", ctx.long_().LONG()));
            } else if (!ctx.longs().isEmpty()) {
                val.put(ctx.longs().NAME().toString(), new Record("longs", ctx.longs().LONG()));
            } else if (!ctx.str().isEmpty()) {
                val.put(ctx.str().NAME().toString(), new Record("string", ctx.str().STRING()));
            } else if (!ctx.strings().isEmpty()) {
                val.put(ctx.strings().NAME().toString(), new Record("strings", ctx.strings().STRING()));
            } else if (!ctx.val().isEmpty()) {
                if (!ctx.val().BOOL().isEmpty()) {
                    val.put(ctx.val().toString(), new Record("val", ctx.val().BOOL()));
                } else if (!ctx.val().INT().isEmpty()) {
                    val.put(ctx.val().toString(), new Record("val", ctx.val().INT()));
                } else if (!ctx.val().DOUBLE().isEmpty()) {
                    val.put(ctx.val().toString(), new Record("val", ctx.val().DOUBLE()));
                } else if (!ctx.val().FLOAT().isEmpty()) {
                    val.put(ctx.val().toString(), new Record("val", ctx.val().FLOAT()));
                } else if (!ctx.val().LONG().isEmpty()) {
                    val.put(ctx.val().toString(), new Record("val", ctx.val().LONG()));
                } else if (!ctx.val().STRING().isEmpty()) {
                    val.put(ctx.val().toString(), new Record("val", ctx.val().STRING()));
                }
            } else if (!ctx.var().isEmpty()) {
                if (!ctx.var().BOOL().isEmpty()) {
                    val.put(ctx.var().toString(), new Record("var", ctx.var().BOOL()));
                } else if (!ctx.var().INT().isEmpty()) {
                    val.put(ctx.var().toString(), new Record("var", ctx.var().INT()));
                } else if (!ctx.var().DOUBLE().isEmpty()) {
                    val.put(ctx.var().toString(), new Record("var", ctx.var().DOUBLE()));
                } else if (!ctx.var().FLOAT().isEmpty()) {
                    val.put(ctx.var().toString(), new Record("var", ctx.var().FLOAT()));
                } else if (!ctx.var().LONG().isEmpty()) {
                    val.put(ctx.var().toString(), new Record("var", ctx.var().LONG()));
                } else if (!ctx.var().STRING().isEmpty()) {
                    val.put(ctx.var().toString(), new Record("var", ctx.var().STRING()));
                }
            } else if (!ctx.imports().isEmpty()) {
                val.put(ctx.imports().NAME(0).toString(), new Record("import", ctx.imports().NAME(1)));
            }
            return super.visitTmp(ctx);
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
