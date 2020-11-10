package NormalAlgorithm.nextPermutation;

import java.util.Arrays;

//31. 下一个排列
public class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length;
        int temp;
        for (int i = l - 1; i > 0; i--) {
            //存在一个当前数大于前一个数
            if (nums[i] > nums[i - 1]) {
                for (int j = l - 1; j > i; j--) {
                    //判断这个数在不在数尾，如果不在，就需要从数尾开始找，找第一个大于前一个数的数
                    //例如：[1,2,9,5,4,1]，2是不能跟9换的，2需要跟4换，然后再将1,4后面的数进行排序
                    if (nums[j] > nums[i - 1]&&nums[j]<nums[i]&&i<l-1) {
                        temp = nums[i - 1];
                        nums[i - 1] = nums[j];
                        nums[j] = temp;
                        sort1(nums, i, l);
                        return;
                    }
                }
                //这个数在数尾直接换即可
                //[1,2,3,4]，直接将3和4交换
                temp = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = temp;
                sort1(nums, i, l);
                return;
            }
        }
        //不存在一个当前数大于前一个数，直接排序
        Arrays.sort(nums);
    }

    public void sort1(int[] nums, int start, int end) {
        int[] res = new int[end - start];
        res = Arrays.copyOfRange(nums, start, end);
        Arrays.sort(res);
        for (int i = start; i < end; i++) {
            nums[i] = res[i - start];
        }
        return;
    }
}
