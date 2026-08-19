package basics;

public class FloatingRepresentation {
    public static void main(String[] args) {
        float val = 0.7F;
        System.out.println(val); // 0.7
        System.out.printf("%.20f\n", val); // 0.69999998807907100000

        // Decimal data types do not store exact values
        // Refere notes [#4] for more info oo how java stores negative and decimal values
    }
}
