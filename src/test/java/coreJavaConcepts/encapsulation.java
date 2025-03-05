package coreJavaConcepts;

class BankAccount {
    // Private variables (data hiding)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        
        // Accessing the account details via getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        // Modifying the balance via setters (methods)
        account.deposit(200.0);    // Output: Deposited: 200.0
        account.withdraw(150.0);   // Output: Withdrew: 150.0
        System.out.println("New Balance: " + account.getBalance()); // Output: New Balance: 1050.0
    }
}
