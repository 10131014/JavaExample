package BinaryTreeAlgorithm.convertBST;

//538. 把二叉搜索树转换为累加树
public class Solution {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs_converBST(root);
        return root;
    }
    public void dfs_converBST(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs_converBST(node.right);
        sum = sum + node.val;
        node.val = sum;
        dfs_converBST(node.left);
    }
}
