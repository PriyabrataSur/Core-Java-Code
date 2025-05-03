package abc.ex;

class F{
    int x = 5 ;
    int y = 13;
    int z = 50;
    void sum(){
        int sum = x+y+z;
        System.out.println("Sum :" +sum);
    }
}

class G extends F{
    void sub(){
        int sub = z-y;
        System.out.println("Sub :"+sub);
    }
}

class H extends F{
    void div(){
        int div = z/x;
        System.out.println("Div :"+div);
    }
}

public class HierInhr {
    public static void main(String[] args) {
        H obj2 = new H();
        obj2.div();
        obj2.sum();
        G obj3 = new G();
        obj3.sub();
        obj3.sum();

    }


}
