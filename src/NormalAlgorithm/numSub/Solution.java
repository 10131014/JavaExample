package NormalAlgorithm.numSub;

//1513. 仅含1的子串数
public class Solution {
    public int numSub(String s) {
        long ans = 0;
        long countone = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countone++;
            } else if (s.charAt(i) == '0') {
                ans = (ans + countone * (countone + 1) / 2) % (1_000_000_007);
                countone = 0;
            }
        }
        if (s.charAt(s.length() - 1) == '1') {
            ans = (ans + countone * (countone + 1) / 2) % (1_000_000_007);
        }
        return (int) ans;
    }
}
