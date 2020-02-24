package NormalAlgorithm.moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int exnum;
        int i=0;
        int j=1;
        while (j<nums.length)
        {
            if (nums[i]==0&&nums[j]!=0)
            {
                exnum=nums[j];
                nums[j]=nums[i];
                nums[i]=exnum;
                i++;
                j++;
            }
            else if(nums[i]!=0)
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
    }
}
