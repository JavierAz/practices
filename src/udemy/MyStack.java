package udemy;

//LIFO
public class MyStack {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node top;
    private int size;

    public MyStack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        size = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getSize() {
        System.out.println("Size: " + size);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public Node pop(){
        if (size == 0) return null;
        Node temp = top;
        top = top.next;
        size--;
        return temp;
    }
}
