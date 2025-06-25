public class Variable {

    // Instance variable (belongs to an object)
    int instanceVar = 10;

    // Static variable (belongs to the class)
    static String staticVar = "I am static!";

    public void demonstrateVariables() {
        // Local variable (declared inside a method)
        double localVar = 3.14;

        // Primitive types
        boolean isActive = true;
        char grade = 'A';
        byte smallNum = 127;
        short shortNum = 32000;
        int age = 25;
        long bigNum = 123456789L;
        float pi = 3.14f;
        double price = 19.99;

        // Reference types
        String name = "Java";
        int[] numbers = {1, 2, 3};
        Variable obj = new Variable();

        // Final variable (constant)
        final int DAYS_IN_WEEK = 7;

        // Variable reassignment
        age = 30;

        // Type inference (Java 10+)
        var city = "London";
        var temperature = 20.5;


        // What happes if I do some math operations?
        int sum = age + 5; // Adding 5 to ag

        System.out.println("Sum of age and temperature: " + (sum + temperature));
        System.out.println("Sum of age and temperature parens make a difference: " + sum + temperature);

        // Printing variables
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);
        System.out.println("Boolean: " + isActive);
        System.out.println("Char: " + grade);
        System.out.println("Byte: " + smallNum);
        System.out.println("Short: " + shortNum);
        System.out.println("Int: " + age);
        System.out.println("Long: " + bigNum);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + price);
        System.out.println("String: " + name);
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Object: " + obj);
        System.out.println("Final variable: " + DAYS_IN_WEEK);
        System.out.println("Type inference (var): " + city + ", " + temperature);
    }

    public static void main(String[] args) {
        Variable example = new Variable();
        example.demonstrateVariables();
    }
}