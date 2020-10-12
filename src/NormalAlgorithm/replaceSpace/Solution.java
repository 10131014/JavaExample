package NormalAlgorithm.replaceSpace;

//剑指Offer 05. 替换空格
public class Solution {
    public String replaceSpace(String s) {
        StringBuilder ans = new StringBuilder();
        char[] s1 = s.toCharArray();
        String replace = "%20";
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != ' ') {
                ans = ans.append(s1[i]);
            } else {
                ans = ans.append(replace);
            }
        }
        return ans.toString();
    }
}
