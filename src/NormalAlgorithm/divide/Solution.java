package NormalAlgorithm.divide;

//29. 两数相除
public class Solution {
    public int divide(int dividend, int divisor) {
        long a = (long) dividend;
        long b = (long) divisor;
        a = a >= 0 ? a : -a;
        b = b >= 0 ? b : -b;
        long res = 1;
        long ans = 0;
        if (a < b) {
            return 0;
        }
        long temp = b;
        while (a >= b) {
            while (a >= b) {
                b = b * 2;
                res = res * 2;
            }
            a = a - b / 2;
            ans = ans + res / 2;
            res = 1;
            b = temp;
        }
        if (ans > Integer.MAX_VALUE&&(long)dividend * (long) divisor > 0) {
            ans = Integer.MAX_VALUE;
        }
        return (long)dividend * (long) divisor > 0 ? (int) ans : (int) -ans;
    }
}
