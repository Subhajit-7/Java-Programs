import java.util.*;
/**
 * Swap_with
 */
public class Swap_with {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println(" Enter the first number: ");
        int first=n.nextInt();
        System.out.println(" Enter the second number: ");
        int second=n.nextInt();
        int third;
        third=first;
        first=second;
        second=third;
        System.out.println(" After the swapping first number is: "+first);
        System.out.println(" After the swapping second number is: "+second);
      free(n);  
    }

    public static void free(Scanner n) {
    }
}
