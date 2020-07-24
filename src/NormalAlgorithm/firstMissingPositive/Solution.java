package NormalAlgorithm.firstMissingPositive;


public class Solution {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] <= 0) {
                nums[i] = l + 1;
            }
        }
        for (int i = 0; i < l; i++) {
            if (Math.abs(nums[i]) >= 1 && Math.abs(nums[i]) <= l) {
                nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
            }
        }
        for (int j = 0; j < l; j++) {
            if (nums[j] > 0) {
                return j + 1;
            }
        }
        return l + 1;
    }
}
