package NormalAlgorithm.removeOccurrences;

import java.util.ArrayList;
import java.util.List;
//1910. 删除一个字符串中所有出现的给定子串
public class Solution {
    public String removeOccurrences(String s, String part) {
        int l=part.length();
        List<String> list=new ArrayList<>();
        StringBuilder str1=new StringBuilder(s);
        StringBuilder str2=new StringBuilder(part);
        String part1=str2.reverse().toString();
        list.add(str1.reverse().toString());
        int i=0;
        while (list.get(i).contains(part1)){
            int index=list.get(i).lastIndexOf(part1);
            int l1=list.get(i).length();
            list.add(list.get(i).substring(0,index)+list.get(i).substring(index+l,l1));
            i++;
        }
        StringBuilder ans=new StringBuilder(list.get(i));
        return ans.reverse().toString();
    }
}
