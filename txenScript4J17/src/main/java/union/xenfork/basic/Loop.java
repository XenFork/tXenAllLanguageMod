package union.xenfork.basic;

public class Loop {
    private int mode;//单纯的fori语句是0，foreach是1, while是2
    public Loop(String str) {
        mode = str.contains("for") ? 0 : str.contains("foreach") ? 1 : 2;
        if (str.contains("for")) {
            mode = 0;
        }
    }
}
