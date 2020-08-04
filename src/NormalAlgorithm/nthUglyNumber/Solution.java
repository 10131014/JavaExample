package NormalAlgorithm.nthUglyNumber;

//剑指offer 49.丑数
public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        dp[0] = 1;
        int min;
        for (int i = 1; i < n; i++) {
            min = Math.min(dp[p2] * 2, Math.min(dp[p3] * 3, dp[p5] * 5));
            if (min == dp[p2] * 2) {
                p2++;
            }
            if (min == dp[p3] * 3) {
                p3++;
            }
            if (min == dp[p5] * 5) {
                p5++;
            }
            dp[i] = min;
        }
        return dp[n - 1];
    }
}
