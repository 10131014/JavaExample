package NormalAlgorithm.largeGroupPositions;

import java.util.ArrayList;
import java.util.List;

//830. 较大分组的位置
public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        char[] s1 = s.toCharArray();
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0;
        int end = 1;
        while (start < s.length() && end < s.length()) {
            if (s1[end] == s1[start]) {
                end++;
            } else {
                if (end - start >= 3) {
                    List<Integer> res = new ArrayList<>();
                    res.add(start);
                    res.add(end - 1);
                    ans.add(new ArrayList<>(res));
                    start = end;
                    end++;
                } else {
                    start = end;
                    end++;
                }
            }
        }
        if (end - start >= 3) {
            List<Integer> res = new ArrayList<>();
            res.add(start);
            res.add(end-1);
            ans.add(new ArrayList<>(res));
        }
        return ans;
    }
}
