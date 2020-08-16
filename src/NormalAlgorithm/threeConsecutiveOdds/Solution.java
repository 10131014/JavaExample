package NormalAlgorithm.threeConsecutiveOdds;

//5185. 存在连续三个奇数的数组
public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int flag;
        for (int i = 0; i <= arr.length - 3; i++) {
            flag = 0;
            for (int j = i; j < i + 3; j++) {
                if (arr[j] % 2 == 1) {
                    flag++;
                } else {
                    break;
                }
            }
            if (flag == 3) {
                return true;
            }
        }
        return false;
    }
}
