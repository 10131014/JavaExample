package NormalAlgorithm.kClosest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//973. 最接近原点的K个点
//加权重的排序
public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int l = points.length;
        if (l == K) {
            return points;
        }
        double[] dis = new double[l];
        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            dis[i] = Math.sqrt((double) (points[i][0] * points[i][0] + points[i][1] * points[i][1])) * 100 + ((double) i / 10000);
            map.put(dis[i], i);
        }
        Arrays.sort(dis);
        int[][] ans = new int[K][2];
        for (int i = 0; i < K; i++) {
            ans[i] = points[map.get(dis[i])];
        }
        return ans;
    }
}
