package DynamicProgrammingAlgorithm.mincostTickets;

import java.util.Arrays;

//983. 最低票价
//动态规划
public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int l_days=days.length;
        int l_costs=costs.length;
        int[] dp=new int[l_days+1];
        int[] time=new int[]{1,7,30};
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i=1;i<l_days+1;i++){
            for (int j=0;j<l_costs;j++){
                int k;
                for (k=i;k>0;k--){
                    //在这里要找一个离当前最远的可行的天数买票
                    //例如当前票是7天的，当前是第8天，那么优先在第1天买票（如没有第1天，则往后延）
                    if (days[k-1]<=days[i-1]-time[j])
                        break;
                }
                //取最小值
                dp[i]=Math.min(dp[i],dp[k]+costs[j]);
            }
        }
        return dp[l_days];
    }
}
