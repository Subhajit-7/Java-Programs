import java.util.*;
/**
 * Sum_and_avg_of_digit
 */
public class Sum_and_avg_of_digit {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int num=n.nextInt();
        int rem,sum=0,avg=0;
        int sub=num,count=0;
        while (num!=0) {
            rem=num%10;
            sum+=rem;
            num/=10;
            count++;
        }
        avg=sum/count;
        System.out.println(" The sum of "+sub+" is : "+sum);
        System.out.println(" The average of "+sub+" is : "+avg);
        free(n);
    }

    public static void free(Scanner n) {
    }
}