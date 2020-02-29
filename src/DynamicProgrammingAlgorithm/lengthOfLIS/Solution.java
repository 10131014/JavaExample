package DynamicProgrammingAlgorithm.lengthOfLIS;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=1;
        }
        int ans=0;
        for (int i=1;i<nums.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        for (int k=0;k<dp.length;k++)
        {
            ans=Math.max(ans,dp[k]);
        }
        return ans;
    }
}
