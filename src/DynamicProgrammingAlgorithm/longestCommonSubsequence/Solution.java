package DynamicProgrammingAlgorithm.longestCommonSubsequence;

//1143. 最长公共子序列
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text2.length(); i++) {
            if (text1.charAt(0) == text2.charAt(i)) {
                for (int j = i; j < text2.length(); j++) {
                    dp[0][j] = 1;
                }
                break;
            }
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == text2.charAt(0)) {
                for (int j = i; j < text1.length(); j++) {
                    dp[j][0] = 1;
                }
                break;
            }
        }
        for (int i = 1; i < text1.length(); i++) {
            for (int j = 1; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i][j] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[text1.length() - 1][text2.length() - 1];
    }
}
