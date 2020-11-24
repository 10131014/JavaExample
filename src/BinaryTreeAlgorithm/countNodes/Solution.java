package BinaryTreeAlgorithm.countNodes;

//222. 完全二叉树的节点个数
public class Solution {
    int ans = 0;

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs_solve(root);
        return ans;
    }

    public void dfs_solve(TreeNode node) {
        if (node == null) {
            return;
        }
        ans++;
        dfs_solve(node.left);
        dfs_solve(node.right);
    }
}
