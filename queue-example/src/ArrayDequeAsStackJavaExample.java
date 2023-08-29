import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Resizable-array implementation of the Deque interface.
 * Array deques have no capacity restrictions;
 * they grow as necessary to support usage.
 * They are not thread-safe;
 * in the absence of external synchronization,
 * they do not support concurrent access by multiple threads.
 * Null elements are prohibited.
 * This class is likely to be faster than Stack when used as a stack,
 * and faster than LinkedList when used as a queue.
 */
public class ArrayDequeAsStackJavaExample {
    public static void main(String[] args) throws InterruptedException {
        //Stack
        Deque<Integer> integerArrayDeque = new ArrayDeque<>();

        integerArrayDeque.push(10);
        print(integerArrayDeque);
        integerArrayDeque.push(20);
        print(integerArrayDeque);
        integerArrayDeque.push(30);
        print(integerArrayDeque);
        integerArrayDeque.push(40);
        print(integerArrayDeque);

        integerArrayDeque.pop();
        print(integerArrayDeque);
        integerArrayDeque.pop();
        print(integerArrayDeque);

        integerArrayDeque.push(50);
        print(integerArrayDeque);
        integerArrayDeque.push(60);
        print(integerArrayDeque);
    }
    static void print(Deque<Integer> integerQueue) throws InterruptedException {
        System.out.println(integerQueue);
        Thread.sleep(2000);
    }
}
