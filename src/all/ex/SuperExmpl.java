package all.ex;

class SupE{
    String color = "Red";
    SupE(){
        System.out.println("Super class Default Constructor");
    }
    SupE(int number){
        System.out.println(number*number);
    }
    public void demoMthd(){
        System.out.println("Super class Method");
    }
}

class SubE extends SupE{
    String color ="Gold";
    SubE(){
        super(12);
        //super(9);     Only one explicit constructor call allowed in constructor
        System.out.println(color);
        System.out.println(super.color);
    }
    public void demoMthd(){
        System.out.println("Sub Method");
    }
    public void printMthd(){
        //demoMthd();
        super.demoMthd();
        super.demoMthd(); //  More than one explicit method call allowed in method
    }
}

public class SuperExmpl {
    public static void main(String[] args) {
        SupE obj = new SupE();
        obj.demoMthd();
    }
}
