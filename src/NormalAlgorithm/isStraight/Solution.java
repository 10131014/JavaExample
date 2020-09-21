package NormalAlgorithm.isStraight;

import java.util.Arrays;

//剑指Offer61. 扑克牌中的顺子
public class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = 0;
        int need_joker = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            } else {
                need_joker = need_joker + nums[i + 1] - nums[i] - 1;
            }
        }
        if (need_joker <= joker) {
            return true;
        } else {
            return false;
        }
    }
}
