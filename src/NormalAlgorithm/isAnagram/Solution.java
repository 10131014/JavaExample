package NormalAlgorithm.isAnagram;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }
        int[] a=new int[26];
        int[] b=new int[26];
        for (int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
