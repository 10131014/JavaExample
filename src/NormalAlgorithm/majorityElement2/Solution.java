package NormalAlgorithm.majorityElement2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement2(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        if(nums.length==0)
        {
            return ans;
        }
        if(nums.length==1)
        {
            ans.add(nums[0]);
            return ans;
        }
        int candidate1=nums[0];
        int candidate2=nums[0];
        int count1=0;
        int count2=0;
        for (int i=0;i<nums.length;i++)
        {
            if (candidate1==nums[i])
            {
                count1++;
            }
            else if (candidate2==nums[i])
            {
                count2++;
            }
            else if (candidate1!=nums[i]&&candidate2!=nums[i])
            {
                if (count1==0)
                {
                    candidate1=nums[i];
                    count1++;
                }
                else if (count2==0)
                {
                    candidate2=nums[i];
                    count2++;
                }
                else
                {
                    count1--;
                    count2--;
                }
            }
        }
        count1=0;
        count2=0;
        for (int i=0;i<nums.length;i++)
        {
            if (candidate1==nums[i])
            {
                count1++;
            }
            else if (candidate2==nums[i])
            {
                count2++;
            }
        }
        if (count1>nums.length/3)
        {
            ans.add(candidate1);
        }
        if (count2>nums.length/3)
        {
            ans.add(candidate2);
        }
        return ans;
    }
}
