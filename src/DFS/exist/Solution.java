package DFS.exist;

//79. 单词搜索
//深度优先搜索（DFS）+回溯算法
public class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int k = 0;
                boolean flag = dfsexist(board, word, k, i, j);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfsexist(char[][] board, String s, int k, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || k >= s.length() || board[x][y] != s.charAt(k)) {
            return false;
        }
        if (k == s.length() - 1) {
            return true;
        }
        k++;
        //这里需要做个标记，即已经搜索过的不再搜索
        char t=board[x][y];
        //标记搜索的位置为0
        board[x][y]='0';
        boolean ans= dfsexist(board, s, k, x, y - 1)||dfsexist(board, s, k, x, y + 1)||dfsexist(board, s, k, x - 1, y)||dfsexist(board, s, k, x + 1, y);
        //搜索完上下左右后，应将位置还原
        board[x][y]=t;
        return ans;
    }
}
