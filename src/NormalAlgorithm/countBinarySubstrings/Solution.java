package NormalAlgorithm.countBinarySubstrings;

import java.util.ArrayList;
import java.util.List;

//696. 计数二进制子串
public class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> group = new ArrayList();
        int ans = 0;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                group.add(count);
                count = 1;
            }
        }
        group.add(count);
        for (int j = 0; j < group.size() - 1; j++) {
            ans = ans + Math.min(group.get(j), group.get(j + 1));
        }
        return ans;
    }
}
