package udemy;

public class MyDoubleLinkedList {
    static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyDoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getSize() {
        System.out.println("Size: " + size);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public Node removeLast(){
        if (size == 0) return null;

        Node temp = tail;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        size--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public Node removeFirst(){
        if (size == 0) return null;

        Node temp = head;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        size--;
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= size) return null;
        Node temp = head;
        if (index < size/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = size-1; i > index; i--) {
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp == null) return false;
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > size) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == size) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        size++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= size) return null;
        if (index == 0) return removeFirst();
        if (index == size-1) return removeLast();

        Node temp = get(index);
        Node before = temp.prev;
        Node after = temp.next;

        before.next = after;
        after.prev = before;
        temp.next = null;
        temp.prev = null;
        size--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        Node next = null;
        Node prev = null;
        while (temp != null) {
            next = temp.next;
            prev = temp.prev;
            temp.next = prev;
            temp.prev = next;
            temp = next;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    public boolean isPalindrome(){
        Node temp = head;
        int[] arr = new int[size];
        int i = 0;
        while (temp != null) {
            arr[i] = temp.value;
            temp = temp.next;
            i++;
        }
        for (int j = 0; j < size/2; j++) {
            if (arr[j] != arr[size-1-j]) return false;
        }
        return true;
    }

}
