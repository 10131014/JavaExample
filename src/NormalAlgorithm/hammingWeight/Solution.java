package NormalAlgorithm.hammingWeight;

public class Solution {
    public int hammingWeight(int n) {
        int ans=0;
        int flag=1;
        for (int i=0;i<32;i++)
        {
            if ((n&flag)!=0)
            {
                ans=ans+1;
            }
            flag<<=1;
        }
        return  ans;
    }
}
