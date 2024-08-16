import java.util.*;
/**
 * Square_root
 */
public class Square_root {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int num=n.nextInt();
        double rem,sum=0;
        while (num!=0) {
            rem=num%10;
            sum+=Math.sqrt(rem);
            num/=10;
        }
        System.out.println(" The sum of digit after square root is : "+sum);
        free(n);
    }

    public static void free(Scanner n) {
    }
}