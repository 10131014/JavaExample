package NormalAlgorithm.maxNumber;

//321. 拼接最大数
public class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] ans = new int[k];
        //枚举所有取值情况
        for (int i = 0; i <= k; i++) {
            //取某个数组的数字个数不能超过数组的长度
            if (i > nums1.length || k - i > nums2.length) {
                continue;
            }
            //获取单个数组的最大拼接数
            int[] res1 = getmax(nums1, i);
            int[] res2 = getmax(nums2, k - i);
            //合并
            int[] ans1 = merge(res1, res2, k);
            //取最大的那个拼接数
            ans = maxArr(ans, ans1);
        }
        return ans;
    }

    public int[] merge(int[] num1, int[] num2, int k) {
        int[] ans = new int[k];
        int p = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < num1.length && p2 < num2.length) {
            if (num1[p1] > num2[p2]) {
                ans[p++] = num1[p1++];
            } else if (num1[p1] < num2[p2]) {
                ans[p++] = num2[p2++];
            } else {
                int p11 = p1;
                int p22 = p2;
                int pflag = p;
                //当数组当前数字相等时，需要比较后续的数字
                //例如101015和101012，那么需要取101015的1
                while (p11 < num1.length && p22 < num2.length) {
                    if (num1[p11] == num2[p22]) {
                        p11++;
                        p22++;
                    } else if (num1[p11] > num2[p22]) {
                        ans[p++] = num1[p1++];
                        break;
                    } else {
                        ans[p++] = num2[p2++];
                        break;
                    }
                }
                //这里一定要加个标志，表示while里面执行了才能进行下面的判断
                if (p == pflag) {
                    //num1走完了，但是num2没有走完，需要继续拿num2后面的数字跟num1最后一个数字比较
                    //例如101和10155
                    if (p11 == num1.length && p22 != num2.length && num1[p11 - 1] <= num2[p22]) {
                        ans[p++] = num2[p2++];
                        //num2走完了，但是num1没有走完，需要继续拿num1后面的数字跟num2最后一个数字比较
                    } else if (p11 != num1.length && p22 == num2.length && num1[p11] >= num2[p22 - 1]) {
                        ans[p++] = num1[p1++];
                    //俩数组都走完，随便给一个值
                    } else {
                        ans[p++] = num1[p1++];
                    }
                }
            }
        }
        while (p1 < num1.length) {
            ans[p++] = num1[p1++];
        }
        while (p2 < num2.length) {
            ans[p++] = num2[p2++];
        }
        return ans;
    }

    public int[] maxArr(int[] ans1, int[] ans2) {
        int p = 0;
        while (p < ans1.length) {
            if (ans1[p] == ans2[p]) {
                p++;
            } else if (ans1[p] > ans2[p]) {
                return ans1;
            } else {
                return ans2;
            }
        }
        return ans1;
    }

    public int[] getmax(int[] nums, int k) {
        int length = nums.length;
        int[] stack = new int[k];
        int top = -1;
        int remain = length - k;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            while (top >= 0 && stack[top] < num && remain > 0) {
                top--;
                remain--;
            }
            if (top < k - 1) {
                stack[++top] = num;
            } else {
                remain--;
            }
        }
        return stack;
    }
}
