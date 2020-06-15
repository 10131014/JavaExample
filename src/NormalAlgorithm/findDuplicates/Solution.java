package NormalAlgorithm.findDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> numbercount=new HashMap<Integer, Integer>();
        List ans=new ArrayList();
        for (int i=0;i<nums.length;i++)
        {
            numbercount.put(nums[i],numbercount.getOrDefault(nums[i],0)+1);
        }
        for (int n=1;n<=nums.length;n++)
        {
            if (numbercount.getOrDefault(n,0)==2)
            {
                ans.add(n);
            }
        }
        return ans;
    }
}
