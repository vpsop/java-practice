package conditionals;

public class IfStatement {
    public static void main(String[] args) {

        // if condition must always evaluate to boolean.
        // Java does NOT allow numbers as conditions.

        // if (1) { }       // ERROR
        // if (age) { }     // ERROR
        
        int age = 20;

        if(age >= 18) {
            System.out.println("You are an adult");
        }


        int num = 7;

        if(num % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        int marks = 75;

        if(marks >= 90) {
            System.out.println("Grade S");
        } 
        else if(marks >= 80) {
            System.out.println("Grade A");
        } 
        else if(marks >= 70) {
            System.out.println("Grade B");
        } 
        else{
            System.out.println("Grade C");
        }


        int age2 = 21;
        boolean hasLicense = false;

        if(age2 >= 18) {

            if(hasLicense) {
                System.out.println("You can drive");
            } 
            else{
                System.out.println("You need a DL to drive");
            }
        }
        else {
            System.out.println("You are not eligible for DL");
        }


        int temprature = 40;

        if(temprature >= 20 && temprature <= 30) {
            System.out.println("Temprature is comfortable");
        }
        else if(temprature > 30) {
            System.out.println("It's hot today");
        } 
        else if(temprature < 30) {
            System.out.println("It's cold today");
        }
        else {
            System.out.println("It's normal weather today");
        }
    }
}
