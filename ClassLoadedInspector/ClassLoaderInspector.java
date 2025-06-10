import java.lang.instrument.Instrumentation;
import java.util.Arrays;

public class ClassLoaderInspector {
    private static Instrumentation instrumentation;

    public static void premain(String agentArgs, Instrumentation inst) {
        instrumentation = inst;
    }

    public static void listBootstrapClasses() {
        Class<?>[] classes = instrumentation.getAllLoadedClasses();
        Arrays.stream(classes)
            .filter(cls -> cls.getClassLoader() == null) // Bootstrap class loader
            .forEach(System.out::println);
    }
}
