package union.xenfork.xenscript.util;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.dynamic.DynamicType;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("UnusedReturnValue")
public class ByteBuddyUtil {
    private static final ByteBuddy byteBuddy = new ByteBuddy(ClassFileVersion.JAVA_V17);
    private boolean output = false;
    private DynamicType.Builder<?> builder;
    private DynamicType.Unloaded<?> make;// un loaded
    private DynamicType.Loaded<?> load;// loaded
    public ByteBuddyUtil() {}

    public ByteBuddyUtil outPut() {
        this.output = true;
        return this;
    }

    public ByteBuddyUtil subclass(Class<?> clazz) {
        builder = byteBuddy.subclass(clazz);
        return this;
    }

    public ByteBuddyUtil name(String name) {
        builder = builder.name(name);
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

    public Object instance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return load().getDeclaredConstructor().newInstance();
    }
}
