package NormalAlgorithm.generateMatrix;
//59.螺旋矩阵II
//模拟按层来（内外层）
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int left=0;
        int right=n-1;
        int up=0;
        int down=n-1;
        int i=1;
        //这里一定得等号
        while (i<=n*n){
            //上面一层
            for (int j=left;j<=right;j++){
                ans[up][j]=i++;
            }
            up++;
            //右边一层
            for (int j=up;j<=down;j++){
                ans[j][right]=i++;
            }
            right--;
            //下边一层
            for (int j=right;j>=left;j--){
                ans[down][j]=i++;
            }
            down--;
            //左边一层
            for (int j=down;j>=up;j--){
                ans[j][left]=i++;
            }
            left++;
        }
        return ans;
    }
}
