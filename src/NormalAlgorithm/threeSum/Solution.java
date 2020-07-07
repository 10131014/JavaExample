package NormalAlgorithm.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        //数组长度小于3则返回NULL
        if (nums.length<3)
        {
            return ans;
        }
        //先排序
        Arrays.sort(nums);
        int left;
        int right;
        int L = nums.length;
        for (int i = 0; i < L-2 ; i++) {
            //因为是排好序了，所以如果最左边的数大于0则肯定不存在等于0的三数之和
            if (nums[i]>0)
            {
                break;
            }
            //去重操作
            if(i>0&&(nums[i]==nums[i-1]))
            {
                continue;
            }
            left = i + 1;
            right=L-1;
            while (left<right)
            {
                if((nums[i]+nums[left]+nums[right])==0)
                {
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //去重
                    while (left<right&&(nums[left]==nums[left+1]))
                    {
                        left=left+1;
                    }
                    //去重
                    while(left<right&&(nums[right]==nums[right-1]))
                    {
                        right=right-1;
                    }
                    left=left+1;
                    right=right-1;
                }
                //如果sum大于0，说明右边的数太大，将右边的数左移
                else if ((nums[i]+nums[left]+nums[right])>0)
                {
                    right--;
                }
                //如果sum小于0，说明左边数太小，将左边的数右移
                else if ((nums[i]+nums[left]+nums[right])<0)
                {
                    left++;
                }
            }
        }
        return ans;
    }
}
