package NormalAlgorithm.findMin;

public class Solution {
    public int findMin(int[] nums) {
        int minnumber=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            if (minnumber>nums[i])
            {
                minnumber=nums[i];
            }
        }
        return minnumber;
    }
}
