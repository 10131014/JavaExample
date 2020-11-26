package NormalAlgorithm.sortString;

import java.util.Arrays;

//1370. 上升下降字符串
public class Solution {
    public String sortString(String s) {
        char[] word = s.toCharArray();
        int l = word.length;
        Arrays.sort(word);
        char[] ans = new char[l];
        int p = -1;
        while (p < l - 1) {
            for (int i = 0; i < l; i++) {
                if (word[i] != '0') {
                    if (p == -1) {
                        ans[0] = word[i];
                        p++;
                    } else {
                        p++;
                        ans[p] = word[i];
                    }
                    word[i] = '0';
                    break;
                }
            }
            for (int i = 1; i < l; i++) {
                if (word[i] != '0' && word[i] != ans[p]) {
                    p++;
                    ans[p] = word[i];
                    word[i] = '0';
                }
            }
            for (int i = l - 1; i >= 0; i--) {
                if (word[i] != '0') {
                    p++;
                    ans[p] = word[i];
                    word[i] = '0';
                    break;
                }
            }
            for (int i = l - 1; i >= 0; i--) {
                if (word[i] != '0' && word[i] != ans[p]) {
                    p++;
                    ans[p] = word[i];
                    word[i] = '0';
                }
            }
        }
        return String.valueOf(ans);
    }
}
