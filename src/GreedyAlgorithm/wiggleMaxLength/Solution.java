package GreedyAlgorithm.wiggleMaxLength;
//376. 摆动序列
//贪心算法（O(N)）
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        if (nums.length == 2) {
            return nums[0] == nums[1] ? 1 : 2;
        }
        //以上为排除特殊案例
        int ans = 1;
        int p = 1;
        //需要找到第一个上升或者下降的序列
        //例如1,1,1,1,2,2,2,2,3,4,5,6,5,4
        //第一个上升序列是1,2
        while (p < nums.length) {
            while (nums[p - 1] == nums[p]) {
                p++;
                //一定在里面加这行语句，不能在while里加p<nums.length
                //否者无法判断是由于p走到结尾跳出循环还是nums[p-1]!=nums[p]跳出的循环，以下写法同理
                //我们需要后者
                if (p >= nums.length) {
                    return ans;
                }
            }
            p++;
            ans++;
            break;
        }
        //当初始序列为上升序列
        if (nums[p - 2] < nums[p - 1]) {
            while (p < nums.length) {
                //需要找上升序列最高的那一个
                while (nums[p - 1] <= nums[p]) {
                    p++;
                    if (p >= nums.length) {
                        return ans;
                    }
                }
                ans++;
                p++;
                if (p >= nums.length) {
                    break;
                }//需要找下降序列最低的那个
                while (nums[p - 1] >= nums[p]) {
                    p++;
                    if (p >= nums.length) {
                        return ans;
                    }
                }
                ans++;
                p++;
            }
        //初始序列为下降序列
        } else {
            while (p < nums.length) {
                //需要找下降序列最低的那个
                while (nums[p - 1] >= nums[p]) {
                    p++;
                    if (p >= nums.length) {
                        return ans;
                    }
                }
                ans++;
                p++;
                if (p >= nums.length) {
                    break;
                }
                //需要找上升序列最高的那一个
                while (nums[p - 1] <= nums[p]) {
                    p++;
                    if (p >= nums.length) {
                        return ans;
                    }
                }
                ans++;
                p++;
            }
        }
        return ans;
    }
}
