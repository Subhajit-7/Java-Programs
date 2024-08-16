import java.util.*;
/**
 * Automorphic
 */
public class Automorphic {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num=n.nextInt();
        int square=num*num;
        int sub=num;
        int count=0;
        while (num!=0) {
            if (square%10!=num%10) {
                count++;
            }
            square/=10;
            num/=10;
        }
        if (count>0) {
            System.out.println(sub+" : is not Automorphic number ");
        } else {
            System.out.println(sub+" : is Automorphic number ");
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}