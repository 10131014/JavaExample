package DynamicProgrammingAlgorithm.nthSuperUglyNumber;


public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ans=new int[n];
        int[] p=new int[primes.length];
        ans[0]=1;
        for (int j=1;j<n;j++)
        {
            int min=Integer.MAX_VALUE;
            for (int i=0;i<p.length;i++)
            {

                if(min>ans[p[i]]*primes[i])
                {
                    min=ans[p[i]]*primes[i];
                }
            }
            for (int i=0;i<p.length;i++)
            {
                if (min==(ans[p[i]]*primes[i]))
                {
                    p[i]++;
                }
            }
            ans[j]=min;
        }
        return ans[n-1];
    }
}
