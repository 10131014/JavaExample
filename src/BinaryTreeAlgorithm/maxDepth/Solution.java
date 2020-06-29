package BinaryTreeAlgorithm.maxDepth;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        //根节点为空，说明树为空，则肯定是平衡二叉树
        if (root==null)
        {
            return true;
        }
        //如果左右子树的高度差小于2并且左右子树都是平衡二叉树，则该树才是平衡二叉树
        return (Math.abs(heigh(root.left)-heigh(root.right))<2)&&isBalanced(root.left)&&isBalanced(root.right);
    }
    //求树的高度
    private int heigh(TreeNode node)
    {
        //树为空则高度为0
        if (node==null)
        {
            return 0;
        }
        //每递归一次说明往下深了一层，所以需要返回左子树右子树中的最大值还要加1
        return Math.max(heigh(node.left),heigh(node.right))+1;
    }
}
