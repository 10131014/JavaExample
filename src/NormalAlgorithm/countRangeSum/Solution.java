package NormalAlgorithm.countRangeSum;

//327. 区间和的个数
//前缀和
//O(n^2)的算法是前缀和，先求所有的数的和，然后通过减去区间的数得到各个区间。
public class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int ans = 0;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            long temp = sum;
            for (int j = nums.length - 1; j >= i; j--) {
                if (temp >= lower && temp <= upper) {
                    ans++;
                }
                temp = temp - nums[j];
            }
            sum = sum - nums[i];
        }
        return ans;
    }
}
