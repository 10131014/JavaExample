package DynamicProgrammingAlgorithm.rob2;

public class Solution {
    public int rob2(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        int[] dp1=new int[nums.length];
        int[] dp2=new int[nums.length];
        dp1[0]=0;
        dp1[1]=nums[0];
        for (int i=1;i<nums.length-1;i++)
        {
            dp1[i+1]=Math.max(dp1[i],dp1[i-1]+nums[i]);
        }
        dp2[0]=0;
        dp2[1]=nums[1];
        for (int i=2;i<nums.length;i++)
        {
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        int index=nums.length-1;
        return Math.max(dp1[index],dp2[index]);
    }
}
