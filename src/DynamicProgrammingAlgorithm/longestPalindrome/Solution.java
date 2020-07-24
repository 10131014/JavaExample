package DynamicProgrammingAlgorithm.longestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        int begin = 0;
        int maxlong = 1;
        for (int k = 0; k < s.length(); k++) {
            dp[k][k] = true;
        }
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (dp[i + 1][j - 1] || (j - i) < 3) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j] && (j - i + 1) > maxlong) {
                    begin = i;
                    maxlong = j - i + 1;

                }
            }
        }
        return s.substring(begin, begin + maxlong);
    }
}
