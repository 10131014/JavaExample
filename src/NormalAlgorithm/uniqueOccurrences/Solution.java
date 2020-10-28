package NormalAlgorithm.uniqueOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//1207. 独一无二的出现次数
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> num_times = new HashMap<>();
        Set<Integer> num_set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            num_times.put(arr[i], num_times.getOrDefault(arr[i], 0) + 1);
        }
        for (int n : num_times.keySet()) {
            if (num_set.contains(num_times.get(n))) {
                return false;
            }
            num_set.add(num_times.get(n));
        }
        return true;
    }
}
