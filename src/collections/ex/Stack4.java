package collections.ex;

import java.util.Collections;
import java.util.Stack;

public class Stack4 {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(34);
        num.push(3);
        num.push(31);
        num.push(98);
        num.push(92);
        num.push(23);
        System.out.println(num);

//        Collections.sort(num);
//        System.out.println(num);

        Stack<Integer> sortstk = new Stack<>();
        int size = num.size();
        for(int i = 1 ; i<=size ; i++ ){
            if(num.get(i-1) <= num.get(i))
            {
                sortstk.push(num.get(i));
            }
        }
    }
}
