package NormalAlgorithm.findRepeatNumber;

import java.util.HashSet;
import java.util.Set;

//剑指Offer 03. 数组中重复的数字
public class Solution {
    public int findRepeatNumber(int[] nums) {
        Set numset=new HashSet();
        for (int i=0;i<nums.length;i++)
        {
            if (numset.contains(nums[i]))
            {
                return nums[i];
            }
            else
            {
                numset.add(nums[i]);
            }
        }
        return 0;
    }
}
