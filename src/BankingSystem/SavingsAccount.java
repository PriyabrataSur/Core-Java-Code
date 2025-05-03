package BankingSystem;

public class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount(String accountNumber,String holderName, double balance, double interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double ammount) {
        System.out.println("Withdraw Ammount: "+ammount);
        if(balance<= ammount){
            System.out.println("Insufficient Balance");
        }else{
            balance = balance - ammount;
        }
    }
}

