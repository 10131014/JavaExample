package BackTrackingAlgorithm.solveNQueens;
//51. N皇后
//回溯算法

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        Set<Integer> containline = new HashSet<>();
        Set<Integer> lfetup_rightdown = new HashSet<>();
        Set<Integer> rightup_leftdown = new HashSet<>();
        List<String> res = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        backtrackingQ1(n, 0, containline, lfetup_rightdown, rightup_leftdown, res, ans);
        return ans;
    }

    public void backtrackingQ1(int n, int row, Set<Integer> containline, Set<Integer> leftup_rightdown, Set<Integer> rightup_leftdown, List<String> res, List<List<String>> ans) {
        if (row == n) {
            ans.add(new ArrayList<>(res));
        }
        for (int i = 0; i < n; i++) {
            int line = i;
            if (containline.contains(line)) {
                continue;
            }
            int xiexian1 = row - i;
            if (leftup_rightdown.contains(xiexian1)) {
                continue;
            }
            int xiexian2 = row + i;
            if (rightup_leftdown.contains(xiexian2)) {
                continue;
            }
            res.add(new String(build_string(n, i)));
            containline.add(line);
            leftup_rightdown.add(xiexian1);
            rightup_leftdown.add(xiexian2);
            backtrackingQ1(n, row + 1, containline, leftup_rightdown, rightup_leftdown, res, ans);
            res.remove(res.size() - 1);
            containline.remove(line);
            leftup_rightdown.remove(xiexian1);
            rightup_leftdown.remove(xiexian2);
        }
    }

    public String build_string(int n, int line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(".");
        }
        stringBuilder.setCharAt(line, 'Q');
        return stringBuilder.toString();
    }
}
