package NormalAlgorithm.removeDuplicateLetters;

import java.util.ArrayDeque;
import java.util.Deque;

//316. 去除重复字母
public class Solution {
    public String removeDuplicateLetters(String s) {
        char[] s1 = s.toCharArray();
        int[] last = new int[26];
        //记录每个字母最后出现的位置
        for (int i = 0; i < s.length(); i++) {
            last[s1[i] - 'a'] = i;
        }
        Deque<Character> stack = new ArrayDeque<>();
        //记录栈里是否存在这个字母
        boolean[] if_exit = new boolean[26];
        for (int j = 0; j < s.length(); j++) {
            //栈里存在当前字母，直接跳过
            if (if_exit[s1[j] - 'a']) {
                continue;
            }
            //栈非空，栈顶字母大于当前字母，并且栈顶字母后面还会出现
            while (!stack.isEmpty() && stack.peekLast() > s1[j] && last[stack.peekLast() - 'a'] > j) {
                //将栈顶字母弹出
                Character c1 = stack.removeLast();
                //此时栈里没有这个字母了，置为false
                if_exit[c1 - 'a'] = false;
            }
            //将当前字母入栈
            stack.addLast(s1[j]);
            //此时栈里有当前字母了，置为true
            if_exit[s1[j] - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (Character c : stack) {
            ans = ans.append(c);
        }
        return ans.toString();
    }
}
