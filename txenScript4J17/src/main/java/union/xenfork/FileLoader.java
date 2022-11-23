package union.xenfork;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static union.xenfork.TXen.extension;

public class FileLoader {
	//写入教科书式的读取文件列表
	private final StringBuilder sb;
	private final List<String> lineCodes;
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
	public static int isNote = 0;//0模式代表无注解模式 1模式注解模式
	public static int is = 0;//0模式代表field， 1模式代表method
	public FileLoader(File file) throws IOException {
		sb = deserialization(file);//反序列化
		lineCodes = serialize(sb);//序列号存储
	}
	public StringBuilder deserialization(File file) throws IOException {
	//去掉注释合并行数
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(file.toPath());
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (isNote == 0) {
				sb.append(delete_note(line));
				if (line.contains("/*") && !line.contains("*/")) {
					isNote = 1;
				}
			} else if (isNote == 1) {
				if (line.contains("*/")) {
					isNote = 0;
					sb.append(delete_note(line));
				}
			}
		}
		return sb;
	}
	//序列化
	public List<String> serialize(StringBuilder sb) {
		String s = sb.toString();
		StringBuilder line = new StringBuilder();
		final List<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (is) {
				case 0 -> {
					line.append(c);
					switch (c) {
						case ';' -> {
							list.add(line.toString());
							line = new StringBuilder();
						}
						case '{' -> is = 1;
					}
				}
				case 1 -> {
					line.append(c);
					if (c == '{') {
						is++;
					}
					if (c == '}') {
						is = 0;
						list.add(line.toString());
						line = new StringBuilder();

					}
				}
				default -> {
					line.append(c);
					if (c == '{') {
						is++;
					}
					if (c == '}') {
						is--;
					}
				}
			}
		}
		return list;
	}

	public List<String> getLineCodes() {
		return lineCodes;
	}

	public StringBuilder getSb() {
		return sb;
	}

	@Override
	public String toString() {
		return sb.toString();
	}

	public static class XenMethod {//方法，用于function >> function >> function { field; }
		public XenMethod(String str) {

		}
	}

	//删除注释
	public static String delete_note(String line) {
		String line_ = line;
		if (line_.contains("//")) {
			line_ = line_.substring(0, line_.indexOf("//"));
		}
		while (line_.contains("/*")) {
			if (line_.contains("*/")) {
				line_ = line_.substring(0, line_.indexOf("/*")) + line_.substring(line_.indexOf("*/") + 2);
			} else {
				line_ = line_.substring(0, line_.indexOf("/*"));
			}
		}
		if (line_.contains("*/")) {
			line_ = line_.substring(line_.indexOf("*/") + 2);
		}
		return line_;
	}

}
