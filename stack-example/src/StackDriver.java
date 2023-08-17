public class StackDriver {
    public static void main(String[] args) {
        Stack newStack = new Stack(3);
        newStack.pop();
        newStack.push(10);
        newStack.push(20);
        newStack.pop();
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);
    }
}
