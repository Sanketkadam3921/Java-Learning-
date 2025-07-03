import  java.util.ArrayList;
public abstract class Account {
    protected String accountHolder;
    protected long accountNumber;
    protected double balance;
    protected ArrayList<Transaction> transactionHistory;

    public Account(String name, long accNumber) {
        this.accountHolder = name;
        this.accountNumber = accNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();

    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Cash Deposit", amount));
    }

    public void deposit(double amount, String chequeNo) {
        balance += amount;
        transactionHistory.add(new Transaction("Cheque Deposit - " + chequeNo, amount));
    }

    public void deposit(double amount, String method, String referenceId) {
        balance += amount;
        transactionHistory.add(new Transaction("Online via " + method + " - Ref: " + referenceId, amount));
    }

    public abstract void withdraw(double amount);

    public void showBalace() {
        System.out.println("Account: " + accountNumber + " | Holder: " + accountHolder + " | Balance: ₹" + balance);

    }

    public void showTransactions() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
}