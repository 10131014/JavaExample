package NormalAlgorithm.reverseParentheses;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> deque=new Stack<>();
        StringBuilder ans=new StringBuilder();
        char[] s1=s.toCharArray();
        for (int i=0;i<s1.length;i++){
            deque.push(s1[i]);
            if (s1[i]==')'){
                deque.pop();
                while (!deque.isEmpty()&&deque.peek()!='('){
                    ans.append(deque.pop());
                }
                deque.pop();
                for (int j=0;j<ans.length();j++){
                    deque.push(ans.charAt(j));
                }
                int l = ans.length();
                ans.delete(0, l);
            }
        }
        while (!deque.isEmpty()){
            ans.append(deque.pop());
        }
        return ans.reverse().toString();
    }
}
