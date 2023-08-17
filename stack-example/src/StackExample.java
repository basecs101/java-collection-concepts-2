import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        System.out.println("is empty " + stack.empty());
        System.out.println("peak "+stack.peek());
        System.out.println("Stack elements - ");
        stack.forEach(System.out::println);
        System.out.println("***************");
        stack.push(20);
        System.out.println("is empty " + stack.empty());
        System.out.println("peak "+stack.peek());
        System.out.println("Stack elements - ");
        stack.forEach(System.out::println);
        System.out.println("***************");
        stack.pop();
        System.out.println("is empty " + stack.empty());
        System.out.println("peak "+stack.peek());
        System.out.println("Stack elements - ");
        stack.forEach(System.out::println);
        System.out.println("***************");
        stack.push(30);
        System.out.println("is empty " + stack.empty());
        System.out.println("peak "+stack.peek());
        System.out.println("Stack elements - ");
        stack.forEach(System.out::println);
        System.out.println("***************");
        stack.push(40);
        System.out.println("is empty " + stack.empty());
        System.out.println("peak "+stack.peek());
        System.out.println("Stack elements - ");
        stack.forEach(System.out::println);
        System.out.println("***************");
    }
}
