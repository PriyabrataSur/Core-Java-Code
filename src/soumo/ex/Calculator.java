package soumo.ex;

//import name.ex.Mul;
import name.ex.*;

public class Calculator {
    public static void main(String[] args) {
        name.ex.Sum obj1 = new name.ex.Sum();
        int res1 = obj1.sum(8,9);

        //Subs obj2 = new Subs();
        //int res2 = obj2.subs(14,6);

        Mul obj3 = new Mul();
        int res3 = obj3.mul(8,6);

        Div obj4 = new Div();
        int res4 = obj4.div(8,2);

        System.out.println("Summation : " +res1 + "  Multiplication : " +res3+ "  Division : " +res4);

    }
}
