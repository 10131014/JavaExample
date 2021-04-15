package NormalAlgorithm.removeStones;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int removeStones(int[][] stones) {
        int ans = 0;
        Arrays.sort(stones, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int p1 = 0;
        int p2 = 1;
        while (p1 < stones.length && p2 < stones.length) {
            if (stones[p1][0] == stones[p2][0]) {
                ans++;
                stones[p2][0] = -1;
                p2++;
            } else {
                p1 = p2;
                p2++;
            }
        }

        Arrays.sort(stones, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        p1 = 0;
        p2 = 1;
        while (p1 < stones.length && p2 < stones.length) {
            if (stones[p2][0] != -1 && stones[p1][1] == stones[p2][1]) {
                ans++;
                p2++;
            } else {
                p1 = p2;
                p2++;
            }
        }
        return ans;
    }
}
