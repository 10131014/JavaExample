package GreedyAlgorithm.predictPartyVictory;
//649. Dota2参议院
//贪心算法
public class Solution {
    public String predictPartyVictory(String senate) {
        char[] s=senate.toCharArray();
        int[] count=new int[15];
        for (int i=0;i<s.length;i++){
            count[s[i]-'D']++;
        }
        int ban_R=0;
        int ban_D=0;
        while (count[0]>0&&count[14]>0) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] == 'D' && ban_D <= 0) {
                    ban_R++;
                    count[14]--;
                } else if (s[j] == 'D' && ban_D > 0) {
                    ban_D--;
                    s[j] = '0';
                    continue;
                } else if (s[j] == 'R' && ban_R <= 0) {
                    ban_D++;
                    count[0]--;
                } else if (s[j] == 'R' && ban_R > 0) {
                    ban_R--;
                    s[j] = '0';
                    continue;
                }
            }
        }
        if (count[14] <=0) {
            return "Dire";
        } else  {
            return "Radiant";
        }
    }
}
