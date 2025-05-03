package collections.ex;

class Person1{
    int num1 = 5;
    int num2 = 10;
}

class Cons{
    int a = 5;
    int b = 9;

    Cons(){
        System.out.println(a+b);
    }

    Cons(int num1 , int num2){
        System.out.println(num1+num2);
    }

    Cons(int num1){
        System.out.println(a + num1);
    }
}

class over{
    String name = "Priyabrata";
    int age = 20;
    void See(){
        System.out.println(name+" & " + age);
    }

    void See(String name, int age){
        System.out.println(name+" & " + age);
    }
}



public class Me {
    public static void main(String[] args) {
        Person1 obj = new Person1();
        System.out.println(obj.num1);
        System.out.println(obj.num2);

        System.out.println();
    }
}
