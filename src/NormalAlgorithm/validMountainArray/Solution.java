package NormalAlgorithm.validMountainArray;

//941. 有效的山脉数组
public class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int end = 1;
        if (A[end - 1] >= A[end]) {
            return false;
        }
        while (end < A.length && A[end - 1] < A[end]) {
            end++;
        }
        if (end == A.length) {
            return false;
        }
        while (end < A.length && A[end - 1] > A[end]) {
            end++;
        }
        if (end == A.length) {
            return true;
        } else {
            return false;
        }
    }
}
