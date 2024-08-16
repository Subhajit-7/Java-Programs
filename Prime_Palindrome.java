/**
 * Prime_Palindrome
 */
public class Prime_Palindrome {

    public static void main(String[] args) {
        int flag,count=0;
        System.out.println(" All Prime Palindrome numbers between 10 & 1000 : ");
        for (int i = 10; i <= 1000; i++) {
            int num =i,palindrome=0;
            while (num != 0) {
                int rem = num % 10;
                palindrome = palindrome * 10 + rem;
                num /= 10;
            }
            if (palindrome == i) {
                flag = 1;
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.print(i+", ");
                    count++;
                    if (count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
            }
        }
    }
}