package NormalAlgorithm.search;

public class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while (left<=right)
        {
            if (target==nums[mid])
            {
                return mid;
            }
            else if (nums[mid]<=nums[right])
            {
                if (target<=nums[right]&&target>nums[mid])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
            else
            {
                if (target>=nums[left]&&target<nums[mid])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            mid=(left+right)/2;
        }
        return -1;
    }
}
