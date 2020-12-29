package GreedyAlgorithm.minPatches;
//330. 按要求补齐数组
//贪心算法
public class Solution {
    public int minPatches(int[] nums, int n) {
        int ans=0;
        //不能用int，用long
        long can_get=0;
        int p=0;
        int l=nums.length;
        while(can_get<n){
            //表示无法覆盖can_get+1到nums[p]-1之间的数字，需要添加数字can_get+1
            //例如：[1,2,5,10]
            //当can_get=3时，此时nums[2]=5，则此时无法覆盖4，需要添加数字4，此时can_get=7
            if(p>=l||can_get+1<nums[p]){
                can_get=can_get+1+can_get;
                ans++;
                //表示可以覆盖can_get+1到nums[p]-1之间的数字，则此时扩展可以覆盖的区域即可
            }else{
                can_get=can_get+nums[p];
                p++;
            }
        }
        return ans;
    }
}
