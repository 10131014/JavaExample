package NormalAlgorithm.isLongPressedName;

import java.util.Arrays;

//925. 长按键入
public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() < 1) {
            return true;
        }
        if (typed.length() < name.length()) {
            return false;
        }
        int pn = 0;
        int pt = 0;
        char[] name1 = name.toCharArray();
        char[] typed1 = typed.toCharArray();
        typed.toCharArray();
        if (name1[pn] != typed1[pt]) {
            return false;
        } else {
            pn++;
            pt++;
            while (pn < name1.length && pt < typed1.length) {
                if (name1[pn] == typed1[pt]) {
                    pn++;
                    pt++;
                } else {
                    if (name1[pn - 1] == typed1[pt]) {
                        pt++;
                    } else {
                        return false;
                    }
                }
            }
            if (pn == name1.length&&(name1[pn-1]==typed1[typed1.length-1])) {
                return true;
            } else {
                return false;
            }
        }
    }
}
