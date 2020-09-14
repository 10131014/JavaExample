package NormalAlgorithm.isNumber;

//剑指Offer 20. 表示数值的字符串
public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean numflag = false;
        boolean dotflag = false;
        boolean eflag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                numflag = true;
            } else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && numflag && !eflag) {
                eflag = true;
                numflag = false;
            } else if ((i == 0 || !eflag && !dotflag) && s.charAt(i) == '.') {
                dotflag = true;

            } else if ((i == 0 || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E') && (s.charAt(i) == '-' || s.charAt(i) == '+')) {

            } else {
                return false;
            }
        }
        return numflag;
    }
}
