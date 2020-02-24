package NormalAlgorithm.containsNearbyDuplicate;

import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet nums2=new HashSet();

        if(nums.length==2)
        {
            if(nums[0]==nums[1])
            {
                return true;
            }
        }
        for (int i=0;i<k;i++)
        {
            if (nums2.contains(nums[i]))
            {
                return true;
            }
            nums2.add(nums[i]);
        }
        for (int i=k;i<nums.length;i++)
        {
            nums2.remove(nums[i-k]);
            if (nums2.contains(nums[i]))
            {
                return true;
            }
            nums2.add(nums[i]);
        }
        return false;
    }
}
