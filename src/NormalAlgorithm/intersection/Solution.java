package NormalAlgorithm.intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet nums3=new HashSet<>();
        HashSet nums4=new HashSet<>();
        for (int i=0;i<nums1.length;i++)
        {
            if (nums3.contains(nums1[i]))
            {
                continue;
            }
            else
            {
                nums3.add(nums1[i]);
            }
        }
        for (int j=0;j<nums2.length;j++)
        {
            if (nums4.contains(nums2[j]))
            {
                continue;
            }
            else
            {
                nums4.add(nums2[j]);
            }
        }
        if (nums3.size()>nums4.size())
        {
            List<Integer> list=new ArrayList<>(nums4);
            int k=0;
            for (int i=0;i<nums4.size();i++)
            {
                if (nums3.contains(list.get(k)))
                {
                    k=k+1;
                    continue;
                }
                else
                {
                    list.remove(k);
                }
            }
            int[] ans=new int[list.size()];
            for (int i=0;i<ans.length;i++)
            {
                ans[i]=list.get(i);
            }
            return ans;

        }
        else
        {
            List<Integer> list=new ArrayList<>(nums3);
            int k=0;
            for (int i=0;i<nums3.size();i++)
            {
                if (nums4.contains(list.get(k)))
                {
                    k=k+1;
                    continue;
                }
                else
                {
                    list.remove(k);
                }
            }
            int[] ans=new int[list.size()];
            for (int i=0;i<ans.length;i++)
            {
                ans[i]=list.get(i);
            }
            return ans;
        }
    }
}
