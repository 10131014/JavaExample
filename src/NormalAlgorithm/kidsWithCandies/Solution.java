package NormalAlgorithm.kidsWithCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int most = 0;
        for (int i = 0; i < candies.length; i++) {
            most = Math.max(candies[i], most);
        }
        List<Boolean> ans = new ArrayList<>();
        for (int j = 0; j < candies.length; j++) {
            if ((candies[j] + extraCandies) >= most) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
