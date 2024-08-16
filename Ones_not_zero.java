/**
 * Ones_not_zero
 */
public class Ones_not_zero {

    public static void main(String[] args) {
        int count = 0;
        System.out.println(" All the numbers between 100 & 200 without contain zero at one's position : ");
        for (int i = 100; i <= 200; i++) {
            if (i%10 != 0) {
                System.out.print(i+", ");
                count++;
                if (count == 15) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}