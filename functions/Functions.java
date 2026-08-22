package functions;

public class Functions {
    // returnType methodName(parameters) {
    //      ... body ... 
    // }

    public static void main(String[] args) {
        System.out.println(sum(4,5)) /* Arguments */;
    }

    static int sum(int a, int b) /* Parameters */ {
        return a + b;
    }


    // 4 types
    // 1. No input, no output
    // 2. No input but gives output
    // 3. Input but no output
    // 4. Input and gives output


    // ==== Overloading =====

    static double sum(double a, double b) {
        return a + b;
    }
} 
