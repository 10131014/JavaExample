package NormalAlgorithm.smallerNumbersThanCurrent;

//1365. 有多少小于当前数字的数字
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[101];
        int[] b = new int[101];
        int[] ans = new int[nums.length];
        //统计每个数字出现多少次
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        //统计0-100中有多少数字小于当前数字
        for (int j = 1; j < a.length; j++) {
            b[j] = a[j - 1] + b[j - 1];
        }
        //统计有多少小于当前数组数字的数字
        for (int k = 0; k < nums.length; k++) {
            ans[k] = b[nums[k]];
        }
        return ans;
    }
}
