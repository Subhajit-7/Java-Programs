import java.util.*;
/**
 * Pattern2
 */
public class Pattern2 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter the number of rows : ");
        int num = n.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2==0) {
                    System.out.print((j+1)%2+" ");
                } else {
                    System.out.print(j%2+" ");
                }
            }
            System.out.println();
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}