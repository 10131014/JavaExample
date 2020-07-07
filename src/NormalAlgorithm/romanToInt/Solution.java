package NormalAlgorithm.romanToInt;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> table1 = new HashMap<>();
        table1.put('I', 1);
        table1.put('V', 5);
        table1.put('X', 10);
        table1.put('L', 50);
        table1.put('C', 100);
        table1.put('D', 500);
        table1.put('M', 1000);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans + table1.get(s.charAt(i));
        }
        if (s.length() >= 2) {
            int j = 1;
            while (j < s.length()) {
                if (table1.get(s.charAt(j)) > table1.get(s.charAt(j - 1))) {
                    switch (s.charAt(j - 1)) {
                        case 'I':
                            ans = ans - 2;
                            break;
                        case 'X':
                            ans = ans - 20;
                            break;
                        case 'C':
                            ans = ans - 200;
                            break;
                    }
                    j = j + 2;
                }
                else
                {
                    j++;
                }
            }
        }
        return ans;
    }
}
