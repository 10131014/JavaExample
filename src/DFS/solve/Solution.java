package DFS.solve;

//130. 被围绕的区域
public class Solution {
    int a;
    int b;
    public void solve(char[][] board) {
        a = board.length;
        if (a == 0) {
            return;
        }
        b = board[0].length;
        for (int i = 0; i < a; i++) {
            dfs(board, i, 0);
            dfs(board, i, b - 1);
        }
        for (int j = 1; j < b - 1; j++) {
            dfs(board, 0, j);
            dfs(board, a - 1, j);
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (board[i][j] == 's') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y) {

        if (x < 0 || x >= a || y < 0 || y >= b || board[x][y] != 'O') {
            return;
        }
        board[x][y] = 's';
        dfs(board, x, y - 1);
        dfs(board, x, y + 1);
        dfs(board, x - 1, y);
        dfs(board, x + 1, y);
    }
}
