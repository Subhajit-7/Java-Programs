import java.util.*;
/**
 * Armstrong
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num=n.nextInt();
        int rem,sum=0;
        int sub=num;
        while (num!=0) {
            rem=num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        if (sub==sum) {
            System.out.println(sub+" : is Armstrong number ");
        } else {
            System.out.println(sub+" : is not Armstrong number ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}