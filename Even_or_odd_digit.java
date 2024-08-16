import java.util.*;
/**
 * Even_or_odd_digit
 */
public class Even_or_odd_digit {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int num=n.nextInt();
        int rem,even=0,odd=0;
        while (num!=0) {
            rem=num%10;
            if (rem%2==0) {
                even+=rem;
            } else {
                odd+=rem;
            }
            num/=10;
        }
        System.out.println(" The sum of even digits : "+even);
        System.out.println(" The sum of odd digits : "+odd);
        free(n);
    }

    public static void free(Scanner n) {
    }
}