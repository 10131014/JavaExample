package BinaryTreeAlgorithm.isBalanced;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root==null)
        {
            return true;
        }
        return (Math.abs(heigh(root.left)-heigh(root.right))<2)&&isBalanced(root.left)&&isBalanced(root.right);
    }
    private int heigh(TreeNode node)
    {
        if (node==null)
        {
            return 0;
        }
        return Math.max(heigh(node.left),heigh(node.right))+1;
    }
}
