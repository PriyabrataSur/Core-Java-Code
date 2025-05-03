package wrapperex;

public class Auto {
    public static void main(String[] args) {
        int a = 10; // primitive
        Integer a1 = 10; // object wrapper

        // AutoBoxing  -> Primitive to object
        int num = 14;
        Integer num1 = Integer.valueOf(num); // Autoboxing
        System.out.println(num1);

        Integer n = 12;
        int n1 = n.intValue(); // Unboxing 
        System.out.println(n1);
        System.out.println(a);
    }
}
