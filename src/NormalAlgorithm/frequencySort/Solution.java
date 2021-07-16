package NormalAlgorithm.frequencySort;

import java.util.*;

//451. 根据字符出现频率排序
public class Solution {
    public String frequencySort(String s) {
        char[] s1=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        int l=s.length();
        for (int i=0;i<l;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        List<Character> list=new ArrayList<Character>(map.keySet());
        //重点记住这里，重写排序
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        StringBuilder ans=new StringBuilder();
        for (int i=0;i<list.size();i++){
            for (int j=0;j<map.get(list.get(i));j++){
                ans.append(list.get(i));
            }
        }
        return ans.toString();
    }
}
