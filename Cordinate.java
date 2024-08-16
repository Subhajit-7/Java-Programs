import java.util.*;
/**
 * Cordinate
 */
public class Cordinate {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the coordinate of X1: ");
        int x1=n.nextInt();
        System.out.print(" Enter the coordinate of X2: ");
        int x2=n.nextInt();
         System.out.print(" Enter the coordinate of Y1: ");
         int y1=n.nextInt();
          System.out.print(" Enter the coordinate of Y2: ");
          int y2=n.nextInt();
          float a=y2-y1;
          float b=x2-x1;
          float slope=a/b;
           System.out.println(" The slope of line: "+slope);
           free(n);
    }

    public static void free(Scanner n) {
    }
}