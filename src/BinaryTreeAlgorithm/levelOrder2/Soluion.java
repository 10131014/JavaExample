package BinaryTreeAlgorithm.levelOrder2;
//102. 二叉树的层序遍历
//DFS
//这是该题的DFS解法

import java.util.ArrayList;
import java.util.List;

public class Soluion {
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        dfs_fun(root, ans, 0);
        return ans;
    }

    public void dfs_fun(TreeNode node, List<List<Integer>> ans, int level) {
        if (ans.size() - 1 < level) {
            ans.add(new ArrayList<Integer>());
        }
        ans.get(level).add(node.val);
        if (node.left != null) {
            dfs_fun(node.left, ans, level + 1);
        }
        if (node.right != null) {
            dfs_fun(node.right, ans, level + 1);
        }
    }
}
