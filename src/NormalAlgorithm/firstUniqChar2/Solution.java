package NormalAlgorithm.firstUniqChar2;

import java.util.HashMap;
import java.util.Map;

//剑指offer 50.第一个只出现一次的字符
public class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Integer> charmap = new HashMap<>();
        char ans = ' ';
        for (int i = 0; i < s.length(); i++) {
            charmap.put(s.charAt(i), charmap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int n=0;n<s.length();n++) {
            if (charmap.get(s.charAt(n)) == 1) {
                ans = s.charAt(n);
                return ans;
            }
        }
        return ans;
    }
}
