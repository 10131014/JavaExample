package DynamicProgrammingAlgorithm.maxProduct;

public class Solution {
    public int maxProduct(int[] nums) {
        int imax=1;
        int imin=1;
        int max=Integer.MIN_VALUE;
        int exchange;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]<0)
            {
                exchange=imax;
                imax=imin;
                imin=exchange;
            }
            imax=Math.max(imax*nums[i],nums[i]);
            imin=Math.min(imin*nums[i],nums[i]);
            max=Math.max(imax,max);
        }
        return max;
    }
}
