package loops;

public class ForLoop {
    public static void main(String[] args) {

        // for loop is useful when the number of iterations or loop control is known.


        // for(initialization; condition; update) { body }
        //
        // initialization  -> runs once
        // condition       -> checked before every iteration
        // body            -> executes if condition is true
        // update          -> executes after the body
        // condition       -> checked again
        //
        //
        // All 3 expressions are optional but both semicolons are mandatory

        
        for(int i=0; i<5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for(int i=1, j=5; i<=5; i++, j--) {
            System.out.println(i + " " + j);
        }

        
        // for(;;) {
        //     System.out.println("Infinite loop");
        // }


        // ======================================
        //            BREAK & CONTINUE
        // ======================================


        for(int i = 1; i <= 10; i++) {
            if(i == 5)  break;
            System.out.println(i);
        }


        for(int i = 1; i <= 10; i++) {
            if(i == 5) continue;
            System.out.println(i);
        }


        // ======================================
        //            NESTED LOOP
        // ======================================

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }

    }
}
