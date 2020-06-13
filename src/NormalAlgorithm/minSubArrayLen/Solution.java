package NormalAlgorithm.minSubArrayLen;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0)
        {
            return 0;
        }
        if (nums.length==1)
        {
            if (nums[0]>s)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int left=0;
        int right=0;
        int sum=0;
        int shortest=Integer.MAX_VALUE;
        int minshort=0;
        int n=nums.length;
        while (right<n)
        {
            sum=sum+nums[right];
            if (s>sum)
            {
                right++;
            }
            else
            {
                minshort=right-left+1;
                sum=sum-nums[left]-nums[right];
                left++;
                shortest=Math.min(minshort,shortest);
            }
            if(left>right)
            {
                return 1;
            }
        }
        shortest=Math.min(minshort,shortest);
        return shortest;
    }
}
