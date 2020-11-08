package NormalAlgorithm.sortByBits;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1356. 根据数字二进制下1的数目排序
public class Solution {
    public int[] sortByBits(int[] arr) {
        int l = arr.length;
        double[] count = new double[l];
        Map<Double, Integer> map = new HashMap<>();
        int a;
        for (int i = 0; i < l; i++) {
            a = 1;
            count[i] = count[i] + (double) arr[i] / 10100;
            for (int k = 0; k < 14; k++) {
                if ((arr[i] & a) != 0) {
                    count[i] = count[i] + 1;
                }
                a = a << 1;
            }
            map.put(count[i], arr[i]);
        }
        Arrays.sort(count);
        int[] ans = new int[l];
        for (int i = 0; i < l; i++) {
            ans[i] = map.get(count[i]);
        }
        return ans;
    }
}
