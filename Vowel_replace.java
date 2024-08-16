import java.util.*;
/**
 * Vowel_replace
 */
public class Vowel_replace {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter your string here: ");
        String s = n.nextLine();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                s = s.replace(ch, ++ch);
            }
        }
        System.out.println(s);
        free(n);
    }

    private static void free(Scanner n) {
    }
}