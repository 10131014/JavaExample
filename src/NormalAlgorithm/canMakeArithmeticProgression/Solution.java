package NormalAlgorithm.canMakeArithmeticProgression;

import java.util.Arrays;

//1502. 判断能否形成等差数列
public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i + 1] - arr[i]) != (arr[i + 2] - arr[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
