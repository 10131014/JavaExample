package NormalAlgorithm.getHint;

public class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        String ans;
        int[] countsecret=new int[10];
        int[] countcowguess=new int[10];
        for (int i=0;i<secret.length();i++)
        {
            if (secret.charAt(i)==guess.charAt(i))
            {
                bulls++;
            }
        }
        for (int i=0;i<secret.length();i++)
        {
            countcowguess[guess.charAt(i)-'0']++;
            countsecret[secret.charAt(i)-'0']++;
        }
        for (int i=0;i<countcowguess.length;i++)
        {
            cows=cows+Math.min(countcowguess[i],countsecret[i]);
        }
        cows=cows-bulls;
        ans=String.valueOf(bulls);
        ans=ans+"A"+String.valueOf(cows)+"B";
        return ans;
    }
}
