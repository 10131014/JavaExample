package BinaryTreeAlgorithm.sortedArrayToBST;

import java.util.Arrays;

//108. 将有序数组转换为二叉搜索树
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=helper(nums,0,nums.length-1);
        return root;
    }
    public TreeNode helper(int[] nums,int left,int right)
    {
        if (left>right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid-1);
        node.right = helper(nums,mid+1,right);
        return node;
    }
}
