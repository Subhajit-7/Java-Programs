import java.util.*;
/**
 * InnerCombination
 */
public class Combination {
    
    public static void main(String[] args) {
        int i, j, k;
        System.out.print("Enter 3 numbers : ");
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        int d[] = { a, b, c };
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    if (i != j && j != k && k != i)
                        System.out.println(d[i] + " " + d[j] + " " + d[k]);
                }
            }
        }
    }
}