package DynamicProgrammingAlgorithm.minDistance;

public class Solution {
    public int minDistance(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        if (l1==0||l2==0){
            return Math.max(l1,l2);
        }
        int[][] dp=new int[l1][l2];
        if (w1[0]!=w2[0]){
            dp[0][0]=1;
        }
        int flag=0;
        for (int i=1;i<l1;i++){
            if (w1[i]==w2[0]&&flag==0){
                dp[i][0]=dp[i-1][0];
                flag=1;
            }else {
                dp[i][0]=dp[i-1][0]+1;
            }
        }
        flag=0;
        for (int j=1;j<l2;j++){
            if (w1[0]==w2[j]&&flag==0){
                dp[0][j]=dp[0][j-1];
                flag=1;
            }else {
                dp[0][j]=dp[0][j-1]+1;
            }
        }
        for (int i=1;i<l1;i++){
            for (int j=1;j<l2;j++){
                if (w1[i]==w2[j]){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                }
            }
        }
        return dp[l1-1][l2-1];
    }
}
