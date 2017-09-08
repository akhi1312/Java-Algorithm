package akhi.java.linkedlist;

/**
 * Created by akhi on 9/4/17.
 */
public class ReverseLinkedList {

    private Node head ;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


    // Reverse LinkedList Recursively

    public void reverseLinkedListRecursive(){
        reverseLinkedListRecursive(head);

    }

    public void reverseLinkedListRecursive(Node curr){

        if(curr==null){
            return;
        }

        if(curr.getNext() == null){
            this.head = curr;
            return;
        }

        reverseLinkedListRecursive(curr.getNext());
        curr.getNext().setNext(curr);
        curr.setNext(null);


    }




    /*
    * ******************************************************
    * Following methods are for testing reverseList
    * ******************************************************
    */

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();
        list.createTestList(10);
        list.printlist();
        list.reverseList();
        //list.reverseLinkedListRecursive();
        list.printlist();
    }




    // Reverse List Method

    public void reverseList() {

        Node prev = null;
        Node curr = null;
        Node next = head ;

        while(next!= null){

            curr = next ;
            next = next.getNext();
            curr.setNext(prev);
            prev = curr;
        }

        head = curr;
    }


    //Create a test list having n nodes from 1 to n

    public void createTestList(int n) {

        if(n < 1)
            return;

        int i = 1;
        Node temp = null;
        while(i <= n) {
            Node node = new Node(i);
            if(head == null) {
                head = node;
                temp = head;
            } else {
                temp.setNext(node);
                temp = node;
            }
            i++;
        }
    }


   // Print the list

    public void printlist() {

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("X");
    }

}
