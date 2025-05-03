class Fex{

    final int age = 23;
    final String name ;
    static final String sname;

    Fex(){
        name = "Priyabrata";

    }

    static {
        sname = "Sur";
    }

    Fex(final int n){

        name = "Deb";
        //n= n+1;// 	 another value cannot be assigned because of final variable
        System.out.println(n*n);
    }

    void agePrint(){
        //age = 10;//		another value cannot be assigned because of final variable
        System.out.println(name +"  "+sname+" "+age);
    }
    final void show(){
        System.out.println("hi from fex");
    }
}

//class Fx extends Fex{
//    /*void show(){
//        System.out.println("hellow from fx");
//    }*/
//    void printF(){
//        show();
//    }
//}

public class FinalEx{
    public static void main(String[] args){
        Fex f1=new Fex();
        f1.agePrint();

//        Fx obj1= new Fx();
//        obj1.printF();

        Fex obj1= new Fex();
        obj1.show();

        Fex f2 = new Fex(9);
    }
}

