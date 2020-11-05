package BackTrackingAlgorithm.permuteUnique;
//47. 全排列II
//回溯算法
//可以不用idx，改成cur.remove(cur.size()-1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        //记录nums中的元素是否使用过
        boolean[] if_vis = new boolean[nums.length];
        backtracking47(nums, new ArrayList<>(), if_vis, 0);
        return ans;
    }

    public void backtracking47(int[] nums, List<Integer> cur, boolean[] if_vis, int idx) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //去重操作
            //if_vis[i]==true说明这个数已经用过了，如果只有这个那么就是全排列I了
            //后面那部分表示在取第i个数时，如果第i-1个数已经取了与这个数相等的数字，则不能取这个数了
            //例如：[1,1,2]第一次第一个数取了1，第二个取了1，那么在第二次第一个取了1后，第二个则不能取1了，只能取2
            if (if_vis[i]==true||i > 0 && nums[i - 1] == nums[i] && if_vis[i-1] == false) {
                continue;
            }
            cur.add(nums[i]);
            if_vis[i]=true;
            backtracking47(nums, cur, if_vis, idx + 1);
            if_vis[i] = false;
            cur.remove(idx);
        }
    }
}
