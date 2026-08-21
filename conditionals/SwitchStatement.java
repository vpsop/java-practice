package conditionals;

public class SwitchStatement {
    // Supports byte, short, char, int ( and their wrapper classes)
    // Supports String and Enum
    
    public static void main(String[] args) {
        int day = 4;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                // Executes when no case matches
                System.out.println("Invalid day");
        }

        // Why break?

        // break prevents execution from continuing into the next case.
        // without break fall through happens

        int day2 = 2;

        switch(day2) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


        // Since there is no break:
        // case 2 matches -> then case 3 also executes -> until a break is found or cases end
        //
        // This is called FALL-THROUGH. Sometimes we intentionally need it.

        int dayNumber = 6;

        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day");
        }




        String fruit = "Apple";

        switch (fruit) {

            case "Apple":
                System.out.println("Red or green fruit");
                break;

            case "Banana":
                System.out.println("Yellow fruit");
                break;

            case "Mango":
                System.out.println("King of fruits");
                break;

            default:
                System.out.println("Unknown fruit");
        }



        // ===============  NOTES  ==================
        // default is optional.
        // break is optional, but without it fall-through may happen.
        // switch is useful when comparing one value against multiple fixed cases.
    }
}
