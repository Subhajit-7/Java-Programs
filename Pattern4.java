import java.util.*;
/**
 * Pattern4
 */
public class Pattern4 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter the number of rows : ");
        int num = n.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}