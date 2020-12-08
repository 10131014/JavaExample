package NormalAlgorithm.concatenatedBinary;

//1680. 连接连续二级制数字
//主要考察位运算
public class Solution {
    public int concatenatedBinary(int n) {
        final int MOD = 1000000000 + 7;
        long ans = 0; //long避免溢出
        int bit = 0;//需要移动的位数
        for(int i = 1; i <= n; ++i) {
            //当i是2的n次方时，i & (i - 1) == 0 如： i = 4, 二进制i为100, i - 1 = 011， i & (i - 1) == 0
            if((i & (i - 1)) == 0){
                ++bit;
            }
            ans = ((ans << bit) + i) % MOD;
        }
        return (int)ans;
    }
}
