package NormalAlgorithm.permute;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cur=new ArrayList<>();
        backtrace2(nums,cur);
        return ans;
    }
    public void backtrace2(int[] num,List<Integer>cur)
    {
        if (cur.size()==num.length)
        {
            //路径走到底了，即已经选好了一种排列，将选好的排列加入结果中
            ans.add(new ArrayList<Integer>(cur)) ;
            return;
        }
        for (int i=0;i<num.length;i++)
        {
            //cur中有num[i]元素就重来，判断cur存不存在下一个数组里的元素
            //就是排除不合法的选择
            if (cur.contains(num[i]))
            {
                continue;
            }
            //将元素加入排列中
            //进行选择
            cur.add(num[i]);
            //回溯
            //进入下一层决策
            backtrace2(num,cur);
            //取消选择
            cur.remove(cur.size()-1);
        }
    }
}
