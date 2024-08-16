import java.util.*;
/**
 * BankApp
 */
class Account{
    String Name;
    long AC_NO;
    String AC_type;
    double Balance;

    void Deposit(double amount){
        Balance += amount;
        System.out.println(" Deposit of $" +amount+ " accepted. ");
    }

    void display(){
        System.out.println(" Balance : $"+Balance);
    }
}

class Curr_Acct extends Account {
    double minimum;
    double penalty;

    void MinimumBalance(){
        if (Balance < minimum) {
            Balance -= penalty;
            System.out.println(" Minimum balance not maintained. Penalty of $" +penalty+ " imposed. ");
        }
    }

    void Withdraw(double amount){
        if (Balance >= amount) {
            Balance -= amount;
            System.out.println(" Withdrawal of $" +amount+ " successful. ");
        } else {
            System.out.println(" Insufficient balance to withdraw $" +amount);
        }
        MinimumBalance();
    }
}

class Sav_Acct extends Account{
    double interestRate;

    void DepositInterest(){
        double interest = Balance * (interestRate / 100);
        Balance += interest;
        System.out.println(" Interest of $" +interest+ " deposited. ");
    }

    void Withdraw(double amount){
        if (Balance >= amount) {
            Balance -= amount;
            System.out.println(" Withdrawal of $" +amount+ " successful. ");
        } else {
            System.out.println(" Insufficient balance to withdraw $" +amount);
        }
    }
}

public class BankApp {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Sav_Acct ob = new Sav_Acct();
        ob.Name = " Jonerthon";
        ob.AC_NO = 321215564;
        ob.AC_type = " SAVINGS ACCOUNT ";
        ob.Balance = 100000;
        ob.interestRate = 6.0;
        Curr_Acct ab = new Curr_Acct();
        ab.Name = " James";
        ab.AC_NO = 422698106;
        ab.AC_type = " CURRENT ACCOUNT ";
        ab.Balance = 150000;
        ab.minimum = 50000;
        ab.penalty = 100.0;
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t --- MENU --- ");
        System.out.println(" 1: Deposit ");
        System.out.println(" 2: Withdraw ");
        System.out.println(" 3: Display Balance ");
        System.out.println(" 4: Compute & Deposit Interest (Savings Account)");
        System.out.println(" 5: Exit ");
        int choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.print(" Enter your choice : ");
            choice = n.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------------------");
                    System.out.println(" Enter which Account you want to deposit ");
                    System.out.println(" 1: Savings Account.");
                    System.out.println(" 2: Current Account.");
                    System.out.print(" Enter your choice : ");
                    int ch = n.nextInt();
                    if (ch == 1) {
                        System.out.print(" Enter the amount to deposit : $");
                        double deposit = n.nextDouble();
                        ob.Deposit(deposit);
                    } else if (ch == 2){
                        System.out.print(" Enter the amount to deposit : $");
                        double deposit = n.nextDouble();
                        ab.Deposit(deposit);
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    System.out.println(" Enter which Account you want to withdraw ");
                    System.out.println(" 1: Savings Account.");
                    System.out.println(" 2: Current Account.");
                    System.out.print(" Enter your choice : ");
                    int cho = n.nextInt();
                    if (cho == 1) {
                        System.out.print(" Enter the amount to withdraw : $");
                        double withdraw = n.nextDouble();
                        ob.Withdraw(withdraw);
                    } else if (cho == 2){
                        System.out.print(" Enter the amount to withdraw : $");
                        double withdraw = n.nextDouble();
                        ab.Withdraw(withdraw);
                    }
                    break;
                case 3:
                    System.out.println("----------------------------------------------------");
                    System.out.println("\t ** "+ob.AC_type+" ** ");
                    System.out.println(" Name of the Account Holder : "+ob.Name);
                    System.out.println(" Account Number : "+ob.AC_NO);
                    ob.display();
                    System.out.println("----------------------------------------------------");
                    System.out.println("\t ** "+ab.AC_type+" ** ");
                    System.out.println(" Name of the Account Holder : "+ab.Name);
                    System.out.println(" Account Number :"+ab.AC_NO);
                    ab.display();
                    break;
                case 4:
                    System.out.println("----------------------------------------------------");
                    System.out.print(" Compute & Deposit Interest for Savings Account : ");
                    ob.DepositInterest();
                    break;
                case 5:
                    System.out.println("----------------------------------------------------");
                    System.out.println(" Exiting....");
                    break;
            
                default:
                    System.out.println(" --- Try Again --- ");
            }
            
        } while (choice != 5);
        free(n);
    }

    public static void free(Scanner n) {
    }
}