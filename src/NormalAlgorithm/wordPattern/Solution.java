package NormalAlgorithm.wordPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        List<String> s=new ArrayList<>();
        char[] s1=str.toCharArray();
        char[] pattern1=pattern.toCharArray();
        int start=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]==' '){
                s.add(str.substring(start,i));
                start=i+1;
            }
        }
        s.add(str.substring(start,s1.length));
        if (s.size()!=pattern1.length){
            return false;
        }
        Map<Character,String> map=new HashMap<>();
        for(int j=0;j<pattern1.length;j++){
            if(!map.containsKey(pattern1[j])){
                if (map.containsValue(s.get(j))){
                    return false;
                }
                map.put(pattern1[j],s.get(j));
            }else if(map.get(pattern1[j]).equals(s.get(j))){
                continue;
            }else if(!map.get(pattern1[j]).equals(s.get(j))){
                return false;
            }
        }
        return true;
    }
}
