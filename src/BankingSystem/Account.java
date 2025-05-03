package BankingSystem;

class Account{
    String accountNumber;
    String holderName;
    double balance;

    public Account(String accountNumber,String holderName, double balance){
        this.accountNumber= accountNumber;
        this.holderName = holderName;
        this.balance=balance;
    }

    public void deposit(double ammount){
        balance = balance + ammount;
    }
    public void withdraw(double ammount){
        balance = balance - ammount ;
    }
    public void displayDetails(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Holder Name:" +holderName);
        System.out.println("Account Balance:" +balance);
        System.out.println();
    }
}
