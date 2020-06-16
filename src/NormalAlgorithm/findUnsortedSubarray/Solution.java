package NormalAlgorithm.findUnsortedSubarray;

import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] nums1=new int[nums.length];
        nums1=nums.clone();
        Arrays.sort(nums);
        int L=0;
        int R=-1;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]!=nums1[i])
            {
                L=i;
                break;
            }
        }
        for (int j=nums.length-1;j>=0;j--)
        {
            if (nums[j]!=nums1[j])
            {
                R=j;
                break;
            }
        }
        return R-L+1;
    }
}
