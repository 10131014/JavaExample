package NormalAlgorithm.reverseString;

public class Solution {
    public void reverseString(char[] s) {
        char s1;
            for (int i=0;i<s.length/2;i++)
            {
                s1=s[i];
                s[i]=s[s.length-i-1];
                s[s.length-i-1]=s1;
            }
    }
}
