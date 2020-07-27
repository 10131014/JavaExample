package NormalAlgorithm.countLargestGroup;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> numsummap = new HashMap<>();
        Map<Integer, Integer> numsummap1 = new HashMap<>();
        int numsum = 0;
        for (int i = 1; i <= n; i++) {
            numsum = weishuhe(i);
            numsummap.put(numsum, numsummap.getOrDefault(numsum, 0) + 1);
            numsum = 0;
        }
        for (int m : numsummap.keySet()) {
            numsummap1.put(numsummap.get(m), numsummap1.getOrDefault(numsummap.get(m), 0) + 1);
        }
        int ans = 0;
        for (int n1 : numsummap1.keySet()) {
            ans = Math.max(ans, n1);
        }
        return numsummap1.get(ans);
    }

    public int weishuhe(int numbers) {
        int weishusum = 0;
        while (numbers > 0) {
            weishusum = weishusum + numbers % 10;
            numbers = numbers / 10;
        }
        return weishusum;
    }
}
