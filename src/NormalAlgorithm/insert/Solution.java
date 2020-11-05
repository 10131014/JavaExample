package NormalAlgorithm.insert;

import java.util.ArrayList;
import java.util.List;

//57. 插入区间
public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int[] a = new int[2];
        if (intervals.length==0)
        {
            int[][] res=new int[1][2];
            res[0]=newInterval;
            return res;
        }
        if (newInterval[1] < intervals[0][0]) {
            ans.add(newInterval);
            return buildans(ans, -1, intervals);
        }
        if (newInterval[0] > intervals[intervals.length - 1][1]) {
            for (int i = 0; i < intervals.length; i++) {
                ans.add(intervals[i]);
            }
            ans.add(newInterval);
            int[][] res = new int[ans.size()][2];
            for (int i = 0; i < res.length; i++) {
                res[i] = ans.get(i);
            }
            return res;
        }
        int p = 0;
        if (newInterval[0]<intervals[0][0])
        {
            int q=p;
            while (q < intervals.length) {
                if (newInterval[1] <= intervals[q][1] && newInterval[1] >= intervals[q][0]) {
                    a[0] = newInterval[0];
                    a[1] = intervals[q][1];
                    ans.add(a);
                    return buildans(ans, q, intervals);
                } else if (q < intervals.length - 1 && newInterval[1] < intervals[q + 1][0]) {
                    a[0] = newInterval[0];
                    a[1] = newInterval[1];
                    ans.add(a);
                    return buildans(ans, q, intervals);
                }
                q++;
            }
        }
        while (p < intervals.length) {
            if (newInterval[0] <= intervals[p][1] && newInterval[0] >= intervals[p][0]) {
                int q = p;
                if (newInterval[1] >= intervals[intervals.length - 1][1]) {
                    a[0] = intervals[p][0];
                    a[1] = newInterval[1];
                    ans.add(a);
                    return buildans(ans, intervals.length, intervals);
                }
                while (q < intervals.length) {
                    if (newInterval[1] <= intervals[q][1] && newInterval[1] >= intervals[q][0]) {
                        a[0] = intervals[p][0];
                        a[1] = intervals[q][1];
                        ans.add(a);
                        return buildans(ans, q, intervals);
                    } else if (q < intervals.length - 1 && newInterval[1] < intervals[q + 1][0]) {
                        a[0] = intervals[p][0];
                        a[1] = newInterval[1];
                        ans.add(a);
                        return buildans(ans, q, intervals);
                    }
                    q++;
                }
            }else if (newInterval[0] < intervals[0][0]&&newInterval[1] >= intervals[intervals.length - 1][1])
            {
                int q = p;

                    a[0] = newInterval[0];
                    a[1] = newInterval[1];
                    ans.add(a);
                    return buildans(ans, intervals.length, intervals);

            }else if (newInterval[0] < intervals[0][0]&&newInterval[1] <= intervals[intervals.length - 1][1]&&newInterval[1]>=intervals[intervals.length-1][0])
            {
                int q = p;

                a[0] = newInterval[0];
                a[1] = intervals[intervals.length-1][1];
                ans.add(a);
                return buildans(ans, intervals.length, intervals);

            } else if (p < intervals.length && newInterval[0] > intervals[p][1] && newInterval[0] < intervals[p + 1][0]||newInterval[0] < intervals[0][0] ) {
                int q = p;
                if (newInterval[1] >= intervals[intervals.length - 1][1]) {
                    ans.add(intervals[q]);
                    a[0] = newInterval[0];
                    a[1] = newInterval[1];
                    ans.add(a);
                    return buildans(ans, intervals.length, intervals);
                }
                while (q < intervals.length) {
                    if (newInterval[1] <= intervals[q][1] && newInterval[1] >= intervals[q][0]) {
                        ans.add(intervals[p]);
                        a[0] = newInterval[0];
                        a[1] = intervals[q][1];
                        ans.add(a);
                        return buildans(ans, q, intervals);
                    } else if (q < intervals.length - 1 && newInterval[1] < intervals[q + 1][0]) {
                        ans.add(intervals[p]);
                        a[0] = newInterval[0];
                        a[1] = newInterval[1];
                        ans.add(a);
                        return buildans(ans, q, intervals);
                    }
                    q++;
                }
            }
            else if (p < intervals.length - 1 && newInterval[0] > intervals[p][1] && newInterval[1] < intervals[p + 1][0]) {
                ans.add(intervals[p]);
                ans.add(newInterval);
                return buildans(ans, p, intervals);
            } else {
                ans.add(intervals[p]);
                p++;
            }
        }
        return intervals;
    }

    public int[][] buildans(List<int[]> ans, int q, int[][] intervals) {
        for (int i = q + 1; i < intervals.length; i++) {
            ans.add(intervals[i]);
        }
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
