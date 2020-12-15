package NormalAlgorithm.monotoneIncreasingDigits;

import java.util.Arrays;

//738. 单调递增的数字
public class Solution {
    public int monotoneIncreasingDigits(int N) {
        int[] nums = new int[10];
        int p = 9;
        while (N > 0) {
            nums[p] = N % 10;
            N = N / 10;
            p--;
        }
        int i;
        for (i = 0; i < 10; i++) {
            if (nums[i] != 0) break;
        }
        for (int j=9;j>=i+1;j--){
            if (nums[j]<nums[j-1]){
                Arrays.fill(nums,j,10,9);
                nums[j-1]--;
            }
        }
        int ans = 0;
        for (int k = i; k < 10; k++) {
            ans = ans + nums[k] * (int) Math.pow(10, 9 - k);
        }
        return ans;
    }
}
