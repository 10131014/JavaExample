package NormalAlgorithm.canFormArray;

//1640. 能否连接形成数组
public class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int arr_index = 0;
        while (true) {
            int i;
            for (i = 0; i < pieces.length; i++) {
                if (pieces[i][0] == arr[arr_index]) {
                    for (int j = 0; j < pieces[i].length; j++) {
                        if (pieces[i][j] != arr[arr_index]) {
                            return false;
                        }
                        pieces[i][j] = -1;
                        arr_index++;
                    }
                    break;
                }
            }
            if (i == pieces.length) {
                return false;
            }
            if (arr_index == arr.length) {
                break;
            }
        }
        return true;
    }
}
