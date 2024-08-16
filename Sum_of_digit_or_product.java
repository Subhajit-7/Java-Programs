import java.util.*;
/**
 * Sum_of_digit_or_product
 */
public class Sum_of_digit_or_product {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int digit=n.nextInt();
        int ones,tens;
        int num,sum=0;
        int product=1;
        ones=digit%10;
        tens=(digit/10)%10;
        if (ones>tens) {
            while (digit!=0) {
                num=digit%10;
                sum+= num;
                digit/=10;
            }
            System.out.println("The sum of digit is: "+sum);
        } else {
            while (digit!=0) {
                num=digit%10;
                product*=num;
                digit/=10;
            }
            System.out.println("The product of digit is: "+product);
        }
    free(n);
    }

    public static void free(Scanner n) {
    }
}