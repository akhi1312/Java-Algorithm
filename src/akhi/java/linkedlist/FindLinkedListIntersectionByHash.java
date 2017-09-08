package akhi.java.linkedlist;


import java.util.HashSet;
/**
 * <b>IDeserve <br>
 * <a href="https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve</a>
 * <br><br>
 * Linked List Intersection</b><br>
 * Two linked lists list1 and list2 are joined a particular node, called the point of intersection of the linked lists.
 * Find the point of intersection, i.e. the first node after which both lists have same nodes.
 *
 * Example: <br>
 * List1: 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - X
 * <br>
 * List2: 11 - 12 - 13 - 14 - 15 - 5 - 6 - 7 - 8 - 9 - 10 - X
 * <br>
 * <br>
 * Output: 5
 * <br><br>
 * <a href="https://www.youtube.com/watch?v=l936ym8yDSo">Linked List Intersection Youtube Link</a>
 * @author Saurabh
 *
 */
public class FindLinkedListIntersectionByHash {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Solution 1:
    // Time Complexity: O(n*m)
    // Space Complexity: O(1)
    public static Node getIntersectionOfLists(Node aList, Node bList) {

        Node a = aList;
        while (a != null) {
            Node b = bList;
            while (b != null) {

                if (a == b) {
                    return a;
                }
                b = b.getNext();
            }
            a = a.getNext();
        }

        return null;
    }

    // Solution 2:
    // Time Complexity: O(n+m)
    // Space Complexity: O(n)
    public static Node getIntersectionOfListsUsingHash(Node aList, Node bList) {

        if (aList == null || bList == null) {
            return null;
        }

        HashSet<Node> set = new HashSet<Node>();

        Node a = aList;
        while (a != null) {
            set.add(a);
            a = a.getNext();
        }

        Node b = bList;
        while (b != null) {
            if (set.contains(b)) {
                return b;
            }
            b = b.getNext();
        }
        return null;
    }

    /* ************************************************
     * Find Intersersction with O(n) and O(1)
     * ************************************************
     */

    public static  Node getIntersection(Node alist , Node blist){
        int alength =0 ;
        int blength = 0 ;
        if(alist == null || blist == null){
            return null;
        }
        Node ahead = alist;
        Node bhead = blist;
        while(ahead != null)
        {
            alength++;
            ahead = ahead.getNext();
        }

        while(bhead != null)
        {
            blength++;
            bhead = bhead.getNext();
        }

        if(alength < blength)
        {
          int  temp = blength - alength;
          while(temp> 0)
          {
              blist = blist.getNext();
              temp--;
          }

        }
        else
        {
            int  temp = alength - blength;
            while(temp> 0)
            {
                alist = alist.getNext();
                temp--;
            }

        }

        while(alist != null && blist != null)
        {
            if(alist == blist)
            {
                return alist;
            }
            alist = alist.getNext();
            blist = blist.getNext();
        }

        return null ;

    }


    /* ************************************************
     * Test linked list intersection
     * ************************************************
     */
    public void addToList(int num) {

        if (head == null) {
            head = new Node(num);
            return;
        }

        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node(num));
    }

    public static void main(String[] args) {
        FindLinkedListIntersectionByHash list1 = new FindLinkedListIntersectionByHash();
        int i = 1;
        int n = 5;
        while (i <= n) {
            list1.addToList(i);
            i++;
        }

        FindLinkedListIntersectionByHash list2 = new FindLinkedListIntersectionByHash();
        i = 11;
        n = 15;
        while (i <= n) {
            list2.addToList(i);
            i++;
        }

        Node tmp1 = list1.getHead();
        i = 1;
        n = 5;
        while (i < n) {
            tmp1 = tmp1.getNext();
            i++;
        }

        Node tmp2 = list2.getHead();
        while (tmp2.getNext() != null) {
            tmp2 = tmp2.getNext();
        }
        tmp2.setNext(tmp1);

        Node intersection = getIntersection(list1.getHead(), list2.getHead());
        if (intersection != null) {
            System.out.println("Intersection of linked lists found at Node " + intersection.getData());
        } else {
            System.out.println("Linked lists do not intersect!");
        }
    }

}