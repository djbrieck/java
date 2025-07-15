/**
 * This class demonstrates the usage of most Java keywords.
 * Note: Some keywords (like `goto` and `const`) are reserved but not used.
 */
public class Keywords {

    // Primitive types
    byte b = 1;
    short s = 2;
    int i = 3;
    long l = 4L;
    float f = 5.0f;
    double d = 6.0;
    char c = 'A';
    boolean bool = true;

    // Control flow
    public void controlFlowDemo() {
        if (bool) {
            for (int j = 0; j < 3; j++) {
                while (j < 2) {
                    j++;
                    break;
                }
            }
        } else {
            do {
                i--;
            } while (i > 0);
        }

        switch (b) {
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Default");
        }
    }

    // Classes, interfaces, enums
    public static class InnerClass {}
    interface MyInterface {}
    enum MyEnum { ONE, TWO, THREE }

    // Exception handling
    public void exceptionDemo() {
        try {
            throw new Exception("Demo");
        } catch (Exception e) {
            System.out.println("Caught");
        } finally {
            System.out.println("Finally");
        }
    }

    // Method modifiers
    public static final synchronized void methodModifiers() {}

    // Variable modifiers
    private volatile transient int modVar;

    // Inheritance
    static class Parent {}
    static class Child extends Parent implements MyInterface {}

    // Generics
    public <T extends Number> void genericMethod(T t) {}

    // Instanceof
    public void instanceofDemo(Object obj) {
        if (obj instanceof String) {
            System.out.println("It's a String");
        }
    }

    // Return, new, super, this
    public Keywords getInstance() {
        return new Keywords();
    }

    public void superThisDemo() {
        System.out.println(this.toString());
        // super keyword is used in subclasses
    }

    // Static block
    static {
        System.out.println("Static block");
    }

    // Final block
    final int finalVar = 10;

    // Abstract class and method
    abstract static class AbstractClass {
        abstract void abstractMethod();
    }

    // Native method declaration
    public native void nativeMethod();

    // Strictfp method
    public void strictfpMethod() {}

    // Assert
    public void assertDemo() {
        assert bool : "Boolean is false";
    }

    // Package, import, class, interface, enum, extends, implements, throws, throw, try, catch, finally, return, new, super, this, static, void, public, protected, private, abstract, final, native, strictfp, synchronized, volatile, transient, if, else, switch, case, default, for, while, do, break, continue, instanceof, assert, true, false, null

    // Reserved but not used
    // goto, const

    public static void main(String[] args) {
        Keywords demo = new Keywords();
        demo.controlFlowDemo();
        demo.exceptionDemo();
        demo.methodModifiers();
        demo.genericMethod(42);
        demo.instanceofDemo("Hello");
        demo.getInstance();
        demo.superThisDemo();
        demo.strictfpMethod();
        demo.assertDemo();
        System.out.println("Final var: " + demo.finalVar);
        System.out.println("Enum value: " + MyEnum.ONE);
    }
}
