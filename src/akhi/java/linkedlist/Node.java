package akhi.java.linkedlist;

/**
 * Created by akhi on 9/6/17.
 */
class Node {

    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public  Node(int data){
        this.data = data;
        this.next = null;

    }
}