package NormalAlgorithm.largestRectangleArea;

import java.util.ArrayDeque;
import java.util.Deque;

//84. 柱状图中最大的矩形
//单调栈
public class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && heights[i] < heights[stack.peekLast()]) {
                int h = stack.pollLast();
                ans = Math.max(ans, heights[i] * (i - stack.peekLast() + 1));
            }
            stack.addLast(i);
        }
        return ans;
    }
}
