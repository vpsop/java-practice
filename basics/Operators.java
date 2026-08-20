package basics;

public class Operators {
    public static void main(String[] args) {

        // ==========================================
        //            ARITHMETIC OPERATORS
        // ==========================================

        int a = 9;
        int b = 4;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b; // integer division -> truncates toward zero
        double realDiv = a / (double) b;
        int remainder = a % b;

        System.out.println(add + " " + sub + " " + mul + " " + div + " " + realDiv + " " + remainder);

        int x = 5;
        System.out.println(x++); //prints 5 -> x becomes 6 afterwards

        System.out.println(++x); // x increments first -> then printed -> prints 7

        // Same for decrement (pre and post)


        // ==========================================
        //            RELATIONAL OPERATORS
        // ==========================================

        int p = 4;
        int q = 7;

        System.out.println(p == q); // false
        System.out.println(p != q); // true
        System.out.println(p > q); // false
        System.out.println(p >= q); // false
        System.out.println(p < q); // true
        System.out.println(p <= q); // true


        // ==========================================
        //            BITWISE OPERATORS
        // ==========================================
        
        //  &, |, ^, ~, >>, <<, >>>, &=, |=, ^=, >>=, <<=, >>>=


        // val is converted to int then shift is performed
        // so we have convert it back into byte using casting

        byte val = 8; // 00001000
        val = (byte)(val << 1); // 00010000 
        System.out.println(val);

        val = (byte)(val << 3); // 10000000
        System.out.println(val);
 
        val = (byte)(val << 1); // 00000000
        System.out.println(val);

        // Right shift ( >> )

        // Same as left shift but empty bit is filled with 
        // MSB of original number to preserve the sign

        // Unsigned Right Shift ( >>> ) [OR] Dumb Right Shift

        // Does the right shift but always fills the empty bit with zero
        // It behaves differently from >> only for negative mumbers

        // ... &, |, ^, ~ ...
        // Lets see ~ first

        // ~N = -(N+1)

        

        // ==========================================
        //            Logical OPERATORS
        // ==========================================

        // (&&), (||) and (!)

        // All three logical operators—&& (Logical AND), || (Logical OR), and ! (Logical NOT)
        // work strictly with boolean values.If you attempt to use any of them with numeric 
        // types like int or double, the Java compiler will throw a type mismatch error.

        // && and || use "short-circuit" evaluation.

        // If you dont want "short-circuit" use & and | in place of of && and || respectively.

        // ^ (XOR) operator acts as both a bitwise XOR for numbers and a logical XOR for booleans.


        // ==========================================
        //            ASSIGNMENT OPERATOR
        // ==========================================

        int val1, val2, val3;
        val1 = val2 = val3 = 10;

        System.out.println(val1 + " " + val2 + " " + val3);

        // ==========================================
        //            TERNARY OPERATOR
        // ==========================================

        // (condition) ? (evaluated if condition true) : (evaluated if condition false)

        System.out.println(val1 == 10 ? "Equals to 10" : "Not equals to 10");

    
    }

}
