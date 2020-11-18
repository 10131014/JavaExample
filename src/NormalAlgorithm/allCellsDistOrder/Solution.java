package NormalAlgorithm.allCellsDistOrder;

import java.util.ArrayList;
import java.util.List;

//1030. 距离顺序排列矩阵单元格
public class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R * C][2];
        //所要建桶的数量
        int maxdist = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);
        List<List<int[]>> res = new ArrayList<>();
        for (int i = 0; i <= maxdist; i++) {
            //建桶
            res.add(new ArrayList<int[]>());
        }
        int d;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                d = Math.abs(i - r0) + Math.abs(j - c0);
                //把对应距离的点放进对应的桶内
                res.get(d).add(new int[]{i, j});
            }
        }
        int p = 0;
        for (int i = 0; i < res.size(); i++) {
            for (int[] n : res.get(i)) {
                ans[p] = n;
                p++;
            }
        }
        return ans;
    }
}
