package NormalAlgorithm.missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int ans;
        int sum=0;
        int n=nums.length;
        for (int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        ans=n*(n+1)/2-sum;
        return ans;
    }
}
