import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueueJavaExample {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(10);
        System.out.println(integerQueue);
        integerQueue.add(20);
        System.out.println(integerQueue);
        integerQueue.add(30);
        System.out.println(integerQueue);
        integerQueue.remove();
        System.out.println(integerQueue);
        integerQueue.remove();
        System.out.println(integerQueue);

    }
}
