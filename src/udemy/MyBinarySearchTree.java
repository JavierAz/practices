package udemy;

public class MyBinarySearchTree {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;

        Node temp = root;
        while (temp != null) {
            if (value == temp.value) return true;
            if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    public static void main(String[] args){
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();

        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(5);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(7);
        myBinarySearchTree.insert(17);
        myBinarySearchTree.insert(20);

        System.out.println(myBinarySearchTree.root.left.right.value);
        System.out.println(myBinarySearchTree.contains(20));
    }
}
