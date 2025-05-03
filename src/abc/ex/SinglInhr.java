package abc.ex;

class A{
    int x =9 ;
    int y =6;
    void sum(){
        int sum = x+y;
        System.out.println("Sum :" +sum);
    }
}

class B extends A{
    void sub(){
        int sub = x-y;
        System.out.println("Sub :"+sub);
    }
}
public class SinglInhr {
    public static void main(String[] args) {
        B obj = new B();
        obj.sum();
        obj.sub();

    }

}
