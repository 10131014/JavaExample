package NormalAlgorithm.swapPairs;
//24. 两两交换链表中的节点

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<ListNode> nodelist = new ArrayList();
        while (head != null) {
            nodelist.add(new ListNode(head.val));
            head = head.next;
        }
        ListNode start = nodelist.get(1);
        ListNode start1 = start;
        start.next = nodelist.get(0);
        start = start.next;
        for (int i = 1; i < nodelist.size() / 2; i++) {
            start.next = nodelist.get(2 * i + 1);
            start = start.next;
            start.next = nodelist.get(2 * i);
            start = start.next;
        }
        if (nodelist.size() % 2 != 0) {
            start.next = nodelist.get(nodelist.size() - 1);
        }
        return start1;
    }
}
