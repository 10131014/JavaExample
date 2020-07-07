package BinaryTreeAlgorithm.sumOfLeftLeaves;

public class Solution {
    public int ans=0;
    public int sumOfLeftLeaves(TreeNode root) {
        //树为空则返回0
        if (root==null)
        {
            return 0;
        }
        //判断是否为左叶子，如果是则累加起来
        if (root.left!=null&&root.left.left==null&&root.left.right==null)
        {
            ans=ans+root.left.val;
        }
        //遍历左子树和右子树
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        //返回累加的值
        return ans;
    }
}
