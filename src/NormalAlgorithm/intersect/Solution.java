package NormalAlgorithm.intersect;

import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[Math.min(nums1.length,nums2.length)];
        while (i<nums1.length&&j<nums2.length)
        {
            if (nums1[i]==nums2[j])
            {
                ans[k]=nums1[i];
                k=k+1;
                i=i+1;
                j=j+1;
            }
            else if (nums1[i]>nums2[j])
            {
                j=j+1;
            }
            else
            {
                i=i+1;
            }
        }
        int[] ans1=new int[k];
        for (i=0;i<ans1.length;i++)
        {
            ans1[i]=ans[i];
        }
        return ans1;
    }
}
