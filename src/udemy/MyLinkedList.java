package udemy;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: "+head.data);
    }

    public void getTail(){
        System.out.println("Tail: "+tail.data);
    }

    public void getSize(){
        System.out.println("Size: "+size);
    }

    public void append(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node removeLast(){
        if (size == 0) return null;

        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        size--;

        if (size == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public Node removeFirst(){
        if (size == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;

        if (size == 0) {
            tail = null;
        }

        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= size) return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null) {
            temp.data = value;
            return true;
        }
        return false;
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
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= size) return null;

        if (index == 0) {
            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        Node temp = get(index - 1);
        Node removed = temp.next;
        temp.next = removed.next;
        removed.next = null;
        size--;
        return removed;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;

        for (int i = 0; i < size; i++) {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    //merge two sorted linked lists
    public static MyLinkedList merge(MyLinkedList list1, MyLinkedList list2){
        MyLinkedList mergedList = new MyLinkedList();
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                mergedList.append(temp1.data);
                temp1 = temp1.next;
            } else {
                mergedList.append(temp2.data);
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            mergedList.append(temp1.data);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            mergedList.append(temp2.data);
            temp2 = temp2.next;
        }
        return mergedList;
    }
}
