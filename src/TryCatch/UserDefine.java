package TryCatch;

import java.util.Scanner;
class VoteOrNot extends RuntimeException{
    VoteOrNot(){
        super("Not Allowed");
    }
    VoteOrNot(String message){
        super(message);
    }
}

public class UserDefine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        //VoteOrNot v = new VoteOrNot("Not Allow for this age group");
        VoteOrNot v = new VoteOrNot();
        try {
            if(age<18){
                //System.out.println("Not Allow");
                throw v;
            }else {
                System.out.println("Allow");
            }
        } catch (VoteOrNot e) {
            System.out.println(e);

        }
    }
}
