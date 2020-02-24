package NormalAlgorithm.rotate;

public class Solution {
    public void rotate(int[] nums, int k) {
        int k1=k%nums.length;
        int a;
        for (int i=0;i<k1;i++) {
            a = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = a;
        }
    }
}
