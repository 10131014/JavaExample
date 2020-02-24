package NormalAlgorithm.maximumGap;

import java.util.Arrays;

public class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length<=1)
        {
            return 0;
        }
        Arrays.sort(nums);
        int ans;
        int a;
        ans=nums[1]-nums[0];
        for (int i=0;i<nums.length-1;i++)
        {
            a=nums[i+1]-nums[i];
            if (ans<=a)
            {
                ans=a;
            }
        }
        return ans;

    }
}
