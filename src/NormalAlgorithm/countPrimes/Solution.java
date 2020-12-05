package NormalAlgorithm.countPrimes;

import java.util.Arrays;

public class Solution {
    public int countPrimes(int n) {
        int[] isPrimes=new int[n];
        Arrays.fill(isPrimes,1);
        int ans=0;
        for (int i=2;i<n;i++){
            if (isPrimes[i]==1){
                ans++;
                for (int j=i*i;j<n;j=j+i){
                    isPrimes[j]=0;
                }
            }
        }
        return ans;
    }
}
