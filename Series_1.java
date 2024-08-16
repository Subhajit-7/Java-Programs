import java.util.*;
/**
 * Series_1
 */
public class Series_1 {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the number of terms : ");
        int num = n.nextInt();
        double sum = 0;
        for (int i = 1 ; i <= num; i++ ) {
            double fact = 1;
            int j = 1;
            for (int k = 1; k <= i; k++) {
                fact *= k;
            }
            sum += j / fact;   
            j = j+2;           
        }
        System.out.println(" Sum of Series is : "+sum);
        free(n);
    }

    public static void free(Scanner n) {
    }
}