package NormalAlgorithm.trimMean;

import java.util.Arrays;

//1619. 删除某些元素后的数组均值
public class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double ans = 0;
        int delet_num = arr.length / 20;
        for (int i = delet_num; i < arr.length - delet_num; i++) {
            ans = ans + arr[i];
        }
        return ans / (arr.length - delet_num * 2);
    }
}
