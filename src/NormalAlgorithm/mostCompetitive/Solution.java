package NormalAlgorithm.mostCompetitive;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//1673. 找出最具竞争力的子序列
//维护一个单调栈
public class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int pop_nums = 0;
        stack.push(nums[0]);
        int i = 1;
        while (i < nums.length) {
            while (!stack.isEmpty() && stack.peek() > nums[i]) {
                stack.pop();
                pop_nums++;
                if (pop_nums == nums.length - k) {
                    break;
                }
            }
            stack.push(nums[i]);
            i++;
            if (pop_nums == nums.length - k) {
                break;
            }
        }
        for (int j = i; j < nums.length; j++) {
            stack.push(nums[j]);
        }
        while (nums.length - k - pop_nums > 0) {
            stack.pop();
            pop_nums++;
        }
        int[] ans = new int[k];
        for (int m = k - 1; m >= 0; m--) {
            ans[m] = stack.pop();
        }
        return ans;
    }
}
