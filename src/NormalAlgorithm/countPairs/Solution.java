package NormalAlgorithm.countPairs;

import java.util.HashMap;
import java.util.Map;

//1711. 大餐计数
//哈希表
public class Solution {
    public int countPairs(int[] deliciousness) {
        int ans = 0;
        int mod = 1000000007;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : deliciousness) {
            int delicious = 1;
            for (int i = 0; i <=21; i++) {
                if (delicious >= num && map.containsKey(delicious - num)) {
                    ans = ans + map.get(delicious - num);
                    ans = ans % mod;
                }
                delicious = delicious * 2;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}
