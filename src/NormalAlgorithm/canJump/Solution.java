package NormalAlgorithm.canJump;

import java.util.Arrays;

//55. 跳跃游戏
//贪心算法
public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length==0||(nums.length >=2 && nums[0] == 0)) {
            return false;
        }
        int l = nums.length;
        int canarr = l - 2;
        int p;
        while (canarr >= 0) {
            if (nums[canarr] == 0) {
                p = canarr - 1;
                while (p >= 0 && nums[p] <= (canarr - p)) {
                    if (p == 0) {
                        return false;
                    }
                    p--;
                }
                canarr = p;
            } else {
                canarr--;
            }
        }
        return true;
    }
}
