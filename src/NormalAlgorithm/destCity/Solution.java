package NormalAlgorithm.destCity;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> city = new ArrayList<>();
        city = paths.get(0);
        String curcity = city.get(0);
        String nextcity = city.get(1);
        if (paths.size() == 1) {
            return nextcity;
        }
        while (true) {
            int l = paths.size();
            for (int i = 0; i <= l; i++) {
                if (i == (l)) {
                    return nextcity;
                }
                city = paths.get(i);
                if (nextcity.equals(city.get(0))) {
                    curcity = city.get(0);
                    nextcity = city.get(1);
                    paths.remove(i);
                    break;
                }
            }
        }
    }
}
