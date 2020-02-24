package NormalAlgorithm.nextGreaterElement;

import java.util.HashMap;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        if(nums2.length==0)
        {
            return nums2;
        }
        for (int i=0;i<nums2.length-1;i++)
        {
            for (int j=i+1;j<nums2.length;j++)
            {
                if (nums2[j]>nums2[i])
                {
                    hashMap.put(nums2[i],nums2[j]);
                    break;
                }
                else if (j==(nums2.length-1)&&nums2[j]<=nums2[i])
                {
                    hashMap.put(nums2[i],-1);
                }
                else
                {
                    continue;
                }
            }
        }
        hashMap.put(nums2[nums2.length-1],-1);
        int[] ans=new int[nums1.length];
        for (int k=0;k<nums1.length;k++)
        {
            ans[k]=hashMap.get(nums1[k]);
        }
        return ans;
    }
}
