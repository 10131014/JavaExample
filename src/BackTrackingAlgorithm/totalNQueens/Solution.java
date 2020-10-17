package BackTrackingAlgorithm.totalNQueens;

import java.util.HashSet;
import java.util.Set;

//52. N皇后II
//回溯算法
public class Solution {
    public int totalNQueens(int n) {
        //建立列集合，判断是否有两个皇后在同一列上
        Set<Integer> line = new HashSet<>();
        //建立左上-右下斜线集合，判断是否有两个皇后在同一条斜线上
        Set<Integer> leftupTOrightdown = new HashSet<>();
        //建立右上-左下斜线集合，判断是否有两个皇后在同一条斜线上
        Set<Integer> rightupTOleftdown = new HashSet<>();
        return backtrackingQ(n, 0, line, leftupTOrightdown, rightupTOleftdown);
    }

    public int backtrackingQ(int n, int row, Set<Integer> line, Set<Integer> leftupTOrightdown, Set<Integer> rightupTOleftdown) {
        //行数为n，说明全部的都放下了，找到一种解法
        if (row == n) {
            return 1;
        } else {
            int count = 0;
            //要在某一行上放一个皇后，找到哪列可以放
            for (int i = 0; i < n; i++) {
                //记录列的信息
                int line1 = i;
                //判断是否有两个皇后处于同一列，如果有则换一列
                if (line.contains(line1)) {
                    continue;
                }
                //行标-列标相等的值可以表示同一条左上-右下斜线
                int leftupTOrightdownflag = row - i;
                //判断是否有两个皇后处于同一条左上-右下斜线上
                if (leftupTOrightdown.contains(leftupTOrightdownflag)) {
                    continue;
                }
                //行标+列标相等的值可以表示同一条右上-左下斜线
                int rightupTOleftdownflag = row + i;
                //判断是否有两个皇后处于同一条右上-左下斜线上
                if (rightupTOleftdown.contains(rightupTOleftdownflag)) {
                    continue;
                }
                //将位置信息添加进集合里
                line.add(line1);
                leftupTOrightdown.add(leftupTOrightdownflag);
                rightupTOleftdown.add(rightupTOleftdownflag);
                //当前行放下了一个皇后，行数+1，去下一行放皇后
                count = count + backtrackingQ(n, row + 1, line, leftupTOrightdown, rightupTOleftdown);
                //回溯，删去上次的位置信息，下次换位置
                line.remove(line1);
                leftupTOrightdown.remove(leftupTOrightdownflag);
                rightupTOleftdown.remove(rightupTOleftdownflag);
            }
            return count;
        }
    }
}
