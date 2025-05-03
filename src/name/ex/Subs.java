package name.ex;

public class Subs {

    int num1 , num2, subs;
    protected int subs(int num1, int num2){
        /*int num1 = 44;
        int num2 = 25;
        int subs = num1 - num2;
        System.out.println("Substraction :" +subs);*/
        this . num1 = num1;
        this . num2 = num2;
        return subs = num1 - num2;
    }

    protected void calSub(){
        System.out.println("Subctraction");
    }
}
