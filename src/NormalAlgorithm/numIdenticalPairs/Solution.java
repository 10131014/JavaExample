package NormalAlgorithm.numIdenticalPairs;

//1512. 好数对的数目
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
