package NormalAlgorithm.findDisappearedNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> number=new HashSet<Integer>();
        List ans=new ArrayList();
        for (int i=0;i<nums.length;i++)
        {
            number.add(nums[i]);
        }
        for (int n=1;n<=nums.length;n++)
        {
            if (!number.contains(n))
            {
                ans.add(n);
            }
        }
        return ans;
    }
}
