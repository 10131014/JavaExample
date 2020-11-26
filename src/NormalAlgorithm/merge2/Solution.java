package NormalAlgorithm.merge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//56. 合并区间
public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return Integer.compare(o1[0], o2[0]);
                } else {
                    return Integer.compare(o1[1], o2[1]);
                }
            }
        });
        int[] interval = new int[2];
        List<int[]> ans = new ArrayList<>();
        interval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (interval[1] >= intervals[i][0]) {
                interval[0] = Math.min(interval[0], intervals[i][0]);
                interval[1] = Math.max(interval[1], intervals[i][1]);
            } else {
                ans.add(interval);
                interval = intervals[i];
            }
        }
        if (interval != intervals[intervals.length - 1]) {
            ans.add(interval);
        } else {
            ans.add(intervals[intervals.length - 1]);
        }
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
