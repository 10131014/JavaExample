package NormalAlgorithm.fourSumCount;

import java.util.HashMap;
import java.util.Map;

//454. 四数相加II
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> AaddB_map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                AaddB_map.put(A[i] + B[j], AaddB_map.getOrDefault(A[i] + B[j], 0) + 1);
            }
        }
        int ans = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if (AaddB_map.containsKey(-(C[i] + D[j]))) {
                    ans = ans + AaddB_map.get(-(C[i] + D[j]));
                }
            }
        }
        return ans;
    }
}
