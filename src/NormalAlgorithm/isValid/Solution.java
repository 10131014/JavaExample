package NormalAlgorithm.isValid;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> kuohao=new Stack();
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                kuohao.push(s.charAt(i));
            }
            else
            {
                if (kuohao.empty())
                {
                    return false;
                }
                else if (s.charAt(i)=='('&&kuohao.peek()==')')
                {
                    kuohao.pop();
                }
                else if (s.charAt(i)=='{'&&kuohao.peek()=='}')
                {
                    kuohao.pop();
                }
                else if (s.charAt(i)=='['&&kuohao.peek()==']')
                {
                    kuohao.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if (!kuohao.empty())
        {
            return false;
        }
        return true;
    }
}
