package NormalAlgorithm.longestConsecutive;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> number=new HashSet<>();
        for (int i=0;i<nums.length;i++)
        {
            number.add(nums[i]);
        }
        int longest=0;
        int maxlong=0;
        for (int num:number)
        {
            maxlong=0;
            if(!number.contains(num-1))
            {
                while (number.contains(num))
                {
                    maxlong++;
                    num++;
                }
            }
            longest=Math.max(longest,maxlong);
        }
        return longest;
    }
}
