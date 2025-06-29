public class BankOverloading {
  private  String accountHolder ;
  private  long accountNumber;
  private double balance;

  public BankOverloading(String name , long accNo){
      this.accountHolder = name ;
      this.accountNumber = accNo;
      this.balance = 0.0;
  }
  public void  deposit(double amount){
      balance += amount ;
      System.out.println("Cash deposited" + amount);
      showBalance();
  }

  public  void deposit(double amount , String CheckNumber){
      balance += amount ;
      System.out.println("cheque deposited" + amount + "cheque no : " + CheckNumber);
      showBalance();
  }
  public void showBalance(){
      System.out.println("current balance" + balance);
  }

    public static void main(String[] args) {
        BankOverloading account = new BankOverloading("Sanket kadam"  , 3242342343L);
        account.deposit(49595);
        account.deposit(6666);
        account.deposit(78787,"43h43jh4j3h4");
    }
}
