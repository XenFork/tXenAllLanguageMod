package union.xenfork.txentweaker4fabric.xencode;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.reflections.Reflections;
import union.xenfork.news.XenCode4J17BaseVisitor;
import union.xenfork.news.XenCode4J17Lexer;
import union.xenfork.news.XenCode4J17Parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class J17Visit extends XenCode4J17BaseVisitor<Void> {
    public final Map<String, Class<?>> importMap = new HashMap<>();
    public final Map<String, String> findName = new HashMap<>();

    @Override
    public Void visitIiv(XenCode4J17Parser.IivContext ctx) {
        var t = ctx.FILEDA().toString();
        var m = t.split("\\.");
        findName.put(m[m.length - 1], "import");
        importMap.put(m[m.length - 1], new Reflections().forClass(t));
        return super.visitIiv(ctx);
    }

    @Override
    public Void visitIiiv(XenCode4J17Parser.IiivContext ctx) {
        return super.visitIiiv(ctx);
    }

    @Override
    public Void visitIv(XenCode4J17Parser.IvContext ctx) {
        if (ctx.iiv() != null) {
            return visitIiv(ctx.iiv());
        } else {
            var t = ctx.FILEDA().toString();
            var m = t.split("\\.");
            findName.put(m[m.length - 1], "import");
            importMap.put(m[m.length - 1], new Reflections().forClass(t));
        }
        return null;
    }

    @Override
    public Void visitJh(XenCode4J17Parser.JhContext ctx) {
        for (var iv : ctx.iv()) visitIv(iv);
        return null;
    }

    @Override
    public Void visitXenfork(XenCode4J17Parser.XenforkContext ctx) {
        return ctx.jh() != null ? visitJh(ctx.jh()) :
                ctx.method() != null ?  visitMethod(ctx.method()) :
                        ctx.field() != null ? visitField(ctx.field()) : null;
    }

    @Override
    public Void visitUnion(XenCode4J17Parser.UnionContext ctx) {
        return ctx.xenfork() != null ? visitXenfork(ctx.xenfork()) : null;
    }
    @Override
    public Void visitAll(XenCode4J17Parser.AllContext ctx) {
        for (var union : ctx.union()) visitUnion(union);
        return null;
    }

    public static void main(String[] args) {
        String a = """
                import net.minecraft.item.Item << a ,
                net.minecraft.item.ItemStack << b;
                var a = 1->2;
                var b = 1<-2;
                b = 1<-1;""";
        CharStream c = CharStreams.fromString(a);
        XenCode4J17Lexer lexer = new XenCode4J17Lexer(c);
        CommonTokenStream co = new CommonTokenStream(lexer);
        XenCode4J17Parser p = new XenCode4J17Parser(co);
        J17Visit visit = new J17Visit();
        visit.visitAll(p.all());
    }
}
