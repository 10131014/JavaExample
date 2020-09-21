package SlidingWindowAlgorithm.maxSlidingWindow;

//剑指Offer 59-I. 滑动窗口的最大值
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return nums;
        }
        int[] dp = new int[nums.length - k + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        int temp = nums[0];
        dp[0] = nums[0];
        for (int i = 0; i < k; i++) {
            dp[0] = Math.max(dp[0], nums[i]);
        }
        for (int i = 1; i < nums.length - k + 1; i++) {
            if (temp != dp[i - 1]) {
                dp[i] = Math.max(dp[i - 1], nums[i + k - 1]);
            } else {
                for (int j = i; j < i + k; j++) {
                    dp[i] = Math.max(dp[i], nums[j]);
                }
            }
            temp = nums[i];
        }
        return dp;
    }
}
