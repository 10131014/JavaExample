package NormalAlgorithm.smallestDifference;

import java.util.Arrays;

//面试题16.06 最小差
public class Solution {
    public int smallestDifference(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Integer.MIN_VALUE) {
                a[i] = Integer.MAX_VALUE - 1;
            } else {
                a[i] = (Math.abs(a[i]));
            }
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = Math.abs(b[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int pa = 0;
        int pb = 0;
        int ans = Integer.MAX_VALUE;
        while (pa < a.length && pb < b.length) {
            ans = Math.min(ans, Math.abs(a[pa] - b[pb]));
            if (a[pa] < b[pb]) {
                pa++;
            } else {
                pb++;
            }
        }
        return ans;
    }
}
