import java.util.*;
/**
 * Niven
 */
public class Niven {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num=n.nextInt();
        int rem,sum=0;
        int sub=num;
        while (num!=0) {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        if (sub%sum==0) {
            System.out.println(sub+" :is Niven number ");
        } else {
            System.out.println(sub+" :is not Niven number ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}