package arrays;

public class Arrays {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] arr = new int[3];
        // System.out.println(arr[3]);  ArrayOutOfBoundException

        System.out.println(arr.length); // 3

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
 
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        int[][] marks = new int[3][2];

        marks[0][0] = 71;
        marks[0][1] = 89;

        marks[1][0] = 92;
        marks[1][1] = 84;

        marks[2][0] = 77;
        marks[2][1] = 63;

        for (int[] studentMarks : marks) {
            System.out.println(studentMarks[0] + " " + studentMarks[1]);
        }



        // Different length 2D arrays
        // Every row can have different length

        int[][] marks2 = new int[4][];

        marks2[0] = new int[2];
        marks2[1] = new int[3];
        marks2[2] = new int[4];
        marks2[3] = new int[5];

        for (int[] studentMarks : marks2) {
            for (int m : studentMarks) {
                System.out.print(m + " ");
            }
            System.out.println();
        }


        int[][][] marks3 = new int[4][][];

        // dimensions can be given only from start
        // we cannot do something like new int[][4][] or int[][][4]
        // once you leave a dimesion blank you cannot assign any dimesion after that.
        // AND you have to give atleast one dimesion.



        int[] arr1 = {1, 2, 3};

        int[][] arr2 = {{1,2},{3,4}};

         




        
    }
}
