package NormalAlgorithm.backspaceCompare;

import java.util.Stack;

//844. 比较含退格字符的字符串
public class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                s1.push(S.charAt(i));
            } else if (!s1.isEmpty()) {
                s1.pop();
            }
        }
        Stack<Character> t1 = new Stack();
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                t1.push(T.charAt(i));
            } else if (!t1.isEmpty()) {
                t1.pop();
            }
        }
        while (!s1.isEmpty() && !t1.isEmpty()) {
            if (s1.pop() != t1.pop()) {
                return false;
            }
        }
        if (!s1.isEmpty()&&t1.isEmpty() || !t1.isEmpty()&&s1
                .isEmpty()) {
            return false;
        }
        return true;
    }
}
