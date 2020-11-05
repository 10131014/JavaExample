package NormalAlgorithm.islandPerimeter;

//463. 岛屿的周长
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int row = grid.length;
        int line = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans = ans + 4;
                }
                if (j < line-1 && grid[i][j] == 1 && grid[i][j + 1] == 1) {
                    ans = ans - 2;
                }
                if (i < row-1 && grid[i][j] == 1 && grid[i + 1][j] == 1) {
                    ans = ans - 2;
                }
            }
        }
        return ans;
    }
}
