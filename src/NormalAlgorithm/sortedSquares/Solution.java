package NormalAlgorithm.sortedSquares;

import java.util.Arrays;

//977. 有序数组的平方
public class Solution {
    public int[] sortedSquares(int[] A) {
        int min_index = 0;
        int i = 1;
        for (; i < A.length; i++) {
            if (Math.abs(A[min_index]) > Math.abs(A[i])) {
                min_index = i;
            }
        }
        int left = min_index - 1;
        int right = min_index + 1;
        int[] ans = new int[A.length];
        ans[0] = A[min_index] * A[min_index];
        for (int j = 1; j < A.length; j++) {
            if (right==A.length||left >= 0 &&right<A.length&& Math.abs(A[left]) <= Math.abs(A[right])) {
                ans[j] = A[left] * A[left];
                left--;
            } else {
                ans[j] = A[right] * A[right];
                right++;
            }
        }
        return ans;
    }
}
