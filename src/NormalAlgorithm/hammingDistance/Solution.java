package NormalAlgorithm.hammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int distance;
        distance=x^y;
        int ans=0;
        int flag=1;
        for (int i=0;i<32;i++)
        {
            if ((distance&flag)!=0)
            {
                ans=ans+1;
            }
            flag=flag<<1;
        }
        return ans;
    }
}
