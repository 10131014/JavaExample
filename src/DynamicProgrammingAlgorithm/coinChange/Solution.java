package DynamicProgrammingAlgorithm.coinChange;

import java.util.Arrays;

//322. 零钱兑换
//动态规划
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int l = coins.length;
        //排序方便剪枝
        Arrays.sort(coins);
        //遍历所有的金钱数
        for (int i = 1; i < amount + 1; i++) {
            dp[i] = amount + 1;
            for (int j = 0; j < l; j++) {
                //若当前的硬币价值大于当前的金额数，则没必要往后遍历
                if (i < coins[j]) {
                    break;
                } else {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
