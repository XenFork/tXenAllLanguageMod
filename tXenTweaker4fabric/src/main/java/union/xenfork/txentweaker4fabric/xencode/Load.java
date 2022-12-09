package union.xenfork.txentweaker4fabric.xencode;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import union.xenfork.g4.XenCodeLexer;
import union.xenfork.g4.XenCodeParser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Load {
	public static final Map<Integer, Map<Integer, File>> IIFMAP = new HashMap<>();
	public static void load(File file) {
		try {
			CharStream input = CharStreams.fromPath(file.toPath());
			XenCodeLexer lexer = new XenCodeLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			XenCodeParser parser = new XenCodeParser(tokens);
			Visit visit = new Visit();
			visit.visitAll(parser.all());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void loadPriority(File file) {
		try {
			CharStream input = CharStreams.fromPath(file.toPath());
			XenCodeLexer lexer = new XenCodeLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			XenCodeParser parser = new XenCodeParser(tokens);
			PriorityXen priorityXen = new PriorityXen();
			priorityXen.visitAll(parser.all());
			var p = priorityXen.getPriority();
			if (!IIFMAP.containsKey(p)) {
				Map<Integer, File> IFMAP = new HashMap<>();
				IFMAP.put(0, file);
				IIFMAP.put(p, IFMAP);
			} else {
				Map<Integer, File> IFMAP = IIFMAP.get(p);
				IFMAP.put(IFMAP.size(), file);
				IIFMAP.put(p, IFMAP);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
