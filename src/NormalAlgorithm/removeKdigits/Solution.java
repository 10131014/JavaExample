package NormalAlgorithm.removeKdigits;

//402. 移掉K位数字
public class Solution {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }
        StringBuilder s1 = new StringBuilder();
        s1.append(num);
        int p = 0;
        while (p < s1.length() - 1 && k > 0) {
            //如果当前数字比后一个大，则删除当前这个数字
            if (s1.charAt(p) > s1.charAt(p + 1)) {
                s1.deleteCharAt(p);
                k--;
                //这里要往前移一步，例如14443
                if (p > 0) {
                    p--;
                }
                continue;
            }
            p++;
        }
        //数字已经是递增状态，但没有删除完，故删掉最大的
        while (k > 0) {
            s1.deleteCharAt(s1.length() - 1);
            k--;
        }
        //删去前面的0
        while (s1.length() > 0 && s1.charAt(0) == '0') {
            s1.deleteCharAt(0);
        }
        if (s1.length() > 0) {
            return s1.toString();
        } else {
            return "0";
        }
    }
}
