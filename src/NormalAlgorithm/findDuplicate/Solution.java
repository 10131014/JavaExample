package NormalAlgorithm.findDuplicate;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> num1=new HashSet<Integer>();
        for (int i=0;i<nums.length;i++)
        {
            if (num1.contains(nums[i]))
            {
                return nums[i];
            }
            else
            {
                num1.add(nums[i]);
            }
        }
        return 0;
    }
}
