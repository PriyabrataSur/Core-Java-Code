package BankingSystem;

public class BankManagementSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("AB123", "Priyabrata", 1000, 4.5);
        CurrentAccount ca = new CurrentAccount("XY456", "Debadyuti", 5000, 5.6);

        System.out.println("For SavingsAccount: ");
        sa.displayDetails();
        sa.withdraw(200);
        sa.displayDetails();
        sa.withdraw(800);
        sa.displayDetails();

        System.out.println("For CurrentAccount: ");
        ca.displayDetails();
        ca.withdraw(500);
        ca.displayDetails();
        ca.withdraw(3270);
        ca.displayDetails();
    }
}

