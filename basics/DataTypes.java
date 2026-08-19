package basics;

// Primitive
// ├── Integer → byte, short, int, long
// ├── Decimal → float, double
// ├── Character → char
// └── Boolean → boolean

public class DataTypes {
    public static void main(String[] args) {

        // Underscore must be within/between digits
        
        // Integer Data Types

        // byte -> 1 byte
        byte x = 1_2;

        // short -> 2 byte
        short y = 1__32;
        
        // int -> 4 byte
        int a = 5;

        // long -> 8 byte
        long b = 10_________0L;

        System.out.println(x + " " + y + " " + a + " " + b);


        // Decimal Data Types

        // float -> 4 byte
        float c = 1_0.2F;

        // double -> 8 byte
        double d = 1_12.4;

        System.out.println(c + " " + d);


        // Character Data Type

        // ERROR: Character should be in single quotes
        // char ch = "a";

        // char -> 2 byte  
        // Unicode UTF-16
        char ch2 = 'b';
        
        System.out.println(ch2);

        
        // Boolean Data Types
        // Exact memory size is not precisely defined by the Java Virtual Machine (JVM) specification
        // 1 byte but JVM may optimize for boolean[] 
        boolean isAvailable = false;

        System.out.println(isAvailable);
    }
    
}
