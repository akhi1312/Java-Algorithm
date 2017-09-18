package Leetcode;

public class MergeTwoSortedList {

    Node head ;

    public static void main(String[] args)
    {
        MergeTwoSortedList l1 = new MergeTwoSortedList();
        MergeTwoSortedList l2 = new MergeTwoSortedList();
        for(int i=10 ; i >=1 ;i--)
        {
            if(i%2 ==0)
                l1.insertNode(i);
            else
                l2.insertNode(i);
        }

        MergeTwoSortedList obj = new MergeTwoSortedList();
        Node temp =  obj.mergerTwoNode(l1.head , l2.head);
        obj.printNode(temp);
        //obj.printNode(l2.head);
        //obj.printNode(temp);

    }



    private void printNode(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.getData());
            temp = temp.getNext();
        }
    }


    public Node mergerTwoNode(Node l1 , Node l2 )
    {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.getData() < l2.getData())
        {
            l1.setNext(mergerTwoNode(l1.getNext() ,l2 ));
            return l1;
        }

        else
        {
            l2.setNext(mergerTwoNode(l1,l2.getNext()));
            return l2;
        }

    }

    public void insertNode(int data)
    {
        Node node = new Node(data);
        node.setNext(head);
        head = node ;
    }


    public class Node {

        private Node next;
        private Node right;
        private int data ;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }


        public Node( int data) {
            this.next = null;
            this.data = data;
        }
    }





}
