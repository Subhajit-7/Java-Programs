import java.util.*;
/**
 * Divisible
 */
public class Divisible {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int number=n.nextInt();
        if (number%5==0||number%7==0) {
            System.out.println(" The number is divisible by 5 or 7 ");
        } else {
            System.out.println(" The number is not divisible by 5 or 7 ");
        }
        if (number%5==0&&number%7==0) {
            System.out.println(" The number is divisible by 5 and 7 ");
        } else {
            System.out.println(" The number is not divisible by 5 and 7 ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }   
}