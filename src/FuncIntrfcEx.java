@FunctionalInterface
interface Calculation {
    void Add(int a, int b);
    static void sub(){
        System.out.println("Sub");
    }
    default void mul(){
        System.out.println("Multiplication");
    }
}
class Exmpl implements Calculation{
    @Override
    public void Add(int a, int b) {
        System.out.println("Sum : "+(a+b));
    }
    
}



public class FuncIntrfcEx {
    public static void main(String[] args) {
        Exmpl obj = new Exmpl();
        obj.Add(5,7);
    }
}
