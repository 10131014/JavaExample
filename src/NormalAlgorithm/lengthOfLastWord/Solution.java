package NormalAlgorithm.lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        s=s.trim();
        int slong=s.length();
        for (int i=slong-1;i>=0;i--)
        {
            if ((s.charAt(i)==' '))
            {
                ans=slong-i-1;
                return ans;
            }
        }
        return (slong-ans);
    }
}
