package DFS.exist2;

//剑指Offer 12. 矩阵中的路径
public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words=word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != words[0]) {
                    continue;
                }
                boolean flag = dfs_exist2(board, words, i, j, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs_exist2(char[][] board, char[] words, int x, int y, int k) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || k >= words.length || words[k] != board[x][y]) {
            return false;
        }
        if (k == words.length - 1) {
            return true;
        }
        k++;
        char temp = board[x][y];
        board[x][y] = '0';
        boolean ans = dfs_exist2(board, words, x, y - 1, k) || dfs_exist2(board, words, x, y + 1, k) || dfs_exist2(board, words, x - 1, y, k) || dfs_exist2(board, words, x + 1, y, k);
        board[x][y] = temp;
        return ans;
    }
}
