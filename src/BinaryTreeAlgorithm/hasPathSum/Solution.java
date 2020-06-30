package BinaryTreeAlgorithm.hasPathSum;

public class Solution {
    public boolean ans=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        //根节点为空则没有路径，返回false
        if (root==null)
        {
            return false;
        }
        //进入递归
        checkpathsum(root,sum);
        return ans;
    }
    private void checkpathsum(TreeNode node,int num)
    {
        //递归终止条件，当前节点为空，则说明到了叶子节点的子树了（其实叶子节点就没有子树了）
        if (node==null)
        {
            return;
        }
        //第一个if就是判断是不是到达叶子节点了
        if (node.left==null&&node.right==null)
        {
            //到达叶子节点了，如果有路径和为sum的路径则返回true，但要注意没有不能返回false
            if (node.val==num)
            {
                ans=true;
            }
        }
        //递归左子树，sum要减去当前节点的值
        checkpathsum(node.left,num-node.val);
        //递归右子树，sum要减去当前节点的值
        checkpathsum(node.right,num-node.val);
    }
}
