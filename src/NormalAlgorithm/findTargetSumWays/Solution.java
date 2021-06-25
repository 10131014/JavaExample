package NormalAlgorithm.findTargetSumWays;
//494. 目标和
//递归解法
//public class Solution {
//    int count = 0;
//
//    public int findTargetSumWays(int[] nums, int S) {
//        find(nums, S, 0,  0);
//        return count;
//    }
//
//    public void find(int[] nums, int S, int i, int sum) {
//        if (i == nums.length) {
//            if (sum == S) {
//                count++;
//            }
//        }else{
//            find(nums, S, i + 1, sum - nums[i]);
//            find(nums, S, i + 1, sum + nums[i]);
//        }
//    }
//}
//动态规划解法
public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum=0;
        int l=nums.length;
        for (int i=0;i<l;i++){
            sum+=nums[i];
        }
        //dp[i][j]表示前i个数构成和为j的有多少种
        int[][] dp=new int[l+1][2*sum+1];
        //初始化
        //第一个数前添加“+”
        dp[1][nums[0]+sum]=1;
        //第一个数前添加“-”
        dp[1][-nums[0]+sum]+=1;
        for (int i=1;i<l+1;i++){
            for (int j=-sum;j<=sum;j++){
                //这是避免重复运算
                if(dp[i-1][j+sum]>0){
                    dp[i][j-nums[i-1]+sum]+=dp[i-1][j+sum];
                    dp[i][j+nums[i-1]+sum]+=dp[i-1][j+sum];
                }
            }
        }
        return S>sum?0:dp[l][S+sum];
    }
}