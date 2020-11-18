package NormalAlgorithm.canCompleteCircuit;


//134. 加油站
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = gas.length;
        int sum = 0;
        int minsum = Integer.MAX_VALUE;
        int minId = 0;
        for (int i = 0; i < l; i++) {
            sum += gas[i] - cost[i];
            if (sum < minsum) {
                minsum = sum;
                minId = i + 1;
            }
        }
        return sum >= 0 ? minId % l : -1;
    }
}
