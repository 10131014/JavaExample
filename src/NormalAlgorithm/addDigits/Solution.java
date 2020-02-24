package NormalAlgorithm.addDigits;

public class Solution {
    public int addDigits(int num) {
        int ans;
        ans=num;
        while (num>=10)
        {
            ans=0;
            while (num>0)
            {
                ans=num%10+ans;
                num=num/10;
            }
            num=ans;
        }
        return ans;
    }
}
