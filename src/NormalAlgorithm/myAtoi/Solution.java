package NormalAlgorithm.myAtoi;
//8. 字符串转换整数
import java.util.EventListener;
import java.util.Stack;

public class Solution {
    public int myAtoi(String s) {
        //去掉前置空格
        String s1 = s.trim();
        //放符号
        Stack<Character> sym_stack = new Stack<>();
        //放数字
        Stack<Character> num_stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < s1.length(); i++) {
            //去第一个符号，后续的不取
            if (flag && (s1.charAt(i) == '-' || s1.charAt(i) == '+')) {
                sym_stack.push(s1.charAt(0));
                flag = false;
            } else if (!Character.isDigit(s1.charAt(i))) {
                break;
            } else {
                flag = false;
                //取数字
                num_stack.push(s1.charAt(i));
            }
        }
        long ans = 0;
        long mul = 1;
        int weishu=0;
        if (!sym_stack.isEmpty() && sym_stack.pop() == '-') {
            while (!num_stack.isEmpty()) {
                //处理边界条件，大小用位数表示比较好
                if (num_stack.peek() != '0' && weishu>10) {
                    ans = Integer.MIN_VALUE;
                    break;
                }
                ans = ans - (num_stack.pop() - '0') * mul;
                mul = mul * 10;
                weishu++;
                if (ans < Integer.MIN_VALUE) {
                    ans = Integer.MIN_VALUE;
                    break;
                }
            }
        } else {
            while (!num_stack.isEmpty()) {
                if (num_stack.peek() != '0' && weishu>10) {
                    ans = Integer.MAX_VALUE;
                    break;
                }
                ans = ans + (num_stack.pop() - '0') * mul;
                mul = mul * 10;
                weishu++;
                if (ans > Integer.MAX_VALUE) {
                    ans = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return (int) ans;
    }
}
