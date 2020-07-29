package NormalAlgorithm.maxScore;

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + cardPoints[i];
        }
        ans = Math.max(ans, sum);
        for (int j = cardPoints.length - 1; j >= cardPoints.length - k; j--) {
            sum = sum + cardPoints[j]-cardPoints[(-cardPoints.length+j+k)];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
