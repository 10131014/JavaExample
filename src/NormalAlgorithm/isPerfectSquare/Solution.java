package NormalAlgorithm.isPerfectSquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num<2)
        {
            return true;
        }
        else
        {
            long a=2;
            long b=num/2;
            long gauss_num;

            while (a<=b)
            {
                long x=(a+b)/2;
                gauss_num=x*x;
                if (gauss_num==num)
                {
                    return true;
                }
                else if (gauss_num>num)
                {
                    b=x-1;
                }
                else
                {
                    a=x+1;
                }
            }
            return false;
        }
    }
}
