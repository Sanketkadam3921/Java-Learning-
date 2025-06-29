public class Account {
    private String number ;
    private double balance ;
    private String customerName ;
    private String customerEmail ;
    private String customerPhone ;


    public  void  depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " name. New Balance is " + balance);

    }
public  void withdrawfunds(double withdrawamount){
        if ( balance - withdrawamount < 0){
            System.out.println("Insufficient balance");
        }else {
            balance -= withdrawamount;
            System.out.println("Money withdrawed" + withdrawamount + " Reamining balance is " + balance);

        }
}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
