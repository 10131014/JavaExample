package BinaryTreeAlgorithm.maxDepth;

public class Solution {
    public int maxDepth(TreeNode root) {
        //如果根节点为空说明深度为0
        if (root==null)
        {
            return 0;
        }
        //初始化左子树的深度
        int max_left_high=0;
        //初始化右子树的深度
        int max_right_high=0;
        //得到左子树的最大深度
        max_left_high=Math.max(max_left_high,maxDepth(root.left));
        //得到右子树的最大深度
        max_right_high=Math.max(max_right_high,maxDepth(root.right));
        //每递归一次说明往下深了一层，所以需要返回左子树右子树中的最大值还要加1
        return Math.max(max_left_high,max_right_high)+1;
    }
}
