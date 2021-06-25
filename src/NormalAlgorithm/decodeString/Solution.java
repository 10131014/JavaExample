package NormalAlgorithm.decodeString;

import java.util.Stack;

//394. 字符串解码
//栈
public class Solution {
    public String decodeString(String s) {
        //子串栈，用来保存某一数字下的子串
        //例如3[ad[2[bc]]，数字2下的子串为bc，此时存的bc，3对应的是ad，但是最后要拼上后面的
        Stack<Integer> num_stack=new Stack<>();
        //数字栈，保存要复制的个数
        Stack<StringBuilder> sb_stack=new Stack<>();
        StringBuilder ans=new StringBuilder();
        int num=0;
        for (char c:s.toCharArray()){
            if (Character.isDigit(c)){
                //这里一定要写成这样，因为数字100在字符串里占三个字符，要将整体转换成数字
                num=num*10+c-'0';
            }else if (c=='['){
                //添加进子串栈
                sb_stack.push(ans);
                //添加进数字栈
                num_stack.push(num);
                //新建一个SB来保存新的子串
                ans=new StringBuilder();
                num=0;
            }else if (Character.isLetter(c)){
                ans.append(c);
            }else {
                StringBuilder temp_ans=new StringBuilder();
                //注意temp是之前的子串，当前的子串应该拼接在temp之后
                temp_ans=sb_stack.pop();
                int l=num_stack.pop();
                for (int i=0;i<l;i++){
                    temp_ans.append(ans);
                }
                ans=temp_ans;
            }
        }
        return ans.toString();
    }
}
