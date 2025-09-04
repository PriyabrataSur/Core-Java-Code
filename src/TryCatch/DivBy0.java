package TryCatch;

import java.util.Scanner;
class Div extends ArithmeticException{
    Div(String mes){
        super(mes);
    }
}

public class DivBy0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            if(b ==0){
                throw new Div("Division bt Zero is not possible");
            }else{
                System.out.println(a/b);
            }
        }catch(Div obj){
            //throw d;
            System.out.println(obj);
        }
    }
}
