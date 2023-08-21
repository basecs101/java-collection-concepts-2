public class Queue {
    int capacity;
    int front;//points to first element and use to remove elements from front.
    int rear;//points to last element and use to insert element to the end of the queue.
    int[] queue;//array that will be used to store elements.

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[capacity];
    }
    /*
    enqueue
    dequeue
    isFull
    isEmpty
    peek
     */

    /*
    Add/insert an item to the end of the queue
     */
    void enqueue(int item){
        if (isFull()){
            System.out.println("Queue is full, cannot add new element at the end of Queue");
        } else {
            if (front == -1){
                front=0;//make front equals to 0 when it is first element
            }
            queue[++rear] = item;
            System.out.println("Element "+ item + " is added to the end of the queue at index "+rear);
            printQueue();
        }
    }


    /*
    Remove an item from the front of the queue.
     */

    int dequeue(){
        int removedItem=0;
        if (isEmpty()){
            System.out.println("Queue is already empty, hence cannot remove an item from the queue");
        } else {
            removedItem = queue[front];
            queue[front] = 0;
            if (front == (capacity-1)) {
                front = -1;
                rear = -1;
            }else {
                front++;
            }
            System.out.println("Element "+removedItem + " is removed..");
        }
        return removedItem;
    }

    boolean isFull(){
        return rear == (capacity - 1);
    }

    boolean isEmpty(){
        return front == -1;
    }

    int peek(){
        return queue[rear];
    }

    void printQueue() {
        System.out.println("---------" +
                "Queue content is : " +
                "-----------");
        for (int j : queue) {
            System.out.print(j + "\t");
        }
        System.out.println("\n---------------------------------------");
    }

}
