package NormalAlgorithm.longestPalindrome;

import java.util.HashMap;

public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (Character i:s.toCharArray())
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n=0;
        int len=0;
        for (Integer j:map.values())
        {
            if (j%2==0)
            {
                len=len+j;
            }
            else
            {
                n=1;
                len=len+j-1;
            }
        }
        return len+n;
    }
}
