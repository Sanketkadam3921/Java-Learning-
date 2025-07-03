public class SavingsAccount extends Account {

    public SavingsAccount(String name, long accNumber) {
        super(name, accNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance for savings account.");
        } else {
            balance -= amount;
            transactionHistory.add(new Transaction("Savings Withdrawal", -amount));
            System.out.println("✅ Withdrawal successful.");
        }
    }
}
