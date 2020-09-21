package NormalAlgorithm.paintingPlan;
//9.19 比赛第一题
public class Solution {
    public int paintingPlan(int n, int k) {
        if (n == 1) {
            if (k == 0)
                return 0;
            else
                return 1;
        } else if (n == 2) {
            if (k == 0 || k == 1)
                return 0;
            if (k == 2)
                return 4;
            if (k == 3)
                return 4;
            else
                return 1;
        } else {
            int[] num = new int[2 * (n - 1)];
            num[0] = n;
            num[2 * (n - 1) - 1] = 1;
            int nnum = 1;
            for (int i = n - 1; i >=2; i--) {
                num[nnum] = num[nnum - 1] + i;
                nnum++;
                num[nnum] = num[nnum - 2] + i;
                nnum++;
            }
            int[] ans = new int[2 * (n - 1) - 1];
            ans[0] = n * n;
            int nans = 1;
            for (int i = n - 1; i >= 2; i--) {
                ans[nans] = ans[nans - 1] * i;
                nans++;
                ans[nans] = ans[nans - 2] * i;
                nans++;
            }
            if (k < n) {
                return 0;
            } else if (k % n == 0) {
                int m = k / n;
                int a = 1;
                int b = 1;
                for (int i = n; i > (n - m); i--) {
                    a = a * i;
                }
                for (int j = 1; j <= m; j++) {
                    b = b * j;
                }
                if (m < n) {
                    return 2 * a / b;
                } else {
                    return a / b;
                }
            } else {
                for (int i = 1; i < num.length - 1; i++) {
                    if (num[i] == k) {
                        return ans[i - 1];
                    }
                }
                return 0;
            }
        }
    }
}
