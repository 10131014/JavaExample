package NormalAlgorithm.topKFrequent;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> nummap=new HashMap();
        int[] ans=new int[k];
        for (int i=0;i<nums.length;i++)
        {
            nummap.put(nums[i],nummap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return nummap.get(a) - nummap.get(b);
            }
        });
        for (Integer n:nummap.keySet())
        {
            if (pq.size()<k)
            {
                pq.add(n);
            }
            else
            {
                if (nummap.get(n)>nummap.get(pq.peek()))
                {
                    pq.remove();
                    pq.add(n);
                }
            }
        }
        for (int i=0;i<k;i++)
        {
            ans[i]=pq.peek();
            pq.remove();
        }
        return ans;
    }
}
