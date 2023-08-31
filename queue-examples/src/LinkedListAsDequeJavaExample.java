import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDequeJavaExample {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> integerQueue = new LinkedList<>();

        integerQueue.addFirst(10);
        print(integerQueue);
        integerQueue.addFirst(20);
        print(integerQueue);
        integerQueue.addFirst(30);
        print(integerQueue);

        integerQueue.addLast(40);
        print(integerQueue);
        integerQueue.addLast(50);
        print(integerQueue);

        integerQueue.removeFirst();
        print(integerQueue);
        integerQueue.removeFirst();
        print(integerQueue);


        integerQueue.removeLast();
        print(integerQueue);
        integerQueue.removeLast();
        print(integerQueue);

    }
    static void print(Deque<Integer> integerQueue) throws InterruptedException {
        System.out.println(integerQueue);
        Thread.sleep(2000);
    }
}
