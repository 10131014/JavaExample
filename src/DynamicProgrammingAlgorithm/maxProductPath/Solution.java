package DynamicProgrammingAlgorithm.maxProductPath;
//1594. 矩阵的最大非负积
//维护一个最大值和最小值矩阵
//采用动态规划
public class Solution {
    public int maxProductPath(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        long[][] min_mari=new long[rows][cols];
        long[][] max_mari=new long[rows][cols];
        max_mari[0][0]=grid[0][0];
        min_mari[0][0]=grid[0][0];
        for (int i=1;i<rows;i++){
            min_mari[i][0]=min_mari[i-1][0]*grid[i][0];
            max_mari[i][0]=max_mari[i-1][0]*grid[i][0];
        }
        for (int j=1;j<cols;j++){
            min_mari[0][j]=min_mari[0][j-1]*grid[0][j];
            max_mari[0][j]=max_mari[0][j-1]*grid[0][j];
        }
        for (int i=1;i<rows;i++){
            for (int j=1;j<cols;j++){
                //维护每个点的最小值
                min_mari[i][j]=(Math.min(Math.min(min_mari[i-1][j]*grid[i][j],min_mari[i][j-1]*grid[i][j]),
                        Math.min(max_mari[i-1][j]*grid[i][j],max_mari[i][j-1]*grid[i][j])));
                //维护每个点的最大值
                max_mari[i][j]=Math.max(Math.max(min_mari[i-1][j]*grid[i][j],min_mari[i][j-1]*grid[i][j]),
                        Math.max(max_mari[i-1][j]*grid[i][j],max_mari[i][j-1]*grid[i][j]));
            }
        }
        if (max_mari[rows-1][cols-1]>=0){
            return (int) (max_mari[rows-1][cols-1]%1000000007);
        }else {
            return -1;
        }
    }
}
