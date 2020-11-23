package NormalAlgorithm.isAnagram;



public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            int[] scount = new int[26];
            int[] tcount = new int[26];
            for (int i = 0; i < s1.length; i++) {
                scount[s1[i] - 'a']++;
                tcount[t1[i] - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (scount[i] != tcount[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
