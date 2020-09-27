package NormalAlgorithm.minOperationsMaxProfit;

import java.util.HashMap;
import java.util.Map;

//5524. 经营摩天轮的最大利润
public class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        if (runningCost > boardingCost * 4) {
            return -1;
        }
        int person = 0;
        for (int i = 0; i < customers.length; i++) {
            person = person + customers[i];
        }
        Map<Integer, Integer> map = new HashMap();
        int maxprofit = Integer.MIN_VALUE;
        int profitt = 0;
        int index = 0;
        int person_i = 0;
        for (int i = 0; i < person / 4 + 1; i++) {
            if (index < customers.length) {
                person_i = person_i + customers[index];
            }
            if (person_i > 4) {
                profitt = profitt + 4 * boardingCost - runningCost;

                if (profitt > maxprofit) {
                    maxprofit = Math.max(maxprofit, profitt);
                    map.put(maxprofit, new Integer(i));
                }
                person_i = person_i - 4;
            } else if (person_i >= 0 && person_i <= 4) {
                profitt = profitt + person_i * boardingCost - runningCost;

                if (profitt > maxprofit) {
                    maxprofit = Math.max(maxprofit, profitt);
                    map.put(maxprofit, new Integer(i));
                }
                person_i = 0;
            }
            index++;
        }
        return map.getOrDefault(maxprofit, 0) + 1;
    }
}
