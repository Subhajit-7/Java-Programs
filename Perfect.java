import java.util.*;
/**
 * Perfect
 */
public class Perfect {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int num=n.nextInt();
        int sum=0;
        for (int i = 1; i <num; i++) {
            if (num%i==0) {
                sum+=i;
            }
        }
        if (sum==num) {
            System.out.println(sum+" :is perfect number ");
        } else {
            System.out.println(sum+" :is not perfect number ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}