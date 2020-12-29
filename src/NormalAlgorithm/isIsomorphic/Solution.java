package NormalAlgorithm.isIsomorphic;

import java.util.HashMap;
import java.util.Map;

//205. 同构字符串
//双哈希映射
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()<1) return true;
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Map<Character,Character> map=new HashMap<>();
        Map<Character,Character> map1=new HashMap<>();
        for (int i=0;i<s1.length;i++){
            if (map.containsKey(s1[i])){
                if (map.get(s1[i])!=t1[i]) return false;
            }
            if (map1.containsKey(t1[i])){
                if (map1.get(t1[i])!=s1[i]) return false;
            }
            map.put(s1[i],t1[i]);
            map1.put(t1[i],s1[i]);
        }
        if (map.get(s1[s1.length-1])!=t1[t1.length-1]) return false;
        if (map1.get(t1[s1.length-1])!=s1[t1.length-1]) return false;
        return true;
    }
}
