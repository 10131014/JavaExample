package NormalAlgorithm.countPrimes;

public class Solution {
    public int countPrimes(int n) {
        int a=0;
        int ans;
        if (n<3)
        {
            ans=0;
            return ans;
        }
        else if (n<4)
        {
            ans=1;
            return ans;
        }
        else {
            for (int i = 3; i < n; i++) {
                for (int j = 2; j<=i; j++) {
                    if(j*j>i)
                    {
                        break;
                    }
                    else{
                        if (i % j == 0) {
                            a = a + 1;
                            break;
                        }
                    }
                }
            }
            ans=n-a-2;
            return ans;
        }
    }
}
