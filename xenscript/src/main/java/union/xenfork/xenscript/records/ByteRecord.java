package union.xenfork.xenscript.records;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.Implementation;

public class ByteRecord {
    public static final ByteBuddy byteBuddy = new ByteBuddy(ClassFileVersion.JAVA_V17);
    private boolean output = false;
    private DynamicType.Builder<?> builder;
    private DynamicType.Unloaded<?> make;// un loaded
    private DynamicType.Loaded<?> load;// loaded
    private Implementation.Composable deImpl;
    private DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<?> aDefault;

    public DynamicType.Builder<?> getBuilder() {
        return builder;
    }

    public void setBuilder(DynamicType.Builder<?> builder) {
        this.builder = builder;
    }

    public boolean isOutput() {
        return output;
    }

    public void setOutput(boolean output) {
        this.output = output;
    }

    public DynamicType.Unloaded<?> getMake() {
        return make;
    }

    public void setMake(DynamicType.Unloaded<?> make) {
        this.make = make;
    }

    public DynamicType.Loaded<?> getLoad() {
        return load;
    }

    public void setLoad(DynamicType.Loaded<?> load) {
        this.load = load;
    }

    public Implementation.Composable getDeImpl() {
        return deImpl;
    }

    public void setDeImpl(Implementation.Composable deImpl) {
        this.deImpl = deImpl;
    }

    public DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<?> getaDefault() {
        return aDefault;
    }

    public void setaDefault(DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<?> aDefault) {
        this.aDefault = aDefault;
    }
}
