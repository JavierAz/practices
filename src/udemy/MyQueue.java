package udemy;

//FIFO
public class MyQueue {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public MyQueue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        size = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("Head: " + first.value);
    }

    public void getLast() {
        System.out.println("Tail: " + last.value);
    }

    public void getSize() {
        System.out.println("Size: " + size);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node dequeue() {
        if (size == 0) return null;
        Node temp = first;
        if (size == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        size--;
        return temp;
    }
}
