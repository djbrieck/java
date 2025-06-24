public class IdentifierExample { // Class name (identifier)

    // List of Java reserved words (including keywords and literals)
    // Keywords:
    // abstract, assert, boolean, break, byte, case, catch, char, class, const, continue,
    // default, do, double, else, enum, extends, final, finally, float, for, goto, if,
    // implements, import, instanceof, int, interface, long, native, new, package, private,
    // protected, public, return, short, static, strictfp, super, switch, synchronized, this,
    // throw, throws, transient, try, void, volatile, while
    // Literals (reserved words): true, false, null

    // List of Java literals (examples)
    // Integer: 123, 0x7B, 0123
    // Floating-point: 3.14, 2.0e10, 1.0f
    // Boolean: true, false
    // Character: 'A', '\n'
    // String: "Hello", "Java"
    // Null: null

    // Constant name (identifier)
    public static final int MAX_COUNT = 5;

    // Method name (identifier)
    public void printMessage(String message) { // Parameter name (identifier)
        // Variable name (identifier)
        int counter = 0; // integer literal
        String greeting = "Hello, Java!"; // string literal
        char initial = 'J'; // character literal
        boolean isActive = true; // boolean literal
        double pi = 3.14; // floating-point literal
        Object nothing = null; // null literal

        while (counter < MAX_COUNT) {
            System.out.println(message + " " + counter + " " + greeting + " " + initial + " " + isActive + " " + pi + " " + nothing);
            counter++;
        }
    }

    public static void main(String[] args) { // Method and parameter identifiers
        IdentifierExample example = new IdentifierExample(); // Variable identifier
        example.printMessage("Hello");
    }
}