package union.xenfork;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static union.xenfork.TXen.extension;

public class FileLoader {
	//写入教科书式的读取文件列表
	private final StringBuilder sb;
	public static List<File> loadFile(File file) {
		List<File> files = new ArrayList<>();
		final var listFiles = file.listFiles();
		final var stream = extension.stream();
		if (listFiles != null) for (File f : listFiles)
			if (f.isDirectory())
				files.addAll(loadFile(f));
			else
				stream.filter(e -> f.getName().contains(e)).map(e -> f).forEach(files::add);
		return files;
	}
	public FileLoader(File file) throws IOException {
		sb = deserialization(file);
	}


	public StringBuilder deserialization(File file) throws IOException {
	//去掉注释合并行数
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(file.toPath());
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			sb.append(line).append("\n");
		}
		return sb;
	}

	@SuppressWarnings("unused")
	public StringBuilder getSb() {
		return sb;
	}

	@Override
	public String toString() {
		return sb.toString();
	}

}
