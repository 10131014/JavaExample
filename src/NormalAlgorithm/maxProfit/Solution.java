package NormalAlgorithm.maxProfit;
public class Solution {
    public int maxProfit(int[] prices) {
        int buy;
        int profit=0;
        if(prices.length==0)
        {
            return profit;
        }
        buy=prices[0];
        for (int i=0;i<prices.length-1;i++)
        {
            if (buy>=prices[i])
            {
                buy=prices[i];
            }
            else
            {
                continue;
            }
            for (int j=i+1;j<prices.length;j++)
            {
                profit=Math.max((prices[j]-buy),profit);
            }
        }
        return profit;
    }
}
