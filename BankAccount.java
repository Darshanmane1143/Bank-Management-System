public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean login (int enteredPin) {
        if (this.pin == enteredPin) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Invalid Pin");
            return false;
        }
    }

    void checkBalance() {
        System.out.println("Current: " + this.balance); 
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }

}
