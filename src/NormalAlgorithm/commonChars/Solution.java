package NormalAlgorithm.commonChars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1002. 查找常用字符
public class Solution {
    public List<String> commonChars(String[] A) {
        String s = A[0];
        List ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int flag = 0;
            for (int j = 1; j < A.length; j++) {
                int l = A[j].length();
                for (int k = 0; k < l; k++) {
                    if (s.charAt(i) == A[j].charAt(k)) {
                        flag++;
                        if (k == l - 1) {
                            A[j] = A[j].substring(0, k);
                        } else {
                            A[j] = A[j].substring(0, k) + A[j].substring(k + 1, l);
                        }
                        break;
                    }
                }
            }
            if (flag == A.length - 1) {
                ans.add(s.charAt(i));
            }
        }
        ans.toString();
        return ans;
    }
}
