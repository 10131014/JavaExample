package BinaryTreeAlgorithm.isSymmetric;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        //如果树为空，则肯定是对称的，返回true
        if (root==null)
        {
            return true;
        }
        //比较根节点的左子树和右子树是否相同
        return cmp(root.left,root.right);
    }
    public boolean cmp(TreeNode node1,TreeNode node2)
    {
        //俩节点为空则肯定相同，返回true
        if(node1==null&&node2==null)
        {
            return true;
        }
        //一个节点为空另外一个不为空则不是对称的，返回false
        if (node1==null&&node2!=null)
        {
            return false;
        }
        //同上
        if (node1!=null&&node2==null)
        {
            return false;
        }
        //值不等也不是对称的
        if (node1.val!=node2.val)
        {
            return false;
        }
        //都不为空值也相等，但是不能返回true，需要进入下一层
        //下一层比较时要比较左子树的左节点和右子树的右节点，左子树的右节点和右子树的左节点
        return cmp(node1.left,node2.right)&&cmp(node1.right,node2.left);
    }
}
