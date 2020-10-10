package NormalAlgorithm.detectCycle2;

//142. 环形链表II
//快慢指针解法，快慢指针初始化为head，两轮相遇，快指针走两步，慢指针走一步，第一轮相遇后
//快指针初始化为head，慢指针不变，此时快慢指针都走一步，再次相遇后返回快指针（慢指针）
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null||head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        fast = head;
        while (fast!=slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
