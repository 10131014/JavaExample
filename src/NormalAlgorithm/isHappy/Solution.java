package NormalAlgorithm.isHappy;

public class Solution {
    public boolean isHappy(int n)
    {
        int a;
        int b;
        int count=0;
        while (n!=1) {
            b=0;
            while (n!= 0) {
                a = n % 10;
                n = n / 10;
                b = b + a * a;
            }
            n = b;
            count=count+1;
            if(count>10)
            {
                return false;
            }
        }
        return true;
    }
}
