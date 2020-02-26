package NormalAlgorithm.singleNumber2;

public class Solution {
    public int singleNumber2(int[] nums) {
        int count;
        int ans=0;
        for (int i=0;i<32;i++)
        {
            count=0;
            for (int j=0;j<nums.length;j++)
            {
                if (((nums[j]>>>i)&1)==1)
                {
                    count=count+1;
                }
            }
            if (count%3!=0)
            {
                ans=ans|1<<i;
            }
        }
return ans;
    }
}
