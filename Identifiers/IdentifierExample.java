public class IdentifierExample { // Class name (identifier)

    // Constant name (identifier)
    public static final int MAX_COUNT = 5;

    // Method name (identifier)
    public void printMessage(String message) { // Parameter name (identifier)
        // Variable name (identifier)
        int counter = 0;
        while (counter < MAX_COUNT) {
            System.out.println(message + " " + counter);
            counter++;
        }
    }

    public static void main(String[] args) { // Method and parameter identifiers
        IdentifierExample example = new IdentifierExample(); // Variable identifier
        example.printMessage("Hello");
    }
}