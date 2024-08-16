import java.util.*;
/**
 * Ascending_order
 */
public class Ascending_order {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter a number of 3 digit or more : ");
        long num = n.nextLong();
        System.out.print(" Asscending order : ");
        for (int i = 0; i < 10; i++) {
            for (long j = num; j != 0; j /= 10) {
                long rem = j%10;
                if (rem == i) {
                    System.out.print(rem+", ");
                }
            }
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}