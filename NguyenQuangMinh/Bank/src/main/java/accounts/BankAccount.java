package accounts;

public class BankAccount {
    private double balance;
    private int transactionCount;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        System.out.println("Create new account with balance: " + initialBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionCount ++;
        System.out.println("Deposit " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactionCount ++;
        System.out.println("Withdraw " + amount);
    }

    public String toString(){
        return String.format("Balance: " + balance
                + "\nNumber of transaction: " + transactionCount);
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}
