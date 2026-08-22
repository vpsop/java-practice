package loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        // ======================================
        //            EXECUTION ORDER
        // ======================================
        //
        // 1. condition is checked
        // 2. body executes if condition is true
        // 3. condition is checked again
        //
        // The condition is checked BEFORE the body.


        // Break and continue is same as for loop


        // while(true) {
        //     System.out.println("Infinite loop");
        // }


        // ======================================
        //            NESTED LOOP
        // ======================================

        int a = 1;
        while(a <= 3) {

            int b = 1;
            while(b <= 3) {
                System.out.println(a + " " + b);
                b++;
            }
            a++;
        }

    }
}
