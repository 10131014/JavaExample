package NormalAlgorithm.sortArrayByParityII;

//922. 按奇偶排序数组II
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int l = A.length;
        int[] ans = new int[l];
        int podd = 1;
        int peven = 0;
        for (int i = 0; i < l; i++) {
            if (A[i] % 2 == 0) {
                ans[peven] = A[i];
                peven += 2;
            } else {
                ans[podd] = A[i];
                podd += 2;
            }
        }
        return ans;
    }
}
