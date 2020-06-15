package NormalAlgorithm.productExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=1;
        for (int i=1;i<nums.length;i++)
        {
            ans[i]=ans[i-1]*nums[i-1];
        }
        int r=1;
        for (int i=nums.length-1;i>0;i--)
        {
            r=r*nums[i];
            ans[i-1]=ans[i-1]*r;

        }
        return ans;
    }
}
