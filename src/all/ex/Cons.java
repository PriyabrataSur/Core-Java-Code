package all.ex;

class ThisDemo{
    ThisDemo(){
        System.out.println("Hello");
    }

    ThisDemo(int x){
        this();
        System.out.println(x);
    }

    ThisDemo(int x , int y){
        this(8);
        System.out.println(x+y);
    }
}
public class Cons {
    public static void main(String[] args) {
        ThisDemo obj1 = new ThisDemo(10);
        ThisDemo obj2 = new ThisDemo(5,7);
    }
}
