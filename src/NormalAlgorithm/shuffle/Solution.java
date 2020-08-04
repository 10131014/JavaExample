package NormalAlgorithm.shuffle;

//1470.重新排列数组
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
