public class CurrentAccount extends Account {
    private double overdraftLimit = 10000;

    public CurrentAccount(String name, long accNumber) {
        super(name, accNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("❌ Withdrawal exceeds overdraft limit.");
        } else {
            balance -= amount;
            transactionHistory.add(new Transaction("Current Withdrawal", -amount));
            System.out.println("✅ Withdrawal successful.");
        }
    }
}
