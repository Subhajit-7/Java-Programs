import java.util.*;
/**
 * Salary
 */
public class Salary {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the salary amount: ");
        int salary=n.nextInt();
        int food=salary/2;
        int rent=salary/15;
        int misce=salary/10;
        int saved=salary-food-rent-misce;
        System.out.print(" The money spend on food is: "+food+"\n");
        System.out.print(" The money spend on rent is: "+rent+"\n");
        System.out.print(" The money spend on miscelleneous is: "+misce+"\n");
        System.out.print(" The money saved from the salary is: "+saved+"\n");
        free(n);
    }

    public static void free(Scanner n) {
    }
}