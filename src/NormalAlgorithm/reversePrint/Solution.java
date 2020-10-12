package NormalAlgorithm.reversePrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//剑指Offer 06. 从尾到头打印链表
public class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> ans = new ArrayList();
        while (head != null) {
            ans.add(head.val);
            head = head.next;
        }
        Collections.reverse(ans);
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
