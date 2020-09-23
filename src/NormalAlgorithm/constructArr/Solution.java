package NormalAlgorithm.constructArr;

//剑指Offer 66. 构建乘积数组
public class Solution {
    public int[] constructArr(int[] a) {
        if (a.length<1) {
            return a;
        }
        int[] mulL = new int[a.length];
        int[] mulR = new int[a.length];
        int[] ans = new int[a.length];
        mulL[0] = 1;
        for (int i = 1; i < a.length; i++) {
            mulL[i] = mulL[i - 1] * a[i - 1];
        }
        mulR[a.length - 1] = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            mulR[i] = mulR[i + 1] * a[i + 1];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = mulL[i] * mulR[i];
        }
        return ans;
    }
}
