public class CircularQueueDriver {
    public static void main(String[] args) throws InterruptedException {

        CircularQueue queue = new CircularQueue(3);

        queue.deQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.deQueue();
        queue.enQueue(30);
        queue.deQueue();
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        queue.deQueue();
        queue.deQueue();
        queue.enQueue(10);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

    }
}
