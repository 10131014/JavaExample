package NormalAlgorithm.hasCycle2;
//141. 环形链表
//该种解法为快慢双指针，慢指针指向头部，走一步，快指针指向头部下一节点，走两步

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (true) {
            if (slow == fast) {
                break;
            }
            if (slow == null || fast == null||fast.next==null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
