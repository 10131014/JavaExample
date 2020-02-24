package NormalAlgorithm.trailingZeroes;

class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
        int flag=5;
        ans=n/flag;
        n=n/flag;
        while(n>0)
        {
            ans=ans+n/flag;
            n=n/flag;
        }
        return ans;
    }
}
