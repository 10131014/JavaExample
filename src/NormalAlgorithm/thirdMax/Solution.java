package NormalAlgorithm.thirdMax;

public class Solution {
    public int thirdMax(int[] nums) {
        int first;
        int second;
        int third;
        first=nums[0];
        second=nums[0];
        third=nums[0];
        for (int i=0;i<nums.length;i++)
        {
            if (first<=nums[i])
            {
                first=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++)
        {
            if (second<=nums[i]&&(nums[i]<first)||(second==first))
            {
                second=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++)
        {
            if (third<=nums[i]&&(nums[i]<second)||(third>=second))
            {
                third=nums[i];
            }
        }
        if(third==second)
        {
            return first;
        }
        else
        {
            return third;
        }

    }
}
