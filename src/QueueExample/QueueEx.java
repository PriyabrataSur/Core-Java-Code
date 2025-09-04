package QueueExample;

public class QueueEx {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(13);
        queue.enqueue(18);
        queue.enqueue(23);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
//        System.out.println(queue.rear);
//        System.out.println(queue.front);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
