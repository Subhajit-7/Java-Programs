import java.util.*;
/**
 * Series_2
 */
public class Series_2 {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the number of terms : ");
        int num = n.nextInt();
        double sum = 1;
        for (int i = 2; i <= num; i++) {
            double fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            if (i % 2 == 0) {
                sum += 1 / fact;
            } else {
                sum -= 1 / fact;
            }
        }
        System.out.println(" Sum of Series is = "+sum);
        free(n);
    }

    public static void free(Scanner n) {
    }
}