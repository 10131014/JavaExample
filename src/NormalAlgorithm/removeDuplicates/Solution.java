package NormalAlgorithm.removeDuplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {

        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums.length-2;j++)
            {
                if (nums[j+1]==nums[j])
                {
                    nums[j+1]=nums[j+2];
                }
            }
        }
        int flag=1;
        for (int k=0;k<nums.length-1;k++)
        {
            if (nums[k]!=nums[k+1])
            {
                flag=flag+1;
            }
            else
            {
                return flag;
            }
        }
        return nums.length;
    }
}
