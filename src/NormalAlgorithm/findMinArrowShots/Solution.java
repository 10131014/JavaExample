package NormalAlgorithm.findMinArrowShots;

import java.util.Arrays;
import java.util.Comparator;

//452. 用最少数量的箭引爆气球
public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return Integer.compare(o1[0],o2[0]);
                } else {
                    return Integer.compare(o1[1],o2[1]);
                }
            }
        });
        int ans = 1;
        int[] qiqiu = points[0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= qiqiu[1]) {
                qiqiu[0] = Math.max(points[i][0], qiqiu[0]);
                qiqiu[1] = Math.min(points[i][1], qiqiu[1]);
                continue;
            }
            qiqiu = points[i];
            ans++;
        }
        return ans;
    }
}
