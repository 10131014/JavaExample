package NormalAlgorithm.missingNumber2;

//剑指offer 53-II. 0到n-1中缺失的数字
public class Solution {
    public int missingNumber(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n != nums[i]) {
                return n;
            }
            n++;
        }
        return n;
    }
}
