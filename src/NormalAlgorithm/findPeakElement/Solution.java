package NormalAlgorithm.findPeakElement;

//162. 寻找峰值
public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }
        int l = 1;
        int r = nums.length - 2;
        int len = (l + r) / 2;
        while (l < r) {
            if (nums[len] > nums[len - 1] && nums[len] > nums[len + 1]) {
                return len;
            } else if (nums[len] < nums[len + 1]) {
                l = len + 1;
                len = (r + l) / 2;
            } else if (nums[len] > nums[len + 1]) {
                r = len;
                len = (r + l) / 2;
            }
        }
        return l;
    }
}
