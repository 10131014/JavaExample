package NormalAlgorithm.maxProfit2;

public class Solution {
    public int maxProfit2(int[] prices) {
        int maxprofit=0;
        for (int i=1;i<prices.length;i++)
        {
            if (prices[i]>prices[i-1])
            {
                maxprofit=maxprofit+(prices[i]-prices[i-1]);
            }
        }
        return maxprofit;
    }
}
