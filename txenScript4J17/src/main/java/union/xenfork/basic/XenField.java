package union.xenfork.basic;

public class XenField {
	private final String className;
	private final String fieldName;
	private Operations operations;

	public XenField(String str) {
		final var split = str.split("=");
		final var a = split[0].split(" ");
		fieldName = a[1];
		className = a[0];
		var trim = split[1].trim();
		operations = new Operations(trim);
	}

	public String getClassName() {
		return className;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Operations getOperations() {
		return operations;
	}
}
