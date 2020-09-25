package BinaryTreeAlgorithm.buildTree2;
//105. 从前序与中序遍历序列构造二叉树

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int root_mid = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length < 1) {
            return null;
        }
        root_mid = preorder.length - 1;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < preorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = dfs_buildTree2(inorder, preorder, map, 0, inorder.length - 1);
        return root;
    }

    public TreeNode dfs_buildTree2(int[] inorder, int[] preorder, Map<Integer, Integer> map, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid_index = map.get(preorder[root_mid]);
        root_mid--;
        TreeNode node = new TreeNode(inorder[mid_index]);
        node.left = dfs_buildTree2(inorder, preorder, map, left, mid_index - 1);
        node.right = dfs_buildTree2(inorder, preorder, map, mid_index + 1, right);
        return node;

    }
}
