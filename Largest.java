import java.util.*;
/**
 * Largest
 */
public class Largest {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the first number: ");
        int first=n.nextInt();
        System.out.print(" Enter the second number: ");
        int second=n.nextInt();
        System.out.print(" Enter the third number: ");
        int third=n.nextInt();
        if (first>second&&first>third) {
            System.out.println(first+" :  is the largest number ");
        } else if (second>first&&second>third) {
            System.out.println(second+" :  is the largest number ");
        } else {
            System.out.println(third+" :  is the largest number ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}