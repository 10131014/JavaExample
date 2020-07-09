package NormalAlgorithm.mergeTwoLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode pre;
        pre = ans;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                pre.next = l2;
                l2 = l2.next;
            } else if (l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            }
            pre = pre.next;
        }
        pre.next = (l1 == null) ? l2 : l1;
        return ans.next;
    }
}
