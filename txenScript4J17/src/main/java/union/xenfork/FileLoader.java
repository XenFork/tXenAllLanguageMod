package union.xenfork;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static union.xenfork.TXen.extension;

public class FileLoader {
	//写入教科书式的读取文件列表
	public static List<File> loadFile(File file) {
		List<File> files = new ArrayList<>();
		final var listFiles = file.listFiles();
		final var stream = extension.stream();
		if (listFiles != null)
			for (var f : listFiles)
				if (f.isDirectory())
					files.addAll(loadFile(f));
				else
					stream.filter(e -> f.getName().contains(e)).map(e -> f).forEach(files::add);
		return files;
	}
}
