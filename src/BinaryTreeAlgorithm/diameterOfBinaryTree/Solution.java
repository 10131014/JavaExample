package BinaryTreeAlgorithm.diameterOfBinaryTree;

public class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root);
        return ans;
    }

    protected int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        //以左子树为根节点的子树深度
        int left = depth(node.left);
        //以右子树为根节点的子树深度
        int right = depth(node.right);
        //以该节点为根节点的最大直径值与当前值比较，取最大值；
        ans = Math.max(left + right, ans);
        //返回该节点为根节点的子树最大深度
        return Math.max(left, right) + 1;
    }
}
