package DynamicProgrammingAlgorithm.superEggDrop;

//887. 鸡蛋掉落
public class Solution {
    public int superEggDrop(int k, int n) {
        //当楼层为1的时候，一个鸡蛋一次就可以确定
        if (n==1){
            return 1;
        }
        //注意这个dp的意思是i次机会和j个鸡蛋所能确定的最大楼层n的大小
        //由于楼层最高为n，所以最多需要n次就可以确定
        //+1是包含了0次和0个鸡蛋
        int[][] dp=new int[n+1][k+1];
        //不用管第0行和第0列，因为0次机会和0个鸡蛋可以确定的最大楼层肯定是0层
        for (int i=1;i<k+1;i++){
            //只有一次机会的情况下，无论鸡蛋有多少个，只能确定n为1的情况下，能确定f的值
            //例如你只能扔到一层，如果碎了，说明f为0；如果没碎，说明f为1
            dp[1][i]=1;
        }

        int ans=-1;
        for (int i=2;i<n+1;i++){
            for (int j=1;j<k+1;j++){
                //状态转移方程
                //如果鸡蛋没有碎，那么对应的是 f(t - 1, k)f(t−1,k)，也就是说在这一层的上方可以有 f(t - 1, k)f(t−1,k) 层
                //如果鸡蛋碎了，那么对应的是 f(t - 1, k - 1)f(t−1,k−1)，也就是说在这一层的下方可以有 f(t - 1， k - 1)f(t−1，k−1) 层。
                dp[i][j]=dp[i-1][j]+dp[i-1][j-1]+1;
            }
            //当能确定f的层数大于等于题目需求的n，则返回最少的次数
            if (dp[i][k]>=n){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
