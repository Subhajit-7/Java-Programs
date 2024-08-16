import java.util.*;
/**
 * BankAccount
 */
public class BankAccount {
    String name;
    double amount;
    String AC_type;
    int AC_NO;
    Scanner n = new Scanner(System.in);
    BankAccount(String name, double amount, String AC_type, int AC_NO){
        this.name = name;
        this.amount = amount;
        this.AC_type = AC_type;
        this.AC_NO = AC_NO;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        BankAccount ob = new BankAccount("Subhajit", 100000, "SAVINGS ACCOUNT", 313216001);
        System.out.println("----------------------------------");
        System.out.println(" 1: View your Account");
        System.out.println(" 2: Deposit ");
        System.out.println(" 3: Withdraw ");
        System.out.println(" 4: Exit ");
        int choice;
        do {
            System.out.println("----------------------------------");
            System.out.print(" Enter your choice : ");
            choice = n.nextInt();
            switch (choice) {
                case 1:
                    ob.View();
                    break;
                case 2:
                    ob.Deposit();
                    break;
                case 3:
                    ob.Withdraw();
                    break;
                case 4:
                    System.out.println("----------------------------------");
                    break;
            
                default:
                    System.out.println(" -- TRY AGAIN -- ");
            }
        } while (choice != 4);
        free(n);
    }

    private static void free(Scanner n) {
    }

    void View(){
        System.out.println("----------------------------------");
        System.out.println(" **** "+AC_type+" **** ");
        System.out.println(" Name : "+name);
        System.out.println(" Account Number : "+AC_NO);
        System.out.println(" Balance : "+amount);
    }
    void Deposit(){
        View();
        System.out.print(" Enter the amount you want to Deposit : ");
        double deposit = n.nextDouble();
        amount = amount + deposit;
        System.out.println(" Current Balance : "+amount);
    }
    void Withdraw(){
        View();
        System.out.print(" Enter the amount you want to Withdraw : ");
        double withdraw = n.nextDouble();
        if (amount >= withdraw) {
            amount = amount - withdraw;
            System.out.println(" Current Balance : "+amount);
        } else {
            System.out.println(" -- Balance Insificent -- ");
        }
    }
}