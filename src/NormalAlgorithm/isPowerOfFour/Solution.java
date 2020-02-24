package NormalAlgorithm.isPowerOfFour;

public class Solution {
    public boolean isPowerOfFour(int num) {
        int a=1;
        for (int i=0;i<16;i++)
        {
            if (num==a)
            {
                return true;
            }
            a<<=2;
        }
        return false;

    }
}
