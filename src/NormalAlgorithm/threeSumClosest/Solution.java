package NormalAlgorithm.threeSumClosest;

import java.util.Arrays;

//16.最接近的三数之和
//双指针
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l=nums.length;
        if (l==3){
            return nums[0]+nums[1]+nums[2];
        }
        int ans=0;
        int most_cloest=Integer.MAX_VALUE;
        int left;
        int right;
        for (int i=0;i<l-2;i++){
            left=i+1;
            right=l-1;
            while (left<right){
                int temp=nums[i]+nums[left]+nums[right];
                if (most_cloest>=Math.abs(target-temp)){
                    ans=temp;
                    most_cloest=Math.abs(target-ans);
                }
                if (temp==target){
                    return temp;
                }else if (temp>target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return ans;
    }
}
