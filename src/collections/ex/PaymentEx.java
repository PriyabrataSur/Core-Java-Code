package collections.ex;

abstract class Payment{
    abstract void processPayment();                 // abstract method has nobody
    final double amount;
    public Payment(double amount){
        this.amount = amount;
    }
    public void displayAmount(){
        System.out.println("Amount: "+amount);
    }
}

class CreditCardsPayment extends Payment{
    int cardNumber;
    public CreditCardsPayment(int cardNumber,double amount){
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment() {
        System.out.println("Card Number: "+cardNumber);
        super.displayAmount();
    }
}

class PayPalPayment extends Payment{
    String email;
    public PayPalPayment(String email,double amount){
        super(amount);
        this.email = email;
    }
    @Override
    public void processPayment() {
        System.out.println("E-mail: "+email);
        super.displayAmount();
    }
}

public class PaymentEx {
    public static void main(String[] args) {
        Payment obj1 = new CreditCardsPayment(1269875, 500000);
        Payment obj2 = new PayPalPayment("ram456@gmail.com", 1000000);
        System.out.println("For CreditCard payment : ");
        obj1.processPayment();
        System.out.println("For PayPal payment : ");
        obj2.processPayment();
    }
}
