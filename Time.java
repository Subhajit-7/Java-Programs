import java.util.*;
/**
 * Time
 */
public class Time {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the time in seconds: ");
        int time=n.nextInt();
        int hour=(time/3600);
        int min=(time%3600)/60;
        int sec=(time%60)%60;
        System.out.println(hour+" hours "+min+" minutes "+sec+" second ");
        free(n);
    }

    public static void free(Scanner n){
    }
}