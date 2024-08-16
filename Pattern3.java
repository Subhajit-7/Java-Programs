import java.util.*;
/**
 * Pattern3
 */
public class Pattern3 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter the number of rows : ");
        int num = n.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("# ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}