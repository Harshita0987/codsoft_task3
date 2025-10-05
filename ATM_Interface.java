import java.util.Scanner;

// Bank account
    class BankAccount {
        private double balance;

        // Constructor
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }   

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= balance;
                System.out.println("Withdrew: $" + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Withdraw amount must be positive.");
            }
        }
            

        // Check balance method
        public void checkBalance() {
            System.out.println("Current Balance: $" + balance);

    }
}

// ATM_Interface() {
class ATM {
    private BankAccount account;

    // Constructor ATM with bank account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Display menu
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {  
            System.out.println("\n ATM Menu:"); 
            System.out.println("1. Withdraw money:");  
            System.out.println("2. Deposit Money:");  
            System.out.println("3. Check Balance:");  
            System.out.println("4. Exit:");  
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.println("Enter the amount of withdraw");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount); 
                    break;
                case 3:
                    account.checkBalance();
                    break;  
                case 4:
                    System.out.println("Thank you for using the ATM. !");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}

// Main class
public class ATM_Interface {
    public static void main(String[] args) {

        // Create a bank account with an initial balance of $1000
        BankAccount myAccount = new BankAccount(1000);

        // Create an ATM with the bank account
        ATM atm = new ATM(myAccount);
        // Display the ATM menu
        atm.displayMenu();
        
    }
}

    
