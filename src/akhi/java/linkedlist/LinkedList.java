package akhi.java.linkedlist;

    public class LinkedList {
        Node head;


        public void addToFront(int data){
            Node n = new Node(data);
            n.setNext(head);
            head = n;
        }

        public void printList(){
            Node temp = head ;
            while(temp!= null){
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
        }

        public void mergeList(LinkedList list){

            if(list == null || list.head == null){
                return;
            }
            if(head == null){
                head = list.head;
                return;
            }

            Node temp1 = head;
            Node temp2 = list.head;
            if(temp1.getData() < temp2.getData()){
                head = temp1;
                temp1 = temp1.getNext();
            }
            else
            {
                head = temp2;
                temp2 = temp2.getNext();
            }

            Node mergerList = head ;

            while(temp1 != null & temp2 != null){
                if(temp1.getData() < temp2.getData()){
                    mergerList.setNext(temp1);
                    temp1 = temp1.getNext();
                }
                else
                {
                    mergerList.setNext(temp2);
                    temp2 = temp2.getNext();
                }
                mergerList = mergerList.getNext();
            }

            if(temp1 != null){
                mergerList.setNext(temp1);
            }
            if(temp2 != null)
            {
              mergerList.setNext(temp2);
            }
        }



        public static void main(String[] args) {
            LinkedList list1 = new LinkedList();
            list1.addToFront(9);
            list1.addToFront(8);
            list1.addToFront(6);
            list1.addToFront(5);
            list1.addToFront(4);
            list1.addToFront(2);

            LinkedList list2 = new LinkedList();
            list2.addToFront(7);
            list2.addToFront(3);
            list2.addToFront(1);

            list1.mergeList(list2);
            System.out.println("Merged List:");
            list1.printList();
        }
     }
