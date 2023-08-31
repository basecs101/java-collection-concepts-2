//Node

//Node is a class or DS that contains data and pointer(s).
/*
head = null;
head -> [10, null]
temp ->[10, null]
head[1000h] -> [10, 2000h] --> [20, 3000h] --> [30, null] --> null
                1000h            2000h           3000h
head[2000h] --> [20, 3000h] --> [30, null] --> null
                2000h            3000h

head[1000h] -> [10, 3000h]  --> [30, null] --> null
                1000h            3000h
 */


public class LinkedListExample {

    Node head;

    LinkedListExample(){
        head = null;
    }
    static class Node {
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    void addNode(Node newNode) throws InterruptedException {

        if (head == null){
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;//move to next node
            }
            temp.next = newNode;
        }
        printNode();
    }

    void deleteNode(int index) throws InterruptedException {
        if (index == 0){
            if (head != null)
                head = head.next;
        } else {
            Node temp = head;
            Node previous = head;
            int count = 0;
            while (count < index){
                previous = temp;
                temp = temp.next;//move to next node
                count++;
            }
            previous.next = temp.next;
        }
        printNode();
    }

    void printNode() throws InterruptedException {

        Node temp = head;
        while (temp !=null){
            System.out.print("[ "+temp.data + " | "+ (temp.next !=null ? temp.next.hashCode(): null) + " ] --> ");
            temp = temp.next;
            Thread.sleep(3000);
        }
        System.out.println("null");
        System.out.println("\n----------------------------");
    }
    public static void main(String[] args)  {


        Node first = new Node(10, null); //[10, null]
        Node second = new Node(20, null); //[20, null]
        Node third = new Node(30, null); //[30, null]
        Node fourth = new Node(40, null); //[40, null]
        Node fifth = new Node(50, null); //[50, null]


        LinkedListExample linkedListExample = new LinkedListExample();


        try {
            linkedListExample.addNode(first);
            linkedListExample.addNode(second);
            linkedListExample.addNode(third);
            linkedListExample.addNode(fourth);
            linkedListExample.addNode(fifth);

            linkedListExample.deleteNode(0);
            linkedListExample.deleteNode(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
