import java.util.*;
/**
 * Ones_divisible
 */
public class Ones_divisible {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int digit=n.nextInt();
        int num;
        num=digit%10;
        if (num%7==0) {
            System.out.println(" The digit is divisible by 7 ");
        } else {
            System.out.println(" The digit is not divisible by 7 ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}