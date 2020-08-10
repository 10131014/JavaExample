package NormalAlgorithm.reformat;

//1417. 重新格式化字符串
public class Solution {
    public String reformat(String s) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                s1 = s1.append(s.charAt(i));
            } else {
                s2 = s2.append(s.charAt(i));
            }
        }
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return "";
        }

        if (s1.length() > s2.length()) {
            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                ans = ans.append(s1.charAt(j));
                ans = ans.append(s2.charAt(j));
            }
            ans = ans.append(s1.charAt(s1.length() - 1));
        } else if (s1.length() < s2.length()) {
            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                ans = ans.append(s2.charAt(j));
                ans = ans.append(s1.charAt(j));
            }
            ans = ans.append(s2.charAt(s2.length() - 1));
        } else {
            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                ans = ans.append(s1.charAt(j));
                ans = ans.append(s2.charAt(j));
            }
        }
        return ans.toString();
    }
}
