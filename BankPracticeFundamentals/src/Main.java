//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Bank bank = new Bank();
     Account s1 = new SavingsAccount("Sanket kadam" , 1001);
     Account c1 = new CurrentAccount("sank" , 1002);

     bank.addAccount(s1);
     bank.addAccount(c1);

     s1.deposit(3000);
     s1.deposit(1000,"CHQ43434");
     s1.withdraw(1000);

     c1.deposit(3000);
     bank.transfer(1001,1002,1000);
     s1.showTransactions();
     c1.showTransactions();

     bank.showAllAccounts();
    }
}