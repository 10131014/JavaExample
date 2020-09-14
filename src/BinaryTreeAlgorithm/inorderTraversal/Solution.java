package BinaryTreeAlgorithm.inorderTraversal;
//94. 二叉树的中序遍历
//深度优先算法

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List res = new ArrayList();
        if (root == null) {
            return res;
        }
        dfs(root, res);
        return res;
    }

    public void dfs(TreeNode node, List res) {
        if (node == null) {
            return;
        }
        dfs(node.left, res);
        res.add(node.val);
        dfs(node.right, res);
    }
}
