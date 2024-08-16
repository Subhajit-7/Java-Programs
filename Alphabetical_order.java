import java.util.*;
/**
 * Alphabetical_order
 */
public class Alphabetical_order {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = in.nextLine();
        
        int len = str.length();

        String sortedStr = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < len; i++) {
                char strCh = str.charAt(i);
                if (ch == strCh) {
                    sortedStr += strCh;
                }
            }
        }
        
        System.out.print("Alphabetical order : "+sortedStr);
        free(in);
    }

    private static void free(Scanner in) {
    }
}