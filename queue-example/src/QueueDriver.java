
public class QueueDriver {
    public static void main(String[] args) {

        Queue queue = new Queue(3);

        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
}
