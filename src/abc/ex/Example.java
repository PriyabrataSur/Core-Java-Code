package abc.ex;

import name.ex.*;
public class Example extends Subs{

//    public void result(){
//        calSub();
//
//    }

//    public int res(){
//
//        return subs(8,5);
//    }

    public static void main(String[] args) {

        Sum obj = new Sum();
        int res1 = obj.sum(7,25);

//        Example obj1 = new Example();
//        obj1.result();
        //int res2 = obj1.res();

        Example obj3 = new Example();
        int res3 = obj3.subs(83,15);


        System.out.println(res1);
        //System.out.println(res2);
        System.out.println(res3);


    }

}
