package NormalAlgorithm.decrypt;

//5550. 拆炸弹
public class Solution {
    public int[] decrypt(int[] code, int k) {
        int l = code.length;
        int[] ans = new int[l];
        if (k > 0) {
            for (int i = 0; i < l; i++) {
                for (int j = i + 1; j <= i + k; j++) {
                    ans[i] = ans[i] + code[j % l];
                }
            }
        } else if (k < 0) {
            for (int i = 0; i < l; i++) {
                for (int j = l + k + i; j < i + l; j++) {
                    ans[i] = ans[i] + code[j % l];
                }
            }
        }
        return ans;
    }
}
