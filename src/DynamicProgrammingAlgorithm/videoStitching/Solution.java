package DynamicProgrammingAlgorithm.videoStitching;

import java.util.Arrays;

//1024. 视频拼接
//动态规划
public class Solution {
    public int videoStitching(int[][] clips, int T) {
        int[] dp = new int[T + 1];
        Arrays.fill(dp, 200);
        dp[0] = 0;
        for (int i = 1; i <= T; i++) {
            for (int j = 0; j < clips.length; j++) {
                if (i > clips[j][0] && i <= clips[j][1]) {
                    dp[i] = Math.min(dp[i], dp[clips[j][0]] + 1);
                }
            }
        }
        if (dp[T] == 200) {
            return -1;
        } else {
            return dp[T];
        }
    }
}
