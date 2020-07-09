package NormalAlgorithm.twoSum1;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> numsmap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (numsmap.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = numsmap.get(target - nums[i]);
                break;
            }
            numsmap.put(nums[i], i);
        }
        return ans;
    }
}
