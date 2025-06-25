public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true
        System.out.println("Less than: " + (a < b)); // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b)); // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Bitwise Operators
        int m = 6, n = 3; // Binary: m=110, n=011
        System.out.println("Bitwise AND: " + (m & n)); // 2 (Binary: 010)
        System.out.println("Bitwise OR: " + (m | n)); // 7 (Binary: 111)
        System.out.println("Bitwise XOR: " + (m ^ n)); // 5 (Binary: 101)
        System.out.println("Bitwise Complement of m: " + (~m)); // -7

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("After += : " + c); // 15

        c -= 3; // c = c - 3
        System.out.println("After -= : " + c);
    

        c *= 2; // c = c * 2
        System.out.println("After *= : " + c); // 30

        c /= 3; // c = c / 3
        System.out.println("After /= : " + c); // 10

        c %= 4; // c = c % 4
        System.out.println("After %= : " + c); // 2

        // Unary Operators
        int d = 5;
        System.out.println("Unary Plus: " + (+d)); // 5
        System.out.println("Unary Minus: " + (-d)); // -5
        System.out.println("Increment: " + (++d)); // 6
        System.out.println("Decrement: " + (--d)); // 5

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator (max): " + max); // 10
    }
}
