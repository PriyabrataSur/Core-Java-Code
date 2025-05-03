package abc.ex;

interface dad{
    default void car(){
        System.out.println("My father has a car");
    }
}

interface mom{
    default void house(){
        System.out.println("My mother has a house");
    }
}

class me implements mom , dad{

}

public class IntrfcExmpl {
    public static void main(String[] args) {
        me obj = new me();
        obj.house();
        obj.car();

    }

}
