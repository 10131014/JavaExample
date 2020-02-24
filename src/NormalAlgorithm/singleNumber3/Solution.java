package NormalAlgorithm.singleNumber3;


public class Solution {
    public int[] singleNumber(int[] nums) {
        int ans1=0;
        int ans2=0;
        int a=0;
        for (int i=0;i<nums.length;i++)
        {
            a=a^nums[i];
        }
        int b=a&(-a);
        for (int j=0;j<nums.length;j++)
        {
            if ((b&nums[j])==b)
            {
                ans1=ans1^nums[j];
            }
            else
            {
                ans2=ans2^nums[j];
            }
        }
        int[] ans=new int[2];
        ans[0]=ans1;
        ans[1]=ans2;
        return ans;
    }
}
