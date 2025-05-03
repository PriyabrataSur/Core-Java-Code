package abc.ex;

class C{
    int x = 25 ;
    int y = 13;
    int z = 50;
    void sum(){
        int sum = x+y+z;
        System.out.println("Sum :" +sum);
    }
}

class D extends C{
    int w =3;
    void sub(){
        int sub = x-y;
        System.out.println("Sub :"+sub);
    }
}

class E extends D{
    void mul(){
        int mul = x*y*w;
        System.out.println("Mul :"+mul);
    }
}

public class MultilvlInhr {
    public static void main(String[] args) {
        E obj1 = new E();
        obj1.sum();
        obj1.sub();
        obj1.mul();
    }
}
