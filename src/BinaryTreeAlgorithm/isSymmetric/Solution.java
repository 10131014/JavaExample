package BinaryTreeAlgorithm.isSymmetric;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null)
        {
            return true;
        }
        return cmp(root.left,root.right);
    }
    public boolean cmp(TreeNode node1,TreeNode node2)
    {
        if(node1==null&&node2==null)
        {
            return true;
        }
        if (node1==null&&node2!=null)
        {
            return false;
        }
        if (node1!=null&&node2==null)
        {
            return false;
        }
        if (node1.val!=node2.val)
        {
            return false;
        }
        return cmp(node1.left,node2.right)&&cmp(node1.right,node2.left);
    }
}
