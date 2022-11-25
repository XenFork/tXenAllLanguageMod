package union.xenfork.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Operations {
	public static final Map<String, Object> STRING_OBJECT_MAP = new HashMap<>();
//	private List<Object> objects = new ArrayList<>();
	private final String str;
	public Operations(String str) {
		this.str = str;
	}

	private int mode = 0;

	private void and() {
		final List<String> strings = new ArrayList<>();
		StringBuilder tmp = new StringBuilder();
		for (int temp = 0; temp < str.length(); temp++) {
			var temp_ = str.charAt(temp);
			// "about""+"" + ccc + ddd + "about"
			switch (mode) {
				case 0 -> {
					if (temp_ == '\"') {
						mode = 1;
					} else {
						tmp.append(temp_);
					}
				}
				case 1 -> {
					if (temp_ == '\"') {
						mode = 0;
					} else {
						tmp.append(temp_);
					}
				}
			}
		}
	}

	public void and(String str) {

	}


}
