package BankingSystem;

class CurrentAccount extends Account{
    double overdraftLimit;

    public CurrentAccount(String accountNumber,String holderName, double balance, double overdraftLimit){
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
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
