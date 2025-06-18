public class Reference
 {
    public static void main(String[] args) {
        // Reference types in Java
        String text = "Hello, World!"; // String
        Integer number = 42; // Integer (wrapper class for int)
        Double decimal = 3.14; // Double (wrapper class for double)
        Boolean isTrue = true; // Boolean (wrapper class for boolean)

        // bob class instance since a class is a reference type too
        Bob myBob = new Bob();
        myBob.display(); // Call a method from the bob class
        // This will print a message from the bob class
        // The bob class is a nested class within the Reference class
        // It can be used to define additional functionality or properties

        // Son class instance since a class is a reference type too
        Son mySon = new Son();
        mySon.show(); // Call a method from the Son class
        // This will print a message from the Son class
        // The Son class extends the Bob class
        // It inherits the properties and methods of the Bob class
        // The Son class can also have its own properties and methods
        // The Son class is a subclass of the Bob class
        // It can be used to define additional functionality or properties
        // The Son class can also override methods from the Bob class
        // The Son class can be used to create objects that have the properties and methods of both the Bob class and the Son class
        // The Son class can be used to create objects that have the properties and methods of the Bob class and the Son class

        // Print the values
        System.out.println("String: " + text);
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("Boolean: " + isTrue);
    }
}

class Bob {
        // This is a nested class named bob
        // It can be used to define additional functionality or properties
        public void display() {
            System.out.println("This is the Bob class.");
        }
    }

class Son extends Bob {
        // This is a subclass of Bob
        // It inherits the properties and methods of the Bob class
        public void show() {
            System.out.println("This is the Son class, extending Bob.");
        }
    }