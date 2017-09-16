package akhi.java.tree;

import java.util.*;

public class Tree {

    private Node root;

    public static void main(String[] args)
    {
        Tree tree = new Tree();
        List<Integer> nums = Arrays.asList(20,8,22,5,3,25,10,14);

        for (Integer num : nums) {
            tree.insert(num);
        }
       // tree.inOrder();
//        System.out.println(tree.contains(9)? "Element exist ":"Element does not exists");
//        System.out.println(tree.isBst()? "Tree is BST ":"Tree is Not BST");
//       // System.out.println(tree.countNodes());
//        //System.out.println(tree.getBstLevel(7));
//        tree.inOrder();
//       // tree.deleteNode(6);
//        System.out.println();
//       // System.out.println("After Deletion");
//        tree.levelOrder();

        tree.bottomView();

    }


    public boolean isEmplty()
    {
        return (root==null);
    }

    public void insert(int data)
    {
        root = insert(root, data);
    }

    private Node insert(Node node , int data)
    {
        if(node == null)
        {
           return new Node(data);
        }

        if(data < node.getData())
        {
            node.setLeft(insert(node.getLeft(),data));
        }
        else
            node.setRight(insert(node.getRight(),data));
        return node;
    }

    public boolean contains(int data)
    {
        return contains(root, data);
    }

    private boolean contains(Node r , int data)
    {
        if(data == r.getData())
            return true;
        if(data < r.getData() && r.getLeft() != null)
        {
            return contains(r.getLeft() ,data);
        }
        else if (data > r.getData() && r.getRight() != null)
        {
           return contains(r.getRight(),data);
        }

        return false;

    }

    public void inOrder()
    {
        inOrder(root);
    }

    private void inOrder(Node r)
    {
        if(r.getLeft()!= null)
            inOrder(r.getLeft());
        System.out.print(r.getData());
        if(r.getRight()!=null)
            inOrder(r.getRight());
    }

    public void postOrder()
    {
        postOrder(root);
    }

    private void postOrder(Node r)
    {
        if(r.getLeft()!= null)
            inOrder(r.getLeft());
        if(r.getRight()!=null)
            inOrder(r.getRight());
        System.out.println(r.getData());
    }

    public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(Node r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }


    public boolean isBst()
    {
        return isBst(root, Integer.MIN_VALUE ,Integer.MAX_VALUE);
    }

    private boolean isBst(Node r , int min , int max)
    {
        if(r==null)
            return true;
        if(r.getData() <= min || r.getData() >=max)
            return false;
       return (isBst(r.getLeft(),min,r.getData()) &&
        isBst(r.getRight(),r.getData(),max));
    }
// Normal Binary tree
   public int getLevel(int a)
   {
       return getLevel(root,a,1);
   }

   private int getLevel(Node r ,int a ,int curlevel)
   {
       if(r == null)
           return 0;
       if(r.getData() == a)
           return curlevel;
       int level=getLevel(r.getLeft(),a,curlevel+1);
       if(level!=0)
           return level;
       else
           return getLevel(r.getRight(),a,curlevel+1);

   }
// For Binary Search Tree

    public int getBstLevel(int a)
    {
        return getLevel(root,a,1);
    }

    private int getBstLevel(Node r ,int a ,int curlevel) {
        if (r == null)
            return 0;
        if (r.getData() == a)
            return curlevel;
        if (a < r.getData() && r.getLeft() != null) {
            return getLevel(r.getLeft(), a, curlevel + 1);
        } else if ((a > r.getData() && r.getRight() != null))
            return getLevel(r.getRight(), a, curlevel + 1);
        else
            return 0;
    }
// Delete Node in Binary Search Tree


    public int getMinValue(Node node)
    {
        if(node==null)
            return Integer.MIN_VALUE;

        while(node.getLeft()!= null)
        {
            node.setLeft(node.getLeft());
        }
        return node.getData();
    }

    public void deleteNode(int value)
    {
        root = deleteNode(root , value);
        return ;
    }

    public Node deleteNode(Node node , int data)
    {
        if(node == null)
            return null;
        if(data < node.getData())
        {
            node.setLeft(deleteNode(node.getLeft(),data));
        }
        else if(data > node.getData())
        {
            node.setRight(deleteNode(node.getRight(),data));
        }

        else
        {
            if(node.getLeft() == null)
                node = node.getRight();
            else if(node.getRight() == null)
                node = node.getLeft();
            else
            {
                int min_value = getMinValue(node.getRight());
                node.setData(min_value);
                node.setRight(deleteNode(node.getRight() ,min_value));
            }

        }

        return  node;
    }


    void levelOrder()
    {
        levelOrder(root);
    }

    void levelOrder(Node node)
    {
        if(node == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        if(node!=null);
        queue.add(node);
        while(!queue.isEmpty())
        {
           node = queue.remove();
            System.out.println(node.getData());
            if(node.getLeft()!=null)
                queue.add(node.getLeft());
            if(node.getRight()!=null)
                    queue.add(node.getRight());
        }
    }


    /**
     * Bottom View of given Tree
      */

    void bottomView()
    {
        bottomView(root);
    }

    void bottomView(Node node)
    {
        if(root == null)
            return;


        int hd =  0;
        HashMap<Integer,Integer> m = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        node.setHead(hd);
        q.add(node);



        while(!q.isEmpty())
        {

            Node temp = q.remove();
            hd = temp.getHead();
            m.put(hd,temp.getData());
            if(temp.getLeft()!= null)
            {
                temp.getLeft().setHead(hd - 1);
                q.add(temp.getLeft());
            }

            if(temp.getRight()!= null)
            {
                temp.getRight().setHead(hd + 1);
                q.add(temp.getRight());
            }

        }


        // Printing Hashmap

        for(Integer value : m.values())
            System.out.println(value);
    }

}
