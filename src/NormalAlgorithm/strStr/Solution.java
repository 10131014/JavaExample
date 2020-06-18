package NormalAlgorithm.strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()>haystack.length())
        {
            return -1;
        }
        if (needle.length()==0||haystack.length()==0)
        {
            return 0;
        }
        String substr;
        int k1=needle.length();
        int k2=haystack.length();
        int i=0;
        while ((i+k1)<=k2)
        {
            substr=haystack.substring(i,i+k1);
            if (substr.equals(needle))
            {
                return i;
            }
            i++;
        }
        return -1;
    }
}
