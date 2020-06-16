package NormalAlgorithm.dailyTemperatures;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> decreasing=new Stack();
        int[] ans=new int[T.length];
        int temp;
        for (int i=0;i<T.length;i++)
        {
            while ((!decreasing.empty())&&(T[i]>T[decreasing.peek()]))
            {
                temp=decreasing.pop();
                ans[temp]=i-temp;
            }
            decreasing.push(i);
        }
        return ans;
    }
}
