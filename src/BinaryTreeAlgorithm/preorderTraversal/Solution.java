package BinaryTreeAlgorithm.preorderTraversal;
//144. 二叉树的前序遍历

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List ans = new ArrayList();
        if (root == null) {
            return ans;
        }
        dfspreorder(root, ans);
        return ans;
    }

    public void dfspreorder(TreeNode node, List ans) {
        if (node == null) {
            return;
        }
        ans.add(node.val);
        dfspreorder(node.left, ans);
        dfspreorder(node.right, ans);
    }
}
