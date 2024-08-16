import java.util.Scanner;

// Base class representing a generic bank account
class Account {
    String name;
    long AC_NO;
    String AC_type;
    double balance;

    // Constructor to initialize an account with basic details
    Account(String name, double balance, String AC_type, long AC_NO) {
        this.name = name;
        this.balance = balance;
        this.AC_type = AC_type;
        this.AC_NO = AC_NO;
    }

    // Method to view account details
    void viewAccount() {
        System.out.println("----------------------------------");
        System.out.println(" **** " + AC_type + " **** ");
        System.out.println(" Name : " + name);
        System.out.println(" Account Number : " + AC_NO);
        System.out.println(" Balance : $" + balance);
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + "accepted.");
        System.out.println(" Current Balance : $" + balance);
    }

    // Method to withdraw money from the account
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + "successful.");
            System.out.println(" Current Balance : $" + balance);
        } else {
            System.out.println("Insufficient balance to withdraw $" + amount);
        }
    }
}

// Subclass representing a current account with specific rules
class Curr_Acct extends Account {
    private static final double MINIMUM_BALANCE = 5000.0;  // Minimum balance required
    private static final double PENALTY_AMOUNT = 100.0;     // Penalty for not maintaining minimum balance

    // Constructor to initialize a current account
    Curr_Acct(String name, double balance, long AC_NO) {
        super(name, balance, "CURRENT ACCOUNT", AC_NO);
    }

    // Overridden method to include minimum balance check after withdrawal
    @Override
    void withdraw(double amount) {
        super.withdraw(amount);
        minimumBalance();
    }

    // Method to enforce minimum balance and impose penalty if needed
    void minimumBalance() {
        if (balance < MINIMUM_BALANCE) {
            balance -= PENALTY_AMOUNT;
            System.out.println("Minimum balance not maintained. Penalty of $" + PENALTY_AMOUNT + "imposed.");
            System.out.println(" Current Balance : $" + balance);
        }
    }
}

// Subclass representing a savings account with interest deposit functionality
class Sav_Acct extends Account {
    private static final double INTEREST_RATE = 6.0;    // Interest rate for savings accounts

    // Constructor to initialize a savings account
    Sav_Acct(String name, double balance, long AC_NO) {
        super(name, balance, "SAVINGS ACCOUNT", AC_NO);
    }

    // Method to compute and deposit interest based on the current balance
    void depositInterest() {
        double interest = balance * (INTEREST_RATE / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + "deposited.");
        System.out.println(" Current Balance : $" + balance);
    }
}

// Main application class for managing bank accounts
public class BankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new account based on user input
        Account userAccount = createAccount(scanner);

        int choice;
        do {
            // Display menu options
            System.out.println("----------------------------------");
            System.out.println(" 1: View your Account");
            System.out.println(" 2: Deposit ");
            System.out.println(" 3: Withdraw ");
            if (userAccount instanceof Sav_Acct) {
                System.out.println(" 4: Compute & Deposit Interest (Savings Account)");
            }
            System.out.println(" 5: Exit ");
            System.out.println("----------------------------------");
            System.out.print(" Enter your choice : ");
            choice = scanner.nextInt();

            // Execute action based on user choice
            switch (choice) {
                case 1:
                    // View account details
                    userAccount.viewAccount();
                    break;
                case 2:
                    // Deposit money into the account
                    System.out.print(" Enter the amount you want to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    // Withdraw money from the account
                    System.out.print(" Enter the amount you want to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    // Compute and deposit interest (only for savings accounts)
                    if (userAccount instanceof Sav_Acct) {
                        ((Sav_Acct) userAccount).depositInterest();
                    }
                    break;
                case 5:
                    // Exit the application
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println(" -- TRY AGAIN -- ");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to create a new account based on user input
    public static Account createAccount(Scanner scanner) {
        System.out.println("----------------------------------");
        System.out.println("Create a new account");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Use nextLine to capture full name
        System.out.print("Enter your account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();  // Consume newline
        System.out.println("Choose account type: 1 for Savings, 2 for Current");
        int accountTypeChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Create either a savings or current account based on user choice
        if (accountTypeChoice == 1) {
            return new Sav_Acct(name, 0, accountNumber);
        } else if (accountTypeChoice == 2) {
            return new Curr_Acct(name, 0, accountNumber);
        } else {
            // Default to savings account if an invalid choice is made
            System.out.println("Invalid choice. Creating Savings Account by default.");
            return new Sav_Acct(name, 0, accountNumber);
        }
    }
}
