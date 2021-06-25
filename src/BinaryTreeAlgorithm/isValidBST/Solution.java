package BinaryTreeAlgorithm.isValidBST;
//98. 验证二叉树
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean dfs(TreeNode node,long min,long max){
        if (node==null){
            return true;
        }
        //只要碰到有不符合直接返回false
        //如果根节点小于等于左子节点或者根节点大于等于右子节点，则是false
        if (node.val<=min||node.val>=max){
            return false;
        }
        return dfs(node.left,min,node.val)&&dfs(node.right,node.val,max);
    }
}
