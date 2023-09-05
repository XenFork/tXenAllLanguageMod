package union.xenfork.xenscript.util;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.implementation.*;
import union.xenfork.xenscript.records.ByteRecord;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static net.bytebuddy.description.modifier.MethodManifestation.FINAL;
import static union.xenfork.xenscript.records.ByteRecord.byteBuddy;

@SuppressWarnings("UnusedReturnValue")
public class ByteBuddyUtil {

    public ByteRecord byteRecord;

    public ByteBuddyUtil() {
        byteRecord = new ByteRecord();
    }

    public ByteBuddyUtil outPut() {
        byteRecord.setOutput(true);
        return this;
    }

    public ByteBuddyUtil subclass(Class<?> clazz) {
        byteRecord.setBuilder(byteBuddy.subclass(clazz));
        return this;
    }

    public ByteBuddyUtil name(String name) {
        if (byteRecord.getBuilder() == null) {
            byteRecord.setBuilder(byteBuddy.subclass(Object.class));
        }
        byteRecord.setBuilder(byteRecord.getBuilder().name(name));
        return this;
    }

    public ByteBuddyUtil defaultMethod() {

        byteRecord.setaDefault(byteRecord.getBuilder().defineMethod("default_method", void.class, Visibility.PUBLIC, Ownership.STATIC, FINAL));
        return this;
    }

    public ByteBuddyUtil defaultImpl() {
        byteRecord.setDeImpl(StubMethod.INSTANCE);
        return this;
    }

    public ByteBuddyUtil andThen() {
        return this;
    }

    public ByteBuddyUtil defaultBuild() {
        byteRecord.setBuilder(byteRecord.getaDefault().intercept(byteRecord.getDeImpl()));
        return this;
    }

    public ByteBuddyUtil make() throws IOException {
        byteRecord.setMake(byteRecord.getBuilder().make());
        return saveIn();
    }

    public ByteBuddyUtil saveIn() throws IOException {
        File test = new File(System.getProperty("user.dir"), "test");
        if (!test.exists()) test.mkdirs();
        if (byteRecord.isOutput()) byteRecord.getMake().saveIn(test);
        return this;
    }

    public ByteBuddyUtil load(ClassLoader loader) {
        byteRecord.setLoad(byteRecord.getMake().load(loader));
        return this;
    }

    public Class<?> load() {
        return byteRecord.getLoad().getLoaded();
    }

    public Object instance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return load().getDeclaredConstructor().newInstance();
    }
}
