package collections.ex;


class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance ;
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount){
        balance = amount + balance;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
    public void displayInfo(){
        System.out.println("Account_Holder Name: "+accountHolderName);
        System.out.println("Account_Number: "+accountNumber);
        System.out.println("Recent Balance: "+balance);
    }
}

public class BankEx {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12653265","Rajdeep Roy",72000.00);
        acc.deposit(50560.93);
        acc.withdraw(26010.22);
//        double totalBalance = acc.getBalance();
//        System.out.println(totalBalance);
        acc.displayInfo();                      // ** only needed 2 numbers after decimal **
    }
}