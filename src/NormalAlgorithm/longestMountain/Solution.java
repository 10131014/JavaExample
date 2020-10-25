package NormalAlgorithm.longestMountain;

//845. 数组中的最长山脉
//双指针
public class Solution {
    public int longestMountain(int[] A) {
        int p1 = 0;
        int p2 = 1;
        int ans = 0;
        int mountain_long = 0;
        int l = A.length;
        while (p1 < l && p2 < l) {
            //若A[i]>=A[i+1],则无法形成山脉
            if (A[p1] >= A[p2]) {
                p1++;
                p2++;
            } else {
                //一直往右走，直到走到山顶
                p2++;
                while (p2 < l && A[p2 - 1] < A[p2]) {
                    p2++;
                }
                //说明最后一个元素是山顶，不符合山脉条件
                if (p2 == l) {
                    return ans;
                } else {
                    //找到山顶后继续往右走，直到找到山脚
                    while (p2 < l && A[p2 - 1] > A[p2]) {
                        p2++;
                        //符合条件才能更新山脉长度
                        mountain_long = p2 - p1;
                    }
                    //取最大值
                    ans = Math.max(ans, mountain_long);
                    p1 = p2 - 1;
                }
            }
        }
        return ans;
    }
}
