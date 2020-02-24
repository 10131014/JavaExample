package NormalAlgorithm.containsDuplicate;


import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet nums1=new HashSet<>();
        for (int i=0;i<nums.length;i++)
        {
            if (nums1.contains(nums[i]))
            {
                return true;
            }
            else
            {
                nums1.add(nums[i]);
            }
        }
        return false;
    }
}
