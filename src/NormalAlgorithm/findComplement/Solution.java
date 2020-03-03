package NormalAlgorithm.findComplement;

public class Solution {
    public int findComplement(int num) {
        long a=0;
        long b=1;
        while (num>=b)
        {
            a=a|b;
            b=b<<1;
        }
        num=(int)a-num;
        return num;
    }
}
