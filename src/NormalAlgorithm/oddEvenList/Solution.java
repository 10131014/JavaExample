package NormalAlgorithm.oddEvenList;

//328. 奇偶链表
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode temp = new ListNode(-1);
        ListNode node2=new ListNode(0);
        node2=head.next;
        temp.next = head;
        ListNode odd = temp.next;
        ListNode even = temp.next.next;
        while (odd.next != null && odd.next.next != null) {
            ListNode node1=odd.next;
            odd.next = odd.next.next;
            odd = node1.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next = node2;
        return temp.next;
    }
}
