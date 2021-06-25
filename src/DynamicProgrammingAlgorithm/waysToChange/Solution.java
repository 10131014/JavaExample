package DynamicProgrammingAlgorithm.waysToChange;

public class Solution {
    public int waysToChange(int n) {
        int[] coins=new int[]{1,5,10,25};
        //dp[i]表示凑成i快钱的组合数
        long[] dp=new long[n+1];
        //金额数为0只有一种组合，都不选
        dp[0]=1;
        //先遍历硬币数
        for (int i=0;i<4;i++){
            //再遍历金额数
            for (int j=coins[i];j<n+1;j++){
                //
                dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;
            }
        }
        return (int) dp[n];
    }
}
