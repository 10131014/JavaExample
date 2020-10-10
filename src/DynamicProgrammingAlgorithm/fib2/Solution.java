package DynamicProgrammingAlgorithm.fib2;

//剑指Offer 10-I. 斐波那契数列
//动态规划解法
public class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int ans = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            ans = (a + b) % (int) (1e9 + 7);
            a = b;
            b = ans;
        }
        return ans % (int) (1e9 + 7);
    }
}
