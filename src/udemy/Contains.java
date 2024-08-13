package udemy;

public class Contains {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    Node root;
    private boolean rContains(Node current, int value){
        if (current == null) return false;
        if(current.value == value) return true;
        if (value < current.value){
            return rContains(current.left, value);
        } else{
            return rContains(current.right, value);
        }
    }

    public boolean contains(int value){
        return rContains(root, value);
    }



}
