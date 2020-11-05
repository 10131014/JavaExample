package DynamicProgrammingAlgorithm.wordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//139. 单词拆分
//动态规划
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> word_set = new HashSet<>();
        for (int l = 0; l < wordDict.size(); l++) {
            word_set.add(wordDict.get(l));
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length()+1; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] == true) {
                    if (word_set.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
}
