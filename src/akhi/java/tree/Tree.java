package akhi.java.tree;

import java.util.Arrays;
import java.util.List;

public class Tree {

    private Node root;

    public static void main(String[] args)
    {
        Tree tree = new Tree();
        List<Integer> nums = Arrays.asList(4,3,7,9,6);

        for (Integer num : nums) {
            tree.insert(num);
        }
       // tree.inOrder();
        System.out.println(tree.contains(9)? "Element exist ":"Element does not exists");
        System.out.println(tree.isBst()? "Tree is BST ":"Tree is Not BST");
        System.out.println(tree.countNodes());
        System.out.println(tree.getLevel(7));
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
        System.out.println(r.getData());
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


}
