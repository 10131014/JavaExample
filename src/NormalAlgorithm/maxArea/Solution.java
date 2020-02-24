package NormalAlgorithm.maxArea;

public class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        int V;
        while (i<j)
        {
            V=Math.min(height[i],height[j])*(j-i);
            ans=Math.max(ans,V);
            if (height[i]<=height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return ans;
    }
}
