package union.xenfork.txentweaker4fabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import union.xenfork.txentweaker4fabric.xencode.Load;

import java.io.File;

import static union.xenfork.txentweaker4fabric.xencode.Load.IIFMAP;
import static union.xenfork.txentweaker4fabric.xencode.Load.load;

public class TXenTweaker4fabric implements ModInitializer {
	public static final Logger logger = LoggerFactory.getLogger("tXen");
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
			Load.loadPriority(f);
		}
		for (var temp : IIFMAP.keySet()) {
			for (var tmp : IIFMAP.get(temp).values()) {
				load(tmp);
			}
		}
	}
}
