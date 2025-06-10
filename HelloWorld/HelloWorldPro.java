//Simple Java Hello World Program
public class HelloWorldPro {
    public static void main(String[] args) {
        System.out.print("Hello, ");

        //How do I parse the args?
        // The args array can be used to accept command-line arguments.
        // For example, if you run the program with `java HelloWorld arg1 arg2`,
        // the args array will contain ["arg1", "arg2"].
        if (args.length > 0) {
            for (String arg : args) {
                
                System.out.print(arg +  ",");
            }
        } else {
            // If no arguments are provided, we print "World" by default.
            System.out.print("World");
        }

        //Print the final line
        System.out.println("!");

    }
}
// This program prints "Hello, World!" to the console.
// It serves as a basic introduction to Java syntax and structure.
// To run this program, save it in a file named HelloWorld.java
// and compile it using the command: javac HelloWorld.java
// Then execute it with: java HelloWorld
// This code is a simple demonstration of Java's print functionality.
// It is often used as the first program written by beginners learning Java.
// The program consists of a class named HelloWorld with a main method.
// The main method is the entry point of the program.
// The System.out.println method is used to output text to the console.
// This code does not require any external libraries or dependencies.
// It is a self-contained example that can be run in any Java environment.
// The program is designed to be simple and easy to understand.
// It illustrates the basic structure of a Java application.
// The HelloWorld class is public, meaning it can be accessed from other classes.
// The main method is static, allowing it to be called without creating an instance of the class.
// The String[] args parameter allows for command-line arguments, though none are used here.
// This program is a fundamental example for anyone starting with Java programming.
// It can be extended with more complex functionality as the user learns more about Java.
// The code adheres to Java's naming conventions and best practices.
// It is a good starting point for understanding Java's object-oriented principles.
// The program can be modified to include additional features or functionality.
// This code is freely available for educational purposes and can be modified as needed.
// The program can be executed in any Java-compatible environment, including IDEs and command line.
// It is a timeless example that continues to be relevant in programming education.
// The HelloWorld program is a classic example in the programming community.