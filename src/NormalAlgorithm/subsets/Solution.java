package NormalAlgorithm.subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> output=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        backtrace(new ArrayList<Integer>(),0,nums);
        return output;

    }
    public void backtrace(ArrayList<Integer> cur,int i,int[] nums)
    {
        if (i==nums.length)
        {
            output.add(new ArrayList<Integer>(cur));
            return;
        }
        cur.add(nums[i]);
        backtrace(cur,i+1,nums);
        cur.remove(cur.size()-1);
        backtrace(cur,i+1,nums);
    }
}
