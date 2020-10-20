package NormalAlgorithm.reorderList;

import java.util.ArrayList;
import java.util.List;

//143. 重排链表
public class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> res = new ArrayList<>();
        ListNode temp = new ListNode(-1);
        temp.next = head;
        temp = temp.next;
        while (temp != null) {
            res.add(temp);
            temp = temp.next;
        }
        if (res.size() < 3) {
            return;
        } else {
            head.next = res.get(res.size() - 1);
            int l = res.size();
            for (int i = 1; i < l / 2; i++) {
                res.get(res.size() - 1).next = res.get(i);
                res.remove(res.size() - 1);
                res.get(i).next = res.get(res.size() - 1);
            }
            res.get(res.size() - 1).next = null;
            if (l % 2 != 0) {
                res.get(res.size() - 1).next = res.get(res.size() - 2);
                res.get(res.size() - 2).next = null;
            }
        }
    }
}
