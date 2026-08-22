package conditionals;

public class SwitchExpression {
    // A switch expression always produces a value
    // Introduced in Java 14

    public static void main(String[] args) {
        int day = 4;

        String dayName = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        // A default case is compulsory in switch 
        // expression unlike switch statement

        System.out.println(dayName);


        // ==================================
        //          Multiple Cases
        // ==================================


        String dayType = switch(day) {
            case 1,2,3,4,5 -> "Weekday";
            case 6,7 -> "Weekend";
            default -> "invalid day";
        };

        System.out.println(dayType);



        // ==================================
        //           With String
        // ==================================


        String fruit = "Apple";

        String description = switch(fruit) {
            case "Apple" -> "Red or green fruit";
            case "Banana" -> "Yellow fruit";
            default -> "Unknown fruit";
        };

        System.out.println(description);



        // ==================================
        //               Yield
        // ==================================

        int marks = 65;

        String grade = switch(marks / 10) {
            case 10, 9 -> "Grade S";
            case 8 -> {
                System.out.println("Very good grade");
                yield "Grade A";
            }
            case 7 -> "Grade B";
            case 6 -> {
                System.out.println("Needs improvement");
                yield "Grade C";
            }
            default -> "Grade D";
        };

        System.out.println(grade);


        // =========================================================
        // IMPORTANT NOTES
        // =========================================================

        // Switch expression RETURNS a value.
        //
        // Arrow syntax (->) does NOT fall through.
        //
        // break is NOT needed with arrow syntax.
        //
        // Multiple cases can be combined:
        // case 1, 2, 3 -> "Something";
        //
        // default is generally needed to make the expression exhaustive.
        //
        // yield returns a value from a switch block.
        //
        // switch expression can be assigned to a variable:
        //
        // switch expression does NOT mean switch can only return String. 
        // It can return any compatible type. (We took only String examples here)
        //
        // Switch input types: byte, short, char, int, their corresponding 
        // wrappers (Byte, Short, Character, Integer), String, and enum.

    }
}
