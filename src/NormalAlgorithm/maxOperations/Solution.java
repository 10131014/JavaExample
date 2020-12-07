package NormalAlgorithm.maxOperations;

import java.util.Arrays;
//1679. K和数对的最大数目
//排序+双指针
public class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int ans=0;
        while(left<right){
            if(nums[left]+nums[right]==k){
                ans++;
                left++;
                right--;
            }else if(nums[left]+nums[right]<k){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
