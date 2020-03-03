package NormalAlgorithm.totalHammingDistance;

public class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        int flag=1;
        int num_length=nums.length;
        for (int i=0;i<32;i++)
        {
            int count1=0;
            for (int j=0;j<num_length;j++)
            {
                if ((nums[j]&flag)!=0)
                {
                    count1++;
                }
            }
            ans=ans+count1*(num_length-count1);
            flag=flag<<1;
        }
        return ans;
    }
}
