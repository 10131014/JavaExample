package NormalAlgorithm.isPalindrome2;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]","");
        char[] ss=s.toCharArray();
        int l=s.length();
        for(int j=0;j<l;j++)
        {
            if(ss[j]>90)
            {
                ss[j]= (char) (ss[j]-32);
            }
        }
        for (int i=0;i<l/2;i++)
        {
            if(ss[i]!=ss[l-i-1])
            {
                return false;
            }
        }
        return true;
    }
}
