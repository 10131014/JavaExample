package DynamicProgrammingAlgorithm.maxProfit3;
//714. 买卖股票的最佳时机含手续费
//动态规划
public class Solution {
    public int maxProfit(int[] prices, int fee) {
        //交易无法完成返回0
        if(prices.length<2){
            return 0;
        }
        //have表示手里持有一张可以使得利润最大的股票后的最大收益，初始化have=-prices[0]；
        int have=-prices[0];
        //no_have表示手里不持有一张可以使得利润最大的股票后的最大收益，初始化为0；
        int no_have=0;
        for(int i=1;i<prices.length;i++){
            //当前的have有两种情况得来：1、之前的have状态；2、之前的no_have买了一张股票后。取最大的那个
            have=Math.max(have,no_have-prices[i]);
            //当前的no_have也有两种情况得来：1、之前的no_have；2、之前的have卖了当前的股票后获取的收益并减去手续费。取最大值
            no_have=Math.max(no_have,have+prices[i]-fee);
        }
        //当然返回no_have，因为最后要卖掉股票
        return no_have;
    }
}
