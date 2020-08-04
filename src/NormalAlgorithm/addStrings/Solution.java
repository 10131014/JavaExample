package NormalAlgorithm.addStrings;
//415. 字符串相加
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < Math.abs(num1.length() - num2.length()); i++) {
            s1 = s1.append('0');
        }
        if (num1.length() > num2.length()) {
            s1 = s1.append(num2);
            s2 = s2.append(num1);
        } else {
            s1 = s1.append(num1);
            s2 = s2.append(num2);
        }
        int c = 0;
        for (int j = s2.length() - 1; j >= 0; j--) {
            ans = ans.append((s1.charAt(j) - '0' + s2.charAt(j) - '0' + c) % 10);
            c = (s1.charAt(j) - '0' + s2.charAt(j) - '0' + c) / 10;
        }
        if (c == 1) {
            ans = ans.append('1');
        }
        return ans.reverse().toString();
    }
}
