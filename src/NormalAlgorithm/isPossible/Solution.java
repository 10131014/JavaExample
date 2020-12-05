package NormalAlgorithm.isPossible;

//659. 分割数组为连续子序列
//贪心算法
//数组计数
public class Solution {
    public boolean isPossible(int[] nums) {
        int l = nums.length;
        long maxgap = nums[l - 1] - nums[0];
        if (maxgap >= 10000) {
            return false;
        }
        int[] countnum = new int[(int) maxgap + 1];
        //统计每个数字出现的次数
        for (int i = 0; i < l; i++) {
            countnum[nums[i] - nums[0]]++;
        }
        int succession_length = 0;
        int count = l;
        while (count > 0) {
            int j;
            //记录连续子序列的起点
            for (j = 0; j < maxgap + 1; j++) {
                if (countnum[j] != 0) {
                    succession_length = 1;
                    countnum[j]--;
                    count--;
                    break;
                }
            }
            for (int k = j + 1; k < maxgap + 1; k++) {
                if (countnum[k] != 0) {
                    //重点：如果当前数字频次小于之前一个数字的频次，则不能选当前数字
                    //例如：123345，当走到4时，不能选4
                    if (countnum[k] <= countnum[k - 1]) {
                        break;
                    }
                    succession_length = succession_length + 1;
                    countnum[k]--;
                    count--;
                } else {
                    break;
                }
            }
            if (succession_length < 3) {
                return false;
            }
        }
        return true;
    }
}
