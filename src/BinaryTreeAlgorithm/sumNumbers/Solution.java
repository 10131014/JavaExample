package BinaryTreeAlgorithm.sumNumbers;

//129. 求根到叶子节点数字之和
public class Solution {
    int ans = 0;

    public int sumNumbers(TreeNode root) {
        dfs129(0, root);
        return ans;
    }

    public void dfs129(int k, TreeNode node) {
        if (node == null) {
            return;
        }
        //主要是这步，保存该条路径的数字组成的数值
        int sum = k * 10 + node.val;
        //到达了叶子节点，将数值添加进答案中
        if (node.left == null && node.right == null) {
            ans = ans + sum;
        }
        dfs129(sum, node.left);
        dfs129(sum, node.right);
    }
}
