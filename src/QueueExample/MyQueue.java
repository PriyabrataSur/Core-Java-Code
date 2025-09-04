package QueueExample;

// front ,rare, enqueue, dequeue;

public class MyQueue {
    int maxSize;
    int[] queueArr;
    int rear ;
    int front ;

    public MyQueue(int maxSize){
        this.maxSize = maxSize;
        queueArr = new int[maxSize];
        rear = -1;
        front = -1;
    }

    public void enqueue(int val){
        if(rear >= maxSize-1){
            System.out.println("Queue Overflow");
        }else{
            queueArr[++rear] = val;
        }
    }

    public int dequeue(){
        if(front >= rear){
            System.out.println("Queue Underflow");
            return 0;
        }else{
            return queueArr[++front];
        }
    }
}
