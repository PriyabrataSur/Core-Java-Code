package collections.ex;

class MathOperations1{
    int add(int num1, int num2){
        return (num1 + num2);
    }
    double add(double num1, double num2, double num3){
        return (num1 + num2 + num3);
    }
    int add(String s1, String s2){
        return(Integer.parseInt(s1) + Integer.parseInt(s2));
    }
}

public class Sum {
    public static void main(String[] args) {
        MathOperations1 math = new MathOperations1();
        System.out.println(math.add(5,9));
        double res = math.add(5.9,2.7, 6.8);
        System.out.println(String.format("%.2f",res));
        System.out.println(math.add("23", "52"));

    }
}
