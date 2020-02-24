package DynamicProgrammingAlgorithm.nthUglyNumber;

public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        int i2=0;
        int i3=0;
        int i5=0;
        dp[0]=1;
        int min;
        for (int i=1;i<n;i++)
        {
            min=Math.min(dp[i2]*2,Math.min(dp[i3]*3,dp[i5]*5));
            if (min==dp[i2]*2)
            {
                i2++;
            }
            if (min==dp[i3]*3)
            {
                i3++;
            }
            if (min==dp[i5]*5)
            {
                i5++;
            }
            dp[i]=min;
        }
        return dp[n-1];
    }
}
