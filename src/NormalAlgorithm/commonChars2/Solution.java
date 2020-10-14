package NormalAlgorithm.commonChars2;
//1002. 查找常用字符
//第二种方法，统计每个字符串中a-z字符的个数，取个数最小的那个

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<String>();
        int[] count_az = new int[26];
        int[] count = new int[26];
        for (int i = 0; i < A[0].length(); i++) {
            count_az[A[0].charAt(i) - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            Arrays.fill(count, 0);
            for (int j = 0; j < A[i].length(); j++) {
                count[A[i].charAt(j) - 'a']++;
            }
            for (int k = 0; k < 26; k++) {
                count_az[k] = Math.min(count_az[k], count[k]);
            }
        }
        //int i = 0;
        for (int i=0; i < 26; i++) {
            for (int j = 0; j < count_az[i]; j++) {
                ans.add(String.valueOf((char) i + 'a'));
            }
        }
        return ans;
    }
}
