package NormalAlgorithm.spiralOrder;
//54.螺旋矩阵
//剑指Offer.29 顺时针打印矩阵

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0) {
            return ans;
        }
        int row = matrix.length;
        int line = matrix[0].length;
        for (int m = 0; m <= row; m++) {
            for (int i = m; i < line - m; i++) {
                ans.add(matrix[m][i]);
            }
            if (ans.size() == row * line) {
                return ans;
            }
            for (int j = m + 1; j < row - m; j++) {
                ans.add(matrix[j][line - 1 - m]);
            }
            if (ans.size() == row * line) {
                return ans;
            }
            for (int k = line - 2 - m; k >= m; k--) {
                ans.add(matrix[row - 1 - m][k]);
            }
            if (ans.size() == row * line) {
                return ans;
            }
            for (int l = row - 2 - m; l >= 1 + m; l--) {
                ans.add(matrix[l][m]);
            }
            if (ans.size() == row * line) {
                return ans;
            }
        }
        return ans;
    }
}
