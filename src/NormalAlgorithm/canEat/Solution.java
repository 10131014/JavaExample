package NormalAlgorithm.canEat;

public class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int lc=candiesCount.length;
        int lq=queries.length;
        long[] sum=new long[lc];
        boolean[] ans=new boolean[lq];
        sum[0]=candiesCount[0];
        for (int i=1;i<lc;i++){
            sum[i]=sum[i-1]+candiesCount[i];
        }
        for (int i=0;i<lq;i++){
            long eat_min=queries[i][1]+1;
            long eat_max=queries[i][2]*(long)(queries[i][1]+1);
            long candy_start=queries[i][0]==0?1: sum[queries[i][0]-1]+1;
            long candy_end=sum[queries[i][0]];
            ans[i]=!(eat_min>candy_end||eat_max<candy_start);
        }
        return ans;
    }
}
