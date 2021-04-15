package NormalAlgorithm.maximumUnits;

import java.util.Arrays;
import java.util.Comparator;

//1710. 卡车上的最大单元数
//排序+贪心
public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int ans = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize > boxTypes[i][0]) {
                ans = ans + boxTypes[i][0] * boxTypes[i][1];
                truckSize = truckSize - boxTypes[i][0];
            } else {
                ans = ans + truckSize * boxTypes[i][1];
                break;
            }
        }
        return ans;
    }
}
