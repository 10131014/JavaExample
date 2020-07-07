package NormalAlgorithm.addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        String ans = new String();
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        char c = '0';
        //以下为补0操作
        if (a.length() > b.length()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                s1 = s1.append("0");
            }
            s1.append(b);
            s2.append(a);
        } else if (a.length() < b.length()) {
            for (int i = 0; i < b.length() - a.length(); i++) {
                s1 = s1.append("0");
            }
            s1.append(a);
            s2.append(b);
        } else if (a.length() == b.length()) {
            s1.append(b);
            s2.append(a);
        }
        //二进制运算，考虑000,001,010,011,100,101,110,111这8种情况即可
        for (int j = s2.length() - 1; j >= 0; j--) {
            if (s2.charAt(j) == '0' && s1.charAt(j) == '0' && c == '0') {
                ans = "0" + ans;
                c = '0';
            } else if ((s2.charAt(j) == '1' && s1.charAt(j) == '0' && c == '0') || (s2.charAt(j) == '0' && s1.charAt(j) == '1' && c == '0') || (s2.charAt(j) == '0' && s1.charAt(j) == '0' && c == '1')) {
                ans = "1" + ans;
                c = '0';
            } else if (s2.charAt(j) == '1' && s1.charAt(j) == '1' && c == '0' || (s2.charAt(j) == '0' && s1.charAt(j) == '1' && c == '1') || (s2.charAt(j) == '1' && s1.charAt(j) == '0' && c == '1')) {
                ans = "0" + ans;
                c = '1';
            } else if (s2.charAt(j) == '1' && s1.charAt(j) == '1' && c == '1') {
                ans = "1" + ans;
                c = '1';
            }
        }
        //最后进位为1的话要加一位1
        if (c == '1') {
            ans = "1" + ans;
        }
        return ans;
    }
}
