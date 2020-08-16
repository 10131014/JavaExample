package DFS.floodFill;

//733. 图像渲染
public class Solution {
    int a;
    int b;
    int incolor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        a = image.length;
        if (a == 0) {
            return image;
        }
        if (image[sr][sc] == newColor) {
            return image;
        }
        incolor = image[sr][sc];
        b = image[0].length;
        dfs(image, sr, sc, newColor);
        return image;
    }

    public void dfs(int[][] image, int x, int y, int newColor) {
        if (x < 0 || x >= a || y < 0 || y >= b || (image[x][y] != incolor)) {
            return;
        }
        image[x][y] = newColor;
        dfs(image, x, y - 1, newColor);
        dfs(image, x, y + 1, newColor);
        dfs(image, x - 1, y, newColor);
        dfs(image, x + 1, y, newColor);
    }
}
