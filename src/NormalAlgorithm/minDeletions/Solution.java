package NormalAlgorithm.minDeletions;

import java.util.Arrays;

//5562. 字符频次唯一的最小删除次数
public class Solution {
    public int minDeletions(String s) {
        int[] count_zifu = new int[26];
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            //统计每个字符出现的次数
            count_zifu[s1[i] - 'a']++;
        }
        //排序
        Arrays.sort(count_zifu);
        int ans = 0;
        int p = 25;
        while (p > 0) {
            //当前字符出现的次数跟前一个一样，前提是不能为0
            if (count_zifu[p] == count_zifu[p - 1]&&count_zifu[p]!=0) {
                ans++;
                //则将前一个字符的频次减1
                count_zifu[p - 1]--;
                //指针前移
                p--;
            //前一个字符的频次高于当前字符的频次
            } else if (count_zifu[p] < count_zifu[p - 1]) {
                //则将前一个字符的频次减1，一直减到与当前字符频次相等
                //注意指针不动
                count_zifu[p - 1]--;
                ans++;
            //其他情况指针右移
            } else {
                p--;
            }
        }
        return ans;
    }
}
