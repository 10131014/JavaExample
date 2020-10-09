package BinaryTreeAlgorithm.insertIntoBST;

//701. 二叉搜索树中的插入操作
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val > root.val) {
            root.right=insertIntoBST(root.right, val);
        } else {
            root.left=insertIntoBST(root.left, val);
        }
        return root;
    }
}
