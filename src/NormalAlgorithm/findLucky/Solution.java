package NormalAlgorithm.findLucky;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> numbermap = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            numbermap.put(arr[i], numbermap.getOrDefault(arr[i], 0) + 1);
        }
        int ans = -1;
        for (int n : numbermap.keySet()) {
            if (numbermap.get(n) == n) {
                ans = Math.max(ans, n);
            }
        }
        return ans;
    }
}
