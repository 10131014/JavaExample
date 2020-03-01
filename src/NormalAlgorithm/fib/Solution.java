package NormalAlgorithm.fib;

public class Solution {
    public int fib(int N) {
        if (N<=1)
        {
            return N;
        }
        int[] fibnum=new int[N+1];
        fibnum[0]=0;
        fibnum[1]=1;
        for (int i=2;i<=N;i++)
        {
            fibnum[i]=fibnum[i-1]+fibnum[i-2];
        }
        return fibnum[N];
    }
}
