import java.util.*;
/**
 * Bank_Account
 */
public class Bank_Account {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.print(" Enter the name of the Account Holder : ");
        String name = n.nextLine();
        System.out.print(" Enter the Account type : ");
        String AC_type = n.nextLine();
        System.out.print(" Entet the Account Number : ");
        long AC_NO = n.nextLong();
        System.out.print(" Enter the Balance of the Account : ");
        double amount = n.nextDouble();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1: View your Account");
        System.out.println(" 2: Deposit ");
        System.out.println(" 3: Withdraw ");
        System.out.println(" 4: Exit ");
        System.out.println("---------------------------------------------------");
        int choice;
        do {
            System.out.print(" Enter your choice : ");
            choice = n.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---------------------------------------------------");
                    System.out.println(" **** "+AC_type+" **** ");
                    System.out.println(" Name : "+name);
                    System.out.println(" Account Number : "+AC_NO);
                    System.out.println(" Balance : "+amount);
                    System.out.println("---------------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------------");
                    System.out.println(" **** "+AC_type+" **** ");
                    System.out.println(" Name : "+name);
                    System.out.println(" Account Number : "+AC_NO);
                    System.out.println(" Balance : "+amount);
                    System.out.print(" Enter the amount you want to Deposit : ");
                    double deposit = n.nextDouble();
                    amount += deposit;
                    System.out.println(" Current Balance : "+amount);
                    System.out.println("---------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------------");
                    System.out.println(" **** "+AC_type+" **** ");
                    System.out.println(" Name : "+name);
                    System.out.println(" Account Number : "+AC_NO);
                    System.out.println(" Balance : "+amount);
                    System.out.print(" Enter the amount you want to Withdraw : ");
                    double withdraw = n.nextDouble();
                    if (amount >= withdraw) {
                        amount -= withdraw;
                        System.out.println(" Current Balance : "+amount);
                        System.out.println("---------------------------------------------------");
                    } else {
                        System.out.println(" Balance Insificent");
                        System.out.println("---------------------------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("---------------------------------------------------");
                    break;
            
                default:
                    System.out.println(" -- TRY AGAIN -- ");
            }
        } while (choice != 4);
        free(n);
    }

    private static void free(Scanner n) {
    }

}