package StackEx;

public class StackEx {
    public static void main(String[] args) {
        MyStack stack = new MyStack(8);
        stack.push(5);
        stack.push(8);
        stack.push(12);
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
