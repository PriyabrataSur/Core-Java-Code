package StackEx;

public class MyStack {

    int maxSize;
    int[] stackArr;
    int top ;

    public MyStack(int maxSize){
        this.maxSize = maxSize;
        stackArr = new int[maxSize];
        top = -1;
    }

    public void push(int val){
        if(top >= maxSize){
            System.out.println("Stack Overflow");
        }else{
            stackArr[++top] = val;
        }
    }

    public int pop(){
        if(isEmpty()){
            return 0;
        }else{
            return stackArr[top--];
        }
    }

    public int peek(){
        if(isEmpty()){
            return 0;
        }else{
            return stackArr[top];
        }
    }

    public boolean isEmpty(){
//        if(top<0){
//            return true;
//        }
        return top<0 ;
    }
}
