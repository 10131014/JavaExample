package BinaryTreeAlgorithm.postorderTraversal;
//145. 二叉树的后序遍历
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List ans = new ArrayList();
        dfspostorder(root, ans);
        return ans;
    }

    public void dfspostorder(TreeNode node, List ans) {
        if (node == null) {
            return;
        }
        dfspostorder(node.left, ans);
        dfspostorder(node.right, ans);
        ans.add(node.val);
    }
}
