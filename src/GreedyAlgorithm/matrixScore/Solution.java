package GreedyAlgorithm.matrixScore;
//861. 翻转矩阵后的得分
//贪心算法
public class Solution {
    public int matrixScore(int[][] A) {
        //将每行第一个数字为0的行翻转：0变1,1变0
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < A[i].length; j++) {
                    if (A[i][j] == 0) {
                        A[i][j] = 1;
                    } else {
                        A[i][j] = 0;
                    }
                }
            }
        }
        //统计每列0的个数
        int[] line_zero_count = new int[A[0].length];
        for (int j = 0; j < A[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
                if (A[i][j] == 0) {
                    line_zero_count[j]++;
                }
            }
        }
        double ans = 0;
        int l = A.length;
        int l2 = line_zero_count.length;
        //当该列0数量大于1，则翻转；若小于1的数量，则不翻转；并同时计算
        for (int k = 0; k < l2; k++) {
            if (line_zero_count[k] > l / 2) {
                ans = ans + Math.pow(2, l2 - k - 1) * line_zero_count[k];
            } else {
                ans = ans + Math.pow(2, l2 - k - 1) * (l - line_zero_count[k]);
            }
        }
        return (int) ans;
    }
}
