package BinaryTreeAlgorithm.invertTree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        //递归函数的终止条件，节点为空时则返回
        if (root==null)
        {
            return null;
        }
        //下面三句是将当前节点的左右子树交换
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        //递归交换当前节点的左子树
        invertTree(root.left);
        //递归交换当前节点的右子树
        invertTree(root.right);
        //函数返回时表示当前节点以及他的左右子树都交换完成了
        return root;
    }
}
