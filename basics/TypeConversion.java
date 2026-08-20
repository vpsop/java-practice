package basics;

public class TypeConversion {

    // 2 Types -> Implicit and Explicit

    public static void main(String[] args) {
        // =========================================
        //           IMPLICIT CONVERSIONS
        // =========================================
        
        // Also called widening conversions

        // Rule: Destination data type should be wider that source data type
        // "Wider" is not always based simply on bit size.

        // Rule: Widening conversion must be a permitted widening primitive conversion.


        // byte -> (short, int, long, float, double)
        // byte -> char is not an implicit conversion

        // byte: 8-bit signed -> -128 to 127
        // char: 16-bit unsigned -> 0 to 65,535

        // So byte -> char or short -> char is not widening because char cannot represent negative byte values.

        byte b = 100;
        short s;
        s = b;

        // short -> (int, long, float, double)
        int i;
        i = s;

        // int -> (long, float, double)
        long l;
        l = i;

        double d;
        d = i;

        
        // long -> (float, double)
        float f;
        f = l;

        // float -> (double)
        double d2;
        d2 = f;


        // double -> X double is never implicitly casted in Java

        
        // char -> (int, long, float, double)
        char ch = 'a';
        double d3 = ch;


        // boolean -> cannot be casted in Java 
        // neither implicitly nor explicitly


        System.out.println(s + " " + i + " " + l + " " + d + " " + f + " " + d2 + " " + d3);


        // =========================================
        //           EXPLICIT CONVERSIONS
        // =========================================

        // Larger -> smaller requires explicit cast.
        // float/double -> integer truncates the decimal part.
        // long -> int, int -> short, etc. can overflow/wrap if the value doesn't fit.
        // int/long -> char is allowed with an explicit cast.
        // char -> byte/short requires an explicit cast.
        // boolean cannot be explicitly converted to/from any other primitive

        // double → float → long → int → short → byte
        //                          ↑
        //                        char


        long l4 = 130;
        byte b4 = (byte) l4;     // -126 — overflow/wraparound

        int x4 = 65;
        char c4 = (char) x4;     // 'A'

        System.out.println(b4 + " " + c4);

        // =========================================
        //           TRUNCATING CONVERSIONS
        // =========================================

        // float/double -> integer are truncating conversions
        // Truncation specifically means removing the fractional part, not the same thing as overflow.

        double d4 = 10.9;
        int i4 = (int) d4;       // 10 — decimal truncated

        System.out.println(i4);

    }
} 