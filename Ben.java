// Create the class BankAccount

class BankAccount {
    // Fields or attributes
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Shs: " + amount);

        } else {
            System.out.println("No money has been deposited: ");

        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Shs: " + amount);
        } else {
            System.out.println("Insufficient balance");

        }
    }

    // Method to check the account balance
    public void checkBalance(double amount) {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Print the display in the console or terminal

public class Ben {
    public static void main(String[] args) {
        // Create two BankAccount Objects
        BankAccount account1 = new BankAccount("800801", 100000);
        BankAccount account2 = new BankAccount("900901", 50000);

        // Deposit money and withdraw money
        account1.deposit(50000);
        account2.withdraw(15000);

        // Check the account balance
        account1.checkBalance(0);
        account2.checkBalance(0);
    }
}