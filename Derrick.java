// Demonstrate creating multiple objects from the class

//Create class for BankAccount

class BankAccount {
    // Field (Attribute)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money to a bank account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money from a bank account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);

        } else {
            System.out.println("Insufficient funds");

        }
    }

    // Method to check the account balance
    public void checkBalance(double amount) {
        System.out.println("Account balance: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Create class from main Derrick

// Display the output in terminal or console
public class Derrick {
    public static void main(String[] args) {
        // Create two BankAccount objects
        BankAccount account1 = new BankAccount("95955", 20000);
        BankAccount account2 = new BankAccount("10100", 15000);

        // Desposit and withdraw money from the accounts
        account1.deposit(2000);
        account2.withdraw(2500);

        // Check the account balances
        account1.checkBalance(0);
        account2.checkBalance(0);

    }
}

// Inheritance