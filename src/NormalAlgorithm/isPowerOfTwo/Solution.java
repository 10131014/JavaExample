package NormalAlgorithm.isPowerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        int a=1;
        for (int i=0;i<31;i++)
        {
            if (n==a)
            {
                return true;
            }
            a<<=1;
        }
        return false;
    }
}
