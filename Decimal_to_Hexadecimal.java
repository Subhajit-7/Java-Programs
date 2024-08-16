import java.util.*;
/**
 * Decimal_to_Hexadecimal
 */
public class Decimal_to_Hexadecimal {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter a decimal number : ");
        int decimal = n.nextInt();
        System.out.println(" Hexadecimal no. of "+decimal+" is : "+Integer.toString(decimal, 16));
        free(n);
    }

    private static void free(Scanner n) {
    }
}