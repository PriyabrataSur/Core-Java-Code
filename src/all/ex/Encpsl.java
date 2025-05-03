package all.ex;

class Sum{
    private int num1, num2;
    public void getValue(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    public int setValue(){
        int sum = num1 + num2;
        return sum;
    }
}

public class Encpsl{
    public static void main(String[] args){
        Sum s1 = new Sum();
        s1.getValue(50,42);
        int res = s1.setValue();
        System.out.println(res);
    }
}
