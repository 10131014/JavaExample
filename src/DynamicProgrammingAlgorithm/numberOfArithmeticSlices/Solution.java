package DynamicProgrammingAlgorithm.numberOfArithmeticSlices;

public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp=new int[A.length];
        int sun=0;
        for (int i=2;i<A.length;i++)
        {
            if ((A[i]-A[i-1])==(A[i-1]-A[i-2]))
            {
                dp[i]=dp[i-1]+1;
            }
            sun=sun+dp[i];
        }
        return sun;
    }
}
