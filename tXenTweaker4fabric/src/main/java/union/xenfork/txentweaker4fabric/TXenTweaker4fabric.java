package union.xenfork.txentweaker4fabric;

import net.fabricmc.api.ModInitializer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import union.xenfork.g4.XenCodeLexer;
import union.xenfork.g4.XenCodeParser;
import union.xenfork.txentweaker4fabric.xencode.Visit;

import java.io.File;
import java.io.IOException;

public class TXenTweaker4fabric implements ModInitializer {
	public static final Logger logger = LoggerFactory.getLogger("txen");
	@Override
	public void onInitialize() {
		var config = new File(System.getProperty("user.dir"), "config");
		var code = new File(config, "code");
		if (!code.exists()) {
			code.mkdirs();
		}
		var fs = code.listFiles();
		assert fs != null;
		for (var f : fs) {
			try {
				CharStream input = CharStreams.fromPath(f.toPath());
				XenCodeLexer lexer = new XenCodeLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				XenCodeParser parser = new XenCodeParser(tokens);
				Visit visit = new Visit();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
