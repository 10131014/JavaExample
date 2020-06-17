package NormalAlgorithm.lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        Map<Character,Integer> Stringmap=new HashMap();
        int maxSubstring=0;
        for (int end=0;end<s.length();end++)
        {
            if (Stringmap.containsKey(s.charAt(end)))
            {
                start=Math.max(start,Stringmap.getOrDefault(s.charAt(end),0));
            }
            Stringmap.put(s.charAt(end),end+1);
            maxSubstring=Math.max(maxSubstring,(end-start+1));
        }
        return maxSubstring;
    }
}
