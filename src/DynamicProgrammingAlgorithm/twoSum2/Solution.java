package DynamicProgrammingAlgorithm.twoSum2;

//剑指offer 60. n个骰子的点数
public class Solution {
    public double[] twoSum(int n) {
        double[] pre = {1.0 / 6, 1.0 / 6, 1.0 / 6, 1.0 / 6, 1.0 / 6, 1.0 / 6};
        //i个骰子
        for (int i = 2; i <= n; i++) {
            double[] temp = new double[5 * i + 1];
            //此处的x为i-1个骰子的点数和（由于数组下标从零开始，所以骰子点数相当于为0到5）
            for (int x = 0; x < pre.length; x++) {
                //j为第i个骰子的点数
                for (int j = 0; j < 6; j++) {
                    //i个骰子和为x+j的概率=所有的（i-1个骰子和为x的概率乘以第i个骰子点数为j的概率）之和
                    temp[x + j] = temp[x+j] + pre[x]*(1.0/6);
                }
            }
            pre = temp;
        }
        return pre;
    }
}
