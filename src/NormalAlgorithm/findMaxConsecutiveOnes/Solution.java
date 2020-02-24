package NormalAlgorithm.findMaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1=0;
        int  ans=0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
            {
                count1=count1+1;
            }
            else
            {
                ans=Math.max(count1,ans);
                if(ans>=(nums.length-ans))
                {
                    break;
                }
                count1=0;
            }
        }
        return Math.max(count1,ans);
    }
}
