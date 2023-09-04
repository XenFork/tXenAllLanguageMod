package union.xenfork.xenscript.util;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.dynamic.DynamicType;

import java.io.File;
import java.io.IOException;

public class ByteBuddyUtil {
    private static final ByteBuddy byteBuddy = new ByteBuddy(ClassFileVersion.JAVA_V17);
    private boolean output = false;
    private DynamicType.Builder<?> builder;
    private DynamicType.Unloaded<?> make;// un loaded
    private DynamicType.Loaded<?> load;// loaded
    public ByteBuddyUtil() {}

    public void outPut() {
        this.output = true;
    }

    public ByteBuddyUtil subclass(Class<?> clazz) {
        builder = byteBuddy.subclass(clazz);
        return this;
    }

    public ByteBuddyUtil make() throws IOException {
        make = builder.make();
        return saveIn();
    }

    public ByteBuddyUtil saveIn() throws IOException {
        File test = new File(System.getProperty("user.dir"), "test");
        if (!test.exists()) test.mkdirs();
        if (output) make.saveIn(test);
        return this;
    }

    public ByteBuddyUtil load(ClassLoader loader) {
        load = make.load(loader);
        return this;
    }

    public Class<?> load() {
        return load.getLoaded();
    }
}
