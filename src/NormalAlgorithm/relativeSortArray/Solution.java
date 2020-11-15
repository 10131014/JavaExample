package NormalAlgorithm.relativeSortArray;

//1122. 数组的相对排序
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        int[] ans = new int[arr1.length];
        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] != 0) {
                ans[idx] = arr2[i];
                idx++;
                count[arr2[i]]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                ans[idx] = i;
                idx++;
                count[i]--;
            }
        }
        return ans;
    }
}
