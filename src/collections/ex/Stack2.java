package collections.ex;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);
        num.push(50);
        System.out.println(num);
        System.out.println(num.pop());
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(num.isEmpty());
        System.out.println(num);
    }
}
