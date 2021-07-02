package NormalAlgorithm.maxAlternatingSum;
//1911. 最大子序列交替和
import java.util.ArrayList;
import java.util.List;

class Solution {
    //找波峰波谷，如果最后一个数是波谷，则不添加，如果是波峰则添加
    public long maxAlternatingSum(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int l=nums.length;
        int i=0;
        while(i<l-1){
            while(i<l-1){
                //找波峰
                if(nums[i]>nums[i+1]){
                    res.add(nums[i]);
                    break;
                }else{
                    i++;
                }
            }
            while(i<l-1){
                //找波谷
                if(nums[i]<nums[i+1]){
                    res.add(nums[i]);
                    break;
                }else{
                    i++;
                }
            }
        }
        //如果最后一个数是波峰，则添加
        //且考虑特殊情况，长度为1
        if(l>1&&nums[l-2]<nums[l-1]){
            res.add(nums[l-1]);
        }

        long ans=0;
        for(int j=0;j<res.size()-1;j+=2){
            ans=res.get(j)-res.get(j+1)+ans;
        }
        //全等情况下是没有数添加进去的，所以返回最后一个数字
        return res.size()==0?ans+nums[l-1]:ans+res.get(res.size()-1);
    }
}
