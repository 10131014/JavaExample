package NormalAlgorithm.numJewelsInStones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> Jset = new HashSet();
        for (int i = 0; i < J.length(); i++) {
            Jset.add(J.charAt(i));
        }
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Jset.contains(S.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }
}
