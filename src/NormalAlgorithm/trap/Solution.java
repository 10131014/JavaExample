package NormalAlgorithm.trap;


public class Solution {
    public int trap(int[] height) {
        int flag;
        flag = bigestnum(height);
        int i = 0;
        int j = 1;
        int ans = 0;
        int temp = 0;
        int l = height.length;
        while (j < l) {
            if (height[i] <= height[j]) {
                temp = height[i] * (j - i - 1);
                for (int k = i + 1; k < j; k++) {
                    temp = temp - height[k];
                }
                ans = ans + temp;
                temp = 0;
                i = j;
            }
            j++;
        }
        i = l - 2;
        j = l - 1;
        while (i >= 0) {
            if (height[j] == flag) {
                break;
            }
            if (height[i] >= height[j]) {
                temp = height[j] * (j - i - 1);
                for (int m = j - 1; m > i; m--) {
                    temp = temp - height[m];
                }
                ans = ans + temp;
                temp = 0;
                j = i;
            }
            if (height[i] == flag) {
                break;
            }
            i--;
        }
        return ans;
    }

    public int bigestnum(int[] nums) {
        int big = 0;
        for (int i1 = 0; i1 < nums.length; i1++) {
            big = Math.max(big, nums[i1]);
        }
        return big;
    }
}
