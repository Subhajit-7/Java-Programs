import java.util.*;
/**
 * Ascii_code
 */
public class Ascii_code {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter a string of any 10 character : ");
        String word=n.nextLine();
        int ascii=0;
        for (int i = 0; i < word.length(); i++) {
            ascii+=(int)word.charAt(i);
        }
        System.out.print(" The sum of ASCII codes is : "+ascii);
        free(n);
    }

    public static void free(Scanner n) {
    }
}