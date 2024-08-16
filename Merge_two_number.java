import java.util.*;
/**
 * Merge_two_number
 */
public class Merge_two_number {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the first number : ");
        int first=n.nextInt();
        System.out.print(" Enter the second number : ");
        int second=n.nextInt();
        String merge=Integer.toString(first)+Integer.toString(second);
        System.out.print(" Merged numebr: "+merge);
        free(n);
    }

    public static void free(Scanner n) {
    }
}