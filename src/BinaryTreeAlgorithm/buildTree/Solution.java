package BinaryTreeAlgorithm.buildTree;

//106. 从中序与后序遍历序列构造二叉树
public class Solution {
    int root_mid = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        root_mid = postorder.length - 1;
        TreeNode root = dfs_buildTree(inorder, postorder, 0, inorder.length - 1);
        return root;
    }

    public TreeNode dfs_buildTree(int[] inorder, int[] postorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int root_index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[root_mid]) {
                root_index = i;
                root_mid--;
                break;
            }
        }
        TreeNode node = new TreeNode(inorder[root_index]);
        node.right = dfs_buildTree(inorder, postorder, root_index + 1, right);
        node.left = dfs_buildTree(inorder, postorder, left, root_index - 1);
        return node;
    }
}
