/**
 * Stack is a data structure that is built using array.
 * Stack DS follows Last in First Out - LIFO
 * It performs following operations -
 *  1. Push - this means add an item on top of stack
 *  2. Pop - this means remove an item from top of stack
 *  3. peek - this means return top of stack without removing top element.

 *  Other two stack operations are-
 *  1. IsEmpty - this checks whether stack is empty or not
 *  2. IsFull - this checks whether stack is full or not

 */
public class Stack {

    int capacity;//number of items that can be stored into the stack
    int[] stack;//this array will hold all elements of the stack
    int top;//this variable/pointer points to top element of the stack

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    void push(int item){
        //push item onto top of the stack
        //before pushing an item into the stack check whether stack is full or not
        if (isFull()){
            System.out.println("Stack is full, no more elements "+item+" can be added.");
        } else {
            stack[++top] = item;
            System.out.println("Item "+ item +" pushed onto the stack at position "+top);
            printStack();
        }
    }

    int pop(){
        //remove item from top of the stack
        //before removing an item from stack check if stack is empty or not
        if (isEmpty()){
            System.out.println("Stack is empty, cannot be removed an item from stack");
            return -1;
        } else {
            int topElement = stack[top];
            System.out.println("Item "+ topElement +" popped from the stack at position "+top);
            stack[top] = 0;
            top--;
            printStack();
            return topElement;
        }
    }

    int peek(){
        //returns top element of the stack
        return stack[top];
    }

    //check if stack is empty or not
    //when top points to -1 then stack is empty else stack is not empty
    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == capacity-1;
    }

    void printStack(){
        System.out.println("capacity = "+ capacity);
        System.out.println("stack elements - ");
        for (int i = capacity-1; i>=0; i--) {
            System.out.println("item in stack at index ["+ i+"] item = ["+stack[i]+"]");
        }
        System.out.println("top = "+top);
    }
}
