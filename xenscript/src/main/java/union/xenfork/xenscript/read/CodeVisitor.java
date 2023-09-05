package union.xenfork.xenscript.read;

import cn.hutool.core.lang.Pair;
import cn.hutool.core.map.BiMap;
import cn.hutool.core.text.StrBuilder;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import org.antlr.v4.runtime.tree.ParseTree;
import union.xenfork.xenscript.parser.XenCodeParser;
import union.xenfork.xenscript.parser.XenCodeParserBaseVisitor;
import union.xenfork.xenscript.util.ByteBuddyUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CodeVisitor extends XenCodeParserBaseVisitor<Object> {
    private final BiMap<Integer, List<Pair<String, XenCodeParser.ThreadContext>>> priorityFile;
    private final File file;

    private final List<XenCodeParser.ThreadContext> loader = new ArrayList<>();
    private final Integer priority;
    private final String name;
    private final ByteBuddyUtil util;

    public CodeVisitor(Integer priority, String name, File file, BiMap<Integer, List<Pair<String, XenCodeParser.ThreadContext>>> priorityFile) {
        this.priorityFile = priorityFile;
        this.file = file;
        this.priority = priority;
        this.name = name;
        util = new ByteBuddyUtil();
    }

    @Override
    public Object visit(ParseTree tree) {
        if (tree instanceof XenCodeParser.ThreadContext context) {
            visitThread(context);
        }
        return null;
    }

    @Override
    public Object visitThread(XenCodeParser.ThreadContext ctx) {
        if (ctx.extendExpr() != null) {
            XenCodeParser.ExtendExprContext extendExprContext = ctx.extendExpr();
            StrBuilder className = new StrBuilder(extendExprContext.NAMED(0).getText());
            IntStream.range(1, extendExprContext.NAMED().size()).forEachOrdered(i -> className.append(".").append(extendExprContext.NAMED(i)));
            try {
                util.subclass(Class.forName(className.toString()));
            } catch (ClassNotFoundException e) { error("not find class" + className); }
        }
        util.name(name);
        util.defaultMethod().defaultImpl();
        // code invoker

        util.defaultBuild();
        // pre loader
        initLoader(ctx);
        // save codevisitor
        List<Pair<String, XenCodeParser.ThreadContext>> pairs = priorityFile.containsKey(priority) ? priorityFile.get(priority) : new ArrayList<>();
        pairs.add(new Pair<>(name, ctx));
        priorityFile.put(priority, pairs);
        File test = new File(System.getProperty("user.dir"), "test");
        if (!test.exists()) test.mkdirs();
        try {
            util.outPut();
            util.make();
//            builder.name(name).method(ElementMatchers.named("toString")).intercept(FixedValue.value("A")).make().saveIn(test);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private void initLoader(XenCodeParser.ThreadContext ctx) {
        if (!ctx.loaderExpr().isEmpty() && ctx.loaderExpr() != null) {
            for (XenCodeParser.LoaderExprContext loader : ctx.loaderExpr()) {
                String l = visitLoaderExpr(loader);
                boolean error = true;
                for (var entry : priorityFile) {
                    List<Pair<String, XenCodeParser.ThreadContext>> value = entry.getValue();
                    for (Pair<String, XenCodeParser.ThreadContext> kv : value) {
                        if (kv.getKey().equals(l)) {
                            error = false;
                            this.loader.add(kv.getValue());
                        }
                    }
                }
                if (error) {
                    error("not load " + l);
                }
            }
        }
    }



    @Override
    public String visitLoaderExpr(XenCodeParser.LoaderExprContext ctx) {
        return ctx.NAMED().getText();
    }

    public void error(String message) {
        System.out.println(message);
    }

}
