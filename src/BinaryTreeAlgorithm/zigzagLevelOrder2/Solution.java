package BinaryTreeAlgorithm.zigzagLevelOrder2;
//103. 二叉树的锯齿形层次遍历
//DFS解法
import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root, res, 0);
        return res;
    }

    private void traversal(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<Integer>());
        }
        if ((level & 1) == 1) {
            //如果level是奇数，其实实际上层数是偶数，那么应该已经是从右往左了
            res.get(level).add(0, root.val);
        } else {
            res.get(level).add(root.val);
        }
        traversal(root.left, res, level + 1);
        traversal(root.right, res, level + 1);
    }
}
