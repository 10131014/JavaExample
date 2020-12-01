package NormalAlgorithm.reorganizeString;

//767. 重构字符串
public class Solution {
    public String reorganizeString(String S) {
        if (S.length() < 3) {
            return S;
        }
        int l = S.length();
        char[] s_char = S.toCharArray();
        int[] char_count = new int[26];
        //统计字母出现的次数
        for (int i = 0; i < l; i++) {
            char_count[s_char[i] - 'a']++;
        }
        int most_char = 0;
        int most_char_index = 0;
        //找出现次数最多的字母
        for (int i = 0; i < 26; i++) {
            if (char_count[i] >= most_char) {
                most_char = char_count[i];
                most_char_index = i;
            }
        }
        int else_char = l - most_char;
        //不能重构
        if (most_char > else_char + 1) {
            return "";
        } else {
            //可以重构
            char[] ans = new char[l];
            int p = 0;
            //放一个most字母，放多个else字母
            //使其达到可以直接放的条件
            while (most_char != else_char && most_char != else_char + 1) {
                ans[p] = (char) ('a' + most_char_index);
                p++;
                most_char--;
                for (int i = 0; i < 26; i++) {
                    if (char_count[i] > 0 && i != most_char_index) {
                        ans[p] = (char) ('a' + i);
                        p++;
                        else_char--;
                        char_count[i]--;
                    }
                    if (else_char == most_char || else_char == most_char) {
                        break;
                    }
                }
                if (else_char == most_char || else_char == most_char) {
                    break;
                }
            }
            //达到可以直接放的条件
            //一个most，一个else字母
            if (most_char == else_char || most_char == else_char + 1) {
                while (most_char > 0 && else_char > 0) {
                    for (int j = 0; j < 26; j++) {
                        if (char_count[j] > 0 && j != most_char_index) {
                            ans[p] = (char) ('a' + most_char_index);
                            p++;
                            ans[p] = (char) ('a' + j);
                            p++;
                            char_count[j]--;
                            most_char--;
                            else_char--;
                        }
                    }
                }
                //剩下最后一个most字母
                if (most_char != 0) {
                    ans[p] = (char) ('a' + most_char_index);
                }
            }
            return String.valueOf(ans);
        }
    }
}
