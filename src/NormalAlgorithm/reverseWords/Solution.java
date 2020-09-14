package NormalAlgorithm.reverseWords;

import java.util.ArrayList;
import java.util.List;

//151. 反转字符串里的单词
public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int flag = 0;
        List<List> Allword = new ArrayList<>();
        List<Character> word = new ArrayList();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.add(s.charAt(i));
                flag = 0;
            } else if (s.charAt(i) == ' ') {
                if (flag == 1) {
                    continue;
                }
                flag = 1;
                List word1 = new ArrayList();
                word1.addAll(word);
                Allword.add(word1);
                while (word.size() > 0) {
                    word.remove(0);
                }
            }
        }
        Allword.add(word);
        for (int i = Allword.size() - 1; i >= 0; i--) {
            for (int j = 0; j < Allword.get(i).size(); j++) {
                ans = ans.append(Allword.get(i).get(j));
            }
            ans = ans.append(' ');
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}
