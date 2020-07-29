package NormalAlgorithm.maxScore2;

//1422 分割字符串的最大得分
public class Solution {
    public int maxScore(String s) {
        int left = 0;
        int right = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                right++;
            }
        }
        for (int j = 0; j < s.length()-1; j++) {
            if (s.charAt(j) == '0') {
                left++;
            } else if (s.charAt(j) == '1') {
                right--;
            }
            ans = Math.max(ans, left + right);
        }
        return ans;
    }
}
