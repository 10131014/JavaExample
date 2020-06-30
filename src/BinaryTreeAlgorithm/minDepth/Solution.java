package BinaryTreeAlgorithm.minDepth;

public class Solution {
    public int ans=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        int count=0;
        //树为空，则最小深度为0
        if (root==null)
        {
            return 0;
        }
        //树不为空，进入递归
        dfs_minDepth(root,count);
        return ans;
    }
    private void dfs_minDepth(TreeNode node,int depth)
    {
        //跳出递归的条件
        if (node==null)
        {
            return;
        }
        //到达叶子节点
        if (node.left==null&&node.right==null)
        {
            depth=depth+1;
            ans=Math.min(ans,depth);
        }
        //每递归一次深度加1
        depth=depth+1;
        dfs_minDepth(node.right,depth);
        dfs_minDepth(node.left,depth);
    }
}
