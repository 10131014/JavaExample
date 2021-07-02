package NormalAlgorithm.canBeIncreasing;

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean asc = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                if (asc) {
                    if (i - 1 < 0 || nums[i + 1] > nums[i - 1]) asc = false;
                    else if (i + 2 >= n || nums[i + 2] > nums[i]) asc = false;
                    else return false;
                }
                else return false;
            }
        }
        return true;
    }
}


