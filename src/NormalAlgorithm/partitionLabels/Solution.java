package NormalAlgorithm.partitionLabels;

import java.util.*;

//763. 划分字母区间
public class Solution {
    public List<Integer> partitionLabels(String S) {
        char[] s1 = S.toCharArray();
        Map<Integer, Integer> s_e_map = new HashMap<>();
        Set<Character> s_set=new HashSet<>();
        List ans = new ArrayList();
        int i;
        int j;
        for (i = 0; i < s1.length; i++) {
            if (s_set.contains(s1[i])) continue;
            s_set.add(s1[i]);
            for (j = i; j < s1.length; j++) {
                //记录字母第一次出现的下标和最后一次出现的下标
                //第一次出现的下标作为key，最后一次出现的下标作为value
                if (s1[i] == s1[j]) s_e_map.put(i, j);
            }
        }
        int key = 0;
        while (key < s1.length) {
            int temp = key;
            for (int n : s_e_map.keySet()) {
                //如果俩字母第一次和最后一次出现的下标区间有交集，则更新key值
                //例如：（key，value）=(0,8)，（n，value）=（1,9）
                //则更新key=n;
                if (n < s_e_map.getOrDefault(key, 0) && s_e_map.get(n) > s_e_map.getOrDefault(key, 0)) {
                    key = n;
                }
            }
            ans.add(s_e_map.get(key) - temp + 1);
            key=s_e_map.get(key)+1;
        }

        return ans;
    }
}
