package NormalAlgorithm.generate;

import java.util.ArrayList;
import java.util.List;

//118. 杨辉三角
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> res=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(numRows==0){
            return ans;
        }
        res.add(1);
        ans.add(new ArrayList<>(res));
        if (numRows<2){
            return ans;
        }
        for (int i=2;i<=numRows;i++){
            List<Integer> res1=new ArrayList<>();
            res1.add(1);
            for (int j=0;j<ans.get(i-2).size()-1;j++){
                res1.add(ans.get(i-2).get(j)+ans.get(i-2).get(j+1));
            }
            res1.add(1);
            ans.add(new ArrayList<>(res1));
        }
        return ans;
    }
}
