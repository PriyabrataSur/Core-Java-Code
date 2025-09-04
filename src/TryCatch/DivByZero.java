package TryCatch;
import java.util.Scanner;

public class DivByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a/b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
