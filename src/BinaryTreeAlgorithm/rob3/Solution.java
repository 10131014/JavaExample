package BinaryTreeAlgorithm.rob3;

//337. 打家劫舍III
//该题涉及到动态规划和深度优先搜索（DFS）
public class Solution {
    public int rob(TreeNode root) {
        int[] ans = dfs(root);
        return Math.max(ans[0], ans[1]);
    }
    //定义数组[robroot,norobroot]，第一个元素表示偷根节点可以偷得钱数，第二个元素表示不偷根节点可以偷得钱数
    public int[] dfs(TreeNode node1) {
        if (node1 == null) {
            return new int[]{0, 0};
        }
        //递归：左子树作为根节点输入，偷与不偷根节点可以偷得钱数
        int[] l = dfs(node1.left);
        //递归：右子树作为根节点输入，偷与不偷根节点可以偷得钱数
        int[] r = dfs(node1.right);
        //偷根节点，不偷其左右子树可以偷得钱数
        int robroot = l[1] + r[1] + node1.val;
        //不偷根节点，偷其左右子树可以偷得钱数，这里是核心，偷左子树的钱数应该为以左子树作为根节点，偷与不偷根节点的最大值
        int norobroot = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        //返回偷不偷根节点可以偷到的钱数
        return new int[]{robroot, norobroot};
    }
}
