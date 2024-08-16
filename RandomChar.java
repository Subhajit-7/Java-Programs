import java.util.*;
/**
 * RandomChar
 */
public class RandomChar {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the length of the string : ");
        int num=n.nextInt();
        for (int i = 0; i < num; i++) {
            char random = (char) (ran.nextInt(10) + 'A');
            System.out.print(random);
        }
        free(n);
    }

    public static void free(Scanner n) {
    }
}