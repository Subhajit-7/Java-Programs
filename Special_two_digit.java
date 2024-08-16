import java.util.*;
/**
 * Special_two_digit
 */
public class Special_two_digit {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter a two digit numebr : ");
        int num = n.nextInt();
        int sum=0,product=1,result=0;
        for (int i = num; i!=0 ; i/=10) {
            int rem = i%10;
            sum += rem;
            product *= rem;
        }
        result = sum + product;
        if (result == num) {
            System.out.print(result+ " : is Equal to the original number. ");
        } else {
            System.out.print(result+ " : is Not Equal to the original number. ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}