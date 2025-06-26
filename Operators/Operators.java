public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Addition a + b : " + (a + b)); // 15
        System.out.println("Subtraction a - b : " + (a - b)); // 5
        System.out.println("Multiplication a * b: " + (a * b)); // 50
        System.out.println("Division a / b : " + (a / b)); // 2
        System.out.println("Modulus a % b: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Equal to: a == b" + (a == b)); // false
        System.out.println("Not equal a != b to: " + (a != b)); // true
        System.out.println("Greater than a > b: " + (a > b)); // true
        System.out.println("Less than a < b : " + (a < b)); // false
        System.out.println("Greater than or equal to a >= b: " + (a >= b)); // true
        System.out.println("Less than or equal to a <= b: " + (a <= b)); // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x: " + x + ", y: " + y);
        System.out.println("Logical AND x && y: " + (x && y)); // false
        System.out.println("Logical OR x || y: " + (x || y)); // true
        System.out.println("Logical NOT !x : " + (!x)); // false

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("x: " + x + ", y: " + y);
        int m = 6, n = 3; // Binary: m=110, n=011
        System.out.println("Bitwise AND: " + (m & n)); // 2 (Binary: 010)
        System.out.println("Bitwise OR: " + (m | n)); // 7 (Binary: 111)
        System.out.println("Bitwise XOR: " + (m ^ n)); // 5 (Binary: 101)
        System.out.println("Bitwise Complement of m: " + (~m)); // -7

        // Assignment Operators
        System.out.println("Assignment Operators:");
        int c = 10;
        System.out.println("Initial value of c: " + c);
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
        System.out.println("Unary Operators:");
        int d = 5;
        System.out.println("Initial value of d: " + d);
        System.out.println("Unary Plus: " + (+d)); // 5
        System.out.println("Unary Minus: " + (-d)); // -5
        System.out.println("Increment: " + (++d)); // 6
        System.out.println("Decrement: " + (--d)); // 5

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator (max): " + max); // 10

        // Bitwise Shift Operators
        int pos = 8; // 0000 1000
        int neg = -8; // 1111 1000 (in 32 bits: 11111111 11111111 11111111 11111000)

        System.out.println("Bitwise Shift Operators:");
        System.out.println("pos: " + pos); // 8
        System.out.println("neg: " + neg); // -8

        System.out.println("pos << 2: " + (pos << 2)); // 32 (0001 0000)

        System.out.println("pos >> 2: " + (pos >> 2));   // 2  (0000 0010)
        System.out.println("pos >>> 2: " + (pos >>> 2)); // 2  (0000 0010)

        System.out.println("neg >> 2: " + (neg >> 2));   // -2 (arithmetic shift, sign bit stays)
        System.out.println("neg >>> 2: " + (neg >>> 2)); // large positive (logical shift, fills with 0s)

        // Show binary representations for clarity
        System.out.println("\nBinary Representations:");
        System.out.println("pos in binary: " + Integer.toBinaryString(pos));
        System.out.println("neg in binary: " + Integer.toBinaryString(neg));
        System.out.println("neg >> 2 in binary: " + Integer.toBinaryString(neg >> 2));
        System.out.println("neg >>> 2 in binary: " + Integer.toBinaryString(neg >>> 2));
    }
}
