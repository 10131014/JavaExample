package DynamicProgrammingAlgorithm.canPartition;

//416. 分割等和子集
//动态规划
public class Solution {
    public boolean canPartition(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        int l = nums.length;
        boolean[][] dp = new boolean[l][sum + 1];
        for (int i = 0; i < l; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < sum + 1; i++) {
            if (nums[0] == i) {
                dp[0][i] = true;
            }
        }
        for (int i = 1; i < l; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (j >= nums[i]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[l - 1][sum];
    }
}
