package NormalAlgorithm.paintingPlan;

//LCP 22. 黑白方格画
//数学公式：将 a 行 b 列涂成黑色，会形成 sum 个黑色格子，而 sum = a*n + b*n - a*b，sum=a⋅n+b⋅n−a⋅b 。

public class Solution {
    public int paintingPlan(int n, int k) {
        if (k == n * n) {
            return 1;
        }
        int sum = 0;
        int ans = 0;
        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                sum = a * n + b * n - a * b;
                if (sum == k) {
                    int x=combine(n,a);
                    int y=combine(n,b);
                    ans = ans+x*y;
                }
            }
        }
        return ans;
    }

    public int combine(int n, int m) {
        int result = 1;
        for (int i = n; i >= n - m+1; i--) {
            result = result * i;
        }
        for (int j = 1; j <= m; j++) {
            result = result / j;
        }
        return result;
    }
}
