package NormalAlgorithm.searchRange;

//34. 在排序数组中查找元素的第一个和最后一个位置
//二分查找
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int l = nums.length;
        if (l < 1) {
            return ans;
        }
        int left = 0;
        int right = l - 1;
        int mid = (right - left) / 2 + left;
        //找左边边界
        while (left < right) {
            if (nums[mid] < target) {
                left = mid + 1;
                mid = (right - left) / 2 + left;
            } else if (nums[mid] > target) {
                right = mid - 1;
                mid = (right - left) / 2 + left;
            //从右边往左边逼近，找左边边界
            } else if (nums[mid] == target) {
                //已经是左边边界，跳出循环
                if (mid > 0 && nums[mid] != nums[mid - 1]) {
                    break;
                }
                right = mid - 1;
                mid = (right - left) / 2 + left;
            }
        }
        if (nums[mid] == target) {
            ans[0] = mid;
        }

        left = 0;
        right = l - 1;
        mid = (right - left) / 2 + left;
        //找右边边界
        while (left < right) {
            if (nums[mid] < target) {
                left = mid + 1;
                mid = (right - left) / 2 + left;
            } else if (nums[mid] > target) {
                right = mid - 1;
                mid = (right - left) / 2 + left;
            //从左边往右边逼近，找右边边界
            } else if (nums[mid] == target) {
                //已经是右边边界，跳出循环
                if (mid < l - 1 && nums[mid] != nums[mid + 1]) {
                    break;
                }
                left = mid + 1;
                mid = (right - left) / 2 + left;
            }
        }
        if (nums[mid] == target) {
            ans[1] = mid;
        }
        return ans;
    }
}
