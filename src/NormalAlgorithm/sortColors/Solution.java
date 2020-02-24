package NormalAlgorithm.sortColors;

public class Solution {
    public void sortColors(int[] nums) {
        int p0=0;
        int p2=nums.length-1;
        int cur=0;
        int exchang;
        while (cur<=p2)
        {
            if (nums[cur]==2)
            {
                exchang=nums[p2];
                nums[p2]=nums[cur];
                nums[cur]=exchang;
                p2--;
            }
            else if (nums[cur]==0)
            {
                exchang=nums[p0];
                nums[p0]=nums[cur];
                nums[cur]=exchang;
                cur++;
                p0++;
            }
            else
            {
                cur++;
            }
        }
    }
}
