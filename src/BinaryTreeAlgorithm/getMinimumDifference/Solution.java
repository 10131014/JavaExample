package BinaryTreeAlgorithm.getMinimumDifference;

//530. 二叉搜索树的最小绝对差
//同783题
//最简单的方法就是中序遍历出有序数组，然后找出相邻绝对差值最小即可
//可记录前一个节点，与当前节点值的绝对差值，找出最小那个即可
public class Solution {
    int ans = Integer.MAX_VALUE;
    TreeNode pre;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (pre != null) {
            ans = Math.min(ans, Math.abs(pre.val - node.val));
        }
        pre = node;
        dfs(node.right);
    }
}
