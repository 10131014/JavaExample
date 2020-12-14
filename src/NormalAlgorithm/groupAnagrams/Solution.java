package NormalAlgorithm.groupAnagrams;
//49. 字母异位词分组
//计数+哈希表

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s1 : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                count[s1.charAt(i) - 'a']++;
            }
            StringBuilder s2 = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                s2 = s2.append((char) 'a' + j);
                s2 = s2.append(count[j]);
            }
            String key = s2.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(s1);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
