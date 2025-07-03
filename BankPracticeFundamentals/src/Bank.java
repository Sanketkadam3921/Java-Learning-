import java.util.*;
public class Bank {
    private  Map<Long , Account> accounts = new HashMap<>();
    public  void addAccount(Account acc){
        accounts.put(acc.accountNumber,acc);

    }
    public Account getAccount( long accNumber){
        return accounts.get(accNumber);
    }
    public  void transfer(long from , long to , double amount){
        Account sender = accounts.get(from);
        Account receiver = accounts.get(to);

        if ( sender == null || receiver == null){
            System.out.println("Invalid account number(s)." );
            return ;
        }
        sender.withdraw(amount);
        receiver.deposit(amount, "Transfer", "TXN" + System.nanoTime());
    }
    public void showAllAccounts(){
        for ( Account acc : accounts.values()){
            acc.showBalace();
        }
    }
}
