import java.util.*;
/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int num=n.nextInt();
        int rem,sum=0;
        int temp=num;
        while (num!=0) {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if (temp==sum) {
            System.out.println(" The number is palimdrome ");
        } else {
            System.out.println(" The number is not palindrome ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}