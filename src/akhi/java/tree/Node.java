package akhi.java.tree;

public class Node{

    private Node left;
    private Node right;
    private int data;
    private int head ;

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {

        return left;
    }

    public Node(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }




}