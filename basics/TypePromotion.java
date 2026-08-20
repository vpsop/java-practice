package basics;

public class TypePromotion {
    public static void main(String[] args) {
        // byte, short, and char are promoted to int in most arithmetic expressions.
        // For the usual arithmetic operators [+  -  *  /  %] byte, short, and char are promoted to int.
        // But unary ++ and -- are exceptions, they preserve the variable's type.
        // Also, compound assignment operators like += have special implicit-casting behavior

        // If one operand is long → result is long.
        // If one operand is float → result is float.
        // If one operand is double → result is double.
        // boolean does not participate in numeric promotion.

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234; 

        double result = (f * b) + (i / c) - (d * s);

        // f * b --> float
        // i / c --> integer
        // d * s --> double

        // float + int  -> float
        // float - double -> double

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);


        // If both operands are byte/short/char, both are promoted to int.
        byte x = 10;
        byte y = 20;
        int z = x + y; // int
        System.out.println(z);

        byte byteVal = 10;
        byteVal++;  // Works
        byteVal--;  // Works

        byteVal += 5; // Works
        // byteVal = byteVal + 5; // ERROR: cannot assign int to byte because (byte + int) -> gave int
        byteVal = (byte) (byteVal + 5); // Needs explicit casting

    }
}
