package union.xenfork.xenscript;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Pair;
import cn.hutool.core.map.BiMap;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import union.xenfork.xenscript.parser.XenCodeLexer;
import union.xenfork.xenscript.parser.XenCodeParser;
import union.xenfork.xenscript.read.CodeVisitor;
import union.xenfork.xenscript.read.PriorityVisitor;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class XenCode {
    public static final BiMap<Integer, List<Pair<String, File>>> priorityFile = new BiMap<>(new HashMap<>());
    public static final BiMap<Integer, List<Pair<String, XenCodeParser.ThreadContext>>> priorityFile1 = new BiMap<>(new HashMap<>());

    public static void main(String[] args) throws IOException {
        loader(new File(System.getProperty("user.dir")));
    }

    public static void loader(File file) throws IOException {
        File path = new File(file, "alm");
        if (!path.exists()) path.mkdirs();
        File[] files = path.listFiles();
        if (files != null) {
            for (File f : files) {
                CharStream charStream = CharStreams.fromReader(FileUtil.getUtf8Reader(f));
                XenCodeLexer xenCodeLexer = new XenCodeLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(xenCodeLexer);
                XenCodeParser parser = new XenCodeParser(tokens);
                XenCodeParser.ThreadContext thread = parser.thread();
                PriorityVisitor priorityVisitor = new PriorityVisitor(f, priorityFile, path);
                priorityVisitor.visit(thread);
            }
        }
        for (var var : priorityFile) {
            for (var var1 : var.getValue()) {
                Integer priority = var.getKey();
                String name = var1.getKey();
                File f = var1.getValue();
                CharStream charStream = CharStreams.fromReader(FileUtil.getUtf8Reader(f));
                XenCodeLexer xenCodeLexer = new XenCodeLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(xenCodeLexer);
                XenCodeParser parser = new XenCodeParser(tokens);
                XenCodeParser.ThreadContext thread = parser.thread();
                CodeVisitor codeVisitor = new CodeVisitor(priority, name, f, priorityFile1);
                codeVisitor.visit(thread);
            }
        }
    }
}
