package NormalAlgorithm.subarraySum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> summap= new HashMap<>();
        int count=0;
        int presum=0;
        summap.put(0,1);
        for (int i=0;i<nums.length;i++)
        {
            presum=presum+nums[i];
            if (summap.containsKey(presum-k))
            {
                count=count+summap.getOrDefault(presum-k,0);
            }
            summap.put(presum,summap.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
