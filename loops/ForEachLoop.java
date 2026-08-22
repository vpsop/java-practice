package loops;

import java.util.List;

public class ForEachLoop {
    // Used to iterate over arrays and Iterable collections.

    //  for(type variable : arrayOrIterable) {
    //      ...
    //      ...
    //  }

    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};

        for(int num : nums) {
            System.out.println(num);
        }

        String[] fruits = { "Apple", "Banana", "Mango" };

        for(String fruit : fruits) {
            System.out.println(fruit);
        }


        List<String> names = List.of("Alice", "Bob", "Charlie");
        
        for(String name : names) {
            System.out.println(name);
        }


        // Enhanced for loop gives you the element, not its index.
        // Use a normal for loop if index is needed.

    }
}
