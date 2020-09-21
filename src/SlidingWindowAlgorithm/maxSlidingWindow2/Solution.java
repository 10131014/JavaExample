package SlidingWindowAlgorithm.maxSlidingWindow2;

import java.util.ArrayDeque;

//239. 滑动窗口最大值
//双向队列
public class Solution {
    ArrayDeque<Integer> deque = new ArrayDeque();
    int[] nums;

    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = nums.length;
        if (l <= 1) {
            return nums;
        }
        int max_index = 0;
        this.nums = nums;
        for (int i = 0; i < k; i++) {
            maintain(i, k);
            deque.addLast(i);
            if (nums[i] > nums[max_index]) {
                max_index = i;
            }
        }
        int[] ans = new int[l - k + 1];
        ans[0] = nums[max_index];
        for (int i = k; i < l; i++) {
            maintain(i, k);
            deque.addLast(i);
            ans[i - k + 1] = nums[deque.getFirst()];
        }
        return ans;
    }

    public void maintain(int n, int k) {
        if (!deque.isEmpty() && deque.getFirst() == n - k) {
            deque.removeFirst();
        }
        while (!deque.isEmpty() && nums[n] > nums[deque.getLast()]) {
            deque.removeLast();
        }
    }
}
