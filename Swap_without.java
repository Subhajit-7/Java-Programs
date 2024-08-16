import java.util.*;
/**
 * Swap_without
 */
public class Swap_without {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println(" Enter the first number: ");
        int first=n.nextInt();
        System.out.println(" Enter the second number: ");
        int second=n.nextInt();
        first=first+second;
        second=first-second;
        first=first-second;
        System.out.println(" After the swapping first number is: "+first);
        System.out.println(" After the swapping second number is: "+second);
        free(n);
    }

    public static void free(Scanner n) {
    }
}