package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 5);


        // [do-while] executes the body FIRST.
        // Then it checks the condition.

        int x = 10;

        do {
            System.out.println("Executed once");
        } while(x < 5);

        // Executed once
        //
        // Even though x < 5 is false,
        // the body executes once.

        // Notice the semicolon after while(condition):
    }
}
