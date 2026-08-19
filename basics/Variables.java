package basics;

class Variables {

    // Identifiers can contain: Letters, Digits, _ (underscore), $
    // But they cannot start with a digit.

    // A literal is a fixed value written directly in the source code.

    private static String name;
    private static int level;

    public static void main(String[] args) {
        // Declaration + Initialization in one line
        int age = 25;
        
        // Declaration
        int year;
        
        // Initialization
        year = 2026;

        
        // ERROR: A local variable in Java must be initialized before you use it.

        // TODO: Uncomment below two lines to see error
        // String greeting;
        // System.out.println(greeting);

        // Global/Class Level variables can be used, they get default value (zero-value of the data type).
        // String/Any Object -> null
        // int -> 0
        // boolean -> false 
        // etc
        System.out.println("Name: " + name);

        System.out.println("Level: " + level);

        System.out.println("Age: " + age);

        System.out.println("Year: " + year);
    }
}