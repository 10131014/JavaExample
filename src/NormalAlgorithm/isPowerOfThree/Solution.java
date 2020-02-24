package NormalAlgorithm.isPowerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        int a=1;
        for (int i=0;i<25;i++)
        {
            if (n==a)
            {
                return true;
            }
            a=(a<<1)+a;
        }
        return false;
    }
}
