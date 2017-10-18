package Leetcode;

public class IsSubtree {



    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {

            if(t== null || s==null)
                return false;

            if(s.val ==t.val)
            {
                return isMatch(s ,t);
            }
            isSubtree(s ,t.left);
            isSubtree(s,t.right);
            return false;
        }


        public boolean isMatch(TreeNode a , TreeNode b )
        {

            if(a.val != b.val)
                return false;
            isMatch(a.left ,b.left);
            isMatch(a.right ,b.right);

            return true ;
        }


    }


}


