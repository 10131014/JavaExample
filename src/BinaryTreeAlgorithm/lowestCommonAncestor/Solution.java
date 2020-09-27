package BinaryTreeAlgorithm.lowestCommonAncestor;
//235. 二叉搜索树的最近公共祖先
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs_solve(root, p, q);
    }

    public TreeNode dfs_solve(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }
        //p,q都小于当前节点值，说明p,q都在当前节点的左子树中
        if (p.val < node.val && q.val < node.val) {
            //进入左子树
            return dfs_solve(node.left, p, q);
            //p,q都大于当前节点值，说明p,q都在当前节点的右子树中
        } else if (p.val > node.val && q.val > node.val) {
            //进入右子树
            return dfs_solve(node.right, p, q);
        } else {
            //p,q分布在当前节点俩侧，则说明当前节点是最近的公共祖先
            return node;
        }
    }
}
